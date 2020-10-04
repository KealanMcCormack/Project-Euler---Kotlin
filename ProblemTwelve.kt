

fun main(args: Array<String>){
    var count = 0
    var base = 1
    var sum = 1

    while(count < 499){
        count = 0
        base++
        sum += base
        count = divisors(sum)
    }
    println(sum)

}

fun divisors(sum: Int): Int {
    var count = 0
    for(i in 1 .. sum){
        if(sum % i == 0){
            count++
        }
    }

    return count
}
