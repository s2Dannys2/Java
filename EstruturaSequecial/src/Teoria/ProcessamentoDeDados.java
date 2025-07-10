package Teoria;

public class ProcessamentoDeDados {
    public static void main(String[] args) {
        /*
           Sintaxe:
           <variavel> = <expressão>;
         */
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B)/2.0 * h;
        System.out.println(area);

        int num1,num2;
        double resultado;

        num1 = 5;
        num2 = 2;

        resultado = (double) num1 / num2;
        System.out.println(resultado);
    } 
}
