package controllers;

import entities.Complexity;
import entities.RowWithData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TableWithBigOController {

    private final static Logger LOGGER = LoggerFactory.getLogger(TableWithBigOController.class);

    private TableView tblViewBigO;
    private TableColumn two_pow_N_column;
    private TableColumn n_squared_column;
    private TableColumn N_column;
    private TableColumn log_n_column;

    public TableWithBigOController(TableView tblViewBigO, TableColumn two_pow_N_column, TableColumn n_squared_column, TableColumn N_column, TableColumn log_n_column) {
        this.tblViewBigO = tblViewBigO;
        this.two_pow_N_column = two_pow_N_column;
        this.n_squared_column = n_squared_column;
        this.N_column = N_column;
        this.log_n_column = log_n_column;
    }

    public void populateColumns() {
        LOGGER.info("Map columns with data ...");
        two_pow_N_column.setCellValueFactory(
                new PropertyValueFactory<RowWithData, Number>("two_pow_N_column"));
        n_squared_column.setCellValueFactory(
                new PropertyValueFactory<RowWithData, Number>("n_squared_column"));
        N_column.setCellValueFactory(
                new PropertyValueFactory<RowWithData, Number>("N_column"));
        log_n_column.setCellValueFactory(
                new PropertyValueFactory<RowWithData, Number>("log_n_column"));

        LOGGER.info("Perform calculations and create rows for table...");
        final ObservableList<RowWithData> data = calculateAndCreateList();
        LOGGER.info("Map rows to table columns...");
        tblViewBigO.setItems(data);
        LOGGER.info("Populating table columns with data is done.");
    }

    private ObservableList<RowWithData> calculateAndCreateList() {
        ObservableList<RowWithData> observableList = FXCollections.observableArrayList();
        List<Number> numbers_two_pow_N = BigOController.calculateNwithRespectOfPerforamnce(Complexity.two_pow_N);
        List<Number> numbers_n_squared = BigOController.calculateNwithRespectOfPerforamnce(Complexity.n_squared);
        List<Long> numbers_N = BigOController.longList;
        List<Number> numbers_log_n = BigOController.calculateNwithRespectOfPerforamnce(Complexity.log_n);
        for (int i = 0; i < numbers_log_n.size(); i++) {
            Number two_pow_n_column = numbers_two_pow_N.get(i);
            Number n_squared_column = numbers_n_squared.get(i);
            Number n_column = numbers_N.get(i);
            Number log_n_column = numbers_log_n.get(i);

            RowWithData rowWithData = new RowWithData(two_pow_n_column, n_squared_column,
                    n_column, log_n_column);
            observableList.add(rowWithData);
        }
        return observableList;
    }
}
