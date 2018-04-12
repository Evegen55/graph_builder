package entities.subway;

import org.junit.Test;

import java.time.Duration;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNull;

public class InterchangeTest {

    @Test
    public void createInterchange() {
        Interchange interchange;
        Station station1 = new Station("One", true);
        Station station2 = new Station("Two", true);
        Station station3 = new Station("Three");

        interchange = Interchange.createInterchange(station1, station1, Duration.ofMinutes(2));
        assertNull(interchange);
        interchange = Interchange.createInterchange(station1, station2, Duration.ofMinutes(2));
        assertNotNull(interchange);
        interchange = Interchange.createInterchange(station2, station3, Duration.ofMinutes(2));
        assertNull(interchange);
    }
}