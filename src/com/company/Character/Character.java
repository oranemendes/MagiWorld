package com.company.Character;

public abstract class Character {
    protected int level = 0;
    protected int hp = 0;
    protected int strength = 0;
    protected int agility = 0;
    protected int intelligence = 0;
    protected int damages = 0;

    public Character(int level, int hp, int strength, int agility, int intelligence, int damages) {
        this.level = level;
        this.hp = hp;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.damages = damages;
    }

    public void getDamages(){
        this.hp -= damages;
    }

    public abstract int BasicCapacity();
    public abstract int SpecialCapacity();

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
