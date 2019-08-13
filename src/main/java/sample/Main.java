package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("FXML TableView Example");
        Pane myPane = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.show();
//        TableColumn<User, String> username = new TableColumn<User, String>("User Name");
//        TableColumn<String, String> country = new TableColumn<String, String>("Country");
//        TableColumn<Reason, String> reason = new TableColumn<Reason, String>("Reason");
//
//        table.getColumns().addAll(username, country, reason);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
