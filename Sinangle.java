import java.lang.Math;

  public   class  SinFunction {

        public static void main(String args[])
        {
            double degrees = 45.0;

            double radians = Math.toRadians(degrees);

            double sinValue = Math.sin(radians);

            System.out.println("sin(" + degrees + ") = " + sinValue);
        }
    }
