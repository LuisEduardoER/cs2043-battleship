public class UnitTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carrier ac = new Carrier(0, 4, 'a', 'a');
		System.out.println(ac.isSunk());
		System.out.println(ac.getName());
		
		Cruiser cr = new Cruiser(0, 0, 'a', 'd');
		System.out.println(cr.isSunk());
		System.out.println(cr.getName());
	}

}
