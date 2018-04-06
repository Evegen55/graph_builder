package app;

import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraphBuilderApp extends Application {

    private final static Logger LOGGER = LoggerFactory.getLogger(GraphBuilderApp.class);

    @Override
    public void start(Stage primaryStage) throws Exception {
        LOGGER.info("Start loading application ...");
        primaryStage.setTitle("Math in action");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/base.fxml"));
        // set the main controller as root controller
        final MainController mainController = new MainController(primaryStage);
        loader.setController(mainController);
        final Parent parent = loader.load();
        final Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();

        //do the stuff
        mainController.initGraphView();
        mainController.initFreeDrawer();
        mainController.populateComplixityTable();

        LOGGER.info("Main application window has been loaded successfully\n");
    }
}
