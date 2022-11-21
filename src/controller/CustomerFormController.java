package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * user : W.P.A.M.Nonis <ameshnonis8@gmail.com>
 * date : 11/13/2022
 * time : 8:25 PM
 **/
public class CustomerFormController {

    public TextField txtsomething;
    public Label lbljava;

    public void initialize(){
        txtsomething.setDisable(true);
    }

    public void btnHelloWorldOnAction(ActionEvent actionEvent) {
        System.out.println("Hello World");

        txtsomething.setDisable(false);

        txtsomething.requestFocus();
    }

    public void btnpressOnAction(ActionEvent actionEvent) {
        String text = txtsomething.getText();
        System.out.println(text);
        txtsomething.clear();
    }

    public void btnShowOnAction(ActionEvent actionEvent) {
        lbljava.setVisible(true);
    }

    public void btnHideOnAction(ActionEvent actionEvent) {
        lbljava.setVisible(false);
    }
}
