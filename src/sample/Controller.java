package sample;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;

import java.io.File;

public class Controller {
    @FXML
    VBox VboxArea;
    @FXML
    TextField textField;
    @FXML
    Button btn;

int index = 0;
    public void sendMsg(){
        Label label = new Label(textField.getText() + "\n");
        label.setFont(Font.font("Bookman",12));
        VBox vBox = new VBox();

        if (index % 2== 0) {
            vBox.setAlignment(Pos.TOP_LEFT);
        }else{
            vBox.setAlignment(Pos.TOP_RIGHT);
        }
        vBox.getChildren().add(label);
        VboxArea.getChildren().add(vBox);
        index++;

        textField.clear();
        textField.requestFocus();



    }


}
