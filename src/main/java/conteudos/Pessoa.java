package conteudos;

public class Pessoa {

    String nome;
    int idade;
    String cpf;
    String nacionalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    //toString estrutura a saída dos nossos dados

    @Override
    public String toString() {
        return "\n"
                + "nome: " + nome + "\n"
                + "idade: " + idade + "\n"
                + "cpf: " + cpf + "\n"
                + "nacionalidade: " + nacionalidade + "\n";
    }
}
