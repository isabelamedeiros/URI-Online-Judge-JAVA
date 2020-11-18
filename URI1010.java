import java.util.Scanner;
import java.util.Locale;

public class URI1010{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codigo1 = input.nextInt();
        int quant1 = input.nextInt();
        Double valor1 = input.nextDouble();

        int codigo2 = input.nextInt();
        int quant2 = input.nextInt();
        Double valor2 = input.nextDouble();

        double valorPago = (quant1 * valor1) + (quant2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

        input.close();
    }
}