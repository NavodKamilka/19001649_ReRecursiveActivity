object sum_03 extends App{

  var c = 0;
  print("Input Number : ")
  val n = scala.io.StdIn.readInt()
  println("Sum of 1 to "+n+" : "+sum(n))

  def sum(n : Int): Int ={
    if(n > 0){
      c = c + n
      sum(n - 1)
    }
    return c
  }
}
