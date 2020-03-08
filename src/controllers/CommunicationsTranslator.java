package controllers;

import components.Movement;
import components.Movement_Interface;

public class CommunicationsTranslator {

    public void translate(String input){
        Movement_Interface move = new Movement();
        switch (input){
            case "1":
                move.spinOnAxis(180);
                break;
            case "2":
                move.spinOnAxis(360);
                break;
            case "3":
                move.spinOnAxis(90);
                break;
            case "4":
                move.spinOnAxis(-180);
                break;
            case "5":
                move.spinOnAxis(-360);
                break;
            case "6":
                move.spinOnAxis(-90);
                break;
            case "7":
                move.backwardByDist(500);
                break;
            case "8":
                move.backwardByDist(600);
                break;
            case "9":
                move.backwardByDist(700);
                break;
            case "10":
                move.backwardByDist(800);
                break;
            case "11":
                move.backwardByDist(2000);
                break;
            case "0":
                System.exit(0);
        }
    }
}
