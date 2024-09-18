//when no of iterations are known for loop is used otherwise while loop
fun main()
{
    for(i in 1..5 step 2)
    {
        println(i)
    }

    println("until")
    for(i in 1 until 5)
    {
        println(i)
    }

    println("downTo")
    for(i in 10 downTo 1 step 2)
    {
        println(i)
    }
}