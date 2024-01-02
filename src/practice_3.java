import java.util.Scanner;

public class practice_3 {

    public static void main(String[] args) {

        Scanner anshu = new Scanner(System.in);
        int school[][] = new int[4][3];

        String[] naming = {"class", "devision"};
        String schoolname[]=new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Devision : -");
             schoolname[i] = anshu.next();

            for (int j = 0; j < 1; j++) {
                System.out.println("Enter " + naming[j]);
                school[i][j] = anshu.nextInt();

            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println("Devision "+ (j + 1)+"\t : -   "+ schoolname[i]);
                System.out.println("School \t"+ (j + 1)+ "'s\t " + naming[i]+ "\t " +school[i][j]);
                System.out.println("==================================" );
            }
        }
    }
}



