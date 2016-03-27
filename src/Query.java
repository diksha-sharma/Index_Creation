import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Query 
{

	String sQuery;
	Map<String, Lemma> tmQueryLemmas = new TreeMap<String, Lemma>(); 
	double dMaxFreqLemmaFrequency = 0;
	String sMaxFreqLemma = null;
	double dQueryLen = 0;
	double dAvgQueryLen = 0.00;
	
}
