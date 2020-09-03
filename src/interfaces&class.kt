interface A {

    fun callMe() {
        println("From interface A")
    }
}

interface B:A  {
    override fun callMe() {
        println("From interface b")
    }

}

class C: A, B {
    override fun callMe() {
        println("From class c")
    }
}

fun main(args: Array<String>) {
    val obj = C()

    obj.callMe()
}