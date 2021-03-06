package Day61;

import java.util.*;

public class CollectionContinue {

    public static void main(String[] args) {

        // Collection interface as super type, pointing to add ArrayList Object
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,5,7,8) );
        System.out.println(nums);

        // can we use get method when we have Collection as reference type??
        // NO !!!  only reference type decide what we can access

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,7,4,11,67,8));
        // I want to sort this Collection
        Collections.sort(nums2 );
        System.out.println(nums2);


    }
}
