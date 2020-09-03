open class Employee(name:String, age:Int, salary:Double) {

}

class WebDeveloper(var name:String,var age:Int,var salary:Double,var special_skill:String):Employee(name,age,salary){


    fun website(){

        println("WebDeveloper name=$name,age=$age,salary=$salary,special_skill=$special_skill")
    }
}
class IOSeveloper(var name:String,var age:Int,var salary:Double,var special_skill:String):Employee(name,age,salary){


    fun iosapp(){

        println("IOSeveloper name=$name,age=$age,salary=$salary,special_skill=$special_skill")
    }

}
class AndroidDeveloper(var name:String,var age:Int,var salary:Double,var special_skill:String):Employee(name,age,salary){


    fun android(){

        println("AndroidDeveloper name=$name,age=$age,salary=$salary,special_skill=$special_skill")
    }

}
fun main(){
 var a=WebDeveloper("ali",28,100.5,"Programming with php")
a.website()
    var b=IOSeveloper("ahmed",27,120.5,"Programming with java")
    b.iosapp()
    var c=AndroidDeveloper("roqia",25,1110.5,"Programming with kotlin")
    c.android()
}