class Solution {
    public void reverseString(char[] s) {
        for(int i = 0 ; i<s.length/2 ;i++){
            char tmp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = tmp;
        }

    }
}
/* 若輸入參數為字串 則轉成字元陣列執行操作
 * char[] chars = s.toCharArray();
 * 最後 return String.valueOf(chars);
 */
