import java.io.*;
class  Simpul
{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br= new BufferedReader(InputStreamReader(System.in));
		System.out.print("Enter the Number ");
        int num= Integer.parseInt(br.readLine());
		for (int i=num,j=num;i<=num ;i++,j-- )
		{
			System.out.println(i+"\t"+j);
		}
		
	}
}
