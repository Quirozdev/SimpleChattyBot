import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        int b = lector.nextInt();
        int c = lector.nextInt();
        int d = lector.nextInt();
        int count = 0;
        int root;
        for (int i = 0; i <= 1000; i++) {
            if (count == 3) {
                break;
            } else {
                root = a * (i * i * i) + b * (i * i) + c * i + d;
                if (root == 0) {
                    count++;
                    System.out.println(i);
                }
            }
        }
    }
}