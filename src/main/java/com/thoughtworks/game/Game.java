package com.thoughtworks.game;

import java.util.Scanner;

public class Game {
    int chances;

    public Game(int chances) {
        this.chances = chances;
    }

    public void begin(GameAnswer gameAnswer) {
        String res = "";
        for (int i = 0; i < this.chances; i++) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (gameAnswer.compareWithGameAnswer(input).length() == 0) {
                System.out.println("Congratulations, you win!");
                break;
            }
            if (gameAnswer.compareWithGameAnswer(input).length() != 4) {
                i -= 1;
            }
            res += input + "\t" + gameAnswer.compareWithGameAnswer(input) + "\n";
            System.out.print(res);
            if (i == this.chances - 1) {
                System.out.println("Unfortunately, you have no chance, the answer is " + gameAnswer + "!");
            }
        }
    }
}
