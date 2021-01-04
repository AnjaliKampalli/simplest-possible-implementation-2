package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class PrimeFactors {

    public List<Integer> of(int number) {
        List<Integer> list=emptyList();

        if(number==1)
            return list;
        list=new ArrayList<Integer>();

        if(number==2)
            list.add(2);

        //else write code to add the prime factors to the list.
        return list;

    }
}