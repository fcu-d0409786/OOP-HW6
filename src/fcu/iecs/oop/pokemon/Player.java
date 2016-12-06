package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName ;
	private String Pokemon[] = new String[15];
	private int level =1 ;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String[] getPokemon() {
		return Pokemon;
	}
	public void setPokemon(String[] pokemon) {
		Pokemon = pokemon;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public Player (String playerName)
	{
		playerName = this.playerName;
		
	}

}
