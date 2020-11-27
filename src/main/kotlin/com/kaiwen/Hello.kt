package com.kaiwen

fun main() {
//    println("Hello Kotlin");
//    Human().hello();
    val h =Human();
    h.hello();

    //自動推斷變數型態
    val age = 19;
    //age = 20; ##Val cnanot be reassigned
    //val age : Int = 19;
    var weight = 66.5; //Double
    var weight2 = 66.5f;
    var weight3 : Float = 66.5f;
    var name : String;
    name = "Kaiwen";

    Int
    Short
    Long
    //val (value) 給值後不可變
    //var (variable) 可變的
}

class Human{
    fun hello(){
        println("Hello Kotlin");
    }
}