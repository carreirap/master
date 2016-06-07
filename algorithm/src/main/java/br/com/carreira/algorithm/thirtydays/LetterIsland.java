package br.com.carreira.algorithm.thirtydays;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterIsland {
    /*
     *  aaababaababababbabaabaabaaaababaababaabbabaababaaa
        1
        946
        
        aaaabababbaabaaabababbababaabaababaababaabaababaaa
        3
        5
        
        baaaaba
        2
        3
        
        abaab
        2
        3
     */

    
    public static void main(String[] args) {
                   
         String s = "abaab";
         int k = 2;
         int count = 0;
         
         Map<String,Boolean> table = new HashMap<String,Boolean>();
         StringBuilder aux = new StringBuilder(s);
         StringBuilder alt = new StringBuilder(s);
         int i=0;
         int grow = 1;
         
         String r2th = "(0{1,})";
         String r = "(0{1,})";
         if (k > 1) {
             for(int o=1; o<k; o++) {
                 r = r + "[a-z]+(0{1,})";
             }
         }
         
         while( i < s.length()) {
             if(grow > s.length()) {
                 ++i;
                 grow = i + 1;
             }
             if (grow > s.length() )
                 continue;
             int removed = 0;
             int start = 0;
             String subs = s.substring(i, grow);
             //System.out.println("-->" + subs);
             if (table.size() == 0){
                 table.put(subs,true);
             } else if (table.put(subs, true) != null) {
                 grow += 1;
                 continue;
             }
             String regex = "(" + subs + ")";
             
             Pattern pat = Pattern.compile(regex);
             System.out.println(regex);
             while(alt.length()>=1) {
                 
                 Matcher m = pat.matcher(alt);
                 if(m.find()) {
                     start = m.start();
                     aux.replace(m.start()+removed, m.end()+removed, String.format("%0" + (m.end() - m.start()) + "d", 0));
                 }
                 if (start > 0) {
                     alt.delete(0, start);
                     removed = removed + start;
                 } else {
                     alt.deleteCharAt(0);
                     ++removed;
                 }
             }
             //System.out.println("aux ---> " + aux);
             
             //Pattern pat = Pattern.compile("(0)+");
             
             
             Pattern pat2 = Pattern.compile(r);
             Matcher m2 = pat2.matcher(aux);
             Pattern pat2th = Pattern.compile(r2th);
             if(m2.find()) {
                 try{
                     m2.group(k);
                     //System.out.println(m.end(k));
                     /*if ("aa0000babb00000000babbabab0000000b0000b0000000baaa".equals(aux.toString())) {
                         System.out.println("yep");
                     }*/
                     aux.delete(0, (m2.end(k)));
                     
                     Matcher m2th = pat2th.matcher(aux);
                     if(m2th.find()) {
                        
                     } else {
                         ++count;
                     }
                  }catch(Exception e) {
                         
                  }
             }
             
             aux.delete(0, aux.length());
             aux.append(s);
             ++grow;
             alt.delete(0, alt.length());
             alt.append(s);
             
             
         }
         System.out.println(count);
      
    }

}
