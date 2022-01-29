package obj.game.level;

public abstract class PlayerLevel {
	
	protected int levelNumber;
	
	public PlayerLevel(int levelNumber) {
		super();
		this.levelNumber = levelNumber;
	}
	
	protected abstract void run();
	protected abstract void jump();
	protected abstract void turn();
	
	public abstract void showLevelMessage();
	
	final public void go() {
		run();
		for(int i = 0; i < levelNumber; i++) {
			jump();
		}
		turn();
	}
}
