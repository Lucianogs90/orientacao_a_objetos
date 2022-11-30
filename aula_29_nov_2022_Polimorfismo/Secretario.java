package aula_29_nov_2022_Polimorfismo;

public class Secretario extends Funcionario {
    public Secretario() {
        super();
    }

    @Override
    public void trabalhar(){
        System.out.println("O Secretário está trabalhando!");
    }
}
