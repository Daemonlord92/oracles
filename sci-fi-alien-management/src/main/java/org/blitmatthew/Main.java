package org.blitmatthew;

import org.blitmatthew.entity.Alien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alien[] aliens = new Alien[20];
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("""
                    *==========Horrorcore-Software==========*
                    |   Welcome to the Alien Management     |
                    |         System                        |
                    | The following options are available   |
                    | for use                               |
                    | 1) Display all Registered Aliens      |
                    | 2) Register Alien                     |
                    | 3) Delete Alien Record                |
                    | 4) Update Alien Record                |
                    *=======================================*
                    """);
            int answer = scanner.nextInt();

            switch(answer) {
                case 1:
                    for(Alien alien : aliens) {
                        System.out.println(alien);
                    }
                    break;
                case 2:
                    Alien newAlien = new Alien();
                    System.out.println("Please input a numerical Id");
                    newAlien.setId(scanner.nextLong());
                    scanner.nextLine();
                    System.out.println("Please input a name for the newAlien");
                    newAlien.setName(scanner.nextLine());
                    System.out.println("Please input a species type");
                    newAlien.setSpecies(scanner.nextLine());
                    System.out.println("Please input a weight for the newAlien");
                    newAlien.setWeight(scanner.nextDouble());
                    System.out.println("Please input a height for the newAlien");
                    newAlien.setHeight(scanner.nextDouble());
                    for (int i = 0; i < aliens.length; i++) {
                        if(aliens[i] == null){
                            aliens[i] = newAlien;
                            break;
                        }
                    }
                    break;
                case 3:
                    for(Alien alien : aliens) {
                        if(alien != null){
                            System.out.println(alien);
                        }
                    }
                    System.out.println("Which newAlien would you like to delete?");
                    System.out.println("(Please insert the id of the newAlien)");
                    long alienToDelete = scanner.nextLong();
                    for (int i = 0; i < aliens.length; i++) {
                        try {
                            if(aliens[i].getId().equals(alienToDelete)){
                                aliens[i] = null;
                                break;
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Error has occurred, The object you are trying to access is null");
                        }
                    }
                    break;
                case 4:
                    for(Alien alien : aliens) {
                        if(alien != null){
                            System.out.println(alien);
                        }
                    }
                    System.out.println("Which Alien would you like to update?");
                    System.out.println("(Please insert the id of the alien)");
                    long alienToBeUpdated = scanner.nextLong();
                    Alien oldAlienInformation = null;
                    for (int i = 0; i < aliens.length; i++) {
                        try {
                            if(aliens[i].getId().equals(alienToBeUpdated)){
                                oldAlienInformation = aliens[i];
                                break;
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Error has occurred, The object you are trying to access is null");
                        }
                    }
                    System.out.println("Current name: "
                            .concat(oldAlienInformation.getName())
                            .concat(" \n Would you like to update this?"));
                    scanner.nextLine();
                    String yesNo = scanner.nextLine();
                    if(yesNo.equalsIgnoreCase("yes")) {
                        oldAlienInformation.setName(scanner.nextLine());
                    }
                    System.out.println("Current species: "
                            .concat(oldAlienInformation.getSpecies())
                            .concat(" \n Would you like to update this?"));
                    yesNo = scanner.nextLine();
                    if(yesNo.equalsIgnoreCase("yes")) {
                        oldAlienInformation.setSpecies(scanner.nextLine());
                    }
                    System.out.println("Current weight: "
                            .concat(String.valueOf(oldAlienInformation.getWeight()))
                            .concat(" \n Would you like to update this?"));
                    scanner.nextLine();
                    yesNo = scanner.nextLine();
                    if(yesNo.equalsIgnoreCase("yes")) {
                        oldAlienInformation.setWeight(scanner.nextDouble());
                    }
                    System.out.println("Current height: "
                            .concat(String.valueOf(oldAlienInformation.getHeight()))
                            .concat(" \n Would you like to update this?"));
                    scanner.nextLine();
                    yesNo = scanner.nextLine();
                    if(yesNo.equalsIgnoreCase("yes")) {
                        oldAlienInformation.setHeight(scanner.nextDouble());
                    }
                    for (int i = 0; i < aliens.length; i++) {
                        try {
                            if(aliens[i].getId().equals(alienToBeUpdated)){
                                aliens[i] = oldAlienInformation;
                                break;
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Error has occurred, The object you are trying to access is null");
                        }
                    }
                    break;

                default:
                    System.out.println("Please select an option from the menu");
            }
        }
    }
}