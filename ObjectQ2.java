
/*
   Q1. Create a class Square with a Method to Initalize its Side Calculating Area , parameter,etc;
 */


class square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return  4*side;
    }
}
//Q2. Create a class Rectangle and repeat Q1
class rectangle{
    int length;
    int breath;

    public int area(){
        return length*breath;
    }
    public int parameter(){
        return 2*(length+breath);
    }
}
/*  Q3.Create a class Tommy veccitti For RockStargame copale for hiting (Printing , naming fering etc)
 */
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy ");
    }
}

class circle{
    double radius ;
    public double area(){
        return 3.14*(radius*radius);
    }
    public double parameter(){
        return 2*3.14*radius;
    }
}


public class p3 {
    static void main() {
        // Q1.sol
        square sq = new square();
        sq.side = 2;
        System.out.println(sq.area());
        System.out.println(sq.parameter());


        // Q2.sol
        rectangle rc = new rectangle();
        rc.length = 2;
        rc.breath = 3;
        System.out.println("The area of rectangle is   " + rc.area());
        System.out.println("The parameter of rectangle is " + rc.parameter());


       // Q3.sol
        Tommy tm = new Tommy();
        tm.hit();
        tm.run();
        tm.fire();

        circle cc = new circle();
        cc.radius = 4;
        System.out.println("The circle of Area is " + cc.area());
        System.out.println("The circle of parameter is " + cc.parameter());

    }
}