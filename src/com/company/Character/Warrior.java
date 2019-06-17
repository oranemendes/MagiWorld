package com.company.Character;

public class Warrior extends Character {

    private String type = "Guerrier";
    private String basicAttack = "Coup d'épée";
    private String specialAttack = "Coup de rage";

    public Warrior(int level, int hp, int strength, int agility, int intelligence, int damages, String type,
                   String basicAttack, String specialAttack) {
        super(level, hp, strength, agility, intelligence, damages);
        this.type = type;
        this.basicAttack = basicAttack;
        this.specialAttack = specialAttack;
    }

    @Override
    public int BasicCapacity(){
        this.damages = this.strength;
        return damages;
    }

    @Override
    public int SpecialCapacity(){
        this.damages = this.strength*2;
        this.hp -= this.strength/2;
        return damages;
    }
}
