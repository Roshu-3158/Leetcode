class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Only allow letters and digits
            if (Character.isLetterOrDigit(ch)) {
                if (Character.isLetter(ch)) {
                    if (vowels.indexOf(ch) >= 0) {
                        hasVowel = true;
                    } else {
                        hasConsonant = true;
                    }
                }
            } else {
                return false;
            }
        }

        return hasVowel && hasConsonant;
    }
}
