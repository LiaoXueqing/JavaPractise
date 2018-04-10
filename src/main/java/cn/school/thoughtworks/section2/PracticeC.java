package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> resultMap = new HashMap<>();
        for(String s : collection1){
            int c = 1 ;
            if(s.length()> 1){
                if(s.substring(s.length()-1,s.length()).equals("]")){
                    int start = s.indexOf("[");
                    int end = s.indexOf("]");
                    c = Integer.parseInt(s.substring(start+1,end));
                    s = s.substring(0,1);
                }else{
                    c = Integer.parseInt(s.substring(s.length()-1,s.length()));
                    s = s.substring(0,1);
                }
            }
            if(resultMap.get(s)==null){
                resultMap.put(s,c);
            }else{
                resultMap.put(s,resultMap.get(s)+c);
            }
        }
        return resultMap;
    }
}
