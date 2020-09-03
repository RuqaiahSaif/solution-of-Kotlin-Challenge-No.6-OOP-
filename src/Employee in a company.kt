open class Employee(name:String, age:Int, salary:Double) {
    var name:String= name
    var age:Int=age
    var salary:Double= salary
}

class WebDeveloper(name:String,age:Int,salary:Double,special_skill:String):Employee(name,age,salary){
    var special_skill:String=special_skill

    fun get_info(){

        println("WebDeveloper name=$name,age=$age,salary=$salary,special_skill=$special_skill")
    }
}
class IOSeveloper(name:String,age:Int,salary:Double,special_skill:String):Employee(name,age,salary){
    var special_skill:String=special_skill

    fun get_info(){

        println("IOSeveloper name=$name,age=$age,salary=$salary,special_skill=$special_skill")
    }

}
class AndroidDeveloper(name:String,age:Int,salary:Double,special_skill:String):Employee(name,age,salary){
    var special_skill:String=special_skill

    fun get_info(){

        println("AndroidDeveloper name=$name,age=$age,salary=$salary,special_skill=$special_skill")
    }

}
fun main(){
 var a=WebDeveloper("ali",28,100.5,"Programming with php")
a.get_info()
    var b=IOSeveloper("ahmed",27,120.5,"Programming with java")
    b.get_info()
    var c=AndroidDeveloper("roqia",25,1110.5,"Programming with kotlin")
    c.get_info()
}