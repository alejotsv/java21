public class MarsRobot {

    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature < -80) {
            setStatus("returning home");
            setSpeed(5);
        }
    }

    void showAttributes() {
        System.out.println("Status: " + getStatus());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Temperature: " + getTemperature());
    }

//    Getters and setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
