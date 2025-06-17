package ru.t3adog.aoc2015.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import ru.t3adog.aoc2015.config.enums.DayNumber;

import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class InputParserUtil {

    @SneakyThrows
    public static List<String> readLines(DayNumber day) {
        return Files.readAllLines(buildPath(day), Charset.defaultCharset());
    }

    @SneakyThrows
    public static String readLine(DayNumber day) {
        return Files.readString(buildPath(day), Charset.defaultCharset());
    }

    @SneakyThrows
    private static Path buildPath(DayNumber day) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL url = classloader.getResource("day_" + day.getValue() + ".txt");
        return Path.of(Objects.requireNonNull(url).toURI());
    }
}
