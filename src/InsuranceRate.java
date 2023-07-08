import java.util.Scanner;

public class InsuranceRate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to insurance rate software");

        System.out.println("What is your age?");
        double age = in.nextDouble();

        System.out.println("Are you a smoker? [true or false]");
        boolean isSmoker = in.nextBoolean();

        int rate = 0;

        if (age >= 25 && age <= 35) {
            rate = isSmoker ? 92 : 33;
        }

        if (age >= 36 && age <= 45) {
            rate = isSmoker ? 179 : 50;
        }

        if (age >= 46 && age <= 65) {
            rate = isSmoker ? 1007 : 318;
        }
        System.out.printf("Your rate is £%d", rate);
    }
}


/*
Age range       Average rate (non-smokers)      Average rate (smokers)
25-35           £33                             £92
36-45           £50                             £179
46-65           £318                            £1007
*/
