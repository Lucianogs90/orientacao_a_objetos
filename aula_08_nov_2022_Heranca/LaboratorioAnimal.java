package aula_08_nov_2022_Heranca;

public class LaboratorioAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Gordon", "macho", 03, "amarelo", "paraguaio");
        Cachorro cachorro = new Cachorro("Tashaisa", "feminino", 2, "caramelo", "RND", "pequeno");
        Gato gato = new Gato("Nebulosa", "fêmea", 3, "preta", "RND", "pequeno", false);
        Pato pato = new Pato("João Amadeu", "macho", 4, "cinza", "yankee", "branco com cinza");

        animal.fazerAniversario();
        System.out.println(animal.getNome());
        System.out.println(animal.getIdade());
        System.out.println("------------------------------------");

        cachorro.fazerAniversario();
        System.out.println("O nome do cachorro é " + cachorro.getNome() + ".");
        System.out.println(cachorro.getNome() + " tem " + cachorro.getIdade() + " anos de idade");
        System.out.println("------------------------------------");

        gato.fazerAniversario();
        System.out.println("Meu gato " + gato.getSexo() + " se chama " + gato.getNome() + " e é todo " + gato.getCor());
        gato.respirar();
        System.out.println("------------------------------------");

        pato.fazerAniversario();
        pato.evacuar();
        System.out.println("O nome deste " + pato.getClass() + " é " + pato.getNome());
    }
}
