package aula_04_out_2022_Desafio_Encapsulamento;

public class Usuario{
    public int id;
    public String nome;
    public Usuario[] amigos = new Usuario[10];

    
    public Usuario(int id, String nome){
        this.id = id;
        this.nome = nome;

    }

    public Usuario[] getAmigos(){
        return this.amigos;
    }

    public Usuario[] sugerirAmigos(Usuario user){
        Usuario sugestao[] = new Usuario[10];
        
        int i = 0;
        for (Usuario amigo : this.amigos) {
            if(amigo != null && amigo.id != user.amigos[i].id){
                sugestao[i] = user.amigos[i];
            }
            i++;
        }

        return sugestao;
    }

        public static void main(String[] args) {
        Usuario p1 = new Usuario(0, "Alice");
        Usuario p2 = new Usuario(1, "Bob");
        Usuario p3 = new Usuario(2, "Dan");
        Usuario p4 = new Usuario(3, "Eve");
        Usuario p5 = new Usuario(4, "Charlie");

        p1.amigos[0] = p2;
        p1.amigos[1] = p3;

        p2.amigos[0] = p4;
        p2.amigos[1] = p5;

        System.out.println(p1.sugerirAmigos(p2)[0].nome);
        System.out.println(p1.sugerirAmigos(p2)[1].nome);       
    }
}