package ru.gb.demojavafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField userAnswer;

    @FXML
    public void clickChekButton(ActionEvent actionEvent) {

        final String answer= userAnswer.getText();
        if (answer.isBlank()){
            return;
        }


    String text = answer;
    historyArea.appendText(text+"\n");
    userAnswer.clear();
    userAnswer.requestFocus();


    }

}