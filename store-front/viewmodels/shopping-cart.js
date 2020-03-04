var app = new Vue({
    el: '#app',
    data: {
        myShoppingCart: [],
    },
    mounted(){
        console.log("view mounted")
        var myShoppingCartJson = localStorage['myShoppingCartJson'];
        this.myShoppingCart = myShoppingCartJson ? JSON.parse(myShoppingCartJson) : [];
        console.log(this.myShoppingCart)
    },
    methods: {
        handleUpdate(index,row){

        },
        handleDelete(index,row){

        }
    }
})