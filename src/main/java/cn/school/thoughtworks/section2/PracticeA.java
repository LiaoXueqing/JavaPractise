package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> resultMap = new HashMap<String, Integer>();
        for(String s : collection1){
            if(resultMap.get(s)==null){
                resultMap.put(s,1);
            }else{
                resultMap.put(s,resultMap.get(s)+1);
            }
        }
        return resultMap;
    }
}
