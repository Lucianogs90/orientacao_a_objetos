public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au!");
    }

    public void reagir(Boolean dono){
        if(dono){
            System.out.println("Cão dócil");
        } else{
            System.out.println("Cão bravo");
        }
    }

    public void reagir(){
        if(this.getIdade() <= 3 && this.getPeso() < 3){
            System.out.println("Brincar e pular");
        } else{
            System.out.println("Ignorar e deitar");
        }
    }
}
