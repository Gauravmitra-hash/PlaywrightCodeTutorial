public class Main {
    public static int main(String[] args){
        int n = 100;
        int ans = 0;
        for(int i = 1 ; i<=n ; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
               System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                ans = i;
            }
            
        }
        return ans;
    }
    
}
