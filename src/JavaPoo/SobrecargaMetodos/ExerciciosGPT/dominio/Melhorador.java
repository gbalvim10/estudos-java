package JavaPoo.SobrecargaMetodos.ExerciciosGPT.dominio;

public class Melhorador {
        private String nome;
        private String tipo;
        private int ano_lancamento;
        private double preco;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }


    public void init (String nome){
            this.nome = nome;
    }

     public void init (String nome, String tipo){
            this.init (nome);
            this.tipo = tipo;
     }

     public void init (String nome, String tipo, int ano_lancamento){
            this.init(nome, tipo);
            this.ano_lancamento = ano_lancamento;
     }

     public void init (String nome, String tipo, int ano_lancamento, double preco){
            this.init(nome, tipo, ano_lancamento);
            this.preco = preco;
     }

     public void imprimir() {
         System.out.println("Nome: " + nome);
         System.out.println("Tipo: " + tipo);
         System.out.println("Ano Lancamento: " + ano_lancamento);
         System.out.println("Preço: " + preco);
         System.out.println("\n");
     }
}

