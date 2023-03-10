package conteudos;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero 1 ou 2 ");
        opcao = scanner.nextInt();

        //Switch case é utilizado para trabalhar com diversos casos, recebemos um valor pelo parametro do switch
        // e utilizamos ele para trabalhar em cima dos nossos casos.
        switch (opcao){
            case 1:
                System.out.println("Voce escolheu numero 1");
                break;
            case 2:
                System.out.println("Voce escolheu numero 2");
                break;
            default:
                System.out.println("Numero invalido");
        }
    }
}
