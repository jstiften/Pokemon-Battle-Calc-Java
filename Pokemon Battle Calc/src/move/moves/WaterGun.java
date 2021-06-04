package move.moves;

import main.Main;
import move.Move;
import utils.ArrayListUtils;

public class WaterGun extends Move{

	public WaterGun() {
		super("Water Gun", ArrayListUtils.findTypeByName(Main.getTypeLib(), "Water"), 40, 100);
	}
	
}
