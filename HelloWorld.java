package NikeInterviewPractice.Array20Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TenFindAllDuplicates {

    public static void main(String[] args) {
        int[] array = { 1,1,1,2,4,6,7,2,3,3};
        List<Integer> results = findAllDuplicates(array);
        for (Integer result : results) {
            System.out.println("Duplicates: "+result);
        }
    }

    private static List<Integer> findAllDuplicates(int[] array) {

        List<Integer> results = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        //insert elements in array, if element already exist then insert into list
        for(int i=0; i< array.length; i++){
            if(set.contains(array[i])){
                if(!results.contains(array[i]))
                    results.add(array[i]);
            }else{
                set.add(array[i]);
            }
        }
        return results;
    }

}
