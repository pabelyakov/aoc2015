package ru.t3adog.aoc2015.days;

import ru.t3adog.aoc2015.config.enums.DayNumber;

public class DefaultDay implements Day{
    @Override
    public String part01() {
        return "part01 result";
    }

    @Override
    public String part02() {
        return "part02 result";
    }

    @Override
    public DayNumber getNumber() {
        return DayNumber.DAY00;
    }
}
