package aula_08_nov_2022_Heranca;

public class Cachorro extends Animal{
    private String porte;
     
    public Cachorro(String nome, String sexo, int idade, String cor, String raca, String porte) {
        super(nome, sexo, idade, cor, raca);
        this.porte = porte;
    }
    
    public void latir(){
        System.out.println("Cachorro latiu!");
    }

    public void morder(){
        System.out.println("Cachorro mordeu!");
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

}