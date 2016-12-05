package fcu.iecs.oop.pokemon;

public class pokemon {
	public  String name;
	public pokemon_type p1;
	int cp;
	public  pokemon(String n , pokemon_type p ,int c)
	{
		name = n;
		p1 = p;
		cp = c;
	}
	public static void main(String[] args) {
		
	}
	public  String get_name()
	{
		return name;
	}
	public pokemon_type get_type()
	{
		return p1;
	}
	public int get_cp()
	{
		return cp;
	}
	public void set_cp()
	{
		
	}

}
