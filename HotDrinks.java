public class HotDrinks extends Product{
    private int temperature;
    public HotDrinks(String name, int cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int gettemperature() {
        return temperature;
    }


    public void settemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature=" + temperature;
    }
}