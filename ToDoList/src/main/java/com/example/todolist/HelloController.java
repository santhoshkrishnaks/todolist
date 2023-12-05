package com.example.todolist;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
@FXML
    private TextArea todoItem;
@FXML
    private ListView todolist;
@FXML
    protected void onAddButtonClick(){
    this.todolist.getItems().add(this.todoItem.getText());
}
@FXML
    protected void onRemoveButtonClick(){
    int in=todolist.getSelectionModel().getSelectedIndex();
    this.todolist.getItems().remove(in);
}
}