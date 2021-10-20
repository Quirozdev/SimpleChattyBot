import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 01:01:01  -  02:02:02
        int horasFirst = scanner.nextInt();
        int minutosFirst = scanner.nextInt();
        int segundosFirst = scanner.nextInt();
        int horasSecond = scanner.nextInt();
        int minutosSecond = scanner.nextInt();
        int segundosSecond = scanner.nextInt();
        
        int h2Secs = horasSecond * 3600;
        int m2Secs = minutosSecond * 60;
        int h1Secs = horasFirst * 3600;
        int m1Secs = minutosFirst * 60;
        
        int secs2 = h2Secs + m2Secs + segundosSecond;
        int secs1 = h1Secs + m1Secs + segundosFirst;
        System.out.println(secs2 - secs1);
        
    }
}
