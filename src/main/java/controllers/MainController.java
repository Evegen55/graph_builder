package controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class MainController {

    private final Stage primaryStage;

    @FXML
    private Canvas canvasGraph;

    public MainController(final Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void initGraphView() {
        GraphicsContext graphicsContext2D = canvasGraph.getGraphicsContext2D();
        graphicsContext2D.bezierCurveTo(0, 0, 9, 81, 10, 100);
        graphicsContext2D.stroke();
    }
}
