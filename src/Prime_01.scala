object Prime_01 extends App{

  var c = 2;
  print("Input Number : ")
  val n = scala.io.StdIn.readInt()
  println("Is Number prime : "+prime(n))

  def prime(n: Int): Boolean = {

    if(c <= n / 2){
      if(n % c == 0){
        return false;
      }else{
        c = c + 1;
        prime(n)
      }
    }else{
      return true;
    }
  }
}

