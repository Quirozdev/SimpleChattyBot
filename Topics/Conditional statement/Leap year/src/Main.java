import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        Un año es bisiesto si cumple los siguientes criterios:

    Es bisiesto si es divisible entre 4.
    Pero no es bisiesto si es divisible entre 100.
    Pero sí es bisiesto si es divisible entre 400.
    (2000 y 2400 sí son bisiestos son divisibles entre 100 pero
    también entre 400. 1900, 2100, 2200 y 2300 no lo son porque
    solo son divisibles entre 100).
         */
        Scanner lector = new Scanner(System.in);
        int anio = lector.nextInt();
        if (anio % 4 == 0 && !(anio % 100 == 0) || anio % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}