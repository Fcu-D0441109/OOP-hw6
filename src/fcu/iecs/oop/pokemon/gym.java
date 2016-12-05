package fcu.iecs.oop.pokemon;

import java.util.Random;
public class gym {
	public static void main(String[] args) {
		

	}
	public static  player fight(player ... players)
	{
		int a = 0;
		int b = 0;
		int c = 0;
		player [] pp = new player[2];
		for(player aName: players) {
			pp[c] = aName;
			c++;
		    }
		Random r1 = new Random();
		for(int i = 0;i<=2;i++)
		{
			if(pp[0].monster[i].get_type()==pokemon_type.fire&&pp[1].monster[i].get_type()==pokemon_type.grass)
			{
				a++;
			}
			else if(pp[0].monster[i].get_type()==pokemon_type.water&&pp[1].monster[i].get_type()==pokemon_type.fire)
			{
				a++;
			}
			else if(pp[0].monster[i].get_type()==pokemon_type.grass&&pp[1].monster[i].get_type()==pokemon_type.water)
			{
				a++;
			}
			else if(pp[0].monster[i].get_type()==pokemon_type.grass&&pp[1].monster[i].get_type()==pokemon_type.fire)
			{
				b++;
			}
			else if(pp[0].monster[i].get_type()==pokemon_type.fire&&pp[1].monster[i].get_type()==pokemon_type.water)
			{
				b++;
			}
			else if(pp[0].monster[i].get_type()==pokemon_type.water&&pp[1].monster[i].get_type()==pokemon_type.grass)
			{
				b++;
			}
			else if(pp[0].monster[i].get_type()==pp[1].monster[i].get_type())
			{
				if(pp[0].monster[i].get_cp()>pp[1].monster[i].get_cp())
				{
					a++;
				}
				else if(pp[0].monster[i].get_cp()<pp[1].monster[i].get_cp())
				{
					b++;
				}
				else if(pp[0].monster[i].get_cp()==pp[1].monster[i].get_cp())
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
