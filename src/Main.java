import models.OtherEmployees;
import models.Students;
import models.Teachers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students(1241,12,"Kalikasthan","Henry","Bigman","He is kinda weird and stoopid");
        Students s2 = new Students(1242,14,"Kalikasthan","Hera","Smith","she is kinda weird and stoopid");
        Students s3 = new Students(1243,16,"Kalik","Hen","man","IT is kinda weird and stoopid");

        Teachers t1 = new Teachers(1342,34,"WDC","John Does",19000,"English");
        Teachers t2 = new Teachers(1343,39,"Kathmandu","Hally Johnson",22000,"Computer");
        Teachers t3 = new Teachers(1344,22,"Kathmandu","Alya Smith",20000,"Math");
        Teachers t4 = new Teachers(1345,25,"Kathmandu","Stella Johnson",19000,"Arts");

        OtherEmployees e1 = new OtherEmployees(1442,23,"KTM","KIra",15000,"Janator");
        OtherEmployees e2 = new OtherEmployees(1444,23,"KTM","KIra",15000,"Janator");
        OtherEmployees e3 = new OtherEmployees(1443,23,"KTM","KIra",15000,"Janator");

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to know the Student management system in a deeper level?(T/F): ");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("T")){
            System.out.println("Do you want to know the stodents names(T/F): ");
            String choice2 = sc.nextLine();
            if(choice2.equalsIgnoreCase("T")){
                System.out.println("1st student");
                System.out.println(s2.IDs);
                System.out.println(s2.address);
                System.out.println(s2.age);
                System.out.println(s2.Name);
                System.out.println(s2.age);
                System.out.println(s2.Surname);
                System.out.println(s2.PersonalDetails);

                System.out.println("2nd student");
                System.out.println(s1.IDs);
                System.out.println(s1.address);
                System.out.println(s1.age);
                System.out.println(s1.Name);
                System.out.println(s1.age);
                System.out.println(s1.Surname);
                System.out.println(s1.PersonalDetails);

                System.out.println("13rt student");
                System.out.println(s3.IDs);
                System.out.println(s3.address);
                System.out.println(s3.age);
                System.out.println(s3.Name);
                System.out.println(s3.age);
                System.out.println(s3.Surname);
                System.out.println(s3.PersonalDetails);



            }
        }
        System.out.println("Do you want teachers info(T/F)");
        String choice3 = sc.nextLine();
        if (choice3.equalsIgnoreCase("T")) {
            System.out.println("1st teacher");
            System.out.println("ID: " + t1.IDs);
            System.out.println("Age: " + t1.age);
            System.out.println("Address: " + t1.address);
            System.out.println("Name: " + t1.name);
            System.out.println("Salary: " + t1.salary);
            System.out.println("Department: " + t1.department);

            System.out.println("2nd teacher");
            System.out.println("ID: " + t2.IDs);
            System.out.println("Age: " + t2.age);
            System.out.println("Address: " + t2.address);
            System.out.println("Name: " + t2.name);
            System.out.println("Salary: " + t2.salary);
            System.out.println("Department: " + t2.department);

            System.out.println("3rd teacher");
            System.out.println("ID: " + t3.IDs);
            System.out.println("Age: " + t3.age);
            System.out.println("Address: " + t3.address);
            System.out.println("Name: " + t3.name);
            System.out.println("Salary: " + t3.salary);
            System.out.println("Department: " + t3.department);

            System.out.println("4th teacher");
            System.out.println("ID: " + t4.IDs);
            System.out.println("Age: " + t4.age);
            System.out.println("Address: " + t4.address);
            System.out.println("Name: " + t4.name);
            System.out.println("Salary: " + t4.salary);
            System.out.println("Department: " + t4.department);
        }
        System.out.println("Do you want other employees' info? (T/F): ");
        String choice4 = sc.nextLine();
        if (choice4.equalsIgnoreCase("T")) {
            System.out.println("1st employee");
            System.out.println("ID: " + e1.IDs);
            System.out.println("Age: " + e1.age);
            System.out.println("Address: " + e1.address);
            System.out.println("Name: " + e1.name);
            System.out.println("Salary: " + e1.salary);
            System.out.println("Woek: " + e1.Work);


            System.out.println("2nd employee");
            System.out.println("ID: " + e2.IDs);
            System.out.println("Age: " + e2.age);
            System.out.println("Address: " + e2.address);
            System.out.println("Name: " + e2.name);
            System.out.println("Salary: " + e2.salary);
            System.out.println("Woek: " + e2.Work);


            System.out.println("3rd employee");
            System.out.println("ID: " + e3.IDs);
            System.out.println("Age: " + e3.age);
            System.out.println("Address: " + e3.address);
            System.out.println("Name: " + e3.name);
            System.out.println("Salary: " + e3.salary);
            System.out.println("Woek: " + e3.Work);

        }









    }
}
