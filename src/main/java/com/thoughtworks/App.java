package com.thoughtworks;

import com.thoughtworks.game.Game;
import com.thoughtworks.game.GameAnswer;
import com.thoughtworks.readfile.ReadAnswerFromFile;

public class App {
    public static void main(String[] args) {
        ReadAnswerFromFile readAnswerFromFile = new ReadAnswerFromFile();
        readAnswerFromFile.setGameAnswer(".\\src\\main\\resources\\answer.txt");
        GameAnswer gameAnswer = readAnswerFromFile.getGameAnswer();
        System.out.println("游戏开始，请输入4个数字：");
        new Game(6).begin(gameAnswer);
    }
}
