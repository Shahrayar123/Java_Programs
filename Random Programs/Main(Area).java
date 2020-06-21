import java.util.* ;

class Box
{
	int length, bredth, height;

 public void setLength(int l)
	{
		length = l;

	}

	public void setBredth(int b)
	{
		bredth = b;
	}

	public void setHeight(int h)
	{
		height = h;
	}

	public int getLength()
	{
		return length;
	}


	public int getBredth()
	{
		return bredth;
	}

	public int getHeight()
	{
		return height;
	}

	public void showAll()
	{
		System.out.println("Value of length is: "+length);
		System.out.println("Value of bredth is: "+bredth);
		System.out.println("Value of height is: "+height);
	}

	public int getArea()
	{
		return length*bredth*height;
	}

}

public class Client
{
    // Practice Program 

	public static void main(String[] args)
	{
	    int length, bredth, height;
	    char choice;

	    Box b1 = new Box();

		System.out.println("Enter value of length: ");
		Scanner s1 = new Scanner(System.in);
		length = s1.nextInt();

		System.out.println("Enter value of bredth: ");
		Scanner s2 = new Scanner(System.in);
		bredth = s2.nextInt();

		System.out.println("Enter value of height: ");
		Scanner s3 = new Scanner(System.in);
		height = s3.nextInt();


		b1.setLength(length);
		b1.setHeight(bredth);
		b1.setBredth(height);

		System.out.println("Do you want to display all parameters (y/n): ");
		Scanner s4 = new Scanner(System.in);

		choice = s4.next().charAt(0);

		if(choice=='y')
		{
//			System.out.println("Value of bredth is: "+ b1.getBredth());
			b1.showAll();
		}

		System.out.println("Do you want to display all area (y/n): ");
		Scanner s5 = new Scanner(System.in);

		choice = s5.next().charAt(0);

		if(choice == 'y')
		{
			System.out.println("Area with parameter length "+length+" breath: "+bredth+" and height: "+height+" is: "+b1.getArea());
		}

		else
		{
			System.out.println("Thank you for using this program");
		}



	}

}