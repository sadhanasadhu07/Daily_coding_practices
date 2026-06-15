class Solution {
    public boolean isPalindrome(String s) {
        String rev = "";
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        for(int i = 0; i<s.length(); i++){
            rev = s.charAt(i) + rev;
        }

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != rev.charAt(i)){
                return false;
            }
        }
        return true;
    }
}