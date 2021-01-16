package net.vatri.inventory.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import net.vatri.inventory.libs.BaseController;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class DashboardController extends BaseController implements Initializable {

//    private InventoryDao dao = new InventoryDaoImpl( new JdbcQueryBuilder(App.getConfig("db_connection")) );

    @FXML
    private Label productsNumber;
    @FXML
    private Label groupsNumber;
    @FXML
    private Label ordersNumber;

    @FXML
    private BarChart<String, Number> ordersChart;
    @FXML
    private CategoryAxis x;
    @FXML
    private NumberAxis y;

    private Map<String, String> stats = inventoryService.getStats();

    public void initialize(URL url, ResourceBundle rb) {

        productsNumber.setText(stats.get("products_number"));
        groupsNumber.setText(stats.get("groups_number"));
        ordersNumber.setText(stats.get("orders_number"));

       

    }

}