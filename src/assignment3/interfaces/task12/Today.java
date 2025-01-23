package assignment3.interfaces.task12;

public class Today implements Weather {
    private String type;

    Today(String type) {
        this.type = type;
    }

    @Override
    public String getWeatherType() {
        return this.type;
    }
    
    @Override
    public String toString() {
        return String.format("Today it will be %s", this.getWeatherType());
    }
}
