public String longestPalindrome(String str) {
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
}
public void main() {
    System.out.println(longestPalindrome("anagram"));
}
