import java.lang.Math.pow

import scala.concurrent.{Future, Promise}

"Hello".intersect("World")

"Hello, world"

class Test2 {
  def some = {
    println("Some")
  }
}

new Test2 some

val s: BigInt = 10000000
val s2 = s * s * s * s

for (r <- 10 until (1, -1)) yield r * r

case class Baloon(color: Int, size: Int, label: String) {
    def volume = pow(size, 3) toInt
  }

  Baloon (0xFFFFFF, 10, "Hello, Case classes world") volume

    Future {
      println(2) // non-blocking long lasting computation
  }

import scala.concurrent.ExecutionContext.Implicits.global
val f1 : Future[Any] =  Future {
  println(2) // non-blocking long lasting computation
}

val mf1 = f1.mapTo[Option[Int]]





