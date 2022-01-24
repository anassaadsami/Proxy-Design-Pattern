package referee;

public class Main {

	public static void main(String[] args) {
		PlayerProxy player1 = new PlayerProxy("anas");
		PlayerProxy player2 = new PlayerProxy("referee");
		player1.canWhistle();
		player2.canWhistle();

		

	}

}
