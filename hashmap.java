import java.util.*;  
public class hashmap {  
   public static void main(String args[]) {
  HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
  hash_map.put("Apple", 10);
  hash_map.put("Pineapple", 13);
  hash_map.put("Cherry", 7);
  hash_map.put("Strawberry", 2);
  hash_map.put("Grape", 1);
  System.out.println("Map: " + hash_map);
  System.out.println("Is key 'Cherry' here?");
  if (hash_map.containsKey("Cherry")) {
   System.out.println("Yes - " + hash_map.get("Cherry"));
  } else {
   System.out.println("Nope");
  }

  System.out.println("\n Is key 'Banana' here?");
  if (hash_map.containsKey("Banana")) {
   System.out.println("Yes - " + hash_map.get("Banana"));
  } else {
   System.out.println("Nope");
  }
 }
}