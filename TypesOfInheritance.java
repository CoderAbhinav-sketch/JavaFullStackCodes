public class Demo4 {
    static void main() {
// Simple Inheritance
        engStud e1 = new engStud();
        e1.Name = "Rahul gaur";
        e1.age = 21;
        e1.markedAttendance();
        e1.markedAttendanceDBMSlab();

        // MultiLevel Inheritance
        cseStud c1 = new cseStud();
        c1.Name = "Abhinav jha ";
        c1.age = 21;
        c1.markedAttendance();
        c1.markedAttendanceDBMSlab();
        c1.attendCseLab();

    }
}
/*\
Types Of Inheritance
1 . Simple Inheritance
2 . Multi-Level Inheritance
3 . Hierarchical Inheritance
4 . Multiple Inheritance (Not Support in Java)
 */
// 1 . Simple Inheritance
class  studenttt{
    String Name;
    int age;

    void markedAttendance(){
        System.out.println("Attendance marked by " + Name);
    }
}

class engStud extends studenttt {
    void markedAttendanceDBMSlab(){
        System.out.println("DBMS lab attendance marked by " + Name);
    }
}
/*\
Multi-Level Inheritance
student---> engstud ---> CseStud
A ---> B -----> C

student
|
engstud
|
CseStud
 */
class cseStud extends engStud{
    void attendCseLab(){
        System.out.println("Cse lab attend by " + Name);
    }
}