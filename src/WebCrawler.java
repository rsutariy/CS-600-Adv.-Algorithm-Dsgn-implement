import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WebCrawler {

	public static void main(String[] args) {
		
		String url = "http://www.google.com/";
		CollectInfo Info = new CollectInfo();
		Info.search(url);	
		
		String search_string = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\nEnter any word you want to search:");
			search_string = scanner.nextLine();
			if (search_string.equals("quit")) {
				break;
			}
			Set<String> urls = HandleResponse.searchForWord(search_string);
			Iterator<String> iterator = urls.iterator();
			System.out.println("URL that contain this keywords are: ");
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.print("\n");
		} while (true);
		scanner.close();
	
	}
}
