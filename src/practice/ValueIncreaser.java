/**
 * 
 */
package practice;

/**
 * @author nikitarai
 *
 */
public class ValueIncreaser {

	private int value = 0;
	
	
	private static ValueIncreaser valueIncreaser = null;
	
	private ValueIncreaser() {
		
	}
	
	public synchronized static ValueIncreaser getSingleton() {
		if(valueIncreaser == null) {
			valueIncreaser = new ValueIncreaser();
		}
		return valueIncreaser;
	}
	
	

    /**
     * if newValue > old value, set new value
     * otherwise do nothing.
     * @param newValue
     */
    public void setValue(int newValue) {

           synchronized (valueIncreaser) {
        	   if (newValue > value) {
                   value = newValue;
               }	
		} 
    }

    /**
     * never returns a value less than a prior call to getValue()
     * @return
     */
    public int getValue() {
        return value;
    }
}
