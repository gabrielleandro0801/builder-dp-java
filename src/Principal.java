public class Principal {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa.PessoaBuilder("Gabriel", "SP")
                .setIdade(19)
                .build();
        System.out.println("Objeto: " + pessoa.toString());
    }
}
