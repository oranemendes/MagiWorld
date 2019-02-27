package com.company;

import java.util.Scanner;

public class Choice {
    Scanner sc = new Scanner(System.in);

    /**
     * Display all characters available
     */
    public int createCharacters(){
        int player = sc.nextInt();
        switch (player) {
            case 1 :
                System.out.println("Création du personnage du joueur 1");
                break;
            case 2 :
                System.out.println("Création du personnage du joueur 2");
                break;
            default:
                System.out.println("Veuillez sélectionner un joueur (1 ou 2)");
                break;
        }
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage");
        int characterChoice = sc.nextInt();
        System.out.println("Niveau du personnage ?");
        int levelChoice = sc.nextInt();
        System.out.println("Force du personnage ?");
        int strengthChoice = sc.nextInt();
        System.out.println("Agilité du personnage ?");
        int agilityChoice = sc.nextInt();
        System.out.println("Intelligence du personnage ?");
        int intelligenceChoice = sc.nextInt();
        System.out.println("Je suis le " + characterChoice + " Joueur " + player + " niveau " + levelChoice + " je possède "
                + levelChoice*5 + " de vitalité, " + strengthChoice + " de force, " + agilityChoice + " d'agilité et " +
                intelligenceChoice + " d'intelligence !");
    }
}
