package ru.srqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.srqa.pft.sandbox.MyProgram2.distance;

public class PointTests {
  @Test
  public void TestPoint()
  { Point p1 = new Point(3, 4);
    Point p2 = new Point(0, 0);
    Assert.assertEquals(MyProgram2.distance(p1, p2),5);
  }

}
