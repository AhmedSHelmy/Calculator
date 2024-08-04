package com.example.myapplication

import androidx.activity.compose.rememberLauncherForActivityResult
import java.util.Scanner

fun main() {
    val p = Programmer("Programmer")
    fun Int.isodd() : Boolean {return this %2 == 1}
    fun Programmer.tryext(): Int {return  10}

}
abstract open class Employee(var name: String = "",var id :Int = 0, var type:String ){
    var bonus : Double = 100.0
        set(value) {
            if(type.equals("Programmer")){
                field = 1000.0
            }
            else{
                field = value
            }
        }
        get() {return field}

    open fun printInfo(){
        println("name: $name , id : $id")
    }
    abstract fun myFun()
}
class Programmer(myType:String ) : Employee(type = myType), Person{
    var myType = myType
    override fun printInfo(){
        println("name: $name , id : $id, Postition  : $myType")
    }
    override fun myFun(){

    }
    override fun display(){

    }
}

interface Person {
    fun display()
}