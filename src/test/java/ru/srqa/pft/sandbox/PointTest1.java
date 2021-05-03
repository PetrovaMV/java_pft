package ru.srqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.srqa.pft.sandbox.MyProgram2.distance;

public class PointTest1 {

  @Test
  public void TestPoint1()
  { Point p1 = new Point(3, 4);
    Point p2 = new Point(0, 0);
    if (MyProgram2.distance(p1, p2) == 5) {
      return;
    }
    throw new AssertionError();
  }
}
