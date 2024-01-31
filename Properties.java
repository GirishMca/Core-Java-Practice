package demo;

import java.util.*;

public class Properties {

	public static void main(String[] args)
	{
		Properties films = new Properties();
		
		films.put("Star Wars", "Revenge of the jedi");
		films.put("Batman", "The Dark Knight");
		films.put("Lord of the Rings", "The Two Towers");
		
		System.out.println(films);
		System.out.println(films.get("Star Wars"));
		
		
		

	}

}
