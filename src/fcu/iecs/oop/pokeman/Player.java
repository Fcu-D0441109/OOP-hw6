package fcu.iecs.oop.pokeman;

public class Player {

	public String Name;
	public int level = 1 ;
	public Pokemon[] pokemons;
	
	
	public Player(String playerName) {
		// TODO Auto-generated constructor stub
		Name = playerName;
	}
	
	public void setPokemons(Pokemon ... p1)
	{
		pokemons=p1;
	}

	
	
	public String Getplaer()
	{
		
		return Name ;
		
	}

	public Pokemon[] getpoke()
	{
		
		return pokemons ;
		
	}

	
	
	
}
