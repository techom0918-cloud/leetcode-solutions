// class Solution {
//     public String reverseVowels(String s) {
//         StringBuilder Str = new StringBuilder(s);
//         int left =0;
//         int right=s.length()-1;
//         while(left<right){
//             if(isVowel(s.charAt(left)) && isVowel(s.charAt(right))){
//                 char temp =s.charAt(left);
//                 s.charAt(left)=s.charAt(right);
//                 s.charAt(right)= temp;
//             }
//             left++;
//             right--;
//         }
//         return str.toString();

//     }
//     boolean isVowel(char ch){
//         return ch=='a' || ch== 'e' || ch=='i' || ch=='o' ||ch =='u' ;
//     }
// }




class Solution {
    public String reverseVowels(String s) {
        StringBuilder Str = new StringBuilder(s);

        int left = 0;
        int right = Str.length() - 1;

        while (left < right) {

            if (!isVowel(Str.charAt(left))) {
                left++;
            }
            else if (!isVowel(Str.charAt(right))) {
                right--;
            }
            else {
                char temp = Str.charAt(left);
                Str.setCharAt(left, Str.charAt(right));
                Str.setCharAt(right, temp);

                left++;
                right--;
            }
        }

        return Str.toString();
    }

    boolean isVowel(char ch) {
       return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}