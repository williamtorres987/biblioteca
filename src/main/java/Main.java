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
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro do funcionário: \n" + "Nome: ");
                    objetoLocacao.getFuncionario().setNome(scanner.nextLine());
                    System.out.println("CPF: ");
                    objetoLocacao.getFuncionario().setCpf(scanner.nextLong());
                    System.out.println("Digite seu cargo: ");
                    objetoLocacao.getFuncionario().setCargo(scanner.next());
                    System.out.println("Digite seu salário: ");
                    objetoLocacao.getFuncionario().setSalario(scanner.nextLong());
                    System.out.println("Digite sua rua: ");
                    objetoLocacao.getFuncionario().getEndereco().setRua(scanner.next());
                    System.out.println("Digite o número da sua rua: ");
                    objetoLocacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite o seu bairro: ");
                    objetoLocacao.getFuncionario().getEndereco().setBairro(scanner.next());
                    break;
                case 2:
                    System.out.println("Cadastro do Usuário: \n" + "Nome: ");
                    objetoLocacao.getUsuario().setNome(scanner.nextLine());
                    System.out.println("Digite seu código de usuário: ");
                    objetoLocacao.getUsuario().setCodigo(scanner.nextInt());
                    System.out.println("CPF: ");
                    objetoLocacao.getUsuario().setCpf(scanner.nextLong());
                    System.out.println("\nEndereco \n" + "Rua:");
                    objetoLocacao.getUsuario().getEndereco().setRua(scanner.next());
                    System.out.println("Digite o número da sua rua: ");
                    objetoLocacao.getUsuario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite o seu bairro: ");
                    objetoLocacao.getUsuario().getEndereco().setBairro(scanner.next());
                    break;
                case 3:
                    System.out.println("Locação de livro: \n" + "Nome do titulo do livro desejado: ");
                    objetoLocacao.getLivro().setTitulo(scanner.nextLine());
                    System.out.println("Digite o gênero literário do livro: ");
                    objetoLocacao.getLivro().setGenero(scanner.nextLine());
                    System.out.println("Digite o autor do livro desejado: ");
                    objetoLocacao.getLivro().setAutor(scanner.nextLine());
                    break;
            }

        }while (opcao!=9);

    }
}
