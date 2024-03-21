fun main(args: Array<String>) {
 words("Class","Kenya","Uganda","Tanzania")
    words("city","school","class","Kenya")
    places()
    marks()
    names("Faith","Raziah","Glory")
}

//Create a function that takes in 4 strings and  creates an  array out of them then prints out the array
fun  words( word1:String,word2:String,word3:String,word4:String){
     var names = arrayOf(word1 ,word2 ,word3 ,word4)
    println(names.contentToString())
}

fun places(){
    var cities = arrayOf("harare","mumbui","dodoma","jakarta")
      cities.forEachIndexed {index,city -> if(index in arrayOf(1,2,3,4))
        println(city.capitalize()) }
}

//create  one function that is given the below array
fun marks(){
var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
     var num1 = 17
    var num2 = 78
    var sum = num1 + num2
    println(sum)
    println(numbers.indexOf(158))
    var sortNumbers = numbers.sortedArray()
    println(sortNumbers.contentToString())
}
fun names(name1:String,name2:String,name3:String){
    var people = arrayOf(name1,name2,name3)
    println(people.contentToString())
}
