 package Teoria;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char carac = sc.next().charAt(0);
        int num = sc.nextInt();
        String nome = sc.next();
        double num2 = sc.nextDouble();

        System.out.println("Você digitou: " + carac);
        System.out.println("Você digitou: " + num);
        System.out.println("Você digitou: " + nome);
        System.out.println("Você digitou: " + num2);

        sc.close();
    }
    
}