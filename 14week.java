import java.util.*;
public class Main {
public static void main(String args[]) {
Map<String, String> map = new HashMap<String, String>();
map.put("plus", "+");
map.put("minus", "-");
map.put("window", "window");
map.put("tree", "ball");
map.put("name", "Sanzhar");
map.put("car", "Toyota");
map.put("light", "light");
int count = 0;
// Elements can traverse in any order
System.out.println("Kipshakbaev Sanzhar");
System.out.println("Items:");
for (Map.Entry m : map.entrySet()){
if(m.getKey() == m.getValue()){
count++;
System.out.println(m.getValue());
}
}
System.out.println("Count:" + count);
}
}