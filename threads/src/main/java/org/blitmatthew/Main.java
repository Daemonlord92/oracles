package org.blitmatthew;

import org.blitmatthew.vehicle.Car;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car(15);
        Scanner scanner = new Scanner(System.in);

//        while (true) {
//        //This example of Thread is using the Thread class itself to setup and execute the Thread
//        System.out.println("""
//                *------------------------------*
//                |   Welcome to the car game    |
//                |   Goal for the game is to    |
//                |   get as far as you can      |
//                |   The following is the       |
//                |   commands                   |
//                | 1) Start the car             |
//                | 2) Stop the car              |
//                | 3) Speed up                  |
//                | 4) Brake                     |
//                | 5) Exit                      |
//                *------------------------------*
//                """);
//            int input = scanner.nextInt();
//            switch (input) {
//                case 1:
//                    car.start();
//                    break;
//                case 2:
//                    car.stop();
//                    break;
//                case 3:
//                    car.speedUp();
//                    break;
//                case 4:
//                    car.brake();
//                    break;
//                case 5:
//                    System.exit(0);
//                default:
//                    System.out.println("Need to select an option from above");
//            }
//        }

//        ResourceMiner crystal = new ResourceMiner("Crystal");
//        ResourceMiner vespeneGas = new ResourceMiner("Vespene Gas");
//        while (true) {
//            System.out.println("""
//                    *-------------------------------*
//                    | Welcome to the Mining Game    |
//                    | Here we'll mine a couple      |
//                    | resources. Here is the        |
//                    | following options             |
//                    | c) Access Crystal Miner       |
//                    | v) Access Vespene Miner       |
//                    | e) Exit the Program           |
//                    *-------------------------------*
//                    |Mining Options                 |
//                    | mine) starts the mining process|
//                    | done) Interrupts the process  |
//                    | back) Go back to main menu    |
//                    *-------------------------------*
//                    """);
//            String input = scanner.nextLine();
//            switch (input) {
//                case "c":
//                    input = scanner.nextLine();
//                    switch (input) {
//                        case "mine":
//                            crystal.setMining(true);
//                            crystal.setInput(input);
//                            crystal.start();
//                            break;
//                        case "done":
//                            crystal.setInput(input);
//                            break;
//                        case "back":
//                            break;
//                    }
//                    break;
//                case "v":
//                    input = scanner.nextLine();
//                    switch (input) {
//                        case "mine":
//                            vespeneGas.setMining(true);
//                            vespeneGas.setInput(input);
//                            vespeneGas.start();
//                            break;
//                        case "done":
//                            vespeneGas.setInput(input);
//                            break;
//                        case "back":
//                            break;
//                    }
//                    break;
//                case "e":
//                    System.exit(0);
//                default:
//                    System.out.println("Please input c or v or e");
//                    break;
//            }
//        }

//        Runnable thread1 = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(Thread.currentThread().getName() + " - " + i + " - " + LocalTime.now());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        };
//
//        Thread runner = new Thread(thread1, "Thread - 1");
//        Thread runner2 = new Thread(thread1, "Thread - 2");
//        runner.start();
//        runner2.start();
//
//        Counter counter = new Counter();
//        CounterThread counterThread = new CounterThread(counter);
//        CounterThread counterThread1 = new CounterThread(counter);
//
//        counterThread.start();
//        counterThread1.start();

//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Future<Integer> future = executorService.submit(new ExampleCallable());
//        try {
//            System.out.println("Results: " + future.get());
//        } catch (ExecutionException | InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += 1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return sum;
        });

        try {
            System.out.println("Results: " + future.get());
        } catch (ExecutionException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}