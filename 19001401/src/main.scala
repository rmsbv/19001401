import Q1_T_Convert.T_Convert
import Q2_Area.Area
import Q3_Cost.Total
import scala.math.Pi

object main extends App{

  val T_cent: Double = 35
  val Radius: Double = 5
  val Price: Double = 24.95

  println(T_Convert(T_cent))
  println(Area(Radius))
  println(Total(Price))


}

