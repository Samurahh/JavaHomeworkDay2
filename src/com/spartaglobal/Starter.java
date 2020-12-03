package com.spartaglobal;

public class Starter {

    public static void start(){
        System.out.println(Palindrome.checkPalindrome("ana"));
        System.out.println(Palindrome.checkPalindrome("anna"));
        System.out.println(Palindrome.checkPalindrome("annb"));
        System.out.println(Palindrome.checkPalindrome("banb"));
        System.out.println(Palindrome.getLongestPalindrome("ananbvcvbape"));
        System.out.println(Palindrome.getLongestPalindrome("1233214322398512512311243221212332143223985125123112432212123321432239851251231124322121233214322398512512311243221212332143223985125123111234567876543212432212"));
    }
}
