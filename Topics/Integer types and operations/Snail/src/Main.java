import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int aDay = scanner.nextInt();
        int bNight = scanner.nextInt();
        int days = (height - bNight - 1) / (aDay - bNight) + 1;
        System.out.println(days);
    }
}