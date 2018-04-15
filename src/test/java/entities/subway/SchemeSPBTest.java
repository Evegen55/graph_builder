package entities.subway;

import org.junit.Test;

import java.time.Duration;
import java.util.LinkedHashSet;

public class SchemeSPBTest {

    Station station1 = new Station("Shushary");
    Station station2 = new Station("Дунайская");
    Station station3 = new Station("Проспект Славы");

    @Test
    public void test() {
        PathBetweenTwoStations pathBetweenTwoStations1 = PathBetweenTwoStations
                .createPathBetweenTwoStations(station1, station2, Duration.ofMinutes(9), 1);

        PathBetweenTwoStations pathBetweenTwoStations2 = PathBetweenTwoStations
                .createPathBetweenTwoStations(station2, station3, Duration.ofMinutes(6), 1);

        PathBetweenTwoStations[] stations = new PathBetweenTwoStations[2];
        stations[0] = pathBetweenTwoStations1;
        stations[1] = pathBetweenTwoStations2;

        Line FrunzenskoPrimorskayaLine = new Line(SpbLinesNames.FrunzenskoPrimorskaya, stations);
    }
}