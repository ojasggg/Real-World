fun main(){
    println("..WELCOME TO BMI CALCULATOR..")
    println(" Enter you weight(in KG) : ")
    var weight : Float = readLine()!!.toFloat()
    println(" Enter you height(in meter) : ")
    var height : Float = readLine()!!.toFloat()

    var bmi : Float = weight/(height*height)
    if (bmi < 18.5) {
        println("Your bmi is $bmi : Underweight")
    }else if(bmi >= 18.5 && bmi <= 24.9 ){
        println("Your bmi is $bmi : Normalweight")
    }else if(bmi >= 25 && bmi <= 29.9 ){
        println("Your bmi is $bmi : Overweight")
    }else {
        println("Your bmi is $bmi : Obesity")
    }
}