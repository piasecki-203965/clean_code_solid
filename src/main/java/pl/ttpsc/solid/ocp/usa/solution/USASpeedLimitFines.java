package pl.ttpsc.solid.ocp.usa.solution;

public class USASpeedLimitFines {

    private SpeedLimit speedLimit;

    public USASpeedLimitFines(SpeedLimit speedLimit) {
        this.speedLimit = speedLimit;
    }

    public double calcualateSpeedLimitFine(int speed) {

        double fine = 0.0;
        if (speed > speedLimit.getMaxSpeed()) {
            // calculate...
        }
        return fine;
    }

}
