import java.util.Map;
import java.util.TreeMap;

public class Document 
{

	int iDocId = 0; //Document Id
	int iDocLen = 0; //Number of stems in the document excluding stop words
	double dAvgDocLen = 0.00;
	Map<String, Lemma> tmLemmas = new TreeMap<String, Lemma>(); //Stores the lemmas in the document with their frequency in the document  
	String sHeadline = ""; //Stores the headline of the document
	String sMostFreqLemma = "";
	int iMostFreqLemmaFrequency = 0;
		
}//End of Document
