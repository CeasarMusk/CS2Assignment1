import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner


public class popularCourse
{
	public static void main(String[] args)
	{
		try
		{
			File data = new File("data.txt");
			Scanner scan = new Scanner(data);
			/* Example Data.txt
			 * 5
			 * Ceasar MATH SCI
			 * RYAN FUCK ME
			 *At least 1-20
			 */
			int n = Interger.parseInt(scan.nextLine());
			for(int i =0; i< n;i++)
			{
				String[] parts = scan.nextLine().split(" ");
			}

		} catch (FileNotFoundException e)
		{
			System.out.println("Something fucked up");
			e.printStackTrace();
		}
	}
}

