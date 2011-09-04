package ch.hochreiter.oo

import java.awt.{Color, Graphics}
 
abstract class Shape {
  var fillColor:Color = null
 
  def draw(g:Graphics):Unit
  def area:Double
}

class Circle(var radius:Int) extends Shape {
  def draw(g:Graphics):Unit = {
    if (fillColor == null) {
      g.drawOval(0, 0, radius / 2, radius / 2)
    } else {
      g.setColor(fillColor);
      g.fillOval(0, 0, radius / 2, radius / 2)
    }
  }
  
  def area:Double = {
    var back = Math.Pi * radius 
    back * radius
  }
}

class Square(var width:Int) extends Shape {
  def draw(g:Graphics):Unit = {
    if (fillColor == null) {
      g.drawRect(0, 0, width, width)
    } else {
      g.setColor(fillColor)
      g.fillRect(0, 0, width, width)
    }
  }
 
  def area:Double = width * width
}