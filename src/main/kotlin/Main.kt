fun main(){
  names("Rehema","Susan","Teresia","Mwende")
    countries(arrayOf())
    number(arrayOf())
}
fun names (name1:String,name2:String,name3:String,name4:String){
    println(arrayOf(name1,name2,name3,name4).contentToString())
}
fun countries(arrayOf:Array<String>){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEachIndexed{index,s ->
        if(index in arrayOf(0,1,2,3))
            println(s.capitalize())

    }

}
fun number (arrayOf:Array<Int>) {
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var add =println(numbers[1]+numbers[4])
    println(numbers.contentToString())
}