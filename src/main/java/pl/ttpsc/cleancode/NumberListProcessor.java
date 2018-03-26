package pl.ttpsc.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumberListProcessor {

    private Map<Integer, Integer> numbersCounts = new HashMap<>();
    private int maxValue = Integer.MIN_VALUE;
    private int minValue = Integer.MAX_VALUE;

    public NumberListProcessor(List<Integer> numberList) {
        for (Integer number : numberList) {
            processNewNumber(number);
        }
    }

    private void processNewNumber(Integer number) {
        updateCounts(number);
        updateMinValue(number);
        updateMaxValue(number);
    }

    private void updateCounts(Integer number) {
        if (numbersCounts.containsKey(number)) {
            Integer count = numbersCounts.get(number);
            numbersCounts.put(number, count + 1);
        } else {
            numbersCounts.put(number, 1);
        }
    }

    private void updateMinValue(Integer number) {
        if (number < minValue) {
            minValue = number;
        }
    }

    private void updateMaxValue(Integer number) {
        if (number > maxValue) {
            maxValue = number;
        }
    }

    public int getCountOf(int number) {
        return numbersCounts.getOrDefault(number, 0);
    }

    public double weightedMean() {
        double weightedSum = 0.0;
        double sumOfWeights = 0.0;
        for (Entry<Integer, Integer> entry : numbersCounts.entrySet()) {
            sumOfWeights += entry.getValue();
            weightedSum += entry.getKey() * entry.getValue();
        }
        return weightedSum / sumOfWeights;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }
}