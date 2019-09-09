import java.util.Scanner;

public class showPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao N de in ra tat ca cac so nguyen to nho hon N");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i+ "\n");
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2;i <= squareRoot;i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
