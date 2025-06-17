package ru.t3adog.aoc2015.utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.t3adog.aoc2015.config.enums.DayNumber;

import java.util.List;



public class InputParserUtilTest {

    @Test
    @DisplayName("Прочитает тестовый файл в виде строк")
    public void shouldReadThreeLinesFromTestFile() {
        List<String> result = InputParserUtil.readLines(DayNumber.DAY00);
        Assertions.assertEquals(3, result.size());
    }

    @Test
    @DisplayName("Прочитает тестовый файл в виде единой строки")
    public void shouldReadFileAsSingleString() {
        String result = InputParserUtil.readLine(DayNumber.DAY00);

        String expetedResult = """
                Hello From Test!
                Hello From Test!
                Hello From Test!""";

        Assertions.assertEquals(expetedResult, result);
    }
}