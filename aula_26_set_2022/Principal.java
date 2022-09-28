package aula_26_set_2022;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem("Enemy", 10000, 1300, 2000, 50);

        p2.setFinalName("Karinto");
        p2.def = 600;
        p2.setAgility(0.5);
        p2.setCritDmg(1.98);
        p2.setCritRate(0.45);

        p1.setStartName("Slime");
        p1.finalName = "Slime Master";
        p1.setAtk(2200);
        p1.critRate = 0.5;
        p1.setCritDmg(1.5);

        Random rng = new Random();
        
       for (int i = 0; i < 10; i++) {
        if(p1.isAlive() && p2.isAlive()){
            if (rng.nextDouble() < 0.5){
              System.out.println(p1.getFinalName()+ " atacou " + p2.getFinalName() + " com dano de: " + p1.causeDamage(p2));
   
              System.out.println("novo hp de " + p2.getFinalName() + ":" + p2.hp + "\n\n");
          } else{
            System.out.println(p2.getFinalName()+ " atacou " + p1.getFinalName() + " com dano de: " + p2.causeDamage(p1));
            
            System.out.println("novo hp de " + p1.getFinalName() + ":" + p1.hp + "\n\n");
          }
        }
       }
    }
}