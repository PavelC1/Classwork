package Sarcina;

public class Employee {
    String[] nume;
    String [] skillLevel;
    int age;
    int salary;
    boolean married;


    public boolean equals(Object obj1, Object obj2) {
        if(obj1.equals(obj2)){
            return true;
        }
        else return false;
    }
}
