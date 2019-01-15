package page1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 判定括号是否完全闭合
 * 使用栈，左括号入栈，右括号匹配后出栈，时间复杂度O(n)
 *
 */
public class Q20_isBracketValid {
    static Map<Character,Character> map = new HashMap<Character,Character>();
	static {	
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
	}
    public boolean isValid(String s) {
    	Stack<Character> stack= new Stack<Character>();
    	for(int i=0;i<s.length();i++){
    		char c=s.charAt(i);
    		if(map.containsKey(c)){//闭括号
    			if(stack.isEmpty()) return false;
    			else {
        			char c1=stack.peek();
        			if(map.get(c)==c1) stack.pop();//删除一对
        			else return false;    				
    			}

    		}else {
    			stack.push(c);//开括号入栈

    		}
    	}
    	return stack.isEmpty();    }
}
