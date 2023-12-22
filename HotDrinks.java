public class HotDrinks extends Product{
    private int temperature;
    public HotDrinks(String name, int cost, int temperature) {
        super(name, cost);
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
        return "HotDrinks{" +
                "name=" + super.getName() +
                ";cost=" + super.getCost() +
                ";temperature=" + temperature +
                '}';
    }
}