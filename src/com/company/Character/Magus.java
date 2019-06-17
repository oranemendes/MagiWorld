package com.company.Character;

public class Magus extends Character {

    private String type = "Mage";
    private String basicAttack = "Boule de feu";
    private String specialAttack = "Soin";

    public Magus(int level, int hp, int strength, int agility, int intelligence, int damages,
                 ) {
        super(level, hp, strength, agility, intelligence, damages);
        this.type = type;
        this.basicAttack = basicAttack;
        this.specialAttack = specialAttack;
    }

    @Override
    public int BasicCapacity() {
        this.damages = this.intelligence;
        return damages;
    }

    @Override
    public int SpecialCapacity() {
        this.hp += this.intelligence*2;
        return hp;
    }
}
