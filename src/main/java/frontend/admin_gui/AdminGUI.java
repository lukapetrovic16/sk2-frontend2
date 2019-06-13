package frontend.admin_gui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class AdminGUI extends Application {
   // private TableView table = new TableView();

    public void start(Stage stage) {
        TableView table = new TableView();
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane);

        Text imeLabel = new Text("Ime");
        Label imeBeckhand = new Label("Ime iz baze");
        TextField imeText = new TextField();
        imeText.setPromptText("Promeni ime");

        Text prezLabel = new Text("Prezime");
        Label prezBeckhand = new Label("Prezime iz baze");
        TextField prezText = new TextField();
        prezText.setPromptText("Promeni prezime");

        Text emailLabel = new Text("Email");
        Label emailBeckhand = new Label("Meil iz baze");
        TextField emailText = new TextField();
        emailText.setPromptText("Promeni email");

        Text userLabel = new Text("Username");
        Label userBeckhand = new Label("User iz baze");
        TextField userText = new TextField();
        userText.setPromptText("Promeni username");

        Text passLabel = new Text("Password");
        Label passwordBeckhand = new Label("Password iz baze");
        TextField passText = new TextField();
        passText.setPromptText("Promeni password");


        Text uloga = new Text("Uloga");
        ToggleGroup groupUloga = new ToggleGroup();
        RadioButton userCheck = new RadioButton("User");
        userCheck.setToggleGroup(groupUloga);
        RadioButton adminCheck = new RadioButton("Admin");
        adminCheck.setToggleGroup(groupUloga);


        table.setEditable(true);
        TableColumn imeCol = new TableColumn("Ime");
        TableColumn prezCol = new TableColumn("Prezime");
        TableColumn userCol = new TableColumn("Username");
        TableColumn statusCol = new TableColumn("Status");
        TableColumn rezervacijeCol = new TableColumn("Br rezervacija");

        /*imeCol.prefWidthProperty().bind(table.widthProperty().multiply(0.2));
        prezCol.prefWidthProperty().bind(table.widthProperty().multiply(0.2));
        userCol.prefWidthProperty().bind(table.widthProperty().multiply(0.2));
        statusCol.prefWidthProperty().bind(table.widthProperty().multiply(0.2));
        rezervacijeCol.prefWidthProperty().bind(table.widthProperty().multiply(0.2));*/

        table.getColumns().addAll(imeCol, prezCol, userCol, statusCol, rezervacijeCol);

        Button buttonIzmene = new Button("Sacuvaj izmene");

        gridPane.setMinSize(600, 600);

        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(imeLabel, 0, 0);
        gridPane.add(imeBeckhand, 1, 0);
        gridPane.add(imeText, 2, 0);

        gridPane.add(prezLabel, 0, 1);
        gridPane.add(prezBeckhand, 1, 1);
        gridPane.add(prezText, 2, 1);

        gridPane.add(emailLabel, 0, 2);
        gridPane.add(emailBeckhand, 1, 2);
        gridPane.add(emailText, 2, 2);

        gridPane.add(userLabel, 0, 3);
        gridPane.add(userBeckhand, 1, 3);
        gridPane.add(userText, 2, 3);

        gridPane.add(passLabel, 0, 4);
        gridPane.add(passwordBeckhand, 1, 4);
        gridPane.add(passText, 2, 4);

        gridPane.add(uloga, 0, 5);
        gridPane.add(userCheck, 1, 5);
        gridPane.add(adminCheck, 2, 5);

        gridPane.add(table, 0, 6);

        gridPane.add(buttonIzmene, 0, 8);


        imeLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        imeBeckhand.setStyle("-fx-font: normal bold 15px 'serif' ");
        imeText.setStyle("-fx-font: normal bold 15px 'serif' ");

        prezLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        prezBeckhand.setStyle("-fx-font: normal bold 15px 'serif' ");
        prezText.setStyle("-fx-font: normal bold 15px 'serif' ");

        emailLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        emailBeckhand.setStyle("-fx-font: normal bold 15px 'serif' ");
        emailText.setStyle("-fx-font: normal bold 15px 'serif' ");

        userLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        userBeckhand.setStyle("-fx-font: normal bold 15px 'serif' ");
        userText.setStyle("-fx-font: normal bold 15px 'serif' ");

        passLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        passwordBeckhand.setStyle("-fx-font: normal bold 15px 'serif' ");
        passText.setStyle("-fx-font: normal bold 15px 'serif' ");

        uloga.setStyle("-fx-font: normal bold 15px 'serif' ");

        gridPane.setStyle("-fx-background-color: BEIGE;");

        stage.setTitle("User Interface");

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
