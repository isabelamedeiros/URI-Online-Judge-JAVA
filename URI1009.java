import java.util.Scanner;
import java.util.Locale;


public class URI1009{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        String nome = input.next();
        Double salarioFixo = input.nextDouble();
        Double totalVendas = input.nextDouble();

        Double comissao = totalVendas * 0.15;

        Double salarioMes = salarioFixo + comissao;


        System.out.printf("TOTAL = R$ %.2f%n", salarioMes);

        input.close();
    }
}