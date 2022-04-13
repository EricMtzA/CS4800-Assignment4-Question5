/**
 * 
 */
package question5;

/**
 * @author Eric Alonso Martinez
 *
 */
public class IndividualHolder extends AccountHolder implements Util {
		private String name;
		private String ssn;
		
		public IndividualHolder(int ID, String address, String name, String ssn) {
			super(ID, address);
			this.name = name;
			this.ssn = ssn;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the ssn
		 */
		public String getSsn() {
			return ssn;
		}

		/**
		 * @param ssn the ssn to set
		 */
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		
}
