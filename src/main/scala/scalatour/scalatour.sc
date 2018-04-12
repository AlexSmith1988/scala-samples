{
  println {{{{
    "test"
  } + "hop"}}}
}
(1, 2)

object Test {
 def sum(x: Int)(y: Int): Int = x + y
  def ahha(x: Int): Int = x * x
}

Test sum _
Test ahha 10

()

class ClassArgs(name: String, age: Int) {
  def greet(how: String) = println(s"$how, $name, your age is $age")
}

val greeterClass = new ClassArgs("Joe", 22)

case class Greeter(name: String, age: Int) {
  def greet(how: String) = println(s"$how, $name, your age is $age")
}

Greeter ("Helen", 33) greet "Good day"























