package move.moves;

import main.Main;
import move.Move;
import utils.ArrayListUtils;

public class VineWhip extends Move{

	public VineWhip() {
		super("Vine Whip", ArrayListUtils.findTypeByName(Main.getTypeLib(), "Grass"), 45, 100);
	}
	
}
