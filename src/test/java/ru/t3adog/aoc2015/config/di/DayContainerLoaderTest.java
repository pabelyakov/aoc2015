package ru.t3adog.aoc2015.config.di;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ru.t3adog.aoc2015.config.enums.DayNumber;
import ru.t3adog.aoc2015.days.Day;

import java.util.Map;


class DayContainerLoaderTest {
    @Test
    @DisplayName("Проверяеет, что контейнер загружает базовый класс")
    public void shouldDayContainerIsWork() {
        Map<DayNumber, Day> dayContainer = DayContainerLoader.getDayContainer();
        Assertions.assertNotNull(dayContainer.get(DayNumber.DAY00));
    }

}