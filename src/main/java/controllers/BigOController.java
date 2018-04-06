package controllers;

import entities.Complexity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BigOController {

    private final static Logger LOGGER = LoggerFactory.getLogger(BigOController.class);

    private static long performance_in_second = 1_000_000;
    private static long performance_in_1h = 60 * 60 * performance_in_second;
    private static long performance_in_1d = performance_in_1h * 24;
    private static long performance_in_1w = performance_in_1d * 7;
    private static long performance_in_1y = performance_in_1d * 365;

    public static List<Long> longList = new ArrayList<>();

    private static void addAllToList() {
        longList.add(performance_in_second);
        longList.add(performance_in_1h);
        longList.add(performance_in_1d);
        longList.add(performance_in_1w);
        longList.add(performance_in_1y);
    }

    static {
        addAllToList();
    }

    public static List<Number> calculateNwithRespectOfPerforamnce(final Complexity complexity) {

        List<Number> calculateNsquared = null;
        switch (complexity) {
            case n_squared:
                LOGGER.info("for O(N^2):");
                calculateNsquared = calculateNsquared();
                printList(calculateNsquared);
                break;
            case log_n:
                LOGGER.info("for O(log(N)):");
                calculateNsquared = calculateNlogN();
                printList(calculateNsquared);
                break;
            case two_pow_N:
                LOGGER.info("for O(2^N):");
                calculateNsquared = calculate2powN();
                printList(calculateNsquared);
                break;
            case N:
                LOGGER.info("for O(N):");
                longList.forEach(System.out::println);
                break;
        }
        return calculateNsquared;
    }

    private static List<Number> calculate2powN() {
        List<Number> calculatedList = new ArrayList<>();
        for (Long l : longList) {
            double pow = Math.log(l);
            calculatedList.add(pow);
        }
        return calculatedList;
    }

    private static List<Number> calculateNlogN() {
        List<Number> calculatedList = new ArrayList<>();
        for (Long l : longList) {
            double pow = Math.pow(2, l);
            calculatedList.add(pow);
        }
        return calculatedList;
    }

    private static void printList(final List<Number> calculateNsquared) {
        calculateNsquared.forEach(System.out::println);
    }

    private static List<Number> calculateNsquared() {
        List<Number> calculatedList = new ArrayList<>();
        for (Long l : longList) {
            calculatedList.add(Math.sqrt(l));
        }
        return calculatedList;
    }
}
