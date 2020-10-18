public class Tester{
  public static void main(String[] args) {
    double x1 = Double.parseDouble(args[0]);
    double y1 = Double.parseDouble(args[1]);
    double x2 = Double.parseDouble(args[2]);
    double y2 = Double.parseDouble(args[3]);
    double x3 = Double.parseDouble(args[4]);
    double y3 = Double.parseDouble(args[5]);

    // part2
    double d = Triangles.distance(x1, y1, x2, y2);
    System.out.println("The distance between points (x1,x2) and (y1,y2) is " + d);

    // part 3
    String c = Triangles.classify(x1,y1,x2,y2,x3,y3);
    System.out.println("The triangle type is " + c);

    // part4
    double p = Triangles.perimeter(x1,y1,x2,y2,x3,y3);
    System.out.println("The perimeter of this triangle is " + p);

    // part5
    double a = Triangles.area(x1,y1,x2,y2,x3,y3);
    System.out.println("The triangle type is " + c + " and the area of this triangle is " + a);
    }

}
