package ru.srqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.srqa.pft.sandbox.MyProgram2.distance;


  public class PointTest2 {
    @Test
    public void TestPoint2()
    { Point p1 = new Point(3, 4);
      Point p2 = new Point(0, 0);
      Assert.assertEquals(distance(p1, p2), 5);
    }


}
