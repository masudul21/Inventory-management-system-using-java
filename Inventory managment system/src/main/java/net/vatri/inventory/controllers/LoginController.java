package net.vatri.inventory.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import net.vatri.inventory.App;
import net.vatri.inventory.libs.BaseController;
import net.vatri.inventory.models.User;


public class LoginController extends BaseController {

    @FXML
    private TextField userid;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;

    @FXML
    protected void btnLoginPressed(ActionEvent event) {
        User user = inventoryService.getUserByEmail(userid.getText());
        //boolean check = user.getEmail().equals(userid.getText());
       
        if ( user.getPassword().equals(passwordField.getText())) {
            App.showPage("dashboard");
        }  if ( !user.getPassword().equals(passwordField.getText())) {
            errorLabel.setText("Wrong userID or password");
            errorLabel.setVisible(true);
           
            
        }
    }
    @FXML
    public void clearaction(ActionEvent event){
        userid.setText("");
        passwordField.setText("");
        errorLabel.setText("");
    }
}