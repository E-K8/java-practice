public class Ternary {
    public static void main(String[] args) {
        // expression ? choice 1 : choice 2;
        String status = "";
        int grade = 3;

    /*
    if (grade > 5) {
            status = "success";
        } else {
            status = "fail";
        }
    */
        status = (grade > 5) ? "success" : "fail";
        System.out.println(status);
    }
}

