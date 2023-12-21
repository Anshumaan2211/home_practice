import java.util.Scanner;

public class practice_2 {
    public static void main(String[] args) {
        Scanner anshu = new Scanner(System.in);


  //       Question - 1 : -
        System.out.println("Enter a Number : ");
        int a = anshu.nextInt();

        if (a % 2 == 0) {
            System.out.println("Your Number is Even");
        } else {
            System.out.println("Your Number is Odd");
        }


        //     Question - 2 : -
        System.out.println("Enter a Number One : ");
        int b = anshu.nextInt();

        System.out.println("Enter a Number Two : ");
        int c = anshu.nextInt();

        if (b > c) {
            System.out.println(b + "\tis Bigger");
        } else {
            System.out.println(c + "\tis Bigger");
        }



        //      Question - 3 : -

        System.out.println("Enter a Number One : ");
        int d = anshu.nextInt();

        System.out.println("Enter a Number Two : ");
        int e = anshu.nextInt();

        System.out.println("Enter a Number Three : ");
        int f = anshu.nextInt();

        if (d > e && d>f) {
            System.out.println(d + "\tis the Biggest");
        } else if (e>d && e>f){
            System.out.println(e + "\tis the Biggest");
        }
        else{
            System.out.println(f + "\tis the Biggest");
        }


        //     Question - 4 : -
        System.out.println("Enter a Year: ");
        int year = anshu.nextInt();

        if (year % 4 == 0){
            System.out.println("This is Leap Year");
        }
        else {
            System.out.println("This is not Leap Year");
        }


        //      Question - 5 : -

        System.out.println("Enter a Calls Number: - ");
        int calls = anshu.nextInt();
        if (calls < 100){
            System.out.println("Minimum Rs. 200 for up to 100 calls. \n");
        }
        else if (calls < 150 ){
            System.out.println("Plus Rs. 0.60 per call for next 50 calls till 150. \n");
        }
        else if (calls < 199){
            System.out.println("Plus Rs. 0.50 per call for next 50 calls till 200. \n");
        }

        else{System.out.println("Plus Rs. 0.40 per call for any call beyond 200 calls. ");
        }



        //       Question - 6 : -


        System.out.print("Enter marks for Subject 1: ");
        double subject1 = anshu.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = anshu.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = anshu.nextDouble();


        double average = (subject1 + subject2 + subject3) / 3;


        System.out.println("\nAverage Marks: " + average);


        System.out.print("Grade: ");
        if (average >= 90 && average <= 100) {
            System.out.println("A");
        } else if (average >= 80 && average < 90) {
            System.out.println("B");
        } else if (average >= 70 && average < 80) {
            System.out.println("C");
        } else {
            System.out.println(" Not valid age :( ");
        }


        //      Question - 7 : -

        System.out.print("Enter a number (1-7): ");
        int userInput = anshu.nextInt();

        // Check the user input and display the corresponding day
        if (userInput == 1) {
            System.out.println("Corresponding day: Sunday");
        } else if (userInput == 2) {
            System.out.println("Corresponding day: Monday");
        } else if (userInput == 3) {
            System.out.println("Corresponding day: Tuesday");
        } else if (userInput == 4) {
            System.out.println("Corresponding day: Wednesday");
        } else if (userInput == 5) {
            System.out.println("Corresponding day: Thursday");
        } else if (userInput == 6) {
            System.out.println("Corresponding day: Friday");
        } else if (userInput == 7) {
            System.out.println("Corresponding day: Saturday");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }


        //    Question - 8 : ----------

    }
}
