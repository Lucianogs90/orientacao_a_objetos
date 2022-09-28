package aula_26_set_2022;

public class Principal {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem("Enemy", 3000, 1300, 2000, 50);

        p2.setFinalName("Karinto");
        p2.def = 600;
        p2.setAgility(0.5);

        p1.setStartName("Slime");
        p1.finalName = "Slime Master";
        p1.setAtk(2200);
        p1.critRate = 0.5;
        p1.setCritDmg(1.5);
        
        System.out.println("Dano do ataque em " + p2.getFinalName() + ": " + p1.causeDamage(p2));

        System.out.println("novo hp de " + p2.getFinalName() + ":" + p2.hp);
    }
}
