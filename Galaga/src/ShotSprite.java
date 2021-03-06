import java.awt.Image;

public class ShotSprite extends Sprite {
	private GalagaGame game;

	public ShotSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game = game;
		dy = -10; // 불꽃 움직이는 속도
	}

	@Override
	public void move() {
		super.move();
		if (y < -1000) {
			game.removeSprite(this);
		}
	}

	@Override
	public void handleCollision(Sprite other) {

		if (other instanceof AlienSprite) {
			game.removeSprite(this);
			game.removeSprite(other);
		}
	}
}