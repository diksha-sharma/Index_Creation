import java.util.*;
import java.io.*;
import edu.stanford.nlp.ling.CoreAnnotations.LemmaAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

public class Lemmatize 
{

	String[] sStopWords = {"a", "all", "an", "and", "any", "are", "as", "be", "been", "but", "by ", "few", "for", "have", "he", "her", "here", "him", "his", "how", "i", "in", "is", "it", "its", "many", "me", "my", "none", "of", "on ", "or", "our", "she", "some", "the", "their", "them", "there", "they", "that ", "this", "us", "was", "what", "when", "where", "which", "who", "why", "will", "with", "you", "your"};
	Properties propProperties = new Properties();
	StanfordCoreNLP scnLemmatizer;
	Map<String, Term> tmTokenLemmaIndex = new TreeMap<String, Term>();
	Map<String, Term> tmStemLemmaIndex = new TreeMap<String, Term>();
	Compress cCompression = new Compress();
	ArrayList<Document> alDocCollection = new ArrayList<Document>();
	ArrayList<Query> alQueries = new ArrayList<Query>();
	
	public void TokenLemmatizer(String sTempDirectory, String sTempOutPutDirectory, String sTempQueriesFile)
	{
		
		propProperties.put("annotators", "tokenize, ssplit, pos, lemma");
		scnLemmatizer = new StanfordCoreNLP(propProperties);
		
		findLemma(sTempDirectory, sTempQueriesFile);
		
		//Print Token Index UnCompressed
		TokenIndexUnCompressed(sTempOutPutDirectory);
		
				
	}//End of TokenLemmatizer method	
	
	public void StemLemmatizer(Map<String, Term> tmTempStemMap, String sTempOutPutDirectory)
	{
		
		propProperties.put("annotators", "tokenize, ssplit, pos, lemma");
		scnLemmatizer = new StanfordCoreNLP(propProperties);
		
		findStemLemma(tmTempStemMap);
		
		//Print Token Index UnCompressed
		StemIndexUnCompressed(sTempOutPutDirectory);
		
				
	}//End of StemLemmatizer method
	
	public void findLemma(String sTempDirectory, String sTempQueriesFile)
	{
		
		int iFileCount = new File(sTempDirectory).listFiles().length;
		String fFileList[] = new File(sTempDirectory).list();
		File fFile;
		
		FileInputStream fisInputFile;
		DataInputStream disInput;
		BufferedReader brInputReader;
		
		StringTokenizer stStringTokenizer;
		String sInputLine = null;
		String sWord = null;
		boolean bStopWord = false;
		boolean bNewFile = true;
		boolean bTag = false;
		int iDocumentId = -1;
		boolean bHeading = false;
				
		int iAverageDocLength = 0;
		double dAverageDocLength = 0.00;
		
		//For each file fetch tokens and then search for lemma - store lemma in the HashMap
		for(int iFileIndex = 0; iFileIndex < iFileCount; iFileIndex++)
		{
			
			bNewFile = true;
			sInputLine = null;
			iDocumentId = -1;
			bHeading = false;
					
			try 
			{
				
				//******************************************
				// Start processing a file from collection
				//******************************************
				fFile = new File(sTempDirectory + fFileList[iFileIndex]);
				//fFile = new File(sTempDirectory + fFileList[0]);
				fisInputFile = new FileInputStream(fFile);
				disInput = new DataInputStream(fisInputFile);
				brInputReader = new BufferedReader(new InputStreamReader(disInput));
				
				Document dTempDocument = new Document();
				//System.out.println();
				//System.out.println("Reading file:   " + fFileList[0]);
				
				//*************************************
				// Read till the last line of the file
				//*************************************
				while((sInputLine = brInputReader.readLine()) != null)
				{

					//System.out.println("Processing line:  " + sInputLine);
					
					if(bHeading == true)
					{
						
						dTempDocument.sHeadline = dTempDocument.sHeadline + " " + sInputLine;
						
					}
					
					stStringTokenizer = new StringTokenizer(sInputLine);					
					
					//****************************************************************************************
					//For each new word encountered check if the word is a number, a stop word, <tag>, </tag>
					//****************************************************************************************
					while(stStringTokenizer.hasMoreTokens())
					{
					
						sWord = stStringTokenizer.nextToken();
						//System.out.println("Processing word:  " + sWord);
						bStopWord = false;
						bTag = false;
						
						if(bNewFile == true)
						{
							
							if(sInputLine.equals("<DOC>"))
							{
								
								sInputLine = brInputReader.readLine();
								if (sInputLine.equals("<DOCNO>"))
								{
									
									sInputLine = brInputReader.readLine();
									iDocumentId = Integer.parseInt(sInputLine);
									dTempDocument.iDocId = iDocumentId;
									sInputLine = brInputReader.readLine();
									
									bNewFile = false;
									
								}//End of if (sInputLine.equals("<DOCNO>"))
								
							}//End of if(sInputLine.equals("<DOC>"))
							
						}//End of if(bNewFile == true)
						
						//**************************************
						//Remove any stop words from processing
						//**************************************
						for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++)
						{
							
							String sTempWord = sWord.toLowerCase();
							String sTempStopWord = sStopWords[iStopIndex].toLowerCase();
							
							if(sTempWord.equals(sTempStopWord))
							{
								
								bStopWord = true;						
								
							}//End of if(sTempWord.equals(sTempStopWord))
							
						}//End of for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++
						
						if(sWord.startsWith("<") || sWord.endsWith(">"))
						{
							
							//System.out.println("Over Here:  ");
							bTag = true;
							if(sWord.equals("<TITLE>"))
							{
								
								bHeading = true;
								
							}
							
							if(sWord.equals("</TITLE>"))
							{
								
								bHeading = false;
								dTempDocument.sHeadline = dTempDocument.sHeadline.substring(0, dTempDocument.sHeadline.length()-9);
								//System.out.println("Document Heading:  " + dTempDocument.sHeadline);
								
							}
							
							
						}//End of if(sWord.startsWith("<") || sWord.endsWith(">"))
						
						//********************************************************
						// Continue processing if not a stop word or a tag word
						//********************************************************
						if(bStopWord == false && bTag == false)
						{
							
							if(sWord.endsWith("'s"))
							{
								
								sWord = sWord.substring(0, sWord.length()-2);								
							
							}//End of if(sWord.endsWith("'s"))
										
							//Remove all punctuations and numbers and change to lower case
							sWord = sWord.replace("!", "");
							sWord = sWord.replace("@", "");
							sWord = sWord.replace("#", "");
							sWord = sWord.replace("?", "");
							sWord = sWord.replace("'", "");
							sWord = sWord.replace(":", "");
							sWord = sWord.replace(";", "");
							sWord = sWord.replace("=", "");
							sWord = sWord.replace("+", "");
							sWord = sWord.replace("$", "");
							sWord = sWord.replace("%", "");
							sWord = sWord.replace("^", "");
							sWord = sWord.replace("&", "");
							sWord = sWord.replace("*", "");
							sWord = sWord.replace("(", "");
							sWord = sWord.replace(")", "");
							sWord = sWord.replace("|", "");
							sWord = sWord.replace("/", "");
							sWord = sWord.replace("\\", "");
							sWord = sWord.replace(".", "");
							sWord = sWord.replace(",", "");
							sWord = sWord.replace("~", "");
							sWord = sWord.replace("`", "");
							sWord = sWord.replace("[", "");
							sWord = sWord.replace("]", "");
							sWord = sWord.replace("{", "");
							sWord = sWord.replace("}", "");
							sWord = sWord.replace("1", "");
							sWord = sWord.replace("2", "");
							sWord = sWord.replace("3", "");
							sWord = sWord.replace("4", "");
							sWord = sWord.replace("5", "");
							sWord = sWord.replace("6", "");
							sWord = sWord.replace("7", "");
							sWord = sWord.replace("8", "");
							sWord = sWord.replace("9", "");
							sWord = sWord.replace("0", "");
							
							sWord = sWord.toLowerCase();
							sWord = sWord.trim();
							//System.out.println("sWord after all checks:   " + sWord);
							
							if(!sWord.equals(null) && sWord.length() > 1)
							{
								
								
								String sLemmaReturned = null;
								
								if(sWord.contains("-") || sWord.contains("_"))
								{
								
									//If the token consists of hyphens or underscores then split it into sub tokens 
									//and add them as separate tokens
									String[] sSubWords;
									
									
									if (sWord.contains("-")) 
									{
									
										sSubWords = sWord.split("-");
										for (int i=0; i < sSubWords.length; i++) 
										{
										
											//System.out.println("Subword after all checks:   " + sSubWords[i]);
											//System.out.println("Looking for lemma for token:   " + sWord);
											if(sSubWords[i].length() > 1)
											{
												
												sSubWords[i] = sSubWords[i].replace("-", "");
												//System.out.println("Subword after all checks:   " + sSubWords[i]);
												sLemmaReturned = addToIndex(sSubWords[i], iDocumentId);
												//System.out.println("Lemma returned:   " + sLemmaReturned);
												if(!sLemmaReturned.equals(null))
												{
													
													if(dTempDocument.tmLemmas.containsKey(sLemmaReturned))
													{
														
														dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency = dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency + 1;
														//System.out.println("New Frequency of Lemma:   " + sLemmaReturned + "  is: " + dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency);
														
													}
													else
													{
														
														Lemma lTemp = new Lemma();
														lTemp.iLemmaFrequency = 1;
														dTempDocument.tmLemmas.put(sLemmaReturned, lTemp);
														
													}
													
												}
												
											}
											
											
										}//End of for (int i=0; i < sSubWords.length; i++)
										
									}//End of if (sWord.contains("-"))
									else if (sWord.contains("_")) 
									{
									
										sSubWords = sWord.split("_");
										for (int i=0; i < sSubWords.length; i++) 
										{
										
											if(sSubWords[i].length() > 1)
											{
												
												sSubWords[i] = sSubWords[i].replace("_", "");
												//System.out.println("Subword after all checks:   " + sSubWords[i]);
												//System.out.println("Looking for lemma for token:   " + sWord);
												sLemmaReturned = addToIndex(sSubWords[i], iDocumentId);
												//System.out.println("Lemma returned:   " + sLemmaReturned);
												if(!sLemmaReturned.equals(null))
												{
													
													if(dTempDocument.tmLemmas.containsKey(sLemmaReturned))
													{
														
														dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency = dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency + 1;
														//System.out.println("New Frequency of Lemma:   " + sLemmaReturned + "  is: " + dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency);
														
													}
													else
													{
														
														Lemma lTemp = new Lemma();
														lTemp.iLemmaFrequency = 1;
														dTempDocument.tmLemmas.put(sLemmaReturned, lTemp);
														
													}
													
												}
												
											}
											
										}//End of for (int i=0; i < sSubWords.length; i++)
										
									}//End of else if (sWord.contains("_"))
									
								}//End of if(sWord.contains("-") || sWord.contains("_"))
								else
								{

									if(!sWord.equals(null))
									{
										
										//System.out.println("Looking for lemma for token:   " + sWord);
										sLemmaReturned = addToIndex(sWord, iDocumentId);
										//System.out.println("Lemma returned:   " + sLemmaReturned);
										
										if(!sLemmaReturned.equals(null))
										{
											
											if(dTempDocument.tmLemmas.containsKey(sLemmaReturned))
											{
												
												//System.out.println("Old Frequency of Lemma:   " + sLemmaReturned + "  is: " + dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency);
												dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency = dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency + 1;
												//System.out.println("New Frequency of Lemma:   " + sLemmaReturned + "  is: " + dTempDocument.tmLemmas.get(sLemmaReturned).iLemmaFrequency);
												
											}
											else
											{
												
												Lemma lTemp = new Lemma();
												lTemp.iLemmaFrequency = 1;
												dTempDocument.tmLemmas.put(sLemmaReturned, lTemp);
												
											}
											
										}
										
									}								
									
								}//End of else	
								
							}
													
							
						}//End of if(bStopWord == false)
						
					}//End of while(stStringTokenizer.hasMoreTokens())
					
				}//End of while((sInputLine = brInputReader.readLine()) != null)
				
				int iTempFrequency = 0;
				
				for(String sTempLemma : dTempDocument.tmLemmas.keySet())
				{
					
					//System.out.println(sTempLemma + " Frequency: " + dTempDocument.tmLemmas.get(sTempLemma).intValue());
					dTempDocument.iDocLen = dTempDocument.iDocLen + dTempDocument.tmLemmas.get(sTempLemma).iLemmaFrequency;
					
					if(iTempFrequency < dTempDocument.tmLemmas.get(sTempLemma).iLemmaFrequency)
					{
						
						dTempDocument.sMostFreqLemma = sTempLemma;
						dTempDocument.iMostFreqLemmaFrequency = dTempDocument.tmLemmas.get(sTempLemma).iLemmaFrequency;
						iTempFrequency = dTempDocument.tmLemmas.get(sTempLemma).iLemmaFrequency;
						
					}
					
				}
				
				//System.out.println("Document Most Frequent lemma: " + dTempDocument.sMostFreqLemma);
				//System.out.println("Document Most Frequent lemma frequency: " + dTempDocument.iMostFreqLemmaFrequency);
				iAverageDocLength = iAverageDocLength + dTempDocument.iDocLen;
				
				alDocCollection.add(dTempDocument);
				
			}//End of try block
			catch(Exception e)
			{
				
				System.err.println("Error during Lemmatizing ....");
				
			}//End of catch(Exception e)

			
		}//End of for(int iFileIndex = 0; iFileIndex < iFileCount; iFileIndex++)
		
		dAverageDocLength = iAverageDocLength/1440;	
		
		for(int y=0; y < alDocCollection.size(); y++)
		{
			
			alDocCollection.get(y).dAvgDocLen = dAverageDocLength;
			
		}
		
		calculateMaxTFTermWeight();
		
		calculateOkapiWeight(dAverageDocLength);	
				
		//Process Queries
		processQueries(sTempQueriesFile);
		
		//Now we have queries and documents processed... performing ranked retrieval
		rankedRetrievalMaxTermTfWeight();
		rankedRetrievalOkapiWeight();
		
	}//End of findLemma
	
	
	public void calculateMaxTFTermWeight()
	{
		
		//W1 = (0.4 + 0.6 * log (tf + 0.5) / log (maxtf + 1.0)) * (log (collectionsize / df)/ log (collectionsize))
		int tf = 0;
		int maxtf = 0;
		int collectionsize = 1400;
		int df = 0;
		
		double dNormalizingFactor = 0.00;
		
		for(int i=0; i< alDocCollection.size(); i++)
		{
			
			for(String sKey: alDocCollection.get(i).tmLemmas.keySet())
			{
				
				tf = alDocCollection.get(i).tmLemmas.get(sKey).iLemmaFrequency;
				maxtf = alDocCollection.get(i).iMostFreqLemmaFrequency;				
				df = tmTokenLemmaIndex.get(sKey).iDocumentFrequency;
				
				alDocCollection.get(i).tmLemmas.get(sKey).dMaxTfTermWeightUnNormalized = (0.4 + 0.6 * Math.log(tf + 0.5) / Math.log(maxtf + 1.0)) * (Math.log(collectionsize / df)/ Math.log(collectionsize)) ;
				
				//System.out.println("Lemma: " + sKey);
				//System.out.println("tf: " + tf);
				//System.out.println("df: " + df);
				//System.out.println("W1 weight: " + alDocCollection.get(i).tmLemmas.get(sKey).dMaxTfTermWeightUnNormalized);	
				
				dNormalizingFactor = dNormalizingFactor + (alDocCollection.get(i).tmLemmas.get(sKey).dMaxTfTermWeightUnNormalized * alDocCollection.get(i).tmLemmas.get(sKey).dMaxTfTermWeightUnNormalized);
						
			}
			
			//System.out.println();
			dNormalizingFactor = Math.sqrt(dNormalizingFactor);
			
			for(String sKey: alDocCollection.get(i).tmLemmas.keySet())
			{
			
				//System.out.println("Lemma: " + sKey);
				alDocCollection.get(i).tmLemmas.get(sKey).dMaxTfTermWeightNormalized = alDocCollection.get(i).tmLemmas.get(sKey).dMaxTfTermWeightUnNormalized/dNormalizingFactor ;
				//System.out.println("W1 weight normalized: " + alDocCollection.get(i).tmLemmas.get(sKey).dMaxTfTermWeightNormalized);	
						
			}
			
		}		
		
	}
	
	public void calculateOkapiWeight(double iTempAvgDocLength)
	{
				
		//W2 = (0.4 + 0.6 * (tf / (tf + 0.5 + 1.5 * (doclen / avgdoclen))) * log (collectionsize / df)/ log (collectionsize))
		int tf = 0;
		int doclen = 0;
		int collectionsize = 1400;
		int df = 0;
		double avgdoclen = iTempAvgDocLength;
		
		double dNormalizingFactor = 0.00;
		
		for(int i=0; i< alDocCollection.size(); i++)
		{
			
			for(String sKey: alDocCollection.get(i).tmLemmas.keySet())
			{
				
				tf = alDocCollection.get(i).tmLemmas.get(sKey).iLemmaFrequency;
				df = tmTokenLemmaIndex.get(sKey).iDocumentFrequency;
				doclen = alDocCollection.get(i).iDocLen;
				
				alDocCollection.get(i).tmLemmas.get(sKey).dOkapiWeightUnNormalized = (0.4 + 0.6 * (tf / (tf + 0.5 + 1.5 * (doclen / avgdoclen))) * Math.log(collectionsize / df)/ Math.log(collectionsize));
				
				//System.out.println("Lemma: " + sKey);
				//System.out.println("tf: " + tf);
				//System.out.println("df: " + df);
				//System.out.println("avgdoclen: " + avgdoclen);
				//System.out.println("doclen: " + doclen);
				//System.out.println("W2 weight: " + alDocCollection.get(i).tmLemmas.get(sKey).dOkapiWeightUnNormalized);	
				
				dNormalizingFactor = dNormalizingFactor + (alDocCollection.get(i).tmLemmas.get(sKey).dOkapiWeightUnNormalized * alDocCollection.get(i).tmLemmas.get(sKey).dOkapiWeightUnNormalized);
						
			}
			
			//System.out.println();
			dNormalizingFactor = Math.sqrt(dNormalizingFactor);
			
			for(String sKey: alDocCollection.get(i).tmLemmas.keySet())
			{
			
				//System.out.println("Lemma: " + sKey);
				alDocCollection.get(i).tmLemmas.get(sKey).dOkapiWeightNormalized = alDocCollection.get(i).tmLemmas.get(sKey).dOkapiWeightUnNormalized/dNormalizingFactor ;
				//System.out.println("W2 weight normalized: " + alDocCollection.get(i).tmLemmas.get(sKey).dOkapiWeightNormalized);	
						
			}
			
		}
		
	}
	
	
	public String addToIndex(String sTempWord, int iTempDocId)
	{
		
		String sLemma = null;
				
		//Ignoring all tokens of length less or or equal to 1
		if(sTempWord.length() > 1)
		{
			
			Annotation aAnnotation = scnLemmatizer.process(sTempWord);
			
			for(CoreMap cmSentence: aAnnotation.get(SentencesAnnotation.class))
			{
				
				for (CoreLabel clToken: cmSentence.get(TokensAnnotation.class)) 
				{
					
					sLemma = clToken.get(LemmaAnnotation.class);
					sLemma = sLemma.toLowerCase();
					//System.out.println(sTempWord + "   " + sLemma);
					
				}//End of for (CoreLabel clToken: cmSentence.get(TokensAnnotation.class))				
				
			}//End of for(CoreMap cmSentence: aAnnotation.get(SentencesAnnotation.class))

			//Now that we have the lemma - add it to index		
			if(tmTokenLemmaIndex.containsKey(sLemma))
			{
				
				tmTokenLemmaIndex.get(sLemma).iFrequencyInCorpus = tmTokenLemmaIndex.get(sLemma).iFrequencyInCorpus + 1;
				
				if(!tmTokenLemmaIndex.get(sLemma).tmPosting.containsKey(iTempDocId))
				{
					
					tmTokenLemmaIndex.get(sLemma).tmPosting.put(iTempDocId, 1);
					tmTokenLemmaIndex.get(sLemma).iDocumentFrequency = tmTokenLemmaIndex.get(sLemma).iDocumentFrequency + 1;
					
				}//End of if(!hmLemmaIndex.get(sLemma).hmPosting.containsKey(iTempDocId))
				else
				{
					
					int iOldFrequency = tmTokenLemmaIndex.get(sLemma).tmPosting.get(iTempDocId).intValue();
					int iNewFrequency = tmTokenLemmaIndex.get(sLemma).tmPosting.get(iTempDocId).intValue() + 1;
					
					tmTokenLemmaIndex.get(sLemma).tmPosting.replace(iTempDocId, iOldFrequency, iNewFrequency);
					
				}//End of else
				
			}//End of if(hmLemmaIndex.containsKey(sLemma))
			else
			{
				
				Term tempTerm = new Term();
				tempTerm.iFrequencyInCorpus = tempTerm.iFrequencyInCorpus + 1;
				tempTerm.tmPosting.put(iTempDocId, 1);
				tempTerm.iDocumentFrequency = tempTerm.iDocumentFrequency + 1;
				
				tmTokenLemmaIndex.put(sLemma, tempTerm);			
				
			}//End of else
		
		}//End of if(sTempWord.length() > 1)
		
		return sLemma;
		
	}//End of addToIndex	

	public void TokenIndexUnCompressed(String sTempOutPutDirectory)
	{
		
		try
		{
			
			PrintWriter pwOutPutFile = new PrintWriter(new FileWriter(sTempOutPutDirectory + "Index_Version1.uncompress.txt"));
			pwOutPutFile.println(tmTokenLemmaIndex);			
			pwOutPutFile.close();
			
		}//End of try block
		catch(Exception e)
		{
			
			System.err.println("Error encountered while writing to output file...");
			
		}//End of catch block
				
		//Now we compress the index
		cCompression.compressTokenIndex(tmTokenLemmaIndex,sTempOutPutDirectory);
				
	}//End of TokenIndexUnCompressed()	
	
	public void findStemLemma(Map<String, Term> tmTempStemMap)
	{
		
		Map<String, Term> tmTempStemLemmaIndex = new TreeMap<String, Term>();
		tmTempStemLemmaIndex.putAll(tmTempStemMap);

		boolean bStopWord = false;
		
		//Ignoring all tokens of length less or or equal to 1
		for(String sTempWord : tmTempStemLemmaIndex.keySet())
		{
			
			bStopWord = false;
			//**************************************
			//Remove any stop words from processing
			//**************************************
			for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++)
			{
				
				String sTWord = sTempWord.toLowerCase();
				String sTempStopWord = sStopWords[iStopIndex].toLowerCase();
				
				if(sTWord.equals(sTempStopWord))
				{
					
					bStopWord = true;						
					
				}//End of if(sTempWord.equals(sTempStopWord))
				
			}//End of for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++
			
			if(bStopWord == false)
			{
				
				//Now that we have the lemma - add it to index			
				tmStemLemmaIndex.put(sTempWord, tmTempStemLemmaIndex.get(sTempWord));				
				
			}//End of if(bStopWord == false)
		
		}//End of if(sTempWord.length() > 1)		
	
	}//End of findStemLemma	
	
	public void StemIndexUnCompressed(String sTempOutPutDirectory)
	{
		
		try
		{
			
			PrintWriter pwOutPutFile = new PrintWriter(new FileWriter(sTempOutPutDirectory + "Index_Version2.uncompress.txt"));		
			pwOutPutFile.println(tmStemLemmaIndex);			
			pwOutPutFile.close();
			
		}//End of try block
		catch(Exception e)
		{
			
			System.err.println("Error encountered while writing to output file...");
			
		}//End of catch block			
		
		//Now we compress the index
		cCompression.compressStemIndex(tmStemLemmaIndex,sTempOutPutDirectory);
				
	}//End of StemIndexUnCompressed()	
	
	
	public void processQueries(String sQueriesFile)
	{
		
		String sQLemma = null;
		double dQueryLength = 0;
		double dAverageQueryLength = 0.00;
		
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
					
					Query qTempQuery = new Query();
					
					qTempQuery.sQuery = sQuestion;
					//System.out.println(qTempQuery.sQuery);
					//alQueries.add(qTempQuery);
					
					StringTokenizer stQueryTokenizer = new StringTokenizer(qTempQuery.sQuery);
					String sWord = null;
					boolean bStopWord = false;
					
					while(stQueryTokenizer.hasMoreTokens())
					{
						
						String[] sSubWords;
						bStopWord = false;
						
						sWord = stQueryTokenizer.nextToken();
						sWord = sWord.toLowerCase();
						sWord = sWord.trim();
						
						//System.out.println("sWord:  " + sWord);
						if (sWord.contains("-")) 
						{
						
							sSubWords = sWord.split("-");
							for (int i=0; i < sSubWords.length; i++) 
							{
							
								if(sSubWords[i].length() > 1)
								{
									
									sSubWords[i] = sSubWords[i].replace("-", "");
									sSubWords[i] = sSubWords[i].replace("!", "");
									sSubWords[i] = sSubWords[i].replace("@", "");
									sSubWords[i] = sSubWords[i].replace("#", "");
									sSubWords[i] = sSubWords[i].replace("?", "");
									sSubWords[i] = sSubWords[i].replace("'", "");
									sSubWords[i] = sSubWords[i].replace(":", "");
									sSubWords[i] = sSubWords[i].replace(";", "");
									sSubWords[i] = sSubWords[i].replace("=", "");
									sSubWords[i] = sSubWords[i].replace("+", "");
									sSubWords[i] = sSubWords[i].replace("$", "");
									sSubWords[i] = sSubWords[i].replace("%", "");
									sSubWords[i] = sSubWords[i].replace("^", "");
									sSubWords[i] = sSubWords[i].replace("&", "");
									sSubWords[i] = sSubWords[i].replace("*", "");
									sSubWords[i] = sSubWords[i].replace("(", "");
									sSubWords[i] = sSubWords[i].replace(")", "");
									sSubWords[i] = sSubWords[i].replace("|", "");
									sSubWords[i] = sSubWords[i].replace("/", "");
									sSubWords[i] = sSubWords[i].replace("\\", "");
									sSubWords[i] = sSubWords[i].replace(".", "");
									sSubWords[i] = sSubWords[i].replace(",", "");
									sSubWords[i] = sSubWords[i].replace("~", "");
									sSubWords[i] = sSubWords[i].replace("`", "");
									sSubWords[i] = sSubWords[i].replace("[", "");
									sSubWords[i] = sSubWords[i].replace("]", "");
									sSubWords[i] = sSubWords[i].replace("{", "");
									sSubWords[i] = sSubWords[i].replace("}", "");
									sSubWords[i] = sSubWords[i].replace("1", "");
									sSubWords[i] = sSubWords[i].replace("2", "");
									sSubWords[i] = sSubWords[i].replace("3", "");
									sSubWords[i] = sSubWords[i].replace("4", "");
									sSubWords[i] = sSubWords[i].replace("5", "");
									sSubWords[i] = sSubWords[i].replace("6", "");
									sSubWords[i] = sSubWords[i].replace("7", "");
									sSubWords[i] = sSubWords[i].replace("8", "");
									sSubWords[i] = sSubWords[i].replace("9", "");
									sSubWords[i] = sSubWords[i].replace("0", "");
									
									for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++)
									{
										
										String sTempWord = sSubWords[i].toLowerCase();
										String sTempStopWord = sStopWords[iStopIndex].toLowerCase();
										
										if(sTempWord.equals(sTempStopWord))
										{
											
											bStopWord = true;						
											
										}//End of if(sTempWord.equals(sTempStopWord))
										
									}//End of for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++
									
									if(bStopWord == false)
									{
										
										//System.out.println("If sSubWords[i]:  " + sSubWords[i]);
										sQLemma = findQueryLemmas(sSubWords[i]);
										//System.out.println("sQLemma:  " + sQLemma);
										
										if(qTempQuery.tmQueryLemmas.containsKey(sQLemma))
										{
											
											qTempQuery.tmQueryLemmas.get(sQLemma).iLemmaFrequency = qTempQuery.tmQueryLemmas.get(sQLemma).iLemmaFrequency + 1;
											
										}
										else
										{
											
											Lemma lTemp = new Lemma();
											lTemp.iLemmaFrequency = 1;
											qTempQuery.tmQueryLemmas.put(sQLemma, lTemp);
											
										}
										
									}
									
								}
								
							}
							
						}
						else if (sWord.contains("_")) 
						{
						
							sSubWords = sWord.split("_");
							for (int i=0; i < sSubWords.length; i++) 
							{
							
								if(sSubWords[i].length() > 1)
								{
									
									sSubWords[i] = sSubWords[i].replace("-", "");
									sSubWords[i] = sSubWords[i].replace("!", "");
									sSubWords[i] = sSubWords[i].replace("@", "");
									sSubWords[i] = sSubWords[i].replace("#", "");
									sSubWords[i] = sSubWords[i].replace("?", "");
									sSubWords[i] = sSubWords[i].replace("'", "");
									sSubWords[i] = sSubWords[i].replace(":", "");
									sSubWords[i] = sSubWords[i].replace(";", "");
									sSubWords[i] = sSubWords[i].replace("=", "");
									sSubWords[i] = sSubWords[i].replace("+", "");
									sSubWords[i] = sSubWords[i].replace("$", "");
									sSubWords[i] = sSubWords[i].replace("%", "");
									sSubWords[i] = sSubWords[i].replace("^", "");
									sSubWords[i] = sSubWords[i].replace("&", "");
									sSubWords[i] = sSubWords[i].replace("*", "");
									sSubWords[i] = sSubWords[i].replace("(", "");
									sSubWords[i] = sSubWords[i].replace(")", "");
									sSubWords[i] = sSubWords[i].replace("|", "");
									sSubWords[i] = sSubWords[i].replace("/", "");
									sSubWords[i] = sSubWords[i].replace("\\", "");
									sSubWords[i] = sSubWords[i].replace(".", "");
									sSubWords[i] = sSubWords[i].replace(",", "");
									sSubWords[i] = sSubWords[i].replace("~", "");
									sSubWords[i] = sSubWords[i].replace("`", "");
									sSubWords[i] = sSubWords[i].replace("[", "");
									sSubWords[i] = sSubWords[i].replace("]", "");
									sSubWords[i] = sSubWords[i].replace("{", "");
									sSubWords[i] = sSubWords[i].replace("}", "");
									sSubWords[i] = sSubWords[i].replace("1", "");
									sSubWords[i] = sSubWords[i].replace("2", "");
									sSubWords[i] = sSubWords[i].replace("3", "");
									sSubWords[i] = sSubWords[i].replace("4", "");
									sSubWords[i] = sSubWords[i].replace("5", "");
									sSubWords[i] = sSubWords[i].replace("6", "");
									sSubWords[i] = sSubWords[i].replace("7", "");
									sSubWords[i] = sSubWords[i].replace("8", "");
									sSubWords[i] = sSubWords[i].replace("9", "");
									sSubWords[i] = sSubWords[i].replace("0", "");
									
									for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++)
									{
										
										String sTempWord = sSubWords[i].toLowerCase();
										String sTempStopWord = sStopWords[iStopIndex].toLowerCase();
										
										if(sTempWord.equals(sTempStopWord))
										{
											
											bStopWord = true;						
											
										}//End of if(sTempWord.equals(sTempStopWord))
										
									}//End of for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++
									
									if(bStopWord == false)
									{
										
										//System.out.println("sSubWords[i]:  " + sSubWords[i]);
										sQLemma = findQueryLemmas(sSubWords[i]);
										//System.out.println("sQLemma:  " + sQLemma);
										
										if(qTempQuery.tmQueryLemmas.containsKey(sQLemma))
										{
											
											qTempQuery.tmQueryLemmas.get(sQLemma).iLemmaFrequency = qTempQuery.tmQueryLemmas.get(sQLemma).iLemmaFrequency + 1;
											
										}
										else
										{
											
											Lemma lTemp = new Lemma();
											lTemp.iLemmaFrequency = 1;
											qTempQuery.tmQueryLemmas.put(sQLemma, lTemp);
											
										}
										
									}
									
								}
								
							}
							
						}
						else
						{
							
							sWord = sWord.replace("!", "");
							sWord = sWord.replace("@", "");
							sWord = sWord.replace("#", "");
							sWord = sWord.replace("?", "");
							sWord = sWord.replace("'", "");
							sWord = sWord.replace(":", "");
							sWord = sWord.replace(";", "");
							sWord = sWord.replace("=", "");
							sWord = sWord.replace("+", "");
							sWord = sWord.replace("$", "");
							sWord = sWord.replace("%", "");
							sWord = sWord.replace("^", "");
							sWord = sWord.replace("&", "");
							sWord = sWord.replace("*", "");
							sWord = sWord.replace("(", "");
							sWord = sWord.replace(")", "");
							sWord = sWord.replace("|", "");
							sWord = sWord.replace("/", "");
							sWord = sWord.replace("\\", "");
							sWord = sWord.replace(".", "");
							sWord = sWord.replace(",", "");
							sWord = sWord.replace("~", "");
							sWord = sWord.replace("`", "");
							sWord = sWord.replace("[", "");
							sWord = sWord.replace("]", "");
							sWord = sWord.replace("{", "");
							sWord = sWord.replace("}", "");
							sWord = sWord.replace("1", "");
							sWord = sWord.replace("2", "");
							sWord = sWord.replace("3", "");
							sWord = sWord.replace("4", "");
							sWord = sWord.replace("5", "");
							sWord = sWord.replace("6", "");
							sWord = sWord.replace("7", "");
							sWord = sWord.replace("8", "");
							sWord = sWord.replace("9", "");
							sWord = sWord.replace("0", "");
							
							for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++)
							{
								
								String sTempWord = sWord.toLowerCase();
								String sTempStopWord = sStopWords[iStopIndex].toLowerCase();
								
								if(sTempWord.equals(sTempStopWord))
								{
									
									bStopWord = true;						
									
								}//End of if(sTempWord.equals(sTempStopWord))
								
							}//End of for(int iStopIndex = 0; iStopIndex < 54; iStopIndex++
							
							if(bStopWord == false)
							{
								
								//System.out.println("sWord:  " + sWord);
								sQLemma = findQueryLemmas(sWord);
								//System.out.println("sQLemma:  " + sQLemma);
								
								if(qTempQuery.tmQueryLemmas.containsKey(sQLemma))
								{
									
									qTempQuery.tmQueryLemmas.get(sQLemma).iLemmaFrequency = qTempQuery.tmQueryLemmas.get(sQLemma).iLemmaFrequency + 1;
									
								}
								else
								{
									
									Lemma lTemp = new Lemma();
									lTemp.iLemmaFrequency = 1;
									qTempQuery.tmQueryLemmas.put(sQLemma, lTemp);
									
								}
								
							}
							
						}
						
					}
					
					int iTempFrequency = 0;
					
					for(String sTempLemma : qTempQuery.tmQueryLemmas.keySet())
					{
						
						//System.out.println(sTempLemma + " Frequency: " + dTempDocument.tmLemmas.get(sTempLemma).intValue());
						qTempQuery.dQueryLen = qTempQuery.dQueryLen + qTempQuery.tmQueryLemmas.get(sTempLemma).iLemmaFrequency;
						
						if(iTempFrequency < qTempQuery.tmQueryLemmas.get(sTempLemma).iLemmaFrequency)
						{
							
							qTempQuery.sMaxFreqLemma = sTempLemma;
							qTempQuery.dMaxFreqLemmaFrequency = qTempQuery.tmQueryLemmas.get(sTempLemma).iLemmaFrequency;
							iTempFrequency = qTempQuery.tmQueryLemmas.get(sTempLemma).iLemmaFrequency;
							
						}
						
					}
					
					dQueryLength = dQueryLength + qTempQuery.dQueryLen;
					
					alQueries.add(qTempQuery);
					
				}//End of if(sInput.equals(sQuery))				
				
			}//End of while((sInput = brQueriesInput.readLine()) != null)
			
		}//End of try block
		catch(Exception e)
		{
			
			System.err.println("Error reading the queries file....");
			
		}//End of catch block
		
		dAverageQueryLength = dQueryLength/alQueries.size();
		
		for(int z=0; z< alQueries.size(); z++)
		{
			
			alQueries.get(z).dAvgQueryLen = dAverageQueryLength;
			
		}
		
		//We now have the query lemmas and we can calculate weights
		//W1 = (0.4 + 0.6 * log (tf + 0.5) / log (maxtf + 1.0)) * (log (collectionsize / df)/ log (collectionsize))
		double tf = 0;
		double maxtf = 0;
		double collectionsize = 1;
		double df = 1;
		
		double dNormalizingFactor = 0.00;
		
		for(int q=0; q<alQueries.size(); q++)
		{
			
			for(String sKey: alQueries.get(q).tmQueryLemmas.keySet())
			{
				
				tf = alQueries.get(q).tmQueryLemmas.get(sKey).iLemmaFrequency;
				maxtf = alQueries.get(q).dMaxFreqLemmaFrequency;	
				
				//if(tmTokenLemmaIndex.containsKey(sKey))
				{
					
					//df = tmTokenLemmaIndex.get(sKey).iDocumentFrequency;
					alQueries.get(q).tmQueryLemmas.get(sKey).dMaxTfTermWeightUnNormalized = (0.4 + 0.6 * Math.log(tf + 0.5) / Math.log(maxtf + 1.0)) ;
					
				}
				//else
				{
					
					//df = 0;
					//alQueries.get(q).tmQueryLemmas.get(sKey).dMaxTfTermWeightUnNormalized = 0;
					
				}
				
				//System.out.println("Lemma: " + sKey);
				//System.out.println("tf: " + tf);
				//System.out.println("df: " + df);
				//System.out.println("W1 weight: " + alQueries.get(q).tmQueryLemmas.get(sKey).dMaxTfTermWeightUnNormalized);	
				
				dNormalizingFactor = dNormalizingFactor + (alQueries.get(q).tmQueryLemmas.get(sKey).dMaxTfTermWeightUnNormalized * alQueries.get(q).tmQueryLemmas.get(sKey).dMaxTfTermWeightUnNormalized);
						
			}
			
			//System.out.println();
			dNormalizingFactor = Math.sqrt(dNormalizingFactor);
			
			for(String sKey2: alQueries.get(q).tmQueryLemmas.keySet())
			{
			
				//System.out.println("Lemma: " + sKey);
				if(alQueries.get(q).tmQueryLemmas.get(sKey2).dMaxTfTermWeightUnNormalized == 0)
				{
					
					alQueries.get(q).tmQueryLemmas.get(sKey2).dMaxTfTermWeightNormalized = 0.00;
					
				}
				else
				{
					
					alQueries.get(q).tmQueryLemmas.get(sKey2).dMaxTfTermWeightNormalized = alQueries.get(q).tmQueryLemmas.get(sKey2).dMaxTfTermWeightUnNormalized/dNormalizingFactor;
					
				}
				
				//System.out.println("W1 weight normalized: " + alQueries.get(q).tmQueryLemmas.get(sKey2).dMaxTfTermWeightNormalized);	
						
			}
			
		}

		//W2 = (0.4 + 0.6 * (tf / (tf + 0.5 + 1.5 * (doclen / avgdoclen))) * log (collectionsize / df)/ log (collectionsize))
		tf = 0;
		maxtf = 0;
		collectionsize = 1;
		df = 1;
		double doclen = 0.00;
		double avgdoclen = 0.00;
		
		dNormalizingFactor = 0.00;
		
		for(int q=0; q < alQueries.size(); q++)
		{
			
			for(String sKey: alQueries.get(q).tmQueryLemmas.keySet())
			{
				
				tf = alQueries.get(q).tmQueryLemmas.get(sKey).iLemmaFrequency;
				maxtf = alQueries.get(q).dMaxFreqLemmaFrequency;	
				doclen = alQueries.get(q).dQueryLen;
				avgdoclen = alQueries.get(q).dAvgQueryLen;
				
				//if(tmTokenLemmaIndex.containsKey(sKey))
				{
					
					//df = tmTokenLemmaIndex.get(sKey).iDocumentFrequency;
					alQueries.get(q).tmQueryLemmas.get(sKey).dOkapiWeightUnNormalized = (0.4 + 0.6 * (tf / (tf + 0.5 + 1.5 * (doclen / avgdoclen))));
					
				}
				//else
				{
					
					//df = 0;
					//alQueries.get(q).tmQueryLemmas.get(sKey).dOkapiWeightUnNormalized = 0;
					
				}
				
				//System.out.println("Lemma: " + sKey);
				//System.out.println("tf: " + tf);
				//System.out.println("df: " + df);
				//System.out.println("W2 weight: " + alQueries.get(q).tmQueryLemmas.get(sKey).dOkapiWeightUnNormalized);	
				
				dNormalizingFactor = dNormalizingFactor + (alQueries.get(q).tmQueryLemmas.get(sKey).dOkapiWeightUnNormalized * alQueries.get(q).tmQueryLemmas.get(sKey).dOkapiWeightUnNormalized);
						
			}
			
			//System.out.println();
			dNormalizingFactor = Math.sqrt(dNormalizingFactor);
			
			for(String sKey2: alQueries.get(q).tmQueryLemmas.keySet())
			{
			
				//System.out.println("Lemma: " + sKey);
				if(alQueries.get(q).tmQueryLemmas.get(sKey2).dOkapiWeightUnNormalized == 0)
				{
					
					alQueries.get(q).tmQueryLemmas.get(sKey2).dOkapiWeightNormalized = 0.00;
					
				}
				else
				{
					
					alQueries.get(q).tmQueryLemmas.get(sKey2).dOkapiWeightNormalized = alQueries.get(q).tmQueryLemmas.get(sKey2).dOkapiWeightUnNormalized/dNormalizingFactor;
					
				}
				
				//System.out.println("W2 weight normalized: " + alQueries.get(q).tmQueryLemmas.get(sKey2).dOkapiWeightNormalized);	
						
			}
			
		}
		
		printQueryVectors();
		
		
	}//End of rankedRetrieval
	
	public void printQueryVectors()
	{
		
		for(int i = 0; i< alQueries.size(); i++)
		{
			
			System.out.print("Query:  ");
			System.out.println(alQueries.get(i).sQuery);
			System.out.println("Lemmas:" );
			
			for(String sQLemma : alQueries.get(i).tmQueryLemmas.keySet())
			{
				
				System.out.println("Lemma: " + sQLemma);
				System.out.println("Max TF Term Weight (Un-normalized):   " + alQueries.get(i).tmQueryLemmas.get(sQLemma).dMaxTfTermWeightUnNormalized);
				System.out.println("Okapi Weight (Un-normalized):   " + alQueries.get(i).tmQueryLemmas.get(sQLemma).dOkapiWeightUnNormalized);
				
			}
			
			System.out.println();
			
		}		
		
	}

	
	public void rankedRetrievalMaxTermTfWeight()
	{
		
		System.out.println();
		System.out.println("Max TF Term Weighting...");
		double dCosineSim = 0.00;
		
		//Process each query 
		for(int q = 0; q < alQueries.size(); q++)
		{
		
			double[] dCosineSimilarity = new double[1400];
			System.out.println(" ***************************** ");
			System.out.println("Processing Query:  " + alQueries.get(q).sQuery);
			
			//for each document
			for(int d = 0; d< alDocCollection.size(); d++)
			{
				
				dCosineSim = 0;
				
				for(String sQLemma: alQueries.get(q).tmQueryLemmas.keySet())
				{
					
					if(alDocCollection.get(d).tmLemmas.containsKey(sQLemma))
					{
						
						dCosineSim = dCosineSim + (alDocCollection.get(d).tmLemmas.get(sQLemma).dMaxTfTermWeightNormalized * alQueries.get(q).tmQueryLemmas.get(sQLemma).dMaxTfTermWeightNormalized);						
						
					}
					
				}
				
				dCosineSimilarity[d] = dCosineSim;
				//System.out.println("Cosine Similarity of Query and Document is :  " + dCosineSimilarity[d]);
				
			}		
			
			double dMinCosSim = 0.00;
			int iMinCosSimIndex = -1;
			
			ArrayList<Document> alTopDocs = new ArrayList<Document>();
			boolean bAdded = false;
			
			double[] dTop5RankedDocsCosSim = new double[5];
			
			for(int iTop = 0 ; iTop < 5; iTop++)
			{
				
				dMinCosSim = 0.00;
				iMinCosSimIndex = -1;
				
				//Finding top 5 documents
				for(int a = 0; a < dCosineSimilarity.length; a++)
				{
					
					bAdded = false;
					
					if(dCosineSimilarity[a] > dMinCosSim)
					{
						
						for(int iadded = 0; iadded < alTopDocs.size(); iadded++)
						{
							
							if(alTopDocs.get(iadded).iDocId == (a+1))
							{
								
								bAdded = true;
								
							}
							
						}
						
						if (bAdded == false)
						{
							
							dMinCosSim = dCosineSimilarity[a];
							iMinCosSimIndex = a;
							
						}
						
					}
					
				}
				
				alTopDocs.add(alDocCollection.get(iMinCosSimIndex));
				dTop5RankedDocsCosSim[iTop] = dMinCosSim;
				
			}
			
			System.out.println("Top 5 Documents fetched in order:  ");
			
			for(int iTop = 0 ; iTop < 5; iTop++)
			{
				System.out.println();
				System.out.println("Rank#: " + (iTop+1));
				System.out.println("Cosine Similarity: " + dTop5RankedDocsCosSim[iTop]);
				System.out.println("Doc#: " + alTopDocs.get(iTop).iDocId+ "  Document Headline: " + alTopDocs.get(iTop).sHeadline);
				System.out.println("Document Vector: ");
				
				for(String sDLemma : alTopDocs.get(iTop).tmLemmas.keySet())
				{
					
					System.out.println("Lemma: " + sDLemma);
					System.out.println("Max TF Term Weight (Un-normalized):   " + alTopDocs.get(iTop).tmLemmas.get(sDLemma).dMaxTfTermWeightUnNormalized);
					
				}
				
			}
						
		}		
		
	}
	
	public void rankedRetrievalOkapiWeight()
	{
		
		System.out.println();
		System.out.println("Okapi Weighting...");
		double dCosineSim = 0.00;
		
		//Process each query 
		for(int q = 0; q < alQueries.size(); q++)
		{
		
			double[] dCosineSimilarity = new double[1400];
			System.out.println(" ***************************** ");
			System.out.println("Processing Query:  " + alQueries.get(q).sQuery);
			
			//for each document
			for(int d = 0; d< alDocCollection.size(); d++)
			{
				
				dCosineSim = 0;
				
				for(String sQLemma: alQueries.get(q).tmQueryLemmas.keySet())
				{
					
					if(alDocCollection.get(d).tmLemmas.containsKey(sQLemma))
					{
						
						dCosineSim = dCosineSim + (alDocCollection.get(d).tmLemmas.get(sQLemma).dOkapiWeightNormalized * alQueries.get(q).tmQueryLemmas.get(sQLemma).dOkapiWeightNormalized);						
						
					}
					
				}
				
				dCosineSimilarity[d] = dCosineSim;
				//System.out.println("Cosine Similarity of Query and Document is :  " + dCosineSimilarity[d]);
				
			}		
			
			double dMinCosSim = 0.00;
			int iMinCosSimIndex = -1;
			
			ArrayList<Document> alTopDocs = new ArrayList<Document>();
			boolean bAdded = false;
			
			double[] dTop5RankedDocsCosSim = new double[5];
			
			for(int iTop = 0 ; iTop < 5; iTop++)
			{
				
				dMinCosSim = 0.00;
				iMinCosSimIndex = -1;
				
				//Finding top 5 documents
				for(int a = 0; a < dCosineSimilarity.length; a++)
				{
					
					bAdded = false;
					
					if(dCosineSimilarity[a] > dMinCosSim)
					{
						
						for(int iadded = 0; iadded < alTopDocs.size(); iadded++)
						{
							
							if(alTopDocs.get(iadded).iDocId == (a+1))
							{
								
								bAdded = true;
								
							}
							
						}
						
						if (bAdded == false)
						{
							
							dMinCosSim = dCosineSimilarity[a];
							iMinCosSimIndex = a;
							
						}
						
					}
					
				}
				
				alTopDocs.add(alDocCollection.get(iMinCosSimIndex));
				dTop5RankedDocsCosSim[iTop] = dMinCosSim;
				
			}
			
			System.out.println("Top 5 Documents fetched in order:  ");
			
			for(int iTop = 0 ; iTop < 5; iTop++)
			{
				System.out.println();
				System.out.println("Rank#: " + (iTop+1));
				System.out.println("Cosine Similarity: " + dTop5RankedDocsCosSim[iTop]);
				System.out.println("Doc#: " + alTopDocs.get(iTop).iDocId+ "  Document Headline: " + alTopDocs.get(iTop).sHeadline);
				System.out.println("Document Vector: ");
				
				for(String sDLemma : alTopDocs.get(iTop).tmLemmas.keySet())
				{
					
					System.out.println("Lemma: " + sDLemma);
					System.out.println("Okapi Weight (Un-normalized):   " + alTopDocs.get(iTop).tmLemmas.get(sDLemma).dOkapiWeightUnNormalized);
					
				}
				
			}
						
		}	
		
	}

	public String findQueryLemmas(String sTempWord)
	{
		
		String sLemma = null;
				
		//Ignoring all tokens of length less or or equal to 1
		if(sTempWord.length() > 1)
		{
			
			Annotation aAnnotation = scnLemmatizer.process(sTempWord);
			
			for(CoreMap cmSentence: aAnnotation.get(SentencesAnnotation.class))
			{
				
				for (CoreLabel clToken: cmSentence.get(TokensAnnotation.class)) 
				{
					
					sLemma = clToken.get(LemmaAnnotation.class);
					sLemma = sLemma.toLowerCase();
					//System.out.println(sTempWord + "   " + sLemma);
					
				}//End of for (CoreLabel clToken: cmSentence.get(TokensAnnotation.class))				
				
			}//End of for(CoreMap cmSentence: aAnnotation.get(SentencesAnnotation.class))
	
		}
		
		return sLemma;
		
	}


}//End of Lemmatize
