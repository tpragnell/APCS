public class Triangles{

  // part 2
  public static double distance(double x1, double y1, double x2, double y2){
    double d = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    //round answer to four decimal places
    d = (double)Math.round(d * 10000)/10000;
    return d;
  }

  // part3
  public static String classify(double x1, double y1, double x2, double y2, double x3, double y3){
    double d12= distance(x1,y1,x2,y2);
    double d13= distance(x1,y1,x3,y3);
    double d23= distance(x2,y2,x3,y3);
    //debugging
    //System.out.println(d12+" "+d13+" "+d23);
    if( (Math.abs(d12 - d13) < 0.001) && (Math.abs(d23 - d13) < 0.001))
      return "equilateral";
    if(d12 == d13 || d23 == d13 || d12 == d23)
      return "isosceles";
    return "scalene";
  }

  // part4
  public static double perimeter(double x1, double y1, double x2, double y2, double x3, double y3){
    double d12= distance(x1,y1,x2,y2);
    double d13= distance(x1,y1,x3,y3);
    double d23= distance(x2,y2,x3,y3);
    return d12 + d13 + d23;
  }

  // part5
  public static double area(double x1, double y1, double x2, double y2, double x3, double y3){
    double a = Math.abs((x1 * (y2-y3) + x2 * (y3-y1) + x3 * (y1-y2)) / 2) ;
    a = (double)Math.round(a * 10000)/10000;
    return a;
  }
}
  // public static void main(String[] args) {
  //   double x1 = Double.parseDouble(args[0]);
  //   double y1 = Double.parseDouble(args[1]);
  //   double x2 = Double.parseDouble(args[2]);
  //   double y2 = Double.parseDouble(args[3]);
  //   double x3 = Double.parseDouble(args[4]);
  //   double y3 = Double.parseDouble(args[5]);

  // part 2
  // double d = distance(x1, y1, x2, y2);
  // System.out.println("The distance between points (x1,x2) and (y1,y2) is " + d);

  // part 3
  // String c = classify(x1,y1,x2,y2,x3,y3);
  // System.out.println("The triangle type is " + c);

  // part4
  // double p = perimeter(x1,y1,x2,y2,x3,y3);
  // System.out.println("The perimeter of this triangle is " + p);

  // part5
  // double a = area(x1,y1,x2,y2,x3,y3);
  // System.out.println("The triangle type is " + c + " and the area of this triangle is " + a);

  //}
