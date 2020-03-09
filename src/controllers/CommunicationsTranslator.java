package controllers;

import components.Movement;
import components.Movement_Interface;
import org.json.JSONObject;

public class CommunicationsTranslator {

    public void translate(String input){

        Movement_Interface move = new Movement();
        JSONObject json = new JSONObject(input);

        switch (json.getString("method")){
            case "1":   //lateral movement
                move.forwardByDist(Integer.parseInt(json.getString("param")));
                break;
            case "2":   //spin movement
                move.spinOnAxis(Integer.parseInt(json.getString("param")));
                break;
            case "0":
                System.exit(1);
        }
    }
}
