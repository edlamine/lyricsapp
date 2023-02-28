package app.lyricsapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LyricsApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/app/lyricsapp/view/lyricsapp.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/app/lyricsapp/view/home.fxml"));

        primaryStage.setTitle("LyricsApp");
        /*GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label label = new Label("Speech: ");
        GridPane.setConstraints(label, 0, 0);

        TextField speechInput = new TextField();
        speechInput.setPromptText("Enter your speech");
        GridPane.setConstraints(speechInput, 1, 0);

        Button addButton = new Button("Add");
        GridPane.setConstraints(addButton, 1, 1);

        grid.getChildren().addAll(label, speechInput, addButton);

        Scene scene = new Scene(grid, 300, 200);*/
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
