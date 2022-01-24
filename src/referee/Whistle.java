package referee;

public interface Whistle {
	public void canWhistle();
}

class Player implements Whistle {
	String name;

	public Player(String name) {
		this.name = name;
	}

	@Override
	public void canWhistle() {
		System.out.printf("im %s player and i can whistle.%n", this.name);

	}
}
class PlayerProxy implements Whistle{
	String name;
	boolean isReferee ;
	Player player ;
	
	
/*
 * here inside the constructor we make conditions 
 */
	public PlayerProxy(String name) {
		this.name = name;               // here must outside if conditions otherwise name be null 
		if(name.equals("referee")) {     // if we not enter the if conditions 
			isReferee = true;
			player = new Player(name);
		}
	}

	@Override
	public void canWhistle() {
		if(isReferee) {
			player.canWhistle();   // we can create a player just when it's true and playre invoke it's method
		}else {
			if(name.equals("Ramos")) {
				System.out.println("you have Redkort");
			}else
				System.out.printf("Hi %s you can not whistling.%n",name);
		}
		
	}
	
}