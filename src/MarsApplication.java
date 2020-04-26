class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.setStatus("exploring");
        spirit.setSpeed(2);
        spirit.setTemperature(-60);

        spirit.showAttributes();

        while(spirit.getTemperature()>-90){
            System.out.println("Decreasing temperature by 10 degrees");
            spirit.temperature -= 10;
            spirit.checkTemperature();
            spirit.showAttributes();
            System.out.println("---------------------------");
            }

    }
}
