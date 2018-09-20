package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import shared.Pokemon;

public class test_Database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pokemon> list_poke = new ArrayList<Pokemon>();
		Pokemon pika = new Pokemon("pikachu");
		Pokemon tortank = new Pokemon("tortank");
		list_poke.add(pika);
		list_poke.add(tortank);

				
		Database poke_data = new Database("liste_pokemon.txt");
		
		
		try {
			poke_data.savePokemons(list_poke);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			poke_data.loadPokemons() ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
