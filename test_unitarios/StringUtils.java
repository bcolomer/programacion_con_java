public class StringUtils {

    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public boolean reverseWord(String word) {
        String reversed = reverse(word);
        if (reversed == word) {
            return true;
        }
        return false;
    }
}