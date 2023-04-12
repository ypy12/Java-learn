package com.ypy.suanfa;
public class leetcode_offer_05{
    public String replaceSpace(String s) {
        if(s==null){
            return s;
        }
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            sb.append("%20");
        }
        else{
            sb.append(s.charAt(i));
        }
        

      }
      return sb.toString();
    }
}
