import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //   a. Implentasi rumus luas lingkaran dan volume balok pada bahasa Java
        Scanner userInput = new Scanner(System.in);

        double phi = Math.PI;
        double result = 0.0;
        int p, l, t;
        char operator;
        double radius;

        System.out.println("1. Menghitung luas lingkaran");
        System.out.println("2. Menghitung volume balok");
        System.out.print("Pilih rumus: ");
        operator = userInput.next().charAt(0);


        switch (operator) {
            case '1':
                System.out.println("Masukan jari-jari");
                radius = userInput.nextDouble();
                result = phi * radius * radius;
                break;
            case '2':
                System.out.println("Masukan panjang balok");
                p = userInput.nextInt();
                System.out.println("Masukan lebar balok");
                l = userInput.nextInt();
                System.out.println("Masukan tinggi balok");
                t = userInput.nextInt();
                result = p * l * t;
            default:
        }
        System.out.println(result);
    }
}