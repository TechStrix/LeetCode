import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dungeoun on 9/29/16.
 */
public class Solution {

    public static int singleNumber(int[] nums) {

        HashMap<Integer,Integer> hash = new HashMap<>();

        int a =0;

        for( int i=0; i<nums.length; i++){

            if( hash.containsKey(nums[i])){

                hash.put(nums[i], hash.get(nums[i])+1);

            }

            if(hash.containsKey(nums[i])==false){
                hash.put(nums[i],1);
            }

        }

        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){

            if(entry.getValue() == 1){

                a = entry.getKey();

            }

        }

        return a;

    }

    public static void main(String []args){

        int[] b = {1,1,2,2,3,3,4};

        int c = singleNumber(b);

        System.out.println(c);



    }

}
