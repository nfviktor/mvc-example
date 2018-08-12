package com.nfviktor.mvcexample

class Controller{

    var model = Model()

    fun addItem(text:String){
        model.addToList(text + " Lol")
    }

    fun returnSize(): Int{
        return model.num
    }

    fun returnItem(): String {
        return model.showFromList() + model.num.toString()
    }


}