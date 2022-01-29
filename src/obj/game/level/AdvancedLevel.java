package obj.game.level;

public class AdvancedLevel extends PlayerLevel {

	public AdvancedLevel() {
		super(2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void run() {
		System.out.println("running fast~~~");
	}

	@Override
	protected void jump() {
		System.out.println("jumping high~~~");
	}

	@Override
	protected void turn() {
		System.out.println("Nooo... not turning");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("I'm a level-" + levelNumber + " advanced player." );
	}
}
