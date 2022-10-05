package aula_04_out_2022;

public class RedeSocial {
    
    public class Usuario{
        public int id;
        public String nome;
        public Usuario amigos[][] = new Usuario[][];
        
        public Usuario(int id, String nome){
            this.id = id;
            this.nome = nome;
            this.amigos[this.id][0] = this;
        }

    }
    
    public void addAmigo(int id, String nome){
        
        Usuario novoAmigo = new Amigo(id, nome);

        Usuario novosAmigos[][] = new Usuario[this.id][this.amigos.length + 1];
        
        for (int i = 0; i < this.amigos.length; i++){
            novosAmigos[this.id][i] = this.amigos[this.id][i];
        }

        novosAmigos[this.id][this.amigos.length] = novoAmigo;
    }

    public Usuario[] recomendarAmigos(int max){
        
    }

}
