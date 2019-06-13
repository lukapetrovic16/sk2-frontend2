package sk2.sk2frontend.register;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

public class Registration extends Application {
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane);

        Text nameLabel = new Text("Name");
        TextField nameText = new TextField();

        Text userLabel = new Text("Username");
        TextField userText = new TextField();

        Text passLabel = new Text("Password");
        TextField passText = new TextField();


        Text uloga = new Text("Uloga");
        ToggleGroup groupUloga = new ToggleGroup();
        RadioButton userCheck = new RadioButton("User");
        userCheck.setToggleGroup(groupUloga);

        RadioButton adminCheck = new RadioButton("Admin");
        adminCheck.setToggleGroup(groupUloga);




        Button buttonRegister = new Button("Register");

        gridPane.setMinSize(300, 300);

        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(userLabel, 0, 2);
        gridPane.add(userText, 1, 2);

        gridPane.add(passLabel, 0, 4);
        gridPane.add(passText, 1, 4);

        gridPane.add(uloga, 0, 5);
        gridPane.add(userCheck, 1, 5);
        gridPane.add(adminCheck, 2, 5);

        gridPane.add(buttonRegister, 2, 7);

        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        nameText.setStyle("-fx-font: normal bold 15px 'serif' ");
        userLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        userText.setStyle("-fx-font: normal bold 15px 'serif' ");
        passLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        passText.setStyle("-fx-font: normal bold 15px 'serif' ");
        uloga.setStyle("-fx-font: normal bold 15px 'serif' ");

        gridPane.setStyle("-fx-background-color: BEIGE;");

        stage.setTitle("Register");

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }

}
