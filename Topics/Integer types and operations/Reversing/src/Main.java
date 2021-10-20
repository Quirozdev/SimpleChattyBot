import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numT = scanner.next();
        char[] letras = numT.toCharArray();
        char[] letrasInv = new char[letras.length];
        int j = letras.length - 1;
        for (int i = 0; i < letras.length; i++) {
            letrasInv[i] = letras[j];
            j--;
        }
        String numInv = String.valueOf(letrasInv);

        int res = Integer.parseInt(numInv);
        System.out.println(res);
    }
}
