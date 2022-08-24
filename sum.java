public class sum {
    public static void main(String args[]) {
        int num = 2468;
        int secondDigit = (num / 100) % 10;
        int fourthDigit = (num % 10);
        int sum = secondDigit + fourthDigit;
        System.out.println("The Sum of the Second and Fourth digit is: " + sum);
    }
}