import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("exceptions.txt");

        User u1 = new User("Sanzhar", "020512123456", "87778228221");

        if(u1.checkIIN()) {
            Exception e = new SecurityException("Incorrect iin");
            fw.write(e.getMessage() + '\n');
            System.out.println(e.getMessage());
        }
        
        if(u1.checkPhoneNumber()) {
            Exception e = new SecurityException("Incorrect phone number");
            fw.write(e.getMessage() + '\n');
            System.out.println(e.getMessage());
        }

        fw.close();
    }
}