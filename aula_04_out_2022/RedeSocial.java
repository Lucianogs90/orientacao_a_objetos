package aula_04_out_2022;

public class RedeSocial {
    
    public class Usuario{
        public int id;
        public String nome;
        public Usuario amigos[][] = new Usuario[1][1];
        
        public Usuario(int id, String nome){
            this.id = id;
            this.nome = nome;
            this.amigos[id][0] = null;
        }

    }
    
    public void addAmigo(int id, String nome){
        
        Usuario novoAmigo = new Amigo(id, nome);

        Usuario novosAmigos[][] = new Usuario[this.id][this.amigos.length + 1];
        
        for (int i = 0; i < this.amigos.length; i++){
            novosAmigos[i] = this.amigos[i];
        }

        novosAmigos[this.amigos.length] = novoAmigo;
    }


}
