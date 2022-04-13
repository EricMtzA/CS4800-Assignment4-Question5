/**
 * 
 */
package question5;

/**
 * @author Eric Alonso Martinez
 *
 */
public class Account {
		private AccountHolder holder;
		private double balance = 0.0;
		
		
		public Account(double amount, AccountHolder holder) {
			
		}
		
		public void deposit(double amount) {
			
		}
		
		public void withdraw(double amount) {
			
		}
		
		/**
		 * @return the holder
		 */
		public AccountHolder getHolder() {
			return holder;
		}
		/**
		 * @param holder the holder to set
		 */
		public void setHolder(AccountHolder holder) {
			this.holder = holder;
		}
		/**
		 * @return the balance
		 */
		public double getBalance() {
			return balance;
		}
		/**
		 * @param balance the balance to set
		 */
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		
}
