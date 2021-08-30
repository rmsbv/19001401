object points {

  case class point(x:Int, y:Int){
    def +(p:point)=point(p.x+this.x, p.y+this.y)
    def move(dx:Int, dy:Int)=point(dx+this.x, dy+this.y)
    def distance(p:point)=point(this.x-p.x, this.y-p.y)
    def invert=point(this.y, this.x)
  }

  def main(args: Array[String]): Unit = {
    val p1 = point(6,5)
    val p2 = point(3,4)
    val p3 = p1+p2

    println(" >p1 = "+p1)
    println(" >p2 = "+p2)
    println(" >p1 + p2 = "+p3)
    println(" >p1 move 4,5 of distance = "+p1.move(4,5))
    println(" >Distance between p1 and p2 = "+ p1.distance(p2))
    println(" >Invert p1 cordinates = "+ p1.invert)
  }

}