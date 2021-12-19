import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
public class Task2 {

	public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        List <integer> Numbers = new ArrayList<integer>();
		for (int i=0; i<100; i++)
        {   
            int a = reader.readLine();
            if (a == 0){
            break;
        }
            
            Numbers.add(0, a);

        }
        int b = reader.readLine();
        for (int i=0; i < Numbers.size(); i++)
        {
            if(Numbers[i]==b){
            System.out.println("YES");
            break
            }
        }
       System.out.println("NO")        
	}
}
