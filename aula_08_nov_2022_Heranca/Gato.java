package aula_08_nov_2022_Heranca;

public class Gato extends Animal{
    private String porte;
    private boolean siames;
    
    public Gato(String nome, String sexo, int idade, String cor, String raca, String porte, boolean siames) {
        super(nome, sexo, idade, cor, raca);
        this.porte = porte;
        this.siames = siames;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public boolean isSiames() {
        return siames;
    }

    public void setSiames(boolean siames) {
        this.siames = siames;
    }

    public void miar(){
        System.out.println("Gato miou!");
    }

    public void ronronar(){
        System.out.println("Gato está gostando do carinho!");
    }
}
