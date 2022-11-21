package controller;

import TableModel.TestTableModel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * user : W.P.A.M.Nonis <ameshnonis8@gmail.com>
 * date : 11/16/2022
 * time : 1:00 PM
 **/
public class TableformController {
    public TableView<TestTableModel> tblTest;
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;

    public void initialize(){

        tblTest.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("Id"));
        tblTest.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("Name"));
        tblTest.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("Address"));
        tblTest.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("Contact"));


        loaddata();

        tblTest.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TestTableModel>() {
            @Override
            public void changed(ObservableValue<? extends TestTableModel> observable, TestTableModel oldValue, TestTableModel newValue) {

                TestTableModel selectedItem = tblTest.getSelectionModel().getSelectedItem();

                txtId.setText(selectedItem.getId());
            }
        });
    }

    public void loaddata(){

      /*  TestTableModel TestTM1 = new TestTableModel("T001","Amesh","Chilaw","0717730167");
        TestTableModel TestTM2 = new TestTableModel("T002","Melan","Colombo","0717730164");
        TestTableModel TestTM3 = new TestTableModel("T003","Kasun","Nuwara","0717730165");
        TestTableModel TestTM4 = new TestTableModel("T004","Nisal","Mahawewa","0717735167");
        TestTableModel TestTM5 = new TestTableModel("T005","Supun","Madmpe","0717730177");*/

        ObservableList<TestTableModel> items = tblTest.getItems();

       /* items.add(TestTM1);
        items.add(TestTM2);
        items.add(TestTM3);
        items.add(TestTM4);
        items.add(TestTM5);*/

        tblTest.refresh();
    }

    public void btnAddToTableOnAction(ActionEvent actionEvent) {

        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String contact = txtContact.getText();

        ObservableList<TestTableModel> items = tblTest.getItems();

        TestTableModel test = new TestTableModel(id,name,address,contact);

        items.add(test);

        tblTest.refresh();

        txtId.clear();
        txtName.clear();
        txtAddress.clear();
        txtContact.clear();

        txtId.requestFocus();
    }
}
