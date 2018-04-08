package example

import scala.io.StdIn
import scala.util.Random

object Example extends App {
  val answer = Random.nextInt(899) + 100
  println("I've chosen a number, please guess")

  var guessesLeft = 10
  var guessed = false
  while (guessesLeft > 0 && !guessed) {
    println(s"Take your guess ($guessesLeft left): ")
    val guess = StdIn readInt()

    if (guess > answer)
      println("Too much")
    else if (guess < answer)
      println("Too little")
    else
      guessed = true
    guessesLeft -= 1
  }
  if (guessed)
    println("You are right!")
  else
    println("You where unable to guess, better luck next time")
}
