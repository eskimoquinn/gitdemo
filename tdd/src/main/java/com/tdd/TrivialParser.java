package com.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tgreen on 7/12/16.
 */
public class TrivialParser {


    public List<String> getListOfStrings(String input){
        if (null == input){
            return new ArrayList<>();
        }
        List<String> returnList = Arrays.asList(input.split(" +"));
        return returnList;
    }

//    public List<String> getListOfStrings(String input){
//        if (null == input){
//            return new ArrayList<>();
//        }
//        return Arrays.asList(input.split(" +"));
//    }



    //I do not want to break anything, but this should be refactored

//    public List<String> getListOfStrings(String s){
//        if (s == null){
//            throw new IllegalArgumentException("String cannot be null");
//        }
//        String [] strings = s.split(" ");
//        return Arrays.asList(strings);
//    }
}
