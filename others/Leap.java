import java.io.*;

class Leap
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter year no: ");
		int year= Integer.parseInt(br.readLine());
		if (year % 100==0 && year %400==0)

		System.out.println("it is a leap");
		else if (year % 100!=0 && year %4==0)
		System.out.println("it is a leap");
		else System.out.println("it is not a leap");

		}
	}

