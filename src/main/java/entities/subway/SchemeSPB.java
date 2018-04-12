package entities.subway;

import java.util.Set;

public class SchemeSPB extends Subway {

    private Set<Line> lines;

    public SchemeSPB(Set<Line> lines) {
        this.lines = lines;
    }
}
