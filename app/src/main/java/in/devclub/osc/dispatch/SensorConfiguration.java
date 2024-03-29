package in.devclub.osc.dispatch;

import in.devclub.osc.sensors.Parameters;

/**
 * Created by thomas on 11.11.14.
 */
public class SensorConfiguration {
    private boolean send;
    private int sensorType;
    private String oscParam;
    private float[] currentValues = new float[Parameters.MAX_DIMENSIONS];
    private boolean sendDuplicates;

    public SensorConfiguration() {
    }

    public boolean sendingNeeded(float[] values) {
        // returns true if sendDuplicates is true or values is different than currentValues
        // returns false if send is false
        // AND updates currentValues
        if (!this.send) {
            return false;
        }
        if (sendDuplicates) {
            return true;
        }
        boolean differenceDetected = false;
        for (int i = 0; i < values.length && i < Parameters.MAX_DIMENSIONS; i++) {
            if (Math.abs(values[i] - this.currentValues[i]) != 0) {
                differenceDetected = true;
            }
            this.currentValues[i] = values[i];
        }
        return differenceDetected;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public void setSendDuplicates(boolean sendDuplicates) {
        this.sendDuplicates = sendDuplicates;
    }

    public int getSensorType() {
        return this.sensorType;
    }

    public String getOscParam() {
        return this.oscParam;
    }

    public void setOscParam(String oscParam) {
        this.oscParam = oscParam;
    }

    public void setSensorType(int sensorType) {
        this.sensorType = sensorType;
    }
}
