import java.io.*;

class EmpData

{
	public static void main(String[] args)throws IOException 
	{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter id: ");
		int id =Integer.parseInt(br.readLine());
		System.out.print("Emter sex(M/F): ");
		char sex= (char)br.read();
		br.skip(2);
		System.out.print("Enter name: ");
        String name =br.readLine();

		System.out.println("id= "+ id); 
		System.out.println("sex= "+ sex);
		System.out.println("name= "+ name);
		}
}
