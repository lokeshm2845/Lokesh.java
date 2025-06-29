public class keypad {
    public static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void Combination(String str, int index, String Combination) {
        if(index == str.length()) {
            System.out.print(Combination);
            return;
        }

        char currentChar3 = str.charAt(index);
        String mapping = keypad[currentChar3 - '0'];

        for(int i = 0; i < mapping.length(); i++) {
            Combination(str, index + 1, Combination + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        String str = "8";
        Combination(str, 0, "");
    }
}
