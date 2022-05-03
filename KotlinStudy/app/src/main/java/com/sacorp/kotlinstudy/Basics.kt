package com.sacorp.kotlinstudy

fun main() {

    var name = "Test!"
    print("Hello " + name)
    var a = 12

    var myLong = 12_1212

    print(myLong)

    val x1 = 21
    print("${x1 > 22}")


    val person1 = 12
    val person2 = 13

    if (person1 > person2) {


    } else {


    }

    val c: Int = 30

    when (c) {

        10 -> print("c is 10")
        20 -> print("c is 20")
        30 ->{

            println("c is 20")
            println("c is so good")
        }

    }

    var age:Int=0;

    when(age){
        in 10..20-> print("between 10 to 20")
        in 20..100->print("between 20 to 100")
        else ->print("undefined.")
    }

    }

