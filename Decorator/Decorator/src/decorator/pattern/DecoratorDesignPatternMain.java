package decorator.pattern;

public class DecoratorDesignPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room = new CurtainDecorator(new ColorDecorator(new SimpleRoom()));  
		System.out.println(room.showRoom()); 
	}

}
