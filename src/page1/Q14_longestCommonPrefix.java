package page1;

/**
 * 求一些字符串的最长公共子串
 * 使用str1.indesxOf(commstr)=0来判定是前缀
 *
 */
public class Q14_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String pre=strs[0];
        for(int i=1;i<strs.length;i++){
        	while(strs[i].indexOf(pre)!=0){
        		pre=pre.substring(0, pre.length()-1);
        	}
        }
        return pre;
    }
    
    public static void main(String[] args) {
		System.out.println("123".indexOf("5"));
	}
}
