package com.company.Character;

public class Character {
    protected String type;
    public int level;
    public int hp;
    protected int strength;
    public int agility;
    public int intelligence;
    public String basicAttackName;
    public String specialAttackName;

    /**
     * The basic attack of the character
     */
    public void basicAttack(){
    }

    /**
     * The special attack of the character
     */
    public void specialAttack(){
    }

    public void getDamages(){

    }

    public void setDamages() {

    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public String getBasicAttackName() {
        return basicAttackName;
    }

    public String getSpecialAttackName() {
        return specialAttackName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
