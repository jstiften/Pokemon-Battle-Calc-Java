package move.moves;

import main.Main;
import move.Move;
import utils.ArrayListUtils;

public class Ember extends Move{

	public Ember() {
		super("Ember", ArrayListUtils.findTypeByName(Main.getTypeLib(), "Fire"), 40, 100);
	}
	
}
