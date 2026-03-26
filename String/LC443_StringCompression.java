class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0; // write pointer

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;

            // count same characters
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            // write character
            chars[idx++] = ch;

            // write count if > 1
            if (count > 1) {
                String str = String.valueOf(count);
                for (char c : str.toCharArray()) {
                    chars[idx++] = c;
                }
            }

            i--; // IMPORTANT  
        }

        return idx;
    }
}