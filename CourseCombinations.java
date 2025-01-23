import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class CourseCombinations
{
	public static void main(String[] args)
	{
			Scanner scan = new Scanner(System.in);
			Map<String, List<String>> studentCourses=new HashMap<>();
			
			
			int n = Integer.parseInt(scan.nextLine());
			
			for(int i =0; i< n;i++)
			{
				if(scan.hasNextLine())
				{
					String[] parts=scan.nextLine().split(" ");
			
					List<String> courses = new ArrayList<>();
				
					for(int j = 1; j < parts.length; j++)
						{	
							courses.add(parts[j]);
						}

					studentCourses.put(parts[0],courses);	
				}
			}

			scan.close();
			for(Map.Entry<String, List<String>> entry : studentCourses.entrySet()){
                        	System.out.println(entry.getKey()+": "+entry.getValue());
                	}

	}
}

