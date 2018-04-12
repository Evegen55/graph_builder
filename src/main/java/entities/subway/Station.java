package entities.subway;

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
}
