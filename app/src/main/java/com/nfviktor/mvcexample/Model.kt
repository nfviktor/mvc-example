package com.nfviktor.mvcexample

class Model{
    val arrayList = ArrayList<String>()
    var num:Int = 0


    fun addToList(text:String){
        arrayList.add(arrayList.size,text)
        num = arrayList.size
    }

    fun showFromList():String{
        return arrayList[arrayList.size-1]
    }
}