package ru.stqa.pft.sanbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class HomeTaskWithAssertions {

  //Home task with assertion the distance between two points inside of the method
  @Test
  public void testDistanceMethod() {
    Point p = new Point(2, 5);
    Assert.assertEquals(p.distance(5, 9), 5,0);
  }

  //Home task with assertion the distance between two points inside of the function
  @Test
  public void testDistanceFunction() {
    Point p1 = new Point(2.00, 5.00);
    Point p2 = new Point(5.00, 9.00);
    Assert.assertEquals(Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y)), 5,0);
  }
  
}
