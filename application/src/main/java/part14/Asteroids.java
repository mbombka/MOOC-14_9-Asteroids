package part14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Asteroids extends Application{

      @Override
      public void start(Stage stage) {   
       
       

         BorderPane pane = new BorderPane();      


        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(new Scene(pane));
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }

}
