

object MyFirst {

  def main(Args: Array[String]): Unit = {
    val mapper = (v: Int) => "value " + v
    //      Stream from 1 map mapper foreach println

    create("1") + create("2")

    val s = "1"
  }

  def create(msg: String): Test = {
    return new Test(msg)
  }
}

class Test(msg: String) {
  def +(operand: Test): Unit = {
    println("Test:" + msg /*+ operand.msg*/)
  }
}
