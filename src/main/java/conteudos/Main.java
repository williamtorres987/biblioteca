package conteudos;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Will");
        pessoa.setIdade(17);
        pessoa.setCpf("1234");
        pessoa.setNacionalidade("BR");

        System.out.println(pessoa.toString());
    }
}
