interface A {

    fun callMe()
}

interface B:A  {
    fun callMe2()


}

class C: A, B {
    override fun callMe() {
        println("From interface A")
    }
    override fun callMe2(){
        println("From interface B")
    }
}

fun main(args: Array<String>) {
    val obj = C()

    obj.callMe()
    obj.callMe2()

}