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
          //  scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro do funcionário: \n" + "Nome: ");
                    objetoLocacao.getFuncionario().setNome(scanner.next());
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
                case 4:
                    do {
                        System.out.println("Selecione o cadastro na qual queira acessar \n"
                                + "1- Cadastro do funcionario\n"
                                + "2- Cadastro do usuario\n"
                                + "3- Cadastro do livro\n"
                                + "9- Voltar ao menu principal\n");
                        opcao = scanner.nextByte();
                        switch (opcao) {
                            case 1:
                                System.out.println(objetoLocacao.getFuncionario().toString());
                                break;
                            case 2:
                                System.out.println(objetoLocacao.getUsuario().toString());
                                break;
                            case 3:
                                System.out.println(objetoLocacao.getLivro().toString());
                                break;
                            default:
                                System.out.println("\n Opção invalida, digite novamente");
                        }
                    } while (opcao != 9);
                    break;
                case 5:
                    do {
                        System.out.println("Sistema de locação \n"
                                + "1- Locar livro\n"
                                + "2- Devolver livro\n"
                                + "3- Mostrar os dados do livro locado\n"
                                + "4- Mostrar os dados do livro devolvido\n"
                                + "5- Sair da locação"
                                + "Digite aqui a opção desejada:");
                        opcao = scanner.nextByte();
                        switch (opcao) {
                            case 1:

                                System.out.println("Digite o nome do livro desejado:");
                                objetoLocacao.getLivro().setTitulo(scanner.nextLine());
                                System.out.println("Digite o gênero do livro desejado:");
                                objetoLocacao.getLivro().setGenero(scanner.nextLine());
                                System.out.println("Digite o autor do livro desejado:");
                                objetoLocacao.getLivro().setAutor(scanner.nextLine());
                                break;
                            case 2:
                                System.out.println("Digite o nome do livro devolvido:");
                                objetoLocacao.getLivro().setTitulo(scanner.nextLine());
                                System.out.println("Digite o gênero do livro devolvido:");
                                objetoLocacao.getLivro().setGenero(scanner.nextLine());
                                System.out.println("Digite o autor do livro devolvido:");
                                objetoLocacao.getLivro().setAutor(scanner.nextLine());
                                break;
                            case 3:
                                System.out.println("Dados do livro locado: \n" + objetoLocacao.getLivro().toString());
                                break;
                            case 4:
                                System.out.println("Dados do livro devolvido: \n" + objetoLocacao.getLivro().toString());
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");

                        }
                    } while (opcao != 5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");

            }
        } while (opcao != 0);
    }
}