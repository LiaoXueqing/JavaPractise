package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        for(String s : collectionA){
            int c = 1 ;
            if(s.length()> 1){
                c = Integer.parseInt(s.substring(s.length()-1,s.length()));
                s = s.substring(0,1);
            }
            if(collection3.get(s)==null){
                collection3.put(s,c);
            }else{
                collection3.put(s,collection3.get(s)+c);
            }
        }
        List<String> listB = object.get("value");
        for(String s1 : listB){
            if(collection3.containsKey(s1)){
                if(collection3.get(s1)>=3) {
                    collection3.put(s1, collection3.get(s1) - collection3.get(s1)/3);
                }
            }
        }
        return collection3;
    }
}
