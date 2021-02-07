package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(double x2, double y2) {
    return Math.sqrt((x2 - this.x) * (x2 - this.x) + (y2 - this.y) * (y2 - this.y));
  }

}
