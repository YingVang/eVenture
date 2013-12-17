import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StoryInfoTest {

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
	public void testGetAuthor() {
		StoryInfo storyInfo1 = new StoryInfo("Shon", "TestStory", "2013");
		String s = storyInfo1.getAuthor();
		assertTrue(s=="Shon");
	}
	
	@Test
	public void testGetTitle() {
		StoryInfo storyInfo1 = new StoryInfo("Shon", "TestStory", "2013");
		String s = storyInfo1.getTitle();
		assertTrue(s=="TestStory");
	}
	
	@Test
	public void testGetDateWritten() {
		StoryInfo storyInfo1 = new StoryInfo("Shon", "TestStory", "2013");
		String s = storyInfo1.getDateWritten();
		assertTrue(s=="2013");
	}
	
	@Test
	public void testSetAuthor() {
		StoryInfo storyInfo1 = new StoryInfo("Shon", "TestStory", "2013");
		String newAuthor = "Anthony";
		storyInfo1.setAuthor(newAuthor);
		assertTrue(newAuthor==storyInfo1.getAuthor());
	}
	
	@Test
	public void testSetTitle() {
		StoryInfo storyInfo1 = new StoryInfo("Shon", "TestStory", "2013");
		String newTitle = "NewTestTitle";
		storyInfo1.setTitle(newTitle);
		assertTrue(newTitle==storyInfo1.getTitle());
	}
	
	@Test
	public void testSetDateWritten() {
		StoryInfo storyInfo1 = new StoryInfo("Shon", "TestStory", "2013");
		String newDate = "2015";
		storyInfo1.setDateWritten(newDate);
		assertTrue(newDate==storyInfo1.getDateWritten());
	}

}
