package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexei");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(2.00, 5.00);
    Point p2 = new Point(5.00, 9.00);

    System.out.println("\nРасстояние между двумя точками координат будет равно следующему: \n" +
            "Квадратный корень из (" + p2.x + " - " + p1.x + ") в квадрате плюс (" + p2.y + " - " + p1.y + ") в квадрате \n" +
            "и будет равно " + distance(p1, p2));

    //method distanse is inside of the class Point
    System.out.println("\nВычисление расстояния между двумя точками через метод внутри класса. \n" +
            "Результат равен " + p1.distance(p2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  //function distance is outside of the class Point
  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
  }

}