package Teoria;
import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Danielly";
        int idade = 21;
        double renda = 700.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);

        
    }
    
}
