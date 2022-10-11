package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameover();
		
		GameCaculator gameCaculator = new KidsGameCalculator();
		gameCaculator.hesapla();
		gameCaculator.gameover();
	}

}
