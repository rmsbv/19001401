object Q2 extends App {
  val x = new Rational(4, 5)
  val y = new Rational(6, 9)
  val z = new Rational(3, 8)

  println("Answer:")
  println(x.sub(y).sub(z))
}

class Rational(n:Int, d:Int){
  val numer = n
  val denom = d

  def sub(num:Rational):Rational = {
    new Rational(this.numer * num.denom - num.numer * this.denom, this.denom * num.denom)
  }

  override def toString = this.numer.toString + " / " + this.denom.toString
}
