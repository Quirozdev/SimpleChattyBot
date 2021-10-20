import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String palabra = lector.next();
        int i = lector.nextInt();
        int j = lector.nextInt();
        String palabraSub = palabra.substring(i, j + 1);
        System.out.println(palabraSub);
    }
}