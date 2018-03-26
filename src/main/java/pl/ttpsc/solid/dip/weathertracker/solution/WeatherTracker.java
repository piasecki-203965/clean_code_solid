package pl.ttpsc.solid.dip.weathertracker.solution;


import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<WeatherAlertGenerator> generators = new ArrayList<>();

    public WeatherTracker() {
        generators.add(new Phone());
        generators.add(new Emailer());
    }

    public void addGenerator(final WeatherAlertGenerator generator) {
        generators.add(generator);
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        this.generateAlerts();
    }

    private void generateAlerts() {
        for (WeatherAlertGenerator generator : generators) {
            generator.generateWeatherAlert(currentConditions);
        }
    }
}
