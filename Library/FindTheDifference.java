import java.util.*;

class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] sA=new int[26];
        int[] tA=new int[26];
        for (int i=0; i< s.length(); i++){
            sA[s.charAt(i)-'a']++;
            tA[t.charAt(i)-'a']++;
        }
        tA[t.charAt(t.length()-1)-'a']++;
        int c=0;
        while(c<26){
            if(sA[c] != tA[c]) break;
            c++;
        }
        return (char)(c+'a');
    }
}


// ビット演算のほうが早い
/**
  class Solution {
      public char findTheDifference(String s, String t) {
          char c = 0;
          for(char cs : s.toCharArray()) c ^= cs;
          for(char ct : t.toCharArray()) c ^= ct;
          return c;
      }
  }
 */
