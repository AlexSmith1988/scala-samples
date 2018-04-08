package example

import scala.io.StdIn
import scala.util.Random

object Example extends App {
  println("I've chosen a number, please guess")
  println(Random.nextInt(899) + 100)

  var guessesLeft = 10
  while (guessesLeft > 0) {
    print(s"Take your guess ($guessesLeft left): ")
    val guess = StdIn.readInt()
    println(guess)
    if (guess > 0)
  }


}
