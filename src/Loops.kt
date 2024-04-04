fun main() {


    //collection of Data
//    val students = listOf<String>("a", "b","c")
    val students = mutableListOf<String>("a", "b","c")
//    students.get(0)
//    students.add("d")

    for (name in students){
        println(name)
    }
    students.forEach {name->
        println(name)
    }

}