package obj.game.level;

public class BeginnerLevel extends PlayerLevel {

	public BeginnerLevel() {
		super(1);
	}

	@Override
	protected void run() {
		System.out.println("running slowly...");
	}

	@Override
	protected void jump() {
		System.out.println("Nooo... not jumping");
	}

	@Override
	protected void turn() {
		System.out.println("Nooo... not turning");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("I'm a level-" + levelNumber + " beginner." );
	}
}
