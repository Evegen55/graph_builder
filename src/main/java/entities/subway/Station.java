package entities.subway;

public class Station {

    private boolean isInterchange = false;

    public Station(boolean isInterchange) {
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
