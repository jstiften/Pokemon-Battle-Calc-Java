package pokemon.pokemons;

import main.Main;
import pokemon.Pokemon;
import utils.ArrayListUtils;

public class Bulbasaur extends Pokemon {

	public Bulbasaur() {
		super("Bulbasaur", ArrayListUtils.findTypeByName(Main.getTypeLib(), "Grass"),
				ArrayListUtils.findTypeByName(Main.getTypeLib(), "Poison"), 45, 45, 49, 65, 65, 45);
	}

}
