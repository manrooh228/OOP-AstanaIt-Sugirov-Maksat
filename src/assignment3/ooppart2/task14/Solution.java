package assignment3.ooppart2.task14;

public class Solution {
    public static void showWeather(City city) {
        System.out.println("In the city of " + city.getName() + " today, the temperature is " + city.getTemperature());
    }

    public static void main(String[] args) {
        City dubai = new City("Dubai", 40); // Create a City object
        showWeather(dubai); // Call showWeather with the City object
    }
}
