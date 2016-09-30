import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Dungeoun on 9/26/16.
 */
public class diff {

    public static Character findTheDifference(String s, String t) {

        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        HashMap<Character, Integer> thash = new HashMap<Character, Integer>();

        char output = 0;
        int value = 0;
        int d=0;


        for( int i = 0; i < s.length(); i++){

            if(hash.containsKey(s.charAt(i)) == false){

                value = 1;

                hash.put(s.charAt(i), value);


            }

            else if(hash.containsKey(s.charAt(i)) == true){

                hash.put(s.charAt(i), hash.get(s.charAt(i))+1);


            }

        }


        for( int i = 0; i < t.length(); i++){

            if(thash.containsKey(t.charAt(i)) == false){

                value = 1;

                thash.put(t.charAt(i), value);


            }

            else if(thash.containsKey(t.charAt(i)) == true){

                thash.put(t.charAt(i), thash.get(t.charAt(i))+1);


            }

        }


        for(Map.Entry<Character,Integer> entry : thash.entrySet()){

            if(entry.getValue() != hash.get(entry.getKey())){
                output =  entry.getKey();
                break;
            }

        }


        return output;


    }


    public static void main(String []args){

        char a = findTheDifference("rats","tarsa");

        System.out.println(a);

    }

}
