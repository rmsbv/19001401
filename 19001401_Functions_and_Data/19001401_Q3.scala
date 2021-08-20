object Q3 extends App {
  val a1 = new Account("107", 162, 10000)
  val a2 = new Account("143", 173, 200)

  println("BEFORE")
  println(a1)
  println(a2)

  println()
  a1.transfer(a2, 300)

  println("AFTER WITHDRAWING Rs. 300.00")
  println(a1)
  println(a2)
}

class Account(n:String, a:Int, b:Double){
  val nic:String = n
  val acnumber:Int = a
  var balance:Double = b

  def withdraw(a:Double) = {
    this.balance = this.balance - a
  }

  def deposit(a:Double) = {
    this.balance = this.balance + a
  }

  def transfer(a:Account, b:Double):Unit = {
    this.withdraw(b)
    a.deposit(b)
  }

  override def toString = "[" + this.nic + ": " + this.acnumber + ": " + this.balance + "]"
}
