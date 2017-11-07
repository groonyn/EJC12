package com.epam.hw4;

public class TEMP {
    private String name;
    private int balance = 1000;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }


    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }+

    class Ippodrom {

        List<Horses> horses = new ArrayList<>();
    horses.add(new Horse("Nick", 10)); // 99 -> 109
    horses.add(new Horse("Iurii", 100)); // 8 -> 108
        // 99 // 5 -> 104


        public void run(List<Horse> horses) {


            Random random = new Random();


            for (Horse horse : horses) {


                int delta = random.nextInt(100);

                horse.setSpeed(horse.getSpeed() + delta);


            }

        [104, 108, 109] -> Nick -> ------------





                    horse.getMaxValue() -> 109 -> Nick



        }






|}
}
