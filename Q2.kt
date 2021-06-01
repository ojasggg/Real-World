fun main(){
  println("Enter any Number : ")
  var num = readLine()!!.toInt()
  var num1= num
  var reverse = 0

  if (num1==0){
    println(num1)
  }else{
    while(num1 != 0){
      var digit = num1 %10
      reverse = reverse*10 + digit
      num1 = (num1/10)
    }
  }
  print("The reverse of $num is $reverse .")

}