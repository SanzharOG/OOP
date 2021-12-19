public class Week3b{

    public static void main(String[] args) {

        Student s1 = new Student( "Sanzhar", 3.43f);
        
        // System.out.println(s1.id);

        // System.out.println(s1.name);

        // System.out.println(s1.gpa);



        Student s2 = new Student("Vasya", 3.78f);

        // System.out.println(s2.id);

        // System.out.println(s2.name);

        // System.out.println(s2.gpa);



        // s1.showGPA();

        // s2.showGPA();

        // s1.showUniversity();
        System.out.println(Student.showTotalNumberOfStudents());
        System.out.println(s1.getId());
        System.out.println(s2.getId());
    }

}



class Student{

    private static int cnt = 1;

    static String university = "KBTU";

    int id;

    String name;

    float gpa;



    // Student(){}

    Student( String n, float g){
        name = n;
        gpa = g;
        cnt++;
        GenerateID(cnt-1, cnt);
    }

    void showGPA(){
        System.out.println(gpa);
    }


    public static String showUniversity(){
        return university;
    }

    public static int showTotalNumberOfStudents(){
        return cnt-1;
    }

    void GenerateID(int x, int y){
        this.id = 100*x+10*y + x * y; 
    }
    public int getId(){
        return this.id;
    }


    // TASK-1: Add at least one more instance data field;



    // TASK-2: Add at least one more instance method;   



    // TASK-3: Create a method showTotalNumberOfStudents();



    // TASK-4: Generate IDs automatically.

}