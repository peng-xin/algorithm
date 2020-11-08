package pers.px.algorithm.dp;

/*
*Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
*You have the following three operations permitted on a word:
*Insert a character
*Delete a character
*Replace a character
*Input: word1 = "horse", word2 = "ros"
*Output: 3
*Explanation:
*horse -> rorse (replace 'h' with 'r')
*rorse -> rose (remove 'r')
*rose -> ros (remove 'e')
*来源：力扣（LeetCode）
*链接：https://leetcode-cn.com/problems/edit-distance
*著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */


public class EditDistance_72 {
    public int minDistance(String word1, String word2) {
        if(word1==word2){
            return 0;
        }

        if(word1==null&&word2!=null){
            return word2.length();
        }

        if(word2==null&&word1!=null){
            return word1.length();
        }
        int lengthWord1=word1.length();
        int lengthWord2=word2.length();
        int[][] dp=new int[lengthWord1][lengthWord2];



        return dp[lengthWord1-1][lengthWord2-1];
    }
}
