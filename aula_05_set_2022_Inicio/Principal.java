package aula_05_set_2022_Inicio;

public class Principal {
    public static void main(String[] args) {
        Lapiseira l1 = new Lapiseira();

        l1.marca = "Pilot";
        l1.tamanhoGrafite = 0.5f;
        l1.cor = "Vermelha";
        l1.carregada = true;
        // l1.tipoGrafite = "HB";

        
        l1.escrever(3);

        l1.mudarPonta("HB");
    }    

}
