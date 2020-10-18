public class Homework4 {

    static boolean isInsideUnitCircle(double a, double b){
      return(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) ) <= 1);
  }

    static double isRatioOfPoints(int howManyTrials){
      int total = 0;
      for (int i = 0; i < howManyTrials; i++) {
          double x = Math.random();
          double y = Math.random();
          boolean z = isInsideUnitCircle(x, y);
          if (z) total++;
//          System.out.println("x=" + x + " y=" +  y + " z=" + z);
      }
//      System.out.println("Total=" + total);
      return ((double)total / (double)howManyTrials);
    }

    public static void main(String[] args) {
        int p = 1;
        for (int i = 0; i < 7; i++) {
          p = p * 10;
          double c = (4 * isRatioOfPoints(p));
          System.out.println("seed="+p+" and results = "+c);
        }
    }
}
// The significance of this exercise is that it is the method to generate an approximation of pi
