object Q4 extends App {
  val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)

  val Netbalance = (b:List[Account]) => b.reduce((x, y) => new Account("", 0, x.balance + y.balance)).balance

  val interest = (b:List[Account]) => b.map(x => if(x.balance >=0) new Account(x.nic, x.acnumber, x.balance + x.balance * 0.005) else new Account(x.nic, x.acnumber, x.balance + x.balance * 0.01))

  val a1 = new Account("1", 100, 230)
  val a2 = new Account("2", 200, 150000)
  val a3 = new Account("3", 300, -20230)
  val a4 = new Account("4", 400, 120060)
  val a5 = new Account("5", 500, 2098900)
  val a6 = new Account("6", 600, -189000)

  var bank:List[Account] = List(a1, a2, a3, a4, a5, a6)

  println("Overdraft Accounts")
  overdraft(bank).foreach(i => println(i))
  println()

  println("Sum of Accounts: Rs " + Netbalance(bank))
  println()

  println("Sum of Accounts(Plus Interest): Rs " + Netbalance(interest(bank)))
  println()

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
