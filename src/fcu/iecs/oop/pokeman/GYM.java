package fcu.iecs.oop.pokeman;

import java.util.Random;


public class GYM {

	public static void main(String[] args) {
		

	}
	
	public static Player fight(Player ... players)
	{
		int a = 0;
		int b = 0;
		Player [] pp;  
		pp = players;
		for(int i = 0;i<=2;i++)
		{
			if(pp[0].pokemons[i].getType()==PokemonType.FIRE&&pp[1].pokemons[i].getType()==PokemonType.grass)
			{
				a++;
			}
			else if(pp[0].pokemons[i].getType()==PokemonType.WATER&&pp[1].pokemons[i].getType()==PokemonType.FIRE)
			{
				a++;
			}
			else if(pp[0].pokemons[i].getType()==PokemonType.grass&&pp[1].pokemons[i].getType()==PokemonType.WATER)
			{
				a++;
			}
			else if(pp[0].pokemons[i].getType()==PokemonType.grass&&pp[1].pokemons[i].getType()==PokemonType.FIRE)
			{
				b++;
			}
			else if(pp[0].pokemons[i].getType()==PokemonType.FIRE&&pp[1].pokemons[i].getType()==PokemonType.WATER)
			{
				b++;
			}
			else if(pp[0].pokemons[i].getType()==PokemonType.WATER&&pp[1].pokemons[i].getType()==PokemonType.grass)
			{
				b++;
			}
			else if(pp[0].pokemons[i].getType()==pp[1].pokemons[i].getType())
			{
				if(pp[0].pokemons[i].getcp()>pp[1].pokemons[i].getcp())
				{
					a++;
				}
				else if(pp[0].pokemons[i].getcp()<pp[1].pokemons[i].getcp())
				{
					b++;
				}
				else if(pp[0].pokemons[i].getcp()==pp[1].pokemons[i].getcp())
				{
					Random r11 = new Random();
					int g = r11.nextInt(2);
					if(g==0)
					{
						a++;
					}
					else if(g==1)
					{
						b++;
					}
				}
			}
		}
		if(a>=2)
		{
			return pp[0];
		}
		else if(b>=2)
		{
			return pp[1];
		}
		else
		return null;
		
		
	}


	
	
}
