package net.vatri.inventory.controllers;

import net.vatri.inventory.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuController extends App {
    @FXML
    protected void openProducts(ActionEvent event) {
        App.showPage("products");
    }

    @FXML
    protected void dashboardAction(ActionEvent event) {
        App.showPage("dashboard");
    }

    @FXML
    protected void openGroups() {
        App.showPage("groups");
    }

    @FXML
    protected void openOrders() {
        App.showPage("orders");
    }

    @FXML
    protected void openStock() {
        App.showPage("stock");
    }
    @FXML
     protected void logout() {
         mainMenu.setVisible(false);
        App.showPage("login");
    }
}