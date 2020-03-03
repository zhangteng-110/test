var app = new Vue({
    el: '#app',
    data: {
        myShoppingCart: [],
    },
    mounted(){
        var myShoppingCartJson = localStorage['myShoppingCartJson'];
        this.myShoppingCart = JSON.parse(myShoppingCartJson);
    },
    methods: {
        handleUpdate(index,row){

        },
        handleDelete(index,row){

        }
    }
})