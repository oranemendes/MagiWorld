package com.company.Character;

public class Prowler extends Character {

    private String type = "Rôdeur";
    private String basicAttack = "Tir à l'arc";
    private String specialAttack = "Concentration";

    public Prowler(int level, int hp, int strength, int agility, int intelligence, int damages, String type,
                   String basicAttack, String specialAttack) {
        super(level, hp, strength, agility, intelligence, damages);
        this.type = type;
        this.basicAttack = basicAttack;
        this.specialAttack = specialAttack;
    }

    @Override
    public int BasicCapacity(){
        this.damages = this.agility;
        return damages;
    }

    @Override
    public int SpecialCapacity() {
        this.agility += this.level/2;
    }
}
