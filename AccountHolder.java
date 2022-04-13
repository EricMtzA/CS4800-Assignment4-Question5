/**
 * 
 */
package question5;

import java.util.Random;

/**
 * @author Eric Alonso Martinez
 *
 */
public class AccountHolder {
		static private int id;
		static private String address;
		
		public AccountHolder(int id, String address) {
			
		}
		
		public int getNextID() {
			Random rand = new Random();
			int upperBound = 100000;
			int randomInt = rand.nextInt(upperBound + 1);
			
			return randomInt;	
		}
}
