package org.example;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] ransomArray = new int[26];
        int[] magazineArray = new int[26];
        for (char here : ransomNote.toCharArray()) {
            ransomArray[here - 'a']++;
        }
        for (char here : magazine.toCharArray()) {
            magazineArray[here - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (magazineArray[i] < ransomArray[i]) {
                return false;
            }
        }
        return true;
    }
}
