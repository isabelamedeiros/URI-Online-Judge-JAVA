import java.util.Scanner;

public class URI1004{
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Digite o primeiro valor: ");
int valor1 = input.nextInt();

System.out.println("Digite o segundo valor: ");
int valor2 = input.nextInt();

int prod = valor1 * valor2;

System.out.println("PROD = "+ prod);

input.close();
    }
}    