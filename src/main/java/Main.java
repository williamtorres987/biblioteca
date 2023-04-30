import java.text.ParseException;
import projbiblioteca.Locacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        Locacao locacao = new Locacao();
        Locacao locacao2 = new Locacao();
        Locacao locacao3 = new Locacao();

        byte opcao;

        do {
            System.out.println("Escolha uma opção abaixo: \n " +
                "[1] - Cadastrar funcionario \n " +
                "[2] - Cadastrar usuario \n " +
                "[3] - Cadastrar livro \n " +
                "[4] - Mostrar todos os dados do cadastro \n " +
                "[5] - Ir para locação \n " +
                "[0] - SAIR \n " +
                "Digite aqui a opção desejada");
            opcao = scanner.nextByte();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro do funcionario \n " + "Digite seu nome: ");
                    locacao.getFuncionario().setNome(scanner.nextLine());
                    System.out.println("Digite seu CPF: ");
                    locacao.getFuncionario().setCpf(scanner.nextLong());
                    System.out.println("Digite seu salário");
                    locacao.getFuncionario().setSalario(scanner.nextDouble());
                    System.out.println("Digite seu cargo: ");
                    locacao.getFuncionario().setCargo(scanner.next());
                    scanner.nextLine();
                    System.out.print("Endereço------\n"
                        + "Rua: ");
                    locacao.getFuncionario().getEndereco().setRua(scanner.nextLine());
                    System.out.println("Digite o número");
                    locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Digite seu bairro: ");
                    locacao.getFuncionario().getEndereco().setBairro(scanner.nextLine());
                    break;

                case 2:
                    System.out.println("Cadastro do Usuario \n " + "Digite seu nome: ");
                    locacao.getUsuario().setNome(scanner.nextLine());
                    System.out.println("Digite seu número de usuario: ");
                    locacao.getUsuario().setCodigo(scanner.nextInt());
                    System.out.println("Digite seu CPF: ");
                    locacao.getUsuario().setCpf(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("\nEndereço\n"
                        + "Rua: ");
                    locacao.getUsuario().getEndereco().setRua(scanner.nextLine());
                    System.out.println("Digite o número");
                    locacao.getUsuario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite seu bairro:");
                    locacao.getUsuario().getEndereco().setBairro(scanner.next());
                    break;
                case 3:
                    System.out.println("Cadastro de Livro \n " + "Digite o Titulo: ");
                    locacao.getLivro().setTitulo(scanner.nextLine());
                    System.out.println("Digite o gênero do livro");
                    locacao.getLivro().setGenero(scanner.nextLine());
                    System.out.println("Digite o Autor do livro");
                    locacao.getLivro().setAutor(scanner.nextLine());
                    break;
                case 4:
                    do {
                        System.out.println("Selecione o cadastro desejado \n " +
                            "[1] para FUNCIONÁRIO \n " +
                            "[2] para USUÁRIO \n " +
                            "[3] para LIVRO \n " +
                            "[9] para VOLTAR AO MENU PRINCIPAL");
                        opcao = scanner.nextByte();
                        switch (opcao) {
                            case 1:
                                System.out.println(locacao.getFuncionario().toString());
                                break;
                            case 2:
                                System.out.println(locacao.getUsuario().toString());
                                break;
                            case 3:
                                System.out.println(locacao.getLivro().toString());
                                break;
                            case 9:
                                break;
                            default:
                                System.out.println("Opção inválida \n Digite novamente");
                        }
                    } while (opcao != 9);
                    break;
                case 5:
                    do {
                        System.out.print("\n::::::::::::::::: Sistema de Locação ::::::::::::::::::\n" +
                            "  Escolha uma opção abaixo\n" +
                            "  [1] - Locar livro\n" +
                            "  [2] - Devolver livro\n" +
                            "  [3] - Mostrar os dados do livro locado\n" +
                            "  [4] - Mostra os dados do livro devolvido\n" +
                            "  [5] - Sair da locação\n" +
                            "  Digite aqui a opção: \n");
                        opcao = scanner.nextByte();
                        switch (opcao) {
                            case 1:
                                scanner.nextLine();
                                System.out.println("Insira os dados do livro: \n" + "Titulo");
                                locacao.getLivro().setTitulo(scanner.nextLine());
                                System.out.println("Genero");
                                locacao.getLivro().setGenero(scanner.nextLine());
                                System.out.println("Autor");
                                locacao.getLivro().setAutor(scanner.nextLine());

                                break;
                            case 2:
                                scanner.nextLine();
                                System.out.println("Insira os dados do livro devolvido: \n" + "Titulo");
                                locacao2.getLivro().setTitulo(scanner.nextLine());
                                System.out.println("Genero");
                                locacao2.getLivro().setGenero(scanner.nextLine());
                                System.out.println("Autor");
                                locacao2.getLivro().setAutor(scanner.nextLine());
                                System.out.println("Dia da locação:");
                                System.out.println("Qual o valor da multa a pagar?");
                                System.out.println("::::::::Tabela de valores da multa:::::");
                                System.out.println("1 á 7 dias de atraso, valor da multa é o total de 10 R$ fixo");
                                System.out.println("7 dias PRA CIMA de atraso, valor da multa é o total de 20 R$ fixo");
                                System.out.println("Dependendo do tempo de atrasado o cliente poderá perder sua carteirinha de locação do nosso estabelecimento");
                                locacao2.setValorMulta(scanner.nextDouble());
                                break;
                            case 3:
                                System.out.println("Dados do livro locado: \n" + locacao.getLivro().toString());

                                break;
                            case 4:
                                System.out.println("Dados do livro devolvido: \n " + locacao2.getLivro().toString() +
                                     "\n multa:" + locacao2.getValorMulta());
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida \n Digite novamente");
                        }

                    } while (opcao != 5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida \n Digite novamente");

            }
        } while (opcao != 0);
    }
}