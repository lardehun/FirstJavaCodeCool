package week9AClasses;

import java.util.List;
import java.util.HashMap;

public class Tools {
	public static String toXMLTag(String tag,String value) {
		return (("<" + tag + ">")+ value +("</" + tag + ">"));	
	}
	
	public static String[] getMovieTitles(List<Movie> movies) {
		String[] movietitles = new String[movies.size()];
		for (int i=0; i < movies.size() ; i++) {
			movietitles[i] = movies.get(i).getTitle();
		}
		return movietitles;
	}
	
	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies)
	{
	    HashMap<Person, Integer> countMap = new HashMap<Person, Integer>();
	    for (Movie movie : movies)
	    {
	        for (Person person : movie.getCast())
	        {
	            if (!countMap.containsKey(person))
	            {
	                countMap.put(person, new Integer(0));
	            }
	            countMap.put(person, countMap.get(person) + 1);
	        }
	    }
	    return countMap;
	}
}
