public class Pessoa {
    private String nome;
    private int idade;
    private char genero;
    public Pessoa() { }
    public Pessoa(String n, int i, char g){
        this.nome = n;
        this.idade = i;
        this.genero = g;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setGenero(char g)
    {
        this.genero = g;
    }
    public void setIdade(int i)
    {
        this.idade = i;
    }
    public String getNome()
    {
        return nome;
    }
    public char getGenero()
    {
        return genero;
    }
    public int getIdade()
    {
        return idade;
    }
    public void falar() {
        System.out.println("olá tudo bem?");
    }
}

