package pokemon.pokemons;

import main.Main;
import pokemon.Pokemon;
import utils.ArrayListUtils;

public class Squirtle extends Pokemon {

	public Squirtle() {
		super("Squirtle", ArrayListUtils.findTypeByName(Main.getTypeLib(), "Water"), null, 44, 48, 65, 50, 64, 43);
	}

}
