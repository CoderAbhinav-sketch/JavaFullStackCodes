
// Implementing Inheritance

public class Demo3 {
    static void main() {
        engStudd s1 = new engStudd();
        s1.Name = "Rahul gaur";
        s1.age = 21;
        System.out.println(s1.Name);
        System.out.println(s1.age);
         s1.markedByAttendence();
         s1.markedLabbAttendence();

         studentt s2 = new studentt();
         s2.markedByAttendence();
        // s2markedLabbAttendence(); they are not accese because that  are not define in the Studentt class

    }
}

/*/
Parent (superClass) -----> child(SubClass)
 */


// Inheritance in Java
class studentt {
    String Name;
    int age ;

    void markedByAttendence(){
        System.out.println("Attendence marked By " + Name);
    }
}
class engStudd extends studentt {
    void markedLabbAttendence(){
        System.out.println("Marked DBMS lab by "  + Name);
    }
}