package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> resultList = new ArrayList<>();
        List<String> collection3 = collection2.get(0);
        for(String s1:collection1){
            for(String s3:collection3){
                if(s3.equals(s1)){
                    resultList.add(s1);
                }
            }
        }
        return resultList;
    }
}
