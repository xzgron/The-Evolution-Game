package environment;

import organisms.Organism;

/**
 * Created by Noah on 2015-12-27.
 * Populations evolves together and develop into new races. They can split and other stuff.
 */


public class Population <Race extends Organism> {
    Race organism;

    public Population() {

    }
}
