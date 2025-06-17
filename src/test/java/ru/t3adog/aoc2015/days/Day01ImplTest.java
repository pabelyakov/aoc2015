package ru.t3adog.aoc2015.days;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.t3adog.aoc2015.config.enums.DayNumber;

import static org.junit.jupiter.api.Assertions.*;

class Day01ImplTest {

    @Test
    @DisplayName("День 1. Часть 1. Кейс 1.")
    void part01Case01() {
        Assertions.assertEquals("0", new Day01Impl("(())").part01());
        Assertions.assertEquals("0", new Day01Impl("()()").part01());
    }

    @Test
    @DisplayName("День 1. Часть 1. Кейс 2.")
    void part01Case02() {
        Assertions.assertEquals("3", new Day01Impl("(((").part01());
        Assertions.assertEquals("3", new Day01Impl("(()(()(").part01());
        Assertions.assertEquals("3", new Day01Impl("))(((((").part01());
    }

    @Test
    @DisplayName("День 1. Часть 1. Кейс 3.")
    void part01Case03() {
        Assertions.assertEquals("-1", new Day01Impl("())").part01());
        Assertions.assertEquals("-1", new Day01Impl("))(").part01());
    }

    @Test
    @DisplayName("День 1. Часть 1. Кейс 4.")
    void part01Case04() {
        Assertions.assertEquals("-3", new Day01Impl(")))").part01());
        Assertions.assertEquals("-3", new Day01Impl(")())())").part01());
    }

    @Test
    @DisplayName("День 1. Часть 2. Кейс 1.")
    void part02Case01() {
        Assertions.assertEquals("1", new Day01Impl(")").part02());
    }

    @Test
    @DisplayName("День 1. Часть 2. Кейс 2.")
    void part02Case02() {
        Assertions.assertEquals("5", new Day01Impl("()())").part02());
    }

    @Test
    @DisplayName("День 1. Номер дня.")
    void getNumber() {
        Assertions.assertEquals(DayNumber.DAY01, new Day01Impl().getNumber());
    }
}