object EvenOrOdd_04 extends App{

  print("Input Number : ")
  val n = scala.io.StdIn.readInt()
  println("Is Number Even : "+isEven(n))

  def isEven(n:Int):Boolean= n match{
    case 0 => return true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))
}
