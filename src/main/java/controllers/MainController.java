package controllers;

import entities.Axes;
import entities.Plot;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

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
        txtFieldForEquation.setText("y = \u00BC(x+4)(x+1)(x-2)");

        Axes axes = new Axes(
                (int) anchorPaneForGraph.getWidth(), (int) anchorPaneForGraph.getHeight(),
                -(int) anchorPaneForGraph.getWidth() / 50, (int) anchorPaneForGraph.getWidth() / 50, 1,
                -(int) anchorPaneForGraph.getHeight() / 50, (int) anchorPaneForGraph.getHeight() / 50, 1
        );

        Plot plot = new Plot(
                x -> .25 * (x + 4) * (x + 1) * (x - 2),
                -8, 8, 0.1,
                axes
        );

        anchorPaneForGraph.getChildren().add(plot);
    }

    public void initFreeDrawer() {
        GraphicsContext graphicsContext2D = canvasGraph.getGraphicsContext2D();
        graphicsContext2D.bezierCurveTo(0, 0, 9, 81, 10, 100);
        graphicsContext2D.stroke();
    }
}
