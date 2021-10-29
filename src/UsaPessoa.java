public class UsaPessoa {
    // construtor default para objetos da classe
    // UsaPessoa este construtor existe mesmo se não
    // for explicitamente declarado
    public UsaPessoa() {}
    public static void main(String[] args){
        //Declara objeto pessoa1
        Pessoa pessoa1;
        Pessoa pessoa2;
        //Cria o objeto pessoa1 que é instância da classe
        pessoa1 = new Pessoa();
        pessoa2 = new Pessoa("Joao",20,'M');
        //Define os valores para os atributos de pessoa1
        pessoa1.setNome("Camila");
        pessoa1.setGenero('F');
        pessoa1.setIdade(12);
        System.out.println("O objeto pessoa1 chama-se " + pessoa1.getNome() + ", é do sexo " + pessoa1.getGenero() + ", tem " + pessoa1.getIdade() + " anos e diz: ");
        pessoa1.falar();
        System.out.println("O objeto pessoa2 chama-se " + pessoa2.getNome() + ", é do sexo " + pessoa2.getGenero() + ", tem " + pessoa2.getIdade() + " anos e diz: ");
        pessoa2.falar();
    }
}
