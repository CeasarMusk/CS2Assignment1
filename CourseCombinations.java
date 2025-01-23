import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

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
			
					Set<String> courses = new Hashset<>();
				
					for(int j = 1; j < parts.length; j++)
						{	
							courses.add(parts[j]);
						}

					studentCourses.put(parts[0],courses);	
				}
			}

			scan.close();

			printHash(studentCourses);
			int pairs = uniquePairs(studentCourses);
			System.out.println("\n\n\n Total pair is `${pairs}`");

	}

	public static void printHash(Map<String, Set<String>> studentCourses )
	{
		for(Map.Entry<String, Set<String>> entry : studentCourses.entrySet())
		{
			System.out.println(entry.getKey()+": "+entry.getValue());
                }

	}
	public int uniquePairs(Map<String, Set<String>> studentCourses)
	{
		int pairs=0;
		List<String> names = new ArrayList<>(studentCourses.keySet());
		for(int i =0;i<names.size();i++)
		{
			for (int j = i+1; j<names.size();j++)
			{
				Set<String> coursesInCommon = new Hashset<>(studentCourses.get(name.get(i)));
				coursesInCommon.retainAll(studentCourses.get(name.get(j)));
				if(!coursesInCommon.isEmpty())
				{
					pairs++;
				}

			}
		}

		return pairs;
	}
}

