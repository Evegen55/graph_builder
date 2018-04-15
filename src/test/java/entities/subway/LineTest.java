package entities.subway;

import org.junit.Ignore;
import org.junit.Test;

import java.time.Duration;
import java.util.LinkedHashSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class LineTest {

    Station station1 = new Station("One", true);
    Station station2 = new Station("Two", true);
    Station station3 = new Station("Three");

    PathBetweenTwoStations[] stations;
    Line line;
    Duration totalTripDuration;

    @Test
    public void getTotalTripDurationAs() {
        stations = new PathBetweenTwoStations[2];
        PathBetweenTwoStations pathBetweenTwoStations1 = PathBetweenTwoStations
                .createPathBetweenTwoStations(station1, station2, Duration.ofMinutes(9), 1);

        PathBetweenTwoStations pathBetweenTwoStations2 = PathBetweenTwoStations
                .createPathBetweenTwoStations(station2, station3, Duration.ofMinutes(6), 1);

        stations[0] = pathBetweenTwoStations1;
        stations[1] = pathBetweenTwoStations2;

        line = new Line(SpbLinesNames.FrunzenskoPrimorskaya, stations);
        totalTripDuration = line.getTotalTripDuration();
        assertThat(totalTripDuration, is(Duration.ofMinutes(15)));
    }

    @Test
    @Ignore
    public void addStation() {
    }
}