package p.p1;
import java.util.*;
public class fib
{
  public int fibo(int n)
    {
       if(n==1)
         return 0;
       else if(n==2)
         return 1;
       else
         {
            return (fibo(n-1)+fibo(n-2));
         }
     }
}
