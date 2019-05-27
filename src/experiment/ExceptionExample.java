package experiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IO{
	
	private static InputStreamReader in; 
	private static BufferedReader buffer;
	
	
	public static String readString() throws
		IOException
		{
				in = new InputStreamReader(System.in);
				buffer = new BufferedReader(in);
				String line = buffer.readLine();
				in.close();
				buffer.close();
				return line;
		}
	
	public static int readInt() throws
		IOException
		{
				in = new InputStreamReader(System.in);
				buffer = new BufferedReader(in);
				int number = Integer.parseInt(buffer.readLine());
				in.close();
				buffer.close();
				return number;
		}

	public static short readShort() throws 
		IOException,
		NumberFormatException
		{
			in = new InputStreamReader(System.in);
			buffer = new BufferedReader(in);
			short number = Short.parseShort(buffer.readLine());

			return number;
		}
	
	public static long readLong() throws 
		IOException,
		NumberFormatException
		{
			in = new InputStreamReader(System.in);
			buffer = new BufferedReader(in);
			long number = Long.parseLong(buffer.readLine());
			in.close();
			buffer.close();
			return number;
		}
}

public class ExceptionExample{
	
	public static void main(String args[]) {
		
			try {
				System.out.println(IO.readShort());
				System.out.println(IO.readShort());
				System.out.println(IO.readShort());
				System.out.println(IO.readShort());
				System.out.println(IO.readShort());
				System.out.println(IO.readShort());
			} catch (IOException e) {
				e.printStackTrace();
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter valid number");
			}
	}

}
