package fcu.iecs.oop.pokemon;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		player player1 = new player("player one");
		pokemon pk1 = new pokemon("Bulbasaur", pokemon_type.grass, 123);
		pokemon pk2 = new pokemon("Charmander", pokemon_type.fire, 456);
		pokemon pk3 = new pokemon("psyduck", pokemon_type.water, 91);
		pokemon [] pkms1 = {pk1,pk2,pk3};
		player1.setPokemon(pkms1);

		
	    player player2 = new player("Player Two");
	    pokemon pkm21 = new pokemon("Seel", pokemon_type.water, 432);
	    pokemon pkm22 = new pokemon("Gyarados", pokemon_type.water, 987);
	    pokemon pkm23 = new pokemon("Horsea", pokemon_type.water, 91);
	    pokemon[] pkms2 = { pkm21, pkm22, pkm23 };
	    player2.setPokemon(pkms2);
	    
	    System.out.print(gym.fight(player1,player2).get_name()+" win ");
	    gym.fight(player1,player2).level_up();
	}

}
