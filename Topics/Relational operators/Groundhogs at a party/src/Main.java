import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean cond1 = isWeekend && cups >= 15 && cups <= 25;
        boolean cond2 = !isWeekend && cups >= 10 && cups <= 20;
        boolean success =  cond1 || cond2;
        System.out.println(success);
    }
}