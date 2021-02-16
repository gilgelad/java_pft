package ru.stqa.pft.sanbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;
import ru.stqa.pft.sandbox.Square;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }

  //Home task with assertion the distance between two points inside of the method
  @Test
  public void testDistanceMethod() {
    Point p1 = new Point(2.00, 5.00);
    Point p2 = new Point(5.00, 9.00);
    Assert.assertEquals(p1.distance(p2), 5,0);
  }

  //Home task with assertion the distance between two points inside of the function
  @Test
  public void testDistanceFunction() {
    Point p1 = new Point(2.00, 5.00);
    Point p2 = new Point(5.00, 9.00);
    Assert.assertEquals(Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y)), 5,0);
  }

}
