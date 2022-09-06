package aula_05_set_2022;

public class Lapiseira {
	
	public String marca;
	protected float tamanhoGrafite;
	private String tipoGrafite;
	public String cor;
	public boolean carregada;
	
	public void carregar() {
		this.carregada = true;
        System.out.println("Lapiseira carregada!");
	}
	
	public void descarregar() {
		this.carregada = false;
        System.out.println("Lapiseira descarregada!");
	}
	
	public void escrever(int palavras) {
		while(palavras > 0 && carregada){
            System.out.println("Lapiseira escrevendo!");
            palavras--;
        }
	}

    public void mudarPonta(String tipo){
        this.tipoGrafite = tipo;
        System.out.println("Grafite mudado para tipo " + tipo);
    }

}
