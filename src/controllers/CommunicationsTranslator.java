package controllers;

import components.Movement;
import components.Movement_Interface;

public class CommunicationsTranslator {

    public void translate(String input){
        Movement_Interface move = new Movement();
        switch (input){
            case "1":
                move.forwardByDist(2000);
                break;

            case "2":
                move.spinOnAxis(2000);
                break;
            case "0":
                System.exit(0);
        }
    }
}
