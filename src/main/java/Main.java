import projbiblioteca.Locacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locacao objetoLocacao = new Locacao();

        byte opcao;

        do {
            System.out.println("Escolha uma opção abaixo\n" +
                    "[1] - Cadastrar funcionário\n" +
                    "[2] - Cadastrar usuário\n" +
                    "[3] - Cadastrar livro\n" +
                    "[4] - Mostrar todos os dados do cadastro\n" +
                    "[5] - Ir para locação\n" +
                    "[0] - Sair\n" +
                    "Digite aqui a opção ");
            opcao = scanner.nextByte();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Cadastro do funcionário: \n"+ "Nome: ");
                    objetoLocacao.getFuncionario().setNome(scanner.nextLine());
                    System.out.println("CPF: ");
                    objetoLocacao.getFuncionario().setCpf(scanner.nextLong());

                    /*
                    TODO: pedir para o usuário que está cadastrando um funcionário os seguintes dados abaixo:
                    cargo do funcionario.
                    salário do funcionario.
                    rua do funcionario.
                    numero do funcionario.
                    bairro do funcionario.
                     */
            }

        }

    }
}
