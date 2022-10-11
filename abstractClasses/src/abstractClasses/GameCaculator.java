package abstractClasses;

public abstract class GameCaculator {
	public abstract void hesapla();

	public final void gameover() {
		System.out.println("Oyun bitti");
	}
}
