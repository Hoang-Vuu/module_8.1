import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    StringManipulator manipulator = new StringManipulator();

    @Test
    void testConcatenate() {
        String result = manipulator.concatenate("Hello", "World");
        assertEquals("HelloWorld", result);
    }

    @Test
    void testFindLength() {
        int length = manipulator.findLength("OpenAI");
        assertEquals(6, length);
    }

    @Test
    void testConvertToUpperCase() {
        String upper = manipulator.convertToUpperCase("chatGPT");
        assertEquals("CHATGPT", upper);
    }

    @Test
    void testConvertToLowerCase() {
        String lower = manipulator.convertToLowerCase("JAVA");
        assertEquals("java", lower);
    }

    @Test
    void testContainsSubstring() {
        assertTrue(manipulator.containsSubstring("artificial intelligence", "intel"));
        assertFalse(manipulator.containsSubstring("machine learning", "python"));
    }
}
