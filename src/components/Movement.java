package components;

import lejos.hardware.motor.Motor;
import lejos.utility.Delay;


public class Movement implements components.Movement_Interface {

    @Override
    public void spinOnAxis(int toDegree) {
        Motor.A.forward();
        Motor.B.backward();
        Motor.A.setSpeed(1000);
        Motor.B.setSpeed(1000);
        Delay.msDelay(toDegree);
        Motor.A.stop();
        Motor.B.stop();
    }

    @Override
    public void forwardByDist(int meters) {
        Motor.A.forward();
        Motor.B.forward();
        Motor.A.setSpeed(10000);
        Motor.B.setSpeed(10000);
        Delay.msDelay(meters);
        Motor.A.stop();
        Motor.B.stop();
    }

    @Override
    public void stop() {
        Motor.A.stop();
        Motor.B.stop();
    }
}
