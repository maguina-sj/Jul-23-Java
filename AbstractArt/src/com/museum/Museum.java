package com.museum;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {

	public static void main(String[] args) {
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(new Painting("Mona Lisa", "DaVinci", "she is smirking", "oil" ));
		museum.add(new Painting("Starry Night", "Vincent Van Gogh", "very blue", "oil" ));
		museum.add(new Painting("The Scream", "Edvard Munch", "oh so scary", "oil"));
		museum.add(new Sculpture("The Thinker", "davinci", "he squatting and thinking", "marble"));
		museum.add(new Sculpture("David", "Michaelangelo", "he posing", "marble"));
		
		
		Collections.shuffle(museum);
		for (Art banana: museum) {
			banana.viewArt();
		}
	}

}
