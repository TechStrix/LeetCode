import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dungeoun on 9/30/16.
 */
public class Solution {

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hash1 = new HashMap<>();
        HashMap<Integer,Integer> hash2 = new HashMap<>();

        List<Integer> x = new ArrayList<>();

        for( int i =0; i<nums1.length;i++){

            if( hash1.containsKey(nums1[i])){

                hash1.put(nums1[i], hash1.get(nums1[i])+1);

            }

            if( hash1.containsKey(nums1[i]) == false){

                hash1.put(nums1[i], 1);

            }

        }

        for( int i =0; i<nums2.length;i++){

            if( hash2.containsKey(nums2[i])){

                hash2.put(nums2[i], hash2.get(nums2[i])+1);

            }

            if( hash2.containsKey(nums2[i]) == false){

                hash2.put(nums2[i], 1);

            }

        }

        for(Map.Entry<Integer,Integer> entry : hash1.entrySet()){

            if(hash2.containsKey(entry.getKey())){

                if(entry.getValue()<= hash2.get(entry.getKey())) {

                    for (int i = 0; i < entry.getValue(); i++) {

                        x.add(entry.getKey());

                    }
                }

                if(entry.getValue()> hash2.get(entry.getKey())){

                    for (int i = 0; i< hash2.get(entry.getKey()); i++){

                        x.add(entry.getKey());

                    }



                }

            }

        }



        int[] simpleArray = new int[ x.size() ];
        for(int i =0; i<x.size(); i++){

            simpleArray[i] = x.get(i);

        }

        return simpleArray;



    }


    public static void main( String []args){

        int[] a1 = {1,2,2,1};

        int[] a2 = {2};

        int[] a;

        a = intersect(a1,a2);

        for(int i = 0; i<a.length;i++)
        System.out.println(a[i]);

    }


}
