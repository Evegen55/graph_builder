package controllers.subway;

import entities.subway.Line;
import entities.subway.SpbLinesNames;
import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.*;

public class LinesStorageTest {

    Line lineForDirection;
    Duration totalTripDuration;

    @Test
    public void getLineFodDirectionPravoberezhnaya1() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.Pravoberezhnaya, true);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 7);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(19));
    }

    @Test
    public void getLineFodDirectionPravoberezhnaya2() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.Pravoberezhnaya, false);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 7);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(19));
    }

    @Test
    public void getLineFodDirectionFrunzenskoPrimorskaya1() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.FrunzenskoPrimorskaya, true);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 12);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(30)); // TODO: 15.04.2018 check it
    }

    @Test
    public void getLineFodDirectionFrunzenskoPrimorskaya2() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.FrunzenskoPrimorskaya, false);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 12);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(30)); // TODO: 15.04.2018 check it
    }

    @Test
    public void getLineFodDirectionKirovskoVyborgskaya1() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.KirovskoVyborgskaya, true);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 19);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(47)); // TODO: 15.04.2018 check it
    }

    @Test
    public void getLineFodDirectionKirovskoVyborgskaya2() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.KirovskoVyborgskaya, false);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 19);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(47)); // TODO: 15.04.2018 check it
    }

    @Test
    public void getLineFodDirectionMoskovskoPetrogradskaya1() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.MoskovskoPetrogradskaya, true);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 18);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(47)); // TODO: 15.04.2018 check it
    }

    @Test
    public void getLineFodDirectionMoskovskoPetrogradskaya2() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.MoskovskoPetrogradskaya, false);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 18);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(47)); // TODO: 15.04.2018 check it
    }

    @Test
    public void getLineFodDirectionNevskoVasileostrovskaya1() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.NevskoVasileostrovskaya, true);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 10);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(32)); // TODO: 15.04.2018 check it
    }

    @Test
    public void getLineFodDirectionNevskoVasileostrovskaya2() {
        lineForDirection = LinesStorage.getLineForDirection(SpbLinesNames.NevskoVasileostrovskaya, false);
        assertNotNull(lineForDirection);
        assertTrue(lineForDirection.getNumOfPaths() == 10);
        totalTripDuration = lineForDirection.getTotalTripDuration();
        assertNotEquals(totalTripDuration, Duration.ZERO);
        assertEquals(totalTripDuration, Duration.ofMinutes(32)); // TODO: 15.04.2018 check it
    }


}