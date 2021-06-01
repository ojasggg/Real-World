fun main(){
//  To generate random num from 0 to 100
    var randomNum : Int = (0..100).random()

    while (true){
        println("Guess The Number from 0 to 100: ")
        var guess : Int = readLine()!!.toInt()

        if (guess == randomNum){
            println("Congratulation You have guessed the right Number.")
            break

        }else if(guess < randomNum){
            println("Too Low,try again.")

        }else{
            println("Too high,try again.")
        }
    }
}