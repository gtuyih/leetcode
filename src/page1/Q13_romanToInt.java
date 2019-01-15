package page1;

import java.util.HashMap;

public class Q13_romanToInt {
    public static HashMap<String ,Integer> map = new HashMap<String ,Integer>();
	static{
		map.put("I",1);map.put("IV",4);map.put("V",5);map.put("IX",9);map.put("X",10);
		map.put("XL",40);map.put("L",50);map.put("XC",90);map.put("C",100);
		map.put("CD",400);map.put("D",500);map.put("CM",900);map.put("M",1000);
	}
    
    public int romanToInt(String s) {
         if(s==null) return 0;
        if(s.length()==1) return map.get(s);
        int res=0;
        int i=0;
        String cuur=null;
        for(;i<s.length()-1;i++){
        	if(map.containsKey(s.substring(i, i+2))){
        		cuur=s.substring(i, i+2);
        		i++;
        	}else{
        		cuur=s.substring(i, i+1);
        	}
        	res+=map.get(cuur);
        }
        if(i<s.length()) res+=map.get(String.valueOf(s.charAt(i)));
        return res;
    }

}
