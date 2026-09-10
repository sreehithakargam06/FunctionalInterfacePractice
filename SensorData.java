public class SensorData{
    private double temperature;
    private double humidity;

    public SensorData(double temperature,double humidity){
    this.temperature=temperature;
    this.humidity=humidity;
    }
    public double getTemperature(){
        return temperature;
    }
    public double getHumidity(){
        return humidity;
    }
    public void setTemperature(double temperature){
        this.temperature=temperature;
    }
    public void setHumidity(double humidity){
        this.humidity=humidity;
    }
}
