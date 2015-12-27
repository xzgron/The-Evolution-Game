import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Noah on 2015-12-27.
 */
public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new GUI());
        primaryStage.show();
    }
}
