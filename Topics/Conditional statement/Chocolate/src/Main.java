import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        int m = lector.nextInt();
        int k = lector.nextInt();
        int mult = n * m;
        boolean valid = k < mult;
        int residuo = k % n;
        int residuo2 = k % m;
        if (valid && (residuo == 0 || residuo2 == 0))  {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}