fun main(){

    print("Enter any Number : ")
    var num = readLine()!!.toInt()
    if (num < 0) {
        println("Please enter positive number. Try again!!")
        print("Enter any Number : ")
        num = readLine()!!.toInt()
    }

    for (i in 1..10){
        var mul = num * i
        println("$num X $i = $mul")
    }

}