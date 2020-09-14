package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses;
    static Hippodrome game;

    public  Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public Hippodrome() {
    }

    public Horse getWinner() {
        Horse winner = null;
        if ((horses.get(0).distance > horses.get(1).distance) && (horses.get(0).distance > horses.get(2).distance)) {

            winner = horses.get(0);
        } else if ((horses.get(1).distance > horses.get(2).distance) && (horses.get(1).distance > horses.get(0).distance)) {

            winner = horses.get(1);
        } else if ((horses.get(2).distance > horses.get(1).distance) && (horses.get(2).distance > horses.get(0).distance)) {

            winner = horses.get(2);
        }
        return winner;
    }
//    Winner is Lucky!

    public void printWinner(){
        System.out.println("Winner is " + getWinner().name+"!");
    }

public void run() throws InterruptedException {
        for(int i=0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
}
public void move(){
        for(int i = 0; i <horses.size();i++){
            horses.get(i).move();
        }
}
public void print(){
        for( int i = 0; i < horses.size(); i++){
            horses.get(i).print();
        }
    for( int x = 0; x < 10; x++){
        System.out.println();
    }
}


    public static void main(String[] args) throws InterruptedException {
        
        horses = new ArrayList<>();
    game = new Hippodrome(horses);
    horses.add(new Horse("Horse 1", 3, 0));
    horses.add(new Horse("Horse 2", 3, 0));
    horses.add(new Horse("Horse 3", 3, 0));

    game.run();
    game.printWinner();

    }

    public List<Horse> getHorses(){
        return this.horses;
    }
    
}
