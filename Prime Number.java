public class PrimeNumber {
    public static void main(String[] args) 
  {
    int number = 17;
    boolean isPrime = true;
        
        if (number < 2) 
        {
            isPrime = false;
        } 
        else
        {
            for (int i = 2; i <= number / 2; i++) 
              {
                if (number % i == 0) {
                    isPrime = false; 
              }
        }
  }
        
        
        if (isPrime)
        {
            System.out.println(number + " is a Prime Number");
        } 
        else 
        {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}
