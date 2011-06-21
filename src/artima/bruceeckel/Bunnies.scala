package artima.bruceeckel

case object Hop
case object Stop

case class Bunny(id: Int) extends scala.actors.Actor {
  this ! Hop
  start()
  def act {
    loop {
      react {
        case Hop =>
          println(this + " ")
          this ! Hop
          Thread.sleep(500)
        case Stop =>
          println("Stopping " + this)
          exit()
      }
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {  
    val bunnies = Range(0,10).map(new Bunny(_)) 
    println("Press RETURN to quit")
    readLine
    bunnies.foreach(_ ! Stop)
  }
}

