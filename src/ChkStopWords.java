public class ChkStopWords {
	public static String[] alphabet = {
			"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
			"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
			"w", "x", "y", "z"
	};
	
	public static String[] pronouns = {"i","we","he","she","it","they","her",
			"his","their","you","him","them"};
	
	public static String[] articles = {"a", "an", "the"};

	
	public static String[] prepositions = {
			"concerning","considering","off","aboard","about","above","across","after","against","along","among",
			"around","as","exclude","at","before","behind","below","beside",
			"besides","between","beyond","but","by","despite", "down", "during",
			"except", "following","for", "from","like", "minus","in", "inside","into",
			"near", "of","on", "onto", "over", "opposite","outside","past","per","plus","save", "since", "than", "to",
			"through", "toward", "towards", "under","unlike", "until", "up", "upon", "via","versus",
			"with", "within", "without"
	};
	
		
	public static String[] html = {
			"a","abbr","b","base","button","cite","code", "href", "p", "div", "img", "src", 
			"html", "http", "body","figure","span", "class", "id", "name", "target", "style","head", 
			"border","li","menu","q","small", "width", "height"
	};
	
	
	public static boolean isStopWord(String w) {
		String word = w.toLowerCase();
		for (String str : articles) {
			if (word.equals(str)) return true;
		}
		for (String str : pronouns) {
			if (word.equals(str)) return true;
		}
		for (String str : prepositions) {
			if (word.equals(str)) return true;
		}
		for (String str : html) {
			if (word.equals(str)) return true;
		}
		for (String str : alphabet) {
			if (word.equals(str)) return true;
		}
		return false;
	}
}
