public class Mamifero extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Um som qualquer de mamífero");
        
    }

    @Override
    public void completarIdade() {
        this.setIdade(this.getIdade() + 1);;        
        System.out.println(this.getIdade());
    }
    

}
