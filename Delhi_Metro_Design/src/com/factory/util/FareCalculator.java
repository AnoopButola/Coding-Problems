package com.factory.util;

import java.time.LocalDateTime;

import com.fare.strategy.FareStrategy;
import com.problem.model.Station;

public class FareCalculator {

    public double getFare(Station source, Station destination, LocalDateTime localDateTime) {
        FareStrategy fareStrategy = FareStrategyFactory.getFareStrategy(localDateTime);
        int distance = source.distance(destination);

        double fare = distance * fareStrategy.farePerPerson();

        return fare;
    }

}
