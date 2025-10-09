package DSA_Series.FullDSA;

public class S40_Recursion_Problem_TowerOfHonai {
    public static void towerofhonai(int n , String sorce , String helper , String destination ){
        if(n == 1){
            System.out.println("Tansfer disk"  + n + "from" + sorce + "to" + destination);
            return;
        }
        towerofhonai(n-1 , sorce , helper , destination);
        System.out.println("Tansfer disk"  + n + " from" + sorce + " to" + destination);
        towerofhonai(n-1 , helper , sorce , destination);

    }
    public static void main(String[] args) {
    int n = 3 ;
    towerofhonai(n , " ....S" , " .... H" , " ... D");
    }
}
