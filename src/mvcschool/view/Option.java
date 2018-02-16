package mvcschool.view;

public class Option {
	/*=======Attributes=======*/
	private String description;
	/*=======Constructors=======*/
	/** Option()
	 * Option constructor
	 * @param String desc: description value
	 * @return nothing
	 */
	public Option(String desc) {
		description = desc;
	}
	/*=======Methods=======*/
	/** toString()
	 * converts option to string
	 * @param none
	 * @return String conversion
	 */
	public String toString() {
		return description;
	}	
}
