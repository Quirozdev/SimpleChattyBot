import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int number = lector.nextInt();
        if (number > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}