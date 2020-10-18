public class InsideUnitCircle {

    static boolean isInsideUnitCircle(double a, double b){
        return(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) ) <= 1);
  }

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        boolean c = isInsideUnitCircle(a, b);
        System.out.println("It is " + c + " that this point is within the unit circle");

    }

}
