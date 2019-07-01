package experiment;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamApiPractice {
    public static void main(String args[]){
        int sampleAge[] = {10,12,11,13,30,90,18};
        ArrayList<Integer> ages = new ArrayList<Integer>();
        Arrays.stream(sampleAge).forEach(age->ages.add(age));
        int sumOfAges = ages.stream().reduce(0,(ageSum,age)->ageSum + age);
        System.out.println(sumOfAges/(ages.stream().count()));
    }
}
