package aula_29_nov_2022_Polimorfismo;

public class Professor extends Funcionario {
    private String especializacao;

    public Professor(){
        super();
    }

    public Professor(String especializacao) {
        super();
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public void trabalhar(){
        System.out.println("O Professor está lecionando!");
    }
}