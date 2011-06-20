package artima.bruceeckel

object AnonymousFunctions {

  def main(args: Array[String]): Unit = {  
    
    val v = Vector(1.1, 2.2, 3.3, 4.4)
    
    // anonymous functions
    //     ( function parameters ) => function body
    v.foreach((n: Double) => println(n))
    
    // let scala do type inference    
    v.foreach((n) => println(n))
    
    // if you have only one argument you can leave the parentheses out
    v.foreach(n => println(n))
    
    // if you have a single argument, you can leave out the parameter list and use an underscore in the anonumous function
    v.foreach(println(_))
    
    // function body is just a call to a single function that takes only one parameter. so you can eliminate the parameter list
    v.foreach(println)
    
    println(v.map(_ * 2.0))
    println(Vector(1,2,3).zip(Vector(4,5,6)))
  }

}