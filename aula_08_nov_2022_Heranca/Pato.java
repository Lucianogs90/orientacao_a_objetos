package aula_08_nov_2022_Heranca;

public class Pato extends Animal {
    private String corPena;

    public Pato(String nome, String sexo, int idade, String cor, String raca, String corPena) {
        super(nome, sexo, idade, cor, raca);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void grasnar(){
        System.out.println("O pato está falando!");
    }

    public void andar(){
        System.out.println("O pato está andando...");
    }

    public void voar(){
        System.out.println("Wow! O pato está voando!");
    }

    public void nadar(){
        System.out.println("Eita! Ele também nada!");
    }
}
