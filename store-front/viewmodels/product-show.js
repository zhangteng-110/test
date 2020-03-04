var app = new Vue({
    el: '#app',
    data: {
        productId: '',
        productCode: '',
        productName: '',
        price: '',
        discount: '',
        description: '',
        stockQuantity: '',
        mainPicUrl: '',
        otherPicUrls: [],
        quantity: 1,
        myShoppingCart: []
    },
    computed:{
        otherPicUrlsJson(){
            return this.otherPicUrls.toString();
        }
    },
    mounted(){
        console.log('view mounted');

        var myShoppingCartJson = localStorage['myShoppingCartJson'];
        this.myShoppingCart = myShoppingCartJson ? JSON.parse(myShoppingCartJson) : [];

        var url = new URL(location.href);
        this.productId = url.searchParams.get("productId");
        if (!this.productId) {
            alert('productId is null');
            return;
        }

        this.getProductById();
    },
    methods: {
        getProductById() {
            axios.get('/product/getById', {
                params: {
                    productId: this.productId
                }
            })
                .then(function (response) {
                    console.log(response);
                    var product = response.data;
                    app.productId = product.productId;
                    app.productCode = product.productCode;
                    app.productName = product.productName;
                    app.price = product.price;
                    app.discount = product.discount;
                    app.mainPicUrl = product.mainPicUrl;
                    app.otherPicUrls = product.otherPicUrls;
                    app.description = product.description;
                    app.stockQuantity = product.stockQuantity;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        handleAddToCartClick(){
            console.log('add to cart click')
            
            var myShoppingCartJson = localStorage['myShoppingCartJson'];
            this.myShoppingCart = myShoppingCartJson ? JSON.parse(myShoppingCartJson) : [];
            var newProduct = this.myShoppingCart.find(p => p.productId === this.productId);
            if (newProduct) {
                console.log('cart product exist');
                var originQuantity = parseInt(newProduct.quantity);
                newProduct.quantity = originQuantity + this.quantity;
            }else{
                newProduct = {
                    productId: this.productId,
                    productName: this.productName,
                    productCode: this.productCode,
                    mainPicUrl: this.mainPicUrl,
                    unitPrice: this.price,
                    quantity: this.quantity,
                }
                this.myShoppingCart.push(newProduct);
            }
            
            localStorage['myShoppingCartJson'] = JSON.stringify(this.myShoppingCart);
            this.$message.success("商品已加入购物车");
        }
    }
})