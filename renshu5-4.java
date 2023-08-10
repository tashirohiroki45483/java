public class Main{
  public static void main(String[] args){
    double bottom = 10.0;
    double height = 20.0;
    double trianglearea = calcTriangleArea(bottom, height);
    System.out.println("三角形の底辺が" + bottom + "cm、高さが" + height + "cmの場合、面積は" + trianglearea + "cm2");
    double radius = 5.0;
    double circlearea = calcCircleArea(radius);
    System.out.println("円の半径が" + radius + "cmの場合面積は" + circlearea + "cm2");
  }
  
  public static double calcTriangleArea(double bottom, double height){
    double trianglearea = (bottom * height ) / 2;
    return trianglearea;
  }
  
  public static double calcCircleArea(double radius){
    double circlearea = radius * radius * 3.14;
    return circlearea;
  }
}