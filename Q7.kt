fun main(){

    println("...Welcome to Tax Calculator...")
    println()
    println("Enter Your Monthly Salary : ")
    var salary : Double = readLine()!!.toDouble()
    var yearlySalary : Double = salary * 12

//    [Question 7(a)] 1 to 2,00,000 tax is 1%
    if (yearlySalary >= 1 && yearlySalary <=200000){
        var tax : Double = (0.01*yearlySalary)
        println("Tax amount of your yearly salary $yearlySalary i.e($salary X 12) is $tax .")
    }

//    [Question 7(b)] 200,000 to 350,000 tax is 1% of first 200,000 + 15% of remaining salary
    else if(yearlySalary > 200000 && yearlySalary <= 350000){
        var tax2 : Double = (0.01*200000) + (0.15*(yearlySalary-200000))
        println("Tax amount of your yearly salary $yearlySalary i.e($salary X 12) is $tax2 .")
    }
    //    [Question 7(c)] c) 350,000 to above tax is 1% of first 200,000 + 15% of next 150,000 + 25% of remaining salary.
    else{
        var tax3 : Double = (0.01*200000) + (0.15*150000) + (0.25*(yearlySalary-350000))
        println("Tax amount of your yearly salary $yearlySalary i.e($salary X 12) is $tax3 .")
    }

}