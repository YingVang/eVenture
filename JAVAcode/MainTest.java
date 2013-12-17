
import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortLibByTitle() {
		
		StoryInfo storyInfo1 = new StoryInfo("Shon", "Shon's Story", "2013");
		StoryInfo storyInfo2 = new StoryInfo("Anthony", "Anthony's Story", "2010");
		StoryInfo storyInfo3 = new StoryInfo("John", "John's Story", "2015");
		StoryInfo storyInfo4 = new StoryInfo("Matt", "Matt's Story", "2012");
		StoryInfo storyInfo5 = new StoryInfo("Ying", "Ying's Story", "2013");

		Story story1 = new Story(storyInfo1);
		Story story2 = new Story(storyInfo2);
		Story story3 = new Story(storyInfo3);
		Story story4 = new Story(storyInfo4);
		Story story5 = new Story(storyInfo5);
		
		Vector<Story> storylib = new Vector<Story>();
		int j=storylib.size();	
		
		storylib.add(story1);
		storylib.add(story2);
		storylib.add(story3);
		storylib.add(story4);
		storylib.add(story5);
		
		Main m = new Main();
		m.sortLibByTitle(storylib);
		
		String a = storylib.get(0).getStoryInfo().getTitle();
		assertTrue(a=="Anthony's Story");
		String b = storylib.get(1).getStoryInfo().getTitle();
		assertTrue(b=="John's Story");
		String c = storylib.get(2).getStoryInfo().getTitle();
		assertTrue(c=="Matt's Story");
		String d = storylib.get(3).getStoryInfo().getTitle();
		assertTrue(d=="Shon's Story");
		String e = storylib.get(4).getStoryInfo().getTitle();
		assertTrue(e=="Ying's Story");
		
	}

	@Test
	public void testSortLibByAuthor() {

		StoryInfo storyInfo1 = new StoryInfo("Shon", "Shon's Story", "2013");
		StoryInfo storyInfo2 = new StoryInfo("Anthony", "Anthony's Story", "2010");
		StoryInfo storyInfo3 = new StoryInfo("John", "John's Story", "2015");
		StoryInfo storyInfo4 = new StoryInfo("Matt", "Matt's Story", "2012");
		StoryInfo storyInfo5 = new StoryInfo("Ying", "Ying's Story", "2013");

		Story story1 = new Story(storyInfo1);
		Story story2 = new Story(storyInfo2);
		Story story3 = new Story(storyInfo3);
		Story story4 = new Story(storyInfo4);
		Story story5 = new Story(storyInfo5);
		
		Vector<Story> storylib = new Vector<Story>();
		int j=storylib.size();	
		
		storylib.add(story1);
		storylib.add(story2);
		storylib.add(story3);
		storylib.add(story4);
		storylib.add(story5);
		
		Main m = new Main();
		m.sortLibByAuthor(storylib);
		
		String a = storylib.get(0).getStoryInfo().getAuthor();
		assertTrue(a=="Anthony");
		String b = storylib.get(1).getStoryInfo().getAuthor();
		assertTrue(b=="John");
		String c = storylib.get(2).getStoryInfo().getAuthor();
		assertTrue(c=="Matt");
		String d = storylib.get(3).getStoryInfo().getAuthor();
		assertTrue(d=="Shon");
		String e = storylib.get(4).getStoryInfo().getAuthor();
		assertTrue(e=="Ying");
	
	}
	
	@Test
	public void testSortLibByDate() {
		
		StoryInfo storyInfo1 = new StoryInfo("Shon", "Shon's Story", "2013");
		StoryInfo storyInfo2 = new StoryInfo("Anthony", "Anthony's Story", "2010");
		StoryInfo storyInfo3 = new StoryInfo("John", "John's Story", "2015");
		StoryInfo storyInfo4 = new StoryInfo("Matt", "Matt's Story", "2012");
		StoryInfo storyInfo5 = new StoryInfo("Ying", "Ying's Story", "2013");

		Story story1 = new Story(storyInfo1);
		Story story2 = new Story(storyInfo2);
		Story story3 = new Story(storyInfo3);
		Story story4 = new Story(storyInfo4);
		Story story5 = new Story(storyInfo5);
		
		Vector<Story> storylib = new Vector<Story>();
		int j=storylib.size();	
		
		storylib.add(story1);
		storylib.add(story2);
		storylib.add(story3);
		storylib.add(story4);
		storylib.add(story5);
		
		Main m = new Main();
		m.sortLibByDate(storylib);
		
		String a = storylib.get(0).getStoryInfo().getDateWritten();
		assertTrue(a=="2010");
		String b = storylib.get(1).getStoryInfo().getDateWritten();
		assertTrue(b=="2012");
		String c = storylib.get(2).getStoryInfo().getDateWritten();
		assertTrue(c=="2013");
		String d = storylib.get(3).getStoryInfo().getDateWritten();
		assertTrue(d=="2013");
		String e = storylib.get(4).getStoryInfo().getDateWritten();
		assertTrue(e=="2015");
		
	}
	
}
