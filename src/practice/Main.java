/**
 * 
 */
package practice;

/**
 * @author nikitarai
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		//Singleton
		ValueIncreaser valueIncreaser = ValueIncreaser.getSingleton();
		System.out.println(valueIncreaser);
		valueIncreaser.setValue(45);
		
		ValueIncreaser valueIncreaser2 = ValueIncreaser.getSingleton();
		System.out.println(valueIncreaser2);
		System.out.println(valueIncreaser2.getValue());
		
		
		
		//Non-singleton
		ValueIncreaser2 valueIncreaser22 = new ValueIncreaser2();
		System.out.println(valueIncreaser22);
		valueIncreaser22.setValue(90);
		
		ValueIncreaser2 valueIncreaser23 = new ValueIncreaser2();
		System.out.println(valueIncreaser23);
		System.out.println(valueIncreaser23.getValue());
				
	}

}
