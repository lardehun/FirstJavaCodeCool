package week9AClasses;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;



public class MovieManager {
	static final File XMLLOCATION = new File("C:\\JavaWorksPlace\\Week9A\\Movies\\movies.xml");
	
	public static void main() {
		Person willsmith = new Person("Will","Smith",Gender.MALE,false,true);
		Person chucknorris = new Person("Chuck","Norris",Gender.MALE,false,true);
		Person sylvesterstalone = new Person("Sylvester","Stalone",Gender.MALE,false,true);	
		List<Person> demoCast = new ArrayList<Person>();
			demoCast.add(willsmith);
			demoCast.add(chucknorris);
			demoCast.add(sylvesterstalone);
		
		Movie legend = new Movie("Legend", Genre.DRAMA, 100, 9,demoCast);
		Movie theShark = new Movie("TheShark", Genre.HORROR, 120, 3,demoCast);
		Movie illusionist = new Movie("Legend", Genre.THRILLER, 160, 10,demoCast);
		List<Movie> demoMovies = new ArrayList<Movie>();
			demoMovies.add(legend);
			demoMovies.add(theShark);
			demoMovies.add(illusionist);
	}
	
	public static void createNewXMLFile() {
	    try {
	        if (XMLLOCATION.createNewFile()) {      
	            FileWriter writer = new FileWriter(XMLLOCATION);
	            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
	            writer.flush();
	            writer.close();
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
