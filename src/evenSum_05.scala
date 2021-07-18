object evenSum_05 extends App{

  var c = 0
  print("Input Number : ")
  val n = scala.io.StdIn.readInt()
  println("Addition of all even numbers less than given value : "+evenSum(n-1))


  def evenSum(n: Int):Int ={
    if(n > 0){
      if(n % 2 == 0){
        c = c + n
        evenSum(n-2)
      }else{
        evenSum(n-1)
      }
    }
    return c
  }
}
