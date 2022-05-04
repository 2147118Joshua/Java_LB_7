package Java_Lab_7;

import java.util.Scanner;

//          LAB 07
// 1.Any two type of inheritance (Hierarchical, Mlti level)                     - DONE
// 2.Aggregation
// 3.Composition
// 4.Accessing parent class variable, method and constructor using super        - DONE
// 5.Reusing parent constructor using super                                     - DONE                     - 
// 6.Abstract class with constructor member and methods                         - DO
// 7.Use final keyword in appropriate places                                    - DONE

class LAB07 {
    public static void main(String args[]) {
        System.out.println("\n\n\n SET THE TOP MEMBER ");
        member obj1 = new member();
        obj1.rare();
        admin obj2 = new admin();
        obj2.rare();
        employee obj3 = new employee();
        obj3.rare();

    }
}

abstract class Dairy {
    final int Dairy_id = 56021;
    static int id = 0;
    int a_id;
    static String member;
    static String employee;

    abstract void rare();

    Dairy() {
        id = id + 1;
        a_id = id;
    }

    void best_member() {
        System.out.println("The Best Member of MAY 2022 is " + member);
    }

    void best_employee() {
        System.out.println("The Best Employee of MAY 2022 is " + employee + "\n");
    }
}

class member extends Dairy {
    member() {
        super();
        System.out.println("\nDairy id : " + super.Dairy_id);
        System.out.println("\nEntry id : " + super.a_id);
    }

    void rare() {
        System.out.print("\nEnter the Best Member of MAY 2022 : ");
        Scanner sc = new Scanner(System.in);
        member = sc.nextLine();
        super.best_member();
        System.out.println("The Best Member of April was John");

    }
}

class admin extends Dairy {
    admin() {
        super();
        System.out.println("\nEntry id : " + super.a_id);
    }

    void rare() {
        System.out.print("\nEnter the Best Employee of MAY 2022 : ");
        Scanner sc1 = new Scanner(System.in);
        employee = sc1.nextLine();
        super.best_employee();
        System.out.println("The Best Employee of April was Rahul");

    }
}

class employee extends member {
    employee() {
        super();
        System.out.println("\nEntry id : " + super.a_id);
    }

    void rare() {
        System.out.print("Enter the Second Best Emplyee of MAY 2022 : ");
        Scanner sc1 = new Scanner(System.in);
        employee = sc1.nextLine();
        super.best_employee();

    }
}
