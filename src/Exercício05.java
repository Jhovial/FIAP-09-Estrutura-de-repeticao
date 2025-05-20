import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double Qfibonacci,x=1, y=1,z,n=0 ;

        System.out.println("Me fale quantos números de Fibonacci você quer-->" );
        Qfibonacci= sc.nextDouble();


        if (Qfibonacci==1){
            System.out.print(x);
        }
        else if (Qfibonacci == 2){
            System.out.println(x+" "+y);
        }
        else{
            System.out.println(x+" "+y+" ");
            n = 3;

            while (n <= Qfibonacci){
                z = x + y;
                x = y;
                y = z;


                System.out.println(+z);
                n = n + 1;
            }
        }

    }
}
