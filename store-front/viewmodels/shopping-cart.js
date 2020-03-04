var app = new Vue({
    el: '#app',
    data: {
        myShoppingCart: [],
    },
    watch: {
        
    },
    mounted(){
        console.log("view mounted")
        var myShoppingCartJson = localStorage['myShoppingCartJson'];
        this.myShoppingCart = myShoppingCartJson ? JSON.parse(myShoppingCartJson) : [];
    },
    methods: {
        handleUpdate(index,row){
            console.log('update click');
            localStorage['myShoppingCartJson'] = JSON.stringify(this.myShoppingCart);
            this.$message.success('更改数量成功');
        },
        handleDelete(index,row){
            console.log('delete click');
            this.myShoppingCart.splice(index, 1);
            localStorage['myShoppingCartJson'] = JSON.stringify(this.myShoppingCart);
            this.$message.success('成功删除商品');
        }
    }
})