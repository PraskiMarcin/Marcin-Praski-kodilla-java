package com.kodilla.testing.weather.mock;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double average(){
        Double sum = 0.0;

        Collection<Double> temperatures = this.temperatures.getTemperatures().values();
        for(Double temperature: temperatures){
            sum+= temperature;
        }

        return sum / temperatures.size();
    }

    public Double median(){
        Collection<Double> temperatures = this.temperatures.getTemperatures().values();
        List <Double> sortedTemperatures = new ArrayList<>(temperatures);
        sortedTemperatures.sort(Comparator.naturalOrder()); // by https://stackoverflow.com/a/38207945

        if (sortedTemperatures.size()%2== 1){
            int pos = (sortedTemperatures.size() - 1) / 2;
            return sortedTemperatures.get(pos);
        }

        int pos = sortedTemperatures.size() / 2;
        double sum = sortedTemperatures.get(pos) + sortedTemperatures.get(pos - 1);
        return sum / 2;
    }
}