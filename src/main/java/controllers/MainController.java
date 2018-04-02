package controllers;

import entities.CartesianAxes;
import entities.Plot;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class MainController {

    private final static Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    private final Stage primaryStage;

    @FXML
    private Canvas canvasGraph;

    @FXML
    private AnchorPane anchorPaneForGraph;
    @FXML
    private TextField txtFieldForEquation;

    public MainController(final Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void initGraphView() {
        LOGGER.info("Perform initialisation for graph plotting ...");
        txtFieldForEquation.setText("y = \u00BC(x+4)(x+1)(x-2)");

        final int anchorPaneForGraphWidth = (int) anchorPaneForGraph.getWidth();
        final int anchorPaneForGraphHeight = (int) anchorPaneForGraph.getHeight();
        final int axisRatio = 50;
        final int xBoundaries = anchorPaneForGraphWidth / axisRatio;
        final int yBoundaries = anchorPaneForGraphHeight / axisRatio;

        final CartesianAxes cartesianAxes = new CartesianAxes(
                anchorPaneForGraphWidth, anchorPaneForGraphHeight,
                -xBoundaries, xBoundaries, 1,
                -yBoundaries, yBoundaries, 1
        );
        final Function<Double, Double> function = x -> .25 * (x + 4) * (x + 1) * (x - 2);
        final Plot plot = new Plot(function, -xBoundaries, xBoundaries, 0.1, cartesianAxes);

        anchorPaneForGraph.getChildren().add(plot);
    }

    public void initFreeDrawer() {
        GraphicsContext graphicsContext2D = canvasGraph.getGraphicsContext2D();
        graphicsContext2D.bezierCurveTo(0, 0, 9, 81, 10, 100);
        graphicsContext2D.stroke();
    }
}
