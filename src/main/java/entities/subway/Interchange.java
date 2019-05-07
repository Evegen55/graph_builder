package entities.subway;

import java.time.Duration;

/**
 * https://en.wikipedia.org/wiki/Interchange_station
 * @return
 */
public class Interchange {

    private final Station from;
    private final Station to;
    private final Duration interchangeDuration;

    private Interchange(Station from, Station to, Duration interchangeDuration) {
        this.from = from;
        this.to = to;
        this.interchangeDuration = interchangeDuration;
    }

    /**
     * Only way to create interchange station in right way
     * @param from not null
     * @param to not null
     * @param interchangeDuration not null, not zero
     * @return can return null if conditions didn't pass validation
     */
    public static Interchange createInterchange(final Station from, final Station to, final Duration interchangeDuration) {
        Interchange interchange = null;
        if (from != null &&  from.isInterchange()
                && to != null &&  to.isInterchange()
                && !from.equals(to)
                && interchangeDuration != null &&  !interchangeDuration.isNegative() && !interchangeDuration.isZero()) {
                interchange = new Interchange(from, to, interchangeDuration);
        }
        return interchange;
    }
}
