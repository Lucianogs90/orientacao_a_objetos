package aula_08_nov_2022_Heranca;

public class Animal {
    private String nome;
    private String sexo;
    private int idade;
    private String cor;
    private String raca;

    public Animal(String nome, String sexo, int idade, String cor, String raca) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cor = cor;
        this.raca = raca;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void alimentar() {
        System.out.println("Animal se alimentou");
    }

    public void locomover() {
        System.out.println("Animal se locomoveu");
    }

    public void respirar() {
        System.out.println("Animal respirou");
    }

    public void evacuar() {
        System.out.println("Animal fez cocozinho!");
    }

    public void acasalar(Animal parceiro) {
        System.out.println("Animal se acasalou com seu parceiro " + parceiro.getNome());
    }

    public Animal reproduzir() {
        System.out.println("Animal se reproduziu");
        return new Animal();
    }

    public void fazerAniversario(){
        this.idade++;
    }
}
