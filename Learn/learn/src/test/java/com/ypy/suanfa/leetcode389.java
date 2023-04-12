package com.ypy.suanfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.STRING;

public class leetcode389 {
    public static char findTheDifference(String s, String t) {
        Map<Character,Integer> hashmap = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(hashmap.containsKey(s.charAt(i))){
                hashmap.put(s.charAt(i),hashmap.get(s.charAt(i))+1);
            }
            else{
                hashmap.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(hashmap.containsKey(t.charAt(i))&&hashmap.get(t.charAt(i))!=1){
                hashmap.put(t.charAt(i),hashmap.get(t.charAt(i))-1);
            }
            else if(hashmap.containsKey(t.charAt(i))&&hashmap.get(t.charAt(i))==1){
                hashmap.remove(t.charAt(i));
            }
            else{
                hashmap.put(t.charAt(i), 1);
            }
        }
        for (Map.Entry<Character,Integer> entry:hashmap.entrySet()){
            if (entry.getValue().equals(1)){
               return entry.getKey();
            }
           
        }
        return 'a';
    }
    public static void main(String[] args) {
        String k= "abcd";
        String t= "abcde";
        char f=findTheDifference(k,t);
        
        
    }
}
