package service;

import java.util.List;

public class DemoService {

    public int add(List<Integer> listOfNumbers){
        return listOfNumbers.stream().reduce(0, Integer::sum);
    }

    public int max(List<Integer> listOfNumbers){
        return listOfNumbers.stream().reduce(0, Integer::max);
    }

    public int min(List<Integer> listOfNumbers){
        return listOfNumbers.stream().reduce(0, Integer::min);
    }

}
