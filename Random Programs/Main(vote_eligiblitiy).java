import java.util .*;

public class Main
{
    public static void main(String[] args)
    {
        int age;
        char choice;
     
     while(true)
     {
         
     
        System.out.println("Enter your age: ");
        Scanner s1 = new Scanner (System.in);
        
        age = s1.nextInt();
        
        if(age >= 18)
        {
            System.out.println("You are eligible to vote");
        }
        
        else
        {
            System.out.println("You are not eligible to vote");
        }
        
        System.out.println("Do you want to exit (y/n): ");
        Scanner s2 = new Scanner(System.in);
        choice = s2.next().charAt(0);
        
        if(choice == 'y')
        {
            System.out.println("Thank you for using this program");
            break;
        }
        
        else if(choice == 'n')
        {
            System.out.println("OK....");   
        }
        
        
        
     }
     
    }
    
}