/*public String longestPalindrome(String str) {
    int N = str.length();
    int palindrome_begins_at = 0;
    int palindrome_length = 1;

    boolean[][] isPalindromeTable = new boolean[N][N];

    for (int i=0; i<N; i++) {
        isPalindromeTable[i][i] = true;
    }

    for (int i=0; i<N-1; i++) {
        if (str.charAt(i) == str.charAt(i+1)) {
            isPalindromeTable[i][i+1] = true;
            palindrome_begins_at = i;
            palindrome_length = 2;
        }
    }

    for (int len=3; len <= N; len++) {
        for (int i=0; i < N-len+1; i++) {
            int j = i+len-1;
            if (str.charAt(i) == str.charAt(j) && isPalindromeTable[i + 1][j - 1]) {
                isPalindromeTable[i][j] = true;
                if (len > palindrome_length) {
                    palindrome_begins_at = i;
                    palindrome_length = len;
                }
            }
        }
    }

    return str.substring(palindrome_begins_at, palindrome_begins_at + palindrome_length);
}*/

public String longestPalindrome(String s) {
    if (s == null || s.isEmpty()) return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);
        int len2 = expandAroundCenter(s, i, i + 1);
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
    }
    return R - L - 1;
}


public void main() {
    System.out.println(longestPalindrome("anagram"));
}
