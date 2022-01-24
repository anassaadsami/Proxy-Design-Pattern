package ProxyIntro;

interface Proxy {
	public void permession(int age);
	/*
	 * the Boss and the Secretary implements Porxy so they share this abstract method 
	 */

}

class Boss implements Proxy {
	/*
	 * just these objects which have permission to enter ( allowed ) can connect to
	 * the Boss class so the check control occur outside Boss class we can say the
	 * secretary make this check and it is not the Boss's job
	 */

	@Override
	public void permession(int age) {
		System.out.printf("%d welcome here at the Boss.%n", age);
	}

}

class Secretary implements Proxy { // via Secretary you can connect the Boss class if your age is allowed
	int[] allowedAges = { 40, 45, 50 }; // allowed list at the proxy all the time not at the Boss
	 
	/*
	 * in this class we have not constructor so we invoke default non parameterised constructor
	 */
	Boss boss = new Boss(); // CREATE OBJECT BOSS TO CAN USE IT INSIDE IMPLEMENTATION

	@Override
	/*
	 * here in delegate class we make the comparison
	 */
	public void permession(int age) {
		boolean flag = false;
		for (int i = 0; i < allowedAges.length; i++) {
			if (age == allowedAges[i]) { // if your age is allowed so you can connect with the Boss
				flag = true;
			}
		}
		if (flag) {
			boss.permession(age);
		} else {
			System.out.printf("%d your not the list.%n", age);

		}

	}
}
