package projetos;

import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é de: " + String.format("%.2f", imc));

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso ideal");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está com o peso ideal");
        } else if (imc >= 25 && imc < 29.9 ) {
            System.out.println("Você está com sobrepeso");
        } else {
            System.out.println("Você está obeso");
        }

        sc.close();
    }
}
