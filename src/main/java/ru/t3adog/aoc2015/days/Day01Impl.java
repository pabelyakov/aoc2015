package ru.t3adog.aoc2015.days;

import ru.t3adog.aoc2015.config.enums.DayNumber;
import ru.t3adog.aoc2015.utils.InputParserUtil;

public class Day01Impl implements Day {
    private final String input;

    public Day01Impl() {
        this.input = InputParserUtil.readLine(this.getNumber());
    }

    public Day01Impl(String input) {
        this.input = input;
    }

    @Override
    public String part01() {
        int floor = 0;
        for (char step : this.input.toCharArray()) {
            if (step == '(') {
                floor++;
            } else {
                floor--;
            }
        }
        return String.valueOf(floor);
    }

    @Override
    public String part02() {
        int floor = 0;
        int position = 0;

        for (char step : this.input.toCharArray()) {
            if (step == '(') {
                floor++;
            } else {
                floor--;
            }
            position++;
            if (floor == -1) {
                break;
            }
        }
        return String.valueOf(position);
    }

    @Override
    public DayNumber getNumber() {
        return DayNumber.DAY01;
    }
}
