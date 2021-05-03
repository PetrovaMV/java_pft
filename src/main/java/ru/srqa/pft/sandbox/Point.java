package ru.srqa.pft.sandbox;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  //вычисляет расстояние от текущей точки то точки @param p
  public double distance(Point p) {
    double xDif = this.x - p.x;
    double yDif = this.y - p.y;
    return Math.sqrt((xDif * xDif) + (yDif * yDif));
  }
}
