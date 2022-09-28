package aula_26_set_2022;

public class Principal {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem("Enemy", 3000, 1300, 2000, 50);

        p2.def = 500;

        p1.setStart_name("Slime");
        p1.final_name = "Slime Master";
        p1.setAtk(2200);
        p1.critRate = 0.5;
        p1.setCritDmg(1.5);
        p1.causeDamage(p2);

        System.out.println("novo hp do Enemy = " + p2.hp);
    }
}
