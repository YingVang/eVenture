import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StoryTest {

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
	public void testSetStoryInfo(){
		Story testStory = new Story();
		StoryInfo storyInfo1 = new StoryInfo("Shon", "TestStory", "2013");
		testStory.setStoryInfo(storyInfo1);
		assertTrue(storyInfo1==testStory.getStoryInfo());
	}
	
	@Test
	public void testSetStoryTree(){
		
	}
	
	@Test
	public void testGetStoryInfo() {
		StoryInfo storyInfo1 = new StoryInfo("Shon", "TestStory", "2013");
		Story testStory = new Story(storyInfo1);
		Story temp = new Story(testStory.getStoryInfo());
		assertTrue(storyInfo1==temp.getStoryInfo());
	}
	
	@Test
	public void testGetStoryTree() {
		//StoryTree storyTree1 = new StoryTree();
		//Story testStory = new Story();
	
		//assertTrue(storyTree1==temp.getStoryTree());
	}

}
