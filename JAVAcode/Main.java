import java.util.Vector;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Essentially the library of stories
		Vector<Story> storylib = new Vector<Story>();		
		Integer j=storylib.size();	
		
		//these vectors will be used for the search bar
		Vector<String> authVec = new Vector<String>();
		for(Integer i=0; i<j; i++){
			String auth = storylib.get(i).getStoryInfo().getAuthor();
			authVec.add(auth);
		}
			
		Vector<String> titleVec = new Vector<String>();
		for(Integer x=0; x<j; x++){
			String titl = storylib.get(x).getStoryInfo().getTitle();
			titleVec.add(titl);
		}
		
		Vector<Integer> dateVec = new Vector<Integer>();
		for(Integer y=0; y<j; y++){
			Integer dat = storylib.get(y).getStoryInfo().getDateWritten();
			dateVec.add(dat);
		}
		 	
	}
	

	
	
}
