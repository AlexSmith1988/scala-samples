package sandbox

import scala.io.StdIn
import scala.util.Random

object GameOf1000 extends App {
  val answer = Random.nextInt(899) + 100
  println("I've chosen a number, please guess")

  var guessed = false
  for (guessesLeft <- 10 until 0) {
    println(s"Take your guess ($guessesLeft left): ")

    PartialFunction[Int, Unit] {
      case guess if guess > answer => println("Too much")
      case guess if guess < answer => println("Too much")
      case _ => {
        println("Congratulations, you've guessed")
        guessed = true
      }
    }(StdIn readInt())
  }

  if (!guessed)
    println(s"You where unable to guess $answer, better luck next time")
}
