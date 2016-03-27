import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class RankedRetrieval 
{

	public void rankedRetrieval(String sQueriesFile)
	{
		
		try
		{
			
			//Read the file containing queries to be searched for
			File sQueryFile = new File(sQueriesFile);
			FileInputStream fisQueriesFile = new FileInputStream(sQueryFile);
			DataInputStream disQueriesInput = new DataInputStream(fisQueriesFile);
			BufferedReader brQueriesInput = new BufferedReader(new InputStreamReader(disQueriesInput));
			String sInput = null;
			int iQuery = 0;
			String sQuery = null;
			String sQuestion = "";
					
			while((sInput = brQueriesInput.readLine()) != null)
			{
				
				iQuery = iQuery + 1;
				sQuery = "Q"+ iQuery +":";
				//System.out.println(sQuery);
				
				if(sInput.equals(sQuery))
				{

					sQuestion = "";
					sInput = brQueriesInput.readLine();
					
					while(!sInput.equals(""))
					{
						
						//System.out.println("Input read:   " + sInput);
						sQuestion = sQuestion + sInput + " ";
						sInput = brQueriesInput.readLine();
						
						if(sInput == null)
						{
							
							break;
							
						}
						
					}//End of while(!sInput.equals(" "))
					
					System.out.println("Question:  " + sQuestion);
					//sInput = brQueriesInput.readLine();
					
					calculateQueryMaxTfTermWeight(sQuestion);
					
				}//End of if(sInput.equals(sQuery))				
				
			}//End of while((sInput = brQueriesInput.readLine()) != null)			
			
		}//End of try block
		catch(Exception e)
		{
			
			System.err.println("Error reading the queries file....");
			
		}//End of catch block
		
		
	}//End of rankedRetrieval
	
	
	public void calculateQueryMaxTfTermWeight(String sTempQuery)
	{
		
		String sQuery = sTempQuery;
		
		
		
		
		
	}//End of calculateTfIdf
	

}//End of RankedRetrieval
