import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean p1 = num > 0;
        boolean p2 = num2 > 0;
        boolean p3 = num3 > 0;
        boolean res1 = p1 && !p2 && !p3;
        boolean res2 = !p1 && p2 && !p3;
        boolean res3 = !p1 && !p2 && p3;
        boolean resf = res1 || res2 || res3;
        System.out.println(resf);
    }
}