package com.example.sonpractice

fun main(){
 helloworld()

 println(add(  4,  5))

    //3. String Template
    val name ="JongHyun"
    val lastName = "Son"
    println("my name is ${name + lastName} I'm 29")
    println("is this true ${1==0}")
    println("this is 2\$a")

    maxBy2(2,30)
    checkNum(24)
}

//1.함수

//Unit 리턴값이 없을때
//Redundant  굳이 없어도 되는 것들
fun  helloworld ()
{
   println("Hello World")
}

fun add(a : Int, b: Int) : Int{
   return a+b
}

//2.val vs var
//val = value

fun hi(){
    //변하지 않는 값
    val a : Int = 10
    //변할수도 있는 값
    var b : Int = 9

    val aa = 10
    var bb = 9

    var e : String

    b = 100
    var c = 100
    val d = 100
    var name = "Son"

// 4.조건식
    fun maxBy(a: Int, b : Int ) :Int{
        if(a>b)
        {
            return  a
        }else
        {
            return  b
        }
    }
}

    fun maxBy2(a: Int,b: Int) = if(a>b) a else b
    fun checkNum(score : Int)
    {
        when(score)
        {
             0 -> println("this is 0")
             1 -> println("this is 1")
             2,3 -> println("this is 2 or 3")
            else -> println("I don't know")
        }
        var b = when(score)
        {
            1 ->1
            2 ->2
            else -> 3
        }
        when(score)
        {
            in 90..100 -> println("You are genius")
            in 10..80 -> println("not bad")
            else -> println("okay")
        }

    }

//5. List & Array