// 3 Ways to initialize object

import java.util.Scanner ;

class Student {
    int id ;
    String name ;

    void inputData (int sid , String sname )
    {
        id =  sid ;
        name = sname ;
    }

    void display()
    {
        System.out.println("By method \n"+  name + " : "+ id ) ;
    }

}



public class Object {
            
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in) ; 
    // By reference variable

        Student s1 =  new Student() ;
        s1.id = 101 ; 
        s1.name = "Jack" ;

        System.out.println("By reference variable \n"+ s1.name +" : "+s1.id ) ; 


        // By method 

        Student s2 = new Student() ; 
        s2.inputData(202, "Ron");
        s2.display();



    }
}
