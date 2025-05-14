import java.util.Scanner;

public class Exercio01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int valor, Vmaior=0, contador=1;



        while (contador <= 15){

            System.out.println("ME INFORME O NUMERO--> ");
            valor= sc.nextInt();

            if (contador == 1 || valor > Vmaior){

                Vmaior=valor;

            }
            contador=contador+1;

            System.out.println("Seu maior valor por enquanto é--> " + Vmaior);

        }

    }
}
