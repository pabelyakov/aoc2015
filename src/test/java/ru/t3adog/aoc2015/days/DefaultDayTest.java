package ru.t3adog.aoc2015.days;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.t3adog.aoc2015.config.enums.DayNumber;

import static org.junit.jupiter.api.Assertions.*;

class DefaultDayTest {

    private final Day day = new DefaultDay();

    @Test
    @DisplayName("Проверяем результат выполнения первой части")
    void part01() {
        Assertions.assertEquals("part01 result", day.part01());
    }

    @Test
    @DisplayName("Проверяем результат выполнения второй части")
    void part02() {
        Assertions.assertEquals("part02 result", day.part02());
    }

    @Test
    @DisplayName("Проверяем результат получения номера дня")
    void getNumber() {
        Assertions.assertEquals(DayNumber.DAY00, day.getNumber());
    }
}