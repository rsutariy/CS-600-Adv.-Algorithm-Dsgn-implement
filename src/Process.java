public class Process {
	public static Trie trie = new Trie('$');

	public void addPagewithURL(String page, String url) {
		
		String[] words = page.split(" ");
		for(String word : words){
			if(word.trim().length()>0  && WordFilter(word) && !ChkStopWords.isStopWord(word)){
				WordProcessing(word.trim(), url);
			}
		}	
	}

	private boolean WordFilter(String word) {
		if( word.equals("|")|| word.equals("+")|| word.equals("-")
				|| word.equals("=")|| word.equals("!")|| word.equals("@")
				|| word.equals("#")|| word.equals("$")|| word.equals("%")
				|| word.equals("^")|| word.equals("&")|| word.equals("*")
				|| word.equals("(")|| word.equals(")")|| word.equals("_")||
				word.equals(",") || word.equals(".") || word.equals("/")
				||word.equals("==") ||word.equals("//")
				|| word.equals("\"")|| word.equals("[")|| word.equals("]")
				|| word.equals("\\")|| word.equals("/{")|| word.equals("}")
				|| word.equals("<")|| word.equals(">")|| word.equals("?")
				|| word.equals(";")|| word.equals("'")|| word.equals(":")
				
				){
			
			return false;	
		}
		return true;
	}

	private void WordProcessing(String w, String url) {
		String word = w.toLowerCase();
		int i = 0;
		Trie t = trie;
		while(i < word.length()) {
			t.addChild(word.charAt(i));
			t = t.getChild(word.charAt(i));
			i++;
		}
		t.addUrls(url);
	}
}
