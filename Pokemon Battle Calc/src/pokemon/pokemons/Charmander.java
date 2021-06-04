package pokemon.pokemons;

import main.Main;
import pokemon.Pokemon;
import utils.ArrayListUtils;

public class Charmander extends Pokemon {

	public Charmander() {
		super("Charmander", ArrayListUtils.findTypeByName(Main.getTypeLib(), "Fire"), null, 39, 52, 43, 60, 50, 65);
	}

}
