package pl.ttpsc.solid.dip.weathertracker.solution;

public class Phone implements WeatherAlertGenerator {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
