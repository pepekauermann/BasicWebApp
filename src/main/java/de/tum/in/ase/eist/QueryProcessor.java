package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "pepe";

        } else if (query.contains("largest")) {
            int [] numbers = zahlen(query);
            Integer max = Arrays.stream(numbers).max().orElseThrow(NoSuchElementException::new)
            return max.toString();



        } else { // TODO extend the programm here
            return "";
        }
    }

    public int[] zahlen(String s){

        String[] splited = s.split("\\s+");
        //Integer [] numbers = new Integer[splited.length];
        int[] numbers = Arrays.stream(s.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //Arrays.stream(splited).filter(e -> e = instanceofInt)
        for (int i = 0; i < splited.length; i++) {

                numbers[i] = Integer.parseInt(splited[i]);
        }




    }
}
