//https://leetcode.com/problems/length-of-last-word/description/

public class Solution {
    public static void main(String[] args) {
        String str = "  fly to the sky  ";
        System.out.println(Lengthofword(str));
    }
    static int Lengthofword(String s){
        String str = s.trim();
        int count =0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
