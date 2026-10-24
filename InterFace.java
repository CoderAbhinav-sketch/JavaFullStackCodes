
// Interface java Explain


public class interFace {
    static void main() {
// Object Creation for A Student
                 // Studeent s1 = new A();
        // Object Creation for C Student
        Studeent s1 = new C();
        s1.MarkAttendance();
        s1.MarkDBMSlabAttendance();
        s1.MarkDaaLabAttendance();
        s1.MarkWebLabAttenDance();
    }
}

 interface  Studeent {
    void MarkAttendance ();
    void MarkDBMSlabAttendance();
    void MarkDaaLabAttendance();
    void  MarkWebLabAttenDance();
}

  class A implements Studeent {
    String Name = "Rahul Gaur";
      @Override
      public void MarkAttendance() {
          System.out.println("Attendance Marked By Rahul " +Name );
      }

      @Override
      public void MarkDBMSlabAttendance() {
          System.out.println(" DBMS AttenDance Marked By " + Name);
      }

      @Override
      public void MarkDaaLabAttendance() {
          System.out.println("DAA Attendance Marked by " + Name );
      }

      @Override
      public void MarkWebLabAttenDance() {
          System.out.println("Web Attendance Marked by " + Name);
      }
  }

  // Second Student Class
    class C implements Studeent {
    String Name = "Abhinav Jha ";
    @Override
    public void MarkAttendance() {
        System.out.println("Attendance Marked By Rahul " +Name );
    }

    @Override
    public void MarkDBMSlabAttendance() {
        System.out.println(" DBMS AttenDance Marked By " + Name);
    }

    @Override
    public void MarkDaaLabAttendance() {
        System.out.println("DAA Attendance Marked by " + Name );
    }

    @Override
    public void MarkWebLabAttenDance() {
        System.out.println("Web Attendance Marked by " + Name);
    }
}