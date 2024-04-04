fun main() {
    val h1= Hello()
    val h2 = Hello()
    h1.sayHello("Asad")
    println(h2.myuName)
sayHello()

    val res = sum(30,20)
    println(res)

val com = maxOf(40,30)
    println(com)

    whenTest(1)

}

fun sayHello(){
    println("Hello m")

}

fun sum (v1: Int, v2:Int, v3:Int=0) = v1 + v2 + v3.toDouble() //single expression function


fun maxOf(a: Int , b: Int) = if (a > b) a else b




class Hello{
    var myuName = "Jubayer"

    fun hh(): Any{

        return myuName
    }

    fun sayHello(name:String){

        myuName = name

        println("Hello, $myuName")
    }
}
fun whenTest(v1:Int){
    when(v1){
        1->{
            println("it's One")
        }
        2->{
            println("it's Two")
        }
        else ->{
            println("it's out of my range ")
        }
    }
}