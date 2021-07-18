object Fibonacci_06 extends App{

  print("Input Number : ")
  val n = scala.io.StdIn.readInt()
  println("Fibonacci Sequence is : "+fibonacci(n))

  def fibonacci(n: Int):Int ={
    if (n <= 1) {
      return n
    };
    return fibonacci(n-1) + fibonacci(n-2);
  }
}
