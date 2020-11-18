import java.util.Scanner;
import java.util.Locale;

public class URI1008{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner index = new Scanner(System.in);
        
        int codigo = index.nextInt();
        int horasTrabalhadas = index.nextInt();
        Double valorHora = index.nextDouble();
        Double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + codigo);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        index.close();
    }
}