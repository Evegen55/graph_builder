package entities;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;

import java.util.function.Function;

public class Plot extends Pane {
    public Plot(
            Function<Double, Double> f,
            double xMin, double xMax, double xInc,
            CartesianAxes cartesianAxes
    ) {
        Path path = new Path();
        path.setStroke(Color.ORANGE.deriveColor(0, 1, 1, 0.6));
        path.setStrokeWidth(2);

        path.setClip(
                new Rectangle(
                        0, 0,
                        cartesianAxes.getPrefWidth(),
                        cartesianAxes.getPrefHeight()
                )
        );

        double x = xMin;
        double y = f.apply(x);

        path.getElements().add(
                new MoveTo(
                        mapX(x, cartesianAxes), mapY(y, cartesianAxes)
                )
        );

        x += xInc;
        while (x < xMax) {
            y = f.apply(x);

            path.getElements().add(
                    new LineTo(
                            mapX(x, cartesianAxes), mapY(y, cartesianAxes)
                    )
            );

            x += xInc;
        }

        setMinSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
        setPrefSize(cartesianAxes.getPrefWidth(), cartesianAxes.getPrefHeight());
        setMaxSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);

        getChildren().setAll(cartesianAxes, path);
    }

    private double mapX(double x, CartesianAxes cartesianAxes) {
        double tx = cartesianAxes.getPrefWidth() / 2;
        double sx = cartesianAxes.getPrefWidth() /
                (cartesianAxes.getXAxis().getUpperBound() -
                        cartesianAxes.getXAxis().getLowerBound());

        return x * sx + tx;
    }

    private double mapY(double y, CartesianAxes cartesianAxes) {
        double ty = cartesianAxes.getPrefHeight() / 2;
        double sy = cartesianAxes.getPrefHeight() /
                (cartesianAxes.getYAxis().getUpperBound() -
                        cartesianAxes.getYAxis().getLowerBound());

        return -y * sy + ty;
    }
}
