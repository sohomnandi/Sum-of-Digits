import java.util.Scanner;

public class sum_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double num;
        while (true) {
            num = sc.nextDouble();
            if (num >= 1000 && num <= 9999) {
                break;
            }
            else {
                System.out.println("Please try to give a 4 Digit Number");
                continue;
            }
        }
        double secondDigit = (num / 100) % 10;
        double fourthDigit = (num % 10);
        double sum = secondDigit + fourthDigit;
        System.out.println("The sum of the Second and Fourth digit is: " + sum);
    }
}