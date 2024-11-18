package org.blitmatthew.vehicle;

public class Car {
    private Integer speed;
    private Boolean isOn;
    private final Integer acceleration;
    private Integer milesTraveled;
    private Boolean isMoving;

    public Car(Integer acceleration) {
        this.acceleration = acceleration;
        speed = 0;
        isOn = false;
        isMoving = false;
        milesTraveled = 0;
    }

    public void start() {
        if(isOn) {
            System.out.println("Car " + getClass().getName() + " has already been started");
            return;
        }
        isOn = true;
    }

    public void stop() {
        isOn = false;
        speed = 0;
        isMoving = false;
        System.out.println("You have travelled " + milesTraveled + " miles");
    }

    public void brake() {
        speed -= 5;
        if(speed == 0) {
            isMoving = false;
            System.out.println("You have travelled " + milesTraveled + " miles");
        }
    }

    public void speedUp() {
        if(!isMoving) {
            isMoving = true;
            Thread moving = new Thread(() -> {
                while (isMoving) {
                    milesTraveled += speed;
                    System.out.println("you have travelled " + milesTraveled + " miles, keep going");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            });
            System.out.println(moving.getState());
            moving.start();
            System.out.println(moving.getState());
        }
        speed += acceleration;
    }
}
