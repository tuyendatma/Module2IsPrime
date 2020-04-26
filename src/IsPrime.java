import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number:");
        int number = scanner.nextInt();
        boolean check =true;
        if(number<2){
            check=false;
        }else {
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    check = false;
                    break;
                }

            }
        }

        if(check){
            System.out.println(number+" is Prime");
        }else {
            System.out.println(number+" is not Prime");
        }
    }
}
