class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String word = words[i];
            char l = word.charAt(0);
            char r = word.charAt(word.length()-1);
            if(isVowel(l) && isVowel(r)){
                count++;
            }
        }
        return count;
    }
        boolean isVowel(char ch){
            return ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u';
        }
}