package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework13 {
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "joy","laugh","happy", "laugh", "joy"};
       List<String> listWord= new ArrayList<>();
       int count=0;
       for (int i=0; i<listWord.size();i++){
           int indexOf= listWord.indexOf(listWord.get(i));
           int lastIndex= listWord.lastIndexOf(listWord.get(i));
           if (indexOf==lastIndex)
               count++;

       }
       if (count==1)
           System.out.println("there are duplicate");
       else
           System.out.println("there are no duplicate");

        Set<String> wordList =new HashSet<>();
        boolean duplicate=false;
        for ( String word: words){
            if (wordList.add(word)==duplicate)
                System.out.println( word);
        }

    }




    }


}




}
