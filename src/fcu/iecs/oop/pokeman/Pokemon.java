package fcu.iecs.oop.pokeman;

public class Pokemon {
	
	public  String name;
	public PokemonType clas;
	public int cp ;
	
	
	public  Pokemon(String N , PokemonType T ,int C)
	{
		
		name = N;
		cp =  C;
		clas = T;
		
	}
	public String getNme()
	{
		
		return name ; 
	}
	public int getcp()
	{
		return cp;
	}
	public PokemonType getType()
	{
		return clas;
	}
	
	

}
