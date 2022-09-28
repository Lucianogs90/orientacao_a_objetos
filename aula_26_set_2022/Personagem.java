package aula_26_set_2022;

import java.util.Random;

public class Personagem{
    private String start_name = "Slime";
    public String final_name = "Slime King";
    protected int hp = 1000;
    protected int atk = 500;
    protected int def = 300;
    protected int spd = 50;
    public double critRate = 0.15;
    public double critDmg = 0.5;
    
        
    public Personagem(){
        
    }

    public Personagem(String start_name, int hp, int atk, int def, int spd) {
        this.start_name = start_name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    public String getStart_name() {
        return start_name;
    }

    public void setStart_name(String start_name) {
        this.start_name = start_name;
    }

    public String getFinal_name() {
        return final_name;
    }

    public void setFinal_name(String final_name) {
        this.final_name = final_name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public double getCritRate() {
        return critRate;
    }

    public void setCritRate(double critRate) {
        this.critRate = critRate;
    }

    public double getCritDmg() {
        return critDmg;
    }

    public void setCritDmg(double critDmg) {
        this.critDmg = critDmg;
    }

    public int causeDamage(Personagem enemy){
        Random rng = new Random();
        int dmg = this.atk;

        if(rng.nextDouble() < this.critRate){
            dmg = (int) Math.round(this.atk * (1 + this.critDmg));
        }

        dmg = dmg * (1-(enemy.def / (enemy.def + 100)));

        System.out.println("dano de " + dmg);

        enemy.hp -= dmg;

        return dmg;
    }

}