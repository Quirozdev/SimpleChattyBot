import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String palabra = lector.next();
        boolean condicion = palabra.startsWith("J") || palabra.startsWith("j");
        System.out.println(condicion);
    }
}