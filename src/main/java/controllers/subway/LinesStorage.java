package controllers.subway;

import entities.subway.Line;
import entities.subway.PathBetweenTwoStations;
import entities.subway.SpbLinesNames;
import entities.subway.Station;

import java.time.Duration;
import java.util.LinkedHashSet;

public class LinesStorage {

    public static Line getLineForDirection(final SpbLinesNames spbLinesName, final boolean isFromNorthToSouth) {

        LinkedHashSet<PathBetweenTwoStations> lineStations = null;
        Line line = null;
        if (spbLinesName.equals(SpbLinesNames.Pravoberezhnaya)) {

            final Station stationSpasskaya = new Station("Spasskaya", true);
            final Station stationDostoyevskaya = new Station("Dostoyevskaya", true);
            final Station stationLigovskyProspekt = new Station("LigovskyProspekt");
            final Station stationPloshchadAlexandraNevskogoII = new Station("PloshchadAlexandraNevskogoII", true);
            final Station stationNovocherkasskaya = new Station("Novocherkasskaya");
            final Station stationLadozhskaya = new Station("Ladozhskaya");
            final Station stationProspektBolshevikov = new Station("ProspektBolshevikov");
            final Station stationUlitsaDybenko = new Station("UlitsaDybenko");

            //from north to south
            if (isFromNorthToSouth) {
                // TODO: 15.04.2018 check time and durations!
                PathBetweenTwoStations pathBetweenTwoStations1
                        = PathBetweenTwoStations.createPathBetweenTwoStations(stationSpasskaya, stationDostoyevskaya, Duration.ofMinutes(2), 1000);
                PathBetweenTwoStations pathBetweenTwoStations2
                        = PathBetweenTwoStations.createPathBetweenTwoStations(stationDostoyevskaya, stationLigovskyProspekt, Duration.ofMinutes(2), 1000);
                PathBetweenTwoStations pathBetweenTwoStations3
                        = PathBetweenTwoStations.createPathBetweenTwoStations(stationLigovskyProspekt, stationPloshchadAlexandraNevskogoII, Duration.ofMinutes(3), 2700);
                PathBetweenTwoStations pathBetweenTwoStations4
                        = PathBetweenTwoStations.createPathBetweenTwoStations(stationPloshchadAlexandraNevskogoII, stationNovocherkasskaya, Duration.ofMinutes(3), 1000);
                PathBetweenTwoStations pathBetweenTwoStations5
                        = PathBetweenTwoStations.createPathBetweenTwoStations(stationNovocherkasskaya, stationLadozhskaya, Duration.ofMinutes(3), 1000);
                PathBetweenTwoStations pathBetweenTwoStations6
                        = PathBetweenTwoStations.createPathBetweenTwoStations(stationLadozhskaya, stationProspektBolshevikov, Duration.ofMinutes(3), 1000);
                PathBetweenTwoStations pathBetweenTwoStations7
                        = PathBetweenTwoStations.createPathBetweenTwoStations(stationProspektBolshevikov, stationUlitsaDybenko, Duration.ofMinutes(3), 1000);

                lineStations = new LinkedHashSet<>(7);
                lineStations.add(pathBetweenTwoStations1);
                lineStations.add(pathBetweenTwoStations2);
                lineStations.add(pathBetweenTwoStations3);
                lineStations.add(pathBetweenTwoStations4);
                lineStations.add(pathBetweenTwoStations5);
                lineStations.add(pathBetweenTwoStations6);
                lineStations.add(pathBetweenTwoStations7);
                line = new Line(spbLinesName, lineStations);
            } else {

            }


        }





        return line;
    }
}
