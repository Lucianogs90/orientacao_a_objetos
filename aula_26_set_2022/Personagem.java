package aula_26_set_2022;

import java.util.Random;

public class Personagem{
    private String startName = "Hero";
    public String finalName = "Super Hero";
    protected int hp = 8000;
    protected int atk = 500;
    protected int def = 300;
    protected int spd = 50;
    public double critRate = 0.15;
    public double critDmg = 0.5;
    private int finalDamage = 0;
    
    public double dashRate = 0.15;

    public Personagem(){
        
    }

    public Personagem(String startName, int hp, int atk, int def, int spd) {
        this.startName = startName;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public String getFinalName() {
        return finalName;
    }

    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
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

    public double getDashRate() {
        return dashRate;
    }

    public void setDashRate(double dashRate) {
        this.dashRate = dashRate;
    }

    public int getFinalDamage() {
        return finalDamage;
    }

    public void setFinalDamage(int finalDamage) {
        this.finalDamage = finalDamage;
    }

    public int causeDamage(Personagem enemy){
        Random rng = new Random();

        int basicDamage = this.atk;

        if(rng.nextDouble() < this.critRate){
            basicDamage = (int) Math.round(this.atk * (1.0 + this.critDmg));
        }

        this.finalDamage = basicDamage - ((basicDamage * enemy.getDef()) / (enemy.getDef() + 700));

        enemy.receiveDamage(this);

        return this.finalDamage;
    }

    public int receiveDamage(Personagem enemy){
        Random rng = new Random();
        
        int realDamage = enemy.finalDamage;

        if(rng.nextDouble() < this.dashRate){
            System.out.println(this.finalName + " se esquivou e recebeu apenas metade do dano!");

            realDamage *= 0.5;
        }

        this.hp -= realDamage;

        return realDamage;
    }
}