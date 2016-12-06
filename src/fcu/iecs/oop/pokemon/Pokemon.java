package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name = null;
	int cp  ;
	public enum PokemonType {
		  FIRE, WATER, GRASS
		}
	private final PokemonType type = null;
	
	
	public void Enumtype (PokemonType type)
	{
		type = this.type;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public String getName() {
		return name;
	}


	public PokemonType getType() {
		return type;
	}

	
	public Pokemon(String name ,PokemonType  type, int cp)
	{
		name = this.name;
		type = this.type;
		cp = this.cp;
	}
	
	


}
