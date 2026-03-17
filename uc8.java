import java.util.HashMap;
import java.util.Map;

public class uc8 {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        // Step 1: Load patterns into map
        loadPatterns();

        // Step 2: Render word
        renderWord("OOPS");
    }

    // Load all character patterns
    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Render function
    public static void renderWord(String word) {

        int height = 5; // number of rows in pattern

        // Loop row by row
        for (int i = 0; i < height; i++) {

            // Loop through each character in word
            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                } else {
                    System.out.print("????? ");
                }
            }

            System.out.println(); // next line
        }
    }
}
