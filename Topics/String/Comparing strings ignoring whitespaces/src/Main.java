import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String palabra1 = lector.nextLine();
        String palabra2 = lector.nextLine();
        palabra1 = palabra1.trim().replace(" ", "");
        palabra2 = palabra2.trim().replace(" ", "");
        System.out.println(palabra1.equals(palabra2));
    }
}