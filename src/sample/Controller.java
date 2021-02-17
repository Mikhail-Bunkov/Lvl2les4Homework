package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    @FXML
    public void ClickSendBtn(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }
}
