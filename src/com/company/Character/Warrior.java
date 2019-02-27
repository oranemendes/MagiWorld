package com.company.Character;

public class Warrior extends Character {
    String type = "Warrior";
    String basicAttackName = "Coup d'épée";
    String specialAttackName = "Coup de rage";

    /**
     * Do damages equals to player's strength
     */
    @Override
    public void basicAttack(String basicAttackName) {

    }

    /**
     * Do damages equals to twice player's strentgh ; make player looses half of his hp
     */
    @Override
    public void specialAttack(String specialAttackName) {

    }
}
