package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion() {
	}
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLife() {
		return life;
	}
	
	
	public void setLife(int life) {
		this.life = life;
	}
	
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamege(Champion champion) {
		if(attack < champion.armor) {
			champion.life = champion.life - 1;
		}
		else {
			champion.life -= attack - champion.armor;
		}
		
		
	}
	
	public String status() {
		if (this.life > 0) {
			return name + ": " + life + " de vida";
		}
		else {
			life = 0;
			return name + ": " + life + " de vida (morreu)";
		}		
	}

}
