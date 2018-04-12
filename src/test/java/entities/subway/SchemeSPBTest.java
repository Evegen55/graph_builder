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
                .createPathBetweenTwoStations(station1, station2, Duration.ofMinutes(9));

        PathBetweenTwoStations pathBetweenTwoStations2 = PathBetweenTwoStations
                .createPathBetweenTwoStations(station2, station3, Duration.ofMinutes(6));

        LinkedHashSet<PathBetweenTwoStations> stations = new LinkedHashSet<>();
        stations.add(pathBetweenTwoStations1);
        stations.add(pathBetweenTwoStations2);

        Line FrunzenskoPrimorskayaLine = new Line(SpbLinesNames.FrunzenskoPrimorskaya, stations);
    }
}