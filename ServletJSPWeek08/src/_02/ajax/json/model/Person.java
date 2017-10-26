package _02.ajax.json.model;

public class Person {
	
	private String name;
	private String surname;
	private String gender;
	public Person() {
		super();
	}
	public Person(String namae, String surname, String gender) {
		super();
		this.name = namae;
		this.surname = surname;
		this.gender = gender;
	}
	/**
	 * @return the namae
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param namae the namae to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", gender=" + gender + "]";
	}
	
}
