package ru.t3adog.aoc2015.config.enums;

public enum DayNumber {
    DAY00("00"), // for tests
    DAY01("01"),
    DAY02("02"),
    DAY03("03"),
    DAY04("04"),
    DAY05("05"),
    DAY06("06"),
    DAY07("07"),
    DAY08("08"),
    DAY09("09"),
    DAY10("10"),
    DAY11("11"),
    DAY12("12"),
    DAY13("13"),
    DAY14("14"),
    DAY15("15"),
    DAY16("16"),
    DAY17("17"),
    DAY18("18"),
    DAY19("19"),
    DAY20("20"),
    DAY21("21"),
    DAY22("22"),
    DAY23("23"),
    DAY24("24"),
    DAY25("25");

    private final String value;


    DayNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
