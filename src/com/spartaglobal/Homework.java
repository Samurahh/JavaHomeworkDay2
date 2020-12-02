package com.spartaglobal;

/*** Palindrome ***/

public class Homework {
    public static boolean checkPalindrome(String string){
        if(string.isBlank() || string.isEmpty()){
            return false;
        }else{
            string = string.toLowerCase();
            char[] chars = string.toCharArray();
            for(int i=0;i<(chars.length)/2;i++){
                if(chars[i] != chars[(chars.length-1)-i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static String getLongestPalindrome(String string){
        if(string.isBlank() || string.isEmpty()) {
            return null;
        }else{
            string = string.toLowerCase();
            String longestPalindrome = "";
            leftPointer:for(int i = 0;i<string.length()-1;i++){
                if(longestPalindrome.length() > string.length() - i){
                    break;
                }
                for(int j = string.length()-1; j>i;j--){
                    if(longestPalindrome.length() > j+1-i){
                        continue leftPointer;
                    }
                    if(string.charAt(i) == string.charAt(j)){
                        if(checkPalindrome(string.substring(i,j+1))){
                            longestPalindrome = string.substring(i,j+1);
                        }
                    }
                }
            }
            return longestPalindrome;
        }
    }

}
