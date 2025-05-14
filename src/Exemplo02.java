/*
    Programa para ler dois numeros inteiro (o segundo valor deve ser obrigatoriamente maior que o primeiro). O programa deve imprimir todos os numeros dentro do intervalo (inclusive os extremos)
*/
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro número--> ");
        num1= sc.nextInt();
        System.out.println("Digite o segundo número--> ");
        num2= sc.nextInt();

        if (num2 > num1){

            while (num1 <= num2){

                System.out.println("  " +num1);
                num1= num1 + 1;

            }
        }
        else {
            System.out.println("MORRA");
        }

    }
}
