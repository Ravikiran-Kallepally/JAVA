package DSA;

public class sumOfNaturalNumbers {

    public static int sum(int n){
        int result=0;
        for(int i=1 ;i<=n;i++){
            result+=i;
        }
       return result;
    }
    public static void main(String[] args){
        int answer = sum(5);
        System.out.println("The sum of given natural numbers is "+" "+answer);


    }
}
