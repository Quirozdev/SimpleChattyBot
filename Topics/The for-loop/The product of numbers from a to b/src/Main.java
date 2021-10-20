import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        int b = lector.nextInt();
        long product = 1;
        for (; a < b; a++) {
            product *= a;
        }
        System.out.println(product);
    }
}
