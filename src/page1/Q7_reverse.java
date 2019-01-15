package page1;
/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * 
 * hints: 在越界的边缘试探：Integer.MAX_VALUE，Integer.MIN_VALUE
 *
 */
public class Q7_reverse {
	
    public int reverse(int x) {
        int m=x;
        int res=0;
        while(m!=0){
        	int t=m%10;
        	m=m/10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && t > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && t < -8)) return 0;
        	res = res*10+t;      	
        }
        return res;
    }
}
