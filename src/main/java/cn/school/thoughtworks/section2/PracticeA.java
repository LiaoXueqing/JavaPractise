package cn.school.thoughtworks.section2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String , Long> map = collection1.stream().collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting())
                );
        Map<String , Integer> resultMap = new HashMap<>();
        map.forEach((k,v)->{
            resultMap.put(k,new Long(v).intValue());
        });
        return resultMap;
    }
}
