import java.util.Scanner;

public class ativi {

    public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            System.out.println("Digite um número de 1 a 5: ");
            int numero = leia.nextInt();
            switch (numero) {
                case 1:
                System.out.print("Número 1 foi digitado...");
                break;

                case 2: 
                System.out.print("Número 2 foi digitado...");
                break;

                case 3:
                System.out.print("Número 1 foi digitado...");
                break;

                case 4:
                System.out.print("Número 1 foi digitado...");
                break;

                case 5:
                System.out.print("Número 1 foi digitado...");

                default: 
                System.out.print("Numero invalido");
                break;



               }   

    }
}

