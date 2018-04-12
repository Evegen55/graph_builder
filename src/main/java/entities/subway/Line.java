package entities.subway;

import java.time.Duration;
import java.util.LinkedHashSet;

/**
 * Metropolitan line is a set of two-station pairs in order to flexible draw them and
 * calculate trip duration with precision.
 *
 * It also has spbLinesNames and color (set up color depends on spbLinesNames)
 */
public class Line {

    private SpbLinesNames spbLinesNames;

    private String css_color;

    private LinkedHashSet<PathBetweenTwoStations> lineStations;

    private Duration totalTripDuration;

    public Line(SpbLinesNames spbLinesNames, PathBetweenTwoStations pathBetweenTwoStations) {
        this.spbLinesNames = spbLinesNames;
        this.lineStations = new LinkedHashSet<>();
        this.lineStations.add(pathBetweenTwoStations);
    }

    public Line(SpbLinesNames spbLinesNames, LinkedHashSet<PathBetweenTwoStations> lineStations) {
        this(spbLinesNames, "", lineStations);
    }

    public Line(final SpbLinesNames spbLinesNames, final String css_color, final LinkedHashSet<PathBetweenTwoStations> lineStations) {
        this.spbLinesNames = spbLinesNames;
        this.css_color = css_color;
        this.lineStations = lineStations;
        this.totalTripDuration = calculateTotalTripDuration();
    }

    private Duration calculateTotalTripDuration() {
        Duration result = Duration.ZERO;
        if (lineStations != null) {
            for (PathBetweenTwoStations pathBetweenTwoStations: lineStations) {
                result = result.plus(pathBetweenTwoStations.getTripDuration());
            }
        }
        return result;
    }

    public Duration getTotalTripDuration() {
        return totalTripDuration;
    }

    // TODO: 12.04.2018 add station depends on place
    public Line addStation(Station station) {
        return null;
    }


}
