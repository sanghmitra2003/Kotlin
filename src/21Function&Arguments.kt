//FUNCTIONS
//block of code to perform certain functionality
//helps to reuse code

fun main()
{
    val result = add( num1=6 , num2=9)
    println(result)
    evenOROdd(num=4)
    evenOROdd(num=7)
}

fun add(num1:Int , num2:Int):Int
    {
        val sum = num1 + num2
        return sum
    }

fun evenOROdd(num:Int)
{
    val result = if (num%2 == 0) "even" else "odd"
    println (result)
}
//by default return type is unit