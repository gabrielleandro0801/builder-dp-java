public class Pessoa {
    private String nome;
    private int idade;
    private String estado;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEstado() {
        return estado;
    }

    private Pessoa(PessoaBuilder builder){
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.estado = builder.estado;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + idade +
                ", estado='" + estado + '\'' +
                '}';
    }

    public static class PessoaBuilder {
        private String nome;
        private int idade;
        private String estado;

        public PessoaBuilder(String nome, String estado){
            this.nome = nome;
            this.estado = estado;
        }

        public PessoaBuilder setIdade(int idade){
            this.idade = idade;
            return this;
        }

        public Pessoa build(){
            Pessoa pessoa = new Pessoa(this);
            return pessoa;
        }
    }
}
