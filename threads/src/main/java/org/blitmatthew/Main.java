package org.blitmatthew;

import org.blitmatthew.vehicle.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(15);
        Scanner scanner = new Scanner(System.in);

        while (true) {
        //This example of Thread is using the Thread class itself to setup and execute the Thread
        System.out.println("""
                *------------------------------*
                |   Welcome to the car game    |
                |   Goal for the game is to    |
                |   get as far as you can      |
                |   The following is the       |
                |   commands                   |
                | 1) Start the car             |
                | 2) Stop the car              |
                | 3) Speed up                  |
                | 4) Brake                     |
                | 5) Exit                      |
                *------------------------------*
                """);
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    car.start();
                    break;
                case 2:
                    car.stop();
                    break;
                case 3:
                    car.speedUp();
                    break;
                case 4:
                    car.brake();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Need to select an option from above");
            }
        }
    }
}