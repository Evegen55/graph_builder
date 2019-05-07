package entities.subway;

import java.util.Objects;

public class Station {

    private final String stationName;

    private boolean isInterchange = false;

    public Station(final String stationName) {
        this.stationName = stationName;
    }

    public Station(final String stationName, final boolean isInterchange) {
        this.stationName = stationName;
        this.isInterchange = isInterchange;
    }

    /**
     * https://en.wikipedia.org/wiki/Interchange_station
     * @return
     */
    public boolean isInterchange() {
        return isInterchange;
    }

    public String getStationName() {
        return stationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return isInterchange == station.isInterchange &&
                Objects.equals(stationName, station.stationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationName, isInterchange);
    }
}
