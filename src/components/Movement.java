package components;

import lejos.hardware.motor.Motor;
import lejos.utility.Delay;


public class Movement implements components.Movement_Interface {

    @Override
    public void spinOnAxis(int toDegree) {
        Motor.A.setSpeed(120);
        Motor.B.setSpeed(120);
        double deg = (double)toDegree * 1.95;

        if(toDegree >= 0){
            Motor.A.rotate((int)deg, true);
            Motor.B.rotate((int)deg*-1, true);
        }else{
            Motor.A.rotate((int)deg*-1, true);
            Motor.B.rotate((int)deg, true);
        }
    }

    @Override
    public void forwardByDist(int meters) {
        Motor.A.setSpeed(meters);
        Motor.B.setSpeed(meters);
        Motor.A.forward();
        Motor.B.forward();
        System.out.println(meters);
        Delay.msDelay(2000);
        Motor.A.stop();
        Motor.B.stop();
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
