package obj.game.level;

public class SuperLevel extends PlayerLevel {

	public SuperLevel() {
		super(3);
	}

	@Override
	protected void run() {
		System.out.println("running super fast!!!");
	}

	@Override
	protected void jump() {
		System.out.println("jumping super high!!!");
	}

	@Override
	protected void turn() {
		System.out.println("turning~~~");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("I'm a level-" + levelNumber + " super player." );
	}
}
