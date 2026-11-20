package JavaPoo.SobrecargaMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int ano_lancamento;
    private int preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public void init(String nome, String tipo, int ano_lancamento) {
       this.nome = nome;
       this.tipo = tipo;
       this.ano_lancamento = ano_lancamento;
    }

    public void init (String nome, String tipo, int ano_lancamento, int preco) {
        this.init(nome, tipo, ano_lancamento);
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ano lancamento: " + ano_lancamento);
        System.out.println("Preco: " + preco);
    }
}
