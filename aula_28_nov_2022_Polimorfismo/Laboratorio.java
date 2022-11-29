public class Laboratorio {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.setNome("Lulu");
        m.setIdade(0);
        m.setPeso(2);

        m.emitirSom();
        m.completarIdade();

        Baleia b = new Baleia();
        b.setNome("Bolinha");
        b.setIdade(39);
        b.setPeso(2);

        b.emitirSom();
        b.completarIdade();

        Cachorro c = new Cachorro();
        c.setNome("Icaru");
        c.setIdade(2);
        c.setPeso(2);

        c.emitirSom();
        c.completarIdade();
        c.reagir();
        c.reagir(true);
    }
}