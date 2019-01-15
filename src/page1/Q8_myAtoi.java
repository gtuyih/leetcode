package page1;

public class Q8_myAtoi {
	
	public static int myAtoi(String str) {
		if(str == null) return 0;
		String s=str.trim();
		int res= 0;
		int minus = 1;
		for(int i=0;i<s.length();i++){
			char c =s.charAt(i);
			if(i==0 && c=='+' ) continue;
			if(i==0 && c=='-') {
				minus=-1;
				continue;
			}
			
			if(c<='9' && c>='0') {
				if(minus<0 && (res>Integer.MAX_VALUE/10 ||(res==Integer.MAX_VALUE/10 && c>='8'))) 
					return Integer.MIN_VALUE;
				else if(minus>0 && (res>Integer.MAX_VALUE/10 ||(res==Integer.MAX_VALUE/10 && c>='7'))) 
					return Integer.MAX_VALUE;
				System.out.println("res before"+res +"add "+(c-'0'));
				res=(c-'0')+res*10;//*10操作前先判断溢出
			}
			else  return res*minus;
			System.out.println("res now "+res);
			
		}
		return res*minus;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("42"));
		System.out.println(myAtoi("   -42"));
		System.out.println(myAtoi("4193 with words"));
		System.out.println(myAtoi("words and 987"));
		System.out.println(myAtoi("-91283472332"));
		System.out.println(myAtoi("3.14159"));
		System.out.println(myAtoi("2147483648"));
		System.out.println(myAtoi("-2147483649"));
		System.out.println(myAtoi("-2147483647"));
	}

}
