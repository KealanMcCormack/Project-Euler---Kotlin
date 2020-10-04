

fun main(args: Array<String>){
    var highest = 0
    var count = 0
    var startNum = 0

    for(i in 2 .. 999999){
        count = Collatz(i)
        if(count > highest){
            highest = count
            startNum = i
        }
    }

    println(highest)
    println(startNum)
}

fun Collatz(number: Int) : Int{
    var num: Long
    var prevNum: Long
    var count = 1

    prevNum = 0
    num = number.toLong()

    while(num.compareTo(1) != 0){

        if(num < 1){
            println(prevNum)
            throw error("issue")
        }

        prevNum = num
        if((num % 2).compareTo(0) == 0){
            num = num shr 1
        } else{
            num += num + num + 1
        }

        count++
    }
    count++
    return count
}