import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char grade = in.next().charAt(0);

        String result = switch (grade) {
            case 'A' -> "Excellent";

            case 'B' -> "Very good";

            case 'C' -> "Good";

            case 'D' -> "Pass";

            case 'F' -> "Fail";
            default -> "Unknown grade";

  /*          case 'A':
                yield "Excellent";

            case 'B':
                yield "Very good";

            case 'C':
                yield "Good";

            case 'D':
                yield "Pass";

            case 'F':
                yield "Fail";
            default:
                yield "Unknown grade";*/
        };

        System.out.println(result);

/*        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Very good");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Pass");
        } else if (grade == 'F') {
            System.out.println("Fail");
        } else {
            System.out.println("Unknown grade");
        }*/
    }
}

/*
        A   Excellent
        B   Very good
        C   Good
        D   Pass
        F   Fail

 */