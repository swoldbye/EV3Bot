package components;

import lejos.hardware.motor.Motor;
import lejos.utility.Delay;


public class Movement implements components.Movement_Interface {

    @Override
    public void spinOnAxis(int degrees) {
        Motor.A.setSpeed(120);
        Motor.B.setSpeed(120);
        double deg = (double)degrees * 1.9;

        if(degrees >= 0){  //if counter-clockwise.
            Motor.A.rotate((int)deg, true);
            Motor.B.rotate((int)deg*-1, true);
        }else{              //else clockwise.
            Motor.A.rotate((int)deg*-1, true);
            Motor.B.rotate((int)deg, true);
        }
    }

    @Override
    public void forwardByDist(int cm) {
        double cmPerDeg = 0.06;
        double deg = cm/cmPerDeg;
        Motor.A.setSpeed(300);
        Motor.B.setSpeed(300);
        if(cm >= 0){    //if forward.
            Motor.A.rotate((int)deg, true);
            Motor.B.rotate((int)deg, true);

        }else{              //else backward.
            Motor.A.rotate((int)deg, true);
            Motor.B.rotate((int)deg, true);
        }
    }

    @Override
    public void backwardByDist(int meters) {
        Motor.A.setSpeed(meters);
        Motor.B.setSpeed(meters);
        Motor.A. backward();
        Motor.B.backward();
        System.out.println(meters);
        Delay.msDelay(2000);
        Motor.A.stop();
        Motor.B.stop();
    }

    @Override
    public void stop() {
        Motor.A.stop();
        Motor.B.stop();
    }
}
