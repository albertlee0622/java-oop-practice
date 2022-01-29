package obj.game.player;

import obj.game.level.*;

public class Player {
	PlayerLevel level;
	
	public Player(PlayerLevel level) {
		super();
		this.level = level;
	}

	public void getLevel() {
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel newLevel) {
		this.level = newLevel;
	}
	
	public void play() {
		level.go();
	}
	
	public static void main(String[] args) {
		PlayerLevel beginner = new BeginnerLevel();
		PlayerLevel advancedPlayer = new AdvancedLevel();
		PlayerLevel superPlayer = new SuperLevel();
		
		Player player = new Player(beginner);
		player.getLevel();
		player.play();
		player.upgradeLevel(advancedPlayer);
		player.getLevel();
		player.play();
		player.upgradeLevel(superPlayer);
		player.getLevel();
		player.play();
	}

}
