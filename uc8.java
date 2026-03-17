import java.util.HashMap;
import java.util.Map;

public class uc8 {

    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        loadPatterns();
        renderWord("OOPS");
    }

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

    public static void renderWord(String word) {

        int height = 5; 

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                } else {
                    System.out.print("????? ");
                }
            }

            System.out.println();
        }
    }
}
