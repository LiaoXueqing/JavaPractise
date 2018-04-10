package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        for(String s : collectionA){
            if(collection3.get(s)==null){
                collection3.put(s,1);
            }else{
                collection3.put(s,collection3.get(s)+1);
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
