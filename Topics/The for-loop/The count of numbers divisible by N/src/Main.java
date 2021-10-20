import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        int b = lector.nextInt();
        int n = lector.nextInt();
        int resta = b - a;
        int count = resta / n;
        if (resta % n == 0) {
            count++;
        } else {
            int prueba = n * (count + 1);
            if (prueba >= a && prueba <= b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
