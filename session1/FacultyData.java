import java.util.Scanner;

//! assigmnt 1
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first num = ");
        double n1 = input.nextDouble();
        System.out.print("Enter second num = ");
        double n2 = input.nextDouble();
        System.out.println(
                "in sum = " + (n1 + n2) + "\nin sub = " + (n1 - n2) + "\nin mul = " + (n1 * n2) + "\nin devide = "
                        + (n1 / n2) + "\nin reminder = " + (n1 % n2));
    }
}

public class FacultyData {
    public static void main(String[] args) {
        String a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  name = ");
        String name = input.nextLine();
        System.out.print("Enter  last grade = ");
        char last_grade = input.next().charAt(0);
        System.out.print("Enter  last degree = ");
        double last_degree = input.nextDouble();
        System.out.print("Enter  number of subject = ");
        int sub = input.nextInt();

        System.out.print("Enter  pass or not = ");
        boolean pass = input.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("last grade: " + last_grade);
        System.out.println("last degree: " + last_degree);
        System.out.println("number of subjects: " + sub);
        System.out.println("Pass: " + (pass ? "yes" : "no"));
        input.close();
    }
}
// (faculty name / last grade / last degree/ number of subject / pass or not )