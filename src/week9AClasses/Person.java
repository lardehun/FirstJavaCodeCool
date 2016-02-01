package week9AClasses;

public class Person {
	String firstName;
	String lastName;
	Gender gender;
	boolean hasOscar;
	boolean hasGoldenGlobe;
	
	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldenGlobe = hasGoldenGlobe;
	    }
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public Gender getGender() {
		return gender;
		
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
		
	}
	
	public boolean isHasOscar() {
		return hasOscar;
		
	}
	
	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
		
	}
	
	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
		
	}
	
	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
		
	}
	public String toXMLString(){
	    StringBuilder XMLString = new StringBuilder();
	    XMLString.append("<person>");
	    XMLString.append(Tools.toXMLTag("firstName", getFirstName()));
	    XMLString.append(Tools.toXMLTag("lastName", getLastName()));
	    XMLString.append(Tools.toXMLTag("gender", String.valueOf(getGender())));
	    XMLString.append(Tools.toXMLTag("hasOscar", String.valueOf(isHasOscar())));
	    XMLString.append(Tools.toXMLTag("hasGoldenGlobe", String.valueOf(isHasGoldenGlobe())));
	    XMLString.append("</person>");
	    return XMLString.toString();
	}
}

