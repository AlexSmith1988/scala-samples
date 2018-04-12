package tutorialspoint

import scala.language.dynamics

object DynamicTyping extends App {

  object Test extends Dynamic {
    def selectDynamic(arg: String) = arg
  }


}
