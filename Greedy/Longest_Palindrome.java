public class Longest_Palindrome {
	
	public static int longestPalindrome(String s) {
        boolean hasOdd = false;
        int totalPalindrome = 0;

        int[] freq = new int[52];
        for(char ch: s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            } else if(ch >= 'A' && ch <= 'Z'){
                freq[ch - 'A' + 26]++;
            }
        }

        for(int i: freq){
            totalPalindrome += (i/2) * 2;
            if( i % 2 == 1 ){
                hasOdd = true;
            }
        }

        return hasOdd ? totalPalindrome + 1 : totalPalindrome;
    }
	
}
