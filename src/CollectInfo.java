import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectInfo {
	private static final int MAX_PAGES = 10;
	private Set<String> pagesVisited = new HashSet<String>();
	private List<String> pagesTOVisit = new LinkedList<>();
	
	public void search(String url) {
		while(this.pagesVisited.size()< MAX_PAGES){
			
			String currentUrl;
			HandleResponse Response = new HandleResponse();
			
			if(this.pagesTOVisit.isEmpty()){
				currentUrl = url;
				this.pagesVisited.add(url);
			}
			else{
				currentUrl = this.nextUrl();
			}
			System.out.println("Crawling of Site: "+currentUrl);
			Response.crawl(currentUrl); 
			
			this.pagesTOVisit.addAll(Response.getLinks());
		}	
	}

	private String nextUrl(){
		String nextURL;
		do{
			nextURL = this.pagesTOVisit.remove(0);
		}while(this.pagesVisited.contains(nextURL));
		this.pagesVisited.add(nextURL);
		
		return nextURL;		
	}
}