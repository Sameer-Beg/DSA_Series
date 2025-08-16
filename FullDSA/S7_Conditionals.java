package DSA_Series.FullDSA;

public class S7_Conditionals {
    public static void main(String[] args) {
        /*
            Syntax of IF :
            if (boolean expression T or F){
                //body
            }else{
                //do this
                }
        */
//        Program IF condition
//        If Salary is gretor then 3000 , so add 2000 else add 1000
        int salary = 5000;
        if (salary > 3000){
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
