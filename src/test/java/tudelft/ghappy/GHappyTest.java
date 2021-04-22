package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "input={0}")
    @CsvSource({
            // The gg is at the beginning of the string
            "ggxwerqeru", "gg   ",
            // The gg is at the middle of the string
            "asadfggkd",
            // The gg is at the end of the string
            "asdkgg",
            // 3 g are in next to each other
            "gggsdlkfjwer", "sadfgggjdj", "dfakwggg",
            // String contains 4 g
            "gggg", "ggggkjd", "asdgggg", "asdggggasd", "ggjasdhgg",
            "adggadggsa", "ggasdggasd", "asdggadgg"
    })
    public void testAlgoTrue(String input) {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest(name = "input={0}")
    @CsvSource({
            // Single g located at the beginning of the string
            "gjsd",
            // Single g located at the middle of the string
            "jasdhghasjdh",
            // Single g located at the end of the string
            "andjahhg",
            // String doesn't contain g
            "oqiweu",
            // String contain 3 g
            "sdfggkjg", "ggasdhg","gjaggksjd"
    })
    public void testAlgoFalse(String input) {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertFalse(result);
    }
}
