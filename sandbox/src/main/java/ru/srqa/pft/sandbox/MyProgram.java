package ru.srqa.pft.sandbox;

public class MyProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Marina");
    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + "  = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello," + somebody + "!");
  }

  public static class Point1{

    public static void main(String[] args) {

      ru.srqa.pft.sandbox.Point P = new ru.srqa.pft.sandbox.Point(1, 2, 3, 4);
      System.out.println("Расстояние между точками " + "= "  + distance(P));
    }
    public static double distance (ru.srqa.pft.sandbox.Point P){
      return Math.sqrt((P.p3-P.p1)*(P.p3-P.p1)+(P.p4-P.p2)*(P.p4-P.p2));
    }
  }

  }
