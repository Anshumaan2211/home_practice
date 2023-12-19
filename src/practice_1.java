
import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        // Question - 1 : -
        Scanner anshu = new Scanner(System.in);

        System.out.print("Enter Your Name : -");
        String name = anshu.next();

        System.out.println("Hello !! " + name);

        // Question - 2 : -


        System.out.print("Enter Your 1st Number : -");
        int no1 = anshu.nextInt();


        System.out.print("Enter Your 2nd Number : -");
        int no2 = anshu.nextInt();

        int total = ( no1 + no2 );

        System.out.println("Your Total is  : -" + total);


        // Question - 3 : -


        System.out.print("Enter Temprature  : -");
        int temp = anshu.nextInt();

        int f = (int)(9.0 / 5.0 * temp + 32);

        System.out.println("Celcius : -" + f);


        // Question - 4 : -

        System.out.println("Enter Principal : -");
        int principal = anshu.nextInt();
        System.out.println("Enter Rate : -");
        double rate = anshu.nextDouble();
        System.out.println("Enter Times : -");
        double time = anshu.nextDouble();


        double sint =  (principal * rate * time) / 100;
        System.out.println("Simple Interest is " + sint);

        // Question - 5 : -


        System.out.println("Enter Seconds : - ");
        int seconds = anshu.nextInt();
        int min = seconds / 60 ;
        int hour = min / 60;

        System.out.println("Hours  : -" + hour);
        System.out.println("Minutes : - " + min);
        System.out.println("seconds : - " + seconds);


        // Question - 6 : ----------


        // Question - 7 : ----------


        // Question - 8 : -


        System.out.print("Enter the radius of the circle: ");
        double radius = anshu.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        // Question - 9 : -


        System.out.print("Enter the length of the rectangle: ");
        double length = anshu.nextDouble();


        System.out.print("Enter the width of the rectangle: ");
        double width = anshu.nextDouble();


        double area2 = length * width;
        double circumference2 = 2 * (length + width);


        System.out.println("Area of the rectangle: " + area2);
        System.out.println("Circumference of the rectangle: " + circumference2);


    // Question - 10 : -

        System.out.print("Enter the principal amount: -");
        double principal2 = anshu.nextDouble();

        System.out.print("Enter the annual interest rate : -");
        double rate2 = anshu.nextDouble();

        System.out.print("Enter the time : -");
        double time2 = anshu.nextDouble();

     /*   double ci = principal2(1+rate2/100)*time2 - principal2;
//*/
//        System.out.println("\nCompound Interest: " + ci);


    }
}
