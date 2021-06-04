package main;

import java.util.ArrayList;

import move.Move;
import move.moves.Ember;
import move.moves.VineWhip;
import move.moves.WaterGun;
import pokemon.Pokemon;
import pokemon.pokemons.Bulbasaur;
import pokemon.pokemons.Charmander;
import pokemon.pokemons.Squirtle;
import type.Type;
import type.types.Electric;
import type.types.Fire;
import type.types.Grass;
import type.types.Poison;
import type.types.Water;

public class Main {

	private static ArrayList<Type> typeLib;
	private static ArrayList<Move> moveLib;
	private static ArrayList<Pokemon> pokemonLib;
	
	public static void main(String args[]) {
		initTypeLib();
		initMoveLib();
		initPokemonLib();
	}
	
	public static void initTypeLib() {
		if(typeLib == null) {
			typeLib = new ArrayList<Type>();
		}
		typeLib.add(new Fire());
		typeLib.add(new Grass());
		typeLib.add(new Water());
		typeLib.add(new Electric());
		typeLib.add(new Poison());
	}
	
	public static ArrayList<Type> getTypeLib(){
		if(typeLib == null) {
			typeLib = new ArrayList<Type>();
		}
		return typeLib;
	}
	
	public static void initMoveLib() {
		if(moveLib == null) {
			moveLib = new ArrayList<Move>();
		}
		moveLib.add(new Ember());
		moveLib.add(new WaterGun());
		moveLib.add(new VineWhip());
	}
	
	public static ArrayList<Move> getMoveLib(){
		if(moveLib == null) {
			moveLib = new ArrayList<Move>();
		}
		return moveLib;
	}
	
	public static void initPokemonLib() {
		if(pokemonLib == null) {
			pokemonLib = new ArrayList<Pokemon>();
		}
		pokemonLib.add(new Bulbasaur());
		pokemonLib.add(new Charmander());
		pokemonLib.add(new Squirtle());
		
	}
	
	public static ArrayList<Pokemon> getPokemonLib(){
		if(pokemonLib == null) {
			pokemonLib = new ArrayList<Pokemon>();
		}
		return pokemonLib;
	}
	
}
