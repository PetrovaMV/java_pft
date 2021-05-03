package ru.srqa.pft.sandbox;


public class MyProgram2 {
  public static void main(String[] args) {
    // 2 нижние строчки вызывают конструктор (`new Point()`)
    Point p1 = new Point(3, 4);
    Point p2 = new Point(0, 0);
    // вызываем метод distance.
    // сохраняем результат в переменную length
    double length1 = distance(p1, p2);
    //посчитать дистанцию от текущей точки до переданной
    double length2 = p1.distance(p2);


    System.out.println("length_1: " + length1);
    System.out.println("length_2: " + length2);
  }

  // из переменной достем значения x и y
  public static double distance(Point p1, Point p2) {
    double xDif = p1.x - p2.x;
    double yDif = p1.y - p2.y;
    // вызываем метод для подсчета расстояния между точками
    return Math.sqrt((xDif * xDif) + (yDif * yDif));
  }
}
