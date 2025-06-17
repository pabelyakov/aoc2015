package ru.t3adog.aoc2015.config.di;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import ru.t3adog.aoc2015.config.enums.DayNumber;
import ru.t3adog.aoc2015.days.Day;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Велосипедный Dependency Injection на базе библиотеки org.reflections.Reflections
 * Находит все классы в указанном пакете, кастит их в интерфейс Day и укладывает в Map<DayNumber, Day>.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DayContainerLoader {

    private static final String DAYS_PACKAGE = "ru.t3adog.aoc2015.days";

    @SneakyThrows
    public static Map<DayNumber, Day> getDayContainer() {
        Map<DayNumber, Day> container = new HashMap<>();

        for (Class dayClass : findAllClassesUsingReflectionsLibrary(DAYS_PACKAGE)) {
            if (!dayClass.isInterface()) {
                Day day = (Day) dayClass.getDeclaredConstructor().newInstance();
                container.put(day.getNumber(), day);
            }
        }
        return  container;
    }

    private static Set<Class> findAllClassesUsingReflectionsLibrary(String packageName) {
        Reflections reflections = new Reflections(packageName, new SubTypesScanner(false));
        return reflections.getSubTypesOf(Day.class)
                .stream()
                .collect(Collectors.toSet());
    }
}
