
import environment.World;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * Created by noahtell on 15-05-12.
 */
public class GUI extends Scene {
    public World world;
    public Pane worldHolder;

    private StackPane root;
    public GUI(){
        super(new StackPane());
        root = (StackPane)(getRoot());
        root.setPrefWidth(600);
        root.setPrefHeight(400);

        world = new World();
        //add world to layer pane, with lowest z-ordering
        worldHolder = new Pane();
        worldHolder.getChildren().add(world);

        root.getChildren().add(worldHolder);

    }
}

