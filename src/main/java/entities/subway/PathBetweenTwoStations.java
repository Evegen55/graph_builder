package entities.subway;

import java.time.Duration;
import java.util.Arrays;
import java.util.Objects;

public class PathBetweenTwoStations {

    private final Station[] lineStations = new Station[2];

    private Duration tripDuration;

    private PathBetweenTwoStations(Station from, Station to, Duration interchangeDuration) {
        lineStations[0] = from;
        lineStations[1] = to;
        tripDuration = interchangeDuration;
    }

    /**
     * Way to create right path
     * @param from
     * @param to
     * @param interchangeDuration
     * @return
     */
    public static PathBetweenTwoStations createPathBetweenTwoStations(final Station from, final Station to,
                                                                      final Duration interchangeDuration) {
        PathBetweenTwoStations pathBetweenTwoStations = null;
        if (from != null && to != null
                && !from.equals(to)
                && interchangeDuration != null && !interchangeDuration.isNegative() && !interchangeDuration.isZero()) {
            pathBetweenTwoStations = new PathBetweenTwoStations(from, to, interchangeDuration);
        }
        return pathBetweenTwoStations;
    }

    public Duration getTripDuration() {
        return tripDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PathBetweenTwoStations that = (PathBetweenTwoStations) o;
        return Arrays.equals(lineStations, that.lineStations) &&
                Objects.equals(tripDuration, that.tripDuration);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(tripDuration);
        result = 31 * result + Arrays.hashCode(lineStations);
        return result;
    }
}
