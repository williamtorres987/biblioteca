package projbiblioteca;

public class Locacao {

    private double valorLocacao;
    private double valorMulta;
    private Funcionario funcionario;
    private Usuario usuario;
    private Livro livro;
    private Livro livroLocado;

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getLivroLocado() {
        return livroLocado;
    }

    public void setLivroLocado(Livro livroLocado) {
        this.livroLocado = livroLocado;
    }
}
