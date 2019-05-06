/**
 * 
 */
package practice;

/**
 * @author nikitarai
 *
 */
public class ValueIncreaser2 {

	private int value = 0;
	

    /**
     * if newValue > old value, set new value
     * otherwise do nothing.
     * @param newValue
     */
    public void setValue(int newValue) {

            if (newValue > value) {
                value = newValue;
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
