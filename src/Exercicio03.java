import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num=1, Fnum, cont=1;

        System.out.println("ME FALE EM POSIÇÃO DO FATORIAL VOCÊ QUER--> ");
        Fnum= sc.nextInt();

        if (Fnum < 0){
            System.out.println("MORRA");
        }
        else {
            while (cont <= Fnum){

                num=num*cont;
                System.out.println(+num);
                cont= cont+1;
            }

        }



    }
}
