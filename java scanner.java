import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
    nt n1 = 72, n2 = 120, lcm;
  lcm = (n1 > n2) ? n1 : n2;
  while(true)
 {
  if( lcm % n1 == 0 && lcm % n2 == 0 )
 {
 System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
   break;
   }
   ++lcm;
        }
	}
}
