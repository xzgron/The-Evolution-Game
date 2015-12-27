package environment;

import organisms.Creature;
import organisms.Plant;

import java.util.LinkedList;

/**
 * Created by Noah on 2015-12-27.
 */
public class WorldBlock {
    public WorldBlock children[][];

    //Creatures are circels.
    LinkedList<Creature> creatures;
    // Plants are integrated into the nature.
    LinkedList<Plant> plants;

    //Stats
    int temperature;
    int moisture;
    int saltLevel;

    //Environment
    float water;
    float land;



    public WorldBlock() {
        children = new WorldBlock[10][10];
    }

}
