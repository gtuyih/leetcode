package page1;
/**
 * z字形排列
输入: s = "LEETCODEISHIRING", numRows = 4
输出: "LDREOEIIECIHNTSG"
解释:
L     D     R
E   O E   I I
E C   I H   N
T     S     G
 *
 */
public class Q6_Zconvert {

    public static String convert(String s, int numRows) {
    	if(s==null) return null;
    	if(numRows==1) return s;
    	int len=s.length();
    	int k = 2*numRows - 2;//numRows=1时,k=0,group溢出=2^31-1。因此加上line17
    	int group = (int) Math.ceil((double)len/(double)k);
//    	System.out.println("len:"+len +" k:"+k+" group:"+group);
    	String res="";
    	for(int i=0;i<numRows;i++){
    		for (int j=0;j<group;j++){
    			if((i+j*k)>=len  ) continue;
    			if(i==0 || i==numRows-1  )	res+=s.charAt(i+j*k);
    			else{
    				res+=s.charAt(i+j*k);
    				if(k-i+j*k >=len) continue;
    				else res+=s.charAt(k-i+j*k);
    			}
    			System.out.println(res);
    		}
    	}
    	
        return res;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convert("PAYPALISHIRING",3));
		
		System.out.println();
		System.out.println(convert("A",1));
		
		System.out.println();
		System.out.println(convert("ABC",3));
	}

}
