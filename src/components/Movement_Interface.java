package components;

public interface Movement_Interface {

    //spin the cart is a certain angle (degrees) relative to the arena... based on starting position of cart.
    void spinOnAxis(int toDegree);

    //move forward in meters (negative value for backwards)
    void forwardByDist(int meters);

    void stop();

}
