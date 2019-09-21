package com.factory.util;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import com.fare.strategy.FareStrategy;
import com.fare.strategy.WeekDayFareStrategy;
import com.fare.strategy.WeekendFareStrategy;

public class FareStrategyFactory {
static final FareStrategy weekendFareStrategy=new WeekendFareStrategy();

static final FareStrategy weekDayFareStrategy=new WeekDayFareStrategy();

	
	public static FareStrategy getFareStrategy(LocalDateTime localDateTime) {
		if(localDateTime.getDayOfWeek()==DayOfWeek.SATURDAY ||  localDateTime.getDayOfWeek()==DayOfWeek.SUNDAY ) {
			return weekendFareStrategy;
		}else {
			return weekDayFareStrategy;
		}
	}
}
