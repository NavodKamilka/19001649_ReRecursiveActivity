object primeSeq_02 extends App{

  var c = 2;
  print("Input Number : ")
  val n = scala.io.StdIn.readInt()
  primeSeq(n - 1)

  def primeSeq(n: Int): Unit ={
    if(c <= n / 2){
      if(n % c == 0){
        c = 2
        primeSeq(n - 1)
      }else{
        c = c + 1
        primeSeq(n)
      }
    }else{
      if(n > 1){
        println(n)
        c = 2
        primeSeq(n - 1)
      }
    }
  }
}
