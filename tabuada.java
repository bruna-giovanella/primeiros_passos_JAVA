package section3;
import java.util.Scanner;

public class tabuada {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            int produto = numero * i;
            System.out.println(numero + "*" + i + "=" + produto);
        }


        scanner.close();
    }

}
