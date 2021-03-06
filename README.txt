The Submission.zip file contains following folders, Report and README.txt file.

1. cls - this folder contains the last compiled class files of the source files
2. src - contains the java source file - all *.java files
3. Output - contains all the output files from my execution.
	Subfolders in Output folder
	1. Query Vectors - Contains individual query vectors
	2. Ranked Retrieval - Contains the result of queries with both the weighting schemes
		Subfolders in Ranked Retrieval folder
			1. Max Tf Term Weight - Contains ranked results for each query with max tf term weighting scheme
			2. Okapi Weight - Contains ranked results for each query with okapi weighting scheme

*******************************************************************************
To Compile:

To compile the .java files execute below commands in order below:
Go to folder containing source java files using cd command then:

source /usr/local/corenlp350/classpath.sh
javac *.java

*******************************************************************************
To Execute:

Replace argument 1 with the location where the data files are placed. 
Replace argument 2 with the location where the output index files need to be placed. 
Replace argument 3 with the location where the queries files is placed along with the name of the queries file with extension. 
Please include double // for directory location in argument

java Search "//people//cs//d//dxs134530//IR-Assignment1//data//" "//people//cs//d//dxs134530//IR-Assignment3" "//people//cs//d//dxs134530//IR-Assignment3//hw3.queries"

*******************************************************************************
Output will be as below:
Time taken to tokenize:  0 seconds

Time taken by Porter Stemmer:  2 seconds

Adding annotator tokenize
TokenizerAnnotator: No tokenizer type provided. Defaulting to PTBTokenizer.
Adding annotator ssplit
Adding annotator pos
Reading POS tagger model from edu/stanford/nlp/models/pos-tagger/english-left3words/english-left3words-distsim.tagger ... done [4.1 sec].
Adding annotator lemma
Query:  what similarity laws must be obeyed when constructing aeroelastic models of heated high speed aircraft  
Lemmas:
Lemma: aeroelastic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: aircraft
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: construct
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: heated
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: high
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: law
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: model
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: must
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: obey
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: speed
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413

Query:  what are the structural and aeroelastic problems associated with flight of high speed aircraft  
Lemmas:
Lemma: aeroelastic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: aircraft
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: associate
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: flight
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: high
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: problem
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: speed
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: structural
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099

Query:  what problems of heat conduction in composite slabs have been solved so far  
Lemmas:
Lemma: composite
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: far
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: heat
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: problem
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: slab
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: so
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: solve
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099

Query:  can a criterion be developed to show empirically the validity of flow solutions for chemically reacting gas mixtures based on the simplifying assumption of instantaneous local chemical equilibrium  
Lemmas:
Lemma: assumption
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: base
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: can
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: chemically
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: criterion
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: develop
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: empirically
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: flow
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: gas
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: instantaneous
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: local
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: mixture
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: on
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: react
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: show
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: simplify
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: solution
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: to
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561
Lemma: validity
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5399380804953561

Query:  what chemical kinetic system is applicable to hypersonic aerodynamic problems  
Lemmas:
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: kinetic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: problem
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: system
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: to
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099

Query:  what theoretical and experimental guides do we have as to turbulent couette flow behaviour  
Lemmas:
Lemma: behaviour
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: couette
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: do
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: flow
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: guide
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: to
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: we
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953

Query:  is it possible to relate the available pressure distributions for an ogive forebody at zero angle of attack to the lower surface pressures of an equivalent ogive forebody at angle of attack  
Lemmas:
Lemma: angle
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.6213877551020408
Lemma: at
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.6213877551020408
Lemma: attack
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.6213877551020408
Lemma: available
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5357357357357357
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5357357357357357
Lemma: equivalent
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5357357357357357
Lemma: forebody
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.6213877551020408
Lemma: lower
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5357357357357357
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.6213877551020408
Lemma: possible
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5357357357357357
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.6213877551020408
Lemma: relate
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5357357357357357
Lemma: surface
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5357357357357357
Lemma: to
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.6213877551020408
Lemma: zero
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5357357357357357

Query:  what methods -dash exact or approximate -dash are presently available for predicting body pressures at angle of attack 
Lemmas:
Lemma: angle
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: at
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: attack
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: available
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: body
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: dash
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.6839790575916231
Lemma: exact
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: method
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: predict
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: presently
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5860082304526749

Query:  papers on internal /slip flow/ heat transfer studies  
Lemmas:
Lemma: flow
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: heat
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: internal
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: on
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: papers
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: slip
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: study
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6341968911917099

Query:  are real-gas transport properties for air available over a wide range of enthalpies and densities  
Lemmas:
Lemma: air
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: available
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: density
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: enthalpy
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: gas
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: over
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: property
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: range
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: real
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: transport
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413
Lemma: wide
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6026905829596413

Query:  is it possible to find an analytical,  similar solution of the strong blast wave problem in the newtonian approximation  
Lemmas:
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: blast
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: find
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: newtonian
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: possible
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: problem
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: similar
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: solution
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: strong
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: to
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: wave
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129

Query:  how can the aerodynamic performance of channel flow ground effect machines be calculated  
Lemmas:
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675
Lemma: can
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675
Lemma: channel
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675
Lemma: effect
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675
Lemma: flow
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675
Lemma: ground
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675
Lemma: machine
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675
Lemma: performance
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6226600985221675

Query:  what is the basic mechanism of the transonic aileron buzz  
Lemmas:
Lemma: aileron
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6773006134969326
Lemma: basic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6773006134969326
Lemma: buzz
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6773006134969326
Lemma: mechanism
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6773006134969326
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.6773006134969326

Query:  papers on shock-sound wave interaction  
Lemmas:
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.661271676300578
Lemma: on
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.661271676300578
Lemma: papers
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.661271676300578
Lemma: shock
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.661271676300578
Lemma: sound
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.661271676300578
Lemma: wave
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.661271676300578

Query:  material properties of photoelastic materials  
Lemmas:
Lemma: material
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.7959124087591241
Lemma: photoelastic
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.6954248366013072
Lemma: property
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.6954248366013072

Query:  can the transverse potential flow about a body of revolution be calculated efficiently by an electronic computer  
Lemmas:
Lemma: about
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: body
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: by
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: can
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: computer
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: efficiently
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: electronic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: flow
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: potential
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5939914163090129

Query:  can the three-dimensional problem of a transverse potential flow about a body of revolution be reduced to a two-dimensional problem  
Lemmas:
Lemma: about
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: body
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: can
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.667192118226601
Lemma: flow
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: potential
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: problem
Max TF Term Weight (Un-normalized):   0.9004262602878819
Okapi Weight (Un-normalized):   0.667192118226601
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: three
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: to
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: two
Max TF Term Weight (Un-normalized):   0.6214421478571255
Okapi Weight (Un-normalized):   0.5718631178707225

Query:  are experimental pressure distributions on bodies of revolution at angle of attack available  
Lemmas:
Lemma: angle
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: at
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: attack
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: available
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: body
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: on
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.612206572769953

Query:  does there exist a good basic treatment of the dynamics of re-entry combining consideration of realistic effects with relative simplicity of results  
Lemmas:
Lemma: basic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: combine
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: do
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: dynamics
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: effect
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: entry
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: exist
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: good
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: re
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: realistic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: relative
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: result
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: simplicity
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225
Lemma: treatment
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5718631178707225

Query:  has anyone formally determined the influence of joule heating,  produced by the induced current,  in magnetohydrodynamic free convection flows under general conditions  
Lemmas:
Lemma: anyone
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: by
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: condition
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: convection
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: current
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: determine
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: flow
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: formally
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: free
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: general
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: have
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: heating
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: induce
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: influence
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: joule
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: magnetohydrodynamic
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: produce
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956
Lemma: under
Max TF Term Weight (Un-normalized):   0.7509775004326937
Okapi Weight (Un-normalized):   0.5542662116040956


Max TF Term Weighting...
 ***************************** 
Processing Query:  what similarity laws must be obeyed when constructing aeroelastic models of heated high speed aircraft  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.14935528712542745
Doc#: 51  Document Headline:  theory of aircraft structural models subjected to aerodynamic heating and external loads .
Document Vector: 
Lemma: ability
Max TF Term Weight (Un-normalized):   0.41970451197642217
Lemma: acceleration
Max TF Term Weight (Un-normalized):   0.3683731392990564
Lemma: act
Max TF Term Weight (Un-normalized):   0.34721779943682285
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.1989385960258382
Lemma: aerodynamically
Max TF Term Weight (Un-normalized):   0.38490806777593617
Lemma: aircraft
Max TF Term Weight (Un-normalized):   0.3697151203916834
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: angular
Max TF Term Weight (Un-normalized):   0.6079621669602472
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: case
Max TF Term Weight (Un-normalized):   0.07504534562005717
Lemma: construct
Max TF Term Weight (Un-normalized):   0.34434280394207745
Lemma: cool
Max TF Term Weight (Un-normalized):   0.20796894495324195
Lemma: correctly
Max TF Term Weight (Un-normalized):   0.3723561705576746
Lemma: deformation
Max TF Term Weight (Un-normalized):   0.23457297835969704
Lemma: determination
Max TF Term Weight (Un-normalized):   0.21709036987629976
Lemma: determine
Max TF Term Weight (Un-normalized):   0.13648716706497074
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.12239368703880468
Lemma: due
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: each
Max TF Term Weight (Un-normalized):   0.18027194075193229
Lemma: effect
Max TF Term Weight (Un-normalized):   0.04734834141874752
Lemma: except
Max TF Term Weight (Un-normalized):   0.2225580245927858
Lemma: external
Max TF Term Weight (Un-normalized):   0.324666373226308
Lemma: flight
Max TF Term Weight (Un-normalized):   0.15728778560525636
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: flux
Max TF Term Weight (Un-normalized):   0.30101954290209976
Lemma: heat
Max TF Term Weight (Un-normalized):   0.13648716706497074
Lemma: heated
Max TF Term Weight (Un-normalized):   0.26857993176402206
Lemma: heating
Max TF Term Weight (Un-normalized):   0.2999755427230034
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: load
Max TF Term Weight (Un-normalized):   0.21456433473004255
Lemma: material
Max TF Term Weight (Un-normalized):   0.20796894495324195
Lemma: may
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: model
Max TF Term Weight (Un-normalized):   0.2019551469316696
Lemma: naca
Max TF Term Weight (Un-normalized):   0.13292359933318476
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: osullivanwj
Max TF Term Weight (Un-normalized):   0.494847511962445
Lemma: point
Max TF Term Weight (Un-normalized):   0.12239368703880468
Lemma: problem
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.19743903265886184
Lemma: require
Max TF Term Weight (Un-normalized):   0.203351698238397
Lemma: respect
Max TF Term Weight (Un-normalized):   0.29121669227282293
Lemma: same
Max TF Term Weight (Un-normalized):   0.18633397141278518
Lemma: show
Max TF Term Weight (Un-normalized):   0.07504534562005717
Lemma: similar
Max TF Term Weight (Un-normalized):   0.23772913556624828
Lemma: simulate
Max TF Term Weight (Un-normalized):   0.2967219487272339
Lemma: simulation
Max TF Term Weight (Un-normalized):   0.3445124225462059
Lemma: simultaneous
Max TF Term Weight (Un-normalized):   0.34434280394207745
Lemma: so
Max TF Term Weight (Un-normalized):   0.18027194075193229
Lemma: speed
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: stress
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: structural
Max TF Term Weight (Un-normalized):   0.3775247524767742
Lemma: structure
Max TF Term Weight (Un-normalized):   0.25907710997230315
Lemma: study
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: subject
Max TF Term Weight (Un-normalized):   0.25247661425540147
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.07504534562005717
Lemma: thermally
Max TF Term Weight (Un-normalized):   0.3723561705576746
Lemma: those
Max TF Term Weight (Un-normalized):   0.21020680976471226
Lemma: through
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: time
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: tn
Max TF Term Weight (Un-normalized):   0.15728778560525636
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transient
Max TF Term Weight (Un-normalized):   0.2519844684427514
Lemma: variation
Max TF Term Weight (Un-normalized):   0.1637983493940491
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.11756364666545953
Lemma: without
Max TF Term Weight (Un-normalized):   0.19743903265886184
Lemma: withstand
Max TF Term Weight (Un-normalized):   0.4474991705436974
Lemma: zero
Max TF Term Weight (Un-normalized):   0.19526899039770054

Rank#: 2
Cosine Similarity: 0.14269729555314378
Doc#: 573  Document Headline:  viscous hypersonic similitude .
Document Vector: 
Lemma: accord
Max TF Term Weight (Un-normalized):   0.27259054799799826
Lemma: account
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: additional
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: apply
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: aspect
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: basic
Max TF Term Weight (Un-normalized):   0.26169894244033665
Lemma: body
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.088567757492491
Lemma: classical
Max TF Term Weight (Un-normalized):   0.33497363402230146
Lemma: concept
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: develop
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: displacement
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: drag
Max TF Term Weight (Un-normalized):   0.24991852805052248
Lemma: effect
Max TF Term Weight (Un-normalized):   0.07523297341539732
Lemma: enthalpy
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: example
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: extension
Max TF Term Weight (Un-normalized):   0.23612844129828678
Lemma: external
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: feature
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: find
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: flat
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: free
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: frictional
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: give
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: govern
Max TF Term Weight (Un-normalized):   0.2488760036943977
Lemma: hayerwd
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: high
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.265703272477473
Lemma: impose
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: include
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: independence
Max TF Term Weight (Un-normalized):   0.474785314149417
Lemma: independent
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.2612245281967801
Lemma: into
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: invariant
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: law
Max TF Term Weight (Un-normalized):   0.23612844129828678
Lemma: layer
Max TF Term Weight (Un-normalized):   0.14037657439856346
Lemma: mach
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: may
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: must
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: new
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: number
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: obey
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: outside
Max TF Term Weight (Un-normalized):   0.27588540418264135
Lemma: part
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: principal
Max TF Term Weight (Un-normalized):   0.2967349764911252
Lemma: principle
Max TF Term Weight (Un-normalized):   0.3521513936631647
Lemma: probsteinrf
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: provide
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: result
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.31394975534724157
Lemma: similitude
Max TF Term Weight (Un-normalized):   0.6802907465027868
Lemma: stream
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: strip
Max TF Term Weight (Un-normalized):   0.33866025032064434
Lemma: take
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: three
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: total
Max TF Term Weight (Un-normalized):   0.2612245281967801
Lemma: underlie
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: various
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: viscous
Max TF Term Weight (Un-normalized):   0.2859131291711554
Lemma: wall
Max TF Term Weight (Un-normalized):   0.14102858065770377

Rank#: 3
Cosine Similarity: 0.13756520776538314
Doc#: 486  Document Headline:  similarity laws for aerothermoelastic testing .
Document Vector: 
Lemma: above
Max TF Term Weight (Un-normalized):   0.20910528650089605
Lemma: achieve
Max TF Term Weight (Un-normalized):   0.2592112645729502
Lemma: advance
Max TF Term Weight (Un-normalized):   0.29654946893251277
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: aeroelastic
Max TF Term Weight (Un-normalized):   0.3117251180560525
Lemma: aerothermoelastic
Max TF Term Weight (Un-normalized):   0.9866341631733087
Lemma: andor
Max TF Term Weight (Un-normalized):   0.4288706666748729
Lemma: another
Max TF Term Weight (Un-normalized):   0.28342322394303493
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: appropriate
Max TF Term Weight (Un-normalized):   0.23969594498589836
Lemma: artificially
Max TF Term Weight (Un-normalized):   0.40888994032773507
Lemma: assume
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: basic
Max TF Term Weight (Un-normalized):   0.2520458958633574
Lemma: behavior
Max TF Term Weight (Un-normalized):   0.21575803802691662
Lemma: between
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: case
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: combine
Max TF Term Weight (Un-normalized):   0.23504081639019808
Lemma: complete
Max TF Term Weight (Un-normalized):   0.21251089165030795
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.30559329362318904
Lemma: conflict
Max TF Term Weight (Un-normalized):   0.5165266877539471
Lemma: deal
Max TF Term Weight (Un-normalized):   0.2461437005952872
Lemma: deflection
Max TF Term Weight (Un-normalized):   0.2017510108845457
Lemma: difficult
Max TF Term Weight (Un-normalized):   0.3117251180560525
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: dugundjij
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: equation
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: estimate
Max TF Term Weight (Un-normalized):   0.18420899753729034
Lemma: example
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: expansion
Max TF Term Weight (Un-normalized):   0.2017510108845457
Lemma: extension
Max TF Term Weight (Un-normalized):   0.22741859012064386
Lemma: external
Max TF Term Weight (Un-normalized):   0.20552496021033634
Lemma: facet
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: finally
Max TF Term Weight (Un-normalized):   0.24816706137967587
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: flutter
Max TF Term Weight (Un-normalized):   0.22468094279044476
Lemma: form
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: freestream
Max TF Term Weight (Un-normalized):   0.30320222045853323
Lemma: general
Max TF Term Weight (Un-normalized):   0.15798944089756267
Lemma: give
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: govern
Max TF Term Weight (Un-normalized):   0.23969594498589836
Lemma: heat
Max TF Term Weight (Un-normalized):   0.14191313081456916
Lemma: heating
Max TF Term Weight (Un-normalized):   0.2017510108845457
Lemma: high
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: higher
Max TF Term Weight (Un-normalized):   0.179036182567807
Lemma: include
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: incomplete
Max TF Term Weight (Un-normalized):   0.4572723478805719
Lemma: individual
Max TF Term Weight (Un-normalized):   0.3605075327748983
Lemma: interior
Max TF Term Weight (Un-normalized):   0.326168403240055
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.15336860333170887
Lemma: jaesc
Max TF Term Weight (Un-normalized):   0.28097381264296406
Lemma: law
Max TF Term Weight (Un-normalized):   0.32671728450799753
Lemma: less
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: lifting
Max TF Term Weight (Un-normalized):   0.25390736776317313
Lemma: look
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: mach
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: make
Max TF Term Weight (Un-normalized):   0.09687078217292487
Lemma: means
Max TF Term Weight (Un-normalized):   0.179036182567807
Lemma: mention
Max TF Term Weight (Un-normalized):   0.307593672125787
Lemma: model
Max TF Term Weight (Un-normalized):   0.21272382353123861
Lemma: modeling
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: more
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: nondimensional
Max TF Term Weight (Un-normalized):   0.2994786144882915
Lemma: number
Max TF Term Weight (Un-normalized):   0.061118658724637814
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: occur
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: one
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: other
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: panel
Max TF Term Weight (Un-normalized):   0.23740718061391367
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.24019711982831343
Lemma: place
Max TF Term Weight (Un-normalized):   0.26089329920314475
Lemma: plate
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: present
Max TF Term Weight (Un-normalized):   0.061118658724637814
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: primary
Max TF Term Weight (Un-normalized):   0.326168403240055
Lemma: problem
Max TF Term Weight (Un-normalized):   0.13901562581349564
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.2017510108845457
Lemma: range
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: rate
Max TF Term Weight (Un-normalized):   0.15336860333170887
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: restricted
Max TF Term Weight (Un-normalized):   0.26724322570129505
Lemma: restrictive
Max TF Term Weight (Un-normalized):   0.4288706666748729
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: scale
Max TF Term Weight (Un-normalized):   0.2300529049975633
Lemma: separately
Max TF Term Weight (Un-normalized):   0.326168403240055
Lemma: show
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.36427133315309024
Lemma: similitude
Max TF Term Weight (Un-normalized):   0.35203641638112076
Lemma: situation
Max TF Term Weight (Un-normalized):   0.3885650512943897
Lemma: solid
Max TF Term Weight (Un-normalized):   0.24816706137967587
Lemma: specialize
Max TF Term Weight (Un-normalized):   0.5776453464785848
Lemma: speed
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.16072287894805923
Lemma: stress
Max TF Term Weight (Un-normalized):   0.15336860333170887
Lemma: structure
Max TF Term Weight (Un-normalized):   0.1890247730610768
Lemma: such
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.14191313081456916
Lemma: testing
Max TF Term Weight (Un-normalized):   0.38393071102044085
Lemma: than
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.19352963021134736
Lemma: these
Max TF Term Weight (Un-normalized):   0.09687078217292487
Lemma: thin
Max TF Term Weight (Un-normalized):   0.16072287894805923
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: unity
Max TF Term Weight (Un-normalized):   0.2574876940537329
Lemma: up
Max TF Term Weight (Un-normalized):   0.16072287894805923
Lemma: use
Max TF Term Weight (Un-normalized):   0.061118658724637814
Lemma: very
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: well
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: wind
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: wing
Max TF Term Weight (Un-normalized):   0.12506670921869126

Rank#: 4
Cosine Similarity: 0.13209639821269797
Doc#: 184  Document Headline:  scale models for thermo-aeroelastic research .
Document Vector: 
Lemma: accordingly
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: achieve
Max TF Term Weight (Un-normalized):   0.27465249093460986
Lemma: adequate
Max TF Term Weight (Un-normalized):   0.3352270317749069
Lemma: aeroelastic
Max TF Term Weight (Un-normalized):   0.43574832027213745
Lemma: aircraft
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: appear
Max TF Term Weight (Un-normalized):   0.2705274820757908
Lemma: approach
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: assume
Max TF Term Weight (Un-normalized):   0.20289561155684308
Lemma: assumption
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: automatic
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: between
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: carry
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: check
Max TF Term Weight (Un-normalized):   0.30030675778276167
Lemma: complete
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: completely
Max TF Term Weight (Un-normalized):   0.3142149337600577
Lemma: conclude
Max TF Term Weight (Un-normalized):   0.2515495367409993
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.2563227484286348
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: control
Max TF Term Weight (Un-normalized):   0.22861075378373358
Lemma: describe
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: effect
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: either
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: entirely
Max TF Term Weight (Un-normalized):   0.46381808268387203
Lemma: exist
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: hot
Max TF Term Weight (Un-normalized):   0.2907943307820745
Lemma: identical
Max TF Term Weight (Un-normalized):   0.3302945969652685
Lemma: include
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: layout
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: limit
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: load
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: major
Max TF Term Weight (Un-normalized):   0.2764347244412529
Lemma: make
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: model
Max TF Term Weight (Un-normalized):   0.22013241726072352
Lemma: molyneuxwg
Max TF Term Weight (Un-normalized):   0.4544185110361619
Lemma: necessary
Max TF Term Weight (Un-normalized):   0.231898366652749
Lemma: not
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: number
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: nusselt
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: part
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: possible
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: program
Max TF Term Weight (Un-normalized):   0.32126398998529876
Lemma: ra
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: region
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: relationship
Max TF Term Weight (Un-normalized):   0.2907943307820745
Lemma: require
Max TF Term Weight (Un-normalized):   0.23396783130083135
Lemma: research
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: respects
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: satisfied
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: scale
Max TF Term Weight (Un-normalized):   0.32158193587848233
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.37695791554818703
Lemma: size
Max TF Term Weight (Un-normalized):   0.2608064915995677
Lemma: small
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: specific
Max TF Term Weight (Un-normalized):   0.23806519637407705
Lemma: structure
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: thermo
Max TF Term Weight (Un-normalized):   0.5995014895911084
Lemma: thermoaeroelastic
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: these
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: tnstruct
Max TF Term Weight (Un-normalized):   0.4544185110361619
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.22013241726072352
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: type
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: validity
Max TF Term Weight (Un-normalized):   0.2977114349444731
Lemma: wind
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: work
Max TF Term Weight (Un-normalized):   0.2424577196640562
Lemma: would
Max TF Term Weight (Un-normalized):   0.22517017475552598

Rank#: 5
Cosine Similarity: 0.13065651961752434
Doc#: 13  Document Headline:  similarity laws for stressing heated wings .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: analog
Max TF Term Weight (Un-normalized):   0.6374394299261046
Lemma: application
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: be
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: body
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: box
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: briefly
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: call
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: can
Max TF Term Weight (Un-normalized):   0.1568254982874635
Lemma: complicate
Max TF Term Weight (Un-normalized):   0.3515713074684887
Lemma: concept
Max TF Term Weight (Un-normalized):   0.2464468852587461
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: detail
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: differential
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: fact
Max TF Term Weight (Un-normalized):   0.28153737592350603
Lemma: feedback
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: force
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: from
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: gradient
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: heated
Max TF Term Weight (Un-normalized):   0.4904667881108037
Lemma: heating
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: however
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: involve
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: isothermal
Max TF Term Weight (Un-normalized):   0.3515713074684887
Lemma: large
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: law
Max TF Term Weight (Un-normalized):   0.31789953039943736
Lemma: lead
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: load
Max TF Term Weight (Un-normalized):   0.22013241726072352
Lemma: make
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: measure
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: method
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: modification
Max TF Term Weight (Un-normalized):   0.27282624724421944
Lemma: novel
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: plate
Max TF Term Weight (Un-normalized):   0.2401294878284058
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: proper
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: relation
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: result
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: same
Max TF Term Weight (Un-normalized):   0.21438795725232157
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: series
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: show
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: similar
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.3251304056272258
Lemma: solid
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: solve
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: strain
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: stress
Max TF Term Weight (Un-normalized):   0.2485625339425396
Lemma: structure
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.15703634026772897
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tsienh
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: under
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: unheated
Max TF Term Weight (Un-normalized):   0.5497986164139025
Lemma: wing
Max TF Term Weight (Un-normalized):   0.2235090245674224
 ***************************** 
Processing Query:  what are the structural and aeroelastic problems associated with flight of high speed aircraft  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.19577396844554623
Doc#: 12  Document Headline:  some structural and aerelastic considerations of high speed flight .
Document Vector: 
Lemma: acrothermoelasticity
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: aerelastic
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: aeroelastic
Max TF Term Weight (Un-normalized):   0.45717655183973605
Lemma: aeronautical
Max TF Term Weight (Un-normalized):   0.32642819453100774
Lemma: aircraft
Max TF Term Weight (Un-normalized):   0.29588835208907477
Lemma: alleviate
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: another
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: art
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: attack
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: available
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: avenue
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: bisplinghoffrl
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: combine
Max TF Term Weight (Un-normalized):   0.25619174666759414
Lemma: concerned
Max TF Term Weight (Un-normalized):   0.2825372530897547
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: demand
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: design
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: discussion
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: dominate
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: engineer
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: factor
Max TF Term Weight (Un-normalized):   0.29003702558308997
Lemma: failure
Max TF Term Weight (Un-normalized):   0.2825372530897547
Lemma: finally
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: flight
Max TF Term Weight (Un-normalized):   0.27558676201248483
Lemma: from
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: fundamental
Max TF Term Weight (Un-normalized):   0.2976358649095804
Lemma: heat
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: high
Max TF Term Weight (Un-normalized):   0.23762117335365246
Lemma: input
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: interrelation
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: into
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: largely
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: layer
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: load
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: matter
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: meet
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: method
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: mode
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: one
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: origin
Max TF Term Weight (Un-normalized):   0.403108384017641
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: research
Max TF Term Weight (Un-normalized):   0.2240198079156675
Lemma: respect
Max TF Term Weight (Un-normalized):   0.26126578250618154
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: speed
Max TF Term Weight (Un-normalized):   0.18384883594045223
Lemma: state
Max TF Term Weight (Un-normalized):   0.2240198079156675
Lemma: structural
Max TF Term Weight (Un-normalized):   0.43536744607206407
Lemma: structure
Max TF Term Weight (Un-normalized):   0.2772240315418298
Lemma: subject
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: suggest
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: summarize
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: summary
Max TF Term Weight (Un-normalized):   0.3448507763276174
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.283830862173043
Lemma: these
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tool
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: under
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: upon
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: well
Max TF Term Weight (Un-normalized):   0.15820877866209093

Rank#: 2
Cosine Similarity: 0.12020872370863596
Doc#: 51  Document Headline:  theory of aircraft structural models subjected to aerodynamic heating and external loads .
Document Vector: 
Lemma: ability
Max TF Term Weight (Un-normalized):   0.41970451197642217
Lemma: acceleration
Max TF Term Weight (Un-normalized):   0.3683731392990564
Lemma: act
Max TF Term Weight (Un-normalized):   0.34721779943682285
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.1989385960258382
Lemma: aerodynamically
Max TF Term Weight (Un-normalized):   0.38490806777593617
Lemma: aircraft
Max TF Term Weight (Un-normalized):   0.3697151203916834
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: angular
Max TF Term Weight (Un-normalized):   0.6079621669602472
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: case
Max TF Term Weight (Un-normalized):   0.07504534562005717
Lemma: construct
Max TF Term Weight (Un-normalized):   0.34434280394207745
Lemma: cool
Max TF Term Weight (Un-normalized):   0.20796894495324195
Lemma: correctly
Max TF Term Weight (Un-normalized):   0.3723561705576746
Lemma: deformation
Max TF Term Weight (Un-normalized):   0.23457297835969704
Lemma: determination
Max TF Term Weight (Un-normalized):   0.21709036987629976
Lemma: determine
Max TF Term Weight (Un-normalized):   0.13648716706497074
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.12239368703880468
Lemma: due
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: each
Max TF Term Weight (Un-normalized):   0.18027194075193229
Lemma: effect
Max TF Term Weight (Un-normalized):   0.04734834141874752
Lemma: except
Max TF Term Weight (Un-normalized):   0.2225580245927858
Lemma: external
Max TF Term Weight (Un-normalized):   0.324666373226308
Lemma: flight
Max TF Term Weight (Un-normalized):   0.15728778560525636
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: flux
Max TF Term Weight (Un-normalized):   0.30101954290209976
Lemma: heat
Max TF Term Weight (Un-normalized):   0.13648716706497074
Lemma: heated
Max TF Term Weight (Un-normalized):   0.26857993176402206
Lemma: heating
Max TF Term Weight (Un-normalized):   0.2999755427230034
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: load
Max TF Term Weight (Un-normalized):   0.21456433473004255
Lemma: material
Max TF Term Weight (Un-normalized):   0.20796894495324195
Lemma: may
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: model
Max TF Term Weight (Un-normalized):   0.2019551469316696
Lemma: naca
Max TF Term Weight (Un-normalized):   0.13292359933318476
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: osullivanwj
Max TF Term Weight (Un-normalized):   0.494847511962445
Lemma: point
Max TF Term Weight (Un-normalized):   0.12239368703880468
Lemma: problem
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.19743903265886184
Lemma: require
Max TF Term Weight (Un-normalized):   0.203351698238397
Lemma: respect
Max TF Term Weight (Un-normalized):   0.29121669227282293
Lemma: same
Max TF Term Weight (Un-normalized):   0.18633397141278518
Lemma: show
Max TF Term Weight (Un-normalized):   0.07504534562005717
Lemma: similar
Max TF Term Weight (Un-normalized):   0.23772913556624828
Lemma: simulate
Max TF Term Weight (Un-normalized):   0.2967219487272339
Lemma: simulation
Max TF Term Weight (Un-normalized):   0.3445124225462059
Lemma: simultaneous
Max TF Term Weight (Un-normalized):   0.34434280394207745
Lemma: so
Max TF Term Weight (Un-normalized):   0.18027194075193229
Lemma: speed
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: stress
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: structural
Max TF Term Weight (Un-normalized):   0.3775247524767742
Lemma: structure
Max TF Term Weight (Un-normalized):   0.25907710997230315
Lemma: study
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: subject
Max TF Term Weight (Un-normalized):   0.25247661425540147
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.07504534562005717
Lemma: thermally
Max TF Term Weight (Un-normalized):   0.3723561705576746
Lemma: those
Max TF Term Weight (Un-normalized):   0.21020680976471226
Lemma: through
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: time
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: tn
Max TF Term Weight (Un-normalized):   0.15728778560525636
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transient
Max TF Term Weight (Un-normalized):   0.2519844684427514
Lemma: variation
Max TF Term Weight (Un-normalized):   0.1637983493940491
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.11756364666545953
Lemma: without
Max TF Term Weight (Un-normalized):   0.19743903265886184
Lemma: withstand
Max TF Term Weight (Un-normalized):   0.4474991705436974
Lemma: zero
Max TF Term Weight (Un-normalized):   0.19526899039770054

Rank#: 3
Cosine Similarity: 0.10598162050123715
Doc#: 746  Document Headline:  aeroelastic problems in connection with high speed flight .
Document Vector: 
Lemma: aero
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: aeroelastic
Max TF Term Weight (Un-normalized):   0.45717655183973605
Lemma: aeroelasticity
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: aerofoil
Max TF Term Weight (Un-normalized):   0.29129199697738994
Lemma: aspect
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: attack
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: both
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: brief
Max TF Term Weight (Un-normalized):   0.29129199697738994
Lemma: bring
Max TF Term Weight (Un-normalized):   0.3448507763276174
Lemma: broadbenteg
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: case
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: change
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: connection
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: consider
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: control
Max TF Term Weight (Un-normalized):   0.23517374330390606
Lemma: damage
Max TF Term Weight (Un-normalized):   0.3929490031854645
Lemma: damp
Max TF Term Weight (Un-normalized):   0.26368129777015153
Lemma: derivative
Max TF Term Weight (Un-normalized):   0.25619174666759414
Lemma: design
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: development
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: difficult
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.18342303381616776
Lemma: during
Max TF Term Weight (Un-normalized):   0.25352191693797493
Lemma: effect
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: efflux
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: field
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: flight
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: flutter
Max TF Term Weight (Un-normalized):   0.2448996053555501
Lemma: fold
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: from
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: fuselage
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: give
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: hand
Max TF Term Weight (Un-normalized):   0.43921581031169765
Lemma: have
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: heating
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: high
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: higher
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: increase
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: jet
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: kinetic
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: lead
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: mach
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: make
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: massbalance
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: mention
Max TF Term Weight (Un-normalized):   0.33527351264378497
Lemma: merit
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: method
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: more
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: new
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: number
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: other
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: past
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: possible
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: prevention
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: problem
Max TF Term Weight (Un-normalized):   0.18384883594045223
Lemma: provide
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: recent
Max TF Term Weight (Un-normalized):   0.2448996053555501
Lemma: relative
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: require
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: review
Max TF Term Weight (Un-normalized):   0.26126578250618154
Lemma: roy
Max TF Term Weight (Un-normalized):   0.30206909979668417
Lemma: slender
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: soc
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: speed
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: steadily
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: stiffness
Max TF Term Weight (Un-normalized):   0.4191394626283513
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: ten
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: these
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: thinner
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: two
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: various
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: year
Max TF Term Weight (Un-normalized):   0.33527351264378497

Rank#: 4
Cosine Similarity: 0.09212644290484169
Doc#: 1263  Document Headline:  turbulent heat transfer through a highly cooled, partially dissociated boundary layer .
Document Vector: 
Lemma: achieve
Max TF Term Weight (Un-normalized):   0.2650232758559818
Lemma: adamsmc
Max TF Term Weight (Un-normalized):   0.5169925001442313
Lemma: ae
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: after
Max TF Term Weight (Un-normalized):   0.2473361673648132
Lemma: air
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: analytically
Max TF Term Weight (Un-normalized):   0.3144905093289444
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: atomic
Max TF Term Weight (Un-normalized):   0.38901953209245116
Lemma: base
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: be
Max TF Term Weight (Un-normalized):   0.11547972218388075
Lemma: between
Max TF Term Weight (Un-normalized):   0.14760544189911234
Lemma: blunt
Max TF Term Weight (Un-normalized):   0.21117564556912427
Lemma: body
Max TF Term Weight (Un-normalized):   0.15959585762156642
Lemma: both
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.09390089900783245
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: case
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: cent
Max TF Term Weight (Un-normalized):   0.25166271215315245
Lemma: certain
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: classical
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: cold
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: condition
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: consider
Max TF Term Weight (Un-normalized):   0.14760544189911234
Lemma: cool
Max TF Term Weight (Un-normalized):   0.3200224582569771
Lemma: correlate
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: could
Max TF Term Weight (Un-normalized):   0.22059574503584292
Lemma: cylinder
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: cylindrical
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: datum
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: determine
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: difference
Max TF Term Weight (Un-normalized):   0.2137938261231498
Lemma: diffusion
Max TF Term Weight (Un-normalized):   0.26842230550695706
Lemma: dissociate
Max TF Term Weight (Un-normalized):   0.3723930449553187
Lemma: dissociation
Max TF Term Weight (Un-normalized):   0.28059918874925394
Lemma: distinguish
Max TF Term Weight (Un-normalized):   0.418058033198306
Lemma: due
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: each
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: effect
Max TF Term Weight (Un-normalized):   0.0635702036700119
Lemma: equation
Max TF Term Weight (Un-normalized):   0.10075638898017529
Lemma: experiment
Max TF Term Weight (Un-normalized):   0.20151277796035058
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: experimentally
Max TF Term Weight (Un-normalized):   0.24507038555679764
Lemma: external
Max TF Term Weight (Un-normalized):   0.27004161720505593
Lemma: flight
Max TF Term Weight (Un-normalized):   0.2650829816303625
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: form
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: from
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: ft
Max TF Term Weight (Un-normalized):   0.2667430249129211
Lemma: govern
Max TF Term Weight (Un-normalized):   0.24507038555679764
Lemma: gradient
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: heat
Max TF Term Weight (Un-normalized):   0.18528505281957922
Lemma: hemisphere
Max TF Term Weight (Un-normalized):   0.2872737817897823
Lemma: high
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: highly
Max TF Term Weight (Un-normalized):   0.36059723429206486
Lemma: however
Max TF Term Weight (Un-normalized):   0.2278967963201991
Lemma: important
Max TF Term Weight (Un-normalized):   0.2650829816303624
Lemma: include
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: large
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: larger
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: layer
Max TF Term Weight (Un-normalized):   0.14882940371141887
Lemma: limitation
Max TF Term Weight (Un-normalized):   0.29219753619221395
Lemma: local
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: mach
Max TF Term Weight (Un-normalized):   0.11547972218388075
Lemma: maximum
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: model
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: molecule
Max TF Term Weight (Un-normalized):   0.29219753619221395
Lemma: negligible
Max TF Term Weight (Un-normalized):   0.27166677931535277
Lemma: nonslender
Max TF Term Weight (Un-normalized):   0.5169925001442313
Lemma: not
Max TF Term Weight (Un-normalized):   0.14760544189911234
Lemma: number
Max TF Term Weight (Un-normalized):   0.085338083231111
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.11547972218388075
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: partially
Max TF Term Weight (Un-normalized):   0.3392453470391163
Lemma: per
Max TF Term Weight (Un-normalized):   0.20219547868018978
Lemma: portion
Max TF Term Weight (Un-normalized):   0.2952108837982247
Lemma: present
Max TF Term Weight (Un-normalized):   0.0635702036700119
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: problem
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: probsteinrf
Max TF Term Weight (Un-normalized):   0.40213314096700675
Lemma: property
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: propose
Max TF Term Weight (Un-normalized):   0.24507038555679764
Lemma: represent
Max TF Term Weight (Un-normalized):   0.20219547868018978
Lemma: result
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.20627465361109093
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.17846412416921226
Lemma: roseph
Max TF Term Weight (Un-normalized):   0.4384867655654138
Lemma: sc
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: sec
Max TF Term Weight (Un-normalized):   0.30619349661079576
Lemma: semiempirical
Max TF Term Weight (Un-normalized):   0.3392453470391163
Lemma: shock
Max TF Term Weight (Un-normalized):   0.14760544189911234
Lemma: show
Max TF Term Weight (Un-normalized):   0.10075638898017529
Lemma: similar
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: simulate
Max TF Term Weight (Un-normalized):   0.3100005929337746
Lemma: simultaneously
Max TF Term Weight (Un-normalized):   0.33348172136657533
Lemma: speed
Max TF Term Weight (Un-normalized):   0.14571918531995248
Lemma: structural
Max TF Term Weight (Un-normalized):   0.2596004555566981
Lemma: such
Max TF Term Weight (Un-normalized):   0.20454273607309637
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.10075638898017529
Lemma: these
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: through
Max TF Term Weight (Un-normalized):   0.20151277796035058
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.20627465361109093
Lemma: tube
Max TF Term Weight (Un-normalized):   0.27474584923913614
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.29522126340360677
Lemma: up
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: value
Max TF Term Weight (Un-normalized):   0.1271404073400238
Lemma: vary
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: way
Max TF Term Weight (Un-normalized):   0.2596004555566981
Lemma: would
Max TF Term Weight (Un-normalized):   0.2172757914399585

Rank#: 5
Cosine Similarity: 0.09198325405365826
Doc#: 884  Document Headline:  the estimation of fatigue damage on structural elements .
Document Vector: 
Lemma: aircraft
Max TF Term Weight (Un-normalized):   0.37593062673082334
Lemma: analyse
Max TF Term Weight (Un-normalized):   0.3712142419777961
Lemma: below
Max TF Term Weight (Un-normalized):   0.2455555343226533
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: chilverah
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: damage
Max TF Term Weight (Un-normalized):   0.6717479240528145
Lemma: datum
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: element
Max TF Term Weight (Un-normalized):   0.43234526756271335
Lemma: estimation
Max TF Term Weight (Un-normalized):   0.5227068580946574
Lemma: fatigue
Max TF Term Weight (Un-normalized):   0.5388688254608115
Lemma: fly
Max TF Term Weight (Un-normalized):   0.3375047528367762
Lemma: ft
Max TF Term Weight (Un-normalized):   0.29692424937158485
Lemma: gust
Max TF Term Weight (Un-normalized):   0.5227068580946574
Lemma: infinitesimal
Max TF Term Weight (Un-normalized):   0.4006547849434648
Lemma: interval
Max TF Term Weight (Un-normalized):   0.377630005715336
Lemma: joint
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: load
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: method
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: number
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: present
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: ra
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: spectrum
Max TF Term Weight (Un-normalized):   0.3408384311953472
Lemma: structural
Max TF Term Weight (Un-normalized):   0.47311562641639787
Lemma: structure
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: study
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: subject
Max TF Term Weight (Un-normalized):   0.2096493796058092
Lemma: supply
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: taylor
Max TF Term Weight (Un-normalized):   0.3408384311953472
Lemma: term
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: tnstruct
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: use
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: whole
Max TF Term Weight (Un-normalized):   0.3375047528367762
 ***************************** 
Processing Query:  what problems of heat conduction in composite slabs have been solved so far  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.20945696426174912
Doc#: 485  Document Headline:  linear heat flow in a composite slab .
Document Vector: 
Lemma: case
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: composite
Max TF Term Weight (Un-normalized):   0.6268760067637584
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.2973062840313121
Lemma: consider
Max TF Term Weight (Un-normalized):   0.13806476273577312
Lemma: determine
Max TF Term Weight (Un-normalized):   0.13806476273577312
Lemma: external
Max TF Term Weight (Un-normalized):   0.2525871087712568
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: function
Max TF Term Weight (Un-normalized):   0.24186824538519194
Lemma: heat
Max TF Term Weight (Un-normalized):   0.20004619644222682
Lemma: jaesc
Max TF Term Weight (Un-normalized):   0.34531262238557936
Lemma: linear
Max TF Term Weight (Un-normalized):   0.32802345272460404
Lemma: position
Max TF Term Weight (Un-normalized):   0.2611727142504686
Lemma: prescribe
Max TF Term Weight (Un-normalized):   0.34531262238557936
Lemma: reidwp
Max TF Term Weight (Un-normalized):   0.6214421478571255
Lemma: slab
Max TF Term Weight (Un-normalized):   0.5724028075632779
Lemma: surface
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.20004619644222682
Lemma: throughout
Max TF Term Weight (Un-normalized):   0.3355907822778086
Lemma: time
Max TF Term Weight (Un-normalized):   0.18848772456735313
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: ture
Max TF Term Weight (Un-normalized):   0.5270756487258014
Lemma: two
Max TF Term Weight (Un-normalized):   0.09424386228367657

Rank#: 2
Cosine Similarity: 0.19862206740105204
Doc#: 5  Document Headline:  one-dimensional transient heat conduction into a double-layer slab subjected to a linear heat input for a small time internal .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: analytic
Max TF Term Weight (Un-normalized):   0.30206909979668417
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: composite
Max TF Term Weight (Un-normalized):   0.38371558518395665
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.35478857771630373
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: double
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: during
Max TF Term Weight (Un-normalized):   0.25352191693797493
Lemma: example
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: expose
Max TF Term Weight (Un-normalized):   0.36855708958289396
Lemma: heat
Max TF Term Weight (Un-normalized):   0.21344188869123673
Lemma: heating
Max TF Term Weight (Un-normalized):   0.29588835208907477
Lemma: input
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: internal
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: into
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: layer
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: linear
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: may
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: occur
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: one
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: rate
Max TF Term Weight (Un-normalized):   0.22493063654581405
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: slab
Max TF Term Weight (Un-normalized):   0.4714328576243672
Lemma: small
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: subject
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: time
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transient
Max TF Term Weight (Un-normalized):   0.37763185989870507
Lemma: triangular
Max TF Term Weight (Un-normalized):   0.32642819453100774
Lemma: type
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: wassermanb
Max TF Term Weight (Un-normalized):   0.5511577818475554

Rank#: 3
Cosine Similarity: 0.15469369002015276
Doc#: 399  Document Headline:  conduction of heat in composite slabs .
Document Vector: 
Lemma: additional
Max TF Term Weight (Un-normalized):   0.2930483094538726
Lemma: allowance
Max TF Term Weight (Un-normalized):   0.44763337698537986
Lemma: appl
Max TF Term Weight (Un-normalized):   0.44763337698537986
Lemma: appropriate
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: area
Max TF Term Weight (Un-normalized):   0.2490868272357628
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: capacity
Max TF Term Weight (Un-normalized):   0.377630005715336
Lemma: composite
Max TF Term Weight (Un-normalized):   0.4006547849434648
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.2753215603715094
Lemma: contact
Max TF Term Weight (Un-normalized):   0.377630005715336
Lemma: develop
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: each
Max TF Term Weight (Un-normalized):   0.2096493796058092
Lemma: from
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: heat
Max TF Term Weight (Un-normalized):   0.20932843723400202
Lemma: jaeger
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: july
Max TF Term Weight (Un-normalized):   0.4006547849434648
Lemma: layer
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: make
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: math
Max TF Term Weight (Un-normalized):   0.2801376415570232
Lemma: method
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: pass
Max TF Term Weight (Un-normalized):   0.3375047528367762
Lemma: pp
Max TF Term Weight (Un-normalized):   0.319778003754413
Lemma: quantity
Max TF Term Weight (Un-normalized):   0.2868549658615147
Lemma: quart
Max TF Term Weight (Un-normalized):   0.3450762897798587
Lemma: regard
Max TF Term Weight (Un-normalized):   0.2950099155365918
Lemma: resistance
Max TF Term Weight (Un-normalized):   0.5325230268816471
Lemma: slab
Max TF Term Weight (Un-normalized):   0.3658393706105377
Lemma: surface
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: through
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: time
Max TF Term Weight (Un-normalized):   0.24160777626488467
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: total
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: unit
Max TF Term Weight (Un-normalized):   0.33283040408842895
Lemma: zero
Max TF Term Weight (Un-normalized):   0.2531932646836744

Rank#: 4
Cosine Similarity: 0.1458120495940906
Doc#: 144  Document Headline:  heat flow in composite slabs .
Document Vector: 
Lemma: analytic
Max TF Term Weight (Un-normalized):   0.28774434093827134
Lemma: base
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: case
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: composite
Max TF Term Weight (Un-normalized):   0.6444300218115241
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: consist
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: cylindrical
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: engine
Max TF Term Weight (Un-normalized):   0.30790694740356045
Lemma: exceed
Max TF Term Weight (Un-normalized):   0.277478311244903
Lemma: expression
Max TF Term Weight (Un-normalized):   0.2551439131385681
Lemma: exterior
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: first
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: form
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: fourier
Max TF Term Weight (Un-normalized):   0.32366380514913956
Lemma: from
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: general
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: heat
Max TF Term Weight (Un-normalized):   0.20564796442298555
Lemma: inner
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: into
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: jamr
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: limit
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: mayere
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: medium
Max TF Term Weight (Un-normalized):   0.5787257247593831
Lemma: metallic
Max TF Term Weight (Un-normalized):   0.474785314149417
Lemma: model
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: negligible
Max TF Term Weight (Un-normalized):   0.27588540418264135
Lemma: newtonian
Max TF Term Weight (Un-normalized):   0.2488760036943977
Lemma: not
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: outer
Max TF Term Weight (Un-normalized):   0.2534071261676378
Lemma: paper
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: parallel
Max TF Term Weight (Un-normalized):   0.22064979638505489
Lemma: plane
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: present
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: radius
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: refractory
Max TF Term Weight (Un-normalized):   0.6668790805699087
Lemma: relatively
Max TF Term Weight (Un-normalized):   0.24649958247320775
Lemma: representative
Max TF Term Weight (Un-normalized):   0.3109482756171199
Lemma: result
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: rocket
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: second
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: shield
Max TF Term Weight (Un-normalized):   0.6984708705477545
Lemma: simplify
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: slab
Max TF Term Weight (Un-normalized):   0.49983705610104495
Lemma: solution
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: sum
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: thick
Max TF Term Weight (Un-normalized):   0.3792558873964367
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: thin
Max TF Term Weight (Un-normalized):   0.24991852805052248
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.19447441509655372
Lemma: typical
Max TF Term Weight (Un-normalized):   0.26169894244033665
Lemma: uncooled
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: under
Max TF Term Weight (Un-normalized):   0.18333749124885151
Lemma: wall
Max TF Term Weight (Un-normalized):   0.23202066667116542

Rank#: 5
Cosine Similarity: 0.14352747566488425
Doc#: 181  Document Headline:  some problems on heat conduction in stratiform bodies .
Document Vector: 
Lemma: apply
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: arise
Max TF Term Weight (Un-normalized):   0.29994601416317296
Lemma: body
Max TF Term Weight (Un-normalized):   0.1723104146788242
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: case
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: class
Max TF Term Weight (Un-normalized):   0.3355907822778086
Lemma: complicate
Max TF Term Weight (Un-normalized):   0.4077841691237477
Lemma: composite
Max TF Term Weight (Un-normalized):   0.4326475018163249
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.43077603669706044
Lemma: deduction
Max TF Term Weight (Un-normalized):   0.561980891050863
Lemma: difficulty
Max TF Term Weight (Un-normalized):   0.35940727096943537
Lemma: general
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: give
Max TF Term Weight (Un-normalized):   0.05946125680626242
Lemma: heat
Max TF Term Weight (Un-normalized):   0.20004619644222682
Lemma: idea
Max TF Term Weight (Un-normalized):   0.3780280324057643
Lemma: infinite
Max TF Term Weight (Un-normalized):   0.25698727634829793
Lemma: japan
Max TF Term Weight (Un-normalized):   0.3888266013642283
Lemma: lead
Max TF Term Weight (Un-normalized):   0.16692885196679202
Lemma: multilayer
Max TF Term Weight (Un-normalized):   0.561980891050863
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: paper
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: phy
Max TF Term Weight (Un-normalized):   0.35123113863197447
Lemma: present
Max TF Term Weight (Un-normalized):   0.05946125680626242
Lemma: problem
Max TF Term Weight (Un-normalized):   0.1723104146788242
Lemma: question
Max TF Term Weight (Un-normalized):   0.3644548715088276
Lemma: soc
Max TF Term Weight (Un-normalized):   0.30499361470256514
Lemma: solide
Max TF Term Weight (Un-normalized):   0.6214421478571255
Lemma: special
Max TF Term Weight (Un-normalized):   0.25698727634829793
Lemma: specific
Max TF Term Weight (Un-normalized):   0.27612952547154623
Lemma: stratiform
Max TF Term Weight (Un-normalized):   0.561980891050863
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: usually
Max TF Term Weight (Un-normalized):   0.33728953997331806
Lemma: vodickav
Max TF Term Weight (Un-normalized):   0.561980891050863
 ***************************** 
Processing Query:  can a criterion be developed to show empirically the validity of flow solutions for chemically reacting gas mixtures based on the simplifying assumption of instantaneous local chemical equilibrium  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.13586472226932933
Doc#: 166  Document Headline:  flow of chemically reacting gas mixtures .
Document Vector: 
Lemma: absorption
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: amongst
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attention
Max TF Term Weight (Un-normalized):   0.2690326407600222
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.2690326407600222
Lemma: chemically
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: clarkejf
Max TF Term Weight (Un-normalized):   0.4167440331315116
Lemma: coa
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: concisely
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: condition
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: convective
Max TF Term Weight (Un-normalized):   0.3098631426519673
Lemma: convergentdivergent
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: deduce
Max TF Term Weight (Un-normalized):   0.3142149337600577
Lemma: define
Max TF Term Weight (Un-normalized):   0.24904220809703476
Lemma: density
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: depend
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: derivative
Max TF Term Weight (Un-normalized):   0.24904220809703476
Lemma: derive
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: diffusion
Max TF Term Weight (Un-normalized):   0.2781750191253347
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: dispersion
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: dissociate
Max TF Term Weight (Un-normalized):   0.39618621216492433
Lemma: duct
Max TF Term Weight (Un-normalized):   0.3515713074684887
Lemma: effect
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.27644275763045306
Lemma: example
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: exist
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: explain
Max TF Term Weight (Un-normalized):   0.3028140864267262
Lemma: express
Max TF Term Weight (Un-normalized):   0.24096592547540846
Lemma: expression
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: form
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: frequency
Max TF Term Weight (Un-normalized):   0.23806519637407705
Lemma: frozen
Max TF Term Weight (Un-normalized):   0.46381808268387203
Lemma: gas
Max TF Term Weight (Un-normalized):   0.2944694427243887
Lemma: general
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: geometry
Max TF Term Weight (Un-normalized):   0.2464468852587461
Lemma: give
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: harmonic
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: ideal
Max TF Term Weight (Un-normalized):   0.39618621216492433
Lemma: illustration
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: internal
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: mass
Max TF Term Weight (Un-normalized):   0.29230008130562435
Lemma: maximum
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: mixture
Max TF Term Weight (Un-normalized):   0.40425462184165195
Lemma: mode
Max TF Term Weight (Un-normalized):   0.231898366652749
Lemma: molecule
Max TF Term Weight (Un-normalized):   0.3028140864267262
Lemma: neglect
Max TF Term Weight (Un-normalized):   0.25397464290667315
Lemma: nonequilibrium
Max TF Term Weight (Un-normalized):   0.32126398998529876
Lemma: nonheat
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: nozzle
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: occur
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: phenomenon
Max TF Term Weight (Un-normalized):   0.22861075378373358
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: progress
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: rate
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: react
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: reaction
Max TF Term Weight (Un-normalized):   0.3714242975200505
Lemma: reservoir
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: result
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: show
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: significance
Max TF Term Weight (Un-normalized):   0.30030675778276167
Lemma: sound
Max TF Term Weight (Un-normalized):   0.48750500079294773
Lemma: special
Max TF Term Weight (Un-normalized):   0.22156169755849245
Lemma: speed
Max TF Term Weight (Un-normalized):   0.1568254982874635
Lemma: such
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: suitable
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: term
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: throat
Max TF Term Weight (Un-normalized):   0.3455982692790496
Lemma: time
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: under
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.1568254982874635
Lemma: vibration
Max TF Term Weight (Un-normalized):   0.24904220809703476
Lemma: well
Max TF Term Weight (Un-normalized):   0.15379364905718088

Rank#: 2
Cosine Similarity: 0.1281717461011266
Doc#: 488  Document Headline:  a reaction-rate parameter for gasdynamics of a chemically reacting gas mixture .
Document Vector: 
Lemma: achieve
Max TF Term Weight (Un-normalized):   0.27465249093460986
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: air
Max TF Term Weight (Un-normalized):   0.18986666458933038
Lemma: announce
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: annual
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: author
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.2690326407600222
Lemma: chemically
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: co
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: couple
Max TF Term Weight (Un-normalized):   0.3352270317749069
Lemma: dissociate
Max TF Term Weight (Un-normalized):   0.30030675778276167
Lemma: electric
Max TF Term Weight (Un-normalized):   0.3352270317749069
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: etal
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: exact
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: expand
Max TF Term Weight (Un-normalized):   0.3142149337600577
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: gas
Max TF Term Weight (Un-normalized):   0.21438795725232157
Lemma: gasdynamic
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: general
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: good
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: hall
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: higher
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: ia
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: indicate
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: ionize
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: jaesc
Max TF Term Weight (Un-normalized):   0.2977114349444731
Lemma: jan
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: know
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: laboratory
Max TF Term Weight (Un-normalized):   0.2585985929662403
Lemma: leonardm
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: linearize
Max TF Term Weight (Un-normalized):   0.37284380091380936
Lemma: meeting
Max TF Term Weight (Un-normalized):   0.4544185110361619
Lemma: mixture
Max TF Term Weight (Un-normalized):   0.40425462184165195
Lemma: msvo
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: neglect
Max TF Term Weight (Un-normalized):   0.25397464290667315
Lemma: new
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: non
Max TF Term Weight (Un-normalized):   0.23806519637407705
Lemma: note
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: now
Max TF Term Weight (Un-normalized):   0.30030675778276167
Lemma: order
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: paper
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.2485625339425396
Lemma: pertinent
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: preliminary
Max TF Term Weight (Un-normalized):   0.2764347244412529
Lemma: preparation
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: present
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: process
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: propose
Max TF Term Weight (Un-normalized):   0.25397464290667315
Lemma: provide
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: publish
Max TF Term Weight (Un-normalized):   0.2764347244412529
Lemma: rate
Max TF Term Weight (Un-normalized):   0.2944694427243887
Lemma: react
Max TF Term Weight (Un-normalized):   0.5318696190721607
Lemma: reaction
Max TF Term Weight (Un-normalized):   0.5101644108502855
Lemma: result
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: science
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: series
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: slightly
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: space
Max TF Term Weight (Un-normalized):   0.2650338771079214
Lemma: table
Max TF Term Weight (Un-normalized):   0.26706028089776285
Lemma: taylor
Max TF Term Weight (Un-normalized):   0.3173185686446376
Lemma: term
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: th
Max TF Term Weight (Un-normalized):   0.3455982692790496
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: thermodynamic
Max TF Term Weight (Un-normalized):   0.29363926273884694
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: under
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: york
Max TF Term Weight (Un-normalized):   0.40315396135043485

Rank#: 3
Cosine Similarity: 0.12188319853842228
Doc#: 1061  Document Headline:  turbulent mixing of a rocket exhaust jet with a supersonic stream including chemical reactions .
Document Vector: 
Lemma: accord
Max TF Term Weight (Un-normalized):   0.28616090651285647
Lemma: active
Max TF Term Weight (Un-normalized):   0.403108384017641
Lemma: aero
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: algebraic
Max TF Term Weight (Un-normalized):   0.36855708958289396
Lemma: ambient
Max TF Term Weight (Un-normalized):   0.35037212446361077
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: arrhenius
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: assume
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: assumption
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: available
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: base
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: be
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: both
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: case
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.43536744607206407
Lemma: chemically
Max TF Term Weight (Un-normalized):   0.3929490031854645
Lemma: classical
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: co
Max TF Term Weight (Un-normalized):   0.527421762673068
Lemma: computer
Max TF Term Weight (Un-normalized):   0.2896197903206467
Lemma: concentration
Max TF Term Weight (Un-normalized):   0.4783590967653358
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.26368129777015153
Lemma: consider
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: consist
Max TF Term Weight (Un-normalized):   0.3295174265378456
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: coordinate
Max TF Term Weight (Un-normalized):   0.3723809476905816
Lemma: crank
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: derivative
Max TF Term Weight (Un-normalized):   0.25619174666759414
Lemma: development
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: difference
Max TF Term Weight (Un-normalized):   0.3066741443554443
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: dimensionless
Max TF Term Weight (Un-normalized):   0.33048688157979006
Lemma: direction
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: each
Max TF Term Weight (Un-normalized):   0.27016120753159717
Lemma: equation
Max TF Term Weight (Un-normalized):   0.14569675538342639
Lemma: every
Max TF Term Weight (Un-normalized):   0.38371558518395665
Lemma: exhaust
Max TF Term Weight (Un-normalized):   0.2976358649095804
Lemma: express
Max TF Term Weight (Un-normalized):   0.24788360899396172
Lemma: expression
Max TF Term Weight (Un-normalized):   0.2772240315418298
Lemma: finally
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: finite
Max TF Term Weight (Un-normalized):   0.283830862173043
Lemma: first
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: form
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: formulate
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: from
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: function
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: gas
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: give
Max TF Term Weight (Un-normalized):   0.0829598817736689
Lemma: grid
Max TF Term Weight (Un-normalized):   0.6706363496127035
Lemma: heat
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: ho
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: ibm
Max TF Term Weight (Un-normalized):   0.3929490031854645
Lemma: include
Max TF Term Weight (Un-normalized):   0.18342303381616776
Lemma: initial
Max TF Term Weight (Un-normalized):   0.283830862173043
Lemma: internal
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: into
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: issue
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: january
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: jet
Max TF Term Weight (Un-normalized):   0.3158577142042952
Lemma: law
Max TF Term Weight (Un-normalized):   0.24788360899396172
Lemma: layer
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: linear
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: mass
Max TF Term Weight (Un-normalized):   0.22792232178583569
Lemma: method
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: mix
Max TF Term Weight (Un-normalized):   0.41479940886834454
Lemma: mixture
Max TF Term Weight (Un-normalized):   0.42413412853415045
Lemma: namely
Max TF Term Weight (Un-normalized):   0.45717655183973605
Lemma: net
Max TF Term Weight (Un-normalized):   0.38371558518395665
Lemma: nicolson
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: number
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: oxidation
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: place
Max TF Term Weight (Un-normalized):   0.28437065120538046
Lemma: plot
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: point
Max TF Term Weight (Un-normalized):   0.18342303381616776
Lemma: possibly
Max TF Term Weight (Un-normalized):   0.36855708958289396
Lemma: pp
Max TF Term Weight (Un-normalized):   0.3062581764920053
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: production
Max TF Term Weight (Un-normalized):   0.403108384017641
Lemma: profile
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: programe
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: put
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: rate
Max TF Term Weight (Un-normalized):   0.22493063654581405
Lemma: react
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: reaction
Max TF Term Weight (Un-normalized):   0.5048353994580894
Lemma: reducible
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: release
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: result
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: rocket
Max TF Term Weight (Un-normalized):   0.280658581339866
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: simultaneous
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: single
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: six
Max TF Term Weight (Un-normalized):   0.4783590967653358
Lemma: solution
Max TF Term Weight (Un-normalized):   0.13148830167552575
Lemma: space
Max TF Term Weight (Un-normalized):   0.27264250675093227
Lemma: species
Max TF Term Weight (Un-normalized):   0.6341334057986384
Lemma: stage
Max TF Term Weight (Un-normalized):   0.30206909979668417
Lemma: step
Max TF Term Weight (Un-normalized):   0.38503535092657304
Lemma: stream
Max TF Term Weight (Un-normalized):   0.23762117335365246
Lemma: substitute
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.19262688023881586
Lemma: take
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: term
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: therefore
Max TF Term Weight (Un-normalized):   0.27472708482442504
Lemma: time
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: total
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.24547336473662743
Lemma: two
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: type
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: typical
Max TF Term Weight (Un-normalized):   0.27472708482442504
Lemma: unknown
Max TF Term Weight (Un-normalized):   0.4191394626283513
Lemma: use
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: vasilu
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.1419154310865215

Rank#: 4
Cosine Similarity: 0.10525375924395892
Doc#: 1189  Document Headline:  nonequilibrium flow past a wedge .
Document Vector: 
Lemma: aiaa
Max TF Term Weight (Un-normalized):   0.2930483094538726
Lemma: amount
Max TF Term Weight (Un-normalized):   0.38109383684937875
Lemma: attach
Max TF Term Weight (Un-normalized):   0.312348199248497
Lemma: both
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: capiauxr
Max TF Term Weight (Un-normalized):   0.5204244381420449
Lemma: characterize
Max TF Term Weight (Un-normalized):   0.3375047528367762
Lemma: chemically
Max TF Term Weight (Un-normalized):   0.4102958139934412
Lemma: concave
Max TF Term Weight (Un-normalized):   0.42090368268483946
Lemma: contain
Max TF Term Weight (Un-normalized):   0.2801376415570232
Lemma: convex
Max TF Term Weight (Un-normalized):   0.42090368268483946
Lemma: depend
Max TF Term Weight (Un-normalized):   0.23390920626927075
Lemma: describe
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: dissociation
Max TF Term Weight (Un-normalized):   0.43234526756271335
Lemma: easily
Max TF Term Weight (Un-normalized):   0.3547762513325079
Lemma: either
Max TF Term Weight (Un-normalized):   0.32377179895125136
Lemma: energy
Max TF Term Weight (Un-normalized):   0.29019189909885995
Lemma: entropy
Max TF Term Weight (Un-normalized):   0.3658393706105377
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.31154137943027105
Lemma: exact
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: example
Max TF Term Weight (Un-normalized):   0.1904912222483514
Lemma: field
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: freestream
Max TF Term Weight (Un-normalized):   0.5649686723422751
Lemma: gas
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: identifiable
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: illustrate
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: jnl
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: layer
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: nonequilibrium
Max TF Term Weight (Un-normalized):   0.3450762897798587
Lemma: nonreact
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.2704585525644668
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: out
Max TF Term Weight (Un-normalized):   0.1904912222483514
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: past
Max TF Term Weight (Un-normalized):   0.304875069479503
Lemma: presence
Max TF Term Weight (Un-normalized):   0.23798399737957068
Lemma: present
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: presentation
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: react
Max TF Term Weight (Un-normalized):   0.43303600007964416
Lemma: regime
Max TF Term Weight (Un-normalized):   0.30415113931006466
Lemma: relative
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: relaxation
Max TF Term Weight (Un-normalized):   0.3225656936410341
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: shock
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: straight
Max TF Term Weight (Un-normalized):   0.3107750585362357
Lemma: these
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: value
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: washingtonm
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: wave
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: wedge
Max TF Term Weight (Un-normalized):   0.39094762904278285

Rank#: 5
Cosine Similarity: 0.10101960681411966
Doc#: 1315  Document Headline:  performance estimates for the rae 6in . high-pressure shock tube .
Document Vector: 
Lemma: air
Max TF Term Weight (Un-normalized):   0.17465717721743013
Lemma: always
Max TF Term Weight (Un-normalized):   0.2995206939492599
Lemma: arc
Max TF Term Weight (Un-normalized):   0.18605464704650349
Lemma: argon
Max TF Term Weight (Un-normalized):   0.4526778355394476
Lemma: assume
Max TF Term Weight (Un-normalized):   0.18664242541454437
Lemma: base
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: behave
Max TF Term Weight (Un-normalized):   0.3483878604875331
Lemma: both
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: chart
Max TF Term Weight (Un-normalized):   0.2699208219911086
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.25645134778023415
Lemma: combustion
Max TF Term Weight (Un-normalized):   0.3246664268820594
Lemma: comprise
Max TF Term Weight (Un-normalized):   0.3735335934203326
Lemma: condition
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: constant
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: diaphragm
Max TF Term Weight (Un-normalized):   0.4618539073902895
Lemma: divergent
Max TF Term Weight (Un-normalized):   0.3351300994052123
Lemma: driver
Max TF Term Weight (Un-normalized):   0.5057563663879577
Lemma: either
Max TF Term Weight (Un-normalized):   0.20758418124196085
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: estimate
Max TF Term Weight (Un-normalized):   0.23687131902227823
Lemma: expand
Max TF Term Weight (Un-normalized):   0.2995206939492599
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: form
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: free
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: from
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: gas
Max TF Term Weight (Un-normalized):   0.2250823305203585
Lemma: give
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: graphical
Max TF Term Weight (Un-normalized):   0.364119574313743
Lemma: heat
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: high
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: hydrogen
Max TF Term Weight (Un-normalized):   0.4526778355394476
Lemma: ideal
Max TF Term Weight (Un-normalized):   0.286262932866939
Lemma: in
Max TF Term Weight (Un-normalized):   0.23492181358477676
Lemma: induce
Max TF Term Weight (Un-normalized):   0.20758418124196085
Lemma: initial
Max TF Term Weight (Un-normalized):   0.19546866615309316
Lemma: mach
Max TF Term Weight (Un-normalized):   0.09860708177523271
Lemma: make
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: mixture
Max TF Term Weight (Un-normalized):   0.2920927334675479
Lemma: model
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: normal
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: nozzle
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: number
Max TF Term Weight (Un-normalized):   0.06221414180484812
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: oxygen
Max TF Term Weight (Un-normalized):   0.3351300994052123
Lemma: performance
Max TF Term Weight (Un-normalized):   0.3082210717834644
Lemma: present
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.0775719737409864
Lemma: product
Max TF Term Weight (Un-normalized):   0.3062401015439473
Lemma: ra
Max TF Term Weight (Un-normalized):   0.254297992827596
Lemma: range
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: result
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: section
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: shock
Max TF Term Weight (Un-normalized):   0.21870064685200857
Lemma: simplify
Max TF Term Weight (Un-normalized):   0.22105365545283537
Lemma: specifiic
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tube
Max TF Term Weight (Un-normalized):   0.3352604926870339
Lemma: under
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: uniform
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: various
Max TF Term Weight (Un-normalized):   0.18664242541454437
Lemma: wave
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: woodsna
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: work
Max TF Term Weight (Un-normalized):   0.17518695955620545
 ***************************** 
Processing Query:  what chemical kinetic system is applicable to hypersonic aerodynamic problems  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.09553843158594401
Doc#: 103  Document Headline:  theory of mixing and chemical reaction in the opposed jet diffusion flame .
Document Vector: 
Lemma: analyzable
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: analyze
Max TF Term Weight (Un-normalized):   0.2455555343226533
Lemma: argue
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: ars
Max TF Term Weight (Un-normalized):   0.3154039994468451
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: be
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: between
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: burn
Max TF Term Weight (Un-normalized):   0.43303600007964416
Lemma: butler
Max TF Term Weight (Un-normalized):   0.7965784284662087
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: carry
Max TF Term Weight (Un-normalized):   0.22961405160585316
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.47311562641639787
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: constant
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: datum
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: derive
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: differential
Max TF Term Weight (Un-normalized):   0.28204295404324453
Lemma: diffusion
Max TF Term Weight (Un-normalized):   0.29879353585070145
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: equation
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: exactly
Max TF Term Weight (Un-normalized):   0.3848271145813172
Lemma: experiment
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: extinction
Max TF Term Weight (Un-normalized):   0.7965784284662087
Lemma: flame
Max TF Term Weight (Un-normalized):   0.7089788005935771
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: gas
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: give
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: heimel
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: higher
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: idealization
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: if
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: in
Max TF Term Weight (Un-normalized):   0.26471369168011105
Lemma: independent
Max TF Term Weight (Un-normalized):   0.26471369168011105
Lemma: jet
Max TF Term Weight (Un-normalized):   0.3432439004396327
Lemma: jnl
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: kinetic
Max TF Term Weight (Un-normalized):   0.46069626927522694
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: location
Max TF Term Weight (Un-normalized):   0.2490868272357628
Lemma: make
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: measurement
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: mix
Max TF Term Weight (Un-normalized):   0.38109383684937875
Lemma: must
Max TF Term Weight (Un-normalized):   0.26471369168011105
Lemma: number
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: of
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: oppose
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: out
Max TF Term Weight (Un-normalized):   0.1904912222483514
Lemma: potter
Max TF Term Weight (Un-normalized):   0.7965784284662087
Lemma: premixed
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: property
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: quantitatively
Max TF Term Weight (Un-normalized):   0.43303600007964416
Lemma: rate
Max TF Term Weight (Un-normalized):   0.2857777758760011
Lemma: reaction
Max TF Term Weight (Un-normalized):   0.30240511276251825
Lemma: relation
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: solve
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: spaldingdb
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: speed
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: system
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transport
Max TF Term Weight (Un-normalized):   0.32913480706305864
Lemma: use
Max TF Term Weight (Un-normalized):   0.055064312074301874

Rank#: 2
Cosine Similarity: 0.08537585145071698
Doc#: 1032  Document Headline:  on the conservativeness of various distributed force systems .
Document Vector: 
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: assistant
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: be
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: bodner
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: brown
Max TF Term Weight (Un-normalized):   0.44529588362487266
Lemma: buckle
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: cantilever
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: cause
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: change
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: character
Max TF Term Weight (Un-normalized):   0.30790694740356045
Lemma: column
Max TF Term Weight (Un-normalized):   0.2636317064153084
Lemma: conservative
Max TF Term Weight (Un-normalized):   0.5363571596846642
Lemma: conservativeness
Max TF Term Weight (Un-normalized):   0.6825281729433365
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: could
Max TF Term Weight (Un-normalized):   0.2240213044582042
Lemma: determination
Max TF Term Weight (Un-normalized):   0.23032739778110356
Lemma: determine
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: directional
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: distribute
Max TF Term Weight (Un-normalized):   0.26913873592347315
Lemma: eight
Max TF Term Weight (Un-normalized):   0.3950604896069551
Lemma: employ
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: end
Max TF Term Weight (Un-normalized):   0.25971321949053716
Lemma: engineering
Max TF Term Weight (Un-normalized):   0.2942779834397059
Lemma: example
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: force
Max TF Term Weight (Un-normalized):   0.19591839614758508
Lemma: generally
Max TF Term Weight (Un-normalized):   0.24649958247320775
Lemma: instability
Max TF Term Weight (Un-normalized):   0.3376278048286264
Lemma: kinetic
Max TF Term Weight (Un-normalized):   0.30364252018555526
Lemma: large
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: load
Max TF Term Weight (Un-normalized):   0.2624773119932463
Lemma: magnitude
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: make
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: method
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: necessity
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: nonconservative
Max TF Term Weight (Un-normalized):   0.44529588362487266
Lemma: nongyroscopic
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: otherwise
Max TF Term Weight (Un-normalized):   0.35107932890698595
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: professor
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: providence
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: reference
Max TF Term Weight (Un-normalized):   0.31725594836028115
Lemma: rus
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: show
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: small
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: sol
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: statical
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: system
Max TF Term Weight (Un-normalized):   0.33058971610345544
Lemma: tangential
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: time
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: university
Max TF Term Weight (Un-normalized):   0.30790694740356045
Lemma: usually
Max TF Term Weight (Un-normalized):   0.2849565220911584
Lemma: valid
Max TF Term Weight (Un-normalized):   0.24404258942178847
Lemma: various
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: whereas
Max TF Term Weight (Un-normalized):   0.30790694740356045

Rank#: 3
Cosine Similarity: 0.08458017208465164
Doc#: 943  Document Headline:  compressible free shear layer with finite initial thickness .
Document Vector: 
Lemma: aiaa
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: angle
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: approach
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: base
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: baume
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: be
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: blasius
Max TF Term Weight (Un-normalized):   0.32366380514913956
Lemma: body
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: case
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: chapman
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.3427218471775505
Lemma: composition
Max TF Term Weight (Un-normalized):   0.3337567334917133
Lemma: compressible
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: conservation
Max TF Term Weight (Un-normalized):   0.35814234142147783
Lemma: coordinate
Max TF Term Weight (Un-normalized):   0.3427218471775505
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.2341200344635083
Lemma: crocco
Max TF Term Weight (Un-normalized):   0.32366380514913956
Lemma: denisonmr
Max TF Term Weight (Un-normalized):   0.474785314149417
Lemma: difference
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: distance
Max TF Term Weight (Un-normalized):   0.2341200344635083
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: downstream
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: effect
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: equation
Max TF Term Weight (Un-normalized):   0.11924144168115643
Lemma: finite
Max TF Term Weight (Un-normalized):   0.354271029969964
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: free
Max TF Term Weight (Un-normalized):   0.21364050481287133
Lemma: from
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: function
Max TF Term Weight (Un-normalized):   0.18333749124885151
Lemma: implicit
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: initial
Max TF Term Weight (Un-normalized):   0.354271029969964
Lemma: jnl
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: kinetic
Max TF Term Weight (Un-normalized):   0.30364252018555526
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: large
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: layer
Max TF Term Weight (Un-normalized):   0.13099307578700747
Lemma: method
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: momentum
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: numerically
Max TF Term Weight (Un-normalized):   0.277478311244903
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: other
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: outline
Max TF Term Weight (Un-normalized):   0.300271012112406
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: profile
Max TF Term Weight (Un-normalized):   0.33518074732645714
Lemma: rear
Max TF Term Weight (Un-normalized):   0.3109482756171199
Lemma: result
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: separate
Max TF Term Weight (Un-normalized):   0.22064979638505489
Lemma: shear
Max TF Term Weight (Un-normalized):   0.3372088874246399
Lemma: solve
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: streamwise
Max TF Term Weight (Un-normalized):   0.30364252018555526
Lemma: system
Max TF Term Weight (Un-normalized):   0.20094157607166993
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: these
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.22569892024619198
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transform
Max TF Term Weight (Un-normalized):   0.2708851904029723
Lemma: uncouple
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: use
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: wake
Max TF Term Weight (Un-normalized):   0.24649958247320775
Lemma: zero
Max TF Term Weight (Un-normalized):   0.16687836674585665

Rank#: 4
Cosine Similarity: 0.07927356870895282
Doc#: 625  Document Headline:  viscous and inviscid nonequilibrium gas flows .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.20454273607309637
Lemma: accordingly
Max TF Term Weight (Un-normalized):   0.36859079972534337
Lemma: ae
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.14840170041888792
Lemma: air
Max TF Term Weight (Un-normalized):   0.20454273607309637
Lemma: allow
Max TF Term Weight (Un-normalized):   0.27166677931535277
Lemma: also
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: ambient
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: analogy
Max TF Term Weight (Un-normalized):   0.2762726439609148
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: arbitrary
Max TF Term Weight (Un-normalized):   0.19786893389185056
Lemma: associate
Max TF Term Weight (Un-normalized):   0.2137938261231498
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: behind
Max TF Term Weight (Un-normalized):   0.2137938261231498
Lemma: blast
Max TF Term Weight (Un-normalized):   0.3234740956258618
Lemma: blunt
Max TF Term Weight (Un-normalized):   0.21117564556912427
Lemma: body
Max TF Term Weight (Un-normalized):   0.1271404073400238
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.0635702036700119
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: case
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: chemical
Max TF Term Weight (Un-normalized):   0.2596004555566981
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: conclusion
Max TF Term Weight (Un-normalized):   0.23521113020719245
Lemma: condition
Max TF Term Weight (Un-normalized):   0.1271404073400238
Lemma: consider
Max TF Term Weight (Un-normalized):   0.14760544189911234
Lemma: considerably
Max TF Term Weight (Un-normalized):   0.2596004555566981
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.19326306924628864
Lemma: constituent
Max TF Term Weight (Un-normalized):   0.4675252666712686
Lemma: control
Max TF Term Weight (Un-normalized):   0.22059574503584292
Lemma: cool
Max TF Term Weight (Un-normalized):   0.2172757914399585
Lemma: degree
Max TF Term Weight (Un-normalized):   0.2978108776262889
Lemma: diminish
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: dissociate
Max TF Term Weight (Un-normalized):   0.3723930449553187
Lemma: dissociation
Max TF Term Weight (Un-normalized):   0.4840739059554268
Lemma: downstream
Max TF Term Weight (Un-normalized):   0.2137938261231498
Lemma: edge
Max TF Term Weight (Un-normalized):   0.20454273607309637
Lemma: effect
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: employ
Max TF Term Weight (Un-normalized):   0.2137938261231498
Lemma: energy
Max TF Term Weight (Un-normalized):   0.24203432783922416
Lemma: entry
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: envelope
Max TF Term Weight (Un-normalized):   0.38901953209245116
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.20219547868018978
Lemma: expansion
Max TF Term Weight (Un-normalized):   0.20627465361109093
Lemma: facility
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: far
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: field
Max TF Term Weight (Un-normalized):   0.21857877797992872
Lemma: finally
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: finite
Max TF Term Weight (Un-normalized):   0.19786893389185056
Lemma: flight
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fraction
Max TF Term Weight (Un-normalized):   0.3234740956258618
Lemma: free
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: freezing
Max TF Term Weight (Un-normalized):   0.40213314096700675
Lemma: friction
Max TF Term Weight (Un-normalized):   0.20219547868018978
Lemma: frozen
Max TF Term Weight (Un-normalized):   0.4996697017748534
Lemma: gas
Max TF Term Weight (Un-normalized):   0.20151277796035058
Lemma: generalize
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: generate
Max TF Term Weight (Un-normalized):   0.2596004555566981
Lemma: geometry
Max TF Term Weight (Un-normalized):   0.2378065483168196
Lemma: govern
Max TF Term Weight (Un-normalized):   0.24507038555679764
Lemma: heat
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: higher
Max TF Term Weight (Un-normalized):   0.1830505154899095
Lemma: highly
Max TF Term Weight (Un-normalized):   0.28059918874925394
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.21857877797992872
Lemma: immediate
Max TF Term Weight (Un-normalized):   0.3457108970694775
Lemma: include
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: indicate
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: induce
Max TF Term Weight (Un-normalized):   0.2101332220837355
Lemma: influence
Max TF Term Weight (Un-normalized):   0.26961253052655726
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.2542808146800476
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.18528505281957922
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.32617106882281627
Lemma: kinetic
Max TF Term Weight (Un-normalized):   0.298999455104907
Lemma: knowledge
Max TF Term Weight (Un-normalized):   0.27323532888264646
Lemma: law
Max TF Term Weight (Un-normalized):   0.23251774896287214
Lemma: layer
Max TF Term Weight (Un-normalized):   0.10075638898017529
Lemma: lead
Max TF Term Weight (Un-normalized):   0.20454273607309637
Lemma: lifting
Max TF Term Weight (Un-normalized):   0.2596004555566981
Lemma: limit
Max TF Term Weight (Un-normalized):   0.20219547868018978
Lemma: mach
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: magnitude
Max TF Term Weight (Un-normalized):   0.2101332220837355
Lemma: major
Max TF Term Weight (Un-normalized):   0.2667430249129211
Lemma: make
Max TF Term Weight (Un-normalized):   0.10075638898017529
Lemma: mass
Max TF Term Weight (Un-normalized):   0.2137938261231498
Lemma: may
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: means
Max TF Term Weight (Un-normalized):   0.1830505154899095
Lemma: mechanism
Max TF Term Weight (Un-normalized):   0.2762726439609148
Lemma: model
Max TF Term Weight (Un-normalized):   0.17846412416921226
Lemma: noncatalytic
Max TF Term Weight (Un-normalized):   0.4384867655654138
Lemma: nonequilibrium
Max TF Term Weight (Un-normalized):   0.39838089674846416
Lemma: nozzle
Max TF Term Weight (Un-normalized):   0.20219547868018978
Lemma: number
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: numerically
Max TF Term Weight (Un-normalized):   0.27323532888264646
Lemma: observe
Max TF Term Weight (Un-normalized):   0.28348697624926383
Lemma: of
Max TF Term Weight (Un-normalized):   0.24507038555679764
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: order
Max TF Term Weight (Un-normalized):   0.17846412416921226
Lemma: over
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.20151277796035058
Lemma: portion
Max TF Term Weight (Un-normalized):   0.22971871835444901
Lemma: possibility
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: power
Max TF Term Weight (Un-normalized):   0.19326306924628864
Lemma: present
Max TF Term Weight (Un-normalized):   0.085338083231111
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: prevail
Max TF Term Weight (Un-normalized):   0.38901953209245116
Lemma: problem
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: rate
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: re
Max TF Term Weight (Un-normalized):   0.24507038555679764
Lemma: reaction
Max TF Term Weight (Un-normalized):   0.27166677931535277
Lemma: result
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: sc
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: section
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: sharp
Max TF Term Weight (Un-normalized):   0.2988079102208426
Lemma: shock
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: simulation
Max TF Term Weight (Un-normalized):   0.3599297447340222
Lemma: since
Max TF Term Weight (Un-normalized):   0.2378065483168196
Lemma: skin
Max TF Term Weight (Un-normalized):   0.19326306924628864
Lemma: slab
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: slender
Max TF Term Weight (Un-normalized):   0.2483618308792876
Lemma: solution
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: sonic
Max TF Term Weight (Un-normalized):   0.22971871835444901
Lemma: species
Max TF Term Weight (Un-normalized):   0.4859214948082603
Lemma: spectrum
Max TF Term Weight (Un-normalized):   0.30619349661079576
Lemma: stream
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: technique
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: test
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: value
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: vehicle
Max TF Term Weight (Un-normalized):   0.2172757914399585
Lemma: verify
Max TF Term Weight (Un-normalized):   0.3187145901622552
Lemma: viscous
Max TF Term Weight (Un-normalized):   0.25205277856895575
Lemma: wall
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: wave
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: wedge
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: whalenrj
Max TF Term Weight (Un-normalized):   0.5169925001442313
Lemma: wind
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: within
Max TF Term Weight (Un-normalized):   0.1830505154899095

Rank#: 5
Cosine Similarity: 0.0665310728641259
Doc#: 1272  Document Headline:  oscillatory aerodynamic coefficients for a unified supersonic hypersonic strip theory .
Document Vector: 
Lemma: accuracy
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: also
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.2240198079156675
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.23762117335365246
Lemma: consider
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: correction
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: derivation
Max TF Term Weight (Un-normalized):   0.33527351264378497
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: dyke
Max TF Term Weight (Un-normalized):   0.3929490031854645
Lemma: edge
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: finite
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: flutter
Max TF Term Weight (Un-normalized):   0.2448996053555501
Lemma: frequency
Max TF Term Weight (Un-normalized):   0.2448996053555501
Lemma: from
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: increase
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: lead
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: limit
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: modify
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: nonlinear
Max TF Term Weight (Un-normalized):   0.26368129777015153
Lemma: normal
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: number
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: order
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: oscillatory
Max TF Term Weight (Un-normalized):   0.42889639855279516
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: regime
Max TF Term Weight (Un-normalized):   0.29129199697738994
Lemma: revelljd
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: roddenwp
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: second
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: span
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: steady
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: strip
Max TF Term Weight (Un-normalized):   0.4783590967653358
Lemma: suggest
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.21344188869123673
Lemma: sweep
Max TF Term Weight (Un-normalized):   0.26829376086766243
Lemma: theory
Max TF Term Weight (Un-normalized):   0.14569675538342639
Lemma: throughout
Max TF Term Weight (Un-normalized):   0.2976358649095804
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: unify
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: unsteady
Max TF Term Weight (Un-normalized):   0.26368129777015153
Lemma: value
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: van
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: wing
Max TF Term Weight (Un-normalized):   0.13632125337546613
 ***************************** 
Processing Query:  what theoretical and experimental guides do we have as to turbulent couette flow behaviour  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.09460908908553933
Doc#: 491  Document Headline:  on the close relationship between turbulent plane-couette and pressure flows .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: also
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: attempt
Max TF Term Weight (Un-normalized):   0.2690326407600222
Lemma: author
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: basis
Max TF Term Weight (Un-normalized):   0.22156169755849245
Lemma: between
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: both
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: burtonra
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: channel
Max TF Term Weight (Un-normalized):   0.4299731339938066
Lemma: close
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: concise
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: contribution
Max TF Term Weight (Un-normalized):   0.3173185686446376
Lemma: couette
Max TF Term Weight (Un-normalized):   0.5590266807823727
Lemma: describable
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: explanation
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: find
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: finding
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: firmer
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: further
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: induce
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: law
Max TF Term Weight (Un-normalized):   0.31789953039943736
Lemma: make
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: measure
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: move
Max TF Term Weight (Un-normalized):   0.231898366652749
Lemma: no
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: number
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: originally
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: other
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: own
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: parallel
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: plane
Max TF Term Weight (Un-normalized):   0.32920329968951684
Lemma: power
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.07841274914373175
Lemma: profile
Max TF Term Weight (Un-normalized):   0.2424577196640562
Lemma: put
Max TF Term Weight (Un-normalized):   0.3515713074684887
Lemma: range
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: relationship
Max TF Term Weight (Un-normalized):   0.2907943307820745
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: satisfactorily
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: set
Max TF Term Weight (Un-normalized):   0.22156169755849245
Lemma: seventh
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: shear
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: similar
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: stationary
Max TF Term Weight (Un-normalized):   0.289329746059804
Lemma: study
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: such
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: term
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: these
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: through
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.2712635436921003
Lemma: up
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: wall
Max TF Term Weight (Un-normalized):   0.18986666458933038

Rank#: 2
Cosine Similarity: 0.08831387139615975
Doc#: 386  Document Headline:  a generalised porous-wall ?couette type? flow .
Document Vector: 
Lemma: addition
Max TF Term Weight (Un-normalized):   0.23517374330390606
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: between
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: blow
Max TF Term Weight (Un-normalized):   0.5287209185261821
Lemma: boundarylayer
Max TF Term Weight (Un-normalized):   0.29914249513506797
Lemma: case
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: consider
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: constant
Max TF Term Weight (Un-normalized):   0.2328978324306263
Lemma: contain
Max TF Term Weight (Un-normalized):   0.26829376086766243
Lemma: couette
Max TF Term Weight (Un-normalized):   0.59144447621678
Lemma: cramerkr
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: distribute
Max TF Term Weight (Un-normalized):   0.3801596511519164
Lemma: do
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: exist
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: fix
Max TF Term Weight (Un-normalized):   0.26829376086766243
Lemma: flat
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: follow
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: generalise
Max TF Term Weight (Un-normalized):   0.38371558518395665
Lemma: inclined
Max TF Term Weight (Un-normalized):   0.36855708958289396
Lemma: move
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: not
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: observe
Max TF Term Weight (Un-normalized):   0.23517374330390606
Lemma: plate
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: porous
Max TF Term Weight (Un-normalized):   0.2945300320375571
Lemma: recently
Max TF Term Weight (Un-normalized):   0.27472708482442504
Lemma: reference
Max TF Term Weight (Un-normalized):   0.25619174666759414
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: slightly
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: stationary
Max TF Term Weight (Un-normalized):   0.2976358649095804
Lemma: subject
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: suction
Max TF Term Weight (Un-normalized):   0.43491992080052005
Lemma: surface
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: text
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: thus
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: two
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: type
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: uniformly
Max TF Term Weight (Un-normalized):   0.39629618044595005
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: wall
Max TF Term Weight (Un-normalized):   0.14804939782991433

Rank#: 3
Cosine Similarity: 0.07198287127269828
Doc#: 257  Document Headline:  on turbulen flow between parallel plates .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: across
Max TF Term Weight (Un-normalized):   0.24507038555679764
Lemma: also
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: between
Max TF Term Weight (Un-normalized):   0.1691747351792479
Lemma: both
Max TF Term Weight (Un-normalized):   0.17846412416921226
Lemma: can
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: case
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: check
Max TF Term Weight (Un-normalized):   0.28977811356615363
Lemma: co
Max TF Term Weight (Un-normalized):   0.3144905093289444
Lemma: conclusion
Max TF Term Weight (Un-normalized):   0.23521113020719245
Lemma: consist
Max TF Term Weight (Un-normalized):   0.2952108837982247
Lemma: constant
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: correlation
Max TF Term Weight (Un-normalized):   0.291466999990211
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: couette
Max TF Term Weight (Un-normalized):   0.3526659074940441
Lemma: datum
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: direction
Max TF Term Weight (Un-normalized):   0.20219547868018978
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.14571918531995248
Lemma: draw
Max TF Term Weight (Un-normalized):   0.298999455104907
Lemma: equation
Max TF Term Weight (Un-normalized):   0.12647672480030775
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: express
Max TF Term Weight (Un-normalized):   0.23251774896287214
Lemma: expression
Max TF Term Weight (Un-normalized):   0.2483618308792876
Lemma: fairly
Max TF Term Weight (Un-normalized):   0.30619349661079576
Lemma: finally
Max TF Term Weight (Un-normalized):   0.25373144054811886
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluctuation
Max TF Term Weight (Un-normalized):   0.39838089674846416
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: form
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: hold
Max TF Term Weight (Un-normalized):   0.2833443784404361
Lemma: ie
Max TF Term Weight (Un-normalized):   0.28059918874925394
Lemma: include
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: incompressible
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: intensity
Max TF Term Weight (Un-normalized):   0.29567950150902267
Lemma: jappmech
Max TF Term Weight (Un-normalized):   0.3457108970694775
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.14760544189911234
Lemma: laufer
Max TF Term Weight (Un-normalized):   0.4675252666712686
Lemma: layer
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: logarithmic
Max TF Term Weight (Un-normalized):   0.418058033198306
Lemma: longitudinal
Max TF Term Weight (Un-normalized):   0.24031088009319101
Lemma: maximum
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: mean
Max TF Term Weight (Un-normalized):   0.3912719114980649
Lemma: motion
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: move
Max TF Term Weight (Un-normalized):   0.22376809540968384
Lemma: not
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: number
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.1691747351792479
Lemma: only
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: ordinate
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: other
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: paisus
Max TF Term Weight (Un-normalized):   0.4675252666712686
Lemma: parallel
Max TF Term Weight (Un-normalized):   0.27922051314938756
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: perpendicular
Max TF Term Weight (Un-normalized):   0.33348172136657533
Lemma: plate
Max TF Term Weight (Un-normalized):   0.2427303027192513
Lemma: poiseuille
Max TF Term Weight (Un-normalized):   0.6008154153074606
Lemma: polynomial
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.0635702036700119
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: region
Max TF Term Weight (Un-normalized):   0.14840170041888792
Lemma: rest
Max TF Term Weight (Un-normalized):   0.39838089674846416
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.17846412416921226
Lemma: rigorous
Max TF Term Weight (Un-normalized):   0.3599297447340222
Lemma: same
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: shear
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: show
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: solution
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: special
Max TF Term Weight (Un-normalized):   0.2137938261231498
Lemma: stress
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: study
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: sublayer
Max TF Term Weight (Un-normalized):   0.3526659074940441
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: these
Max TF Term Weight (Un-normalized):   0.13525766180473187
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.291466999990211
Lemma: true
Max TF Term Weight (Un-normalized):   0.3526659074940441
Lemma: turbulen
Max TF Term Weight (Un-normalized):   0.4384867655654138
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.311176371971401
Lemma: two
Max TF Term Weight (Un-normalized):   0.10075638898017529
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.1878017980156649
Lemma: viscous
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: way
Max TF Term Weight (Un-normalized):   0.2596004555566981
Lemma: well
Max TF Term Weight (Un-normalized):   0.14840170041888792

Rank#: 4
Cosine Similarity: 0.07092125318826321
Doc#: 385  Document Headline:  on a generalised porous-wall ?couette type? flow .
Document Vector: 
Lemma: above
Max TF Term Weight (Un-normalized):   0.25698727634829793
Lemma: ae
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: below
Max TF Term Weight (Un-normalized):   0.2651634086857589
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: consider
Max TF Term Weight (Un-normalized):   0.13806476273577312
Lemma: couette
Max TF Term Weight (Un-normalized):   0.6142248565062429
Lemma: different
Max TF Term Weight (Un-normalized):   0.22003279637648082
Lemma: fix
Max TF Term Weight (Un-normalized):   0.30250693449590393
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: generalise
Max TF Term Weight (Un-normalized):   0.4326475018163249
Lemma: have
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: interpretation
Max TF Term Weight (Un-normalized):   0.3888266013642283
Lemma: lilleygm
Max TF Term Weight (Un-normalized):   0.5270756487258014
Lemma: make
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: method
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.13806476273577312
Lemma: paper
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.18848772456735313
Lemma: porous
Max TF Term Weight (Un-normalized):   0.48117360223247274
Lemma: problem
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: quote
Max TF Term Weight (Un-normalized):   0.5025196342446007
Lemma: recent
Max TF Term Weight (Un-normalized):   0.27612952547154623
Lemma: reference
Max TF Term Weight (Un-normalized):   0.28886165551122284
Lemma: result
Max TF Term Weight (Un-normalized):   0.05946125680626242
Lemma: rigorously
Max TF Term Weight (Un-normalized):   0.561980891050863
Lemma: sc
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: state
Max TF Term Weight (Un-normalized):   0.2525871087712568
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: type
Max TF Term Weight (Un-normalized):   0.24186824538519194
Lemma: wall
Max TF Term Weight (Un-normalized):   0.24186824538519194

Rank#: 5
Cosine Similarity: 0.06321038400532847
Doc#: 798  Document Headline:  interaction between shock waves and boundary layers, with a note on the effects of the interaction of the performance of supersonic intakes .
Document Vector: 
Lemma: above
Max TF Term Weight (Un-normalized):   0.20169874049493933
Lemma: adverse
Max TF Term Weight (Un-normalized):   0.2756668707156477
Lemma: aerfoil
Max TF Term Weight (Un-normalized):   0.4877443751081735
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.14000608251687907
Lemma: aerofoil
Max TF Term Weight (Un-normalized):   0.31620139590480767
Lemma: affect
Max TF Term Weight (Un-normalized):   0.23120587247894756
Lemma: along
Max TF Term Weight (Un-normalized):   0.15503004632264633
Lemma: also
Max TF Term Weight (Un-normalized):   0.11449184364015992
Lemma: although
Max TF Term Weight (Un-normalized):   0.2552842738025034
Lemma: appear
Max TF Term Weight (Un-normalized):   0.1866747766891721
Lemma: application
Max TF Term Weight (Un-normalized):   0.20355027861364167
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12063682439300141
Lemma: arc
Max TF Term Weight (Un-normalized):   0.17768428246288087
Lemma: arise
Max TF Term Weight (Un-normalized):   0.23541528644085305
Lemma: artificial
Max TF Term Weight (Un-normalized):   0.33271432878552715
Lemma: assist
Max TF Term Weight (Un-normalized):   0.39440698676358743
Lemma: associate
Max TF Term Weight (Un-normalized):   0.20169874049493933
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: available
Max TF Term Weight (Un-normalized):   0.19075655327892402
Lemma: be
Max TF Term Weight (Un-normalized):   0.0739681302207084
Lemma: because
Max TF Term Weight (Un-normalized):   0.25895547408472774
Lemma: before
Max TF Term Weight (Un-normalized):   0.28887102931852005
Lemma: behaviour
Max TF Term Weight (Un-normalized):   0.2647246834996324
Lemma: between
Max TF Term Weight (Un-normalized):   0.18574018442353515
Lemma: both
Max TF Term Weight (Un-normalized):   0.19487735842513298
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.08488864281117693
Lemma: briefly
Max TF Term Weight (Un-normalized):   0.2936305345810954
Lemma: buffet
Max TF Term Weight (Un-normalized):   0.3395672246293009
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.11449184364015992
Lemma: case
Max TF Term Weight (Un-normalized):   0.0739681302207084
Lemma: certain
Max TF Term Weight (Un-normalized):   0.22214035647470126
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.16070962038932626
Lemma: clear
Max TF Term Weight (Un-normalized):   0.34773829259129446
Lemma: comparatively
Max TF Term Weight (Un-normalized):   0.35672878681758563
Lemma: complete
Max TF Term Weight (Un-normalized):   0.20498371851129626
Lemma: concern
Max TF Term Weight (Un-normalized):   0.25323669033508484
Lemma: condition
Max TF Term Weight (Un-normalized):   0.1388334313513169
Lemma: connect
Max TF Term Weight (Un-normalized):   0.32005301770100647
Lemma: consequence
Max TF Term Weight (Un-normalized):   0.33271432878552715
Lemma: consider
Max TF Term Weight (Un-normalized):   0.1083613521503533
Lemma: control
Max TF Term Weight (Un-normalized):   0.2552842738025034
Lemma: cp
Max TF Term Weight (Un-normalized):   0.2756668707156477
Lemma: critical
Max TF Term Weight (Un-normalized):   0.20169874049493933
Lemma: critically
Max TF Term Weight (Un-normalized):   0.39440698676358743
Lemma: depend
Max TF Term Weight (Un-normalized):   0.24317652633195816
Lemma: describe
Max TF Term Weight (Un-normalized):   0.1479362604414168
Lemma: design
Max TF Term Weight (Un-normalized):   0.19016683601184914
Lemma: detail
Max TF Term Weight (Un-normalized):   0.17269468950893282
Lemma: development
Max TF Term Weight (Un-normalized):   0.19075655327892402
Lemma: difference
Max TF Term Weight (Un-normalized):   0.27752381127697723
Lemma: difficulty
Max TF Term Weight (Un-normalized):   0.28208398061314605
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.12063682439300141
Lemma: discrepancy
Max TF Term Weight (Un-normalized):   0.3006837595771288
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.14797856122412167
Lemma: do
Max TF Term Weight (Un-normalized):   0.17768428246288087
Lemma: downstream
Max TF Term Weight (Un-normalized):   0.20169874049493933
Lemma: dw
Max TF Term Weight (Un-normalized):   0.3670112980988547
Lemma: edge
Max TF Term Weight (Un-normalized):   0.19487735842513298
Lemma: effect
Max TF Term Weight (Un-normalized):   0.07703087700617867
Lemma: emphasis
Max TF Term Weight (Un-normalized):   0.31461546106096494
Lemma: encounter
Max TF Term Weight (Un-normalized):   0.2606429069098805
Lemma: enough
Max TF Term Weight (Un-normalized):   0.2924627445107325
Lemma: essential
Max TF Term Weight (Un-normalized):   0.2756668707156477
Lemma: evidence
Max TF Term Weight (Un-normalized):   0.25777742366893736
Lemma: example
Max TF Term Weight (Un-normalized):   0.16144715622014466
Lemma: expect
Max TF Term Weight (Un-normalized):   0.23937694044094113
Lemma: experiment
Max TF Term Weight (Un-normalized):   0.23321718804491837
Lemma: explain
Max TF Term Weight (Un-normalized):   0.2756668707156477
Lemma: extent
Max TF Term Weight (Un-normalized):   0.26731456793723163
Lemma: far
Max TF Term Weight (Un-normalized):   0.23937694044094113
Lemma: feature
Max TF Term Weight (Un-normalized):   0.2243529766351739
Lemma: february
Max TF Term Weight (Un-normalized):   0.35672878681758563
Lemma: find
Max TF Term Weight (Un-normalized):   0.11449184364015992
Lemma: fix
Max TF Term Weight (Un-normalized):   0.23742524745121704
Lemma: flight
Max TF Term Weight (Un-normalized):   0.15503004632264633
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: frequently
Max TF Term Weight (Un-normalized):   0.34773829259129446
Lemma: from
Max TF Term Weight (Un-normalized):   0.05724592182007996
Lemma: full
Max TF Term Weight (Un-normalized):   0.3526481627655124
Lemma: fundamental
Max TF Term Weight (Un-normalized):   0.3624087318662948
Lemma: further
Max TF Term Weight (Un-normalized):   0.19824522999096786
Lemma: gadd
Max TF Term Weight (Un-normalized):   0.41367999227114777
Lemma: ge
Max TF Term Weight (Un-normalized):   0.37938302295782017
Lemma: give
Max TF Term Weight (Un-normalized):   0.046668694172293024
Lemma: gradient
Max TF Term Weight (Un-normalized):   0.16730551856529446
Lemma: guide
Max TF Term Weight (Un-normalized):   0.2966986501879698
Lemma: have
Max TF Term Weight (Un-normalized):   0.10177513930682083
Lemma: hero
Max TF Term Weight (Un-normalized):   0.4877443751081735
Lemma: hh
Max TF Term Weight (Un-normalized):   0.39440698676358743
Lemma: high
Max TF Term Weight (Un-normalized):   0.14797856122412167
Lemma: holder
Max TF Term Weight (Un-normalized):   0.37938302295782017
Lemma: if
Max TF Term Weight (Un-normalized):   0.20522448304420168
Lemma: ii
Max TF Term Weight (Un-normalized):   0.31006009264529266
Lemma: iii
Max TF Term Weight (Un-normalized):   0.3395672246293009
Lemma: importance
Max TF Term Weight (Un-normalized):   0.23334347086146512
Lemma: important
Max TF Term Weight (Un-normalized):   0.1946049546137098
Lemma: induce
Max TF Term Weight (Un-normalized):   0.19824522999096786
Lemma: influence
Max TF Term Weight (Un-normalized):   0.17269468950893282
Lemma: information
Max TF Term Weight (Un-normalized):   0.318123627160608
Lemma: intake
Max TF Term Weight (Un-normalized):   0.5074385070355149
Lemma: inter
Max TF Term Weight (Un-normalized):   0.41367999227114777
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.34784394026367454
Lemma: involve
Max TF Term Weight (Un-normalized):   0.17269468950893282
Lemma: iv
Max TF Term Weight (Un-normalized):   0.37938302295782017
Lemma: knowledge
Max TF Term Weight (Un-normalized):   0.31620139590480767
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.16118062238211933
Lemma: large
Max TF Term Weight (Un-normalized):   0.13101558829058785
Lemma: larger
Max TF Term Weight (Un-normalized):   0.23937694044094113
Lemma: layer
Max TF Term Weight (Un-normalized):   0.1460776523175738
Lemma: literature
Max TF Term Weight (Un-normalized):   0.32005301770100647
Lemma: little
Max TF Term Weight (Un-normalized):   0.26731456793723163
Lemma: local
Max TF Term Weight (Un-normalized):   0.16730551856529446
Lemma: long
Max TF Term Weight (Un-normalized):   0.21110872949664436
Lemma: mach
Max TF Term Weight (Un-normalized):   0.0739681302207084
Lemma: magnitude
Max TF Term Weight (Un-normalized):   0.19824522999096786
Lemma: mainly
Max TF Term Weight (Un-normalized):   0.3460169132065451
Lemma: make
Max TF Term Weight (Un-normalized):   0.09073263940404175
Lemma: means
Max TF Term Weight (Un-normalized):   0.17269468950893282
Lemma: method
Max TF Term Weight (Un-normalized):   0.0739681302207084
Lemma: model
Max TF Term Weight (Un-normalized):   0.19487735842513298
Lemma: more
Max TF Term Weight (Un-normalized):   0.19263889068765966
Lemma: most
Max TF Term Weight (Un-normalized):   0.22365355359581088
Lemma: motion
Max TF Term Weight (Un-normalized):   0.16144715622014466
Lemma: move
Max TF Term Weight (Un-normalized):   0.21110872949664436
Lemma: movement
Max TF Term Weight (Un-normalized):   0.31006009264529266
Lemma: much
Max TF Term Weight (Un-normalized):   0.25144225979336804
Lemma: nature
Max TF Term Weight (Un-normalized):   0.24836743466723238
Lemma: need
Max TF Term Weight (Un-normalized):   0.24836743466723238
Lemma: note
Max TF Term Weight (Un-normalized):   0.1980383519824234
Lemma: number
Max TF Term Weight (Un-normalized):   0.06421296356255321
Lemma: occur
Max TF Term Weight (Un-normalized):   0.16144715622014466
Lemma: occurrence
Max TF Term Weight (Un-normalized):   0.4501925852154349
Lemma: often
Max TF Term Weight (Un-normalized):   0.3006837595771288
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: other
Max TF Term Weight (Un-normalized):   0.14797856122412167
Lemma: over
Max TF Term Weight (Un-normalized):   0.1083613521503533
Lemma: paper
Max TF Term Weight (Un-normalized):   0.17943960694479952
Lemma: part
Max TF Term Weight (Un-normalized):   0.23020106643192728
Lemma: particular
Max TF Term Weight (Un-normalized):   0.20522448304420168
Lemma: pearcey
Max TF Term Weight (Un-normalized):   0.3670112980988547
Lemma: performance
Max TF Term Weight (Un-normalized):   0.2836075346657356
Lemma: physical
Max TF Term Weight (Un-normalized):   0.2167227043007066
Lemma: point
Max TF Term Weight (Un-normalized):   0.14797856122412167
Lemma: practical
Max TF Term Weight (Un-normalized):   0.27277201463712025
Lemma: present
Max TF Term Weight (Un-normalized):   0.06421296356255321
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.06941671567565845
Lemma: problem
Max TF Term Weight (Un-normalized):   0.11449184364015992
Lemma: process
Max TF Term Weight (Un-normalized):   0.19824522999096786
Lemma: produce
Max TF Term Weight (Un-normalized):   0.19075655327892402
Lemma: progress
Max TF Term Weight (Un-normalized):   0.34773829259129446
Lemma: promise
Max TF Term Weight (Un-normalized):   0.3395672246293009
Lemma: provide
Max TF Term Weight (Un-normalized):   0.16144715622014466
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.1946049546137098
Lemma: reader
Max TF Term Weight (Un-normalized):   0.3670112980988547
Lemma: readily
Max TF Term Weight (Un-normalized):   0.31006009264529266
Lemma: reattach
Max TF Term Weight (Un-normalized):   0.41367999227114777
Lemma: recovery
Max TF Term Weight (Un-normalized):   0.3279000865335618
Lemma: reduction
Max TF Term Weight (Un-normalized):   0.2167227043007066
Lemma: region
Max TF Term Weight (Un-normalized):   0.14000608251687907
Lemma: relation
Max TF Term Weight (Un-normalized):   0.1866747766891721
Lemma: relative
Max TF Term Weight (Un-normalized):   0.23937694044094113
Lemma: relevant
Max TF Term Weight (Un-normalized):   0.34773829259129446
Lemma: remains
Max TF Term Weight (Un-normalized):   0.28887102931852005
Lemma: repercussion
Max TF Term Weight (Un-normalized):   0.4877443751081735
Lemma: require
Max TF Term Weight (Un-normalized):   0.16144715622014466
Lemma: respects
Max TF Term Weight (Un-normalized):   0.35672878681758563
Lemma: review
Max TF Term Weight (Un-normalized):   0.23120587247894756
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.16070962038932626
Lemma: roar
Max TF Term Weight (Un-normalized):   0.4877443751081735
Lemma: scale
Max TF Term Weight (Un-normalized):   0.3300686738074233
Lemma: scarce
Max TF Term Weight (Un-normalized):   0.44107568093588045
Lemma: section
Max TF Term Weight (Un-normalized):   0.15503004632264633
Lemma: separate
Max TF Term Weight (Un-normalized):   0.3049002496942741
Lemma: separation
Max TF Term Weight (Un-normalized):   0.29328388871988825
Lemma: serious
Max TF Term Weight (Un-normalized):   0.4265514487728646
Lemma: shape
Max TF Term Weight (Un-normalized):   0.13101558829058785
Lemma: shock
Max TF Term Weight (Un-normalized):   0.19175779949933194
Lemma: show
Max TF Term Weight (Un-normalized):   0.10177513930682083
Lemma: simple
Max TF Term Weight (Un-normalized):   0.13101558829058785
Lemma: small
Max TF Term Weight (Un-normalized):   0.1083613521503533
Lemma: so
Max TF Term Weight (Un-normalized):   0.17768428246288087
Lemma: source
Max TF Term Weight (Un-normalized):   0.2500299560156768
Lemma: specific
Max TF Term Weight (Un-normalized):   0.2167227043007066
Lemma: speed
Max TF Term Weight (Un-normalized):   0.11449184364015992
Lemma: state
Max TF Term Weight (Un-normalized):   0.19824522999096786
Lemma: steady
Max TF Term Weight (Un-normalized):   0.17269468950893282
Lemma: still
Max TF Term Weight (Un-normalized):   0.2756668707156477
Lemma: straight
Max TF Term Weight (Un-normalized):   0.2633913984729996
Lemma: strength
Max TF Term Weight (Un-normalized):   0.25144225979336804
Lemma: subject
Max TF Term Weight (Un-normalized):   0.17768428246288087
Lemma: subsonic
Max TF Term Weight (Un-normalized):   0.20522448304420168
Lemma: substantial
Max TF Term Weight (Un-normalized):   0.3006837595771288
Lemma: such
Max TF Term Weight (Un-normalized):   0.16070962038932626
Lemma: sufficiently
Max TF Term Weight (Un-normalized):   0.2647246834996324
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.16118062238211933
Lemma: surface
Max TF Term Weight (Un-normalized):   0.1471436629818086
Lemma: sweptback
Max TF Term Weight (Un-normalized):   0.305174002699656
Lemma: than
Max TF Term Weight (Un-normalized):   0.1083613521503533
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.0739681302207084
Lemma: therefore
Max TF Term Weight (Un-normalized):   0.24311838592536003
Lemma: these
Max TF Term Weight (Un-normalized):   0.09073263940404175
Lemma: this
Max TF Term Weight (Un-normalized):   0.40007369720414937
Lemma: thus
Max TF Term Weight (Un-normalized):   0.1946049546137098
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: trace
Max TF Term Weight (Un-normalized):   0.32615278831355765
Lemma: trail
Max TF Term Weight (Un-normalized):   0.34390403667952185
Lemma: transition
Max TF Term Weight (Un-normalized):   0.1866747766891721
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.2081158503924377
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.2856991980798099
Lemma: two
Max TF Term Weight (Un-normalized):   0.09073263940404175
Lemma: type
Max TF Term Weight (Un-normalized):   0.13101558829058785
Lemma: under
Max TF Term Weight (Un-normalized):   0.13101558829058785
Lemma: underlie
Max TF Term Weight (Un-normalized):   0.35672878681758563
Lemma: understand
Max TF Term Weight (Un-normalized):   0.2789518487320046
Lemma: unsteady
Max TF Term Weight (Un-normalized):   0.23334347086146512
Lemma: use
Max TF Term Weight (Un-normalized):   0.046668694172293024
Lemma: wave
Max TF Term Weight (Un-normalized):   0.19018042551336345
Lemma: well
Max TF Term Weight (Un-normalized):   0.14000608251687907
Lemma: wing
Max TF Term Weight (Un-normalized):   0.16598810286937404
Lemma: work
Max TF Term Weight (Un-normalized):   0.20522448304420168
Lemma: would
Max TF Term Weight (Un-normalized):   0.20498371851129626
Lemma: write
Max TF Term Weight (Un-normalized):   0.2966986501879698
 ***************************** 
Processing Query:  is it possible to relate the available pressure distributions for an ogive forebody at zero angle of attack to the lower surface pressures of an equivalent ogive forebody at angle of attack  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.2430923793551609
Doc#: 492  Document Headline:  prediction of ogive-forebody pressures at angles of attack .
Document Vector: 
Lemma: aerodynamicist
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: angle
Max TF Term Weight (Un-normalized):   0.23762117335365246
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: arbitrary
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.3295455913238786
Lemma: be
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: body
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: calif
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: center
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: earl
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: edward
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: flight
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: forebody
Max TF Term Weight (Un-normalized):   0.5287209185261821
Lemma: keener
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: lower
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: method
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: not
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.4866266646533506
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: prediction
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.09192441797022612
Lemma: research
Max TF Term Weight (Un-normalized):   0.2240198079156675
Lemma: suggest
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: surface
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: utilize
Max TF Term Weight (Un-normalized):   0.28616090651285647
Lemma: various
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: zero
Max TF Term Weight (Un-normalized):   0.17518606223180538

Rank#: 2
Cosine Similarity: 0.1272363742765784
Doc#: 56  Document Headline:  an analysis of the applicability of the hypersonic similarity law to the study of the flow about bodies of revolution at zero angle of attack .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: along
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: also
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: angle
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: applicability
Max TF Term Weight (Un-normalized):   0.41518713072321317
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: assumption
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.2341200344635083
Lemma: attention
Max TF Term Weight (Un-normalized):   0.2636317064153084
Lemma: be
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: body
Max TF Term Weight (Un-normalized):   0.15046594683079464
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: chart
Max TF Term Weight (Un-normalized):   0.277478311244903
Lemma: combination
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: compare
Max TF Term Weight (Un-normalized):   0.19447441509655372
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: cone
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: cylinder
Max TF Term Weight (Un-normalized):   0.21120565821874457
Lemma: define
Max TF Term Weight (Un-normalized):   0.24404258942178847
Lemma: demonstrate
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: derivation
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: derive
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: determination
Max TF Term Weight (Un-normalized):   0.23032739778110356
Lemma: determine
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.177135514984982
Lemma: ehretdm
Max TF Term Weight (Un-normalized):   0.474785314149417
Lemma: exist
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: expect
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: fineness
Max TF Term Weight (Un-normalized):   0.5482188804519504
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: free
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: from
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: give
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: have
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.22569892024619198
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: law
Max TF Term Weight (Un-normalized):   0.41630740506439307
Lemma: limit
Max TF Term Weight (Un-normalized):   0.2669363880568726
Lemma: mach
Max TF Term Weight (Un-normalized):   0.14037657439856346
Lemma: make
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: method
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: might
Max TF Term Weight (Un-normalized):   0.3284972194217488
Lemma: naca
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: number
Max TF Term Weight (Un-normalized):   0.088567757492491
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.4478682124586712
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: particular
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: present
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.093496304984789
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: range
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: rapid
Max TF Term Weight (Un-normalized):   0.27259054799799826
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.186992609969578
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.2723216727794314
Lemma: shape
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: significant
Max TF Term Weight (Un-normalized):   0.23032739778110356
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.39731552472289317
Lemma: similarly
Max TF Term Weight (Un-normalized):   0.4245499201314995
Lemma: since
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: single
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: stream
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: study
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: than
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: these
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: tn
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tsien
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: value
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: various
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: vary
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: wider
Max TF Term Weight (Un-normalized):   0.35107932890698595
Lemma: within
Max TF Term Weight (Un-normalized):   0.24166140487300822
Lemma: zero
Max TF Term Weight (Un-normalized):   0.216942274822645

Rank#: 3
Cosine Similarity: 0.125949100042149
Doc#: 434  Document Headline:  contributions of the wing panels to the forces and moments of supersonic wing-body combinations at combined angles .
Document Vector: 
Lemma: adjacent
Max TF Term Weight (Un-normalized):   0.2967349764911252
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: angle
Max TF Term Weight (Un-normalized):   0.22894433189105445
Lemma: aspect
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: base
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: be
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: because
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: between
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: body
Max TF Term Weight (Un-normalized):   0.16529485805172772
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: cause
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: change
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: chord
Max TF Term Weight (Un-normalized):   0.2534071261676378
Lemma: combination
Max TF Term Weight (Un-normalized):   0.32515150146591976
Lemma: combine
Max TF Term Weight (Un-normalized):   0.4014996395038016
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: contribute
Max TF Term Weight (Un-normalized):   0.3655189764223369
Lemma: contribution
Max TF Term Weight (Un-normalized):   0.4042335000035687
Lemma: coupling
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: cross
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: crossflow
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: cruciform
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: cylinder
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: dependence
Max TF Term Weight (Un-normalized):   0.32366380514913956
Lemma: determine
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: due
Max TF Term Weight (Un-normalized):   0.23848288336231285
Lemma: each
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: effect
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: expose
Max TF Term Weight (Un-normalized):   0.35107932890698595
Lemma: find
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: force
Max TF Term Weight (Un-normalized):   0.22569892024619198
Lemma: forebody
Max TF Term Weight (Un-normalized):   0.65993705877812
Lemma: general
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: good
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: increase
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: indicate
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: large
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: length
Max TF Term Weight (Un-normalized):   0.2783950829401892
Lemma: mach
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: mean
Max TF Term Weight (Un-normalized):   0.23032739778110356
Lemma: measurement
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: method
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: million
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: moment
Max TF Term Weight (Un-normalized):   0.3146680956970293
Lemma: naca
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: normal
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: number
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: occur
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.34451337745762345
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: panel
Max TF Term Weight (Un-normalized):   0.4587761396540071
Lemma: pitch
Max TF Term Weight (Un-normalized):   0.2868452616139697
Lemma: presence
Max TF Term Weight (Un-normalized):   0.28224840687184
Lemma: primarily
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: range
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: result
Max TF Term Weight (Un-normalized):   0.07523297341539732
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: roll
Max TF Term Weight (Un-normalized):   0.3740683295729896
Lemma: roughness
Max TF Term Weight (Un-normalized):   0.28774434093827134
Lemma: separation
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: show
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: sideslip
Max TF Term Weight (Un-normalized):   0.3655189764223369
Lemma: sidewash
Max TF Term Weight (Un-normalized):   0.4245499201314995
Lemma: slender
Max TF Term Weight (Un-normalized):   0.19626418845529023
Lemma: spahrjr
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: strength
Max TF Term Weight (Un-normalized):   0.22064979638505489
Lemma: strip
Max TF Term Weight (Un-normalized):   0.33866025032064434
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: theory
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: these
Max TF Term Weight (Un-normalized):   0.11924144168115643
Lemma: tn
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: triangular
Max TF Term Weight (Un-normalized):   0.3109482756171199
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.18333749124885151
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: vortex
Max TF Term Weight (Un-normalized):   0.3858912128538697
Lemma: wide
Max TF Term Weight (Un-normalized):   0.24404258942178847
Lemma: wind
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: wing
Max TF Term Weight (Un-normalized):   0.24168444234166808
Lemma: yield
Max TF Term Weight (Un-normalized):   0.20947782547261967

Rank#: 4
Cosine Similarity: 0.12231662090397673
Doc#: 57  Document Headline:  applicability of the hypersonic similarity rule to pressure distributions which include the effects of rotation for bodies of revolution at zero angle of attack .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: accuracy
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: although
Max TF Term Weight (Un-normalized):   0.22861075378373358
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: angle
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: applicability
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: between
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: body
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: chart
Max TF Term Weight (Un-normalized):   0.2831629163384759
Lemma: cylinder
Max TF Term Weight (Un-normalized):   0.22013241726072352
Lemma: depend
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: determination
Max TF Term Weight (Un-normalized):   0.23504603792541467
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.18578953293242295
Lemma: divide
Max TF Term Weight (Un-normalized):   0.3098631426519673
Lemma: drag
Max TF Term Weight (Un-normalized):   0.26048151437791756
Lemma: due
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: effect
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: engineering
Max TF Term Weight (Un-normalized):   0.30030675778276167
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: error
Max TF Term Weight (Un-normalized):   0.42282643337572506
Lemma: extend
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: find
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: fineness
Max TF Term Weight (Un-normalized):   0.4186294131011758
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.20289561155684308
Lemma: ignore
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: include
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: influence
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: into
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: introduce
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: mach
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: most
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: naca
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: neglect
Max TF Term Weight (Un-normalized):   0.25397464290667315
Lemma: negligible
Max TF Term Weight (Un-normalized):   0.28153737592350603
Lemma: note
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: number
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.5377531434034183
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: over
Max TF Term Weight (Un-normalized):   0.15703634026772897
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.21438795725232157
Lemma: percent
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: present
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.09289476646621148
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: rapid
Max TF Term Weight (Un-normalized):   0.2781750191253347
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: related
Max TF Term Weight (Un-normalized):   0.2585985929662403
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: rossowvj
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: rotation
Max TF Term Weight (Un-normalized):   0.5905833087657916
Lemma: rotational
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: rule
Max TF Term Weight (Un-normalized):   0.43574832027213745
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.4156683932856783
Lemma: sufficient
Max TF Term Weight (Un-normalized):   0.3142149337600577
Lemma: technical
Max TF Term Weight (Un-normalized):   0.3302945969652685
Lemma: term
Max TF Term Weight (Un-normalized):   0.23523824743119529
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: tn
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: upon
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: value
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: zero
Max TF Term Weight (Un-normalized):   0.17029714787276554

Rank#: 5
Cosine Similarity: 0.1185474538273223
Doc#: 124  Document Headline:  a summary of the supersonic pressure drag of bodies of revolution .
Document Vector: 
Lemma: additional
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: amount
Max TF Term Weight (Un-normalized):   0.32653066024597516
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: analyze
Max TF Term Weight (Un-normalized):   0.2240213044582042
Lemma: angle
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: appraise
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.18333749124885151
Lemma: assumption
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: available
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: basis
Max TF Term Weight (Un-normalized):   0.32515150146591976
Lemma: boattail
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: body
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: boundarylayer
Max TF Term Weight (Un-normalized):   0.2849565220911584
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: combination
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.216942274822645
Lemma: complete
Max TF Term Weight (Un-normalized):   0.22064979638505489
Lemma: conical
Max TF Term Weight (Un-normalized):   0.2912282301510829
Lemma: consistently
Max TF Term Weight (Un-normalized):   0.3950604896069551
Lemma: correlation
Max TF Term Weight (Un-normalized):   0.23032739778110356
Lemma: critical
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: curve
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: datum
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: design
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: develop
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: drag
Max TF Term Weight (Un-normalized):   0.216942274822645
Lemma: effect
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: equivalent
Max TF Term Weight (Un-normalized):   0.25971321949053716
Lemma: evaluate
Max TF Term Weight (Un-normalized):   0.24404258942178847
Lemma: exact
Max TF Term Weight (Un-normalized):   0.24166140487300822
Lemma: except
Max TF Term Weight (Un-normalized):   0.23612844129828678
Lemma: expansion
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: fineness
Max TF Term Weight (Un-normalized):   0.3109482756171199
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: from
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: give
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: good
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: growth
Max TF Term Weight (Un-normalized):   0.29173476271145626
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.22569892024619198
Lemma: inadequate
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: include
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.20094157607166993
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.2669363880568726
Lemma: jaerosc
Max TF Term Weight (Un-normalized):   0.3950604896069551
Lemma: layer
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: limited
Max TF Term Weight (Un-normalized):   0.33497363402230146
Lemma: mach
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: make
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: manner
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: morrisdn
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: most
Max TF Term Weight (Un-normalized):   0.19626418845529023
Lemma: nearly
Max TF Term Weight (Un-normalized):   0.27588540418264135
Lemma: nose
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: not
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: number
Max TF Term Weight (Un-normalized):   0.07523297341539732
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.4478682124586712
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: or
Max TF Term Weight (Un-normalized):   0.30790694740356045
Lemma: order
Max TF Term Weight (Un-normalized):   0.21120565821874457
Lemma: other
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: over
Max TF Term Weight (Un-normalized):   0.17468555463512508
Lemma: present
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: provide
Max TF Term Weight (Un-normalized):   0.26026332699732474
Lemma: range
Max TF Term Weight (Un-normalized):   0.15046594683079464
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: region
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: result
Max TF Term Weight (Un-normalized):   0.07523297341539732
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.2723216727794314
Lemma: same
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: second
Max TF Term Weight (Un-normalized):   0.2783950829401892
Lemma: separation
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: shape
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: shock
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: so
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: solution
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: sound
Max TF Term Weight (Un-normalized):   0.2636317064153084
Lemma: speed
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: summary
Max TF Term Weight (Un-normalized):   0.4270471688088783
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.21709169731233893
Lemma: test
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.14037657439856346
Lemma: these
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: throughout
Max TF Term Weight (Un-normalized):   0.2835213394737957
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.2912282301510829
Lemma: use
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: very
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: viscous
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: zero
Max TF Term Weight (Un-normalized):   0.16687836674585665
 ***************************** 
Processing Query:  what methods -dash exact or approximate -dash are presently available for predicting body pressures at angle of attack 
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.10658478806790544
Doc#: 122  Document Headline:  a simplified approximate method for the calculation of the pressure around conical bodies of arbitrary shape in supersonic and hypersonic flow .
Document Vector: 
Lemma: abbreviated
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: aircraft
Max TF Term Weight (Un-normalized):   0.20377241949759098
Lemma: angle
Max TF Term Weight (Un-normalized):   0.20052064322737606
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.20758418124196085
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.19933783549043507
Lemma: arbitrarily
Max TF Term Weight (Un-normalized):   0.3483878604875331
Lemma: arbitrary
Max TF Term Weight (Un-normalized):   0.19546866615309316
Lemma: around
Max TF Term Weight (Un-normalized):   0.22693209380551274
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.2780926169683625
Lemma: available
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: base
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: body
Max TF Term Weight (Un-normalized):   0.1883784836692954
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: certain
Max TF Term Weight (Un-normalized):   0.21522556928607608
Lemma: circular
Max TF Term Weight (Un-normalized):   0.20667090556083137
Lemma: complicate
Max TF Term Weight (Un-normalized):   0.3351300994052123
Lemma: component
Max TF Term Weight (Un-normalized):   0.22105365545283537
Lemma: cone
Max TF Term Weight (Un-normalized):   0.3145278869300295
Lemma: conical
Max TF Term Weight (Un-normalized):   0.345926912420657
Lemma: consider
Max TF Term Weight (Un-normalized):   0.1444567637559832
Lemma: considerably
Max TF Term Weight (Un-normalized):   0.25645134778023415
Lemma: corporation
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: determine
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: develop
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: deviate
Max TF Term Weight (Un-normalized):   0.39725502702580645
Lemma: division
Max TF Term Weight (Un-normalized):   0.364119574313743
Lemma: do
Max TF Term Weight (Un-normalized):   0.18605464704650349
Lemma: due
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: element
Max TF Term Weight (Un-normalized):   0.4027737927846117
Lemma: equivalent
Max TF Term Weight (Un-normalized):   0.3216424471601616
Lemma: especially
Max TF Term Weight (Un-normalized):   0.2995206939492599
Lemma: exact
Max TF Term Weight (Un-normalized):   0.18083000397124185
Lemma: exist
Max TF Term Weight (Un-normalized):   0.18083000397124185
Lemma: fact
Max TF Term Weight (Un-normalized):   0.26837129986207403
Lemma: feel
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: form
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: free
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: from
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: further
Max TF Term Weight (Un-normalized):   0.20758418124196085
Lemma: generally
Max TF Term Weight (Un-normalized):   0.23978583992068853
Lemma: georgium
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: give
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: great
Max TF Term Weight (Un-normalized):   0.3062401015439473
Lemma: have
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: high
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: however
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: incidence
Max TF Term Weight (Un-normalized):   0.22693209380551274
Lemma: inconsistent
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: independent
Max TF Term Weight (Un-normalized):   0.23492181358477676
Lemma: information
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: jacob
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: limited
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: local
Max TF Term Weight (Un-normalized):   0.22303536538492896
Lemma: lockheed
Max TF Term Weight (Un-normalized):   0.5257848465342446
Lemma: lower
Max TF Term Weight (Un-normalized):   0.20377241949759098
Lemma: mach
Max TF Term Weight (Un-normalized):   0.11254116526017925
Lemma: mainly
Max TF Term Weight (Un-normalized):   0.2953724140536493
Lemma: manner
Max TF Term Weight (Un-normalized):   0.22105365545283537
Lemma: method
Max TF Term Weight (Un-normalized):   0.14928641627927297
Lemma: need
Max TF Term Weight (Un-normalized):   0.2600675465175763
Lemma: newtonian
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: nonaxisymmetric
Max TF Term Weight (Un-normalized):   0.4331676605570754
Lemma: normal
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: not
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: number
Max TF Term Weight (Un-normalized):   0.07100556966424955
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.19933783549043507
Lemma: other
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: present
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.06221414180484812
Lemma: quite
Max TF Term Weight (Un-normalized):   0.34364366680199526
Lemma: range
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: recently
Max TF Term Weight (Un-normalized):   0.2545712251915582
Lemma: relatively
Max TF Term Weight (Un-normalized):   0.23978583992068853
Lemma: respect
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: result
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: same
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: satisfactory
Max TF Term Weight (Un-normalized):   0.23492181358477676
Lemma: shape
Max TF Term Weight (Un-normalized):   0.19933783549043507
Lemma: simple
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: simplify
Max TF Term Weight (Un-normalized):   0.22105365545283537
Lemma: solution
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: stream
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: such
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: surface
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: symmetric
Max TF Term Weight (Un-normalized):   0.22693209380551274
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.11254116526017925
Lemma: therefore
Max TF Term Weight (Un-normalized):   0.2545712251915582
Lemma: these
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: utilize
Max TF Term Weight (Un-normalized):   0.2651661834487901
Lemma: well
Max TF Term Weight (Un-normalized):   0.18664242541454437
Lemma: willus
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: work
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: zero
Max TF Term Weight (Un-normalized):   0.23587539676115246

Rank#: 2
Cosine Similarity: 0.09651815809285125
Doc#: 69  Document Headline:  predicted shock envelopes about two types of vehicles at large angles of attack .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.18986666458933038
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: angle
Max TF Term Weight (Un-normalized):   0.20269401611500154
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: atmosphere
Max TF Term Weight (Un-normalized):   0.22861075378373358
Lemma: attack
Max TF Term Weight (Un-normalized):   0.28110676525873335
Lemma: available
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: base
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: be
Max TF Term Weight (Un-normalized):   0.13704393097126094
Lemma: between
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: body
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: capable
Max TF Term Weight (Un-normalized):   0.4544185110361619
Lemma: capsule
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: choose
Max TF Term Weight (Un-normalized):   0.2907943307820745
Lemma: compare
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: consider
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: continuity
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: datum
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: depend
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: develop
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: drag
Max TF Term Weight (Un-normalized):   0.22466821078667673
Lemma: effect
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: element
Max TF Term Weight (Un-normalized):   0.2907943307820745
Lemma: entry
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: envelope
Max TF Term Weight (Un-normalized):   0.616652455380387
Lemma: essentially
Max TF Term Weight (Un-normalized):   0.2650338771079214
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: find
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: good
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: high
Max TF Term Weight (Un-normalized):   0.2235090245674224
Lemma: important
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: kaattarige
Max TF Term Weight (Un-normalized):   0.4544185110361619
Lemma: large
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: lift
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: mass
Max TF Term Weight (Un-normalized):   0.22156169755849245
Lemma: measure
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: method
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: most
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: no
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: normal
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: number
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: oblique
Max TF Term Weight (Un-normalized):   0.3302945969652685
Lemma: occur
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: other
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: predict
Max TF Term Weight (Un-normalized):   0.26048151437791756
Lemma: provide
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: range
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: realga
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: relationship
Max TF Term Weight (Un-normalized):   0.2907943307820745
Lemma: shape
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: shock
Max TF Term Weight (Un-normalized):   0.21569496812589684
Lemma: slender
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: speed
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: suitably
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: through
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: tnd
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: triangular
Max TF Term Weight (Un-normalized):   0.3173185686446376
Lemma: two
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: type
Max TF Term Weight (Un-normalized):   0.24273820609335534
Lemma: vehicle
Max TF Term Weight (Un-normalized):   0.34441368423199337
Lemma: volume
Max TF Term Weight (Un-normalized):   0.30030675778276167
Lemma: wing
Max TF Term Weight (Un-normalized):   0.1325169385539607

Rank#: 3
Cosine Similarity: 0.09265205685851989
Doc#: 492  Document Headline:  prediction of ogive-forebody pressures at angles of attack .
Document Vector: 
Lemma: aerodynamicist
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: angle
Max TF Term Weight (Un-normalized):   0.23762117335365246
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: arbitrary
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.3295455913238786
Lemma: be
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: body
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: calif
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: center
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: earl
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: edward
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: flight
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: forebody
Max TF Term Weight (Un-normalized):   0.5287209185261821
Lemma: keener
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: lower
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: method
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: not
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.4866266646533506
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: prediction
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.09192441797022612
Lemma: research
Max TF Term Weight (Un-normalized):   0.2240198079156675
Lemma: suggest
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: surface
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: utilize
Max TF Term Weight (Un-normalized):   0.28616090651285647
Lemma: various
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: zero
Max TF Term Weight (Un-normalized):   0.17518606223180538

Rank#: 4
Cosine Similarity: 0.08879735997265242
Doc#: 248  Document Headline:  the application of lighthill formula for numerical calculation of pressure distributions on bodies of revolution at supersonic speed and zero angle of attack .
Document Vector: 
Lemma: angle
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: application
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: apply
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.2732414228721939
Lemma: base
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: body
Max TF Term Weight (Un-normalized):   0.18030570170964455
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: computing
Max TF Term Weight (Un-normalized):   0.4464880907247816
Lemma: could
Max TF Term Weight (Un-normalized):   0.2455555343226533
Lemma: determine
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: develop
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: digital
Max TF Term Weight (Un-normalized):   0.4717807981136198
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.1524375347397515
Lemma: drag
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: duct
Max TF Term Weight (Un-normalized):   0.377630005715336
Lemma: exact
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: expect
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: expression
Max TF Term Weight (Un-normalized):   0.29777838544624097
Lemma: external
Max TF Term Weight (Un-normalized):   0.23390920626927075
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: formulum
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: from
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: give
Max TF Term Weight (Un-normalized):   0.09015285085482228
Lemma: good
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: integral
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: lighthill
Max TF Term Weight (Un-normalized):   0.4910732114873483
Lemma: linearize
Max TF Term Weight (Un-normalized):   0.36241166439732697
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: method
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: much
Max TF Term Weight (Un-normalized):   0.241859937297283
Lemma: number
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.22865630210962726
Lemma: ohmanl
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: pointed
Max TF Term Weight (Un-normalized):   0.29879353585070145
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: procedure
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: range
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.37593062673082334
Lemma: saab
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: slender
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: speed
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: surface
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: than
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: theory
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: tn
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: various
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: wave
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: wider
Max TF Term Weight (Un-normalized):   0.3848271145813172
Lemma: zero
Max TF Term Weight (Un-normalized):   0.2531932646836744

Rank#: 5
Cosine Similarity: 0.0875873660613398
Doc#: 232  Document Headline:  accuracy of approximate methods for predicting pressure on pointed non-lifting bodies of revolution in supersonic flow .
Document Vector: 
Lemma: accuracy
Max TF Term Weight (Un-normalized):   0.3238298342778317
Lemma: accurate
Max TF Term Weight (Un-normalized):   0.30405605959796844
Lemma: although
Max TF Term Weight (Un-normalized):   0.21245030934118853
Lemma: angle
Max TF Term Weight (Un-normalized):   0.17375102183034616
Lemma: applicability
Max TF Term Weight (Un-normalized):   0.3028780359337672
Lemma: application
Max TF Term Weight (Un-normalized):   0.1510173503569898
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: appreciably
Max TF Term Weight (Un-normalized):   0.3069461437731693
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.1707900148242449
Lemma: body
Max TF Term Weight (Un-normalized):   0.14604454065282194
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: compare
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: cone
Max TF Term Weight (Un-normalized):   0.2526155508318662
Lemma: conical
Max TF Term Weight (Un-normalized):   0.2997454703132528
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.11888488394092006
Lemma: drag
Max TF Term Weight (Un-normalized):   0.19746351801038292
Lemma: ehretdm
Max TF Term Weight (Un-normalized):   0.4502620280050913
Lemma: engineering
Max TF Term Weight (Un-normalized):   0.2790781384175494
Lemma: except
Max TF Term Weight (Un-normalized):   0.22393209663428743
Lemma: expansion
Max TF Term Weight (Un-normalized):   0.28028597310575276
Lemma: extend
Max TF Term Weight (Un-normalized):   0.18612688489948087
Lemma: find
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: fineness
Max TF Term Weight (Un-normalized):   0.36793828714855376
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: general
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: give
Max TF Term Weight (Un-normalized):   0.05944244197046003
Lemma: good
Max TF Term Weight (Un-normalized):   0.22328695320438485
Lemma: greater
Max TF Term Weight (Un-normalized):   0.20589954936673602
Lemma: highest
Max TF Term Weight (Un-normalized):   0.32671880824042443
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.20164821166481858
Lemma: integrate
Max TF Term Weight (Un-normalized):   0.25354021918961106
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.2130699025508133
Lemma: less
Max TF Term Weight (Un-normalized):   0.242968772747435
Lemma: lifting
Max TF Term Weight (Un-normalized):   0.2500147819223472
Lemma: linearize
Max TF Term Weight (Un-normalized):   0.28264212442341763
Lemma: low
Max TF Term Weight (Un-normalized):   0.1510173503569898
Lemma: maccoll
Max TF Term Weight (Un-normalized):   0.40262135818221634
Lemma: mach
Max TF Term Weight (Un-normalized):   0.09421404147447256
Lemma: maximum
Max TF Term Weight (Un-normalized):   0.1707900148242449
Lemma: method
Max TF Term Weight (Un-normalized):   0.12308570148565784
Lemma: modify
Max TF Term Weight (Un-normalized):   0.19865802017986475
Lemma: naca
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: newtonian
Max TF Term Weight (Un-normalized):   0.29448952669043904
Lemma: non
Max TF Term Weight (Un-normalized):   0.221236419441972
Lemma: not
Max TF Term Weight (Un-normalized):   0.110618209720986
Lemma: number
Max TF Term Weight (Un-normalized):   0.05944244197046003
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.09421404147447256
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.40765513733738845
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: optimum
Max TF Term Weight (Un-normalized):   0.268877089264847
Lemma: order
Max TF Term Weight (Un-normalized):   0.1886993665137807
Lemma: over
Max TF Term Weight (Un-normalized):   0.110618209720986
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.2130699025508133
Lemma: pointed
Max TF Term Weight (Un-normalized):   0.322550427797732
Lemma: predict
Max TF Term Weight (Un-normalized):   0.22328695320438485
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.07765843130651606
Lemma: range
Max TF Term Weight (Un-normalized):   0.13443214110987906
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.13443214110987906
Lemma: result
Max TF Term Weight (Un-normalized):   0.047640669822875
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.24787052491940512
Lemma: second
Max TF Term Weight (Un-normalized):   0.24872901717887222
Lemma: shape
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: shock
Max TF Term Weight (Un-normalized):   0.15607088264944527
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.3231315076236597
Lemma: standard
Max TF Term Weight (Un-normalized):   0.2920031484612304
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.110618209720986
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: tangent
Max TF Term Weight (Un-normalized):   0.4642428810954377
Lemma: taylor
Max TF Term Weight (Un-normalized):   0.2948873880711258
Lemma: than
Max TF Term Weight (Un-normalized):   0.15607088264944527
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.150095032593738
Lemma: these
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: three
Max TF Term Weight (Un-normalized):   0.15825887954386103
Lemma: tn
Max TF Term Weight (Un-normalized):   0.15825887954386103
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: value
Max TF Term Weight (Un-normalized):   0.13443214110987906
Lemma: wide
Max TF Term Weight (Un-normalized):   0.23143746859467443
Lemma: widely
Max TF Term Weight (Un-normalized):   0.3872844881069803
Lemma: within
Max TF Term Weight (Un-normalized):   0.1762914268114124
Lemma: zero
Max TF Term Weight (Un-normalized):   0.15825887954386103
 ***************************** 
Processing Query:  papers on internal /slip flow/ heat transfer studies  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.1044910280420149
Doc#: 550  Document Headline:  laminar heat transfer in tubes under slip-flow conditions .
Document Vector: 
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: analytically
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: asme
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: both
Max TF Term Weight (Un-normalized):   0.18986666458933038
Lemma: carry
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: case
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: continuum
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: creep
Max TF Term Weight (Un-normalized):   0.27282624724421944
Lemma: decrease
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: density
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: develop
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: effect
Max TF Term Weight (Un-normalized):   0.07841274914373175
Lemma: extension
Max TF Term Weight (Un-normalized):   0.24096592547540846
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: flux
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: free
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: fully
Max TF Term Weight (Un-normalized):   0.2831629163384759
Lemma: give
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: have
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: heat
Max TF Term Weight (Un-normalized):   0.18206876523418575
Lemma: include
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: increase
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: jump
Max TF Term Weight (Un-normalized):   0.516968292092301
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.15703634026772897
Lemma: linsh
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: low
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: lower
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: major
Max TF Term Weight (Un-normalized):   0.2764347244412529
Lemma: make
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: manifest
Max TF Term Weight (Un-normalized):   0.4167440331315116
Lemma: mean
Max TF Term Weight (Un-normalized):   0.23504603792541467
Lemma: modification
Max TF Term Weight (Un-normalized):   0.27282624724421944
Lemma: move
Max TF Term Weight (Un-normalized):   0.231898366652749
Lemma: number
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: nusselt
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: out
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: paper
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: path
Max TF Term Weight (Un-normalized):   0.28153737592350603
Lemma: phenomenon
Max TF Term Weight (Un-normalized):   0.22861075378373358
Lemma: rarefaction
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: regime
Max TF Term Weight (Un-normalized):   0.2831629163384759
Lemma: result
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: shear
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: slip
Max TF Term Weight (Un-normalized):   0.49851313050634677
Lemma: sparrowem
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: study
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.18206876523418575
Lemma: than
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: those
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: tube
Max TF Term Weight (Un-normalized):   0.33889426352164925
Lemma: under
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: uniform
Max TF Term Weight (Un-normalized):   0.23396783130083135
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: wa
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: wall
Max TF Term Weight (Un-normalized):   0.24273820609335534
Lemma: wherein
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: work
Max TF Term Weight (Un-normalized):   0.1837814882396877

Rank#: 2
Cosine Similarity: 0.09867553105197704
Doc#: 306  Document Headline:  second approximation to laminar compressible boundary layer on flat plate in slip flow .
Document Vector: 
Lemma: and
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: assumption
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: between
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.08264742902586386
Lemma: change
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: compressible
Max TF Term Weight (Un-normalized):   0.24166140487300822
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.19626418845529023
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: continuum
Max TF Term Weight (Un-normalized):   0.35107932890698595
Lemma: decrease
Max TF Term Weight (Un-normalized):   0.19626418845529023
Lemma: due
Max TF Term Weight (Un-normalized):   0.20701554073023642
Lemma: edge
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: effect
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: explicitly
Max TF Term Weight (Un-normalized):   0.35814234142147783
Lemma: find
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: first
Max TF Term Weight (Un-normalized):   0.2479422870775916
Lemma: flat
Max TF Term Weight (Un-normalized):   0.18333749124885151
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: friction
Max TF Term Weight (Un-normalized):   0.2669363880568726
Lemma: give
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: heat
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: increase
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.2612245281967801
Lemma: into
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: know
Max TF Term Weight (Un-normalized):   0.19626418845529023
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: law
Max TF Term Weight (Un-normalized):   0.23612844129828678
Lemma: layer
Max TF Term Weight (Un-normalized):   0.13099307578700747
Lemma: make
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: maslensh
Max TF Term Weight (Un-normalized):   0.44529588362487266
Lemma: naca
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: need
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: no
Max TF Term Weight (Un-normalized):   0.216942274822645
Lemma: number
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: order
Max TF Term Weight (Un-normalized):   0.24864112993214887
Lemma: outer
Max TF Term Weight (Un-normalized):   0.329429868467006
Lemma: over
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: plate
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: prandtl
Max TF Term Weight (Un-normalized):   0.2240213044582042
Lemma: regard
Max TF Term Weight (Un-normalized):   0.26913873592347315
Lemma: second
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: shear
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: skin
Max TF Term Weight (Un-normalized):   0.19626418845529023
Lemma: slip
Max TF Term Weight (Un-normalized):   0.4782975409504383
Lemma: solution
Max TF Term Weight (Un-normalized):   0.13099307578700747
Lemma: stream
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: subsonic
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: take
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: term
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: tn
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: viscosity
Max TF Term Weight (Un-normalized):   0.2240213044582042
Lemma: wall
Max TF Term Weight (Un-normalized):   0.18333749124885151
Lemma: well
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: zero
Max TF Term Weight (Un-normalized):   0.216942274822645

Rank#: 3
Cosine Similarity: 0.09501719319079088
Doc#: 21  Document Headline:  on heat transfer in slip flow .
Document Vector: 
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: author
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: cleveland
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: consider
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: effect
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: eg
Max TF Term Weight (Un-normalized):   0.3658393706105377
Lemma: flat
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: flight
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: friction
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: heat
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: impulsive
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: infinite
Max TF Term Weight (Un-normalized):   0.23798399737957068
Lemma: laboratory
Max TF Term Weight (Un-normalized):   0.27776609201412705
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: layer
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: lewi
Max TF Term Weight (Un-normalized):   0.4102958139934412
Lemma: maslen
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: motion
Max TF Term Weight (Un-normalized):   0.1904912222483514
Lemma: naca
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: number
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: ohio
Max TF Term Weight (Un-normalized):   0.44763337698537986
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: other
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: over
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: perturbation
Max TF Term Weight (Un-normalized):   0.32525886714534635
Lemma: plate
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: propulsion
Max TF Term Weight (Un-normalized):   0.35007422761089363
Lemma: reference
Max TF Term Weight (Un-normalized):   0.370269323354906
Lemma: skin
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: slip
Max TF Term Weight (Un-normalized):   0.48456477728187297
Lemma: stephen
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: studiesdash
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: usual
Max TF Term Weight (Un-normalized):   0.2889735183435726
Lemma: while
Max TF Term Weight (Un-normalized):   0.26750138156673225

Rank#: 4
Cosine Similarity: 0.09397307278002252
Doc#: 22  Document Headline:  on slip-flow heat transfer to a flat plate .
Document Vector: 
Lemma: account
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: aero
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: appropriate
Max TF Term Weight (Un-normalized):   0.26126578250618154
Lemma: assume
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: behavior
Max TF Term Weight (Un-normalized):   0.23517374330390606
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: confirm
Max TF Term Weight (Un-normalized):   0.3555197527697774
Lemma: continuum
Max TF Term Weight (Un-normalized):   0.36855708958289396
Lemma: energy
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: expression
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: find
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: flat
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: free
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: from
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: gas
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: gradient
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: heat
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: influence
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: into
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: jump
Max TF Term Weight (Un-normalized):   0.403108384017641
Lemma: june
Max TF Term Weight (Un-normalized):   0.3929490031854645
Lemma: knudsen
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: large
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: layer
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: maslen
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: mean
Max TF Term Weight (Un-normalized):   0.2417937724835268
Lemma: move
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: number
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: omanra
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: path
Max TF Term Weight (Un-normalized):   0.2896197903206467
Lemma: plate
Max TF Term Weight (Un-normalized):   0.18342303381616776
Lemma: rarefy
Max TF Term Weight (Un-normalized):   0.38371558518395665
Lemma: region
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: remains
Max TF Term Weight (Un-normalized):   0.32642819453100774
Lemma: result
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: scheuingra
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: sci
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: slip
Max TF Term Weight (Un-normalized):   0.5844142677399616
Lemma: small
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: take
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: then
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: through
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: valid
Max TF Term Weight (Un-normalized):   0.25619174666759414
Lemma: value
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: well
Max TF Term Weight (Un-normalized):   0.15820877866209093

Rank#: 5
Cosine Similarity: 0.08896495885323705
Doc#: 571  Document Headline:  heat transfer to flat plate in high temperature rarefied ultra-high mach number flow .
Document Vector: 
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.21464010698788905
Lemma: and
Max TF Term Weight (Un-normalized):   0.23492181358477676
Lemma: approximately
Max TF Term Weight (Un-normalized):   0.23687131902227823
Lemma: ars
Max TF Term Weight (Un-normalized):   0.27990724277112194
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: base
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: be
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: both
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: case
Max TF Term Weight (Un-normalized):   0.09860708177523271
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: compare
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: condition
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.18605464704650349
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: determine
Max TF Term Weight (Un-normalized):   0.1444567637559832
Lemma: drastically
Max TF Term Weight (Un-normalized):   0.4618539073902895
Lemma: edge
Max TF Term Weight (Un-normalized):   0.19933783549043507
Lemma: extent
Max TF Term Weight (Un-normalized):   0.27990724277112194
Lemma: extreme
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: find
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: flat
Max TF Term Weight (Un-normalized):   0.19933783549043507
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: free
Max TF Term Weight (Un-normalized):   0.21407404725261564
Lemma: from
Max TF Term Weight (Un-normalized):   0.06221414180484812
Lemma: gas
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: greater
Max TF Term Weight (Un-normalized):   0.21120037997930297
Lemma: heat
Max TF Term Weight (Un-normalized):   0.19229081449476398
Lemma: high
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: important
Max TF Term Weight (Un-normalized):   0.20377241949759098
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.19546866615309316
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: knudsen
Max TF Term Weight (Un-normalized):   0.6000830593484904
Lemma: lead
Max TF Term Weight (Un-normalized):   0.19933783549043507
Lemma: less
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: li
Max TF Term Weight (Un-normalized):   0.3735335934203326
Lemma: local
Max TF Term Weight (Un-normalized):   0.2545523045886784
Lemma: mach
Max TF Term Weight (Un-normalized):   0.1312589011168814
Lemma: magnitude
Max TF Term Weight (Un-normalized):   0.20758418124196085
Lemma: mean
Max TF Term Weight (Un-normalized):   0.22405412609447875
Lemma: measure
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: nagamatsu
Max TF Term Weight (Un-normalized):   0.39725502702580645
Lemma: nagamatsuht
Max TF Term Weight (Un-normalized):   0.4331676605570754
Lemma: no
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: noninsulated
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: number
Max TF Term Weight (Un-normalized):   0.0941892418346477
Lemma: of
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: order
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.19721416355046542
Lemma: path
Max TF Term Weight (Un-normalized):   0.26837129986207403
Lemma: perfect
Max TF Term Weight (Un-normalized):   0.27292129263275205
Lemma: phenomenon
Max TF Term Weight (Un-normalized):   0.21791978757399047
Lemma: physical
Max TF Term Weight (Un-normalized):   0.22693209380551274
Lemma: plate
Max TF Term Weight (Un-normalized):   0.18354673492442877
Lemma: predict
Max TF Term Weight (Un-normalized):   0.20667090556083137
Lemma: range
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: rarefy
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: rate
Max TF Term Weight (Un-normalized):   0.19721416355046542
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: region
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: sharp
Max TF Term Weight (Un-normalized):   0.22969717050951516
Lemma: sheetre
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: shock
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: slip
Max TF Term Weight (Un-normalized):   0.4514216017579987
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: stream
Max TF Term Weight (Un-normalized):   0.20052064322737606
Lemma: strong
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.16486982709690284
Lemma: than
Max TF Term Weight (Un-normalized):   0.1444567637559832
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: theory
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: these
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.21407404725261564
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: ultra
Max TF Term Weight (Un-normalized):   0.4618539073902895
Lemma: unity
Max TF Term Weight (Un-normalized):   0.2600675465175763
Lemma: value
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: vary
Max TF Term Weight (Un-normalized):   0.2250823305203585
Lemma: weilha
Max TF Term Weight (Un-normalized):   0.5107210739285628
 ***************************** 
Processing Query:  are real-gas transport properties for air available over a wide range of enthalpies and densities  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.14825754083239528
Doc#: 493  Document Headline:  real-gas laminar boundary layer skin friction and heat transfer .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: analogy
Max TF Term Weight (Un-normalized):   0.27021393187720183
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: assume
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: average
Max TF Term Weight (Un-normalized):   0.31093890516865574
Lemma: be
Max TF Term Weight (Un-normalized):   0.12009855991415672
Lemma: before
Max TF Term Weight (Un-normalized):   0.2994786144882915
Lemma: best
Max TF Term Weight (Un-normalized):   0.3117251180560525
Lemma: blunt
Max TF Term Weight (Un-normalized):   0.16072287894805923
Lemma: body
Max TF Term Weight (Un-normalized):   0.12223731744927563
Lemma: both
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.07577375481092581
Lemma: btu
Max TF Term Weight (Un-normalized):   0.3933142840381864
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.12223731744927563
Lemma: carry
Max TF Term Weight (Un-normalized):   0.2017510108845457
Lemma: case
Max TF Term Weight (Un-normalized):   0.1280285361992592
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.1796750898710851
Lemma: computation
Max TF Term Weight (Un-normalized):   0.24191203776418418
Lemma: compute
Max TF Term Weight (Un-normalized):   0.30279383354939526
Lemma: computing
Max TF Term Weight (Un-normalized):   0.44388121561185984
Lemma: condition
Max TF Term Weight (Un-normalized):   0.12223731744927563
Lemma: consider
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.24918290277783295
Lemma: diffusion
Max TF Term Weight (Un-normalized):   0.26253575285159114
Lemma: digital
Max TF Term Weight (Un-normalized):   0.2994786144882915
Lemma: each
Max TF Term Weight (Un-normalized):   0.18420899753729034
Lemma: effect
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: enthalpy
Max TF Term Weight (Un-normalized):   0.45205584752394423
Lemma: equation
Max TF Term Weight (Un-normalized):   0.09687078217292487
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: excellent
Max TF Term Weight (Un-normalized):   0.3163802466517528
Lemma: exception
Max TF Term Weight (Un-normalized):   0.3605075327748983
Lemma: extend
Max TF Term Weight (Un-normalized):   0.238783912987494
Lemma: factor
Max TF Term Weight (Un-normalized):   0.24982024644401796
Lemma: find
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: flat
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: free
Max TF Term Weight (Un-normalized):   0.20880554899357215
Lemma: friction
Max TF Term Weight (Un-normalized):   0.3097224071316734
Lemma: from
Max TF Term Weight (Un-normalized):   0.061118658724637814
Lemma: ft
Max TF Term Weight (Un-normalized):   0.32957120829773356
Lemma: gas
Max TF Term Weight (Un-normalized):   0.2560570723985184
Lemma: heat
Max TF Term Weight (Un-normalized):   0.16139214360235218
Lemma: high
Max TF Term Weight (Un-normalized):   0.15798944089756267
Lemma: if
Max TF Term Weight (Un-normalized):   0.17344911677152813
Lemma: integrate
Max TF Term Weight (Un-normalized):   0.2574876940537329
Lemma: johnson
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.14191313081456916
Lemma: layer
Max TF Term Weight (Un-normalized):   0.12009855991415672
Lemma: local
Max TF Term Weight (Un-normalized):   0.21910809962220051
Lemma: low
Max TF Term Weight (Un-normalized):   0.19374156434584974
Lemma: machine
Max TF Term Weight (Un-normalized):   0.42603305719431767
Lemma: method
Max TF Term Weight (Un-normalized):   0.09687078217292487
Lemma: neglect
Max TF Term Weight (Un-normalized):   0.23969594498589836
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.1101672769643373
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: out
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: over
Max TF Term Weight (Un-normalized):   0.14191313081456916
Lemma: percent
Max TF Term Weight (Un-normalized):   0.21251089165030795
Lemma: perfectga
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: plate
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: point
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: pr
Max TF Term Weight (Un-normalized):   0.4288706666748729
Lemma: present
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: range
Max TF Term Weight (Un-normalized):   0.15154750962185162
Lemma: rate
Max TF Term Weight (Un-normalized):   0.15336860333170887
Lemma: real
Max TF Term Weight (Un-normalized):   0.3771677953523133
Lemma: recovery
Max TF Term Weight (Un-normalized):   0.3500828154643205
Lemma: replace
Max TF Term Weight (Un-normalized):   0.2771305818629072
Lemma: result
Max TF Term Weight (Un-normalized):   0.07577375481092581
Lemma: review
Max TF Term Weight (Un-normalized):   0.23969594498589836
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: rubesin
Max TF Term Weight (Un-normalized):   0.3605075327748983
Lemma: sc
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: sec
Max TF Term Weight (Un-normalized):   0.37831377477956957
Lemma: skin
Max TF Term Weight (Un-normalized):   0.2960397700647518
Lemma: slender
Max TF Term Weight (Un-normalized):   0.1890247730610768
Lemma: slug
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: solution
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: speed
Max TF Term Weight (Un-normalized):   0.13901562581349564
Lemma: stream
Max TF Term Weight (Un-normalized):   0.20880554899357215
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: then
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: thermodynamic
Max TF Term Weight (Un-normalized):   0.2771305818629072
Lemma: these
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.1796750898710851
Lemma: travel
Max TF Term Weight (Un-normalized):   0.406063579078414
Lemma: up
Max TF Term Weight (Un-normalized):   0.23089995650910006
Lemma: use
Max TF Term Weight (Un-normalized):   0.06950781290674782
Lemma: value
Max TF Term Weight (Un-normalized):   0.13901562581349564
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.13901562581349564
Lemma: wall
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: which
Max TF Term Weight (Un-normalized):   0.2657090747269312
Lemma: wide
Max TF Term Weight (Un-normalized):   0.2969132825319785
Lemma: wilsonre
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: within
Max TF Term Weight (Un-normalized):   0.179036182567807

Rank#: 2
Cosine Similarity: 0.14066353434074264
Doc#: 302  Document Headline:  approximations for the thermodynamic and transport properties of high temperature air .
Document Vector: 
Lemma: air
Max TF Term Weight (Un-normalized):   0.26361315101527244
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: atmosphere
Max TF Term Weight (Un-normalized):   0.22059574503584292
Lemma: become
Max TF Term Weight (Un-normalized):   0.22971871835444901
Lemma: can
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: close
Max TF Term Weight (Un-normalized):   0.2172757914399585
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: compare
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: complete
Max TF Term Weight (Un-normalized):   0.2172757914399585
Lemma: component
Max TF Term Weight (Un-normalized):   0.3295848814904793
Lemma: compressibility
Max TF Term Weight (Un-normalized):   0.36917473517924804
Lemma: conductivity
Max TF Term Weight (Un-normalized):   0.29219753619221395
Lemma: degree
Max TF Term Weight (Un-normalized):   0.2598408453118896
Lemma: energy
Max TF Term Weight (Un-normalized):   0.18833931484385696
Lemma: enthalpy
Max TF Term Weight (Un-normalized):   0.33831605290914807
Lemma: entropy
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.20219547868018978
Lemma: find
Max TF Term Weight (Un-normalized):   0.1271404073400238
Lemma: flux
Max TF Term Weight (Un-normalized):   0.3144905093289444
Lemma: form
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: fraction
Max TF Term Weight (Un-normalized):   0.3234740956258618
Lemma: from
Max TF Term Weight (Un-normalized):   0.07979792881078321
Lemma: fully
Max TF Term Weight (Un-normalized):   0.27323532888264646
Lemma: function
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: hansen
Max TF Term Weight (Un-normalized):   0.4675252666712686
Lemma: heat
Max TF Term Weight (Un-normalized):   0.14760544189911234
Lemma: high
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: ionize
Max TF Term Weight (Un-normalized):   0.36859079972534337
Lemma: major
Max TF Term Weight (Un-normalized):   0.34279071681939943
Lemma: minor
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: mol
Max TF Term Weight (Un-normalized):   0.5169925001442313
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: neglect
Max TF Term Weight (Un-normalized):   0.24507038555679764
Lemma: number
Max TF Term Weight (Un-normalized):   0.0635702036700119
Lemma: order
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: over
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: partition
Max TF Term Weight (Un-normalized):   0.5169925001442313
Lemma: prandtl
Max TF Term Weight (Un-normalized):   0.28348697624926383
Lemma: predict
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: property
Max TF Term Weight (Un-normalized):   0.2278967963201991
Lemma: range
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: small
Max TF Term Weight (Un-normalized):   0.11485935917722451
Lemma: sound
Max TF Term Weight (Un-normalized):   0.2596004555566981
Lemma: specific
Max TF Term Weight (Un-normalized):   0.22971871835444901
Lemma: speed
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: start
Max TF Term Weight (Un-normalized):   0.2833443784404361
Lemma: tabulate
Max TF Term Weight (Un-normalized):   0.3799769021295628
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.14760544189911234
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.19786893389185056
Lemma: thermodynamic
Max TF Term Weight (Un-normalized):   0.3641250699022097
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tr
Max TF Term Weight (Un-normalized):   0.32865318530037435
Lemma: transparent
Max TF Term Weight (Un-normalized):   0.4675252666712686
Lemma: transport
Max TF Term Weight (Un-normalized):   0.3799769021295628
Lemma: unity
Max TF Term Weight (Un-normalized):   0.26326105959611246
Lemma: value
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: viscosity
Max TF Term Weight (Un-normalized):   0.22059574503584292

Rank#: 3
Cosine Similarity: 0.12091900100898717
Doc#: 949  Document Headline:  charts for equilibrium flow properties of air in hypervelocity nozzles .
Document Vector: 
Lemma: across
Max TF Term Weight (Un-normalized):   0.26126578250618154
Lemma: air
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: also
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: area
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: atmosphere
Max TF Term Weight (Un-normalized):   0.23517374330390606
Lemma: baumgm
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: btu
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: chart
Max TF Term Weight (Un-normalized):   0.5077502179330246
Lemma: closer
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: compute
Max TF Term Weight (Un-normalized):   0.26126578250618154
Lemma: density
Max TF Term Weight (Un-normalized):   0.283830862173043
Lemma: dynamic
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: enthalpy
Max TF Term Weight (Un-normalized):   0.4415065255598226
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.29003702558308997
Lemma: exponent
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: extend
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: follow
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: function
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: have
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: hypervelocity
Max TF Term Weight (Un-normalized):   0.38371558518395665
Lemma: include
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: initial
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: interval
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: isentropic
Max TF Term Weight (Un-normalized):   0.3555197527697774
Lemma: jorgensenlh
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: molecular
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.22493063654581405
Lemma: normal
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: nozzle
Max TF Term Weight (Un-normalized):   0.29003702558308997
Lemma: number
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: per
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: plot
Max TF Term Weight (Un-normalized):   0.4156689491100898
Lemma: pound
Max TF Term Weight (Un-normalized):   0.3929490031854645
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.09192441797022612
Lemma: property
Max TF Term Weight (Un-normalized):   0.3295455913238786
Lemma: rate
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.1659197635473378
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: shock
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: specify
Max TF Term Weight (Un-normalized):   0.32642819453100774
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.3053663066614629
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: tn
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: tnd
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: up
Max TF Term Weight (Un-normalized):   0.2357164288121836
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: wave
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: weight
Max TF Term Weight (Un-normalized):   0.3668460676323355
Lemma: work
Max TF Term Weight (Un-normalized):   0.1890575129294965

Rank#: 4
Cosine Similarity: 0.11792772773509066
Doc#: 1143  Document Headline:  a one-foot hypervelocity shock tunnel in which high-enthalpy real gas flows can be generated with flow times of about 180 milliseconds .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.24273820609335534
Lemma: achieve
Max TF Term Weight (Un-normalized):   0.36234126347485895
Lemma: air
Max TF Term Weight (Un-normalized):   0.22013241726072352
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: btu
Max TF Term Weight (Un-normalized):   0.4167440331315116
Lemma: can
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: chamber
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: combustion
Max TF Term Weight (Un-normalized):   0.3405942957455311
Lemma: combustionheate
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: consist
Max TF Term Weight (Un-normalized):   0.23806519637407705
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: cunninghambe
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: describe
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: driver
Max TF Term Weight (Un-normalized):   0.4167440331315116
Lemma: duration
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: enthalpy
Max TF Term Weight (Un-normalized):   0.41730701266538106
Lemma: essential
Max TF Term Weight (Un-normalized):   0.3028140864267262
Lemma: excess
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: feature
Max TF Term Weight (Un-normalized):   0.2464468852587461
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: foot
Max TF Term Weight (Un-normalized):   0.2781750191253347
Lemma: gas
Max TF Term Weight (Un-normalized):   0.2485625339425396
Lemma: generate
Max TF Term Weight (Un-normalized):   0.3549271540820397
Lemma: high
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: hypervelocity
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: krauss
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: lb
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: means
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: millisecond
Max TF Term Weight (Un-normalized):   0.5497986164139025
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: nozzle
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: number
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: one
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: operate
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: psium
Max TF Term Weight (Un-normalized):   0.4544185110361619
Lemma: real
Max TF Term Weight (Un-normalized):   0.3669884352915418
Lemma: reservoir
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: section
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: shock
Max TF Term Weight (Un-normalized):   0.21569496812589684
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: stream
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: tank
Max TF Term Weight (Un-normalized):   0.40315396135043485
Lemma: test
Max TF Term Weight (Un-normalized):   0.15703634026772897
Lemma: time
Max TF Term Weight (Un-normalized):   0.21438795725232157
Lemma: tnd
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: total
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: tube
Max TF Term Weight (Un-normalized):   0.22156169755849245
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.24273820609335534
Lemma: vacuum
Max TF Term Weight (Un-normalized):   0.4544185110361619
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10252909937145392

Rank#: 5
Cosine Similarity: 0.1067265043545929
Doc#: 1009  Document Headline:  free-flight measurements of the static and dynamic
Document Vector: 
Lemma: accuracy
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: air
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: also
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: atm
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: between
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.21444818344919464
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.21444818344919464
Lemma: calibrate
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: chart
Max TF Term Weight (Un-normalized):   0.3919393380634704
Lemma: choose
Max TF Term Weight (Un-normalized):   0.29914249513506797
Lemma: combination
Max TF Term Weight (Un-normalized):   0.22792232178583569
Lemma: compare
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: condense
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: contour
Max TF Term Weight (Un-normalized):   0.527421762673068
Lemma: conventional
Max TF Term Weight (Un-normalized):   0.27472708482442504
Lemma: determine
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: dynamic
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: effect
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.29003702558308997
Lemma: example
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: flight
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: free
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: from
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: gas
Max TF Term Weight (Un-normalized):   0.2629766033510515
Lemma: herein
Max TF Term Weight (Un-normalized):   0.33048688157979006
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: ideal
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: include
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: just
Max TF Term Weight (Un-normalized):   0.3448507763276174
Lemma: limit
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: mach
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: may
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: measurement
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: method
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: nozzle
Max TF Term Weight (Un-normalized):   0.3757376426568642
Lemma: number
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: operate
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: other
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.29139351076685277
Lemma: permit
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: possible
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: present
Max TF Term Weight (Un-normalized):   0.09192441797022612
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: property
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: real
Max TF Term Weight (Un-normalized):   0.38503535092657304
Lemma: series
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: show
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.27558676201248483
Lemma: static
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: sufficient
Max TF Term Weight (Un-normalized):   0.32323546006171977
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.19262688023881586
Lemma: than
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: thermodynamic
Max TF Term Weight (Un-normalized):   0.30206909979668417
Lemma: these
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: those
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: up
Max TF Term Weight (Un-normalized):   0.2357164288121836
Lemma: use
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: various
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: way
Max TF Term Weight (Un-normalized):   0.2767560674696978
 ***************************** 
Processing Query:  is it possible to find an analytical,  similar solution of the strong blast wave problem in the newtonian approximation  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.22538425731189943
Doc#: 495  Document Headline:  on similar solutions for strong blast waves and their application to steady hypersonic flow .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: application
Max TF Term Weight (Un-normalized):   0.24160777626488467
Lemma: apply
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.24160777626488467
Lemma: blast
Max TF Term Weight (Un-normalized):   0.5895238090138194
Lemma: body
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: borcheref
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: busemann
Max TF Term Weight (Un-normalized):   0.43303600007964416
Lemma: case
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: constitute
Max TF Term Weight (Un-normalized):   0.44763337698537986
Lemma: density
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: equivalence
Max TF Term Weight (Un-normalized):   0.4102958139934412
Lemma: expression
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: find
Max TF Term Weight (Un-normalized):   0.1524375347397515
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: formulum
Max TF Term Weight (Un-normalized):   0.377602736086074
Lemma: general
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: higher
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.22865630210962726
Lemma: ie
Max TF Term Weight (Un-normalized):   0.312348199248497
Lemma: improvement
Max TF Term Weight (Un-normalized):   0.35007422761089363
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: law
Max TF Term Weight (Un-normalized):   0.25882647952616467
Lemma: layer
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: neglect
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: newton
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: newtonian
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: order
Max TF Term Weight (Un-normalized):   0.2139731317289842
Lemma: power
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: principle
Max TF Term Weight (Un-normalized):   0.29692424937158485
Lemma: profile
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: sc
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: shock
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: similar
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: simple
Max TF Term Weight (Un-normalized):   0.2139731317289842
Lemma: solution
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: steady
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: strong
Max TF Term Weight (Un-normalized):   0.46241948681881245
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: term
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: thin
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: upon
Max TF Term Weight (Un-normalized):   0.22961405160585316
Lemma: use
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: wave
Max TF Term Weight (Un-normalized):   0.2330417387928228

Rank#: 2
Cosine Similarity: 0.10841288204401198
Doc#: 72  Document Headline:  boundary layer behind shock or thin expansion wave moving into stationary fluid .
Document Vector: 
Lemma: account
Max TF Term Weight (Un-normalized):   0.19611886888768867
Lemma: accurate
Max TF Term Weight (Un-normalized):   0.21704316066489407
Lemma: accurately
Max TF Term Weight (Un-normalized):   0.2969914194325606
Lemma: advance
Max TF Term Weight (Un-normalized):   0.2940866006767315
Lemma: agree
Max TF Term Weight (Un-normalized):   0.21704316066489407
Lemma: also
Max TF Term Weight (Un-normalized):   0.12042121096943097
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.21074597083983626
Lemma: analytically
Max TF Term Weight (Un-normalized):   0.30503908083454373
Lemma: as
Max TF Term Weight (Un-normalized):   0.33532119777343405
Lemma: assume
Max TF Term Weight (Un-normalized):   0.18063181645414647
Lemma: assumption
Max TF Term Weight (Un-normalized):   0.17200860728342274
Lemma: be
Max TF Term Weight (Un-normalized):   0.09543155183898963
Lemma: become
Max TF Term Weight (Un-normalized):   0.2228149486827179
Lemma: behind
Max TF Term Weight (Un-normalized):   0.3418108791600941
Lemma: blasius
Max TF Term Weight (Un-normalized):   0.3091362147592314
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.09456892386944912
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.09596117518597264
Lemma: case
Max TF Term Weight (Un-normalized):   0.1081995451050382
Lemma: compressibility
Max TF Term Weight (Un-normalized):   0.27864030152134517
Lemma: compressible
Max TF Term Weight (Un-normalized):   0.1775492720288343
Lemma: consider
Max TF Term Weight (Un-normalized):   0.11140747434135895
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.18745490643880902
Lemma: datum
Max TF Term Weight (Un-normalized):   0.12402801969043639
Lemma: determine
Max TF Term Weight (Un-normalized):   0.15850946853260595
Lemma: distance
Max TF Term Weight (Un-normalized):   0.2158527628084206
Lemma: employ
Max TF Term Weight (Un-normalized):   0.20736864952733158
Lemma: equation
Max TF Term Weight (Un-normalized):   0.07604743209745009
Lemma: except
Max TF Term Weight (Un-normalized):   0.22552985962182062
Lemma: expansion
Max TF Term Weight (Un-normalized):   0.3297893207572673
Lemma: expression
Max TF Term Weight (Un-normalized):   0.23523624832412962
Lemma: find
Max TF Term Weight (Un-normalized):   0.09596117518597264
Lemma: flat
Max TF Term Weight (Un-normalized):   0.13469853874238616
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.19164776792940824
Lemma: form
Max TF Term Weight (Un-normalized):   0.11140747434135895
Lemma: friction
Max TF Term Weight (Un-normalized):   0.19611886888768867
Lemma: function
Max TF Term Weight (Un-normalized):   0.13469853874238616
Lemma: greater
Max TF Term Weight (Un-normalized):   0.20736864952733158
Lemma: guide
Max TF Term Weight (Un-normalized):   0.30503908083454373
Lemma: have
Max TF Term Weight (Un-normalized):   0.07604743209745009
Lemma: heat
Max TF Term Weight (Un-normalized):   0.11140747434135895
Lemma: infinite
Max TF Term Weight (Un-normalized):   0.20736864952733158
Lemma: integral
Max TF Term Weight (Un-normalized):   0.24084242193886193
Lemma: integration
Max TF Term Weight (Un-normalized):   0.28629465551696887
Lemma: into
Max TF Term Weight (Un-normalized):   0.18063181645414647
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.15209486419490018
Lemma: karman
Max TF Term Weight (Un-normalized):   0.2461060130837451
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.15850946853260595
Lemma: layer
Max TF Term Weight (Un-normalized):   0.14988819806663076
Lemma: less
Max TF Term Weight (Un-normalized):   0.19611886888768867
Lemma: method
Max TF Term Weight (Un-normalized):   0.07604743209745009
Lemma: mirelsh
Max TF Term Weight (Un-normalized):   0.4253088597541204
Lemma: move
Max TF Term Weight (Un-normalized):   0.21704316066489407
Lemma: naca
Max TF Term Weight (Un-normalized):   0.13469853874238616
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.2047989369889966
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.07604743209745009
Lemma: over
Max TF Term Weight (Un-normalized):   0.11140747434135895
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.15209486419490018
Lemma: percent
Max TF Term Weight (Un-normalized):   0.21074597083983626
Lemma: permit
Max TF Term Weight (Un-normalized):   0.2461060130837451
Lemma: plate
Max TF Term Weight (Un-normalized):   0.12402801969043639
Lemma: pohlhausen
Max TF Term Weight (Un-normalized):   0.28106937025476764
Lemma: present
Max TF Term Weight (Un-normalized):   0.04798058759298632
Lemma: problem
Max TF Term Weight (Un-normalized):   0.12042121096943097
Lemma: profile
Max TF Term Weight (Un-normalized):   0.17200860728342274
Lemma: progressively
Max TF Term Weight (Un-normalized):   0.3667567114616768
Lemma: provide
Max TF Term Weight (Un-normalized):   0.16598556179997329
Lemma: relate
Max TF Term Weight (Un-normalized):   0.2635023385362591
Lemma: relative
Max TF Term Weight (Un-normalized):   0.2461060130837451
Lemma: represent
Max TF Term Weight (Un-normalized):   0.19611886888768867
Lemma: semus
Max TF Term Weight (Un-normalized):   0.25534923712031793
Lemma: seventhpower
Max TF Term Weight (Un-normalized):   0.501455250204063
Lemma: shock
Max TF Term Weight (Un-normalized):   0.13980469648514
Lemma: similar
Max TF Term Weight (Un-normalized):   0.17200860728342274
Lemma: skin
Max TF Term Weight (Un-normalized):   0.18745490643880902
Lemma: solution
Max TF Term Weight (Un-normalized):   0.09543155183898963
Lemma: solve
Max TF Term Weight (Un-normalized):   0.2790360149566978
Lemma: stationary
Max TF Term Weight (Un-normalized):   0.33981999845499544
Lemma: strong
Max TF Term Weight (Un-normalized):   0.2461060130837451
Lemma: surface
Max TF Term Weight (Un-normalized):   0.12042121096943097
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.15850946853260595
Lemma: than
Max TF Term Weight (Un-normalized):   0.11140747434135895
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.19192235037194527
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.2047989369889966
Lemma: thin
Max TF Term Weight (Un-normalized):   0.22677578086227151
Lemma: those
Max TF Term Weight (Un-normalized):   0.15209486419490018
Lemma: tn
Max TF Term Weight (Un-normalized):   0.1593880619343453
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.12402801969043639
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.2735981110744184
Lemma: type
Max TF Term Weight (Un-normalized):   0.13469853874238616
Lemma: uniform
Max TF Term Weight (Un-normalized):   0.16598556179997329
Lemma: use
Max TF Term Weight (Un-normalized):   0.04798058759298632
Lemma: utilize
Max TF Term Weight (Un-normalized):   0.26035537136571846
Lemma: valid
Max TF Term Weight (Un-normalized):   0.23308878266178135
Lemma: various
Max TF Term Weight (Un-normalized):   0.14394176277895895
Lemma: vary
Max TF Term Weight (Un-normalized):   0.15209486419490018
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.09596117518597264
Lemma: wall
Max TF Term Weight (Un-normalized):   0.24287330563676524
Lemma: wave
Max TF Term Weight (Un-normalized):   0.23137955796991394
Lemma: weak
Max TF Term Weight (Un-normalized):   0.36393662971482615
Lemma: within
Max TF Term Weight (Un-normalized):   0.1775492720288343

Rank#: 3
Cosine Similarity: 0.10427007273220128
Doc#: 654  Document Headline:  on the propagation and structure of the blast wave .  part 1.
Document Vector: 
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.24160777626488467
Lemma: behind
Max TF Term Weight (Un-normalized):   0.23798399737957068
Lemma: blast
Max TF Term Weight (Un-normalized):   0.49840662421851634
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: change
Max TF Term Weight (Un-normalized):   0.1904912222483514
Lemma: continuation
Max TF Term Weight (Un-normalized):   0.42090368268483946
Lemma: curve
Max TF Term Weight (Un-normalized):   0.29019189909885995
Lemma: density
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.2330417387928228
Lemma: distance
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: due
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: feature
Max TF Term Weight (Un-normalized):   0.26471369168011105
Lemma: first
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: front
Max TF Term Weight (Un-normalized):   0.29692424937158485
Lemma: further
Max TF Term Weight (Un-normalized):   0.23390920626927075
Lemma: imaus
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: japan
Max TF Term Weight (Un-normalized):   0.49840662421851634
Lemma: method
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: now
Max TF Term Weight (Un-normalized):   0.3225656936410341
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: part
Max TF Term Weight (Un-normalized):   0.32319458964764514
Lemma: phy
Max TF Term Weight (Un-normalized):   0.4502159201859925
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: propagation
Max TF Term Weight (Un-normalized):   0.5227068580946574
Lemma: refinement
Max TF Term Weight (Un-normalized):   0.4006547849434648
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: sakurium
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: second
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: shock
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: soc
Max TF Term Weight (Un-normalized):   0.39094762904278285
Lemma: solution
Max TF Term Weight (Un-normalized):   0.14288888793800056
Lemma: structure
Max TF Term Weight (Un-normalized):   0.29777838544624097
Lemma: time
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: use
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: wave
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: wkb
Max TF Term Weight (Un-normalized):   0.5204244381420449

Rank#: 4
Cosine Similarity: 0.09568603665215325
Doc#: 1327  Document Headline:  on the propagation and structure of the blast wave .
Document Vector: 
Lemma: adiabatic
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: also
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: appear
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.22493063654581405
Lemma: as
Max TF Term Weight (Un-normalized):   0.36855708958289396
Lemma: blast
Max TF Term Weight (Un-normalized):   0.46400377081081084
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: case
Max TF Term Weight (Un-normalized):   0.13148830167552575
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: charge
Max TF Term Weight (Un-normalized):   0.3555197527697774
Lemma: concern
Max TF Term Weight (Un-normalized):   0.28616090651285647
Lemma: consider
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: construct
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: cylindrical
Max TF Term Weight (Un-normalized):   0.27016120753159717
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.21444818344919464
Lemma: distance
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: energy
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: especially
Max TF Term Weight (Un-normalized):   0.32323546006171977
Lemma: explosion
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: find
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: first
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: form
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: from
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: front
Max TF Term Weight (Un-normalized):   0.3826265258045042
Lemma: have
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: hydrodynamical
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: index
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: japan
Max TF Term Weight (Un-normalized):   0.3448507763276174
Lemma: length
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: numerically
Max TF Term Weight (Un-normalized):   0.29129199697738994
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: paper
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: part
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: phy
Max TF Term Weight (Un-normalized):   0.3115073156072715
Lemma: plane
Max TF Term Weight (Un-normalized):   0.27016120753159717
Lemma: power
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: propagation
Max TF Term Weight (Un-normalized):   0.4866266646533506
Lemma: publish
Max TF Term Weight (Un-normalized):   0.28437065120538046
Lemma: quantity
Max TF Term Weight (Un-normalized):   0.27472708482442504
Lemma: related
Max TF Term Weight (Un-normalized):   0.26602247757131153
Lemma: represent
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: respectively
Max TF Term Weight (Un-normalized):   0.27264250675093227
Lemma: sakuraium
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: second
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: series
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: shape
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: shock
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: soc
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: solution
Max TF Term Weight (Un-normalized):   0.14569675538342639
Lemma: sound
Max TF Term Weight (Un-normalized):   0.2767560674696978
Lemma: spherical
Max TF Term Weight (Un-normalized):   0.3801596511519164
Lemma: structure
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: subsequently
Max TF Term Weight (Un-normalized):   0.3929490031854645
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: taylor
Max TF Term Weight (Un-normalized):   0.32642819453100774
Lemma: the
Max TF Term Weight (Un-normalized):   0.33527351264378497
Lemma: these
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: undisturbed
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: use
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: wave
Max TF Term Weight (Un-normalized):   0.18342303381616776

Rank#: 5
Cosine Similarity: 0.0887505786072316
Doc#: 1157  Document Headline:  hypersonic shock tunnel .
Document Vector: 
Lemma: agree
Max TF Term Weight (Un-normalized):   0.22105365545283537
Lemma: air
Max TF Term Weight (Un-normalized):   0.17465717721743013
Lemma: al
Max TF Term Weight (Un-normalized):   0.3483878604875331
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.21464010698788905
Lemma: ars
Max TF Term Weight (Un-normalized):   0.27990724277112194
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: ballistic
Max TF Term Weight (Un-normalized):   0.2953724140536493
Lemma: blunt
Max TF Term Weight (Un-normalized):   0.20667090556083137
Lemma: body
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: density
Max TF Term Weight (Un-normalized):   0.19546866615309316
Lemma: describe
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: detach
Max TF Term Weight (Un-normalized):   0.3955296419470059
Lemma: detachment
Max TF Term Weight (Un-normalized):   0.3195501626426334
Lemma: develop
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: devrease
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: distance
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: drive
Max TF Term Weight (Un-normalized):   0.4526778355394476
Lemma: driver
Max TF Term Weight (Un-normalized):   0.39725502702580645
Lemma: edge
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: effect
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: encounter
Max TF Term Weight (Un-normalized):   0.27292129263275205
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: et
Max TF Term Weight (Un-normalized):   0.3483878604875331
Lemma: find
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: flat
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: flight
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: fp
Max TF Term Weight (Un-normalized):   0.4331676605570754
Lemma: greatly
Max TF Term Weight (Un-normalized):   0.2837889801230501
Lemma: have
Max TF Term Weight (Un-normalized):   0.09860708177523271
Lemma: helium
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: hemisphere
Max TF Term Weight (Un-normalized):   0.2837889801230501
Lemma: high
Max TF Term Weight (Un-normalized):   0.20052064322737606
Lemma: ht
Max TF Term Weight (Un-normalized):   0.4331676605570754
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.21301670899274866
Lemma: ignite
Max TF Term Weight (Un-normalized):   0.4618539073902895
Lemma: information
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.19546866615309316
Lemma: jv
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: layer
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: lead
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: less
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: long
Max TF Term Weight (Un-normalized):   0.22105365545283537
Lemma: low
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: mach
Max TF Term Weight (Un-normalized):   0.09860708177523271
Lemma: may
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: mechanic
Max TF Term Weight (Un-normalized):   0.3294363899367362
Lemma: modify
Max TF Term Weight (Un-normalized):   0.20377241949759098
Lemma: nagamatsu
Max TF Term Weight (Un-normalized):   0.39725502702580645
Lemma: newtonian
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: nozzle
Max TF Term Weight (Un-normalized):   0.254297992827596
Lemma: number
Max TF Term Weight (Un-normalized):   0.06221414180484812
Lemma: observe
Max TF Term Weight (Un-normalized):   0.3166444824601078
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.09860708177523271
Lemma: plate
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: pp
Max TF Term Weight (Un-normalized):   0.2837889801230501
Lemma: predict
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: prediction
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: present
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.06221414180484812
Lemma: produce
Max TF Term Weight (Un-normalized):   0.254297992827596
Lemma: range
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: report
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: result
Max TF Term Weight (Un-normalized):   0.06221414180484812
Lemma: satellite
Max TF Term Weight (Un-normalized):   0.2651661834487901
Lemma: section
Max TF Term Weight (Un-normalized):   0.20667090556083137
Lemma: shock
Max TF Term Weight (Un-normalized):   0.21870064685200857
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.20667090556083137
Lemma: strong
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.18011654520506107
Lemma: test
Max TF Term Weight (Un-normalized):   0.1444567637559832
Lemma: than
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tube
Max TF Term Weight (Un-normalized):   0.2688850473656794
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.19933783549043507
Lemma: two
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: upon
Max TF Term Weight (Un-normalized):   0.20377241949759098
Lemma: vehicle
Max TF Term Weight (Un-normalized):   0.21464010698788905
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: very
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: wave
Max TF Term Weight (Un-normalized):   0.20052064322737606
 ***************************** 
Processing Query:  how can the aerodynamic performance of channel flow ground effect machines be calculated  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.13839757650437134
Doc#: 624  Document Headline:  cruise performance of channel-flow ground effect machines .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: air
Max TF Term Weight (Un-normalized):   0.21120565821874457
Lemma: airfoil
Max TF Term Weight (Un-normalized):   0.22064979638505489
Lemma: almost
Max TF Term Weight (Un-normalized):   0.300271012112406
Lemma: along
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: also
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: angle
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: below
Max TF Term Weight (Un-normalized):   0.2240213044582042
Lemma: between
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: center
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: channel
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: close
Max TF Term Weight (Un-normalized):   0.2868452616139697
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: compare
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: conclude
Max TF Term Weight (Un-normalized):   0.24649958247320775
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: consider
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: conventional
Max TF Term Weight (Un-normalized):   0.26169894244033665
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: cruise
Max TF Term Weight (Un-normalized):   0.4991906816944849
Lemma: cushion
Max TF Term Weight (Un-normalized):   0.44529588362487266
Lemma: deflection
Max TF Term Weight (Un-normalized):   0.2723216727794314
Lemma: determine
Max TF Term Weight (Un-normalized):   0.17468555463512508
Lemma: develop
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: drag
Max TF Term Weight (Un-normalized):   0.24991852805052248
Lemma: effect
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: employ
Max TF Term Weight (Un-normalized):   0.28224840687184
Lemma: excessive
Max TF Term Weight (Un-normalized):   0.3950604896069551
Lemma: exist
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: expenditure
Max TF Term Weight (Un-normalized):   0.6172220408941413
Lemma: fan
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: find
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: flight
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: ground
Max TF Term Weight (Un-normalized):   0.46158279189046303
Lemma: height
Max TF Term Weight (Un-normalized):   0.26913873592347315
Lemma: high
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: identify
Max TF Term Weight (Un-normalized):   0.3655189764223369
Lemma: induce
Max TF Term Weight (Un-normalized):   0.2774157151283555
Lemma: jet
Max TF Term Weight (Un-normalized):   0.24864362329804654
Lemma: large
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: length
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: lift
Max TF Term Weight (Un-normalized):   0.2745488164512265
Lemma: location
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: lower
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: machine
Max TF Term Weight (Un-normalized):   0.30790694740356045
Lemma: maximum
Max TF Term Weight (Un-normalized):   0.2697073885119511
Lemma: minimum
Max TF Term Weight (Un-normalized):   0.2511769700895874
Lemma: mixed
Max TF Term Weight (Un-normalized):   0.35107932890698595
Lemma: moment
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: mound
Max TF Term Weight (Un-normalized):   0.6825281729433365
Lemma: need
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: not
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: obtainable
Max TF Term Weight (Un-normalized):   0.3655189764223369
Lemma: operate
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: optimum
Max TF Term Weight (Un-normalized):   0.2835213394737957
Lemma: over
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: overall
Max TF Term Weight (Un-normalized):   0.300271012112406
Lemma: penalty
Max TF Term Weight (Un-normalized):   0.3950604896069551
Lemma: performance
Max TF Term Weight (Un-normalized):   0.32353939844376006
Lemma: pitch
Max TF Term Weight (Un-normalized):   0.22064979638505489
Lemma: planform
Max TF Term Weight (Un-normalized):   0.2967349764911252
Lemma: plus
Max TF Term Weight (Un-normalized):   0.3950604896069551
Lemma: power
Max TF Term Weight (Un-normalized):   0.2939269963162815
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.07523297341539732
Lemma: propeller
Max TF Term Weight (Un-normalized):   0.2942779834397059
Lemma: propulsion
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: proximity
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: range
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.15046594683079464
Lemma: rearward
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: rectangular
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: replace
Max TF Term Weight (Un-normalized):   0.28774434093827134
Lemma: require
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: restricted
Max TF Term Weight (Un-normalized):   0.277478311244903
Lemma: rise
Max TF Term Weight (Un-normalized):   0.2488760036943977
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: seal
Max TF Term Weight (Un-normalized):   0.7110427143197894
Lemma: shape
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: show
Max TF Term Weight (Un-normalized):   0.11924144168115643
Lemma: side
Max TF Term Weight (Un-normalized):   0.3521513936631647
Lemma: speed
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: strandt
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: streamwise
Max TF Term Weight (Un-normalized):   0.30364252018555526
Lemma: surface
Max TF Term Weight (Un-normalized):   0.15046594683079464
Lemma: system
Max TF Term Weight (Un-normalized):   0.20094157607166993
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theoretically
Max TF Term Weight (Un-normalized):   0.2849565220911584
Lemma: theory
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: total
Max TF Term Weight (Un-normalized):   0.20094157607166993
Lemma: two
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: typical
Max TF Term Weight (Un-normalized):   0.26169894244033665
Lemma: upper
Max TF Term Weight (Un-normalized):   0.33224252010606764
Lemma: variation
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: vehicle
Max TF Term Weight (Un-normalized):   0.41066544935012544
Lemma: volume
Max TF Term Weight (Un-normalized):   0.2942779834397059
Lemma: zero
Max TF Term Weight (Un-normalized):   0.16687836674585665

Rank#: 2
Cosine Similarity: 0.1151061886223749
Doc#: 650  Document Headline:  some design problems of hovercraft .
Document Vector: 
Lemma: aero
Max TF Term Weight (Un-normalized):   0.23230862501944965
Lemma: aerodynamic
Max TF Term Weight (Un-normalized):   0.17838377041878725
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: angle
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: consider
Max TF Term Weight (Un-normalized):   0.13806476273577312
Lemma: cushion
Max TF Term Weight (Un-normalized):   0.5270756487258014
Lemma: design
Max TF Term Weight (Un-normalized):   0.19752601954203555
Lemma: drag
Max TF Term Weight (Un-normalized):   0.19752601954203555
Lemma: dynamic
Max TF Term Weight (Un-normalized):   0.2611727142504686
Lemma: each
Max TF Term Weight (Un-normalized):   0.22639010877305443
Lemma: economics
Max TF Term Weight (Un-normalized):   0.6214421478571255
Lemma: effect
Max TF Term Weight (Un-normalized):   0.0861552073394121
Lemma: examine
Max TF Term Weight (Un-normalized):   0.27949405318274323
Lemma: ground
Max TF Term Weight (Un-normalized):   0.3320888895087263
Lemma: hovercraft
Max TF Term Weight (Un-normalized):   0.561980891050863
Lemma: influence
Max TF Term Weight (Un-normalized):   0.22003279637648082
Lemma: inst
Max TF Term Weight (Un-normalized):   0.4077841691237477
Lemma: jet
Max TF Term Weight (Un-normalized):   0.32802345272460404
Lemma: jonesr
Max TF Term Weight (Un-normalized):   0.6214421478571255
Lemma: lift
Max TF Term Weight (Un-normalized):   0.19752601954203555
Lemma: machine
Max TF Term Weight (Un-normalized):   0.3644548715088276
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: operation
Max TF Term Weight (Un-normalized):   0.33728953997331806
Lemma: optimum
Max TF Term Weight (Un-normalized):   0.3355907822778086
Lemma: over
Max TF Term Weight (Un-normalized):   0.13806476273577312
Lemma: paper
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.18848772456735313
Lemma: performance
Max TF Term Weight (Un-normalized):   0.29458273908055177
Lemma: peripheral
Max TF Term Weight (Un-normalized):   0.5270756487258014
Lemma: power
Max TF Term Weight (Un-normalized):   0.23230862501944965
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.05946125680626242
Lemma: problem
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.1723104146788242
Lemma: related
Max TF Term Weight (Un-normalized):   0.29994601416317296
Lemma: requirement
Max TF Term Weight (Un-normalized):   0.3284379359544072
Lemma: sc
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: simple
Max TF Term Weight (Un-normalized):   0.16692885196679202
Lemma: stability
Max TF Term Weight (Un-normalized):   0.2131663758962014
Lemma: stanton
Max TF Term Weight (Un-normalized):   0.48337738512135237
Lemma: structural
Max TF Term Weight (Un-normalized):   0.3120483655775192
Lemma: system
Max TF Term Weight (Un-normalized):   0.2378450272250497
Lemma: then
Max TF Term Weight (Un-normalized):   0.20570215187949642
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.17838377041878725
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: various
Max TF Term Weight (Un-normalized):   0.17838377041878725
Lemma: wave
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: weight
Max TF Term Weight (Un-normalized):   0.30741023817987795

Rank#: 3
Cosine Similarity: 0.09446810280458899
Doc#: 506  Document Headline:  a note on havelock's shallow-water wave-resistance curves .
Document Vector: 
Lemma: act
Max TF Term Weight (Un-normalized):   0.3115073156072715
Lemma: additional
Max TF Term Weight (Un-normalized):   0.280658581339866
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: attention
Max TF Term Weight (Un-normalized):   0.2767560674696978
Lemma: below
Max TF Term Weight (Un-normalized):   0.23517374330390606
Lemma: between
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: brandmaierhe
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: component
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: computer
Max TF Term Weight (Un-normalized):   0.2896197903206467
Lemma: contact
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: continuous
Max TF Term Weight (Un-normalized):   0.2945300320375571
Lemma: currently
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: curve
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: cushion
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: differ
Max TF Term Weight (Un-normalized):   0.29914249513506797
Lemma: digital
Max TF Term Weight (Un-normalized):   0.32642819453100774
Lemma: due
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: effect
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: estimate
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: focus
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: from
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: generate
Max TF Term Weight (Un-normalized):   0.2767560674696978
Lemma: gravity
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: ground
Max TF Term Weight (Un-normalized):   0.2945300320375571
Lemma: havelock
Max TF Term Weight (Un-normalized):   0.8670312382292648
Lemma: however
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: ibm
Max TF Term Weight (Un-normalized):   0.3929490031854645
Lemma: improve
Max TF Term Weight (Un-normalized):   0.2976358649095804
Lemma: land
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: machine
Max TF Term Weight (Un-normalized):   0.32323546006171977
Lemma: make
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: means
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: motion
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: no
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: note
Max TF Term Weight (Un-normalized):   0.24547336473662743
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: operate
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: original
Max TF Term Weight (Un-normalized):   0.3115073156072715
Lemma: over
Max TF Term Weight (Un-normalized):   0.19262688023881586
Lemma: performance
Max TF Term Weight (Un-normalized):   0.26126578250618154
Lemma: physical
Max TF Term Weight (Un-normalized):   0.2448996053555501
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: quest
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: resistance
Max TF Term Weight (Un-normalized):   0.4191394626283513
Lemma: result
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: shallow
Max TF Term Weight (Un-normalized):   0.32323546006171977
Lemma: should
Max TF Term Weight (Un-normalized):   0.2448996053555501
Lemma: show
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: similar
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: support
Max TF Term Weight (Un-normalized):   0.22792232178583569
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: system
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: terrain
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: these
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transportation
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: use
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: vehicle
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: water
Max TF Term Weight (Un-normalized):   0.6107326133229258
Lemma: wave
Max TF Term Weight (Un-normalized):   0.18342303381616776

Rank#: 4
Cosine Similarity: 0.08338157369415937
Doc#: 966  Document Headline:  on fully developed channel flows,. some solutions and limitations, and effects of compressibility, variable properties, and body forces .
Document Vector: 
Lemma: absence
Max TF Term Weight (Un-normalized):   0.35203641638112076
Lemma: across
Max TF Term Weight (Un-normalized):   0.23969594498589836
Lemma: agree
Max TF Term Weight (Un-normalized):   0.21886081814845823
Lemma: allow
Max TF Term Weight (Un-normalized):   0.2657090747269312
Lemma: along
Max TF Term Weight (Un-normalized):   0.16072287894805923
Lemma: also
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: analytic
Max TF Term Weight (Un-normalized):   0.2771305818629072
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: approximately
Max TF Term Weight (Un-normalized):   0.18420899753729034
Lemma: author
Max TF Term Weight (Un-normalized):   0.19352963021134736
Lemma: become
Max TF Term Weight (Un-normalized):   0.22468094279044476
Lemma: body
Max TF Term Weight (Un-normalized):   0.13901562581349564
Lemma: both
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: brief
Max TF Term Weight (Un-normalized):   0.26724322570129505
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: can
Max TF Term Weight (Un-normalized):   0.12223731744927563
Lemma: case
Max TF Term Weight (Un-normalized):   0.14962650106547581
Lemma: channel
Max TF Term Weight (Un-normalized):   0.44189953528191334
Lemma: closely
Max TF Term Weight (Un-normalized):   0.2657090747269312
Lemma: compressibility
Max TF Term Weight (Un-normalized):   0.3549377435740844
Lemma: condition
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: consider
Max TF Term Weight (Un-normalized):   0.14191313081456916
Lemma: consistently
Max TF Term Weight (Un-normalized):   0.38048825912203604
Lemma: constant
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: constantproperty
Max TF Term Weight (Un-normalized):   0.4572723478805719
Lemma: convection
Max TF Term Weight (Un-normalized):   0.34494492035377605
Lemma: couette
Max TF Term Weight (Un-normalized):   0.3449318764853495
Lemma: develop
Max TF Term Weight (Un-normalized):   0.15798944089756267
Lemma: discussion
Max TF Term Weight (Un-normalized):   0.21251089165030795
Lemma: distance
Max TF Term Weight (Un-normalized):   0.17344911677152813
Lemma: due
Max TF Term Weight (Un-normalized):   0.15336860333170887
Lemma: effect
Max TF Term Weight (Un-normalized):   0.07577375481092581
Lemma: energy
Max TF Term Weight (Un-normalized):   0.18420899753729034
Lemma: equation
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: exact
Max TF Term Weight (Un-normalized):   0.22616591226416038
Lemma: examination
Max TF Term Weight (Un-normalized):   0.3449318764853495
Lemma: finally
Max TF Term Weight (Un-normalized):   0.24816706137967587
Lemma: find
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: follow
Max TF Term Weight (Un-normalized):   0.2017510108845457
Lemma: force
Max TF Term Weight (Un-normalized):   0.20852343872024345
Lemma: form
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: freeconvection
Max TF Term Weight (Un-normalized):   0.4572723478805719
Lemma: frictional
Max TF Term Weight (Un-normalized):   0.4671822378030517
Lemma: fully
Max TF Term Weight (Un-normalized):   0.33759269813664144
Lemma: give
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: gradient
Max TF Term Weight (Un-normalized):   0.24918290277783295
Lemma: have
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: heating
Max TF Term Weight (Un-normalized):   0.2548602230704875
Lemma: if
Max TF Term Weight (Un-normalized):   0.17344911677152813
Lemma: incompressible
Max TF Term Weight (Un-normalized):   0.203031789539207
Lemma: independent
Max TF Term Weight (Un-normalized):   0.23259140509012718
Lemma: indicate
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: inversely
Max TF Term Weight (Un-normalized):   0.38048825912203604
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: large
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: limitation
Max TF Term Weight (Un-normalized):   0.36102123043676965
Lemma: liquid
Max TF Term Weight (Un-normalized):   0.369425261378277
Lemma: machine
Max TF Term Weight (Un-normalized):   0.29654946893251277
Lemma: maslen
Max TF Term Weight (Un-normalized):   0.4288706666748729
Lemma: momentum
Max TF Term Weight (Un-normalized):   0.22468094279044476
Lemma: motion
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: must
Max TF Term Weight (Un-normalized):   0.23259140509012718
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.15336860333170887
Lemma: negligible
Max TF Term Weight (Un-normalized):   0.2657090747269312
Lemma: new
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: not
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: occur
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: or
Max TF Term Weight (Un-normalized):   0.29654946893251277
Lemma: out
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: presence
Max TF Term Weight (Un-normalized):   0.20910528650089605
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.061118658724637814
Lemma: property
Max TF Term Weight (Un-normalized):   0.21910809962220051
Lemma: quantity
Max TF Term Weight (Un-normalized):   0.2520458958633574
Lemma: quasus
Max TF Term Weight (Un-normalized):   0.29654946893251277
Lemma: readily
Max TF Term Weight (Un-normalized):   0.32144575789611846
Lemma: result
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: root
Max TF Term Weight (Un-normalized):   0.2891951933161624
Lemma: same
Max TF Term Weight (Un-normalized):   0.15336860333170887
Lemma: say
Max TF Term Weight (Un-normalized):   0.32144575789611846
Lemma: sense
Max TF Term Weight (Un-normalized):   0.3318056314958718
Lemma: separable
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: separate
Max TF Term Weight (Un-normalized):   0.21251089165030795
Lemma: several
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: sh
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: small
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: solution
Max TF Term Weight (Un-normalized):   0.1280285361992592
Lemma: square
Max TF Term Weight (Un-normalized):   0.22741859012064386
Lemma: stream
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: streamwise
Max TF Term Weight (Un-normalized):   0.4201326155830141
Lemma: such
Max TF Term Weight (Un-normalized):   0.19513310068521755
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.16139214360235218
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: then
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: these
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tr
Max TF Term Weight (Un-normalized):   0.32144575789611846
Lemma: turn
Max TF Term Weight (Un-normalized):   0.27306335034328155
Lemma: two
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: variable
Max TF Term Weight (Un-normalized):   0.27803125162699127
Lemma: variation
Max TF Term Weight (Un-normalized):   0.24045752571192905
Lemma: vary
Max TF Term Weight (Un-normalized):   0.15336860333170887
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: wall
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: wherein
Max TF Term Weight (Un-normalized):   0.36982816544895525

Rank#: 5
Cosine Similarity: 0.0731047020725019
Doc#: 941  Document Headline:  viscous compressible and incompressible flow in slender channels .
Document Vector: 
Lemma: adiabatic
Max TF Term Weight (Un-normalized):   0.30364252018555526
Lemma: aiaa
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.22064979638505489
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: axisymmetric
Max TF Term Weight (Un-normalized):   0.23886364718205333
Lemma: channel
Max TF Term Weight (Un-normalized):   0.5944076211804291
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: compressible
Max TF Term Weight (Un-normalized):   0.2783950829401892
Lemma: convergent
Max TF Term Weight (Un-normalized):   0.3284972194217488
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: discharge
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: divergent
Max TF Term Weight (Un-normalized):   0.34451337745762345
Lemma: effect
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: equation
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: find
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: geometric
Max TF Term Weight (Un-normalized):   0.33866025032064434
Lemma: high
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: incompressible
Max TF Term Weight (Un-normalized):   0.216942274822645
Lemma: line
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: location
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: make
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: moderate
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: motion
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: number
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: regard
Max TF Term Weight (Un-normalized):   0.26913873592347315
Lemma: result
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: similar
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: slender
Max TF Term Weight (Un-normalized):   0.2939269963162815
Lemma: solution
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: sonic
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: study
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: such
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: throat
Max TF Term Weight (Un-normalized):   0.33866025032064434
Lemma: through
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: two
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: twodimensional
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: valid
Max TF Term Weight (Un-normalized):   0.24404258942178847
Lemma: viscosity
Max TF Term Weight (Un-normalized):   0.2240213044582042
Lemma: viscous
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: wall
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: williamsjc
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: yield
Max TF Term Weight (Un-normalized):   0.20947782547261967
 ***************************** 
Processing Query:  what is the basic mechanism of the transonic aileron buzz  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.22154726652145984
Doc#: 496  Document Headline:  a theory of transonic aileron buzz, neglecting viscous effects .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: aileron
Max TF Term Weight (Un-normalized):   0.6559633583098209
Lemma: airfoil
Max TF Term Weight (Un-normalized):   0.33477701986142655
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.1524375347397515
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: around
Max TF Term Weight (Un-normalized):   0.25571074646193387
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: buzz
Max TF Term Weight (Un-normalized):   0.7965784284662087
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: develop
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: due
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: eckhausw
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: effect
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: first
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: flutter
Max TF Term Weight (Un-normalized):   0.25571074646193387
Lemma: from
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: harmonic
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: hinge
Max TF Term Weight (Un-normalized):   0.4102958139934412
Lemma: linearize
Max TF Term Weight (Un-normalized):   0.261824609297327
Lemma: local
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: moment
Max TF Term Weight (Un-normalized):   0.2096493796058092
Lemma: neglect
Max TF Term Weight (Un-normalized):   0.377602736086074
Lemma: nonsteady
Max TF Term Weight (Un-normalized):   0.43303600007964416
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: observation
Max TF Term Weight (Un-normalized):   0.2930483094538726
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: oscillation
Max TF Term Weight (Un-normalized):   0.2930483094538726
Lemma: perturbation
Max TF Term Weight (Un-normalized):   0.4502159201859925
Lemma: present
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: region
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: result
Max TF Term Weight (Un-normalized):   0.09015285085482228
Lemma: satisfactory
Max TF Term Weight (Un-normalized):   0.26471369168011105
Lemma: sc
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: series
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: shock
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: solution
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: sponsor
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: stability
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: terminate
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: theory
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.40203047361228705
Lemma: twodimensional
Max TF Term Weight (Un-normalized):   0.35007422761089363
Lemma: unsteady
Max TF Term Weight (Un-normalized):   0.2753215603715094
Lemma: usaf
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: vicinity
Max TF Term Weight (Un-normalized):   0.32525886714534635
Lemma: viscous
Max TF Term Weight (Un-normalized):   0.2636736137729089
Lemma: wave
Max TF Term Weight (Un-normalized):   0.14233918184007752

Rank#: 2
Cosine Similarity: 0.12138531153044269
Doc#: 903  Document Headline:  two dimensional transonic unsteady flow with shock waves .
Document Vector: 
Lemma: account
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: add
Max TF Term Weight (Un-normalized):   0.32144575789611846
Lemma: agree
Max TF Term Weight (Un-normalized):   0.21886081814845823
Lemma: ahead
Max TF Term Weight (Un-normalized):   0.292442339692771
Lemma: aileron
Max TF Term Weight (Un-normalized):   0.5057474938480235
Lemma: airfoil
Max TF Term Weight (Un-normalized):   0.30530037764955487
Lemma: approach
Max TF Term Weight (Un-normalized):   0.18420899753729034
Lemma: around
Max TF Term Weight (Un-normalized):   0.22468094279044476
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: axis
Max TF Term Weight (Un-normalized):   0.2838262616291383
Lemma: be
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: behind
Max TF Term Weight (Un-normalized):   0.26415044826384476
Lemma: both
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: case
Max TF Term Weight (Un-normalized):   0.09687078217292487
Lemma: compare
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: consider
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: correction
Max TF Term Weight (Un-normalized):   0.24816706137967587
Lemma: derive
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: dynamics
Max TF Term Weight (Un-normalized):   0.3318056314958718
Lemma: eckhausw
Max TF Term Weight (Un-normalized):   0.4288706666748729
Lemma: employ
Max TF Term Weight (Un-normalized):   0.20910528650089605
Lemma: error
Max TF Term Weight (Un-normalized):   0.26089329920314475
Lemma: extend
Max TF Term Weight (Un-normalized):   0.1890247730610768
Lemma: finally
Max TF Term Weight (Un-normalized):   0.24816706137967587
Lemma: find
Max TF Term Weight (Un-normalized):   0.12223731744927563
Lemma: first
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: form
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: give
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: group
Max TF Term Weight (Un-normalized):   0.3381293907736808
Lemma: have
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: hinge
Max TF Term Weight (Un-normalized):   0.4554080290293092
Lemma: however
Max TF Term Weight (Un-normalized):   0.17344911677152813
Lemma: include
Max TF Term Weight (Un-normalized):   0.15798944089756267
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.24447463489855126
Lemma: interpretation
Max TF Term Weight (Un-normalized):   0.3163802466517528
Lemma: into
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: introduce
Max TF Term Weight (Un-normalized):   0.21251089165030795
Lemma: layer
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: local
Max TF Term Weight (Un-normalized):   0.21910809962220051
Lemma: mach
Max TF Term Weight (Un-normalized):   0.09687078217292487
Lemma: magnitude
Max TF Term Weight (Un-normalized):   0.20552496021033634
Lemma: make
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: mechanism
Max TF Term Weight (Un-normalized):   0.27021393187720183
Lemma: mit
Max TF Term Weight (Un-normalized):   0.3933142840381864
Lemma: must
Max TF Term Weight (Un-normalized):   0.23259140509012718
Lemma: neglect
Max TF Term Weight (Un-normalized):   0.30279383354939526
Lemma: number
Max TF Term Weight (Un-normalized):   0.061118658724637814
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: order
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: oscillate
Max TF Term Weight (Un-normalized):   0.32957120829773356
Lemma: part
Max TF Term Weight (Un-normalized):   0.17344911677152813
Lemma: perturbation
Max TF Term Weight (Un-normalized):   0.2857895881667505
Lemma: presence
Max TF Term Weight (Un-normalized):   0.26415044826384476
Lemma: present
Max TF Term Weight (Un-normalized):   0.061118658724637814
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: re
Max TF Term Weight (Un-normalized):   0.23969594498589836
Lemma: region
Max TF Term Weight (Un-normalized):   0.18335597617391344
Lemma: result
Max TF Term Weight (Un-normalized):   0.07577375481092581
Lemma: role
Max TF Term Weight (Un-normalized):   0.326168403240055
Lemma: shock
Max TF Term Weight (Un-normalized):   0.21919886205859476
Lemma: shockwave
Max TF Term Weight (Un-normalized):   0.40888994032773507
Lemma: show
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: simple
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: situation
Max TF Term Weight (Un-normalized):   0.307593672125787
Lemma: small
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: solution
Max TF Term Weight (Un-normalized):   0.12009855991415672
Lemma: study
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: subsonic
Max TF Term Weight (Un-normalized):   0.17344911677152813
Lemma: such
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: take
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: technique
Max TF Term Weight (Un-normalized):   0.18420899753729034
Lemma: terminate
Max TF Term Weight (Un-normalized):   0.40888994032773507
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.1101672769643373
Lemma: these
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.2725544792053522
Lemma: treat
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: two
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: unsteady
Max TF Term Weight (Un-normalized):   0.37886877405462904
Lemma: vicinity
Max TF Term Weight (Un-normalized):   0.2857895881667505
Lemma: wave
Max TF Term Weight (Un-normalized):   0.1958723147250825
Lemma: well
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: whole
Max TF Term Weight (Un-normalized):   0.29654946893251277

Rank#: 3
Cosine Similarity: 0.10181347693490925
Doc#: 520  Document Headline:  wing-tail interference as a cause of 'magnus' effects on a finned missile .
Document Vector: 
Lemma: accompany
Max TF Term Weight (Un-normalized):   0.3294363899367362
Lemma: ae
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: aileron
Max TF Term Weight (Un-normalized):   0.4526778355394476
Lemma: all
Max TF Term Weight (Un-normalized):   0.3351300994052123
Lemma: angle
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: basic
Max TF Term Weight (Un-normalized):   0.2545712251915582
Lemma: basis
Max TF Term Weight (Un-normalized):   0.21120037997930297
Lemma: behind
Max TF Term Weight (Un-normalized):   0.21120037997930297
Lemma: bentoner
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: cause
Max TF Term Weight (Un-normalized):   0.2688850473656794
Lemma: classical
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.18605464704650349
Lemma: configuration
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: cruciform
Max TF Term Weight (Un-normalized):   0.364119574313743
Lemma: cylinder
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: datum
Max TF Term Weight (Un-normalized):   0.20052064322737606
Lemma: deflect
Max TF Term Weight (Un-normalized):   0.3024791875614838
Lemma: deflection
Max TF Term Weight (Un-normalized):   0.2594283053553135
Lemma: direction
Max TF Term Weight (Un-normalized):   0.254297992827596
Lemma: due
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: effect
Max TF Term Weight (Un-normalized):   0.08717997560482328
Lemma: either
Max TF Term Weight (Un-normalized):   0.20758418124196085
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: explain
Max TF Term Weight (Un-normalized):   0.2886530064589618
Lemma: factor
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: fin
Max TF Term Weight (Un-normalized):   0.44354222458310955
Lemma: finned
Max TF Term Weight (Un-normalized):   0.5879989883390927
Lemma: fix
Max TF Term Weight (Un-normalized):   0.24860989392065738
Lemma: force
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: good
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: high
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: interference
Max TF Term Weight (Un-normalized):   0.4277826024206875
Lemma: into
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: introduce
Max TF Term Weight (Un-normalized):   0.21464010698788905
Lemma: large
Max TF Term Weight (Un-normalized):   0.17465717721743013
Lemma: larger
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: lift
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: low
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: magnus
Max TF Term Weight (Un-normalized):   0.8902024090426848
Lemma: maintain
Max TF Term Weight (Un-normalized):   0.2953724140536493
Lemma: mechanism
Max TF Term Weight (Un-normalized):   0.27292129263275205
Lemma: medium
Max TF Term Weight (Un-normalized):   0.3024791875614838
Lemma: method
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: missile
Max TF Term Weight (Un-normalized):   0.44073625290196683
Lemma: model
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: modify
Max TF Term Weight (Un-normalized):   0.20377241949759098
Lemma: movable
Max TF Term Weight (Un-normalized):   0.4129867408520162
Lemma: much
Max TF Term Weight (Un-normalized):   0.21464010698788905
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.09860708177523271
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.16486982709690284
Lemma: only
Max TF Term Weight (Un-normalized):   0.17465717721743013
Lemma: opposite
Max TF Term Weight (Un-normalized):   0.3195501626426334
Lemma: predict
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: predominant
Max TF Term Weight (Un-normalized):   0.4129867408520162
Lemma: present
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: propose
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: provide
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: rate
Max TF Term Weight (Un-normalized):   0.2250823305203585
Lemma: reveal
Max TF Term Weight (Un-normalized):   0.3294363899367362
Lemma: roll
Max TF Term Weight (Un-normalized):   0.44432609509183546
Lemma: sc
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: semiempirical
Max TF Term Weight (Un-normalized):   0.3351300994052123
Lemma: set
Max TF Term Weight (Un-normalized):   0.2688850473656794
Lemma: show
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: simple
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: simplify
Max TF Term Weight (Un-normalized):   0.22105365545283537
Lemma: slender
Max TF Term Weight (Un-normalized):   0.19091867338241522
Lemma: source
Max TF Term Weight (Un-normalized):   0.26180838604713186
Lemma: speed
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: spin
Max TF Term Weight (Un-normalized):   0.38430049401880206
Lemma: tail
Max TF Term Weight (Un-normalized):   0.49500931035883616
Lemma: test
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: than
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: thereby
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: understand
Max TF Term Weight (Un-normalized):   0.2920927334675479
Lemma: up
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: use
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: wake
Max TF Term Weight (Un-normalized):   0.23978583992068853
Lemma: water
Max TF Term Weight (Un-normalized):   0.3246664268820594
Lemma: whose
Max TF Term Weight (Un-normalized):   0.246505247515376
Lemma: wing
Max TF Term Weight (Un-normalized):   0.24347565811392066
Lemma: wingtail
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: work
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: zero
Max TF Term Weight (Un-normalized):   0.1623332134410297

Rank#: 4
Cosine Similarity: 0.08633120382466004
Doc#: 38  Document Headline:  on the prediction of mixed subsonic/supersonic pressure distributions .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: also
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: analyze
Max TF Term Weight (Un-normalized):   0.2455555343226533
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: consider
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: derive
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.1524375347397515
Lemma: empirical
Max TF Term Weight (Un-normalized):   0.5035002913572898
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: high
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: improve
Max TF Term Weight (Un-normalized):   0.3107750585362357
Lemma: introduce
Max TF Term Weight (Un-normalized):   0.241859937297283
Lemma: link
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: mechanism
Max TF Term Weight (Un-normalized):   0.3075321180629832
Lemma: mixed
Max TF Term Weight (Un-normalized):   0.3848271145813172
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: part
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: physical
Max TF Term Weight (Un-normalized):   0.25571074646193387
Lemma: prediction
Max TF Term Weight (Un-normalized):   0.31154137943027105
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.09015285085482228
Lemma: relation
Max TF Term Weight (Un-normalized):   0.3606114034192891
Lemma: result
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: rise
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: sc
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: scheme
Max TF Term Weight (Un-normalized):   0.4006547849434648
Lemma: semiempirical
Max TF Term Weight (Un-normalized):   0.377630005715336
Lemma: separately
Max TF Term Weight (Un-normalized):   0.3712142419777961
Lemma: shock
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: significance
Max TF Term Weight (Un-normalized):   0.3225656936410341
Lemma: sinnottc
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: speed
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: subsonic
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: subsonicsupersonic
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: then
Max TF Term Weight (Un-normalized):   0.1904912222483514
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.3398923811427847
Lemma: treat
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: wind
Max TF Term Weight (Un-normalized):   0.1904912222483514

Rank#: 5
Cosine Similarity: 0.08391756554419176
Doc#: 313  Document Headline:  on alternative forms for the basic equations of transonic flow theory .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: alternative
Max TF Term Weight (Un-normalized):   0.4726578178335276
Lemma: another
Max TF Term Weight (Un-normalized):   0.30030675778276167
Lemma: attention
Max TF Term Weight (Un-normalized):   0.2690326407600222
Lemma: author
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: basic
Max TF Term Weight (Un-normalized):   0.26706028089776285
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: call
Max TF Term Weight (Un-normalized):   0.32591704062033683
Lemma: certain
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: contribute
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: discussion
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: equation
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: form
Max TF Term Weight (Un-normalized):   0.2007657300479927
Lemma: have
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: indicate
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: more
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: note
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: numerous
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: possibility
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: preference
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: reason
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: selection
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: spreiterjr
Max TF Term Weight (Un-normalized):   0.4544185110361619
Lemma: theory
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: these
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: thin
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.3015997018197791
Lemma: use
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: widely
Max TF Term Weight (Un-normalized):   0.4167440331315116
Lemma: wing
Max TF Term Weight (Un-normalized):   0.1325169385539607
 ***************************** 
Processing Query:  papers on shock-sound wave interaction  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.13044765497306923
Doc#: 64  Document Headline:  unsteady oblique interaction of a shock wave with plane disturbances .
Document Vector: 
Lemma: also
Max TF Term Weight (Un-normalized):   0.09418699364706884
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.09418699364706884
Lemma: angle
Max TF Term Weight (Un-normalized):   0.15046010117987954
Lemma: appear
Max TF Term Weight (Un-normalized):   0.18837398729413768
Lemma: arbitrary
Max TF Term Weight (Un-normalized):   0.18837398729413768
Lemma: attenuate
Max TF Term Weight (Un-normalized):   0.5501163671666317
Lemma: behind
Max TF Term Weight (Un-normalized):   0.20353470700812215
Lemma: between
Max TF Term Weight (Un-normalized):   0.10934771336105333
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: computation
Max TF Term Weight (Un-normalized):   0.2354674841176721
Lemma: consider
Max TF Term Weight (Un-normalized):   0.10934771336105333
Lemma: constant
Max TF Term Weight (Un-normalized):   0.1322081601044535
Lemma: depend
Max TF Term Weight (Un-normalized):   0.20004976086095996
Lemma: disturbance
Max TF Term Weight (Un-normalized):   0.3079985387309433
Lemma: either
Max TF Term Weight (Un-normalized):   0.2472544972312778
Lemma: field
Max TF Term Weight (Un-normalized):   0.14128049047060326
Lemma: first
Max TF Term Weight (Un-normalized):   0.14128049047060326
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: impingement
Max TF Term Weight (Un-normalized):   0.445090580473629
Lemma: incidence
Max TF Term Weight (Un-normalized):   0.21869542672210665
Lemma: incident
Max TF Term Weight (Un-normalized):   0.5326751198374091
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.18837398729413768
Lemma: isentropic
Max TF Term Weight (Un-normalized):   0.39239323765499784
Lemma: mach
Max TF Term Weight (Un-normalized):   0.07464142649313295
Lemma: make
Max TF Term Weight (Un-normalized):   0.07464142649313295
Lemma: moorefk
Max TF Term Weight (Un-normalized):   0.39799708365009456
Lemma: move
Max TF Term Weight (Un-normalized):   0.2130303506086321
Lemma: naca
Max TF Term Weight (Un-normalized):   0.1322081601044535
Lemma: normal
Max TF Term Weight (Un-normalized):   0.1629167319435301
Lemma: number
Max TF Term Weight (Un-normalized):   0.04709349682353442
Lemma: oblique
Max TF Term Weight (Un-normalized):   0.37501740547926726
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.10934771336105333
Lemma: plane
Max TF Term Weight (Un-normalized):   0.24947873448902871
Lemma: present
Max TF Term Weight (Un-normalized):   0.04709349682353442
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.06552547361521086
Lemma: produce
Max TF Term Weight (Un-normalized):   0.26783293855750395
Lemma: profile
Max TF Term Weight (Un-normalized):   0.1688284201402018
Lemma: range
Max TF Term Weight (Un-normalized):   0.09418699364706884
Lemma: reflect
Max TF Term Weight (Un-normalized):   0.2915004832018514
Lemma: refract
Max TF Term Weight (Un-normalized):   0.6083222796848613
Lemma: shock
Max TF Term Weight (Un-normalized):   0.1834136271382814
Lemma: simple
Max TF Term Weight (Un-normalized):   0.1322081601044535
Lemma: sound
Max TF Term Weight (Un-normalized):   0.395472706787695
Lemma: stationary
Max TF Term Weight (Un-normalized):   0.36981634985112816
Lemma: three
Max TF Term Weight (Un-normalized):   0.15644121018458776
Lemma: tn
Max TF Term Weight (Un-normalized):   0.15644121018458776
Lemma: two
Max TF Term Weight (Un-normalized):   0.07464142649313295
Lemma: type
Max TF Term Weight (Un-normalized):   0.1634046550009061
Lemma: unsteady
Max TF Term Weight (Un-normalized):   0.2354674841176721
Lemma: vorticity
Max TF Term Weight (Un-normalized):   0.35333415301113147
Lemma: wave
Max TF Term Weight (Un-normalized):   0.24529111128565112
Lemma: weak
Max TF Term Weight (Un-normalized):   0.2846516552601974

Rank#: 2
Cosine Similarity: 0.10211711101567561
Doc#: 291  Document Headline:  sweepback effects in the turbulent boundary-layer shock-wave interaction .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: ahead
Max TF Term Weight (Un-normalized):   0.35940727096943537
Lemma: angle
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: available
Max TF Term Weight (Un-normalized):   0.2430456776896415
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.0861552073394121
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: configuration
Max TF Term Weight (Un-normalized):   0.2430456776896415
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.15370511908993897
Lemma: effect
Max TF Term Weight (Un-normalized):   0.05946125680626242
Lemma: experiment
Max TF Term Weight (Un-normalized):   0.18848772456735313
Lemma: extension
Max TF Term Weight (Un-normalized):   0.27949405318274323
Lemma: influence
Max TF Term Weight (Un-normalized):   0.22003279637648082
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.3446208293576484
Lemma: layer
Max TF Term Weight (Un-normalized):   0.1365527728748243
Lemma: moderate
Max TF Term Weight (Un-normalized):   0.3164485331545604
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: peak
Max TF Term Weight (Un-normalized):   0.35940727096943537
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.0861552073394121
Lemma: reattachment
Max TF Term Weight (Un-normalized):   0.40085609972933856
Lemma: report
Max TF Term Weight (Un-normalized):   0.2131663758962014
Lemma: rise
Max TF Term Weight (Un-normalized):   0.4268298103215316
Lemma: sc
Max TF Term Weight (Un-normalized):   0.11892251361252484
Lemma: separation
Max TF Term Weight (Un-normalized):   0.32802345272460404
Lemma: shock
Max TF Term Weight (Un-normalized):   0.20004619644222682
Lemma: show
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: simple
Max TF Term Weight (Un-normalized):   0.16692885196679202
Lemma: stalkerrj
Max TF Term Weight (Un-normalized):   0.6214421478571255
Lemma: sweep
Max TF Term Weight (Un-normalized):   0.30250693449590393
Lemma: sweepback
Max TF Term Weight (Un-normalized):   0.4239161283150899
Lemma: sweptback
Max TF Term Weight (Un-normalized):   0.3888266013642283
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theory
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.2980480483802143
Lemma: two
Max TF Term Weight (Un-normalized):   0.09424386228367657
Lemma: understand
Max TF Term Weight (Un-normalized):   0.35541657653414516
Lemma: upstream
Max TF Term Weight (Un-normalized):   0.30741023817987795
Lemma: wave
Max TF Term Weight (Un-normalized):   0.22270798021423638

Rank#: 3
Cosine Similarity: 0.09873590535584115
Doc#: 256  Document Headline:  an experimental study of the glancing interaction between a shock wave and a turbulent boundary layer .
Document Vector: 
Lemma: arc
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: between
Max TF Term Weight (Un-normalized):   0.15703634026772897
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.09289476646621148
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: cp
Max TF Term Weight (Un-normalized):   0.3028140864267262
Lemma: design
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: find
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: from
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: fuselage
Max TF Term Weight (Un-normalized):   0.4087936804459398
Lemma: glance
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: have
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: important
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.313650996574927
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: junction
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: layer
Max TF Term Weight (Un-normalized):   0.14723472136219434
Lemma: least
Max TF Term Weight (Un-normalized):   0.2831629163384759
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: make
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: may
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: mount
Max TF Term Weight (Un-normalized):   0.3142149337600577
Lemma: number
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: occur
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: plate
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: produce
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: regard
Max TF Term Weight (Un-normalized):   0.27465249093460986
Lemma: region
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: separate
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: shape
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: shock
Max TF Term Weight (Un-normalized):   0.2007657300479927
Lemma: side
Max TF Term Weight (Un-normalized):   0.36469251373443884
Lemma: stanbrooka
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: strength
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: study
Max TF Term Weight (Un-normalized):   0.15703634026772897
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: therefore
Max TF Term Weight (Un-normalized):   0.26706028089776285
Lemma: these
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: three
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.23396783130083135
Lemma: type
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: under
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: up
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: waisted
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: wall
Max TF Term Weight (Un-normalized):   0.18986666458933038
Lemma: wave
Max TF Term Weight (Un-normalized):   0.2235090245674224
Lemma: wind
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: wing
Max TF Term Weight (Un-normalized):   0.1325169385539607

Rank#: 4
Cosine Similarity: 0.08634055116057844
Doc#: 65  Document Headline:  convection of a pattern of vorticity through a shock wave .
Document Vector: 
Lemma: acoustically
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: application
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: arbitrary
Max TF Term Weight (Un-normalized):   0.20094157607166993
Lemma: can
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: convection
Max TF Term Weight (Un-normalized):   0.2835213394737957
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: fourier
Max TF Term Weight (Un-normalized):   0.32366380514913956
Lemma: generation
Max TF Term Weight (Un-normalized):   0.35814234142147783
Lemma: indicate
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: integral
Max TF Term Weight (Un-normalized):   0.20094157607166993
Lemma: intense
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: length
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: modification
Max TF Term Weight (Un-normalized):   0.26734915478169163
Lemma: naca
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: noise
Max TF Term Weight (Un-normalized):   0.2805627917990211
Lemma: orientation
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: passage
Max TF Term Weight (Un-normalized):   0.3839921275096307
Lemma: pattern
Max TF Term Weight (Un-normalized):   0.23886364718205333
Lemma: plane
Max TF Term Weight (Un-normalized):   0.24864362329804654
Lemma: refraction
Max TF Term Weight (Un-normalized):   0.44529588362487266
Lemma: represent
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: representative
Max TF Term Weight (Un-normalized):   0.3109482756171199
Lemma: ribnerh
Max TF Term Weight (Un-normalized):   0.4245499201314995
Lemma: shear
Max TF Term Weight (Un-normalized):   0.2864386316341419
Lemma: shock
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: show
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: simultaneous
Max TF Term Weight (Un-normalized):   0.2942779834397059
Lemma: single
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: sinusoidal
Max TF Term Weight (Un-normalized):   0.34451337745762345
Lemma: sound
Max TF Term Weight (Un-normalized):   0.2636317064153084
Lemma: spatial
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: term
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: through
Max TF Term Weight (Un-normalized):   0.20701554073023642
Lemma: tn
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: treat
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: turbulence
Max TF Term Weight (Un-normalized):   0.2708851904029723
Lemma: vorticity
Max TF Term Weight (Un-normalized):   0.3521513936631647
Lemma: wave
Max TF Term Weight (Un-normalized):   0.24168444234166808
Lemma: weak
Max TF Term Weight (Un-normalized):   0.39473600051620106
Lemma: wind
Max TF Term Weight (Un-normalized):   0.17378591044028668

Rank#: 5
Cosine Similarity: 0.08631545386461448
Doc#: 335  Document Headline:  the interaction between boundary layer and shock waves in transonic flow .
Document Vector: 
Lemma: aero
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: arc
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: between
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.09289476646621148
Lemma: can
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: change
Max TF Term Weight (Un-normalized):   0.23396783130083135
Lemma: circular
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: considerably
Max TF Term Weight (Un-normalized):   0.2690326407600222
Lemma: december
Max TF Term Weight (Un-normalized):   0.4167440331315116
Lemma: dependent
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: discernible
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: distinctly
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: experiment
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: free
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: from
Max TF Term Weight (Un-normalized):   0.07841274914373175
Lemma: give
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: interact
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: interaction
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: jet
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: layer
Max TF Term Weight (Un-normalized):   0.13704393097126094
Lemma: liepmann
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: manner
Max TF Term Weight (Un-normalized):   0.231898366652749
Lemma: measurement
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: not
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: number
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: past
Max TF Term Weight (Un-normalized):   0.20505819874290784
Lemma: pattern
Max TF Term Weight (Un-normalized):   0.32158193587848233
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: profile
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: reflection
Max TF Term Weight (Un-normalized):   0.3173185686446376
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: shock
Max TF Term Weight (Un-normalized):   0.2007657300479927
Lemma: show
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: similar
Max TF Term Weight (Un-normalized):   0.1837814882396877
Lemma: state
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: strongly
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: these
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.3015997018197791
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: upon
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: wave
Max TF Term Weight (Un-normalized):   0.2235090245674224
 ***************************** 
Processing Query:  material properties of photoelastic materials  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.13685736541210733
Doc#: 462  Document Headline:  photo-thermoelasticity .
Document Vector: 
Lemma: also
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: application
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: apply
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: be
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: beam
Max TF Term Weight (Un-normalized):   0.4238344958901617
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calibration
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: contracting
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: correlate
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: datum
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: depth
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: description
Max TF Term Weight (Un-normalized):   0.2764347244412529
Lemma: develop
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: differential
Max TF Term Weight (Un-normalized):   0.25026765988048966
Lemma: disk
Max TF Term Weight (Un-normalized):   0.3405942957455311
Lemma: edge
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: elastic
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: elasticity
Max TF Term Weight (Un-normalized):   0.3730072410937117
Lemma: equipment
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: expansion
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: exploratory
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: field
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: fringe
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: from
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: function
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: gerardg
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: gilbertac
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: include
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: inclusion
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: into
Max TF Term Weight (Un-normalized):   0.15379364905718088
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.15703634026772897
Lemma: jappmech
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: length
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: long
Max TF Term Weight (Un-normalized):   0.231898366652749
Lemma: material
Max TF Term Weight (Un-normalized):   0.34441368423199337
Lemma: model
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: modulus
Max TF Term Weight (Un-normalized):   0.3455982692790496
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: optical
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: over
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: paper
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: paraplex
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: phase
Max TF Term Weight (Un-normalized):   0.3142149337600577
Lemma: phenomenon
Max TF Term Weight (Un-normalized):   0.22861075378373358
Lemma: photo
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: photoelastic
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: photographic
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: physical
Max TF Term Weight (Un-normalized):   0.23806519637407705
Lemma: plane
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: plastic
Max TF Term Weight (Un-normalized):   0.28631058761114164
Lemma: present
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: produce
Max TF Term Weight (Un-normalized):   0.27644275763045306
Lemma: property
Max TF Term Weight (Un-normalized):   0.2424577196640562
Lemma: range
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: result
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: room
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: shock
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: stress
Max TF Term Weight (Un-normalized):   0.21438795725232157
Lemma: sudden
Max TF Term Weight (Un-normalized):   0.3515713074684887
Lemma: suddenly
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: summarize
Max TF Term Weight (Un-normalized):   0.3302945969652685
Lemma: technique
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.21569496812589684
Lemma: theory
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.313650996574927
Lemma: thermoelasticity
Max TF Term Weight (Un-normalized):   0.5357766313185501
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transient
Max TF Term Weight (Un-normalized):   0.27282624724421944
Lemma: upon
Max TF Term Weight (Un-normalized):   0.2820198277712692
Lemma: upper
Max TF Term Weight (Un-normalized):   0.2608064915995677
Lemma: use
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: value
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: various
Max TF Term Weight (Un-normalized):   0.15379364905718088

Rank#: 2
Cosine Similarity: 0.08324771195518783
Doc#: 1099  Document Headline:  a theoretical study of stagnation point ablation .
Document Vector: 
Lemma: ablation
Max TF Term Weight (Un-normalized):   0.6107326133229258
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: automatic
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: capacity
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: effective
Max TF Term Weight (Un-normalized):   0.27264250675093227
Lemma: enthalpy
Max TF Term Weight (Un-normalized):   0.280658581339866
Lemma: give
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: good
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: heat
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: increase
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: linearly
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: make
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: material
Max TF Term Weight (Un-normalized):   0.31166881026124343
Lemma: mechanism
Max TF Term Weight (Un-normalized):   0.39629618044595005
Lemma: most
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: place
Max TF Term Weight (Un-normalized):   0.28437065120538046
Lemma: point
Max TF Term Weight (Un-normalized):   0.18342303381616776
Lemma: property
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: result
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: robert
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: shield
Max TF Term Weight (Un-normalized):   0.5996786340694428
Lemma: significant
Max TF Term Weight (Un-normalized):   0.3253384649026893
Lemma: simplify
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.2357164288121836
Lemma: stream
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: study
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: take
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.21094503821612123
Lemma: tr
Max TF Term Weight (Un-normalized):   0.35037212446361077
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.13632125337546613

Rank#: 3
Cosine Similarity: 0.08255596418526313
Doc#: 1025  Document Headline:  note on creep buckling of columns .
Document Vector: 
Lemma: aid
Max TF Term Weight (Un-normalized):   0.300271012112406
Lemma: alloy
Max TF Term Weight (Un-normalized):   0.4847217967400945
Lemma: aluminum
Max TF Term Weight (Un-normalized):   0.3337567334917133
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.15046594683079464
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: approach
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: be
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: because
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: before
Max TF Term Weight (Un-normalized):   0.3109482756171199
Lemma: buckle
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: carry
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: characterize
Max TF Term Weight (Un-normalized):   0.30790694740356045
Lemma: collapse
Max TF Term Weight (Un-normalized):   0.5363571596846642
Lemma: column
Max TF Term Weight (Un-normalized):   0.4906618313349868
Lemma: conclusion
Max TF Term Weight (Un-normalized):   0.23886364718205333
Lemma: constant
Max TF Term Weight (Un-normalized):   0.2624773119932463
Lemma: creep
Max TF Term Weight (Un-normalized):   0.43984367450295425
Lemma: crooked
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: deflection
Max TF Term Weight (Un-normalized):   0.2723216727794314
Lemma: eab
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: engineering
Max TF Term Weight (Un-normalized):   0.2942779834397059
Lemma: finite
Max TF Term Weight (Un-normalized):   0.20094157607166993
Lemma: form
Max TF Term Weight (Un-normalized):   0.17468555463512508
Lemma: formulate
Max TF Term Weight (Un-normalized):   0.30364252018555526
Lemma: from
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: give
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: growth
Max TF Term Weight (Un-normalized):   0.29173476271145626
Lemma: have
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: however
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: hypothesis
Max TF Term Weight (Un-normalized):   0.35814234142147783
Lemma: in
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: infinity
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: intend
Max TF Term Weight (Un-normalized):   0.34451337745762345
Lemma: know
Max TF Term Weight (Un-normalized):   0.19626418845529023
Lemma: lateral
Max TF Term Weight (Un-normalized):   0.27588540418264135
Lemma: lead
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: least
Max TF Term Weight (Un-normalized):   0.277478311244903
Lemma: length
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: load
Max TF Term Weight (Un-normalized):   0.18333749124885151
Lemma: low
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: material
Max TF Term Weight (Un-normalized):   0.3630137424581729
Lemma: maximum
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: necessary
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: note
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: prior
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: property
Max TF Term Weight (Un-normalized):   0.2341200344635083
Lemma: relationship
Max TF Term Weight (Un-normalized):   0.3704441584219908
Lemma: result
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: same
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: section
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: select
Max TF Term Weight (Un-normalized):   0.3148144910979904
Lemma: shanley
Max TF Term Weight (Un-normalized):   0.44529588362487266
Lemma: show
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: slightly
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: steel
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: strain
Max TF Term Weight (Un-normalized):   0.423922054096528
Lemma: stress
Max TF Term Weight (Un-normalized):   0.28075314879712693
Lemma: study
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: support
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theoretically
Max TF Term Weight (Un-normalized):   0.2849565220911584
Lemma: time
Max TF Term Weight (Un-normalized):   0.28075314879712693
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: total
Max TF Term Weight (Un-normalized):   0.20094157607166993
Lemma: two
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: under
Max TF Term Weight (Un-normalized):   0.18333749124885151
Lemma: uniaxial
Max TF Term Weight (Un-normalized):   0.5308920301698865
Lemma: variable
Max TF Term Weight (Un-normalized):   0.20094157607166993

Rank#: 4
Cosine Similarity: 0.08096464345808381
Doc#: 463  Document Headline:  physical properties of plastics for photo-thermoelastic investigation .
Document Vector: 
Lemma: also
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: application
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: be
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: castolite
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: conduction
Max TF Term Weight (Un-normalized):   0.2753215603715094
Lemma: determine
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: elasticity
Max TF Term Weight (Un-normalized):   0.4006547849434648
Lemma: epoxy
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: evaluate
Max TF Term Weight (Un-normalized):   0.26750138156673225
Lemma: expansion
Max TF Term Weight (Un-normalized):   0.22961405160585316
Lemma: figure
Max TF Term Weight (Un-normalized):   0.5063865293673488
Lemma: fringe
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: from
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: function
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: gerardg
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: heat
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: hysol
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: importance
Max TF Term Weight (Un-normalized):   0.2753215603715094
Lemma: interest
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: japp
Max TF Term Weight (Un-normalized):   0.5204244381420449
Lemma: manner
Max TF Term Weight (Un-normalized):   0.2490868272357628
Lemma: material
Max TF Term Weight (Un-normalized):   0.33477701986142655
Lemma: mech
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: merit
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: method
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: modulus
Max TF Term Weight (Un-normalized):   0.3712142419777961
Lemma: new
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: op
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: optical
Max TF Term Weight (Un-normalized):   0.5826052967372245
Lemma: over
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: paraplex
Max TF Term Weight (Un-normalized):   0.5204244381420449
Lemma: photo
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: photothermoelastic
Max TF Term Weight (Un-normalized):   0.7619007749076367
Lemma: physical
Max TF Term Weight (Un-normalized):   0.3539489946275973
Lemma: plastic
Max TF Term Weight (Un-normalized):   0.3075321180629832
Lemma: potentially
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: present
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: property
Max TF Term Weight (Un-normalized):   0.32319458964764514
Lemma: range
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: rate
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: relative
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: resin
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: sensitivity
Max TF Term Weight (Un-normalized):   0.44763337698537986
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.304875069479503
Lemma: thermoelastic
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tramposchh
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: value
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: well
Max TF Term Weight (Un-normalized):   0.16519293622290562

Rank#: 5
Cosine Similarity: 0.07854861831734168
Doc#: 1043  Document Headline:  on transverse vibrations of thin, shallow elastic shells .
Document Vector: 
Lemma: accuracy
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: algebraic
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: also
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: arbitrarily
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: avoid
Max TF Term Weight (Un-normalized):   0.3028140864267262
Lemma: basic
Max TF Term Weight (Un-normalized):   0.26706028089776285
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: computation
Max TF Term Weight (Un-normalized):   0.2563227484286348
Lemma: computer
Max TF Term Weight (Un-normalized):   0.28153737592350603
Lemma: consider
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: convergence
Max TF Term Weight (Un-normalized):   0.3098631426519673
Lemma: datum
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: demonstrate
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: determine
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: differential
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: direct
Max TF Term Weight (Un-normalized):   0.2563227484286348
Lemma: direction
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: discrete
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: displacement
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: elastic
Max TF Term Weight (Un-normalized):   0.2820198277712692
Lemma: employ
Max TF Term Weight (Un-normalized):   0.22156169755849245
Lemma: equation
Max TF Term Weight (Un-normalized):   0.1242812669712698
Lemma: exact
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: form
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: general
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: geometry
Max TF Term Weight (Un-normalized):   0.2464468852587461
Lemma: give
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: have
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: hence
Max TF Term Weight (Un-normalized):   0.2977114349444731
Lemma: high
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: know
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: language
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: layer
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: load
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: make
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: material
Max TF Term Weight (Un-normalized):   0.2970606432154912
Lemma: matrix
Max TF Term Weight (Un-normalized):   0.3405942957455311
Lemma: may
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: meridional
Max TF Term Weight (Un-normalized):   0.4167440331315116
Lemma: method
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: most
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: multus
Max TF Term Weight (Un-normalized):   0.516968292092301
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.23523824743119529
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: permit
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: point
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: program
Max TF Term Weight (Un-normalized):   0.32126398998529876
Lemma: property
Max TF Term Weight (Un-normalized):   0.2424577196640562
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.2820198277712692
Lemma: rotationally
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: sectional
Max TF Term Weight (Un-normalized):   0.3352270317749069
Lemma: semus
Max TF Term Weight (Un-normalized):   0.27282624724421944
Lemma: shallow
Max TF Term Weight (Un-normalized):   0.3142149337600577
Lemma: shell
Max TF Term Weight (Un-normalized):   0.3437514834390102
Lemma: slow
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: solution
Max TF Term Weight (Un-normalized):   0.14723472136219434
Lemma: specify
Max TF Term Weight (Un-normalized):   0.3173185686446376
Lemma: speed
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: strain
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: stress
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: subject
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: symmetric
Max TF Term Weight (Un-normalized):   0.23806519637407705
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.18206876523418575
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.20289561155684308
Lemma: thin
Max TF Term Weight (Un-normalized):   0.26048151437791756
Lemma: through
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.23504603792541467
Lemma: two
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: use
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: vary
Max TF Term Weight (Un-normalized):   0.21438795725232157
Lemma: very
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: vibration
Max TF Term Weight (Un-normalized):   0.24904220809703476
 ***************************** 
Processing Query:  can the transverse potential flow about a body of revolution be calculated efficiently by an electronic computer  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.19646450490524361
Doc#: 498  Document Headline:  calculation of potential flow about bodies of revolution having axes perpendicular to the free-stream direction .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.20454273607309637
Lemma: accuracy
Max TF Term Weight (Un-normalized):   0.20627465361109093
Lemma: ae
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: after
Max TF Term Weight (Un-normalized):   0.2473361673648132
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: aid
Max TF Term Weight (Un-normalized):   0.29567950150902267
Lemma: also
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: analytic
Max TF Term Weight (Un-normalized):   0.2833443784404361
Lemma: angle
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: arbitrary
Max TF Term Weight (Un-normalized):   0.19786893389185056
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: axis
Max TF Term Weight (Un-normalized):   0.2952108837982247
Lemma: axisymmetric
Max TF Term Weight (Un-normalized):   0.23521113020719245
Lemma: basic
Max TF Term Weight (Un-normalized):   0.2576972459040783
Lemma: body
Max TF Term Weight (Un-normalized):   0.1878017980156649
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.22059574503584287
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: case
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: certain
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: combine
Max TF Term Weight (Un-normalized):   0.24031088009319101
Lemma: compare
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: computer
Max TF Term Weight (Un-normalized):   0.27166677931535277
Lemma: datum
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: derive
Max TF Term Weight (Un-normalized):   0.14840170041888792
Lemma: describe
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: direction
Max TF Term Weight (Un-normalized):   0.2598408453118896
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.1271404073400238
Lemma: electronic
Max TF Term Weight (Un-normalized):   0.3599297447340222
Lemma: ellipsoid
Max TF Term Weight (Un-normalized):   0.4384867655654138
Lemma: equation
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: exhibit
Max TF Term Weight (Un-normalized):   0.3934884078896442
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: forward
Max TF Term Weight (Un-normalized):   0.2427303027192513
Lemma: free
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: general
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: have
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: hessjl
Max TF Term Weight (Un-normalized):   0.5169925001442313
Lemma: make
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: method
Max TF Term Weight (Un-normalized):   0.11547972218388075
Lemma: off
Max TF Term Weight (Un-normalized):   0.2650232758559818
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: other
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: perpendicular
Max TF Term Weight (Un-normalized):   0.4285564293601822
Lemma: point
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: possible
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: potential
Max TF Term Weight (Un-normalized):   0.291466999990211
Lemma: present
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.0635702036700119
Lemma: property
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: quite
Max TF Term Weight (Un-normalized):   0.27323532888264646
Lemma: region
Max TF Term Weight (Un-normalized):   0.14840170041888792
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.3327513784113987
Lemma: satisfactory
Max TF Term Weight (Un-normalized):   0.2378065483168196
Lemma: sc
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: select
Max TF Term Weight (Un-normalized):   0.3100005929337746
Lemma: separate
Max TF Term Weight (Un-normalized):   0.2172757914399585
Lemma: solution
Max TF Term Weight (Un-normalized):   0.10075638898017529
Lemma: stream
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: then
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: these
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: type
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: variety
Max TF Term Weight (Un-normalized):   0.29567950150902267
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: whose
Max TF Term Weight (Un-normalized):   0.24953222163194438

Rank#: 2
Cosine Similarity: 0.12152908506807711
Doc#: 106  Document Headline:  the transverse potential flow past a body of revolution .
Document Vector: 
Lemma: along
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: angle
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: axis
Max TF Term Weight (Un-normalized):   0.25571074646193387
Lemma: azimuthal
Max TF Term Weight (Un-normalized):   0.5204244381420449
Lemma: body
Max TF Term Weight (Un-normalized):   0.18030570170964455
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: campbellij
Max TF Term Weight (Un-normalized):   0.5204244381420449
Lemma: component
Max TF Term Weight (Un-normalized):   0.2490868272357628
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: elementary
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: entirely
Max TF Term Weight (Un-normalized):   0.377630005715336
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: incompressible
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: manner
Max TF Term Weight (Un-normalized):   0.2490868272357628
Lemma: meridian
Max TF Term Weight (Un-normalized):   0.44763337698537986
Lemma: past
Max TF Term Weight (Un-normalized):   0.304875069479503
Lemma: perpendicular
Max TF Term Weight (Un-normalized):   0.3712142419777961
Lemma: potential
Max TF Term Weight (Un-normalized):   0.3494601902420696
Lemma: qjmechappmath
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.3178265436347604
Lemma: right
Max TF Term Weight (Un-normalized):   0.4102958139934412
Lemma: round
Max TF Term Weight (Un-normalized):   0.3658393706105377
Lemma: set
Max TF Term Weight (Un-normalized):   0.23798399737957068
Lemma: show
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: simple
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: stream
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: surface
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.2524678059886813
Lemma: vary
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.11012862414860375

Rank#: 3
Cosine Similarity: 0.09855702467269922
Doc#: 1006  Document Headline:  free-flight measurements of the static and dynamic
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: angle
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: axisymmetric
Max TF Term Weight (Un-normalized):   0.261824609297327
Lemma: be
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: blunt
Max TF Term Weight (Un-normalized):   0.29948128808882435
Lemma: body
Max TF Term Weight (Un-normalized):   0.18030570170964455
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: computation
Max TF Term Weight (Un-normalized):   0.2753215603715094
Lemma: computer
Max TF Term Weight (Un-normalized):   0.30240511276251825
Lemma: consist
Max TF Term Weight (Un-normalized):   0.25571074646193387
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: dynamic
Max TF Term Weight (Un-normalized):   0.241859937297283
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: field
Max TF Term Weight (Un-normalized):   0.22865630210962726
Lemma: flight
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: free
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: fuller
Max TF Term Weight (Un-normalized):   0.43303600007964416
Lemma: gas
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: good
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: have
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: ibm
Max TF Term Weight (Un-normalized):   0.4102958139934412
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: measurement
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: method
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: nose
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: number
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: numerically
Max TF Term Weight (Un-normalized):   0.30415113931006466
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: perfect
Max TF Term Weight (Un-normalized):   0.3075321180629832
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: region
Max TF Term Weight (Un-normalized):   0.22865630210962726
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: shape
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: shock
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: static
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: study
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: subsonic
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: surface
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: survey
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.2455555343226533
Lemma: two
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: wave
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: zero
Max TF Term Weight (Un-normalized):   0.18291968530526884

Rank#: 4
Cosine Similarity: 0.08883186736292946
Doc#: 1043  Document Headline:  on transverse vibrations of thin, shallow elastic shells .
Document Vector: 
Lemma: accuracy
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: algebraic
Max TF Term Weight (Un-normalized):   0.35827177336291083
Lemma: also
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: arbitrarily
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: avoid
Max TF Term Weight (Un-normalized):   0.3028140864267262
Lemma: basic
Max TF Term Weight (Un-normalized):   0.26706028089776285
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: can
Max TF Term Weight (Un-normalized):   0.1352637410378954
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.17029714787276554
Lemma: computation
Max TF Term Weight (Un-normalized):   0.2563227484286348
Lemma: computer
Max TF Term Weight (Un-normalized):   0.28153737592350603
Lemma: consider
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: convergence
Max TF Term Weight (Un-normalized):   0.3098631426519673
Lemma: datum
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: demonstrate
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: determine
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: differential
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: direct
Max TF Term Weight (Un-normalized):   0.2563227484286348
Lemma: direction
Max TF Term Weight (Un-normalized):   0.20954194191384073
Lemma: discrete
Max TF Term Weight (Un-normalized):   0.3819829822613693
Lemma: displacement
Max TF Term Weight (Un-normalized):   0.21376932742219448
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: elastic
Max TF Term Weight (Un-normalized):   0.2820198277712692
Lemma: employ
Max TF Term Weight (Un-normalized):   0.22156169755849245
Lemma: equation
Max TF Term Weight (Un-normalized):   0.1242812669712698
Lemma: exact
Max TF Term Weight (Un-normalized):   0.18970137578968152
Lemma: form
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: general
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: geometry
Max TF Term Weight (Un-normalized):   0.2464468852587461
Lemma: give
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: have
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: hence
Max TF Term Weight (Un-normalized):   0.2977114349444731
Lemma: high
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: know
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: language
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: layer
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: load
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: make
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: material
Max TF Term Weight (Un-normalized):   0.2970606432154912
Lemma: matrix
Max TF Term Weight (Un-normalized):   0.3405942957455311
Lemma: may
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: meridional
Max TF Term Weight (Un-normalized):   0.4167440331315116
Lemma: method
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: most
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: multus
Max TF Term Weight (Un-normalized):   0.516968292092301
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.23523824743119529
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: permit
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: point
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: program
Max TF Term Weight (Un-normalized):   0.32126398998529876
Lemma: property
Max TF Term Weight (Un-normalized):   0.2424577196640562
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.2820198277712692
Lemma: rotationally
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: sectional
Max TF Term Weight (Un-normalized):   0.3352270317749069
Lemma: semus
Max TF Term Weight (Un-normalized):   0.27282624724421944
Lemma: shallow
Max TF Term Weight (Un-normalized):   0.3142149337600577
Lemma: shell
Max TF Term Weight (Un-normalized):   0.3437514834390102
Lemma: slow
Max TF Term Weight (Un-normalized):   0.3654794834457846
Lemma: solution
Max TF Term Weight (Un-normalized):   0.14723472136219434
Lemma: specify
Max TF Term Weight (Un-normalized):   0.3173185686446376
Lemma: speed
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: strain
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: stress
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: subject
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: symmetric
Max TF Term Weight (Un-normalized):   0.23806519637407705
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.18206876523418575
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.20289561155684308
Lemma: thin
Max TF Term Weight (Un-normalized):   0.26048151437791756
Lemma: through
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.23504603792541467
Lemma: two
Max TF Term Weight (Un-normalized):   0.10719397862616079
Lemma: use
Max TF Term Weight (Un-normalized):   0.0676318705189477
Lemma: vary
Max TF Term Weight (Un-normalized):   0.21438795725232157
Lemma: very
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: vibration
Max TF Term Weight (Un-normalized):   0.24904220809703476

Rank#: 5
Cosine Similarity: 0.08370215384034538
Doc#: 93  Document Headline:  the supersonic blunt body problem - review and extensions .
Document Vector: 
Lemma: adequate
Max TF Term Weight (Un-normalized):   0.3600742814782735
Lemma: ae
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.241859937297283
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: blunt
Max TF Term Weight (Un-normalized):   0.2531932646836744
Lemma: body
Max TF Term Weight (Un-normalized):   0.18030570170964455
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: computer
Max TF Term Weight (Un-normalized):   0.30240511276251825
Lemma: conic
Max TF Term Weight (Un-normalized):   0.48810031215394606
Lemma: describe
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: detach
Max TF Term Weight (Un-normalized):   0.35007422761089363
Lemma: detail
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: dykemd
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: electronic
Max TF Term Weight (Un-normalized):   0.4006547849434648
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: exist
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: extension
Max TF Term Weight (Un-normalized):   0.25882647952616467
Lemma: failure
Max TF Term Weight (Un-normalized):   0.2950099155365918
Lemma: field
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: forth
Max TF Term Weight (Un-normalized):   0.44763337698537986
Lemma: from
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: full
Max TF Term Weight (Un-normalized):   0.30240511276251825
Lemma: give
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: indicate
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: medium
Max TF Term Weight (Un-normalized):   0.3408384311953472
Lemma: method
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: number
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: other
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: plausible
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: predict
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: problem
Max TF Term Weight (Un-normalized):   0.1524375347397515
Lemma: propose
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: reason
Max TF Term Weight (Un-normalized):   0.4006547849434648
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: review
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: sc
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: section
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: set
Max TF Term Weight (Un-normalized):   0.23798399737957068
Lemma: shock
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: simpler
Max TF Term Weight (Un-normalized):   0.35007422761089363
Lemma: size
Max TF Term Weight (Un-normalized):   0.2801376415570232
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: solve
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: support
Max TF Term Weight (Un-normalized):   0.23798399737957068
Lemma: survey
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: than
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: treatment
Max TF Term Weight (Un-normalized):   0.2801376415570232
Lemma: use
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: van
Max TF Term Weight (Un-normalized):   0.3225656936410341
Lemma: various
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: wave
Max TF Term Weight (Un-normalized):   0.14233918184007752
 ***************************** 
Processing Query:  can the three-dimensional problem of a transverse potential flow about a body of revolution be reduced to a two-dimensional problem  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.10991421917596676
Doc#: 1108  Document Headline:  a study of second-order supersonic flow theory .
Document Vector: 
Lemma: adopt
Max TF Term Weight (Un-normalized):   0.3735335934203326
Lemma: again
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: agree
Max TF Term Weight (Un-normalized):   0.22105365545283537
Lemma: also
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: attempt
Max TF Term Weight (Un-normalized):   0.25645134778023415
Lemma: axially
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: body
Max TF Term Weight (Un-normalized):   0.16563029227146853
Lemma: briefly
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: busemann
Max TF Term Weight (Un-normalized):   0.38430049401880206
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: can
Max TF Term Weight (Un-normalized):   0.1551439474819728
Lemma: case
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: cone
Max TF Term Weight (Un-normalized):   0.21522556928607608
Lemma: consider
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: considerable
Max TF Term Weight (Un-normalized):   0.24860989392065738
Lemma: corner
Max TF Term Weight (Un-normalized):   0.31067555258540513
Lemma: derive
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: detail
Max TF Term Weight (Un-normalized):   0.18083000397124185
Lemma: develop
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: discovery
Max TF Term Weight (Un-normalized):   0.4331676605570754
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: down
Max TF Term Weight (Un-normalized):   0.3062401015439473
Lemma: equation
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: equivalent
Max TF Term Weight (Un-normalized):   0.2526395860358643
Lemma: example
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: exist
Max TF Term Weight (Un-normalized):   0.18083000397124185
Lemma: find
Max TF Term Weight (Un-normalized):   0.12442828360969624
Lemma: first
Max TF Term Weight (Un-normalized):   0.2484454384072028
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: full
Max TF Term Weight (Un-normalized):   0.26837129986207403
Lemma: general
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: give
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: have
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: improvement
Max TF Term Weight (Un-normalized):   0.31067555258540513
Lemma: inclined
Max TF Term Weight (Un-normalized):   0.4347950201322141
Lemma: insight
Max TF Term Weight (Un-normalized):   0.39725502702580645
Lemma: insofar
Max TF Term Weight (Un-normalized):   0.4331676605570754
Lemma: integral
Max TF Term Weight (Un-normalized):   0.2840222786569982
Lemma: into
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: isolate
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: iteration
Max TF Term Weight (Un-normalized):   0.4869548473056303
Lemma: karman
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: know
Max TF Term Weight (Un-normalized):   0.19091867338241522
Lemma: linearize
Max TF Term Weight (Un-normalized):   0.29582124532569815
Lemma: make
Max TF Term Weight (Un-normalized):   0.07745262647965885
Lemma: method
Max TF Term Weight (Un-normalized):   0.12294866948638969
Lemma: modification
Max TF Term Weight (Un-normalized):   0.2600675465175763
Lemma: moore
Max TF Term Weight (Un-normalized):   0.4618539073902895
Lemma: more
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: naca
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: nature
Max TF Term Weight (Un-normalized):   0.2600675465175763
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: once
Max TF Term Weight (Un-normalized):   0.3351300994052123
Lemma: only
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: order
Max TF Term Weight (Un-normalized):   0.26442263166937224
Lemma: other
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: over
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: partial
Max TF Term Weight (Un-normalized):   0.275799260343786
Lemma: particular
Max TF Term Weight (Un-normalized):   0.2545523045886784
Lemma: plane
Max TF Term Weight (Un-normalized):   0.23687131902227823
Lemma: possibility
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: problem
Max TF Term Weight (Un-normalized):   0.17435995120964656
Lemma: process
Max TF Term Weight (Un-normalized):   0.2642811646980951
Lemma: readily
Max TF Term Weight (Un-normalized):   0.3246664268820594
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.2456389127958582
Lemma: represent
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: result
Max TF Term Weight (Un-normalized):   0.06221414180484812
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.2594283053553135
Lemma: second
Max TF Term Weight (Un-normalized):   0.3064524560243299
Lemma: secondorder
Max TF Term Weight (Un-normalized):   0.4331676605570754
Lemma: several
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: slight
Max TF Term Weight (Un-normalized):   0.3195501626426334
Lemma: smooth
Max TF Term Weight (Un-normalized):   0.2837889801230501
Lemma: solution
Max TF Term Weight (Un-normalized):   0.14928641627927297
Lemma: solve
Max TF Term Weight (Un-normalized):   0.254297992827596
Lemma: step
Max TF Term Weight (Un-normalized):   0.2651661834487901
Lemma: study
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.1444567637559832
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09773433307654658
Lemma: symmetric
Max TF Term Weight (Un-normalized):   0.22693209380551274
Lemma: term
Max TF Term Weight (Un-normalized):   0.14660149961481989
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: then
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: theory
Max TF Term Weight (Un-normalized):   0.11254116526017925
Lemma: thereby
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: three
Max TF Term Weight (Un-normalized):   0.20667090556083137
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: treat
Max TF Term Weight (Un-normalized):   0.254297992827596
Lemma: use
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: vandykemd
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: von
Max TF Term Weight (Un-normalized):   0.2651661834487901
Lemma: well
Max TF Term Weight (Un-normalized):   0.18664242541454437
Lemma: wing
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: write
Max TF Term Weight (Un-normalized):   0.31067555258540513

Rank#: 2
Cosine Similarity: 0.10377610030638454
Doc#: 336  Document Headline:  simplified laminar boundary layer calculations for bodies of revolution and for yawed wings .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: also
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: body
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.0829598817736689
Lemma: boundarylayer
Max TF Term Weight (Un-normalized):   0.29914249513506797
Lemma: briefly
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.21444818344919464
Lemma: case
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: compressible
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: crabtreelf
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: elementary
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: especially
Max TF Term Weight (Un-normalized):   0.32323546006171977
Lemma: extend
Max TF Term Weight (Un-normalized):   0.2060347964992109
Lemma: here
Max TF Term Weight (Un-normalized):   0.33527351264378497
Lemma: improvement
Max TF Term Weight (Un-normalized):   0.33527351264378497
Lemma: introduction
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: karman
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: layer
Max TF Term Weight (Un-normalized):   0.13148830167552575
Lemma: method
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: momentum
Max TF Term Weight (Un-normalized):   0.2448996053555501
Lemma: pohlhausen
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: problem
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: propose
Max TF Term Weight (Un-normalized):   0.35153845253790383
Lemma: quadrature
Max TF Term Weight (Un-normalized):   0.403108384017641
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.219906247196902
Lemma: rottn
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: simple
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: simplify
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: since
Max TF Term Weight (Un-normalized):   0.25352191693797493
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: these
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: three
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: von
Max TF Term Weight (Un-normalized):   0.28616090651285647
Lemma: wing
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: yaw
Max TF Term Weight (Un-normalized):   0.27472708482442504

Rank#: 3
Cosine Similarity: 0.10018893290066638
Doc#: 106  Document Headline:  the transverse potential flow past a body of revolution .
Document Vector: 
Lemma: along
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: angle
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: axis
Max TF Term Weight (Un-normalized):   0.25571074646193387
Lemma: azimuthal
Max TF Term Weight (Un-normalized):   0.5204244381420449
Lemma: body
Max TF Term Weight (Un-normalized):   0.18030570170964455
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: campbellij
Max TF Term Weight (Un-normalized):   0.5204244381420449
Lemma: component
Max TF Term Weight (Un-normalized):   0.2490868272357628
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: elementary
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: entirely
Max TF Term Weight (Un-normalized):   0.377630005715336
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: incompressible
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: inviscid
Max TF Term Weight (Un-normalized):   0.22507332948272132
Lemma: manner
Max TF Term Weight (Un-normalized):   0.2490868272357628
Lemma: meridian
Max TF Term Weight (Un-normalized):   0.44763337698537986
Lemma: past
Max TF Term Weight (Un-normalized):   0.304875069479503
Lemma: perpendicular
Max TF Term Weight (Un-normalized):   0.3712142419777961
Lemma: potential
Max TF Term Weight (Un-normalized):   0.3494601902420696
Lemma: qjmechappmath
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.3178265436347604
Lemma: right
Max TF Term Weight (Un-normalized):   0.4102958139934412
Lemma: round
Max TF Term Weight (Un-normalized):   0.3658393706105377
Lemma: set
Max TF Term Weight (Un-normalized):   0.23798399737957068
Lemma: show
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: simple
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: stream
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: surface
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.2524678059886813
Lemma: vary
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.11012862414860375

Rank#: 4
Cosine Similarity: 0.09779266988091852
Doc#: 1301  Document Headline:  compressible boundary layers on bodies of revolution .
Document Vector: 
Lemma: along
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: already
Max TF Term Weight (Un-normalized):   0.3950604896069551
Lemma: also
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: another
Max TF Term Weight (Un-normalized):   0.2942779834397059
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: arc
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: around
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: assume
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: axially
Max TF Term Weight (Un-normalized):   0.2488760036943977
Lemma: behaviour
Max TF Term Weight (Un-normalized):   0.2849565220911584
Lemma: between
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: body
Max TF Term Weight (Un-normalized):   0.177135514984982
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.088567757492491
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: can
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: clear
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: compressibility
Max TF Term Weight (Un-normalized):   0.29173476271145626
Lemma: compressible
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: cone
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: consideration
Max TF Term Weight (Un-normalized):   0.19626418845529023
Lemma: contour
Max TF Term Weight (Un-normalized):   0.41518713072321317
Lemma: correspond
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: describe
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: determine
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.19447441509655372
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: equation
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: example
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: exist
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: form
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: former
Max TF Term Weight (Un-normalized):   0.34451337745762345
Lemma: hantzsche
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: have
Max TF Term Weight (Un-normalized):   0.11924144168115643
Lemma: incompressible
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: into
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.17468555463512508
Lemma: layer
Max TF Term Weight (Un-normalized):   0.14037657439856346
Lemma: make
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: manglerkw
Max TF Term Weight (Un-normalized):   0.44529588362487266
Lemma: mathematically
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: method
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: one
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: paper
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: process
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: relation
Max TF Term Weight (Un-normalized):   0.2612245281967801
Lemma: report
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.34463358059987875
Lemma: same
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: shall
Max TF Term Weight (Un-normalized):   0.3655189764223369
Lemma: shape
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: show
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: simple
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: solve
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: still
Max TF Term Weight (Un-normalized):   0.2967349764911252
Lemma: suitable
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: symmetrical
Max TF Term Weight (Un-normalized):   0.2805627917990211
Lemma: take
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: tip
Max TF Term Weight (Un-normalized):   0.29173476271145626
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: towards
Max TF Term Weight (Un-normalized):   0.3655189764223369
Lemma: treat
Max TF Term Weight (Un-normalized):   0.2053353063638073
Lemma: two
Max TF Term Weight (Un-normalized):   0.11924144168115643
Lemma: valid
Max TF Term Weight (Un-normalized):   0.24404258942178847
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: well
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: wendt
Max TF Term Weight (Un-normalized):   0.5250207081673345

Rank#: 5
Cosine Similarity: 0.09504083920928057
Doc#: 700  Document Headline:  two and three-dimensional unsteady lift problems in high speed flight .
Document Vector: 
Lemma: al
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: application
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: apply
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: both
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: classical
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: compare
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: curve
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: dimensional
Max TF Term Weight (Un-normalized):   0.23762117335365246
Lemma: discuss
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: doublet
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: equal
Max TF Term Weight (Un-normalized):   0.26126578250618154
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: et
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: evaluation
Max TF Term Weight (Un-normalized):   0.30206909979668417
Lemma: flight
Max TF Term Weight (Un-normalized):   0.17518606223180538
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fly
Max TF Term Weight (Un-normalized):   0.43491992080052005
Lemma: formulum
Max TF Term Weight (Un-normalized):   0.26126578250618154
Lemma: forward
Max TF Term Weight (Un-normalized):   0.25877105605324124
Lemma: high
Max TF Term Weight (Un-normalized):   0.18342303381616776
Lemma: include
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: indicial
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: just
Max TF Term Weight (Un-normalized):   0.3448507763276174
Lemma: kirchhoff
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: lift
Max TF Term Weight (Un-normalized):   0.27558676201248483
Lemma: lomax
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: naca
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: number
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: pitch
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: pitchingmoment
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: problem
Max TF Term Weight (Un-normalized):   0.1659197635473378
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: rep
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: reverse
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: sink
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: so
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: source
Max TF Term Weight (Un-normalized):   0.2825372530897547
Lemma: speed
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: state
Max TF Term Weight (Un-normalized):   0.2240198079156675
Lemma: steady
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: three
Max TF Term Weight (Un-normalized):   0.2357164288121836
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transient
Max TF Term Weight (Un-normalized):   0.280658581339866
Lemma: triangular
Max TF Term Weight (Un-normalized):   0.32642819453100774
Lemma: two
Max TF Term Weight (Un-normalized):   0.14569675538342639
Lemma: unsteady
Max TF Term Weight (Un-normalized):   0.26368129777015153
Lemma: value
Max TF Term Weight (Un-normalized):   0.1419154310865215
Lemma: wave
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: wing
Max TF Term Weight (Un-normalized):   0.21444818344919464
 ***************************** 
Processing Query:  are experimental pressure distributions on bodies of revolution at angle of attack available  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.1312935441327397
Doc#: 248  Document Headline:  the application of lighthill formula for numerical calculation of pressure distributions on bodies of revolution at supersonic speed and zero angle of attack .
Document Vector: 
Lemma: angle
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: application
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: apply
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.17454973953155134
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.2732414228721939
Lemma: base
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: body
Max TF Term Weight (Un-normalized):   0.18030570170964455
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: computing
Max TF Term Weight (Un-normalized):   0.4464880907247816
Lemma: could
Max TF Term Weight (Un-normalized):   0.2455555343226533
Lemma: determine
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: develop
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: digital
Max TF Term Weight (Un-normalized):   0.4717807981136198
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.1524375347397515
Lemma: drag
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: duct
Max TF Term Weight (Un-normalized):   0.377630005715336
Lemma: exact
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: expect
Max TF Term Weight (Un-normalized):   0.28244044076247427
Lemma: expression
Max TF Term Weight (Un-normalized):   0.29777838544624097
Lemma: external
Max TF Term Weight (Un-normalized):   0.23390920626927075
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: formulum
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: from
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: give
Max TF Term Weight (Un-normalized):   0.09015285085482228
Lemma: good
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: integral
Max TF Term Weight (Un-normalized):   0.2202572482972075
Lemma: lighthill
Max TF Term Weight (Un-normalized):   0.4910732114873483
Lemma: linearize
Max TF Term Weight (Un-normalized):   0.36241166439732697
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: method
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: much
Max TF Term Weight (Un-normalized):   0.241859937297283
Lemma: number
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: numerical
Max TF Term Weight (Un-normalized):   0.22865630210962726
Lemma: ohmanl
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: pointed
Max TF Term Weight (Un-normalized):   0.29879353585070145
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: procedure
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: range
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.37593062673082334
Lemma: saab
Max TF Term Weight (Un-normalized):   0.5754887502163468
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: slender
Max TF Term Weight (Un-normalized):   0.21513024299674258
Lemma: speed
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: supersonic
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: surface
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: than
Max TF Term Weight (Un-normalized):   0.12785537323096693
Lemma: theory
Max TF Term Weight (Un-normalized):   0.12080388813244233
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: tn
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: various
Max TF Term Weight (Un-normalized):   0.16519293622290562
Lemma: wave
Max TF Term Weight (Un-normalized):   0.14233918184007752
Lemma: wider
Max TF Term Weight (Un-normalized):   0.3848271145813172
Lemma: zero
Max TF Term Weight (Un-normalized):   0.2531932646836744

Rank#: 2
Cosine Similarity: 0.12109256064419419
Doc#: 197  Document Headline:  pressure distributions on three bodies of revolution to determine the effect of reynolds number up to and including the transonic speed range .
Document Vector: 
Lemma: affect
Max TF Term Weight (Un-normalized):   0.23457297835969704
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.1650214410606594
Lemma: also
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: angle
Max TF Term Weight (Un-normalized):   0.20723236572973688
Lemma: approximation
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: area
Max TF Term Weight (Un-normalized):   0.21418315592424483
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.23772913556624828
Lemma: base
Max TF Term Weight (Un-normalized):   0.12239368703880468
Lemma: be
Max TF Term Weight (Un-normalized):   0.09316698570639259
Lemma: between
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: body
Max TF Term Weight (Un-normalized):   0.16033684486480787
Lemma: cause
Max TF Term Weight (Un-normalized):   0.25405081373043026
Lemma: change
Max TF Term Weight (Un-normalized):   0.203351698238397
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.15194880903912233
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.19526899039770054
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.18027194075193229
Lemma: cone
Max TF Term Weight (Un-normalized):   0.203351698238397
Lemma: cross
Max TF Term Weight (Un-normalized):   0.20463612702400386
Lemma: determine
Max TF Term Weight (Un-normalized):   0.13648716706497074
Lemma: diameter
Max TF Term Weight (Un-normalized):   0.19353458614396488
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.15285871625578512
Lemma: due
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: effect
Max TF Term Weight (Un-normalized):   0.08016842243240394
Lemma: except
Max TF Term Weight (Un-normalized):   0.2225580245927858
Lemma: exist
Max TF Term Weight (Un-normalized):   0.1752096831740383
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.11756364666545953
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: foot
Max TF Term Weight (Un-normalized):   0.2569246362341512
Lemma: from
Max TF Term Weight (Un-normalized):   0.07193787481051735
Lemma: good
Max TF Term Weight (Un-normalized):   0.15728778560525636
Lemma: inch
Max TF Term Weight (Un-normalized):   0.2644387112950473
Lemma: include
Max TF Term Weight (Un-normalized):   0.15194880903912233
Lemma: increase
Max TF Term Weight (Un-normalized):   0.18595670876676038
Lemma: incremental
Max TF Term Weight (Un-normalized):   0.40312462727480725
Lemma: indicate
Max TF Term Weight (Un-normalized):   0.12239368703880468
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: langley
Max TF Term Weight (Un-normalized):   0.26857993176402206
Lemma: length
Max TF Term Weight (Un-normalized):   0.1752096831740383
Lemma: lh
Max TF Term Weight (Un-normalized):   0.494847511962445
Lemma: longitudinal
Max TF Term Weight (Un-normalized):   0.23001734276308713
Lemma: mach
Max TF Term Weight (Un-normalized):   0.10510340488235613
Lemma: model
Max TF Term Weight (Un-normalized):   0.18616374891345538
Lemma: naca
Max TF Term Weight (Un-normalized):   0.13292359933318476
Lemma: nature
Max TF Term Weight (Un-normalized):   0.2519844684427514
Lemma: negligible
Max TF Term Weight (Un-normalized):   0.2600301354266231
Lemma: normalforce
Max TF Term Weight (Un-normalized):   0.4474991705436974
Lemma: number
Max TF Term Weight (Un-normalized):   0.08617280298068301
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.13648716706497074
Lemma: paper
Max TF Term Weight (Un-normalized):   0.12239368703880468
Lemma: present
Max TF Term Weight (Un-normalized):   0.04734834141874752
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.08337135672449958
Lemma: range
Max TF Term Weight (Un-normalized):   0.15285871625578512
Lemma: rear
Max TF Term Weight (Un-normalized):   0.2930779265359993
Lemma: result
Max TF Term Weight (Un-normalized):   0.04734834141874752
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.2451157947455149
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.21456433473004255
Lemma: rm
Max TF Term Weight (Un-normalized):   0.2644387112950473
Lemma: separate
Max TF Term Weight (Un-normalized):   0.20796894495324195
Lemma: slightly
Max TF Term Weight (Un-normalized):   0.2428630435196936
Lemma: small
Max TF Term Weight (Un-normalized):   0.10993944418650882
Lemma: speed
Max TF Term Weight (Un-normalized):   0.11756364666545953
Lemma: sting
Max TF Term Weight (Un-normalized):   0.4622712006107691
Lemma: subcritical
Max TF Term Weight (Un-normalized):   0.4001508291249499
Lemma: such
Max TF Term Weight (Un-normalized):   0.13292359933318476
Lemma: swihartjm
Max TF Term Weight (Un-normalized):   0.494847511962445
Lemma: test
Max TF Term Weight (Un-normalized):   0.13648716706497074
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.15194880903912233
Lemma: theory
Max TF Term Weight (Un-normalized):   0.07504534562005717
Lemma: these
Max TF Term Weight (Un-normalized):   0.07504534562005717
Lemma: three
Max TF Term Weight (Un-normalized):   0.15728778560525636
Lemma: through
Max TF Term Weight (Un-normalized):   0.18633397141278518
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transonic
Max TF Term Weight (Un-normalized):   0.3208020335075927
Lemma: tunnel
Max TF Term Weight (Un-normalized):   0.13292359933318476
Lemma: up
Max TF Term Weight (Un-normalized):   0.19526899039770054
Lemma: value
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: vary
Max TF Term Weight (Un-normalized):   0.15009069124011434
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.09469668283749504
Lemma: very
Max TF Term Weight (Un-normalized):   0.1637983493940491
Lemma: whitcombcf
Max TF Term Weight (Un-normalized):   0.494847511962445

Rank#: 3
Cosine Similarity: 0.11829853034235335
Doc#: 498  Document Headline:  calculation of potential flow about bodies of revolution having axes perpendicular to the free-stream direction .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.20454273607309637
Lemma: accuracy
Max TF Term Weight (Un-normalized):   0.20627465361109093
Lemma: ae
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: after
Max TF Term Weight (Un-normalized):   0.2473361673648132
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: aid
Max TF Term Weight (Un-normalized):   0.29567950150902267
Lemma: also
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: analytic
Max TF Term Weight (Un-normalized):   0.2833443784404361
Lemma: angle
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: arbitrary
Max TF Term Weight (Un-normalized):   0.19786893389185056
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: axis
Max TF Term Weight (Un-normalized):   0.2952108837982247
Lemma: axisymmetric
Max TF Term Weight (Un-normalized):   0.23521113020719245
Lemma: basic
Max TF Term Weight (Un-normalized):   0.2576972459040783
Lemma: body
Max TF Term Weight (Un-normalized):   0.1878017980156649
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.22059574503584287
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: case
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: certain
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: combine
Max TF Term Weight (Un-normalized):   0.24031088009319101
Lemma: compare
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: computer
Max TF Term Weight (Un-normalized):   0.27166677931535277
Lemma: datum
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: derive
Max TF Term Weight (Un-normalized):   0.14840170041888792
Lemma: describe
Max TF Term Weight (Un-normalized):   0.15680742013812832
Lemma: direction
Max TF Term Weight (Un-normalized):   0.2598408453118896
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.1271404073400238
Lemma: electronic
Max TF Term Weight (Un-normalized):   0.3599297447340222
Lemma: ellipsoid
Max TF Term Weight (Un-normalized):   0.4384867655654138
Lemma: equation
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: exhibit
Max TF Term Weight (Un-normalized):   0.3934884078896442
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: forward
Max TF Term Weight (Un-normalized):   0.2427303027192513
Lemma: free
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: general
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: have
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: hessjl
Max TF Term Weight (Un-normalized):   0.5169925001442313
Lemma: make
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: method
Max TF Term Weight (Un-normalized):   0.11547972218388075
Lemma: off
Max TF Term Weight (Un-normalized):   0.2650232758559818
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: other
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: perpendicular
Max TF Term Weight (Un-normalized):   0.4285564293601822
Lemma: point
Max TF Term Weight (Un-normalized):   0.12787094354202677
Lemma: possible
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: potential
Max TF Term Weight (Un-normalized):   0.291466999990211
Lemma: present
Max TF Term Weight (Un-normalized):   0.04946723347296264
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.0635702036700119
Lemma: property
Max TF Term Weight (Un-normalized):   0.17733817701498944
Lemma: quite
Max TF Term Weight (Un-normalized):   0.27323532888264646
Lemma: region
Max TF Term Weight (Un-normalized):   0.14840170041888792
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.3327513784113987
Lemma: satisfactory
Max TF Term Weight (Un-normalized):   0.2378065483168196
Lemma: sc
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: select
Max TF Term Weight (Un-normalized):   0.3100005929337746
Lemma: separate
Max TF Term Weight (Un-normalized):   0.2172757914399585
Lemma: solution
Max TF Term Weight (Un-normalized):   0.10075638898017529
Lemma: stream
Max TF Term Weight (Un-normalized):   0.16432659265018718
Lemma: surface
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: then
Max TF Term Weight (Un-normalized):   0.17112851156288025
Lemma: these
Max TF Term Weight (Un-normalized):   0.07840371006906416
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: type
Max TF Term Weight (Un-normalized):   0.13887208137089432
Lemma: variety
Max TF Term Weight (Un-normalized):   0.29567950150902267
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.09893446694592528
Lemma: whose
Max TF Term Weight (Un-normalized):   0.24953222163194438

Rank#: 4
Cosine Similarity: 0.11142496421739213
Doc#: 56  Document Headline:  an analysis of the applicability of the hypersonic similarity law to the study of the flow about bodies of revolution at zero angle of attack .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: along
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: also
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: analysis
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: angle
Max TF Term Weight (Un-normalized):   0.1688139024143132
Lemma: applicability
Max TF Term Weight (Un-normalized):   0.41518713072321317
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: assumption
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.2341200344635083
Lemma: attention
Max TF Term Weight (Un-normalized):   0.2636317064153084
Lemma: be
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: body
Max TF Term Weight (Un-normalized):   0.15046594683079464
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: chart
Max TF Term Weight (Un-normalized):   0.277478311244903
Lemma: combination
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: compare
Max TF Term Weight (Un-normalized):   0.19447441509655372
Lemma: comparison
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: cone
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: cylinder
Max TF Term Weight (Un-normalized):   0.21120565821874457
Lemma: define
Max TF Term Weight (Un-normalized):   0.24404258942178847
Lemma: demonstrate
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: derivation
Max TF Term Weight (Un-normalized):   0.3193741299413906
Lemma: derive
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: determination
Max TF Term Weight (Un-normalized):   0.23032739778110356
Lemma: determine
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.177135514984982
Lemma: ehretdm
Max TF Term Weight (Un-normalized):   0.474785314149417
Lemma: exist
Max TF Term Weight (Un-normalized):   0.1858930472803693
Lemma: expect
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: fineness
Max TF Term Weight (Un-normalized):   0.5482188804519504
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: free
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: from
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: give
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: have
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: hypersonic
Max TF Term Weight (Un-normalized):   0.22569892024619198
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: law
Max TF Term Weight (Un-normalized):   0.41630740506439307
Lemma: limit
Max TF Term Weight (Un-normalized):   0.2669363880568726
Lemma: mach
Max TF Term Weight (Un-normalized):   0.14037657439856346
Lemma: make
Max TF Term Weight (Un-normalized):   0.10350777036511821
Lemma: method
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: might
Max TF Term Weight (Un-normalized):   0.3284972194217488
Lemma: naca
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: number
Max TF Term Weight (Un-normalized):   0.088567757492491
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.4478682124586712
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: particular
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: present
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.093496304984789
Lemma: purpose
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: range
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: rapid
Max TF Term Weight (Un-normalized):   0.27259054799799826
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.186992609969578
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.2723216727794314
Lemma: shape
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: significant
Max TF Term Weight (Un-normalized):   0.23032739778110356
Lemma: similarity
Max TF Term Weight (Un-normalized):   0.39731552472289317
Lemma: similarly
Max TF Term Weight (Un-normalized):   0.4245499201314995
Lemma: since
Max TF Term Weight (Un-normalized):   0.24149936869353872
Lemma: single
Max TF Term Weight (Un-normalized):   0.22724291722698559
Lemma: stream
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: study
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: than
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: these
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: tn
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: tsien
Max TF Term Weight (Un-normalized):   0.37431452611358207
Lemma: value
Max TF Term Weight (Un-normalized):   0.13061226409839005
Lemma: various
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: vary
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: wider
Max TF Term Weight (Un-normalized):   0.35107932890698595
Lemma: within
Max TF Term Weight (Un-normalized):   0.24166140487300822
Lemma: zero
Max TF Term Weight (Un-normalized):   0.216942274822645

Rank#: 5
Cosine Similarity: 0.10391147493436914
Doc#: 234  Document Headline:  a second order shock-expansion method applicable to bodies of revolution near zero lift .
Document Vector: 
Lemma: afterbody
Max TF Term Weight (Un-normalized):   0.2660713544699949
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.16687603204489448
Lemma: alone
Max TF Term Weight (Un-normalized):   0.3069461437731693
Lemma: angle
Max TF Term Weight (Un-normalized):   0.15365648344493257
Lemma: appear
Max TF Term Weight (Un-normalized):   0.1905626792915
Lemma: applicability
Max TF Term Weight (Un-normalized):   0.3028780359337672
Lemma: applicable
Max TF Term Weight (Un-normalized):   0.2855289954558929
Lemma: application
Max TF Term Weight (Un-normalized):   0.1510173503569898
Lemma: area
Max TF Term Weight (Un-normalized):   0.21550552157183075
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: attack
Max TF Term Weight (Un-normalized):   0.21309892541539263
Lemma: base
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: basis
Max TF Term Weight (Un-normalized):   0.20589954936673602
Lemma: be
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: between
Max TF Term Weight (Un-normalized):   0.110618209720986
Lemma: body
Max TF Term Weight (Un-normalized):   0.185195342116951
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: center
Max TF Term Weight (Un-normalized):   0.30489710808481735
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.16687603204489448
Lemma: coefficient
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: combination
Max TF Term Weight (Un-normalized):   0.20589954936673602
Lemma: compare
Max TF Term Weight (Un-normalized):   0.15365648344493257
Lemma: condition
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: cone
Max TF Term Weight (Un-normalized):   0.1648096395183135
Lemma: cylindrical
Max TF Term Weight (Un-normalized):   0.1813849387402443
Lemma: define
Max TF Term Weight (Un-normalized):   0.23143746859467443
Lemma: denisdh
Max TF Term Weight (Un-normalized):   0.4979026978279663
Lemma: derivative
Max TF Term Weight (Un-normalized):   0.3265343933230503
Lemma: derive
Max TF Term Weight (Un-normalized):   0.142922009468625
Lemma: develop
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: diameter
Max TF Term Weight (Un-normalized):   0.242968772747435
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.13443214110987906
Lemma: exist
Max TF Term Weight (Un-normalized):   0.21996317321078737
Lemma: expansion
Max TF Term Weight (Un-normalized):   0.3399236822579631
Lemma: experimental
Max TF Term Weight (Un-normalized):   0.14604454065282194
Lemma: expression
Max TF Term Weight (Un-normalized):   0.23223511751439538
Lemma: extend
Max TF Term Weight (Un-normalized):   0.18612688489948087
Lemma: find
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: fineness
Max TF Term Weight (Un-normalized):   0.41605568427237666
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: for
Max TF Term Weight (Un-normalized):   0.32116800282094915
Lemma: force
Max TF Term Weight (Un-normalized):   0.21906681097923292
Lemma: free
Max TF Term Weight (Un-normalized):   0.15365648344493257
Lemma: from
Max TF Term Weight (Un-normalized):   0.05944244197046003
Lemma: general
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: generalize
Max TF Term Weight (Un-normalized):   0.30489710808481735
Lemma: good
Max TF Term Weight (Un-normalized):   0.19746351801038292
Lemma: inclined
Max TF Term Weight (Un-normalized):   0.46975192299230334
Lemma: intend
Max TF Term Weight (Un-normalized):   0.32671880824042443
Lemma: lift
Max TF Term Weight (Un-normalized):   0.19746351801038292
Lemma: location
Max TF Term Weight (Un-normalized):   0.2688915690726997
Lemma: long
Max TF Term Weight (Un-normalized):   0.21550552157183075
Lemma: mach
Max TF Term Weight (Un-normalized):   0.10653495127540664
Lemma: mehtod
Max TF Term Weight (Un-normalized):   0.4979026978279663
Lemma: method
Max TF Term Weight (Un-normalized):   0.14676383628179637
Lemma: moment
Max TF Term Weight (Un-normalized):   0.1813849387402443
Lemma: naca
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: namely
Max TF Term Weight (Un-normalized):   0.3069461437731693
Lemma: near
Max TF Term Weight (Un-normalized):   0.21309892541539263
Lemma: neighborhood
Max TF Term Weight (Un-normalized):   0.36415842891059697
Lemma: noninclined
Max TF Term Weight (Un-normalized):   0.7024893434774898
Lemma: normal
Max TF Term Weight (Un-normalized):   0.2526155508318662
Lemma: nose
Max TF Term Weight (Un-normalized):   0.21309892541539263
Lemma: number
Max TF Term Weight (Un-normalized):   0.06721607055493953
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.09421404147447256
Lemma: ogive
Max TF Term Weight (Un-normalized):   0.32671880824042443
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: order
Max TF Term Weight (Un-normalized):   0.20499943002067078
Lemma: other
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: per
Max TF Term Weight (Un-normalized):   0.19472946763327798
Lemma: pitch
Max TF Term Weight (Un-normalized):   0.2092529440958642
Lemma: potential
Max TF Term Weight (Un-normalized):   0.2184306846471199
Lemma: predict
Max TF Term Weight (Un-normalized):   0.270796724118472
Lemma: prediction
Max TF Term Weight (Un-normalized):   0.242968772747435
Lemma: present
Max TF Term Weight (Un-normalized):   0.047640669822875
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.07765843130651606
Lemma: property
Max TF Term Weight (Un-normalized):   0.1707900148242449
Lemma: radian
Max TF Term Weight (Un-normalized):   0.4979026978279663
Lemma: range
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.15531686261303213
Lemma: reference
Max TF Term Weight (Un-normalized):   0.23143746859467443
Lemma: result
Max TF Term Weight (Un-normalized):   0.08151793668720392
Lemma: revolution
Max TF Term Weight (Un-normalized):   0.24787052491940512
Lemma: second
Max TF Term Weight (Un-normalized):   0.2702145094246869
Lemma: secondorder
Max TF Term Weight (Un-normalized):   0.42229576536597785
Lemma: shock
Max TF Term Weight (Un-normalized):   0.18927878743126803
Lemma: stream
Max TF Term Weight (Un-normalized):   0.15365648344493257
Lemma: syvertsonca
Max TF Term Weight (Un-normalized):   0.4502620280050913
Lemma: tangent
Max TF Term Weight (Un-normalized):   0.3028780359337672
Lemma: test
Max TF Term Weight (Un-normalized):   0.110618209720986
Lemma: theory
Max TF Term Weight (Un-normalized):   0.10653495127540664
Lemma: these
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: tn
Max TF Term Weight (Un-normalized):   0.15825887954386103
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: under
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: up
Max TF Term Weight (Un-normalized):   0.15825887954386103
Lemma: use
Max TF Term Weight (Un-normalized):   0.047640669822875
Lemma: value
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: within
Max TF Term Weight (Un-normalized):   0.21996317321078737
Lemma: zero
Max TF Term Weight (Un-normalized):   0.2425747313497644
 ***************************** 
Processing Query:  does there exist a good basic treatment of the dynamics of re-entry combining consideration of realistic effects with relative simplicity of results  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.09411928962700647
Doc#: 82  Document Headline:  theoretical investigation of the ablation of a glass-type heat protection shield of varied material properties at the stagnation point of a re-entering irbm .
Document Vector: 
Lemma: ablation
Max TF Term Weight (Un-normalized):   0.39492703602076584
Lemma: across
Max TF Term Weight (Un-normalized):   0.23602123066084668
Lemma: adamsew
Max TF Term Weight (Un-normalized):   0.4502620280050913
Lemma: affect
Max TF Term Weight (Un-normalized):   0.23602123066084668
Lemma: also
Max TF Term Weight (Un-normalized):   0.11888488394092006
Lemma: although
Max TF Term Weight (Un-normalized):   0.21245030934118853
Lemma: altitude
Max TF Term Weight (Un-normalized):   0.23602123066084668
Lemma: angle
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: assume
Max TF Term Weight (Un-normalized):   0.1783273259113801
Lemma: at
Max TF Term Weight (Un-normalized):   0.0
Lemma: ballistic
Max TF Term Weight (Un-normalized):   0.3592935466865547
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: calculation
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: cause
Max TF Term Weight (Un-normalized):   0.2569059599808429
Lemma: certain
Max TF Term Weight (Un-normalized):   0.1648096395183135
Lemma: characteristic
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: combination
Max TF Term Weight (Un-normalized):   0.20589954936673602
Lemma: comparatively
Max TF Term Weight (Un-normalized):   0.36415842891059697
Lemma: conclusion
Max TF Term Weight (Un-normalized):   0.22652602553548465
Lemma: condition
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: conductivity
Max TF Term Weight (Un-normalized):   0.2814082245452309
Lemma: constant
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: corollary
Max TF Term Weight (Un-normalized):   0.4979026978279663
Lemma: derive
Max TF Term Weight (Un-normalized):   0.142922009468625
Lemma: desirable
Max TF Term Weight (Un-normalized):   0.3887035681649116
Lemma: diameter
Max TF Term Weight (Un-normalized):   0.19472946763327798
Lemma: different
Max TF Term Weight (Un-normalized):   0.1762914268114124
Lemma: diffusivity
Max TF Term Weight (Un-normalized):   0.6352732729225502
Lemma: discussion
Max TF Term Weight (Un-normalized):   0.2092529440958642
Lemma: disregard
Max TF Term Weight (Un-normalized):   0.4502620280050913
Lemma: do
Max TF Term Weight (Un-normalized):   0.1813849387402443
Lemma: due
Max TF Term Weight (Un-normalized):   0.1510173503569898
Lemma: effect
Max TF Term Weight (Un-normalized):   0.047640669822875
Lemma: emissivity
Max TF Term Weight (Un-normalized):   0.40262135818221634
Lemma: employ
Max TF Term Weight (Un-normalized):   0.29050302375932435
Lemma: employment
Max TF Term Weight (Un-normalized):   0.4502620280050913
Lemma: enter
Max TF Term Weight (Un-normalized):   0.3319838093563127
Lemma: entry
Max TF Term Weight (Un-normalized):   0.37455189104402414
Lemma: exact
Max TF Term Weight (Un-normalized):   0.1762914268114124
Lemma: exceed
Max TF Term Weight (Un-normalized):   0.26314619139470574
Lemma: exert
Max TF Term Weight (Un-normalized):   0.36415842891059697
Lemma: extremely
Max TF Term Weight (Un-normalized):   0.3115299058393416
Lemma: factor
Max TF Term Weight (Un-normalized):   0.19472946763327798
Lemma: flight
Max TF Term Weight (Un-normalized):   0.19746351801038292
Lemma: from
Max TF Term Weight (Un-normalized):   0.047640669822875
Lemma: give
Max TF Term Weight (Un-normalized):   0.047640669822875
Lemma: glass
Max TF Term Weight (Un-normalized):   0.7130659752736259
Lemma: have
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: heat
Max TF Term Weight (Un-normalized):   0.1695524610233534
Lemma: high
Max TF Term Weight (Un-normalized):   0.20074413279217387
Lemma: homogeneous
Max TF Term Weight (Un-normalized):   0.3549806883593413
Lemma: hypothetical
Max TF Term Weight (Un-normalized):   0.40262135818221634
Lemma: increase
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: influence
Max TF Term Weight (Un-normalized):   0.1762914268114124
Lemma: investigate
Max TF Term Weight (Un-normalized):   0.1510173503569898
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.13802107603992286
Lemma: irbm
Max TF Term Weight (Un-normalized):   0.7024893434774898
Lemma: km
Max TF Term Weight (Un-normalized):   0.3396438182841053
Lemma: lead
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: level
Max TF Term Weight (Un-normalized):   0.2972122098523002
Lemma: light
Max TF Term Weight (Un-normalized):   0.268877089264847
Lemma: little
Max TF Term Weight (Un-normalized):   0.2728819671475375
Lemma: low
Max TF Term Weight (Un-normalized):   0.1884280829489451
Lemma: make
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: material
Max TF Term Weight (Un-normalized):   0.29523431778918735
Lemma: melting
Max TF Term Weight (Un-normalized):   0.37465509554310283
Lemma: method
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: monotonically
Max TF Term Weight (Un-normalized):   0.40262135818221634
Lemma: most
Max TF Term Weight (Un-normalized):   0.18612688489948087
Lemma: nasa
Max TF Term Weight (Un-normalized):   0.1510173503569898
Lemma: necessary
Max TF Term Weight (Un-normalized):   0.21550552157183075
Lemma: nondecompose
Max TF Term Weight (Un-normalized):   0.4979026978279663
Lemma: normal
Max TF Term Weight (Un-normalized):   0.1648096395183135
Lemma: nose
Max TF Term Weight (Un-normalized):   0.1707900148242449
Lemma: not
Max TF Term Weight (Un-normalized):   0.110618209720986
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: opaque
Max TF Term Weight (Un-normalized):   0.6212455100361203
Lemma: out
Max TF Term Weight (Un-normalized):   0.1648096395183135
Lemma: overall
Max TF Term Weight (Un-normalized):   0.28476161927435906
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.1510173503569898
Lemma: penetration
Max TF Term Weight (Un-normalized):   0.37465509554310283
Lemma: performance
Max TF Term Weight (Un-normalized):   0.29448952669043904
Lemma: point
Max TF Term Weight (Un-normalized):   0.15365648344493257
Lemma: possible
Max TF Term Weight (Un-normalized):   0.1707900148242449
Lemma: practically
Max TF Term Weight (Un-normalized):   0.31651775908772206
Lemma: problem
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: profile
Max TF Term Weight (Un-normalized):   0.1707900148242449
Lemma: property
Max TF Term Weight (Un-normalized):   0.2617821008377066
Lemma: protection
Max TF Term Weight (Un-normalized):   0.4832244339961974
Lemma: radiative
Max TF Term Weight (Un-normalized):   0.3466394403818327
Lemma: re
Max TF Term Weight (Un-normalized):   0.40385586116609656
Lemma: realistic
Max TF Term Weight (Un-normalized):   0.4502620280050913
Lemma: result
Max TF Term Weight (Un-normalized):   0.05944244197046003
Lemma: shield
Max TF Term Weight (Un-normalized):   0.800324806870746
Lemma: show
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: small
Max TF Term Weight (Un-normalized):   0.1695524610233534
Lemma: solution
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: specific
Max TF Term Weight (Un-normalized):   0.221236419441972
Lemma: speed
Max TF Term Weight (Un-normalized):   0.09528133964575
Lemma: stagnation
Max TF Term Weight (Un-normalized):   0.19746351801038292
Lemma: state
Max TF Term Weight (Un-normalized):   0.20237411209947226
Lemma: steady
Max TF Term Weight (Un-normalized):   0.1762914268114124
Lemma: steep
Max TF Term Weight (Un-normalized):   0.3872844881069803
Lemma: supposedly
Max TF Term Weight (Un-normalized):   0.4502620280050913
Lemma: surface
Max TF Term Weight (Un-normalized):   0.13443214110987906
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.15607088264944527
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: thermal
Max TF Term Weight (Un-normalized):   0.32607174674881567
Lemma: these
Max TF Term Weight (Un-normalized):   0.09421404147447256
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.1783273259113801
Lemma: thin
Max TF Term Weight (Un-normalized):   0.15825887954386103
Lemma: thus
Max TF Term Weight (Un-normalized):   0.19865802017986475
Lemma: tnd
Max TF Term Weight (Un-normalized):   0.1905626792915
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: total
Max TF Term Weight (Un-normalized):   0.1905626792915
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.12314934500136988
Lemma: transient
Max TF Term Weight (Un-normalized):   0.25354021918961106
Lemma: treat
Max TF Term Weight (Un-normalized):   0.19472946763327798
Lemma: two
Max TF Term Weight (Un-normalized):   0.0755086751784949
Lemma: type
Max TF Term Weight (Un-normalized):   0.16687603204489448
Lemma: under
Max TF Term Weight (Un-normalized):   0.1337442689173693
Lemma: variation
Max TF Term Weight (Un-normalized):   0.1648096395183135
Lemma: vary
Max TF Term Weight (Un-normalized):   0.1510173503569898
Lemma: vehicle
Max TF Term Weight (Un-normalized):   0.2092529440958642
Lemma: vertical
Max TF Term Weight (Un-normalized):   0.238203349114375
Lemma: viscosity
Max TF Term Weight (Un-normalized):   0.26507950521208223
Lemma: weight
Max TF Term Weight (Un-normalized):   0.24629869000273977
Lemma: yield
Max TF Term Weight (Un-normalized):   0.24787052491940512

Rank#: 2
Cosine Similarity: 0.07094804220085546
Doc#: 482  Document Headline:  a re-examination of the use of the simple concepts for prediction the shape and location of detached shock waves .
Document Vector: 
Lemma: can
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: concept
Max TF Term Weight (Un-normalized):   0.433396751294455
Lemma: detach
Max TF Term Weight (Un-normalized):   0.48456477728187297
Lemma: examination
Max TF Term Weight (Un-normalized):   0.39256906491107796
Lemma: exist
Max TF Term Weight (Un-normalized):   0.2037621674518628
Lemma: good
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: have
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: location
Max TF Term Weight (Un-normalized):   0.3447803164119296
Lemma: lovee
Max TF Term Weight (Un-normalized):   0.4653601260677431
Lemma: mach
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: make
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: method
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: modification
Max TF Term Weight (Un-normalized):   0.2930483094538726
Lemma: naca
Max TF Term Weight (Un-normalized):   0.15458506753150733
Lemma: nose
Max TF Term Weight (Un-normalized):   0.19740349391437942
Lemma: number
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: predict
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: prediction
Max TF Term Weight (Un-normalized):   0.31154137943027105
Lemma: range
Max TF Term Weight (Un-normalized):   0.11012862414860375
Lemma: re
Max TF Term Weight (Un-normalized):   0.27279941171249783
Lemma: reexamination
Max TF Term Weight (Un-normalized):   0.5204244381420449
Lemma: result
Max TF Term Weight (Un-normalized):   0.055064312074301874
Lemma: shape
Max TF Term Weight (Un-normalized):   0.25309104958481043
Lemma: shock
Max TF Term Weight (Un-normalized):   0.17697449731379866
Lemma: show
Max TF Term Weight (Un-normalized):   0.08727486976577567
Lemma: simple
Max TF Term Weight (Un-normalized):   0.25309104958481043
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: tn
Max TF Term Weight (Un-normalized):   0.18291968530526884
Lemma: use
Max TF Term Weight (Un-normalized):   0.07621876736987575
Lemma: wave
Max TF Term Weight (Un-normalized):   0.19702265550231807
Lemma: wide
Max TF Term Weight (Un-normalized):   0.26750138156673225
Lemma: yield
Max TF Term Weight (Un-normalized):   0.22961405160585316

Rank#: 3
Cosine Similarity: 0.07092040227953778
Doc#: 1119  Document Headline:  plastic stability theory of thin shells .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: agreement
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: although
Max TF Term Weight (Un-normalized):   0.21575803802691662
Lemma: appear
Max TF Term Weight (Un-normalized):   0.27803125162699127
Lemma: apply
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: axial
Max TF Term Weight (Un-normalized):   0.17344911677152813
Lemma: buckle
Max TF Term Weight (Un-normalized):   0.2621341232557868
Lemma: can
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: case
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: centered
Max TF Term Weight (Un-normalized):   0.4288706666748729
Lemma: class
Max TF Term Weight (Un-normalized):   0.27306335034328155
Lemma: classical
Max TF Term Weight (Un-normalized):   0.24816706137967587
Lemma: combine
Max TF Term Weight (Un-normalized):   0.23504081639019808
Lemma: compression
Max TF Term Weight (Un-normalized):   0.28728457098879817
Lemma: considerable
Max TF Term Weight (Un-normalized):   0.2461437005952872
Lemma: constant
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: correlation
Max TF Term Weight (Un-normalized):   0.22183152432436498
Lemma: current
Max TF Term Weight (Un-normalized):   0.2891951933161624
Lemma: currently
Max TF Term Weight (Un-normalized):   0.3318056314958718
Lemma: cylinder
Max TF Term Weight (Un-normalized):   0.21272382353123861
Lemma: datum
Max TF Term Weight (Un-normalized):   0.15798944089756267
Lemma: deformation
Max TF Term Weight (Un-normalized):   0.3753980565084484
Lemma: degree
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: derive
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: development
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: differential
Max TF Term Weight (Un-normalized):   0.22616591226416038
Lemma: displacement
Max TF Term Weight (Un-normalized):   0.2017510108845457
Lemma: do
Max TF Term Weight (Un-normalized):   0.18420899753729034
Lemma: donnell
Max TF Term Weight (Un-normalized):   0.37831377477956957
Lemma: eighth
Max TF Term Weight (Un-normalized):   0.38048825912203604
Lemma: equation
Max TF Term Weight (Un-normalized):   0.1280285361992592
Lemma: equilibrium
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: exploit
Max TF Term Weight (Un-normalized):   0.4572723478805719
Lemma: external
Max TF Term Weight (Un-normalized):   0.2596276319811578
Lemma: flat
Max TF Term Weight (Un-normalized):   0.21272382353123861
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: from
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: fruitful
Max TF Term Weight (Un-normalized):   0.4572723478805719
Lemma: gerardg
Max TF Term Weight (Un-normalized):   0.3449318764853495
Lemma: good
Max TF Term Weight (Un-normalized):   0.16072287894805923
Lemma: hand
Max TF Term Weight (Un-normalized):   0.2994786144882915
Lemma: imperfection
Max TF Term Weight (Un-normalized):   0.29654946893251277
Lemma: incremental
Max TF Term Weight (Un-normalized):   0.3318056314958718
Lemma: inherent
Max TF Term Weight (Un-normalized):   0.3933142840381864
Lemma: initial
Max TF Term Weight (Un-normalized):   0.19352963021134736
Lemma: interest
Max TF Term Weight (Un-normalized):   0.23969594498589836
Lemma: introduction
Max TF Term Weight (Un-normalized):   0.292442339692771
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: lateral
Max TF Term Weight (Un-normalized):   0.3817266975310267
Lemma: lead
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: length
Max TF Term Weight (Un-normalized):   0.179036182567807
Lemma: limit
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: load
Max TF Term Weight (Un-normalized):   0.1715817674001709
Lemma: long
Max TF Term Weight (Un-normalized):   0.21886081814845823
Lemma: mathematical
Max TF Term Weight (Un-normalized):   0.26253575285159114
Lemma: may
Max TF Term Weight (Un-normalized):   0.11234047139522238
Lemma: moderate
Max TF Term Weight (Un-normalized):   0.2574876940537329
Lemma: objection
Max TF Term Weight (Un-normalized):   0.4572723478805719
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.1101672769643373
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: only
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: order
Max TF Term Weight (Un-normalized):   0.1715817674001709
Lemma: other
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: paper
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: partial
Max TF Term Weight (Un-normalized):   0.27306335034328155
Lemma: particular
Max TF Term Weight (Un-normalized):   0.17344911677152813
Lemma: plastic
Max TF Term Weight (Un-normalized):   0.45113658737651124
Lemma: plasticity
Max TF Term Weight (Un-normalized):   0.35203641638112076
Lemma: plate
Max TF Term Weight (Un-normalized):   0.1958723147250825
Lemma: predictive
Max TF Term Weight (Un-normalized):   0.5056547554334088
Lemma: pressure
Max TF Term Weight (Un-normalized):   0.080777012794313
Lemma: problem
Max TF Term Weight (Un-normalized):   0.12223731744927563
Lemma: radial
Max TF Term Weight (Un-normalized):   0.26089329920314475
Lemma: radius
Max TF Term Weight (Un-normalized):   0.22468094279044476
Lemma: reduce
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: represent
Max TF Term Weight (Un-normalized):   0.19776129304245038
Lemma: require
Max TF Term Weight (Un-normalized):   0.16737563047407975
Lemma: respectively
Max TF Term Weight (Un-normalized):   0.2501334184373825
Lemma: result
Max TF Term Weight (Un-normalized):   0.061118658724637814
Lemma: role
Max TF Term Weight (Un-normalized):   0.326168403240055
Lemma: satisfactory
Max TF Term Weight (Un-normalized):   0.23259140509012718
Lemma: sc
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: set
Max TF Term Weight (Un-normalized):   0.30040776941584785
Lemma: shear
Max TF Term Weight (Un-normalized):   0.18420899753729034
Lemma: shell
Max TF Term Weight (Un-normalized):   0.2572094716012497
Lemma: short
Max TF Term Weight (Un-normalized):   0.2520458958633574
Lemma: simplicity
Max TF Term Weight (Un-normalized):   0.3318056314958718
Lemma: simply
Max TF Term Weight (Un-normalized):   0.24816706137967587
Lemma: single
Max TF Term Weight (Un-normalized):   0.21886081814845823
Lemma: solution
Max TF Term Weight (Un-normalized):   0.1101672769643373
Lemma: sphere
Max TF Term Weight (Un-normalized):   0.35652524428756976
Lemma: stability
Max TF Term Weight (Un-normalized):   0.2895825617878852
Lemma: state
Max TF Term Weight (Un-normalized):   0.20552496021033634
Lemma: substantially
Max TF Term Weight (Un-normalized):   0.30320222045853323
Lemma: such
Max TF Term Weight (Un-normalized):   0.1358265899844535
Lemma: suggest
Max TF Term Weight (Un-normalized):   0.21251089165030795
Lemma: support
Max TF Term Weight (Un-normalized):   0.20910528650089605
Lemma: system
Max TF Term Weight (Un-normalized):   0.19352963021134736
Lemma: term
Max TF Term Weight (Un-normalized):   0.14514722265851052
Lemma: test
Max TF Term Weight (Un-normalized):   0.16139214360235218
Lemma: theoretical
Max TF Term Weight (Un-normalized):   0.12506670921869126
Lemma: theory
Max TF Term Weight (Un-normalized):   0.14962650106547581
Lemma: these
Max TF Term Weight (Un-normalized):   0.07668430166585444
Lemma: thin
Max TF Term Weight (Un-normalized):   0.2517149649615209
Lemma: three
Max TF Term Weight (Un-normalized):   0.16072287894805923
Lemma: thus
Max TF Term Weight (Un-normalized):   0.2017510108845457
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: torsion
Max TF Term Weight (Un-normalized):   0.4302411673642251
Lemma: type
Max TF Term Weight (Un-normalized):   0.19513310068521755
Lemma: under
Max TF Term Weight (Un-normalized):   0.248479000946956
Lemma: unequal
Max TF Term Weight (Un-normalized):   0.4572723478805719
Lemma: use
Max TF Term Weight (Un-normalized):   0.04838240755283684
Lemma: value
Max TF Term Weight (Un-normalized):   0.09676481510567368
Lemma: view
Max TF Term Weight (Un-normalized):   0.27021393187720183
Lemma: yield
Max TF Term Weight (Un-normalized):   0.2017510108845457

Rank#: 4
Cosine Similarity: 0.06992478526513767
Doc#: 554  Document Headline:  generalized heat transfer formulas and graphs .
Document Vector: 
Lemma: air
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: also
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: altitude
Max TF Term Weight (Un-normalized):   0.32353939844376006
Lemma: application
Max TF Term Weight (Un-normalized):   0.1592424314547022
Lemma: around
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: ars
Max TF Term Weight (Un-normalized):   0.28774434093827134
Lemma: associate
Max TF Term Weight (Un-normalized):   0.2171137607637741
Lemma: atmosphere
Max TF Term Weight (Un-normalized):   0.2240213044582042
Lemma: axisymmetric
Max TF Term Weight (Un-normalized):   0.23886364718205333
Lemma: between
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: body
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: calculate
Max TF Term Weight (Un-normalized):   0.12985660974526858
Lemma: cone
Max TF Term Weight (Un-normalized):   0.17378591044028668
Lemma: correlation
Max TF Term Weight (Un-normalized):   0.23032739778110356
Lemma: cover
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: design
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: determine
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: detrarw
Max TF Term Weight (Un-normalized):   0.474785314149417
Lemma: dissociate
Max TF Term Weight (Un-normalized):   0.2942779834397059
Lemma: distribution
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: earth
Max TF Term Weight (Un-normalized):   0.30364252018555526
Lemma: engineering
Max TF Term Weight (Un-normalized):   0.2942779834397059
Lemma: entry
Max TF Term Weight (Un-normalized):   0.423922054096528
Lemma: estimate
Max TF Term Weight (Un-normalized):   0.19126397467562126
Lemma: evaluation
Max TF Term Weight (Un-normalized):   0.28774434093827134
Lemma: find
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: formula
Max TF Term Weight (Un-normalized):   0.330447099899901
Lemma: fp
Max TF Term Weight (Un-normalized):   0.44529588362487266
Lemma: ft
Max TF Term Weight (Un-normalized):   0.2708851904029723
Lemma: generalize
Max TF Term Weight (Un-normalized):   0.3858912128538697
Lemma: give
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: graph
Max TF Term Weight (Un-normalized):   0.5474044739491205
Lemma: have
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: heat
Max TF Term Weight (Un-normalized):   0.21709169731233893
Lemma: heating
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: icbm
Max TF Term Weight (Un-normalized):   0.474785314149417
Lemma: important
Max TF Term Weight (Un-normalized):   0.20947782547261967
Lemma: interest
Max TF Term Weight (Un-normalized):   0.2488760036943977
Lemma: into
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: investigation
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: kidalgoh
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.15163614277344992
Lemma: last
Max TF Term Weight (Un-normalized):   0.4083777354393953
Lemma: make
Max TF Term Weight (Un-normalized):   0.0796212157273511
Lemma: may
Max TF Term Weight (Un-normalized):   0.11664297272793914
Lemma: momentum
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: nose
Max TF Term Weight (Un-normalized):   0.1800920037631861
Lemma: number
Max TF Term Weight (Un-normalized):   0.05023539401791748
Lemma: practical
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: preliminary
Max TF Term Weight (Un-normalized):   0.2708851904029723
Lemma: previously
Max TF Term Weight (Un-normalized):   0.23328594545587827
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: radiative
Max TF Term Weight (Un-normalized):   0.3655189764223369
Lemma: range
Max TF Term Weight (Un-normalized):   0.10047078803583497
Lemma: rapid
Max TF Term Weight (Un-normalized):   0.27259054799799826
Lemma: re
Max TF Term Weight (Un-normalized):   0.40945158794289593
Lemma: regime
Max TF Term Weight (Un-normalized):   0.277478311244903
Lemma: report
Max TF Term Weight (Un-normalized):   0.2341200344635083
Lemma: research
Max TF Term Weight (Un-normalized):   0.21339631239739099
Lemma: result
Max TF Term Weight (Un-normalized):   0.06530613204919503
Lemma: reynold
Max TF Term Weight (Un-normalized):   0.14102858065770377
Lemma: section
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: specialize
Max TF Term Weight (Un-normalized):   0.474785314149417
Lemma: these
Max TF Term Weight (Un-normalized):   0.11924144168115643
Lemma: thickness
Max TF Term Weight (Un-normalized):   0.15070618205375244
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: today
Max TF Term Weight (Un-normalized):   0.5250207081673345
Lemma: trajectory
Max TF Term Weight (Un-normalized):   0.3284972194217488
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.24168444234166808
Lemma: turbulent
Max TF Term Weight (Un-normalized):   0.22592209810188785
Lemma: up
Max TF Term Weight (Un-normalized):   0.16687836674585665
Lemma: useful
Max TF Term Weight (Un-normalized):   0.2576715533856429
Lemma: utilize
Max TF Term Weight (Un-normalized):   0.27259054799799826
Lemma: valid
Max TF Term Weight (Un-normalized):   0.24404258942178847
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.13061226409839005

Rank#: 5
Cosine Similarity: 0.06915940556543843
Doc#: 706  Document Headline:  on som reciprocal relations in the theory of nonstationary flows .
Document Vector: 
Lemma: about
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: airfoil
Max TF Term Weight (Un-normalized):   0.31166881026124343
Lemma: also
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: alternate
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: analogy
Max TF Term Weight (Un-normalized):   0.2945300320375571
Lemma: approximate
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: between
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: broad
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: certain
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: draw
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: electrical
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: employ
Max TF Term Weight (Un-normalized):   0.22792232178583569
Lemma: exist
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fourier
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: function
Max TF Term Weight (Un-normalized):   0.25806446724599474
Lemma: fundamental
Max TF Term Weight (Un-normalized):   0.2976358649095804
Lemma: garrick
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: general
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: give
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: ie
Max TF Term Weight (Un-normalized):   0.29914249513506797
Lemma: indicial
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: interesting
Max TF Term Weight (Un-normalized):   0.31521938547278605
Lemma: lift
Max TF Term Weight (Un-normalized):   0.2357164288121836
Lemma: may
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: naca
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: nature
Max TF Term Weight (Un-normalized):   0.280658581339866
Lemma: nonstationary
Max TF Term Weight (Un-normalized):   0.6706363496127035
Lemma: notable
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: paper
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: problem
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: reciprocal
Max TF Term Weight (Un-normalized):   0.403108384017641
Lemma: relation
Max TF Term Weight (Un-normalized):   0.283830862173043
Lemma: rep
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: report
Max TF Term Weight (Un-normalized):   0.25438074935942856
Lemma: result
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: significance
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: simplicity
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: som
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: theodorsen
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: theory
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: these
Max TF Term Weight (Un-normalized):   0.11246531827290702
Lemma: transform
Max TF Term Weight (Un-normalized):   0.28437065120538046
Lemma: transient
Max TF Term Weight (Un-normalized):   0.37763185989870507
Lemma: treatment
Max TF Term Weight (Un-normalized):   0.26829376086766243
Lemma: unify
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: wagner
Max TF Term Weight (Un-normalized):   0.49842152229352504
 ***************************** 
Processing Query:  has anyone formally determined the influence of joule heating,  produced by the induced current,  in magnetohydrodynamic free convection flows under general conditions  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.17683831514749626
Doc#: 500  Document Headline:  joule heating in magnetohydrodynamic free-convection flows .
Document Vector: 
Lemma: actual
Max TF Term Weight (Un-normalized):   0.28616090651285647
Lemma: alter
Max TF Term Weight (Un-normalized):   0.36166426577565475
Lemma: analytic
Max TF Term Weight (Un-normalized):   0.40644015026932034
Lemma: analyze
Max TF Term Weight (Un-normalized):   0.23517374330390606
Lemma: between
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: confirm
Max TF Term Weight (Un-normalized):   0.3555197527697774
Lemma: constant
Max TF Term Weight (Un-normalized):   0.19920349198833642
Lemma: convection
Max TF Term Weight (Un-normalized):   0.4004751420811063
Lemma: cramerkr
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: description
Max TF Term Weight (Un-normalized):   0.28437065120538046
Lemma: develop
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: distribute
Max TF Term Weight (Un-normalized):   0.2825372530897547
Lemma: electrically
Max TF Term Weight (Un-normalized):   0.31521938547278605
Lemma: energy
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: equation
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: estimate
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: field
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: free
Max TF Term Weight (Un-normalized):   0.18342303381616776
Lemma: fully
Max TF Term Weight (Un-normalized):   0.3919393380634704
Lemma: have
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: heating
Max TF Term Weight (Un-normalized):   0.3833179287370788
Lemma: influence
Max TF Term Weight (Un-normalized):   0.2625747489048396
Lemma: jaesc
Max TF Term Weight (Un-normalized):   0.3062581764920053
Lemma: joule
Max TF Term Weight (Un-normalized):   0.9607214985391466
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: located
Max TF Term Weight (Un-normalized):   0.3062581764920053
Lemma: magnetic
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: magnetohydrodynamic
Max TF Term Weight (Un-normalized):   0.3115073156072715
Lemma: magnitude
Max TF Term Weight (Un-normalized):   0.2240198079156675
Lemma: manner
Max TF Term Weight (Un-normalized):   0.2385557374233597
Lemma: negligibly
Max TF Term Weight (Un-normalized):   0.4287079791697803
Lemma: obtain
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: openend
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: plate
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: practice
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: qualitative
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: result
Max TF Term Weight (Un-normalized):   0.0829598817736689
Lemma: retain
Max TF Term Weight (Un-normalized):   0.38371558518395665
Lemma: small
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: steady
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: submerge
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: such
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: term
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.2417937724835268
Lemma: two
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: uniformly
Max TF Term Weight (Un-normalized):   0.2945300320375571
Lemma: useful
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: usual
Max TF Term Weight (Un-normalized):   0.2767560674696978
Lemma: vertical
Max TF Term Weight (Un-normalized):   0.26368129777015153
Lemma: well
Max TF Term Weight (Un-normalized):   0.15820877866209093

Rank#: 2
Cosine Similarity: 0.1220253188771395
Doc#: 268  Document Headline:  several magnetohydrodynamic free-convection solutions .
Document Vector: 
Lemma: analytical
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: between
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: buoyant
Max TF Term Weight (Un-normalized):   0.48451208163282317
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: con
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: considerable
Max TF Term Weight (Un-normalized):   0.2608064915995677
Lemma: convection
Max TF Term Weight (Un-normalized):   0.4425502796121032
Lemma: cramerkr
Max TF Term Weight (Un-normalized):   0.4332475319470962
Lemma: decrease
Max TF Term Weight (Un-normalized):   0.20028498705527228
Lemma: demonstrate
Max TF Term Weight (Un-normalized):   0.26295038407433075
Lemma: determine
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: examine
Max TF Term Weight (Un-normalized):   0.24096592547540846
Lemma: exert
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: extent
Max TF Term Weight (Un-normalized):   0.29363926273884694
Lemma: field
Max TF Term Weight (Un-normalized):   0.2786842993986344
Lemma: flat
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.14391778588729218
Lemma: force
Max TF Term Weight (Un-normalized):   0.20289561155684308
Lemma: free
Max TF Term Weight (Un-normalized):   0.20269401611500154
Lemma: general
Max TF Term Weight (Un-normalized):   0.1325169385539607
Lemma: heat
Max TF Term Weight (Un-normalized):   0.15703634026772897
Lemma: increase
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: influence
Max TF Term Weight (Un-normalized):   0.31995886657602296
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: liquid
Max TF Term Weight (Un-normalized):   0.4087936804459398
Lemma: magnetic
Max TF Term Weight (Un-normalized):   0.44350393614134803
Lemma: magnetohydrodynamic
Max TF Term Weight (Un-normalized):   0.3028140864267262
Lemma: magnitude
Max TF Term Weight (Un-normalized):   0.28729528356309203
Lemma: metal
Max TF Term Weight (Un-normalized):   0.4726578178335276
Lemma: nat
Max TF Term Weight (Un-normalized):   0.39185884543125793
Lemma: nondimensional
Max TF Term Weight (Un-normalized):   0.3173185686446376
Lemma: number
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: over
Max TF Term Weight (Un-normalized):   0.11903259818703853
Lemma: parallel
Max TF Term Weight (Un-normalized):   0.22517017475552598
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.16250477773646754
Lemma: plate
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: practical
Max TF Term Weight (Un-normalized):   0.21776809107429526
Lemma: prandtl
Max TF Term Weight (Un-normalized):   0.22861075378373358
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: result
Max TF Term Weight (Un-normalized):   0.05126454968572696
Lemma: several
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: shear
Max TF Term Weight (Un-normalized):   0.19518233557301914
Lemma: solution
Max TF Term Weight (Un-normalized):   0.08125238886823377
Lemma: specific
Max TF Term Weight (Un-normalized):   0.23806519637407705
Lemma: strength
Max TF Term Weight (Un-normalized):   0.2970606432154912
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.18206876523418575
Lemma: th
Max TF Term Weight (Un-normalized):   0.3455982692790496
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: throughout
Max TF Term Weight (Un-normalized):   0.289329746059804
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.17482584914510846
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.23504603792541467
Lemma: variation
Max TF Term Weight (Un-normalized):   0.17734620409800658
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10252909937145392
Lemma: vertical
Max TF Term Weight (Un-normalized):   0.33815935259473845
Lemma: wall
Max TF Term Weight (Un-normalized):   0.18986666458933038

Rank#: 3
Cosine Similarity: 0.09298895795411043
Doc#: 88  Document Headline:  magnetohydrodynamic free-convection pipe flow .
Document Vector: 
Lemma: ae
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: analyze
Max TF Term Weight (Un-normalized):   0.23517374330390606
Lemma: buoyant
Max TF Term Weight (Un-normalized):   0.49842152229352504
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: conductivity
Max TF Term Weight (Un-normalized):   0.3115073156072715
Lemma: considerable
Max TF Term Weight (Un-normalized):   0.26829376086766243
Lemma: constant
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: convection
Max TF Term Weight (Un-normalized):   0.2976358649095804
Lemma: cramerkr
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: determine
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: develop
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: electrical
Max TF Term Weight (Un-normalized):   0.33977674048902995
Lemma: end
Max TF Term Weight (Un-normalized):   0.27264250675093227
Lemma: exert
Max TF Term Weight (Un-normalized):   0.403108384017641
Lemma: extent
Max TF Term Weight (Un-normalized):   0.30206909979668417
Lemma: field
Max TF Term Weight (Un-normalized):   0.2488796453210067
Lemma: flat
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.14804939782991433
Lemma: force
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: fourth
Max TF Term Weight (Un-normalized):   0.33527351264378497
Lemma: free
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: freeconvection
Max TF Term Weight (Un-normalized):   0.6706363496127035
Lemma: fully
Max TF Term Weight (Un-normalized):   0.3919393380634704
Lemma: grashof
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: hartmann
Max TF Term Weight (Un-normalized):   0.44568526273949477
Lemma: have
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: heat
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: influence
Max TF Term Weight (Un-normalized):   0.3401607673240275
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.12244980267777505
Lemma: liquid
Max TF Term Weight (Un-normalized):   0.31875873712534186
Lemma: located
Max TF Term Weight (Un-normalized):   0.3062581764920053
Lemma: magnetic
Max TF Term Weight (Un-normalized):   0.4255247126694422
Lemma: magnetohydrodynamic
Max TF Term Weight (Un-normalized):   0.3115073156072715
Lemma: magnitude
Max TF Term Weight (Un-normalized):   0.30142323214732086
Lemma: measure
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: metal
Max TF Term Weight (Un-normalized):   0.36855708958289396
Lemma: nondimensional
Max TF Term Weight (Un-normalized):   0.32642819453100774
Lemma: note
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: number
Max TF Term Weight (Un-normalized):   0.07095771554326075
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: open
Max TF Term Weight (Un-normalized):   0.33527351264378497
Lemma: parallel
Max TF Term Weight (Un-normalized):   0.2316343916513502
Lemma: parameter
Max TF Term Weight (Un-normalized):   0.22493063654581405
Lemma: pipe
Max TF Term Weight (Un-normalized):   0.5287209185261821
Lemma: plate
Max TF Term Weight (Un-normalized):   0.18342303381616776
Lemma: practical
Max TF Term Weight (Un-normalized):   0.2240198079156675
Lemma: profile
Max TF Term Weight (Un-normalized):   0.1890575129294965
Lemma: rate
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: ratio
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: relative
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: root
Max TF Term Weight (Un-normalized):   0.31521938547278605
Lemma: same
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: sc
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: shear
Max TF Term Weight (Un-normalized):   0.20078565738394463
Lemma: show
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: steady
Max TF Term Weight (Un-normalized):   0.19514734943993142
Lemma: strength
Max TF Term Weight (Un-normalized):   0.31166881026124343
Lemma: submerge
Max TF Term Weight (Un-normalized):   0.46746402125972736
Lemma: surface
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.1647587132689228
Lemma: term
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: that
Max TF Term Weight (Un-normalized):   0.0
Lemma: through
Max TF Term Weight (Un-normalized):   0.1671699876428717
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.3253384649026893
Lemma: velocity
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: vertical
Max TF Term Weight (Un-normalized):   0.35478857771630373
Lemma: volumetric
Max TF Term Weight (Un-normalized):   0.5511577818475554

Rank#: 4
Cosine Similarity: 0.08185450867556124
Doc#: 270  Document Headline:  on combined free and forced convection laminar magnetohydrodynamic flow and heat transfer in channels with transverse magnetic field .
Document Vector: 
Lemma: application
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: attention
Max TF Term Weight (Un-normalized):   0.25645134778023415
Lemma: attract
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: by
Max TF Term Weight (Un-normalized):   0.0
Lemma: case
Max TF Term Weight (Un-normalized):   0.11254116526017925
Lemma: channel
Max TF Term Weight (Un-normalized):   0.5542512286689999
Lemma: combine
Max TF Term Weight (Un-normalized):   0.3768431741882471
Lemma: concern
Max TF Term Weight (Un-normalized):   0.3375904049196857
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.23687131902227823
Lemma: convection
Max TF Term Weight (Un-normalized):   0.3511276693168145
Lemma: convective
Max TF Term Weight (Un-normalized):   0.429185647720287
Lemma: design
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: devel
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: develop
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: due
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: effect
Max TF Term Weight (Un-normalized):   0.04886716653827329
Lemma: electrically
Max TF Term Weight (Un-normalized):   0.3718713407678955
Lemma: engineering
Max TF Term Weight (Un-normalized):   0.3644492603209721
Lemma: establish
Max TF Term Weight (Un-normalized):   0.2373957663286657
Lemma: etc
Max TF Term Weight (Un-normalized):   0.3195501626426334
Lemma: example
Max TF Term Weight (Un-normalized):   0.16905262103571717
Lemma: except
Max TF Term Weight (Un-normalized):   0.22969717050951516
Lemma: expect
Max TF Term Weight (Un-normalized):   0.25065352741098657
Lemma: field
Max TF Term Weight (Un-normalized):   0.26153992681446986
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: fluid
Max TF Term Weight (Un-normalized):   0.17465717721743013
Lemma: force
Max TF Term Weight (Un-normalized):   0.26153992681446986
Lemma: free
Max TF Term Weight (Un-normalized):   0.21407404725261564
Lemma: fully
Max TF Term Weight (Un-normalized):   0.34364366680199526
Lemma: future
Max TF Term Weight (Un-normalized):   0.3195501626426334
Lemma: general
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: generator
Max TF Term Weight (Un-normalized):   0.35556358306573094
Lemma: gershunus
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: hartmann
Max TF Term Weight (Un-normalized):   0.4129867408520162
Lemma: have
Max TF Term Weight (Un-normalized):   0.09860708177523271
Lemma: heat
Max TF Term Weight (Un-normalized):   0.16486982709690284
Lemma: however
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: hydrodynamic
Max TF Term Weight (Un-normalized):   0.3195501626426334
Lemma: include
Max TF Term Weight (Un-normalized):   0.1608212235800808
Lemma: information
Max TF Term Weight (Un-normalized):   0.24209753616297452
Lemma: int
Max TF Term Weight (Un-normalized):   0.39725502702580645
Lemma: laminar
Max TF Term Weight (Un-normalized):   0.1444567637559832
Lemma: large
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: limit
Max TF Term Weight (Un-normalized):   0.1997427273823841
Lemma: magnetic
Max TF Term Weight (Un-normalized):   0.4471707682874966
Lemma: magneto
Max TF Term Weight (Un-normalized):   0.4129867408520162
Lemma: magnetohydrodynamic
Max TF Term Weight (Un-normalized):   0.3674921291409121
Lemma: moriy
Max TF Term Weight (Un-normalized):   0.4618539073902895
Lemma: need
Max TF Term Weight (Un-normalized):   0.2600675465175763
Lemma: no
Max TF Term Weight (Un-normalized):   0.1623332134410297
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: ostrach
Max TF Term Weight (Un-normalized):   0.4331676605570754
Lemma: other
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: paper
Max TF Term Weight (Un-normalized):   0.12631979301793214
Lemma: papers
Max TF Term Weight (Un-normalized):   0.364119574313743
Lemma: particular
Max TF Term Weight (Un-normalized):   0.17518695955620545
Lemma: pattern
Max TF Term Weight (Un-normalized):   0.23235787943897654
Lemma: plasma
Max TF Term Weight (Un-normalized):   0.3735335934203326
Lemma: publish
Max TF Term Weight (Un-normalized):   0.2635072735261623
Lemma: report
Max TF Term Weight (Un-normalized):   0.22303536538492896
Lemma: researcher
Max TF Term Weight (Un-normalized):   0.5107210739285628
Lemma: special
Max TF Term Weight (Un-normalized):   0.21120037997930297
Lemma: study
Max TF Term Weight (Un-normalized):   0.18011654520506107
Lemma: tao
Max TF Term Weight (Un-normalized):   0.4618539073902895
Lemma: temperature
Max TF Term Weight (Un-normalized):   0.11346604690275637
Lemma: to
Max TF Term Weight (Un-normalized):   0.0
Lemma: transfer
Max TF Term Weight (Un-normalized):   0.18354673492442877
Lemma: transverse
Max TF Term Weight (Un-normalized):   0.3556645907093489
Lemma: treatment
Max TF Term Weight (Un-normalized):   0.24860989392065738
Lemma: vary
Max TF Term Weight (Un-normalized):   0.1549052529593177
Lemma: vertical
Max TF Term Weight (Un-normalized):   0.3550278483212478
Lemma: wall
Max TF Term Weight (Un-normalized):   0.13718748050823018
Lemma: without
Max TF Term Weight (Un-normalized):   0.20377241949759098
Lemma: zhukhovitskius
Max TF Term Weight (Un-normalized):   0.5107210739285628

Rank#: 5
Cosine Similarity: 0.0808129979897273
Doc#: 450  Document Headline:  some physical interpretations of magnetohydrodynamic duct flows .
Document Vector: 
Lemma: apply
Max TF Term Weight (Un-normalized):   0.13632125337546613
Lemma: be
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: boundary
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: combination
Max TF Term Weight (Un-normalized):   0.22792232178583569
Lemma: condition
Max TF Term Weight (Un-normalized):   0.10547251910806062
Lemma: conduct
Max TF Term Weight (Un-normalized):   0.27016120753159717
Lemma: current
Max TF Term Weight (Un-normalized):   0.42413412853415045
Lemma: direction
Max TF Term Weight (Un-normalized):   0.2155575013136321
Lemma: duct
Max TF Term Weight (Un-normalized):   0.6304159114279742
Lemma: effect
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: electric
Max TF Term Weight (Un-normalized):   0.3448507763276174
Lemma: example
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: field
Max TF Term Weight (Un-normalized):   0.15820877866209093
Lemma: fig
Max TF Term Weight (Un-normalized):   0.37597171961575
Lemma: flow
Max TF Term Weight (Un-normalized):   0.0
Lemma: from
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: fujihiko
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: have
Max TF Term Weight (Un-normalized):   0.08358499382143585
Lemma: horizontal
Max TF Term Weight (Un-normalized):   0.35037212446361077
Lemma: illustrated
Max TF Term Weight (Un-normalized):   0.3089280062216244
Lemma: interpretation
Max TF Term Weight (Un-normalized):   0.46400377081081084
Lemma: japan
Max TF Term Weight (Un-normalized):   0.3448507763276174
Lemma: light
Max TF Term Weight (Un-normalized):   0.2976358649095804
Lemma: magnetic
Max TF Term Weight (Un-normalized):   0.2704992005076894
Lemma: magnetohydrodynamic
Max TF Term Weight (Un-normalized):   0.4191394626283513
Lemma: nonconducting
Max TF Term Weight (Un-normalized):   0.41472776170569703
Lemma: note
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: on
Max TF Term Weight (Un-normalized):   0.0
Lemma: pattern
Max TF Term Weight (Un-normalized):   0.33739595481872103
Lemma: physical
Max TF Term Weight (Un-normalized):   0.3295174265378456
Lemma: present
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: publish
Max TF Term Weight (Un-normalized):   0.28437065120538046
Lemma: rectangular
Max TF Term Weight (Un-normalized):   0.3295174265378456
Lemma: result
Max TF Term Weight (Un-normalized):   0.05273625955403031
Lemma: sakao
Max TF Term Weight (Un-normalized):   0.5511577818475554
Lemma: take
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: tokyo
Max TF Term Weight (Un-normalized):   0.6706363496127035
Lemma: uniform
Max TF Term Weight (Un-normalized):   0.1824374837498757
Lemma: university
Max TF Term Weight (Un-normalized):   0.32323546006171977
Lemma: various
Max TF Term Weight (Un-normalized):   0.21287314662978224
Lemma: view
Max TF Term Weight (Un-normalized):   0.2945300320375571
Lemma: wall
Max TF Term Weight (Un-normalized):   0.19920349198833642

Okapi Weighting...
 ***************************** 
Processing Query:  what similarity laws must be obeyed when constructing aeroelastic models of heated high speed aircraft  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.16631224480741952
Doc#: 51  Document Headline:  theory of aircraft structural models subjected to aerodynamic heating and external loads .
Document Vector: 
Lemma: ability
Okapi Weight (Un-normalized):   0.548166469165524
Lemma: acceleration
Okapi Weight (Un-normalized):   0.5622583623952699
Lemma: act
Okapi Weight (Un-normalized):   0.5529400097909161
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.4950738756189604
Lemma: aerodynamically
Okapi Weight (Un-normalized):   0.5358824309205628
Lemma: aircraft
Okapi Weight (Un-normalized):   0.5884235523778935
Lemma: analysis
Okapi Weight (Un-normalized):   0.43343036049730943
Lemma: angular
Okapi Weight (Un-normalized):   0.7016083806375528
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: case
Okapi Weight (Un-normalized):   0.4264929338869127
Lemma: construct
Okapi Weight (Un-normalized):   0.5516736523638821
Lemma: cool
Okapi Weight (Un-normalized):   0.4734183774310535
Lemma: correctly
Okapi Weight (Un-normalized):   0.5314512889168693
Lemma: deformation
Okapi Weight (Un-normalized):   0.4828102843153368
Lemma: determination
Okapi Weight (Un-normalized):   0.4766384746328768
Lemma: determine
Okapi Weight (Un-normalized):   0.46011888993337496
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4432081141355674
Lemma: due
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: each
Okapi Weight (Un-normalized):   0.4636406237927956
Lemma: effect
Okapi Weight (Un-normalized):   0.4167151802486547
Lemma: except
Okapi Weight (Un-normalized):   0.47856869713666417
Lemma: external
Okapi Weight (Un-normalized):   0.564011886994863
Lemma: flight
Okapi Weight (Un-normalized):   0.45552662687911244
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: flux
Okapi Weight (Un-normalized):   0.5062676276973874
Lemma: heat
Okapi Weight (Un-normalized):   0.46011888993337496
Lemma: heated
Okapi Weight (Un-normalized):   0.49481561203809044
Lemma: heating
Okapi Weight (Un-normalized):   0.5488170524227243
Lemma: investigate
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: load
Okapi Weight (Un-normalized):   0.5083915807823493
Lemma: material
Okapi Weight (Un-normalized):   0.4734183774310535
Lemma: may
Okapi Weight (Un-normalized):   0.43881144663045774
Lemma: model
Okapi Weight (Un-normalized):   0.5001894001596036
Lemma: naca
Okapi Weight (Un-normalized):   0.4469254435441409
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: osullivanwj
Okapi Weight (Un-normalized):   0.5746938775510204
Lemma: point
Okapi Weight (Un-normalized):   0.4432081141355674
Lemma: problem
Okapi Weight (Un-normalized):   0.43343036049730943
Lemma: purpose
Okapi Weight (Un-normalized):   0.46970104802248
Lemma: require
Okapi Weight (Un-normalized):   0.48957089979264923
Lemma: respect
Okapi Weight (Un-normalized):   0.5282730431438831
Lemma: same
Okapi Weight (Un-normalized):   0.4820750533482858
Lemma: show
Okapi Weight (Un-normalized):   0.4264929338869127
Lemma: similar
Okapi Weight (Un-normalized):   0.5136120929640668
Lemma: simulate
Okapi Weight (Un-normalized):   0.5047504666075586
Lemma: simulation
Okapi Weight (Un-normalized):   0.5216217309457944
Lemma: simultaneous
Okapi Weight (Un-normalized):   0.5516736523638821
Lemma: so
Okapi Weight (Un-normalized):   0.4636406237927956
Lemma: speed
Okapi Weight (Un-normalized):   0.43343036049730943
Lemma: stress
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: structural
Okapi Weight (Un-normalized):   0.5872890048642749
Lemma: structure
Okapi Weight (Un-normalized):   0.5238144101812569
Lemma: study
Okapi Weight (Un-normalized):   0.43881144663045774
Lemma: subject
Okapi Weight (Un-normalized):   0.5206599960989804
Lemma: supersonic
Okapi Weight (Un-normalized):   0.43881144663045774
Lemma: surface
Okapi Weight (Un-normalized):   0.43343036049730943
Lemma: temperature
Okapi Weight (Un-normalized):   0.43881144663045774
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4264929338869127
Lemma: thermally
Okapi Weight (Un-normalized):   0.5314512889168693
Lemma: those
Okapi Weight (Un-normalized):   0.5004590184361865
Lemma: through
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: time
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: tn
Okapi Weight (Un-normalized):   0.45552662687911244
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transient
Okapi Weight (Un-normalized):   0.4889569873764219
Lemma: variation
Okapi Weight (Un-normalized):   0.45782502306341777
Lemma: velocity
Okapi Weight (Un-normalized):   0.4517835931833982
Lemma: without
Okapi Weight (Un-normalized):   0.46970104802248
Lemma: withstand
Okapi Weight (Un-normalized):   0.5579786973023657
Lemma: zero
Okapi Weight (Un-normalized):   0.48601068652507406

Rank#: 2
Cosine Similarity: 0.16534004892800994
Doc#: 486  Document Headline:  similarity laws for aerothermoelastic testing .
Document Vector: 
Lemma: above
Okapi Weight (Un-normalized):   0.46807401056270365
Lemma: achieve
Okapi Weight (Un-normalized):   0.48438596009592116
Lemma: advance
Okapi Weight (Un-normalized):   0.496541374052681
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.44725252877985083
Lemma: aeroelastic
Okapi Weight (Un-normalized):   0.5014817909881816
Lemma: aerothermoelastic
Okapi Weight (Un-normalized):   0.8637239165329054
Lemma: andor
Okapi Weight (Un-normalized):   0.5396184036367437
Lemma: another
Okapi Weight (Un-normalized):   0.4922681385213616
Lemma: apply
Okapi Weight (Un-normalized):   0.4407153383200539
Lemma: appropriate
Okapi Weight (Un-normalized):   0.47803276791252886
Lemma: artificially
Okapi Weight (Un-normalized):   0.5331136987621508
Lemma: assume
Okapi Weight (Un-normalized):   0.44725252877985083
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: basic
Okapi Weight (Un-normalized):   0.48205328169555756
Lemma: behavior
Okapi Weight (Un-normalized):   0.47023980696714524
Lemma: between
Okapi Weight (Un-normalized):   0.4365723247094698
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: case
Okapi Weight (Un-normalized):   0.42496449539343695
Lemma: combine
Okapi Weight (Un-normalized):   0.47651729559474465
Lemma: complete
Okapi Weight (Un-normalized):   0.4691827018100312
Lemma: conduction
Okapi Weight (Un-normalized):   0.523598163810475
Lemma: conflict
Okapi Weight (Un-normalized):   0.6089108350794318
Lemma: deal
Okapi Weight (Un-normalized):   0.48013182810753446
Lemma: deflection
Okapi Weight (Un-normalized):   0.4656798337134908
Lemma: difficult
Okapi Weight (Un-normalized):   0.5014817909881816
Lemma: discuss
Okapi Weight (Un-normalized):   0.4407153383200539
Lemma: dugundjij
Okapi Weight (Un-normalized):   0.5646153846153846
Lemma: equation
Okapi Weight (Un-normalized):   0.42496449539343695
Lemma: estimate
Okapi Weight (Un-normalized):   0.4599690493432112
Lemma: example
Okapi Weight (Un-normalized):   0.4544889640405283
Lemma: expansion
Okapi Weight (Un-normalized):   0.4656798337134908
Lemma: extension
Okapi Weight (Un-normalized):   0.474035887686472
Lemma: external
Okapi Weight (Un-normalized):   0.4669084390279044
Lemma: facet
Okapi Weight (Un-normalized):   0.5646153846153846
Lemma: finally
Okapi Weight (Un-normalized):   0.48079053112606407
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: flutter
Okapi Weight (Un-normalized):   0.4731446494189395
Lemma: form
Okapi Weight (Un-normalized):   0.4365723247094698
Lemma: freestream
Okapi Weight (Un-normalized):   0.49870717045712254
Lemma: general
Okapi Weight (Un-normalized):   0.46389932372161374
Lemma: give
Okapi Weight (Un-normalized):   0.41575084292661696
Lemma: govern
Okapi Weight (Un-normalized):   0.47803276791252886
Lemma: heat
Okapi Weight (Un-normalized):   0.4573972098056065
Lemma: heating
Okapi Weight (Un-normalized):   0.4656798337134908
Lemma: high
Okapi Weight (Un-normalized):   0.4407153383200539
Lemma: higher
Okapi Weight (Un-normalized):   0.45828504475985504
Lemma: include
Okapi Weight (Un-normalized):   0.4407153383200539
Lemma: incomplete
Okapi Weight (Un-normalized):   0.5488645416887676
Lemma: individual
Okapi Weight (Un-normalized):   0.5173628558355338
Lemma: interior
Okapi Weight (Un-normalized):   0.5061837875977782
Lemma: investigate
Okapi Weight (Un-normalized):   0.4499289907868739
Lemma: jaesc
Okapi Weight (Un-normalized):   0.49147073519644513
Lemma: law
Okapi Weight (Un-normalized):   0.5434138883992917
Lemma: less
Okapi Weight (Un-normalized):   0.4643809851809175
Lemma: lifting
Okapi Weight (Un-normalized):   0.48265928195452135
Lemma: look
Okapi Weight (Un-normalized):   0.5646153846153846
Lemma: mach
Okapi Weight (Un-normalized):   0.42496449539343695
Lemma: make
Okapi Weight (Un-normalized):   0.43917969095951875
Lemma: means
Okapi Weight (Un-normalized):   0.45828504475985504
Lemma: mention
Okapi Weight (Un-normalized):   0.5001368030225382
Lemma: model
Okapi Weight (Un-normalized):   0.49701884952164144
Lemma: modeling
Okapi Weight (Un-normalized):   0.5646153846153846
Lemma: more
Okapi Weight (Un-normalized):   0.44725252877985083
Lemma: nondimensional
Okapi Weight (Un-normalized):   0.49749495437023517
Lemma: number
Okapi Weight (Un-normalized):   0.424719632762095
Lemma: numerical
Okapi Weight (Un-normalized):   0.44725252877985083
Lemma: obtain
Okapi Weight (Un-normalized):   0.42496449539343695
Lemma: occur
Okapi Weight (Un-normalized):   0.4544889640405283
Lemma: one
Okapi Weight (Un-normalized):   0.4365723247094698
Lemma: other
Okapi Weight (Un-normalized):   0.4407153383200539
Lemma: panel
Okapi Weight (Un-normalized):   0.47728766302952363
Lemma: parameter
Okapi Weight (Un-normalized):   0.5095488405450397
Lemma: place
Okapi Weight (Un-normalized):   0.4849335447366481
Lemma: plate
Okapi Weight (Un-normalized):   0.4407153383200539
Lemma: present
Okapi Weight (Un-normalized):   0.424719632762095
Lemma: pressure
Okapi Weight (Un-normalized):   0.41575084292661696
Lemma: primary
Okapi Weight (Un-normalized):   0.5061837875977782
Lemma: problem
Okapi Weight (Un-normalized):   0.4610214775633835
Lemma: purpose
Okapi Weight (Un-normalized):   0.4656798337134908
Lemma: range
Okapi Weight (Un-normalized):   0.4315016858532339
Lemma: rate
Okapi Weight (Un-normalized):   0.4499289907868739
Lemma: ratio
Okapi Weight (Un-normalized):   0.4315016858532339
Lemma: restricted
Okapi Weight (Un-normalized):   0.48700075676529103
Lemma: restrictive
Okapi Weight (Un-normalized):   0.5396184036367437
Lemma: reynold
Okapi Weight (Un-normalized):   0.44421820641659426
Lemma: scale
Okapi Weight (Un-normalized):   0.4748934861803108
Lemma: separately
Okapi Weight (Un-normalized):   0.5061837875977782
Lemma: show
Okapi Weight (Un-normalized):   0.42496449539343695
Lemma: similarity
Okapi Weight (Un-normalized):   0.5661364724907623
Lemma: similitude
Okapi Weight (Un-normalized):   0.5146050926219986
Lemma: situation
Okapi Weight (Un-normalized):   0.55715635082008
Lemma: solid
Okapi Weight (Un-normalized):   0.48079053112606407
Lemma: specialize
Okapi Weight (Un-normalized):   0.6336304678415268
Lemma: speed
Okapi Weight (Un-normalized):   0.4315016858532339
Lemma: stagnation
Okapi Weight (Un-normalized):   0.4523231676360867
Lemma: stress
Okapi Weight (Un-normalized):   0.4499289907868739
Lemma: structure
Okapi Weight (Un-normalized):   0.4615368201029067
Lemma: such
Okapi Weight (Un-normalized):   0.44421820641659426
Lemma: surface
Okapi Weight (Un-normalized):   0.4315016858532339
Lemma: temperature
Okapi Weight (Un-normalized):   0.4573972098056065
Lemma: testing
Okapi Weight (Un-normalized):   0.5685279559857459
Lemma: than
Okapi Weight (Un-normalized):   0.4365723247094698
Lemma: thermal
Okapi Weight (Un-normalized):   0.46300337170646777
Lemma: these
Okapi Weight (Un-normalized):   0.43917969095951875
Lemma: thin
Okapi Weight (Un-normalized):   0.4523231676360867
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: tunnel
Okapi Weight (Un-normalized):   0.44421820641659426
Lemma: unity
Okapi Weight (Un-normalized):   0.4838248534893206
Lemma: up
Okapi Weight (Un-normalized):   0.4523231676360867
Lemma: use
Okapi Weight (Un-normalized):   0.424719632762095
Lemma: very
Okapi Weight (Un-normalized):   0.4544889640405283
Lemma: well
Okapi Weight (Un-normalized):   0.44725252877985083
Lemma: wind
Okapi Weight (Un-normalized):   0.4544889640405283
Lemma: wing
Okapi Weight (Un-normalized):   0.4407153383200539

Rank#: 3
Cosine Similarity: 0.15574656063224265
Doc#: 573  Document Headline:  viscous hypersonic similitude .
Document Vector: 
Lemma: accord
Okapi Weight (Un-normalized):   0.5024043474455442
Lemma: account
Okapi Weight (Un-normalized):   0.4771385075900394
Lemma: additional
Okapi Weight (Un-normalized):   0.5004353083282183
Lemma: ae
Okapi Weight (Un-normalized):   0.43774395540018807
Lemma: apply
Okapi Weight (Un-normalized):   0.4734288182419468
Lemma: aspect
Okapi Weight (Un-normalized):   0.4786947316382839
Lemma: basic
Okapi Weight (Un-normalized):   0.4983126877458294
Lemma: body
Okapi Weight (Un-normalized):   0.43774395540018807
Lemma: boundary
Okapi Weight (Un-normalized):   0.440761969086799
Lemma: classical
Okapi Weight (Un-normalized):   0.5457031544007629
Lemma: concept
Okapi Weight (Un-normalized):   0.4907242948855084
Lemma: condition
Okapi Weight (Un-normalized):   0.43774395540018807
Lemma: develop
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: dimensional
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: discuss
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: displacement
Okapi Weight (Un-normalized):   0.4786947316382839
Lemma: distribution
Okapi Weight (Un-normalized):   0.45681228893762416
Lemma: drag
Okapi Weight (Un-normalized):   0.5134719298132001
Lemma: effect
Okapi Weight (Un-normalized):   0.4341584545396512
Lemma: enthalpy
Okapi Weight (Un-normalized):   0.5004353083282183
Lemma: example
Okapi Weight (Un-normalized):   0.4652863163619233
Lemma: extension
Okapi Weight (Un-normalized):   0.488706593541395
Lemma: external
Okapi Weight (Un-normalized):   0.48016679330532325
Lemma: feature
Okapi Weight (Un-normalized):   0.4907242948855084
Lemma: find
Okapi Weight (Un-normalized):   0.43774395540018807
Lemma: flat
Okapi Weight (Un-normalized):   0.45298033948532035
Lemma: free
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: frictional
Okapi Weight (Un-normalized):   0.5442546835561544
Lemma: give
Okapi Weight (Un-normalized):   0.41887197770009404
Lemma: govern
Okapi Weight (Un-normalized):   0.49349548229150925
Lemma: hayerwd
Okapi Weight (Un-normalized):   0.5972350230414747
Lemma: high
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.5222859072603969
Lemma: impose
Okapi Weight (Un-normalized):   0.5199795796583406
Lemma: include
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: independence
Okapi Weight (Un-normalized):   0.5783630453413806
Lemma: independent
Okapi Weight (Un-normalized):   0.4907242948855084
Lemma: interaction
Okapi Weight (Un-normalized):   0.5136245778752482
Lemma: into
Okapi Weight (Un-normalized):   0.4566159331002821
Lemma: invariant
Okapi Weight (Un-normalized):   0.5534156478135386
Lemma: law
Okapi Weight (Un-normalized):   0.488706593541395
Lemma: layer
Okapi Weight (Un-normalized):   0.4646061924581314
Lemma: mach
Okapi Weight (Un-normalized):   0.4299113769690949
Lemma: may
Okapi Weight (Un-normalized):   0.44381937522793613
Lemma: must
Okapi Weight (Un-normalized):   0.4907242948855084
Lemma: new
Okapi Weight (Un-normalized):   0.4771385075900394
Lemma: number
Okapi Weight (Un-normalized):   0.41887197770009404
Lemma: obey
Okapi Weight (Un-normalized):   0.5534156478135386
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: outside
Okapi Weight (Un-normalized):   0.5036421291661259
Lemma: part
Okapi Weight (Un-normalized):   0.467655332369283
Lemma: pressure
Okapi Weight (Un-normalized):   0.4284061444688121
Lemma: principal
Okapi Weight (Un-normalized):   0.5114747075972191
Lemma: principle
Okapi Weight (Un-normalized):   0.5531749477331458
Lemma: probsteinrf
Okapi Weight (Un-normalized):   0.5534156478135386
Lemma: provide
Okapi Weight (Un-normalized):   0.4982691143389874
Lemma: ratio
Okapi Weight (Un-normalized):   0.43774395540018807
Lemma: result
Okapi Weight (Un-normalized):   0.41887197770009404
Lemma: sc
Okapi Weight (Un-normalized):   0.43774395540018807
Lemma: similarity
Okapi Weight (Un-normalized):   0.536558418428823
Lemma: similitude
Okapi Weight (Un-normalized):   0.7116512687222276
Lemma: stream
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: strip
Okapi Weight (Un-normalized):   0.5272248146332825
Lemma: take
Okapi Weight (Un-normalized):   0.4652863163619233
Lemma: temperature
Okapi Weight (Un-normalized):   0.44381937522793613
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4299113769690949
Lemma: thickness
Okapi Weight (Un-normalized):   0.4566159331002821
Lemma: three
Okapi Weight (Un-normalized):   0.4626913529280302
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: total
Okapi Weight (Un-normalized):   0.5136245778752482
Lemma: underlie
Okapi Weight (Un-normalized):   0.5442546835561544
Lemma: various
Okapi Weight (Un-normalized):   0.4566159331002821
Lemma: viscous
Okapi Weight (Un-normalized):   0.5314814909562631
Lemma: wall
Okapi Weight (Un-normalized):   0.45298033948532035

Rank#: 4
Cosine Similarity: 0.15237396556758023
Doc#: 878  Document Headline:  experimental model techniques and equipment for flutter investigations .
Document Vector: 
Lemma: aid
Okapi Weight (Un-normalized):   0.5520389520056007
Lemma: air
Okapi Weight (Un-normalized):   0.4714082836541274
Lemma: aircraft
Okapi Weight (Un-normalized):   0.5060668122081218
Lemma: available
Okapi Weight (Un-normalized):   0.5039692928387488
Lemma: avoidance
Okapi Weight (Un-normalized):   0.6404023654601217
Lemma: clearance
Okapi Weight (Un-normalized):   0.6658385093167702
Lemma: construction
Okapi Weight (Un-normalized):   0.563883637620666
Lemma: describe
Okapi Weight (Un-normalized):   0.48063066835147333
Lemma: designer
Okapi Weight (Un-normalized):   0.5895300777468249
Lemma: detail
Okapi Weight (Un-normalized):   0.4941249170034926
Lemma: different
Okapi Weight (Un-normalized):   0.4941249170034926
Lemma: discuss
Okapi Weight (Un-normalized):   0.46575147803238515
Lemma: electronic
Okapi Weight (Un-normalized):   0.5850765470914264
Lemma: eng
Okapi Weight (Un-normalized):   0.5895300777468249
Lemma: equipment
Okapi Weight (Un-normalized):   0.5777651890614932
Lemma: experimental
Okapi Weight (Un-normalized):   0.450872287713297
Lemma: facility
Okapi Weight (Un-normalized):   0.5689940818059944
Lemma: field
Okapi Weight (Un-normalized):   0.47630843156994546
Lemma: flutter
Okapi Weight (Un-normalized):   0.6204230259373065
Lemma: follow
Okapi Weight (Un-normalized):   0.5060668122081218
Lemma: full
Okapi Weight (Un-normalized):   0.539691565397822
Lemma: give
Okapi Weight (Un-normalized):   0.4352529626478084
Lemma: high
Okapi Weight (Un-normalized):   0.46575147803238515
Lemma: investigation
Okapi Weight (Un-normalized):   0.4590608970463487
Lemma: low
Okapi Weight (Un-normalized):   0.48063066835147333
Lemma: method
Okapi Weight (Un-normalized):   0.44031533417573665
Lemma: model
Okapi Weight (Un-normalized):   0.5135791471073882
Lemma: molyneuxwg
Okapi Weight (Un-normalized):   0.6254707139475366
Lemma: outline
Okapi Weight (Un-normalized):   0.5520389520056007
Lemma: procedure
Okapi Weight (Un-normalized):   0.49937623122208535
Lemma: scale
Okapi Weight (Un-normalized):   0.52094600252721
Lemma: simulator
Okapi Weight (Un-normalized):   0.6254707139475366
Lemma: speed
Okapi Weight (Un-normalized):   0.47050592529561674
Lemma: technique
Okapi Weight (Un-normalized):   0.4968444275107759
Lemma: test
Okapi Weight (Un-normalized):   0.48185484439996107
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: type
Okapi Weight (Un-normalized):   0.4714082836541274
Lemma: uk
Okapi Weight (Un-normalized):   0.6404023654601217
Lemma: use
Okapi Weight (Un-normalized):   0.4352529626478084
Lemma: value
Okapi Weight (Un-normalized):   0.450872287713297
Lemma: various
Okapi Weight (Un-normalized):   0.47630843156994546

Rank#: 5
Cosine Similarity: 0.13737168265384342
Doc#: 12  Document Headline:  some structural and aerelastic considerations of high speed flight .
Document Vector: 
Lemma: acrothermoelasticity
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: ae
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: aerelastic
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: aeroelastic
Okapi Weight (Un-normalized):   0.6019280534968919
Lemma: aeronautical
Okapi Weight (Un-normalized):   0.533414148085585
Lemma: aircraft
Okapi Weight (Un-normalized):   0.5306894650421501
Lemma: alleviate
Okapi Weight (Un-normalized):   0.5821555877797853
Lemma: analytical
Okapi Weight (Un-normalized):   0.4946710656347795
Lemma: another
Okapi Weight (Un-normalized):   0.526261663239758
Lemma: art
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: attack
Okapi Weight (Un-normalized):   0.47726951117965477
Lemma: available
Okapi Weight (Un-normalized):   0.4881002955107292
Lemma: avenue
Okapi Weight (Un-normalized):   0.6037093728372611
Lemma: bisplinghoffrl
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: boundary
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: combine
Okapi Weight (Un-normalized):   0.5047078781822821
Lemma: concerned
Okapi Weight (Un-normalized):   0.5154755243417869
Lemma: consideration
Okapi Weight (Un-normalized):   0.4842082801408197
Lemma: demand
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: design
Okapi Weight (Un-normalized):   0.47160012413359237
Lemma: discuss
Okapi Weight (Un-normalized):   0.455715726122179
Lemma: discussion
Okapi Weight (Un-normalized):   0.4946710656347795
Lemma: dominate
Okapi Weight (Un-normalized):   0.5752168188186203
Lemma: engineer
Okapi Weight (Un-normalized):   0.5478154482972337
Lemma: experimental
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: factor
Okapi Weight (Un-normalized):   0.5281050215334583
Lemma: failure
Okapi Weight (Un-normalized):   0.5154755243417869
Lemma: finally
Okapi Weight (Un-normalized):   0.5105554636461929
Lemma: flight
Okapi Weight (Un-normalized):   0.5226815754192815
Lemma: from
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: fundamental
Okapi Weight (Un-normalized):   0.5216464632097089
Lemma: heat
Okapi Weight (Un-normalized):   0.4500463390761165
Lemma: high
Okapi Weight (Un-normalized):   0.5048117620120198
Lemma: input
Okapi Weight (Un-normalized):   0.5536630337611446
Lemma: interrelation
Okapi Weight (Un-normalized):   0.6037093728372611
Lemma: into
Okapi Weight (Un-normalized):   0.46466135517242746
Lemma: largely
Okapi Weight (Un-normalized):   0.5388698192469854
Lemma: layer
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: load
Okapi Weight (Un-normalized):   0.46050912457007637
Lemma: matter
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: meet
Okapi Weight (Un-normalized):   0.5695029778138578
Lemma: method
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: mode
Okapi Weight (Un-normalized):   0.4974998820950277
Lemma: one
Okapi Weight (Un-normalized):   0.4500463390761165
Lemma: origin
Okapi Weight (Un-normalized):   0.5647540333246605
Lemma: present
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: problem
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: research
Okapi Weight (Un-normalized):   0.4915589165645008
Lemma: respect
Okapi Weight (Un-normalized):   0.5067816824066185
Lemma: sc
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: speed
Okapi Weight (Un-normalized):   0.48109344873109716
Lemma: state
Okapi Weight (Un-normalized):   0.4915589165645008
Lemma: structural
Okapi Weight (Un-normalized):   0.593810340454489
Lemma: structure
Okapi Weight (Un-normalized):   0.5224457134700694
Lemma: subject
Okapi Weight (Un-normalized):   0.48206290962755216
Lemma: suggest
Okapi Weight (Un-normalized):   0.4946710656347795
Lemma: summarize
Okapi Weight (Un-normalized):   0.5388698192469854
Lemma: summary
Okapi Weight (Un-normalized):   0.5409436234713216
Lemma: thermal
Okapi Weight (Un-normalized):   0.5253638518649104
Lemma: these
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: tool
Okapi Weight (Un-normalized):   0.5536630337611446
Lemma: transfer
Okapi Weight (Un-normalized):   0.455715726122179
Lemma: under
Okapi Weight (Un-normalized):   0.46050912457007637
Lemma: upon
Okapi Weight (Un-normalized):   0.48987766718688214
Lemma: well
Okapi Weight (Un-normalized):   0.46466135517242746
 ***************************** 
Processing Query:  what are the structural and aeroelastic problems associated with flight of high speed aircraft  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.21964395513502444
Doc#: 12  Document Headline:  some structural and aerelastic considerations of high speed flight .
Document Vector: 
Lemma: acrothermoelasticity
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: ae
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: aerelastic
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: aeroelastic
Okapi Weight (Un-normalized):   0.6019280534968919
Lemma: aeronautical
Okapi Weight (Un-normalized):   0.533414148085585
Lemma: aircraft
Okapi Weight (Un-normalized):   0.5306894650421501
Lemma: alleviate
Okapi Weight (Un-normalized):   0.5821555877797853
Lemma: analytical
Okapi Weight (Un-normalized):   0.4946710656347795
Lemma: another
Okapi Weight (Un-normalized):   0.526261663239758
Lemma: art
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: attack
Okapi Weight (Un-normalized):   0.47726951117965477
Lemma: available
Okapi Weight (Un-normalized):   0.4881002955107292
Lemma: avenue
Okapi Weight (Un-normalized):   0.6037093728372611
Lemma: bisplinghoffrl
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: boundary
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: combine
Okapi Weight (Un-normalized):   0.5047078781822821
Lemma: concerned
Okapi Weight (Un-normalized):   0.5154755243417869
Lemma: consideration
Okapi Weight (Un-normalized):   0.4842082801408197
Lemma: demand
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: design
Okapi Weight (Un-normalized):   0.47160012413359237
Lemma: discuss
Okapi Weight (Un-normalized):   0.455715726122179
Lemma: discussion
Okapi Weight (Un-normalized):   0.4946710656347795
Lemma: dominate
Okapi Weight (Un-normalized):   0.5752168188186203
Lemma: engineer
Okapi Weight (Un-normalized):   0.5478154482972337
Lemma: experimental
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: factor
Okapi Weight (Un-normalized):   0.5281050215334583
Lemma: failure
Okapi Weight (Un-normalized):   0.5154755243417869
Lemma: finally
Okapi Weight (Un-normalized):   0.5105554636461929
Lemma: flight
Okapi Weight (Un-normalized):   0.5226815754192815
Lemma: from
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: fundamental
Okapi Weight (Un-normalized):   0.5216464632097089
Lemma: heat
Okapi Weight (Un-normalized):   0.4500463390761165
Lemma: high
Okapi Weight (Un-normalized):   0.5048117620120198
Lemma: input
Okapi Weight (Un-normalized):   0.5536630337611446
Lemma: interrelation
Okapi Weight (Un-normalized):   0.6037093728372611
Lemma: into
Okapi Weight (Un-normalized):   0.46466135517242746
Lemma: largely
Okapi Weight (Un-normalized):   0.5388698192469854
Lemma: layer
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: load
Okapi Weight (Un-normalized):   0.46050912457007637
Lemma: matter
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: meet
Okapi Weight (Un-normalized):   0.5695029778138578
Lemma: method
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: mode
Okapi Weight (Un-normalized):   0.4974998820950277
Lemma: one
Okapi Weight (Un-normalized):   0.4500463390761165
Lemma: origin
Okapi Weight (Un-normalized):   0.5647540333246605
Lemma: present
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: problem
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: research
Okapi Weight (Un-normalized):   0.4915589165645008
Lemma: respect
Okapi Weight (Un-normalized):   0.5067816824066185
Lemma: sc
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: speed
Okapi Weight (Un-normalized):   0.48109344873109716
Lemma: state
Okapi Weight (Un-normalized):   0.4915589165645008
Lemma: structural
Okapi Weight (Un-normalized):   0.593810340454489
Lemma: structure
Okapi Weight (Un-normalized):   0.5224457134700694
Lemma: subject
Okapi Weight (Un-normalized):   0.48206290962755216
Lemma: suggest
Okapi Weight (Un-normalized):   0.4946710656347795
Lemma: summarize
Okapi Weight (Un-normalized):   0.5388698192469854
Lemma: summary
Okapi Weight (Un-normalized):   0.5409436234713216
Lemma: thermal
Okapi Weight (Un-normalized):   0.5253638518649104
Lemma: these
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: tool
Okapi Weight (Un-normalized):   0.5536630337611446
Lemma: transfer
Okapi Weight (Un-normalized):   0.455715726122179
Lemma: under
Okapi Weight (Un-normalized):   0.46050912457007637
Lemma: upon
Okapi Weight (Un-normalized):   0.48987766718688214
Lemma: well
Okapi Weight (Un-normalized):   0.46466135517242746

Rank#: 2
Cosine Similarity: 0.14896284551133582
Doc#: 51  Document Headline:  theory of aircraft structural models subjected to aerodynamic heating and external loads .
Document Vector: 
Lemma: ability
Okapi Weight (Un-normalized):   0.548166469165524
Lemma: acceleration
Okapi Weight (Un-normalized):   0.5622583623952699
Lemma: act
Okapi Weight (Un-normalized):   0.5529400097909161
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.4950738756189604
Lemma: aerodynamically
Okapi Weight (Un-normalized):   0.5358824309205628
Lemma: aircraft
Okapi Weight (Un-normalized):   0.5884235523778935
Lemma: analysis
Okapi Weight (Un-normalized):   0.43343036049730943
Lemma: angular
Okapi Weight (Un-normalized):   0.7016083806375528
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: case
Okapi Weight (Un-normalized):   0.4264929338869127
Lemma: construct
Okapi Weight (Un-normalized):   0.5516736523638821
Lemma: cool
Okapi Weight (Un-normalized):   0.4734183774310535
Lemma: correctly
Okapi Weight (Un-normalized):   0.5314512889168693
Lemma: deformation
Okapi Weight (Un-normalized):   0.4828102843153368
Lemma: determination
Okapi Weight (Un-normalized):   0.4766384746328768
Lemma: determine
Okapi Weight (Un-normalized):   0.46011888993337496
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4432081141355674
Lemma: due
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: each
Okapi Weight (Un-normalized):   0.4636406237927956
Lemma: effect
Okapi Weight (Un-normalized):   0.4167151802486547
Lemma: except
Okapi Weight (Un-normalized):   0.47856869713666417
Lemma: external
Okapi Weight (Un-normalized):   0.564011886994863
Lemma: flight
Okapi Weight (Un-normalized):   0.45552662687911244
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: flux
Okapi Weight (Un-normalized):   0.5062676276973874
Lemma: heat
Okapi Weight (Un-normalized):   0.46011888993337496
Lemma: heated
Okapi Weight (Un-normalized):   0.49481561203809044
Lemma: heating
Okapi Weight (Un-normalized):   0.5488170524227243
Lemma: investigate
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: load
Okapi Weight (Un-normalized):   0.5083915807823493
Lemma: material
Okapi Weight (Un-normalized):   0.4734183774310535
Lemma: may
Okapi Weight (Un-normalized):   0.43881144663045774
Lemma: model
Okapi Weight (Un-normalized):   0.5001894001596036
Lemma: naca
Okapi Weight (Un-normalized):   0.4469254435441409
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: osullivanwj
Okapi Weight (Un-normalized):   0.5746938775510204
Lemma: point
Okapi Weight (Un-normalized):   0.4432081141355674
Lemma: problem
Okapi Weight (Un-normalized):   0.43343036049730943
Lemma: purpose
Okapi Weight (Un-normalized):   0.46970104802248
Lemma: require
Okapi Weight (Un-normalized):   0.48957089979264923
Lemma: respect
Okapi Weight (Un-normalized):   0.5282730431438831
Lemma: same
Okapi Weight (Un-normalized):   0.4820750533482858
Lemma: show
Okapi Weight (Un-normalized):   0.4264929338869127
Lemma: similar
Okapi Weight (Un-normalized):   0.5136120929640668
Lemma: simulate
Okapi Weight (Un-normalized):   0.5047504666075586
Lemma: simulation
Okapi Weight (Un-normalized):   0.5216217309457944
Lemma: simultaneous
Okapi Weight (Un-normalized):   0.5516736523638821
Lemma: so
Okapi Weight (Un-normalized):   0.4636406237927956
Lemma: speed
Okapi Weight (Un-normalized):   0.43343036049730943
Lemma: stress
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: structural
Okapi Weight (Un-normalized):   0.5872890048642749
Lemma: structure
Okapi Weight (Un-normalized):   0.5238144101812569
Lemma: study
Okapi Weight (Un-normalized):   0.43881144663045774
Lemma: subject
Okapi Weight (Un-normalized):   0.5206599960989804
Lemma: supersonic
Okapi Weight (Un-normalized):   0.43881144663045774
Lemma: surface
Okapi Weight (Un-normalized):   0.43343036049730943
Lemma: temperature
Okapi Weight (Un-normalized):   0.43881144663045774
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4264929338869127
Lemma: thermally
Okapi Weight (Un-normalized):   0.5314512889168693
Lemma: those
Okapi Weight (Un-normalized):   0.5004590184361865
Lemma: through
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: time
Okapi Weight (Un-normalized):   0.4529858677738253
Lemma: tn
Okapi Weight (Un-normalized):   0.45552662687911244
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transient
Okapi Weight (Un-normalized):   0.4889569873764219
Lemma: variation
Okapi Weight (Un-normalized):   0.45782502306341777
Lemma: velocity
Okapi Weight (Un-normalized):   0.4517835931833982
Lemma: without
Okapi Weight (Un-normalized):   0.46970104802248
Lemma: withstand
Okapi Weight (Un-normalized):   0.5579786973023657
Lemma: zero
Okapi Weight (Un-normalized):   0.48601068652507406

Rank#: 3
Cosine Similarity: 0.14240761084776732
Doc#: 746  Document Headline:  aeroelastic problems in connection with high speed flight .
Document Vector: 
Lemma: aero
Okapi Weight (Un-normalized):   0.48039986546108415
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.461736972275182
Lemma: aeroelastic
Okapi Weight (Un-normalized):   0.5952054179304109
Lemma: aeroelasticity
Okapi Weight (Un-normalized):   0.5824160047515246
Lemma: aerofoil
Okapi Weight (Un-normalized):   0.5136693304471139
Lemma: aspect
Okapi Weight (Un-normalized):   0.48581284806787745
Lemma: attack
Okapi Weight (Un-normalized):   0.47377491017152973
Lemma: both
Okapi Weight (Un-normalized):   0.45777253099655535
Lemma: brief
Okapi Weight (Un-normalized):   0.5136693304471139
Lemma: bring
Okapi Weight (Un-normalized):   0.5345692887414629
Lemma: broadbenteg
Okapi Weight (Un-normalized):   0.6150753768844222
Lemma: case
Okapi Weight (Un-normalized):   0.4326169286547417
Lemma: change
Okapi Weight (Un-normalized):   0.4711916113092329
Lemma: connection
Okapi Weight (Un-normalized):   0.5243875307223687
Lemma: consider
Okapi Weight (Un-normalized):   0.4477829368063424
Lemma: control
Okapi Weight (Un-normalized):   0.49177060206762696
Lemma: damage
Okapi Weight (Un-normalized):   0.5533384046092402
Lemma: damp
Okapi Weight (Un-normalized):   0.50289495379197
Lemma: derivative
Okapi Weight (Un-normalized):   0.49997234600318397
Lemma: design
Okapi Weight (Un-normalized):   0.46836192756473644
Lemma: development
Okapi Weight (Un-normalized):   0.48411586003536966
Lemma: difficult
Okapi Weight (Un-normalized):   0.5325892746579257
Lemma: discuss
Okapi Weight (Un-normalized):   0.47831803671921586
Lemma: during
Okapi Weight (Un-normalized):   0.49893051251334336
Lemma: effect
Okapi Weight (Un-normalized):   0.43029755236192657
Lemma: efflux
Okapi Weight (Un-normalized):   0.6150753768844222
Lemma: field
Okapi Weight (Un-normalized):   0.461736972275182
Lemma: flight
Okapi Weight (Un-normalized):   0.46836192756473644
Lemma: flutter
Okapi Weight (Un-normalized):   0.49556587361268484
Lemma: fold
Okapi Weight (Un-normalized):   0.5944963861260282
Lemma: from
Okapi Weight (Un-normalized):   0.420578990758394
Lemma: fuselage
Okapi Weight (Un-normalized):   0.5243875307223687
Lemma: give
Okapi Weight (Un-normalized):   0.420578990758394
Lemma: hand
Okapi Weight (Un-normalized):   0.5875365336838062
Lemma: have
Okapi Weight (Un-normalized):   0.4480204843572893
Lemma: heating
Okapi Weight (Un-normalized):   0.48581284806787745
Lemma: high
Okapi Weight (Un-normalized):   0.45319591941313575
Lemma: higher
Okapi Weight (Un-normalized):   0.47615131476161965
Lemma: increase
Okapi Weight (Un-normalized):   0.45319591941313575
Lemma: jet
Okapi Weight (Un-normalized):   0.4783515217549493
Lemma: kinetic
Okapi Weight (Un-normalized):   0.5243875307223687
Lemma: lead
Okapi Weight (Un-normalized):   0.45777253099655535
Lemma: mach
Okapi Weight (Un-normalized):   0.4480204843572893
Lemma: make
Okapi Weight (Un-normalized):   0.4326169286547417
Lemma: massbalance
Okapi Weight (Un-normalized):   0.6150753768844222
Lemma: mention
Okapi Weight (Un-normalized):   0.5308320039490448
Lemma: merit
Okapi Weight (Un-normalized):   0.5467134493196857
Lemma: method
Okapi Weight (Un-normalized):   0.4326169286547417
Lemma: more
Okapi Weight (Un-normalized):   0.49089265708577967
Lemma: new
Okapi Weight (Un-normalized):   0.48411586003536966
Lemma: number
Okapi Weight (Un-normalized):   0.43029755236192657
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.4477829368063424
Lemma: other
Okapi Weight (Un-normalized):   0.45319591941313575
Lemma: past
Okapi Weight (Un-normalized):   0.482315963033576
Lemma: possible
Okapi Weight (Un-normalized):   0.47377491017152973
Lemma: prevention
Okapi Weight (Un-normalized):   0.5824160047515246
Lemma: problem
Okapi Weight (Un-normalized):   0.479326279146158
Lemma: provide
Okapi Weight (Un-normalized):   0.4711916113092329
Lemma: recent
Okapi Weight (Un-normalized):   0.49556587361268484
Lemma: relative
Okapi Weight (Un-normalized):   0.5055554678028977
Lemma: require
Okapi Weight (Un-normalized):   0.4711916113092329
Lemma: review
Okapi Weight (Un-normalized):   0.5019523600867212
Lemma: roy
Okapi Weight (Un-normalized):   0.517874822099272
Lemma: slender
Okapi Weight (Un-normalized):   0.48039986546108415
Lemma: soc
Okapi Weight (Un-normalized):   0.5055554678028977
Lemma: speed
Okapi Weight (Un-normalized):   0.44115798151678803
Lemma: steadily
Okapi Weight (Un-normalized):   0.5739173953676342
Lemma: stiffness
Okapi Weight (Un-normalized):   0.5789643271166206
Lemma: surface
Okapi Weight (Un-normalized):   0.44115798151678803
Lemma: ten
Okapi Weight (Un-normalized):   0.5672924400780798
Lemma: these
Okapi Weight (Un-normalized):   0.4326169286547417
Lemma: thinner
Okapi Weight (Un-normalized):   0.5672924400780798
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: two
Okapi Weight (Un-normalized):   0.4326169286547417
Lemma: various
Okapi Weight (Un-normalized):   0.461736972275182
Lemma: year
Okapi Weight (Un-normalized):   0.5308320039490448

Rank#: 4
Cosine Similarity: 0.13632824562725832
Doc#: 1089  Document Headline:  aerodynamic characteristics of propeller-driven vtol aircraft .
Document Vector: 
Lemma: achieve
Okapi Weight (Un-normalized):   0.5075507334555858
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.46022381119000594
Lemma: aircraft
Okapi Weight (Un-normalized):   0.4837095919877824
Lemma: appear
Okapi Weight (Un-normalized):   0.48029841492000797
Lemma: area
Okapi Weight (Un-normalized):   0.4908087137159572
Lemma: associate
Okapi Weight (Un-normalized):   0.4867609938544262
Lemma: avoid
Okapi Weight (Un-normalized):   0.5185784879833164
Lemma: be
Okapi Weight (Un-normalized):   0.4318174941288902
Lemma: because
Okapi Weight (Un-normalized):   0.5345640019229196
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: characteristic
Okapi Weight (Un-normalized):   0.456356537589777
Lemma: chord
Okapi Weight (Un-normalized):   0.5012642130040733
Lemma: combination
Okapi Weight (Un-normalized):   0.4867609938544262
Lemma: configuration
Okapi Weight (Un-normalized):   0.5710394020473967
Lemma: consider
Okapi Weight (Un-normalized):   0.4466117863944222
Lemma: cruise
Okapi Weight (Un-normalized):   0.5534473839788504
Lemma: deflect
Okapi Weight (Un-normalized):   0.5841309065587976
Lemma: device
Okapi Weight (Un-normalized):   0.5460653141260767
Lemma: discuss
Okapi Weight (Un-normalized):   0.45189209785889217
Lemma: drive
Okapi Weight (Un-normalized):   0.5460653141260767
Lemma: during
Okapi Weight (Un-normalized):   0.5430060919381743
Lemma: edge
Okapi Weight (Un-normalized):   0.456356537589777
Lemma: efficiency
Okapi Weight (Un-normalized):   0.5333727802488485
Lemma: essentially
Okapi Weight (Un-normalized):   0.5037841957177843
Lemma: extensible
Okapi Weight (Un-normalized):   0.6098039215686275
Lemma: flap
Okapi Weight (Un-normalized):   0.5864203219287061
Lemma: flight
Okapi Weight (Un-normalized):   0.46668639012442426
Lemma: fuselage
Okapi Weight (Un-normalized):   0.5213388167340752
Lemma: handle
Okapi Weight (Un-normalized):   0.5460653141260767
Lemma: high
Okapi Weight (Un-normalized):   0.47689579634295887
Lemma: horizontal
Okapi Weight (Un-normalized):   0.5333727802488485
Lemma: hover
Okapi Weight (Un-normalized):   0.5431175314442032
Lemma: incur
Okapi Weight (Un-normalized):   0.5696547141086235
Lemma: keep
Okapi Weight (Un-normalized):   0.5976371465188748
Lemma: kirbyrh
Okapi Weight (Un-normalized):   0.6098039215686275
Lemma: lead
Okapi Weight (Un-normalized):   0.456356537589777
Lemma: lift
Okapi Weight (Un-normalized):   0.46668639012442426
Lemma: loss
Okapi Weight (Un-normalized):   0.5185784879833164
Lemma: low
Okapi Weight (Un-normalized):   0.4636349882577804
Lemma: major
Okapi Weight (Un-normalized):   0.5082486354486692
Lemma: make
Okapi Weight (Un-normalized):   0.4318174941288902
Lemma: nasa
Okapi Weight (Un-normalized):   0.4636349882577804
Lemma: order
Okapi Weight (Un-normalized):   0.456356537589777
Lemma: paper
Okapi Weight (Un-normalized):   0.45189209785889217
Lemma: performance
Okapi Weight (Un-normalized):   0.4994535277316544
Lemma: possible
Okapi Weight (Un-normalized):   0.4719667015888942
Lemma: principle
Okapi Weight (Un-normalized):   0.5082486354486692
Lemma: problem
Okapi Weight (Un-normalized):   0.4594947093596185
Lemma: programe
Okapi Weight (Un-normalized):   0.5631921351742052
Lemma: propeller
Okapi Weight (Un-normalized):   0.5175966471350687
Lemma: pure
Okapi Weight (Un-normalized):   0.5149857333223291
Lemma: quality
Okapi Weight (Un-normalized):   0.5495801103786215
Lemma: should
Okapi Weight (Un-normalized):   0.5381424371592562
Lemma: slipstream
Okapi Weight (Un-normalized):   0.5945226764616304
Lemma: slot
Okapi Weight (Un-normalized):   0.5353322783108937
Lemma: stall
Okapi Weight (Un-normalized):   0.5891203543767064
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: tilt
Okapi Weight (Un-normalized):   0.6476747682212534
Lemma: tnd
Okapi Weight (Un-normalized):   0.48029841492000797
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: together
Okapi Weight (Un-normalized):   0.5029683239841993
Lemma: transition
Okapi Weight (Un-normalized):   0.518989418719237
Lemma: turn
Okapi Weight (Un-normalized):   0.5132981765188465
Lemma: two
Okapi Weight (Un-normalized):   0.44714844166314965
Lemma: use
Okapi Weight (Un-normalized):   0.42974735467980923
Lemma: usually
Okapi Weight (Un-normalized):   0.5138716909280988
Lemma: vtol
Okapi Weight (Un-normalized):   0.6005408095066996
Lemma: while
Okapi Weight (Un-normalized):   0.5445120836898325
Lemma: wing
Okapi Weight (Un-normalized):   0.513286434802528

Rank#: 5
Cosine Similarity: 0.1330570522967256
Doc#: 172  Document Headline:  some aerodynamic considerations of nozzle afterbody combination .
Document Vector: 
Lemma: accomplish
Okapi Weight (Un-normalized):   0.5088220358893552
Lemma: account
Okapi Weight (Un-normalized):   0.4636466013195382
Lemma: achieve
Okapi Weight (Un-normalized):   0.4834233826043327
Lemma: aero
Okapi Weight (Un-normalized):   0.46083487918918536
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.49085531416996786
Lemma: afterbody
Okapi Weight (Un-normalized):   0.6085560375012937
Lemma: air
Okapi Weight (Un-normalized):   0.46877407977057534
Lemma: aircraft
Okapi Weight (Un-normalized):   0.46493063408938257
Lemma: although
Okapi Weight (Un-normalized):   0.5092463597893784
Lemma: always
Okapi Weight (Un-normalized):   0.49544014164903827
Lemma: approach
Okapi Weight (Un-normalized):   0.4592849917461404
Lemma: associate
Okapi Weight (Un-normalized):   0.4672975009365131
Lemma: assume
Okapi Weight (Un-normalized):   0.4467135265504229
Lemma: attention
Okapi Weight (Un-normalized):   0.5285627914746294
Lemma: become
Okapi Weight (Un-normalized):   0.47231029980579575
Lemma: both
Okapi Weight (Un-normalized):   0.44371381622933276
Lemma: can
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: closely
Okapi Weight (Un-normalized):   0.4855146084754728
Lemma: combination
Okapi Weight (Un-normalized):   0.5058778230087914
Lemma: compatible
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: complex
Okapi Weight (Un-normalized):   0.49411832172529035
Lemma: compromise
Okapi Weight (Un-normalized):   0.5224546227552584
Lemma: concept
Okapi Weight (Un-normalized):   0.474856167262948
Lemma: condition
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: considerably
Okapi Weight (Un-normalized):   0.4817164004113139
Lemma: consideration
Okapi Weight (Un-normalized):   0.46083487918918536
Lemma: coordinate
Okapi Weight (Un-normalized):   0.4817164004113139
Lemma: correctly
Okapi Weight (Un-normalized):   0.5224546227552584
Lemma: cortrightem
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: design
Okapi Weight (Un-normalized):   0.48138000150777194
Lemma: designer
Okapi Weight (Un-normalized):   0.5160241160351285
Lemma: development
Okapi Weight (Un-normalized):   0.4636466013195382
Lemma: devoted
Okapi Weight (Un-normalized):   0.5132978101966527
Lemma: difficult
Okapi Weight (Un-normalized):   0.5003242040187347
Lemma: difficulty
Okapi Weight (Un-normalized):   0.49411832172529035
Lemma: drag
Okapi Weight (Un-normalized):   0.48138000150777194
Lemma: effect
Okapi Weight (Un-normalized):   0.41557117551680767
Lemma: efficient
Okapi Weight (Un-normalized):   0.503452650839411
Lemma: effort
Okapi Weight (Un-normalized):   0.5132978101966527
Lemma: eng
Okapi Weight (Un-normalized):   0.5160241160351285
Lemma: enlighten
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: entire
Okapi Weight (Un-normalized):   0.48449332089613345
Lemma: examine
Okapi Weight (Un-normalized):   0.4731913718573487
Lemma: exit
Okapi Weight (Un-normalized):   0.5368194144325537
Lemma: external
Okapi Weight (Un-normalized):   0.46614522489450627
Lemma: fact
Okapi Weight (Un-normalized):   0.4855146084754728
Lemma: find
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: flight
Okapi Weight (Un-normalized):   0.45172632541970553
Lemma: frame
Okapi Weight (Un-normalized):   0.5160241160351285
Lemma: from
Okapi Weight (Un-normalized):   0.41557117551680767
Lemma: generally
Okapi Weight (Un-normalized):   0.5202081299362481
Lemma: goal
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: high
Okapi Weight (Un-normalized):   0.4402509048030951
Lemma: importance
Okapi Weight (Un-normalized):   0.47785587758403814
Lemma: increasingly
Okapi Weight (Un-normalized):   0.5224546227552584
Lemma: indicate
Okapi Weight (Un-normalized):   0.4402509048030951
Lemma: induction
Okapi Weight (Un-normalized):   0.5315952915519361
Lemma: influence
Okapi Weight (Un-normalized):   0.4576201963405411
Lemma: information
Okapi Weight (Un-normalized):   0.4771426602937548
Lemma: installation
Okapi Weight (Un-normalized):   0.6862309182840726
Lemma: interaction
Okapi Weight (Un-normalized):   0.5211404188932905
Lemma: interpret
Okapi Weight (Un-normalized):   0.49411832172529035
Lemma: into
Okapi Weight (Un-normalized):   0.4467135265504229
Lemma: isolate
Okapi Weight (Un-normalized):   0.5132978101966527
Lemma: jet
Okapi Weight (Un-normalized):   0.5153061425333724
Lemma: jetstream
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: lack
Okapi Weight (Un-normalized):   0.5110113171658459
Lemma: largely
Okapi Weight (Un-normalized):   0.5003242040187347
Lemma: layer
Okapi Weight (Un-normalized):   0.4246797292862875
Lemma: less
Okapi Weight (Un-normalized):   0.4636466013195382
Lemma: level
Okapi Weight (Un-normalized):   0.47785587758403814
Lemma: literature
Okapi Weight (Un-normalized):   0.5067868257660625
Lemma: low
Okapi Weight (Un-normalized):   0.4493594585725749
Lemma: make
Okapi Weight (Un-normalized):   0.4246797292862875
Lemma: moderate
Okapi Weight (Un-normalized):   0.48286867645332077
Lemma: must
Okapi Weight (Un-normalized):   0.5455912472566951
Lemma: not
Okapi Weight (Un-normalized):   0.4703198355136888
Lemma: nozzle
Okapi Weight (Un-normalized):   0.5695707569164542
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: outline
Okapi Weight (Un-normalized):   0.49307327480190766
Lemma: over
Okapi Weight (Un-normalized):   0.4361551499028979
Lemma: particular
Okapi Weight (Un-normalized):   0.45582208031990273
Lemma: performance
Okapi Weight (Un-normalized):   0.4771426602937548
Lemma: precise
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: predict
Okapi Weight (Un-normalized):   0.45172632541970553
Lemma: problem
Okapi Weight (Un-normalized):   0.4605702094466453
Lemma: propulsion
Okapi Weight (Un-normalized):   0.49899455812114035
Lemma: purpose
Okapi Weight (Un-normalized):   0.46493063408938257
Lemma: range
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: rather
Okapi Weight (Un-normalized):   0.4834233826043327
Lemma: reach
Okapi Weight (Un-normalized):   0.4817164004113139
Lemma: receive
Okapi Weight (Un-normalized):   0.5190238263562186
Lemma: report
Okapi Weight (Un-normalized):   0.45582208031990273
Lemma: rev
Okapi Weight (Un-normalized):   0.5067868257660625
Lemma: role
Okapi Weight (Un-normalized):   0.5049725656860165
Lemma: shockboundary
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: should
Okapi Weight (Un-normalized):   0.47231029980579575
Lemma: solution
Okapi Weight (Un-normalized):   0.4246797292862875
Lemma: speed
Okapi Weight (Un-normalized):   0.44899564300203876
Lemma: stem
Okapi Weight (Un-normalized):   0.5265824926826534
Lemma: stream
Okapi Weight (Un-normalized):   0.4402509048030951
Lemma: supersonic
Okapi Weight (Un-normalized):   0.45688218000675257
Lemma: system
Okapi Weight (Un-normalized):   0.4979912860040775
Lemma: take
Okapi Weight (Un-normalized):   0.4538674169221953
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: this
Okapi Weight (Un-normalized):   0.5088220358893552
Lemma: thrust
Okapi Weight (Un-normalized):   0.5321000297000709
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: treat
Okapi Weight (Un-normalized):   0.4636466013195382
Lemma: trend
Okapi Weight (Un-normalized):   0.49042734277975564
Lemma: turbojet
Okapi Weight (Un-normalized):   0.5160241160351285
Lemma: unit
Okapi Weight (Un-normalized):   0.49411832172529035
Lemma: unsatisfactory
Okapi Weight (Un-normalized):   0.5471664670687437
Lemma: use
Okapi Weight (Un-normalized):   0.41557117551680767
Lemma: vital
Okapi Weight (Un-normalized):   0.5627376425855514
 ***************************** 
Processing Query:  what problems of heat conduction in composite slabs have been solved so far  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.19110361117309294
Doc#: 485  Document Headline:  linear heat flow in a composite slab .
Document Vector: 
Lemma: case
Okapi Weight (Un-normalized):   0.44807976890587853
Lemma: composite
Okapi Weight (Un-normalized):   0.6888270508728883
Lemma: conduction
Okapi Weight (Un-normalized):   0.5516747837377929
Lemma: consider
Okapi Weight (Un-normalized):   0.4704355883293492
Lemma: determine
Okapi Weight (Un-normalized):   0.4704355883293492
Lemma: external
Okapi Weight (Un-normalized):   0.5288606973870751
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: function
Okapi Weight (Un-normalized):   0.5114384523584605
Lemma: heat
Okapi Weight (Un-normalized):   0.49216934821772673
Lemma: jaesc
Okapi Weight (Un-normalized):   0.5761658603783387
Lemma: linear
Okapi Weight (Un-normalized):   0.551133630008739
Lemma: position
Okapi Weight (Un-normalized):   0.5332407590415416
Lemma: prescribe
Okapi Weight (Un-normalized):   0.5761658603783387
Lemma: reidwp
Okapi Weight (Un-normalized):   0.717037037037037
Lemma: slab
Okapi Weight (Un-normalized):   0.6637290517360106
Lemma: surface
Okapi Weight (Un-normalized):   0.46066991349511716
Lemma: temperature
Okapi Weight (Un-normalized):   0.49216934821772673
Lemma: throughout
Okapi Weight (Un-normalized):   0.5712061334062569
Lemma: time
Okapi Weight (Un-normalized):   0.4961595378117571
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: ture
Okapi Weight (Un-normalized):   0.6688947033003955
Lemma: two
Okapi Weight (Un-normalized):   0.44807976890587853

Rank#: 2
Cosine Similarity: 0.1759505655150012
Doc#: 5  Document Headline:  one-dimensional transient heat conduction into a double-layer slab subjected to a linear heat input for a small time internal .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.45388446264368953
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.48082669396553435
Lemma: analytic
Okapi Weight (Un-normalized):   0.554322957879968
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: composite
Okapi Weight (Un-normalized):   0.5960350268534188
Lemma: conduction
Okapi Weight (Un-normalized):   0.5833680221307644
Lemma: dimensional
Okapi Weight (Un-normalized):   0.46964465765272373
Lemma: double
Okapi Weight (Un-normalized):   0.5578270790496975
Lemma: during
Okapi Weight (Un-normalized):   0.5295208683562851
Lemma: example
Okapi Weight (Un-normalized):   0.49320480691143
Lemma: expose
Okapi Weight (Un-normalized):   0.5882907594664499
Lemma: heat
Okapi Weight (Un-normalized):   0.5039213598301873
Lemma: heating
Okapi Weight (Un-normalized):   0.5529261799896203
Lemma: input
Okapi Weight (Un-normalized):   0.5920787922014307
Lemma: internal
Okapi Weight (Un-normalized):   0.5381943295577412
Lemma: into
Okapi Weight (Un-normalized):   0.48082669396553435
Lemma: layer
Okapi Weight (Un-normalized):   0.442702426330879
Lemma: linear
Okapi Weight (Un-normalized):   0.5025786370344403
Lemma: may
Okapi Weight (Un-normalized):   0.46255792384514566
Lemma: occur
Okapi Weight (Un-normalized):   0.49320480691143
Lemma: one
Okapi Weight (Un-normalized):   0.48515347245786994
Lemma: present
Okapi Weight (Un-normalized):   0.4269422313218448
Lemma: rate
Okapi Weight (Un-normalized):   0.5162525755634675
Lemma: sc
Okapi Weight (Un-normalized):   0.45388446264368953
Lemma: slab
Okapi Weight (Un-normalized):   0.6436541537680456
Lemma: small
Okapi Weight (Un-normalized):   0.46255792384514566
Lemma: solution
Okapi Weight (Un-normalized):   0.442702426330879
Lemma: subject
Okapi Weight (Un-normalized):   0.5025786370344403
Lemma: surface
Okapi Weight (Un-normalized):   0.45388446264368953
Lemma: time
Okapi Weight (Un-normalized):   0.4854048526617579
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transient
Okapi Weight (Un-normalized):   0.5951742857363286
Lemma: triangular
Okapi Weight (Un-normalized):   0.5667676851069812
Lemma: type
Okapi Weight (Un-normalized):   0.47563640571259547
Lemma: wassermanb
Okapi Weight (Un-normalized):   0.6815789473684211

Rank#: 3
Cosine Similarity: 0.16048135631955512
Doc#: 181  Document Headline:  some problems on heat conduction in stratiform bodies .
Document Vector: 
Lemma: apply
Okapi Weight (Un-normalized):   0.4725067668713288
Lemma: arise
Okapi Weight (Un-normalized):   0.5414924620056915
Lemma: body
Okapi Weight (Un-normalized):   0.47537213179608107
Lemma: calculation
Okapi Weight (Un-normalized):   0.4725067668713288
Lemma: case
Okapi Weight (Un-normalized):   0.44445732056365483
Lemma: class
Okapi Weight (Un-normalized):   0.5583070411633198
Lemma: complicate
Okapi Weight (Un-normalized):   0.5923625697018795
Lemma: composite
Okapi Weight (Un-normalized):   0.6040912608336961
Lemma: conduction
Okapi Weight (Un-normalized):   0.5884303294902027
Lemma: deduction
Okapi Weight (Un-normalized):   0.6651012386238329
Lemma: difficulty
Okapi Weight (Un-normalized):   0.5695419083133655
Lemma: general
Okapi Weight (Un-normalized):   0.4725067668713288
Lemma: give
Okapi Weight (Un-normalized):   0.42804944630767405
Lemma: heat
Okapi Weight (Un-normalized):   0.48750433519443687
Lemma: idea
Okapi Weight (Un-normalized):   0.5783258136017801
Lemma: infinite
Okapi Weight (Un-normalized):   0.5212276900431709
Lemma: japan
Okapi Weight (Un-normalized):   0.5834197839695281
Lemma: lead
Okapi Weight (Un-normalized):   0.4787447511528391
Lemma: multilayer
Okapi Weight (Un-normalized):   0.6651012386238329
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: paper
Okapi Weight (Un-normalized):   0.4725067668713288
Lemma: phy
Okapi Weight (Un-normalized):   0.5656850106068256
Lemma: present
Okapi Weight (Un-normalized):   0.42804944630767405
Lemma: problem
Okapi Weight (Un-normalized):   0.47537213179608107
Lemma: question
Okapi Weight (Un-normalized):   0.571922994888336
Lemma: soc
Okapi Weight (Un-normalized):   0.543873548580662
Lemma: solide
Okapi Weight (Un-normalized):   0.6931506849315068
Lemma: special
Okapi Weight (Un-normalized):   0.5212276900431709
Lemma: specific
Okapi Weight (Un-normalized):   0.5302575948556457
Lemma: stratiform
Okapi Weight (Un-normalized):   0.6651012386238329
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: usually
Okapi Weight (Un-normalized):   0.5591083900639189
Lemma: vodickav
Okapi Weight (Un-normalized):   0.6651012386238329

Rank#: 4
Cosine Similarity: 0.1602189508613605
Doc#: 399  Document Headline:  conduction of heat in composite slabs .
Document Vector: 
Lemma: additional
Okapi Weight (Un-normalized):   0.5452964127148223
Lemma: allowance
Okapi Weight (Un-normalized):   0.621941303836919
Lemma: appl
Okapi Weight (Un-normalized):   0.621941303836919
Lemma: appropriate
Okapi Weight (Un-normalized):   0.5352567977150501
Lemma: area
Okapi Weight (Un-normalized):   0.5234998506537019
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4705732530880934
Lemma: capacity
Okapi Weight (Un-normalized):   0.5872329011764961
Lemma: composite
Okapi Weight (Un-normalized):   0.5986488272114643
Lemma: conduction
Okapi Weight (Un-normalized):   0.5365073053640135
Lemma: contact
Okapi Weight (Un-normalized):   0.5872329011764961
Lemma: develop
Okapi Weight (Un-normalized):   0.4705732530880934
Lemma: each
Okapi Weight (Un-normalized):   0.5039463521948995
Lemma: from
Okapi Weight (Un-normalized):   0.4273014610728027
Lemma: heat
Okapi Weight (Un-normalized):   0.49747066038742516
Lemma: jaeger
Okapi Weight (Un-normalized):   0.6853333333333333
Lemma: july
Okapi Weight (Un-normalized):   0.5986488272114643
Lemma: layer
Okapi Weight (Un-normalized):   0.4432717920152907
Lemma: make
Okapi Weight (Un-normalized):   0.4432717920152907
Lemma: math
Okapi Weight (Un-normalized):   0.5388951687197264
Lemma: method
Okapi Weight (Un-normalized):   0.4432717920152907
Lemma: pass
Okapi Weight (Un-normalized):   0.5673383816913137
Lemma: pp
Okapi Weight (Un-normalized):   0.5585492743405049
Lemma: quantity
Okapi Weight (Un-normalized):   0.5422256882722998
Lemma: quart
Okapi Weight (Un-normalized):   0.5710924287923458
Lemma: regard
Okapi Weight (Un-normalized):   0.5462689974995967
Lemma: resistance
Okapi Weight (Un-normalized):   0.647961394006115
Lemma: slab
Okapi Weight (Un-normalized):   0.581386981138434
Lemma: surface
Okapi Weight (Un-normalized):   0.45460292214560544
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: thermal
Okapi Weight (Un-normalized):   0.5092058442912109
Lemma: through
Okapi Weight (Un-normalized):   0.48654358403058134
Lemma: time
Okapi Weight (Un-normalized):   0.5173030506438603
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: total
Okapi Weight (Un-normalized):   0.5092058442912109
Lemma: unit
Okapi Weight (Un-normalized):   0.5650207907583424
Lemma: zero
Okapi Weight (Un-normalized):   0.5229279239643001

Rank#: 5
Cosine Similarity: 0.1392802153767689
Doc#: 144  Document Headline:  heat flow in composite slabs .
Document Vector: 
Lemma: analytic
Okapi Weight (Un-normalized):   0.5167019382972893
Lemma: base
Okapi Weight (Un-normalized):   0.45266660678215925
Lemma: case
Okapi Weight (Un-normalized):   0.4322923821009632
Lemma: composite
Okapi Weight (Un-normalized):   0.7063467177695646
Lemma: condition
Okapi Weight (Un-normalized):   0.4407484493623921
Lemma: consist
Okapi Weight (Un-normalized):   0.4946149693976332
Lemma: cylindrical
Okapi Weight (Un-normalized):   0.4775719046230593
Lemma: distribution
Okapi Weight (Un-normalized):   0.4407484493623921
Lemma: engine
Okapi Weight (Un-normalized):   0.5248793893218759
Lemma: exceed
Okapi Weight (Un-normalized):   0.5125382923332124
Lemma: expression
Okapi Weight (Un-normalized):   0.517499925777888
Lemma: exterior
Okapi Weight (Un-normalized):   0.5557376434412213
Lemma: first
Okapi Weight (Un-normalized):   0.46112267404358814
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: form
Okapi Weight (Un-normalized):   0.44730748469881665
Lemma: fourier
Okapi Weight (Un-normalized):   0.5312699783926726
Lemma: from
Okapi Weight (Un-normalized):   0.42037422468119606
Lemma: general
Okapi Weight (Un-normalized):   0.45266660678215925
Lemma: heat
Okapi Weight (Un-normalized):   0.49776015515211247
Lemma: inner
Okapi Weight (Un-normalized):   0.5295301929644771
Lemma: into
Okapi Weight (Un-normalized):   0.46112267404358814
Lemma: jamr
Okapi Weight (Un-normalized):   0.6129353233830845
Lemma: limit
Okapi Weight (Un-normalized):   0.4832788863036744
Lemma: mayere
Okapi Weight (Un-normalized):   0.6129353233830845
Lemma: medium
Okapi Weight (Un-normalized):   0.6727294599239094
Lemma: metallic
Okapi Weight (Un-normalized):   0.5925610987018886
Lemma: model
Okapi Weight (Un-normalized):   0.4571976799418633
Lemma: negligible
Okapi Weight (Un-normalized):   0.511892248900743
Lemma: newtonian
Okapi Weight (Un-normalized):   0.5009379087425747
Lemma: not
Okapi Weight (Un-normalized):   0.44730748469881665
Lemma: obtain
Okapi Weight (Un-normalized):   0.4476678247414463
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: outer
Okapi Weight (Un-normalized):   0.5027756191683133
Lemma: paper
Okapi Weight (Un-normalized):   0.45266660678215925
Lemma: parallel
Okapi Weight (Un-normalized):   0.4894900620428264
Lemma: plane
Okapi Weight (Un-normalized):   0.4775719046230593
Lemma: present
Okapi Weight (Un-normalized):   0.42037422468119606
Lemma: problem
Okapi Weight (Un-normalized):   0.4407484493623921
Lemma: radius
Okapi Weight (Un-normalized):   0.4946149693976332
Lemma: ratio
Okapi Weight (Un-normalized):   0.4407484493623921
Lemma: refractory
Okapi Weight (Un-normalized):   0.7168836707177307
Lemma: relatively
Okapi Weight (Un-normalized):   0.4999740914809758
Lemma: representative
Okapi Weight (Un-normalized):   0.5261128762998066
Lemma: result
Okapi Weight (Un-normalized):   0.42037422468119606
Lemma: rocket
Okapi Weight (Un-normalized):   0.5084301587424047
Lemma: second
Okapi Weight (Un-normalized):   0.4753935902366284
Lemma: shield
Okapi Weight (Un-normalized):   0.733586136656956
Lemma: simplify
Okapi Weight (Un-normalized):   0.49216406765201626
Lemma: slab
Okapi Weight (Un-normalized):   0.6375096261269504
Lemma: solution
Okapi Weight (Un-normalized):   0.4322923821009632
Lemma: sum
Okapi Weight (Un-normalized):   0.5518126493394965
Lemma: temperature
Okapi Weight (Un-normalized):   0.44730748469881665
Lemma: thick
Okapi Weight (Un-normalized):   0.5746564833616332
Lemma: thickness
Okapi Weight (Un-normalized):   0.46112267404358814
Lemma: thin
Okapi Weight (Un-normalized):   0.5187548130634752
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.4924092062744191
Lemma: typical
Okapi Weight (Un-normalized):   0.5061385733375372
Lemma: uncooled
Okapi Weight (Un-normalized):   0.565627838684268
Lemma: under
Okapi Weight (Un-normalized):   0.4844313366094089
Lemma: wall
Okapi Weight (Un-normalized):   0.5108118907789351
 ***************************** 
Processing Query:  can a criterion be developed to show empirically the validity of flow solutions for chemically reacting gas mixtures based on the simplifying assumption of instantaneous local chemical equilibrium  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.1901321699888812
Doc#: 166  Document Headline:  flow of chemically reacting gas mixtures .
Document Vector: 
Lemma: absorption
Okapi Weight (Un-normalized):   0.548412745551304
Lemma: amongst
Okapi Weight (Un-normalized):   0.5972350230414747
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attention
Okapi Weight (Un-normalized):   0.49903877100541727
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: can
Okapi Weight (Un-normalized):   0.43774395540018807
Lemma: characteristic
Okapi Weight (Un-normalized):   0.45298033948532035
Lemma: chemical
Okapi Weight (Un-normalized):   0.49903877100541727
Lemma: chemically
Okapi Weight (Un-normalized):   0.5406190899411926
Lemma: clarkejf
Okapi Weight (Un-normalized):   0.5534156478135386
Lemma: coa
Okapi Weight (Un-normalized):   0.531890301561753
Lemma: concisely
Okapi Weight (Un-normalized):   0.5972350230414747
Lemma: condition
Okapi Weight (Un-normalized):   0.45681228893762416
Lemma: conduct
Okapi Weight (Un-normalized):   0.47185231718541437
Lemma: convective
Okapi Weight (Un-normalized):   0.5140696710311122
Lemma: convergentdivergent
Okapi Weight (Un-normalized):   0.5972350230414747
Lemma: deduce
Okapi Weight (Un-normalized):   0.5156716924133505
Lemma: define
Okapi Weight (Un-normalized):   0.49167970900752817
Lemma: density
Okapi Weight (Un-normalized):   0.4754879108003761
Lemma: depend
Okapi Weight (Un-normalized):   0.48016679330532325
Lemma: derivative
Okapi Weight (Un-normalized):   0.49167970900752817
Lemma: derive
Okapi Weight (Un-normalized):   0.4566159331002821
Lemma: diffusion
Okapi Weight (Un-normalized):   0.5024043474455442
Lemma: discuss
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: dispersion
Okapi Weight (Un-normalized):   0.5972350230414747
Lemma: dissociate
Okapi Weight (Un-normalized):   0.5664026544431492
Lemma: duct
Okapi Weight (Un-normalized):   0.5294236644077162
Lemma: effect
Okapi Weight (Un-normalized):   0.41887197770009404
Lemma: equation
Okapi Weight (Un-normalized):   0.4299113769690949
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.5161090599794582
Lemma: example
Okapi Weight (Un-normalized):   0.4652863163619233
Lemma: exist
Okapi Weight (Un-normalized):   0.46983461584130093
Lemma: explain
Okapi Weight (Un-normalized):   0.5114747075972191
Lemma: express
Okapi Weight (Un-normalized):   0.488706593541395
Lemma: expression
Okapi Weight (Un-normalized):   0.4737307521970311
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: form
Okapi Weight (Un-normalized):   0.44381937522793613
Lemma: frequency
Okapi Weight (Un-normalized):   0.48763875045587224
Lemma: frozen
Okapi Weight (Un-normalized):   0.5948087989119613
Lemma: gas
Okapi Weight (Un-normalized):   0.5292123849162628
Lemma: general
Okapi Weight (Un-normalized):   0.44878335466918895
Lemma: geometry
Okapi Weight (Un-normalized):   0.4907242948855084
Lemma: give
Okapi Weight (Un-normalized):   0.4284061444688121
Lemma: harmonic
Okapi Weight (Un-normalized):   0.5345436701134445
Lemma: ideal
Okapi Weight (Un-normalized):   0.5664026544431492
Lemma: illustration
Okapi Weight (Un-normalized):   0.548412745551304
Lemma: internal
Okapi Weight (Un-normalized):   0.49679971471325646
Lemma: inviscid
Okapi Weight (Un-normalized):   0.4771385075900394
Lemma: mass
Okapi Weight (Un-normalized):   0.522769313847188
Lemma: maximum
Okapi Weight (Un-normalized):   0.467655332369283
Lemma: mixture
Okapi Weight (Un-normalized):   0.5697914770374685
Lemma: mode
Okapi Weight (Un-normalized):   0.4853685603597017
Lemma: molecule
Okapi Weight (Un-normalized):   0.5114747075972191
Lemma: neglect
Okapi Weight (Un-normalized):   0.49349548229150925
Lemma: nonequilibrium
Okapi Weight (Un-normalized):   0.5182666558472436
Lemma: nonheat
Okapi Weight (Un-normalized):   0.5972350230414747
Lemma: nozzle
Okapi Weight (Un-normalized):   0.4771385075900394
Lemma: occur
Okapi Weight (Un-normalized):   0.4652863163619233
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: phenomenon
Okapi Weight (Un-normalized):   0.4841582940620173
Lemma: pressure
Okapi Weight (Un-normalized):   0.41887197770009404
Lemma: progress
Okapi Weight (Un-normalized):   0.5406190899411926
Lemma: rate
Okapi Weight (Un-normalized):   0.4598227539381899
Lemma: ratio
Okapi Weight (Un-normalized):   0.45681228893762416
Lemma: react
Okapi Weight (Un-normalized):   0.548412745551304
Lemma: reaction
Okapi Weight (Un-normalized):   0.5560023724558336
Lemma: reservoir
Okapi Weight (Un-normalized):   0.548412745551304
Lemma: result
Okapi Weight (Un-normalized):   0.41887197770009404
Lemma: show
Okapi Weight (Un-normalized):   0.4299113769690949
Lemma: significance
Okapi Weight (Un-normalized):   0.5105516867076222
Lemma: sound
Okapi Weight (Un-normalized):   0.6139158590727493
Lemma: special
Okapi Weight (Un-normalized):   0.4815633306281242
Lemma: speed
Okapi Weight (Un-normalized):   0.4683169090793024
Lemma: such
Okapi Weight (Un-normalized):   0.45298033948532035
Lemma: suitable
Okapi Weight (Un-normalized):   0.49679971471325646
Lemma: term
Okapi Weight (Un-normalized):   0.4566159331002821
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: throat
Okapi Weight (Un-normalized):   0.5272248146332825
Lemma: time
Okapi Weight (Un-normalized):   0.4598227539381899
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: under
Okapi Weight (Un-normalized):   0.45298033948532035
Lemma: velocity
Okapi Weight (Un-normalized):   0.4683169090793024
Lemma: vibration
Okapi Weight (Un-normalized):   0.49167970900752817
Lemma: well
Okapi Weight (Un-normalized):   0.4566159331002821

Rank#: 2
Cosine Similarity: 0.18613941302656484
Doc#: 1255  Document Headline:  the flow about a charged body moving in the lower atmosphere .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.480023668224927
Lemma: acquire
Okapi Weight (Un-normalized):   0.5791888001809241
Lemma: action
Okapi Weight (Un-normalized):   0.5351665574750808
Lemma: ae
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: also
Okapi Weight (Un-normalized):   0.45701001152093373
Lemma: analyze
Okapi Weight (Un-normalized):   0.5271161239776643
Lemma: approach
Okapi Weight (Un-normalized):   0.4721849668020135
Lemma: assume
Okapi Weight (Un-normalized):   0.4568780439016723
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: atmosphere
Okapi Weight (Un-normalized):   0.4845479157937859
Lemma: base
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: body
Okapi Weight (Un-normalized):   0.48168655241197617
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: can
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: case
Okapi Weight (Un-normalized):   0.4451793652131805
Lemma: characterize
Okapi Weight (Un-normalized):   0.5162072095078568
Lemma: charge
Okapi Weight (Un-normalized):   0.5921655552813618
Lemma: compose
Okapi Weight (Un-normalized):   0.5300228480392335
Lemma: condition
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: debye
Okapi Weight (Un-normalized):   0.5791888001809241
Lemma: description
Okapi Weight (Un-normalized):   0.5022348223681876
Lemma: determine
Okapi Weight (Un-normalized):   0.44402224270584323
Lemma: different
Okapi Weight (Un-normalized):   0.47015792424797365
Lemma: discuss
Okapi Weight (Un-normalized):   0.47368437097364735
Lemma: distribution
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: electric
Okapi Weight (Un-normalized):   0.6491096600888475
Lemma: electrically
Okapi Weight (Un-normalized):   0.5133253299671375
Lemma: electron
Okapi Weight (Un-normalized):   0.6032202534660147
Lemma: equal
Okapi Weight (Un-normalized):   0.49392833174656253
Lemma: equation
Okapi Weight (Un-normalized):   0.4300498555661741
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.4774956303103637
Lemma: exterior
Okapi Weight (Un-normalized):   0.5449225293133588
Lemma: field
Okapi Weight (Un-normalized):   0.4568780439016723
Lemma: finally
Okapi Weight (Un-normalized):   0.49724786154063266
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: force
Okapi Weight (Un-normalized):   0.5225298286179643
Lemma: formulum
Okapi Weight (Un-normalized):   0.49392833174656253
Lemma: gas
Okapi Weight (Un-normalized):   0.46009971113234815
Lemma: gasdynamic
Okapi Weight (Un-normalized):   0.6074059680862156
Lemma: give
Okapi Weight (Un-normalized):   0.42850500576046685
Lemma: high
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: hunzikerrr
Okapi Weight (Un-normalized):   0.5981481481481482
Lemma: hydrodynamic
Okapi Weight (Un-normalized):   0.5239781873127366
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.4568780439016723
Lemma: indicate
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: ion
Okapi Weight (Un-normalized):   0.5412701042464759
Lemma: ionosphere
Okapi Weight (Un-normalized):   0.549099841595523
Lemma: lack
Okapi Weight (Un-normalized):   0.5351665574750808
Lemma: linearization
Okapi Weight (Un-normalized):   0.532500904809724
Lemma: local
Okapi Weight (Un-normalized):   0.4679685515006223
Lemma: lower
Okapi Weight (Un-normalized):   0.5188637361868279
Lemma: maxwell
Okapi Weight (Un-normalized):   0.5981481481481482
Lemma: mixture
Okapi Weight (Un-normalized):   0.5133253299671375
Lemma: model
Okapi Weight (Un-normalized):   0.4532256188347894
Lemma: move
Okapi Weight (Un-normalized):   0.4857637851761818
Lemma: negative
Okapi Weight (Un-normalized):   0.5085976370266442
Lemma: neutral
Okapi Weight (Un-normalized):   0.5259631813461347
Lemma: nonlinear
Okapi Weight (Un-normalized):   0.4947967398361205
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: particle
Okapi Weight (Un-normalized):   0.5239781873127366
Lemma: plane
Okapi Weight (Un-normalized):   0.4721849668020135
Lemma: potential
Okapi Weight (Un-normalized):   0.5306943824945811
Lemma: problem
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: reciprocal
Okapi Weight (Un-normalized):   0.5449225293133588
Lemma: resultant
Okapi Weight (Un-normalized):   0.5221540076709593
Lemma: sc
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: simple
Okapi Weight (Un-normalized):   0.4532256188347894
Lemma: solution
Okapi Weight (Un-normalized):   0.4300498555661741
Lemma: speed
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: statistical
Okapi Weight (Un-normalized):   0.5449225293133588
Lemma: subsonic
Okapi Weight (Un-normalized):   0.4679685515006223
Lemma: sum
Okapi Weight (Un-normalized):   0.5412701042464759
Lemma: supersonic
Okapi Weight (Un-normalized):   0.44402224270584323
Lemma: through
Okapi Weight (Un-normalized):   0.46009971113234815
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: total
Okapi Weight (Un-normalized):   0.4758373918688964
Lemma: transfer
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: travel
Okapi Weight (Un-normalized):   0.5259631813461347
Lemma: under
Okapi Weight (Un-normalized):   0.4532256188347894
Lemma: use
Okapi Weight (Un-normalized):   0.4189593479672241
Lemma: validity
Okapi Weight (Un-normalized):   0.5101036627364617

Rank#: 3
Cosine Similarity: 0.18133370062761978
Doc#: 1085  Document Headline:  note on the convergence of numerical solutions of the navier-stokes equations .
Document Vector: 
Lemma: apelt
Okapi Weight (Un-normalized):   0.638918400241232
Lemma: apply
Okapi Weight (Un-normalized):   0.46534560471119757
Lemma: arc
Okapi Weight (Un-normalized):   0.4962466224026847
Lemma: base
Okapi Weight (Un-normalized):   0.46534560471119757
Lemma: case
Okapi Weight (Un-normalized):   0.44006647408823213
Lemma: certain
Okapi Weight (Un-normalized):   0.48745142376874906
Lemma: cj
Okapi Weight (Un-normalized):   0.6136392696182666
Lemma: condition
Okapi Weight (Un-normalized):   0.45055826124593096
Lemma: converge
Okapi Weight (Un-normalized):   0.5653042497503155
Lemma: convergence
Okapi Weight (Un-normalized):   0.6121695881178688
Lemma: criterion
Okapi Weight (Un-normalized):   0.5892804711273874
Lemma: dimension
Okapi Weight (Un-normalized):   0.6056261372761773
Lemma: equation
Okapi Weight (Un-normalized):   0.45563516116251657
Lemma: exceed
Okapi Weight (Un-normalized):   0.5396308441912079
Lemma: fix
Okapi Weight (Un-normalized):   0.5286066377034504
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: give
Okapi Weight (Un-normalized):   0.42527913062296546
Lemma: if
Okapi Weight (Un-normalized):   0.49062473533416306
Lemma: local
Okapi Weight (Un-normalized):   0.49062473533416306
Lemma: mesh
Okapi Weight (Un-normalized):   0.7668571428571429
Lemma: navier
Okapi Weight (Un-normalized):   0.6231620181645134
Lemma: not
Okapi Weight (Un-normalized):   0.458696323607791
Lemma: note
Okapi Weight (Un-normalized):   0.48745142376874906
Lemma: number
Okapi Weight (Un-normalized):   0.42527913062296546
Lemma: numerical
Okapi Weight (Un-normalized):   0.520974745453885
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: reynold
Okapi Weight (Un-normalized):   0.4709674917797192
Lemma: show
Okapi Weight (Un-normalized):   0.44006647408823213
Lemma: size
Okapi Weight (Un-normalized):   0.5286066377034504
Lemma: solution
Okapi Weight (Un-normalized):   0.46905073193929364
Lemma: steady
Okapi Weight (Un-normalized):   0.5298923854648198
Lemma: stoke
Okapi Weight (Un-normalized):   0.6073429561308276
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: thom
Okapi Weight (Un-normalized):   0.6240789194169961
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: two
Okapi Weight (Un-normalized):   0.45563516116251657
Lemma: under
Okapi Weight (Un-normalized):   0.4709674917797192
Lemma: use
Okapi Weight (Un-normalized):   0.42527913062296546
Lemma: value
Okapi Weight (Un-normalized):   0.45055826124593096
Lemma: viscous
Okapi Weight (Un-normalized):   0.48745142376874906

Rank#: 4
Cosine Similarity: 0.1777116406820627
Doc#: 1189  Document Headline:  nonequilibrium flow past a wedge .
Document Vector: 
Lemma: aiaa
Okapi Weight (Un-normalized):   0.5231325531481545
Lemma: amount
Okapi Weight (Un-normalized):   0.564908154131023
Lemma: attach
Okapi Weight (Un-normalized):   0.5312419488662834
Lemma: both
Okapi Weight (Un-normalized):   0.46495329756109893
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: capiauxr
Okapi Weight (Un-normalized):   0.6186710781868904
Lemma: characterize
Okapi Weight (Un-normalized):   0.5418121878739947
Lemma: chemically
Okapi Weight (Un-normalized):   0.5723974153516316
Lemma: concave
Okapi Weight (Un-normalized):   0.5768546120434208
Lemma: contain
Okapi Weight (Un-normalized):   0.5177077701014631
Lemma: convex
Okapi Weight (Un-normalized):   0.5768546120434208
Lemma: depend
Okapi Weight (Un-normalized):   0.49828358275285395
Lemma: describe
Okapi Weight (Un-normalized):   0.4733420203648995
Lemma: dissociation
Okapi Weight (Un-normalized):   0.5870858385181112
Lemma: easily
Okapi Weight (Un-normalized):   0.5490692974967639
Lemma: either
Okapi Weight (Un-normalized):   0.5401035770248737
Lemma: energy
Okapi Weight (Un-normalized):   0.5255727744636369
Lemma: entropy
Okapi Weight (Un-normalized):   0.5537177806257915
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.534811190445948
Lemma: exact
Okapi Weight (Un-normalized):   0.4856164499297305
Lemma: example
Okapi Weight (Un-normalized):   0.480040286161228
Lemma: field
Okapi Weight (Un-normalized):   0.4694104942528882
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: freestream
Okapi Weight (Un-normalized):   0.6408496130027808
Lemma: gas
Okapi Weight (Un-normalized):   0.4733420203648995
Lemma: identifiable
Okapi Weight (Un-normalized):   0.6418079096045198
Lemma: illustrate
Okapi Weight (Un-normalized):   0.5186753564563653
Lemma: jnl
Okapi Weight (Un-normalized):   0.5186753564563653
Lemma: layer
Okapi Weight (Un-normalized):   0.4522746480721632
Lemma: nonequilibrium
Okapi Weight (Un-normalized):   0.544993583722327
Lemma: nonreact
Okapi Weight (Un-normalized):   0.6418079096045198
Lemma: numerical
Okapi Weight (Un-normalized):   0.5152981411312314
Lemma: obtain
Okapi Weight (Un-normalized):   0.43667101018244975
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: out
Okapi Weight (Un-normalized):   0.480040286161228
Lemma: parameter
Okapi Weight (Un-normalized):   0.4733420203648995
Lemma: past
Okapi Weight (Un-normalized):   0.5319265233048185
Lemma: presence
Okapi Weight (Un-normalized):   0.49999572173052514
Lemma: present
Okapi Weight (Un-normalized):   0.4231368314176294
Lemma: presentation
Okapi Weight (Un-normalized):   0.5649490192916241
Lemma: react
Okapi Weight (Un-normalized):   0.581952349065723
Lemma: regime
Okapi Weight (Un-normalized):   0.5277977218021225
Lemma: relative
Okapi Weight (Un-normalized):   0.5186753564563653
Lemma: relaxation
Okapi Weight (Un-normalized):   0.5355351187319436
Lemma: result
Okapi Weight (Un-normalized):   0.4231368314176294
Lemma: shock
Okapi Weight (Un-normalized):   0.45372205889526634
Lemma: show
Okapi Weight (Un-normalized):   0.43667101018244975
Lemma: solution
Okapi Weight (Un-normalized):   0.43667101018244975
Lemma: straight
Okapi Weight (Un-normalized):   0.5305809492081621
Lemma: these
Okapi Weight (Un-normalized):   0.43667101018244975
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: value
Okapi Weight (Un-normalized):   0.4462736628352588
Lemma: washingtonm
Okapi Weight (Un-normalized):   0.6418079096045198
Lemma: wave
Okapi Weight (Un-normalized):   0.45980784160007915
Lemma: wedge
Okapi Weight (Un-normalized):   0.5691721188679999

Rank#: 5
Cosine Similarity: 0.17079865282314452
Doc#: 1315  Document Headline:  performance estimates for the rae 6in . high-pressure shock tube .
Document Vector: 
Lemma: air
Okapi Weight (Un-normalized):   0.4826112598920803
Lemma: always
Okapi Weight (Un-normalized):   0.5212596968777636
Lemma: arc
Okapi Weight (Un-normalized):   0.47532344361949236
Lemma: argon
Okapi Weight (Un-normalized):   0.6141125083716381
Lemma: assume
Okapi Weight (Un-normalized):   0.48828017352882314
Lemma: base
Okapi Weight (Un-normalized):   0.4511400384696329
Lemma: behave
Okapi Weight (Un-normalized):   0.5410433643218235
Lemma: both
Okapi Weight (Un-normalized):   0.45553977617543245
Lemma: calculation
Okapi Weight (Un-normalized):   0.4511400384696329
Lemma: chart
Okapi Weight (Un-normalized):   0.5092763128452932
Lemma: chemical
Okapi Weight (Un-normalized):   0.5038232526965003
Lemma: combustion
Okapi Weight (Un-normalized):   0.5314398414046623
Lemma: comprise
Okapi Weight (Un-normalized):   0.5512235088487222
Lemma: condition
Okapi Weight (Un-normalized):   0.4395673348881199
Lemma: constant
Okapi Weight (Un-normalized):   0.45553977617543245
Lemma: diaphragm
Okapi Weight (Un-normalized):   0.5869796175800948
Lemma: divergent
Okapi Weight (Un-normalized):   0.5356760153452871
Lemma: driver
Okapi Weight (Un-normalized):   0.6392181718002721
Lemma: either
Okapi Weight (Un-normalized):   0.48403958525244034
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.48086500554124906
Lemma: estimate
Okapi Weight (Un-normalized):   0.512037984401688
Lemma: expand
Okapi Weight (Un-normalized):   0.5212596968777636
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.45553977617543245
Lemma: form
Okapi Weight (Un-normalized):   0.44593625325827124
Lemma: free
Okapi Weight (Un-normalized):   0.4760669793763881
Lemma: from
Okapi Weight (Un-normalized):   0.4197836674440599
Lemma: gas
Okapi Weight (Un-normalized):   0.5113763950822543
Lemma: give
Okapi Weight (Un-normalized):   0.4197836674440599
Lemma: graphical
Okapi Weight (Un-normalized):   0.5474122826919748
Lemma: heat
Okapi Weight (Un-normalized):   0.44593625325827124
Lemma: high
Okapi Weight (Un-normalized):   0.4760669793763881
Lemma: hydrogen
Okapi Weight (Un-normalized):   0.6141125083716381
Lemma: ideal
Okapi Weight (Un-normalized):   0.5158923479012272
Lemma: in
Okapi Weight (Un-normalized):   0.4951071110635523
Lemma: induce
Okapi Weight (Un-normalized):   0.48403958525244034
Lemma: initial
Okapi Weight (Un-normalized):   0.47913466977623975
Lemma: mach
Okapi Weight (Un-normalized):   0.4466402548667804
Lemma: make
Okapi Weight (Un-normalized):   0.431356371025573
Lemma: mixture
Okapi Weight (Un-normalized):   0.5182525182265784
Lemma: model
Okapi Weight (Un-normalized):   0.45553977617543245
Lemma: normal
Okapi Weight (Un-normalized):   0.46844024468858625
Lemma: nozzle
Okapi Weight (Un-normalized):   0.48086500554124906
Lemma: number
Okapi Weight (Un-normalized):   0.4294267245096077
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.44593625325827124
Lemma: oxygen
Okapi Weight (Un-normalized):   0.5356760153452871
Lemma: performance
Okapi Weight (Un-normalized):   0.5457857699922695
Lemma: present
Okapi Weight (Un-normalized):   0.4197836674440599
Lemma: pressure
Okapi Weight (Un-normalized):   0.43890944570945756
Lemma: product
Okapi Weight (Un-normalized):   0.5239800208640187
Lemma: ra
Okapi Weight (Un-normalized):   0.5202806429727321
Lemma: range
Okapi Weight (Un-normalized):   0.4395673348881199
Lemma: ratio
Okapi Weight (Un-normalized):   0.45885344901921543
Lemma: result
Okapi Weight (Un-normalized):   0.4197836674440599
Lemma: section
Okapi Weight (Un-normalized):   0.46571992070233115
Lemma: shock
Okapi Weight (Un-normalized):   0.50769764331623
Lemma: simplify
Okapi Weight (Un-normalized):   0.4894926454012332
Lemma: specifiic
Okapi Weight (Un-normalized):   0.6067632850241547
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: tube
Okapi Weight (Un-normalized):   0.5681638265681991
Lemma: under
Okapi Weight (Un-normalized):   0.45553977617543245
Lemma: uniform
Okapi Weight (Un-normalized):   0.46844024468858625
Lemma: various
Okapi Weight (Un-normalized):   0.48828017352882314
Lemma: wave
Okapi Weight (Un-normalized):   0.4760669793763881
Lemma: woodsna
Okapi Weight (Un-normalized):   0.6067632850241547
Lemma: work
Okapi Weight (Un-normalized):   0.4709237059136928
 ***************************** 
Processing Query:  what chemical kinetic system is applicable to hypersonic aerodynamic problems  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.11507907128901146
Doc#: 1032  Document Headline:  on the conservativeness of various distributed force systems .
Document Vector: 
Lemma: applicable
Okapi Weight (Un-normalized):   0.49506117020358004
Lemma: assistant
Okapi Weight (Un-normalized):   0.5819191015056714
Lemma: be
Okapi Weight (Un-normalized):   0.4354686819797465
Lemma: bodner
Okapi Weight (Un-normalized):   0.6338797814207651
Lemma: brown
Okapi Weight (Un-normalized):   0.5983649450576688
Lemma: buckle
Okapi Weight (Un-normalized):   0.51140600773686
Lemma: cantilever
Okapi Weight (Un-normalized):   0.5422708676822946
Lemma: cause
Okapi Weight (Un-normalized):   0.49671717347706534
Lemma: change
Okapi Weight (Un-normalized):   0.51140600773686
Lemma: character
Okapi Weight (Un-normalized):   0.5371626079436997
Lemma: column
Okapi Weight (Un-normalized):   0.5174394169845659
Lemma: conservative
Okapi Weight (Un-normalized):   0.6689496292032314
Lemma: conservativeness
Okapi Weight (Un-normalized):   0.7365661861074706
Lemma: constant
Okapi Weight (Un-normalized):   0.4628236812476203
Lemma: could
Okapi Weight (Un-normalized):   0.49979426126479654
Lemma: determination
Okapi Weight (Un-normalized):   0.5026034223227039
Lemma: determine
Okapi Weight (Un-normalized):   0.4519606799150937
Lemma: directional
Okapi Weight (Un-normalized):   0.5819191015056714
Lemma: discuss
Okapi Weight (Un-normalized):   0.4578469287607323
Lemma: distribute
Okapi Weight (Un-normalized):   0.5198926209013088
Lemma: eight
Okapi Weight (Un-normalized):   0.5759866982766829
Lemma: employ
Okapi Weight (Un-normalized):   0.49671717347706534
Lemma: end
Okapi Weight (Un-normalized):   0.5156938575214646
Lemma: engineering
Okapi Weight (Un-normalized):   0.5310913443472898
Lemma: example
Okapi Weight (Un-normalized):   0.47741601448381066
Lemma: force
Okapi Weight (Un-normalized):   0.49661067483167404
Lemma: generally
Okapi Weight (Un-normalized):   0.509807608675826
Lemma: instability
Okapi Weight (Un-normalized):   0.5664899810728284
Lemma: kinetic
Okapi Weight (Un-normalized):   0.5352629432445429
Lemma: large
Okapi Weight (Un-normalized):   0.4628236812476203
Lemma: load
Okapi Weight (Un-normalized):   0.5278203866767518
Lemma: magnitude
Okapi Weight (Un-normalized):   0.49506117020358004
Lemma: make
Okapi Weight (Un-normalized):   0.4354686819797465
Lemma: method
Okapi Weight (Un-normalized):   0.4510414322591895
Lemma: necessity
Okapi Weight (Un-normalized):   0.5710561001731448
Lemma: nonconservative
Okapi Weight (Un-normalized):   0.5983649450576688
Lemma: nongyroscopic
Okapi Weight (Un-normalized):   0.6338797814207651
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.4628236812476203
Lemma: otherwise
Okapi Weight (Un-normalized):   0.5563945105950842
Lemma: problem
Okapi Weight (Un-normalized):   0.44475649356197167
Lemma: professor
Okapi Weight (Un-normalized):   0.5819191015056714
Lemma: providence
Okapi Weight (Un-normalized):   0.6338797814207651
Lemma: reference
Okapi Weight (Un-normalized):   0.5564442740862408
Lemma: rus
Okapi Weight (Un-normalized):   0.6338797814207651
Lemma: show
Okapi Weight (Un-normalized):   0.4354686819797465
Lemma: small
Okapi Weight (Un-normalized):   0.4519606799150937
Lemma: sol
Okapi Weight (Un-normalized):   0.6338797814207651
Lemma: statical
Okapi Weight (Un-normalized):   0.6338797814207651
Lemma: system
Okapi Weight (Un-normalized):   0.5650466160572456
Lemma: tangential
Okapi Weight (Un-normalized):   0.5710561001731448
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: time
Okapi Weight (Un-normalized):   0.4709373639594929
Lemma: university
Okapi Weight (Un-normalized):   0.5371626079436997
Lemma: usually
Okapi Weight (Un-normalized):   0.526938934149356
Lemma: valid
Okapi Weight (Un-normalized):   0.5087130975663039
Lemma: various
Okapi Weight (Un-normalized):   0.4671347403429575
Lemma: whereas
Okapi Weight (Un-normalized):   0.5371626079436997

Rank#: 2
Cosine Similarity: 0.11501186186880086
Doc#: 625  Document Headline:  viscous and inviscid nonequilibrium gas flows .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.4748701903146387
Lemma: accordingly
Okapi Weight (Un-normalized):   0.4959570519410025
Lemma: ae
Okapi Weight (Un-normalized):   0.42575609535170067
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: air
Okapi Weight (Un-normalized):   0.4748701903146387
Lemma: allow
Okapi Weight (Un-normalized):   0.4707243460032998
Lemma: also
Okapi Weight (Un-normalized):   0.42575609535170067
Lemma: ambient
Okapi Weight (Un-normalized):   0.48555989676341227
Lemma: analogy
Okapi Weight (Un-normalized):   0.47192341335212334
Lemma: analysis
Okapi Weight (Un-normalized):   0.42575609535170067
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.4515121907034013
Lemma: associate
Okapi Weight (Un-normalized):   0.45565799605755647
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: behind
Okapi Weight (Un-normalized):   0.45565799605755647
Lemma: blast
Okapi Weight (Un-normalized):   0.484211598929406
Lemma: blunt
Okapi Weight (Un-normalized):   0.4698836828016227
Lemma: body
Okapi Weight (Un-normalized):   0.442074169461511
Lemma: boundary
Okapi Weight (Un-normalized):   0.4210370847307555
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: case
Okapi Weight (Un-normalized):   0.42041122264872205
Lemma: characteristic
Okapi Weight (Un-normalized):   0.43615325052929094
Lemma: chemical
Okapi Weight (Un-normalized):   0.4675830607175332
Lemma: comparison
Okapi Weight (Un-normalized):   0.44277994838170615
Lemma: conclusion
Okapi Weight (Un-normalized):   0.46123366794616605
Lemma: condition
Okapi Weight (Un-normalized):   0.442074169461511
Lemma: consider
Okapi Weight (Un-normalized):   0.4488465980708672
Lemma: considerably
Okapi Weight (Un-normalized):   0.4675830607175332
Lemma: consideration
Okapi Weight (Un-normalized):   0.4503131233545778
Lemma: constituent
Okapi Weight (Un-normalized):   0.5217131472927031
Lemma: control
Okapi Weight (Un-normalized):   0.4574287729920056
Lemma: cool
Okapi Weight (Un-normalized):   0.45656447317801296
Lemma: degree
Okapi Weight (Un-normalized):   0.5090097723034349
Lemma: diminish
Okapi Weight (Un-normalized):   0.48555989676341227
Lemma: discuss
Okapi Weight (Un-normalized):   0.4332892703245724
Lemma: dissociate
Okapi Weight (Un-normalized):   0.5232348425456542
Lemma: dissociation
Okapi Weight (Un-normalized):   0.5925123614585538
Lemma: downstream
Okapi Weight (Un-normalized):   0.45565799605755647
Lemma: edge
Okapi Weight (Un-normalized):   0.4748701903146387
Lemma: effect
Okapi Weight (Un-normalized):   0.41287804767585035
Lemma: employ
Okapi Weight (Un-normalized):   0.45565799605755647
Lemma: energy
Okapi Weight (Un-normalized):   0.48009564809538485
Lemma: entry
Okapi Weight (Un-normalized):   0.46605515123514674
Lemma: envelope
Okapi Weight (Un-normalized):   0.5012753641026194
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.45263854134288856
Lemma: expansion
Okapi Weight (Un-normalized):   0.4537004929732944
Lemma: facility
Okapi Weight (Un-normalized):   0.48555989676341227
Lemma: far
Okapi Weight (Un-normalized):   0.46605515123514674
Lemma: field
Okapi Weight (Un-normalized):   0.48000789967065915
Lemma: finally
Okapi Weight (Un-normalized):   0.46605515123514674
Lemma: finite
Okapi Weight (Un-normalized):   0.4515121907034013
Lemma: flight
Okapi Weight (Un-normalized):   0.44277994838170615
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fraction
Okapi Weight (Un-normalized):   0.484211598929406
Lemma: free
Okapi Weight (Un-normalized):   0.46893914013670485
Lemma: freezing
Okapi Weight (Un-normalized):   0.5046892942626977
Lemma: friction
Okapi Weight (Un-normalized):   0.45263854134288856
Lemma: frozen
Okapi Weight (Un-normalized):   0.5828975518004846
Lemma: gas
Okapi Weight (Un-normalized):   0.46668598084548224
Lemma: generalize
Okapi Weight (Un-normalized):   0.46605515123514674
Lemma: generate
Okapi Weight (Un-normalized):   0.4675830607175332
Lemma: geometry
Okapi Weight (Un-normalized):   0.4619093458809916
Lemma: govern
Okapi Weight (Un-normalized):   0.463800376280684
Lemma: heat
Okapi Weight (Un-normalized):   0.4299019007058558
Lemma: higher
Okapi Weight (Un-normalized):   0.44765443911183117
Lemma: highly
Okapi Weight (Un-normalized):   0.47304976399161053
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.48000789967065915
Lemma: immediate
Okapi Weight (Un-normalized):   0.4900006145877371
Lemma: include
Okapi Weight (Un-normalized):   0.4332892703245724
Lemma: indicate
Okapi Weight (Un-normalized):   0.4332892703245724
Lemma: induce
Okapi Weight (Un-normalized):   0.45470501304168287
Lemma: influence
Okapi Weight (Un-normalized):   0.4986881365687849
Lemma: interaction
Okapi Weight (Un-normalized):   0.48414833892302206
Lemma: investigation
Okapi Weight (Un-normalized):   0.4714947701087379
Lemma: inviscid
Okapi Weight (Un-normalized):   0.5258575650153274
Lemma: kinetic
Okapi Weight (Un-normalized):   0.47783999564072754
Lemma: knowledge
Okapi Weight (Un-normalized):   0.4711326942106153
Lemma: law
Okapi Weight (Un-normalized):   0.4605324867876815
Lemma: layer
Okapi Weight (Un-normalized):   0.4333429904227411
Lemma: lead
Okapi Weight (Un-normalized):   0.4748701903146387
Lemma: lifting
Okapi Weight (Un-normalized):   0.4675830607175332
Lemma: limit
Okapi Weight (Un-normalized):   0.45263854134288856
Lemma: mach
Okapi Weight (Un-normalized):   0.42041122264872205
Lemma: magnitude
Okapi Weight (Un-normalized):   0.45470501304168287
Lemma: major
Okapi Weight (Un-normalized):   0.4694425208538633
Lemma: make
Okapi Weight (Un-normalized):   0.4333429904227411
Lemma: mass
Okapi Weight (Un-normalized):   0.45565799605755647
Lemma: may
Okapi Weight (Un-normalized):   0.4299019007058558
Lemma: means
Okapi Weight (Un-normalized):   0.44765443911183117
Lemma: mechanism
Okapi Weight (Un-normalized):   0.47192341335212334
Lemma: model
Okapi Weight (Un-normalized):   0.45905856336462936
Lemma: noncatalytic
Okapi Weight (Un-normalized):   0.5141534117784697
Lemma: nonequilibrium
Okapi Weight (Un-normalized):   0.5318349194461569
Lemma: nozzle
Okapi Weight (Un-normalized):   0.45263854134288856
Lemma: number
Okapi Weight (Un-normalized):   0.41287804767585035
Lemma: numerically
Okapi Weight (Un-normalized):   0.4711326942106153
Lemma: observe
Okapi Weight (Un-normalized):   0.493813440812283
Lemma: of
Okapi Weight (Un-normalized):   0.463800376280684
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: order
Okapi Weight (Un-normalized):   0.45905856336462936
Lemma: over
Okapi Weight (Un-normalized):   0.4299019007058558
Lemma: parameter
Okapi Weight (Un-normalized):   0.46668598084548224
Lemma: portion
Okapi Weight (Un-normalized):   0.45980380141171157
Lemma: possibility
Okapi Weight (Un-normalized):   0.46605515123514674
Lemma: power
Okapi Weight (Un-normalized):   0.4503131233545778
Lemma: present
Okapi Weight (Un-normalized):   0.4339382803391194
Lemma: pressure
Okapi Weight (Un-normalized):   0.41287804767585035
Lemma: prevail
Okapi Weight (Un-normalized):   0.5012753641026194
Lemma: problem
Okapi Weight (Un-normalized):   0.42575609535170067
Lemma: rate
Okapi Weight (Un-normalized):   0.4408224452974441
Lemma: ratio
Okapi Weight (Un-normalized):   0.42575609535170067
Lemma: re
Okapi Weight (Un-normalized):   0.463800376280684
Lemma: reaction
Okapi Weight (Un-normalized):   0.4707243460032998
Lemma: result
Okapi Weight (Un-normalized):   0.41287804767585035
Lemma: sc
Okapi Weight (Un-normalized):   0.42575609535170067
Lemma: section
Okapi Weight (Un-normalized):   0.44277994838170615
Lemma: sharp
Okapi Weight (Un-normalized):   0.4988835486223427
Lemma: shock
Okapi Weight (Un-normalized):   0.4299019007058558
Lemma: simulation
Okapi Weight (Un-normalized):   0.4937022769865398
Lemma: since
Okapi Weight (Un-normalized):   0.4619093458809916
Lemma: skin
Okapi Weight (Un-normalized):   0.4503131233545778
Lemma: slab
Okapi Weight (Un-normalized):   0.48555989676341227
Lemma: slender
Okapi Weight (Un-normalized):   0.48218958849360827
Lemma: solution
Okapi Weight (Un-normalized):   0.42041122264872205
Lemma: sonic
Okapi Weight (Un-normalized):   0.45980380141171157
Lemma: species
Okapi Weight (Un-normalized):   0.5608044503340008
Lemma: spectrum
Okapi Weight (Un-normalized):   0.47971285577440614
Lemma: stream
Okapi Weight (Un-normalized):   0.46893914013670485
Lemma: technique
Okapi Weight (Un-normalized):   0.44903129820514126
Lemma: test
Okapi Weight (Un-normalized):   0.4299019007058558
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.4332892703245724
Lemma: tunnel
Okapi Weight (Un-normalized):   0.43615325052929094
Lemma: value
Okapi Weight (Un-normalized):   0.42575609535170067
Lemma: vehicle
Okapi Weight (Un-normalized):   0.45656447317801296
Lemma: verify
Okapi Weight (Un-normalized):   0.4829725335123497
Lemma: viscous
Okapi Weight (Un-normalized):   0.4922606192871463
Lemma: wall
Okapi Weight (Un-normalized):   0.43615325052929094
Lemma: wave
Okapi Weight (Un-normalized):   0.4332892703245724
Lemma: wedge
Okapi Weight (Un-normalized):   0.46605515123514674
Lemma: whalenrj
Okapi Weight (Un-normalized):   0.5345911949685535
Lemma: wind
Okapi Weight (Un-normalized):   0.4445507253161552
Lemma: within
Okapi Weight (Un-normalized):   0.44765443911183117

Rank#: 3
Cosine Similarity: 0.11412349672769624
Doc#: 103  Document Headline:  theory of mixing and chemical reaction in the opposed jet diffusion flame .
Document Vector: 
Lemma: analyzable
Okapi Weight (Un-normalized):   0.6194871794871795
Lemma: analyze
Okapi Weight (Un-normalized):   0.4936530759561937
Lemma: argue
Okapi Weight (Un-normalized):   0.5861578715156583
Lemma: ars
Okapi Weight (Un-normalized):   0.520292767167975
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: be
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: between
Okapi Weight (Un-normalized):   0.4487630996126264
Lemma: burn
Okapi Weight (Un-normalized):   0.5651567476135024
Lemma: butler
Okapi Weight (Un-normalized):   0.7214017521902378
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: carry
Okapi Weight (Un-normalized):   0.4875731116179878
Lemma: chemical
Okapi Weight (Un-normalized):   0.5909404933599012
Lemma: comparison
Okapi Weight (Un-normalized):   0.4697642235147823
Lemma: constant
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: datum
Okapi Weight (Un-normalized):   0.45428711776007186
Lemma: derive
Okapi Weight (Un-normalized):   0.46300337170646777
Lemma: differential
Okapi Weight (Un-normalized):   0.5137980848878271
Lemma: diffusion
Okapi Weight (Un-normalized):   0.5139576584394006
Lemma: discuss
Okapi Weight (Un-normalized):   0.45428711776007186
Lemma: equation
Okapi Weight (Un-normalized):   0.44874169313361906
Lemma: exactly
Okapi Weight (Un-normalized):   0.546770233020002
Lemma: experiment
Okapi Weight (Un-normalized):   0.4665719877158318
Lemma: experimental
Okapi Weight (Un-normalized):   0.44200224780431185
Lemma: extinction
Okapi Weight (Un-normalized):   0.7214017521902378
Lemma: flame
Okapi Weight (Un-normalized):   0.6861303969019712
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: gas
Okapi Weight (Un-normalized):   0.4665719877158318
Lemma: give
Okapi Weight (Un-normalized):   0.42100112390215594
Lemma: heimel
Okapi Weight (Un-normalized):   0.6194871794871795
Lemma: higher
Okapi Weight (Un-normalized):   0.47771339301314003
Lemma: idealization
Okapi Weight (Un-normalized):   0.5861578715156583
Lemma: if
Okapi Weight (Un-normalized):   0.4752882416622278
Lemma: in
Okapi Weight (Un-normalized):   0.5009598563597709
Lemma: independent
Okapi Weight (Un-normalized):   0.5009598563597709
Lemma: jet
Okapi Weight (Un-normalized):   0.5385267279991256
Lemma: jnl
Okapi Weight (Un-normalized):   0.5077207081680853
Lemma: kinetic
Okapi Weight (Un-normalized):   0.5858807405287961
Lemma: laminar
Okapi Weight (Un-normalized):   0.4487630996126264
Lemma: location
Okapi Weight (Un-normalized):   0.4949998851182322
Lemma: make
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: measurement
Okapi Weight (Un-normalized):   0.46300337170646777
Lemma: mix
Okapi Weight (Un-normalized):   0.5537629221872493
Lemma: must
Okapi Weight (Un-normalized):   0.5009598563597709
Lemma: number
Okapi Weight (Un-normalized):   0.42100112390215594
Lemma: of
Okapi Weight (Un-normalized):   0.5040436905500385
Lemma: oppose
Okapi Weight (Un-normalized):   0.5774849316828676
Lemma: out
Okapi Weight (Un-normalized):   0.4726519520540377
Lemma: potter
Okapi Weight (Un-normalized):   0.7214017521902378
Lemma: premixed
Okapi Weight (Un-normalized):   0.6194871794871795
Lemma: property
Okapi Weight (Un-normalized):   0.4752882416622278
Lemma: quantitatively
Okapi Weight (Un-normalized):   0.5651567476135024
Lemma: rate
Okapi Weight (Un-normalized):   0.51533449007037
Lemma: reaction
Okapi Weight (Un-normalized):   0.5153350873284581
Lemma: relation
Okapi Weight (Un-normalized):   0.4840044956086237
Lemma: reynold
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: show
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: solution
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: solve
Okapi Weight (Un-normalized):   0.4858413135745567
Lemma: spaldingdb
Okapi Weight (Un-normalized):   0.6194871794871795
Lemma: speed
Okapi Weight (Un-normalized):   0.44200224780431185
Lemma: system
Okapi Weight (Un-normalized):   0.4840044956086237
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transport
Okapi Weight (Un-normalized):   0.5255295962712908
Lemma: use
Okapi Weight (Un-normalized):   0.42100112390215594

Rank#: 4
Cosine Similarity: 0.1124940760337442
Doc#: 1272  Document Headline:  oscillatory aerodynamic coefficients for a unified supersonic hypersonic strip theory .
Document Vector: 
Lemma: accuracy
Okapi Weight (Un-normalized):   0.4970270270767478
Lemma: ae
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.4993449392137026
Lemma: also
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: analysis
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: applicable
Okapi Weight (Un-normalized):   0.4988420122003133
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: coefficient
Okapi Weight (Un-normalized):   0.5085742355201437
Lemma: consider
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: correction
Okapi Weight (Un-normalized):   0.5193496482544128
Lemma: derivation
Okapi Weight (Un-normalized):   0.5479293681014767
Lemma: discuss
Okapi Weight (Un-normalized):   0.4601476588818978
Lemma: dyke
Okapi Weight (Un-normalized):   0.573376946120675
Lemma: edge
Okapi Weight (Un-normalized):   0.4929655013610338
Lemma: finite
Okapi Weight (Un-normalized):   0.493073162748191
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: flutter
Okapi Weight (Un-normalized):   0.5080545957325243
Lemma: frequency
Okapi Weight (Un-normalized):   0.5080545957325243
Lemma: from
Okapi Weight (Un-normalized):   0.4232682906870478
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.4993449392137026
Lemma: increase
Okapi Weight (Un-normalized):   0.4601476588818978
Lemma: investigation
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: lead
Okapi Weight (Un-normalized):   0.4929655013610338
Lemma: limit
Okapi Weight (Un-normalized):   0.4951082735627191
Lemma: mach
Okapi Weight (Un-normalized):   0.43687936819485
Lemma: modify
Okapi Weight (Un-normalized):   0.4970270270767478
Lemma: nonlinear
Okapi Weight (Un-normalized):   0.5163414534352389
Lemma: normal
Okapi Weight (Un-normalized):   0.4804950605144168
Lemma: number
Okapi Weight (Un-normalized):   0.4232682906870478
Lemma: order
Okapi Weight (Un-normalized):   0.4653223503881506
Lemma: oscillatory
Okapi Weight (Un-normalized):   0.6001599887904423
Lemma: present
Okapi Weight (Un-normalized):   0.4232682906870478
Lemma: reduce
Okapi Weight (Un-normalized):   0.4804950605144168
Lemma: regime
Okapi Weight (Un-normalized):   0.5285238452214527
Lemma: revelljd
Okapi Weight (Un-normalized):   0.6199135274947705
Lemma: roddenwp
Okapi Weight (Un-normalized):   0.6431818181818182
Lemma: sc
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: second
Okapi Weight (Un-normalized):   0.486102907031604
Lemma: span
Okapi Weight (Un-normalized):   0.5193496482544128
Lemma: steady
Okapi Weight (Un-normalized):   0.486102907031604
Lemma: strip
Okapi Weight (Un-normalized):   0.6232435426584015
Lemma: suggest
Okapi Weight (Un-normalized):   0.5022017185830007
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4975261992252527
Lemma: sweep
Okapi Weight (Un-normalized):   0.5183765642497669
Lemma: theory
Okapi Weight (Un-normalized):   0.4665719877158318
Lemma: throughout
Okapi Weight (Un-normalized):   0.531322886419572
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: unify
Okapi Weight (Un-normalized):   0.5658862296285083
Lemma: unsteady
Okapi Weight (Un-normalized):   0.5163414534352389
Lemma: value
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: van
Okapi Weight (Un-normalized):   0.5363052046338297
Lemma: wing
Okapi Weight (Un-normalized):   0.4601476588818978

Rank#: 5
Cosine Similarity: 0.11178573595189858
Doc#: 943  Document Headline:  compressible free shear layer with finite initial thickness .
Document Vector: 
Lemma: aiaa
Okapi Weight (Un-normalized):   0.5037831519391588
Lemma: angle
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: approach
Okapi Weight (Un-normalized):   0.47424739442492814
Lemma: base
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: baume
Okapi Weight (Un-normalized):   0.6038095238095238
Lemma: be
Okapi Weight (Un-normalized):   0.4309084228680648
Lemma: blasius
Okapi Weight (Un-normalized):   0.5256441221758439
Lemma: body
Okapi Weight (Un-normalized):   0.439002087246861
Lemma: calculation
Okapi Weight (Un-normalized):   0.4752558386010474
Lemma: case
Okapi Weight (Un-normalized):   0.4461429061774427
Lemma: chapman
Okapi Weight (Un-normalized):   0.5239788989802853
Lemma: chemical
Okapi Weight (Un-normalized):   0.5527825590628593
Lemma: composition
Okapi Weight (Un-normalized):   0.5295621293845957
Lemma: compressible
Okapi Weight (Un-normalized):   0.4721624363693443
Lemma: conservation
Okapi Weight (Un-normalized):   0.539028459117226
Lemma: coordinate
Okapi Weight (Un-normalized):   0.5527825590628593
Lemma: correspond
Okapi Weight (Un-normalized):   0.5043687710246523
Lemma: crocco
Okapi Weight (Un-normalized):   0.5256441221758439
Lemma: denisonmr
Okapi Weight (Un-normalized):   0.5843084801860933
Lemma: difference
Okapi Weight (Un-normalized):   0.4842821083157283
Lemma: discuss
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: distance
Okapi Weight (Un-normalized):   0.5043687710246523
Lemma: distribution
Okapi Weight (Un-normalized):   0.439002087246861
Lemma: downstream
Okapi Weight (Un-normalized):   0.4842821083157283
Lemma: effect
Okapi Weight (Un-normalized):   0.4291129324236048
Lemma: equation
Okapi Weight (Un-normalized):   0.45521447941459586
Lemma: finite
Okapi Weight (Un-normalized):   0.5653520522578899
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: free
Okapi Weight (Un-normalized):   0.499867810973717
Lemma: from
Okapi Weight (Un-normalized):   0.4291129324236048
Lemma: function
Okapi Weight (Un-normalized):   0.48173033413493727
Lemma: implicit
Okapi Weight (Un-normalized):   0.5490631730080261
Lemma: initial
Okapi Weight (Un-normalized):   0.5653520522578899
Lemma: jnl
Okapi Weight (Un-normalized):   0.500026371870365
Lemma: kinetic
Okapi Weight (Un-normalized):   0.517871993398816
Lemma: laminar
Okapi Weight (Un-normalized):   0.4452800210688673
Lemma: large
Okapi Weight (Un-normalized):   0.45474635080149767
Lemma: layer
Okapi Weight (Un-normalized):   0.46123366794616605
Lemma: method
Okapi Weight (Un-normalized):   0.4461429061774427
Lemma: momentum
Okapi Weight (Un-normalized):   0.49056004213773463
Lemma: numerically
Okapi Weight (Un-normalized):   0.5077152226617889
Lemma: obtain
Okapi Weight (Un-normalized):   0.4309084228680648
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: other
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: outline
Okapi Weight (Un-normalized):   0.5165631965376272
Lemma: pressure
Okapi Weight (Un-normalized):   0.41950104362343055
Lemma: profile
Okapi Weight (Un-normalized):   0.5554480754320114
Lemma: rear
Okapi Weight (Un-normalized):   0.5207080387441007
Lemma: result
Okapi Weight (Un-normalized):   0.41950104362343055
Lemma: separate
Okapi Weight (Un-normalized):   0.48565477366956245
Lemma: shear
Okapi Weight (Un-normalized):   0.5573884875091007
Lemma: solve
Okapi Weight (Un-normalized):   0.479709791176374
Lemma: streamwise
Okapi Weight (Un-normalized):   0.517871993398816
Lemma: system
Okapi Weight (Un-normalized):   0.478004174493722
Lemma: temperature
Okapi Weight (Un-normalized):   0.4452800210688673
Lemma: these
Okapi Weight (Un-normalized):   0.4309084228680648
Lemma: thickness
Okapi Weight (Un-normalized):   0.5045093736718818
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transform
Okapi Weight (Un-normalized):   0.505155817292993
Lemma: uncouple
Okapi Weight (Un-normalized):   0.5585295027406565
Lemma: use
Okapi Weight (Un-normalized):   0.41950104362343055
Lemma: velocity
Okapi Weight (Un-normalized):   0.439002087246861
Lemma: wake
Okapi Weight (Un-normalized):   0.4956894875603626
Lemma: zero
Okapi Weight (Un-normalized):   0.46478106469229785
 ***************************** 
Processing Query:  what theoretical and experimental guides do we have as to turbulent couette flow behaviour  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.14270233928630305
Doc#: 121  Document Headline:  a theory for base pressures in transonic and supersonic flow .
Document Vector: 
Lemma: adjacent
Okapi Weight (Un-normalized):   0.5221717754979623
Lemma: agreement
Okapi Weight (Un-normalized):   0.4580643114561339
Lemma: approach
Okapi Weight (Un-normalized):   0.5157818279398633
Lemma: around
Okapi Weight (Un-normalized):   0.49604852954002165
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: base
Okapi Weight (Un-normalized):   0.49322298597742276
Lemma: be
Okapi Weight (Un-normalized):   0.43278166061764445
Lemma: best
Okapi Weight (Un-normalized):   0.5332589174592284
Lemma: between
Okapi Weight (Un-normalized):   0.4706099338450159
Lemma: boundary
Okapi Weight (Un-normalized):   0.4360635738241523
Lemma: case
Okapi Weight (Un-normalized):   0.43278166061764445
Lemma: component
Okapi Weight (Un-normalized):   0.49356049291947107
Lemma: concept
Okapi Weight (Un-normalized):   0.49943016156644104
Lemma: conservation
Okapi Weight (Un-normalized):   0.5474544263364518
Lemma: constant
Okapi Weight (Un-normalized):   0.4580643114561339
Lemma: datum
Okapi Weight (Un-normalized):   0.453464585672798
Lemma: devise
Okapi Weight (Un-normalized):   0.5474544263364518
Lemma: dissipative
Okapi Weight (Un-normalized):   0.574795766051309
Lemma: do
Okapi Weight (Un-normalized):   0.4787472365112875
Lemma: edge
Okapi Weight (Un-normalized):   0.48537178466570186
Lemma: emphasize
Okapi Weight (Un-normalized):   0.5352489316138945
Lemma: empirical
Okapi Weight (Un-normalized):   0.5155133608382587
Lemma: end
Okapi Weight (Un-normalized):   0.506929171345596
Lemma: evaluate
Okapi Weight (Un-normalized):   0.500477256841584
Lemma: expansion
Okapi Weight (Un-normalized):   0.48624624629044244
Lemma: experimental
Okapi Weight (Un-normalized):   0.44136585011030716
Lemma: find
Okapi Weight (Un-normalized):   0.44136585011030716
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: four
Okapi Weight (Un-normalized):   0.5034146252757679
Lemma: free
Okapi Weight (Un-normalized):   0.49322298597742276
Lemma: information
Okapi Weight (Un-normalized):   0.5024672709962501
Lemma: integrate
Okapi Weight (Un-normalized):   0.5100730399354715
Lemma: interaction
Okapi Weight (Un-normalized):   0.4827317002206143
Lemma: isoenergetic
Okapi Weight (Un-normalized):   0.5954786911064627
Lemma: jappmech
Okapi Weight (Un-normalized):   0.5445464416106081
Lemma: jet
Okapi Weight (Un-normalized):   0.5157818279398633
Lemma: korsthh
Okapi Weight (Un-normalized):   0.5954786911064627
Lemma: layer
Okapi Weight (Un-normalized):   0.43278166061764445
Lemma: mass
Okapi Weight (Un-normalized):   0.4893901148803179
Lemma: merit
Okapi Weight (Un-normalized):   0.5474544263364518
Lemma: mix
Okapi Weight (Un-normalized):   0.5520502163708071
Lemma: model
Okapi Weight (Un-normalized):   0.48537178466570186
Lemma: namely
Okapi Weight (Un-normalized):   0.5332589174592284
Lemma: not
Okapi Weight (Un-normalized):   0.44802426477001084
Lemma: obtain
Okapi Weight (Un-normalized):   0.43278166061764445
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: physical
Okapi Weight (Un-normalized):   0.49604852954002165
Lemma: pressure
Okapi Weight (Un-normalized):   0.4360635738241523
Lemma: recompression
Okapi Weight (Un-normalized):   0.583337297704815
Lemma: require
Okapi Weight (Un-normalized):   0.4715511649017038
Lemma: result
Okapi Weight (Un-normalized):   0.43041004327416144
Lemma: shear
Okapi Weight (Un-normalized):   0.4787472365112875
Lemma: solution
Okapi Weight (Un-normalized):   0.43278166061764445
Lemma: stable
Okapi Weight (Un-normalized):   0.5296154763578377
Lemma: stream
Okapi Weight (Un-normalized):   0.453464585672798
Lemma: suit
Okapi Weight (Un-normalized):   0.5681373513916054
Lemma: supersonic
Okapi Weight (Un-normalized):   0.44802426477001084
Lemma: theoretical
Okapi Weight (Un-normalized):   0.453464585672798
Lemma: theory
Okapi Weight (Un-normalized):   0.4571594121532705
Lemma: therefore
Okapi Weight (Un-normalized):   0.5077467335396211
Lemma: thin
Okapi Weight (Un-normalized):   0.4687071898251644
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: trail
Okapi Weight (Un-normalized):   0.5506573241875558
Lemma: transonic
Okapi Weight (Un-normalized):   0.49223408995685736
Lemma: turbulent
Okapi Weight (Un-normalized):   0.4715511649017038
Lemma: unique
Okapi Weight (Un-normalized):   0.5541128409961555
Lemma: wake
Okapi Weight (Un-normalized):   0.5492187553540309
Lemma: within
Okapi Weight (Un-normalized):   0.4765359173614258

Rank#: 2
Cosine Similarity: 0.136485307068165
Doc#: 491  Document Headline:  on the close relationship between turbulent plane-couette and pressure flows .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.44288187603058016
Lemma: also
Okapi Weight (Un-normalized):   0.44288187603058016
Lemma: applicable
Okapi Weight (Un-normalized):   0.4910795505091892
Lemma: attempt
Okapi Weight (Un-normalized):   0.5125204885244793
Lemma: author
Okapi Weight (Un-normalized):   0.48576375206116035
Lemma: basis
Okapi Weight (Un-normalized):   0.4926661923890207
Lemma: between
Okapi Weight (Un-normalized):   0.4497843163584405
Lemma: both
Okapi Weight (Un-normalized):   0.4601923228707566
Lemma: burtonra
Okapi Weight (Un-normalized):   0.6240837696335079
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: channel
Okapi Weight (Un-normalized):   0.5984922652035063
Lemma: close
Okapi Weight (Un-normalized):   0.49417540560527806
Lemma: concise
Okapi Weight (Un-normalized):   0.6240837696335079
Lemma: contribution
Okapi Weight (Un-normalized):   0.5327156446924667
Lemma: couette
Okapi Weight (Un-normalized):   0.6625012864451121
Lemma: describable
Okapi Weight (Un-normalized):   0.6240837696335079
Lemma: explanation
Okapi Weight (Un-normalized):   0.5560069323650243
Lemma: find
Okapi Weight (Un-normalized):   0.46244298593525396
Lemma: finding
Okapi Weight (Un-normalized):   0.5363118784599995
Lemma: firmer
Okapi Weight (Un-normalized):   0.6240837696335079
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: further
Okapi Weight (Un-normalized):   0.4910795505091892
Lemma: induce
Okapi Weight (Un-normalized):   0.4910795505091892
Lemma: law
Okapi Weight (Un-normalized):   0.5467547456046966
Lemma: make
Okapi Weight (Un-normalized):   0.43398308273452146
Lemma: measure
Okapi Weight (Un-normalized):   0.47417345890333695
Lemma: move
Okapi Weight (Un-normalized):   0.4969894115081428
Lemma: no
Okapi Weight (Un-normalized):   0.47122525437373064
Lemma: number
Okapi Weight (Un-normalized):   0.4214409380152901
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.4497843163584405
Lemma: originally
Okapi Weight (Un-normalized):   0.5597609555876377
Lemma: other
Okapi Weight (Un-normalized):   0.4554240207498116
Lemma: own
Okapi Weight (Un-normalized):   0.5812018936029277
Lemma: parallel
Okapi Weight (Un-normalized):   0.49417540560527806
Lemma: plane
Okapi Weight (Un-normalized):   0.5539945958442954
Lemma: power
Okapi Weight (Un-normalized):   0.483767399092962
Lemma: pressure
Okapi Weight (Un-normalized):   0.4368201522959877
Lemma: profile
Okapi Weight (Un-normalized):   0.511927881505472
Lemma: put
Okapi Weight (Un-normalized):   0.5470415454265677
Lemma: range
Okapi Weight (Un-normalized):   0.44288187603058016
Lemma: relationship
Okapi Weight (Un-normalized):   0.5216221201535715
Lemma: reynold
Okapi Weight (Un-normalized):   0.4601923228707566
Lemma: satisfactorily
Okapi Weight (Un-normalized):   0.549843955177489
Lemma: sc
Okapi Weight (Un-normalized):   0.44288187603058016
Lemma: set
Okapi Weight (Un-normalized):   0.4926661923890207
Lemma: seventh
Okapi Weight (Un-normalized):   0.6026428316182177
Lemma: shear
Okapi Weight (Un-normalized):   0.4816332608860467
Lemma: similar
Okapi Weight (Un-normalized):   0.47686495876510165
Lemma: stationary
Okapi Weight (Un-normalized):   0.5210095707321711
Lemma: study
Okapi Weight (Un-normalized):   0.4497843163584405
Lemma: such
Okapi Weight (Un-normalized):   0.4601923228707566
Lemma: term
Okapi Weight (Un-normalized):   0.4643228140458703
Lemma: theoretical
Okapi Weight (Un-normalized):   0.4554240207498116
Lemma: these
Okapi Weight (Un-normalized):   0.4494848955702181
Lemma: through
Okapi Weight (Un-normalized):   0.46796616546904296
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: turbulent
Okapi Weight (Un-normalized):   0.5273767990557804
Lemma: up
Okapi Weight (Un-normalized):   0.47122525437373064
Lemma: velocity
Okapi Weight (Un-normalized):   0.44288187603058016
Lemma: wall
Okapi Weight (Un-normalized):   0.48764981195665447

Rank#: 3
Cosine Similarity: 0.12447512532181192
Doc#: 386  Document Headline:  a generalised porous-wall ?couette type? flow .
Document Vector: 
Lemma: addition
Okapi Weight (Un-normalized):   0.5093553880925614
Lemma: ae
Okapi Weight (Un-normalized):   0.4490445408493462
Lemma: analysis
Okapi Weight (Un-normalized):   0.4490445408493462
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: between
Okapi Weight (Un-normalized):   0.4569389486494739
Lemma: blow
Okapi Weight (Un-normalized):   0.6560644127320738
Lemma: boundarylayer
Okapi Weight (Un-normalized):   0.5391007481995937
Lemma: case
Okapi Weight (Un-normalized):   0.4388668790556503
Lemma: consider
Okapi Weight (Un-normalized):   0.4569389486494739
Lemma: constant
Okapi Weight (Un-normalized):   0.5113784747199468
Lemma: contain
Okapi Weight (Un-normalized):   0.5247561395686166
Lemma: couette
Okapi Weight (Un-normalized):   0.6828458425528063
Lemma: cramerkr
Okapi Weight (Un-normalized):   0.6072428843003544
Lemma: distribute
Okapi Weight (Un-normalized):   0.5841148220274643
Lemma: do
Okapi Weight (Un-normalized):   0.4933649870014067
Lemma: exist
Okapi Weight (Un-normalized):   0.4907431834584569
Lemma: fix
Okapi Weight (Un-normalized):   0.5247561395686166
Lemma: flat
Okapi Weight (Un-normalized):   0.4964760867271148
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: follow
Okapi Weight (Un-normalized):   0.5022560285359737
Lemma: generalise
Okapi Weight (Un-normalized):   0.5784270903096985
Lemma: inclined
Okapi Weight (Un-normalized):   0.5713784158017987
Lemma: move
Okapi Weight (Un-normalized):   0.5109280095691933
Lemma: not
Okapi Weight (Un-normalized):   0.4569389486494739
Lemma: observe
Okapi Weight (Un-normalized):   0.5093553880925614
Lemma: plate
Okapi Weight (Un-normalized):   0.4633891494803234
Lemma: porous
Okapi Weight (Un-normalized):   0.5369559607543426
Lemma: recently
Okapi Weight (Un-normalized):   0.5277476241966764
Lemma: reference
Okapi Weight (Un-normalized):   0.5191287236804408
Lemma: sc
Okapi Weight (Un-normalized):   0.4490445408493462
Lemma: slightly
Okapi Weight (Un-normalized):   0.5257816652262075
Lemma: solution
Okapi Weight (Un-normalized):   0.4388668790556503
Lemma: stationary
Okapi Weight (Un-normalized):   0.5384001677236209
Lemma: subject
Okapi Weight (Un-normalized):   0.4933649870014067
Lemma: suction
Okapi Weight (Un-normalized):   0.6106357252058494
Lemma: surface
Okapi Weight (Un-normalized):   0.46873095095251033
Lemma: text
Okapi Weight (Un-normalized):   0.5993484765002267
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: thus
Okapi Weight (Un-normalized):   0.5022560285359737
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: two
Okapi Weight (Un-normalized):   0.4388668790556503
Lemma: type
Okapi Weight (Un-normalized):   0.4964760867271148
Lemma: uniformly
Okapi Weight (Un-normalized):   0.5919298918543375
Lemma: velocity
Okapi Weight (Un-normalized):   0.4490445408493462
Lemma: wall
Okapi Weight (Un-normalized):   0.4688427165767336

Rank#: 4
Cosine Similarity: 0.12166577834335765
Doc#: 959  Document Headline:  heat transfer in separated flows .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.4351520958018919
Lemma: agree
Okapi Weight (Un-normalized):   0.4795063416225548
Lemma: also
Okapi Weight (Un-normalized):   0.4351520958018919
Lemma: analysis
Okapi Weight (Un-normalized):   0.46540722705995324
Lemma: attach
Okapi Weight (Un-normalized):   0.4996988195250307
Lemma: average
Okapi Weight (Un-normalized):   0.48941749059209855
Lemma: be
Okapi Weight (Un-normalized):   0.42785737683387814
Lemma: between
Okapi Weight (Un-normalized):   0.44081031941829246
Lemma: both
Okapi Weight (Un-normalized):   0.4493422045850408
Lemma: boundary
Okapi Weight (Un-normalized):   0.4433684328690512
Lemma: cent
Okapi Weight (Un-normalized):   0.48941749059209855
Lemma: compare
Okapi Weight (Un-normalized):   0.44543342473482406
Lemma: considerably
Okapi Weight (Un-normalized):   0.49223782535697663
Lemma: datum
Okapi Weight (Un-normalized):   0.44543342473482406
Lemma: describe
Okapi Weight (Un-normalized):   0.45571475366775627
Lemma: disagree
Okapi Weight (Un-normalized):   0.5661149392235176
Lemma: discrepancy
Okapi Weight (Un-normalized):   0.5132414835061254
Lemma: effect
Okapi Weight (Un-normalized):   0.4269127217585131
Lemma: equivalent
Okapi Weight (Un-normalized):   0.4908668494696481
Lemma: experiment
Okapi Weight (Un-normalized):   0.45571475366775627
Lemma: experimental
Okapi Weight (Un-normalized):   0.4351520958018919
Lemma: explain
Okapi Weight (Un-normalized):   0.5038197920540625
Lemma: find
Okapi Weight (Un-normalized):   0.45382544351702614
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: from
Okapi Weight (Un-normalized):   0.43270361352997666
Lemma: heat
Okapi Weight (Un-normalized):   0.4917248015221428
Lemma: however
Okapi Weight (Un-normalized):   0.46300947263577
Lemma: include
Okapi Weight (Un-normalized):   0.46956837653809863
Lemma: investigate
Okapi Weight (Un-normalized):   0.45571475366775627
Lemma: investigation
Okapi Weight (Un-normalized):   0.44081031941829246
Lemma: laminar
Okapi Weight (Un-normalized):   0.4850899724784084
Lemma: larsonhk
Okapi Weight (Un-normalized):   0.5661149392235176
Lemma: layer
Okapi Weight (Un-normalized):   0.468737339812489
Lemma: less
Okapi Weight (Un-normalized):   0.4718414426911526
Lemma: local
Okapi Weight (Un-normalized):   0.46300947263577
Lemma: mach
Okapi Weight (Un-normalized):   0.4426556547795856
Lemma: maximum
Okapi Weight (Un-normalized):   0.46300947263577
Lemma: measurement
Okapi Weight (Un-normalized):   0.45272814370283787
Lemma: naca
Okapi Weight (Un-normalized):   0.4493422045850408
Lemma: number
Okapi Weight (Un-normalized):   0.4366462564735607
Lemma: occur
Okapi Weight (Un-normalized):   0.4608031358392161
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: overall
Okapi Weight (Un-normalized):   0.5050569582527971
Lemma: partially
Okapi Weight (Un-normalized):   0.5205362024741391
Lemma: per
Okapi Weight (Un-normalized):   0.4718414426911526
Lemma: present
Okapi Weight (Un-normalized):   0.4269127217585131
Lemma: rate
Okapi Weight (Un-normalized):   0.45571475366775627
Lemma: reattachment
Okapi Weight (Un-normalized):   0.5184883466756323
Lemma: region
Okapi Weight (Un-normalized):   0.4807381652755392
Lemma: result
Okapi Weight (Un-normalized):   0.4366462564735607
Lemma: reynold
Okapi Weight (Un-normalized):   0.47555356189472847
Lemma: sc
Okapi Weight (Un-normalized):   0.4351520958018919
Lemma: scope
Okapi Weight (Un-normalized):   0.5167727346384768
Lemma: separate
Okapi Weight (Un-normalized):   0.5904879232893446
Lemma: show
Okapi Weight (Un-normalized):   0.42785737683387814
Lemma: survey
Okapi Weight (Un-normalized):   0.4901525240033333
Lemma: temperature
Okapi Weight (Un-normalized):   0.46248940476097794
Lemma: than
Okapi Weight (Un-normalized):   0.44081031941829246
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theoretical
Okapi Weight (Un-normalized):   0.44543342473482406
Lemma: tn
Okapi Weight (Un-normalized):   0.489402126519491
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.5021156395165338
Lemma: transition
Okapi Weight (Un-normalized):   0.5076508870340523
Lemma: turbulent
Okapi Weight (Un-normalized):   0.5131359146892956
Lemma: velocity
Okapi Weight (Un-normalized):   0.4351520958018919
Lemma: wall
Okapi Weight (Un-normalized):   0.4493422045850408
Lemma: well
Okapi Weight (Un-normalized):   0.45272814370283787

Rank#: 5
Cosine Similarity: 0.12004828771833993
Doc#: 610  Document Headline:  corner interference effects .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.45474635080149767
Lemma: account
Okapi Weight (Un-normalized):   0.479709791176374
Lemma: addition
Okapi Weight (Un-normalized):   0.48696357053075123
Lemma: agard
Okapi Weight (Un-normalized):   0.5843084801860933
Lemma: along
Okapi Weight (Un-normalized):   0.46478106469229785
Lemma: also
Okapi Weight (Un-normalized):   0.45822586484720956
Lemma: angle
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: boundary
Okapi Weight (Un-normalized):   0.4348364578906273
Lemma: braunschweig
Okapi Weight (Un-normalized):   0.6038095238095238
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: carry
Okapi Weight (Un-normalized):   0.48131788935956005
Lemma: case
Okapi Weight (Un-normalized):   0.4309084228680648
Lemma: consideration
Okapi Weight (Un-normalized):   0.4761884439369321
Lemma: corner
Okapi Weight (Un-normalized):   0.5850869818899993
Lemma: depend
Okapi Weight (Un-normalized):   0.48283901974883403
Lemma: describe
Okapi Weight (Un-normalized):   0.4618168457361295
Lemma: dimensional
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: discuss
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: displacement
Okapi Weight (Un-normalized):   0.48131788935956005
Lemma: effect
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: especially
Okapi Weight (Un-normalized):   0.5195274154937956
Lemma: experiment
Okapi Weight (Un-normalized):   0.4618168457361295
Lemma: experimental
Okapi Weight (Un-normalized):   0.439002087246861
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.45474635080149767
Lemma: friction
Okapi Weight (Un-normalized):   0.479709791176374
Lemma: from
Okapi Weight (Un-normalized):   0.4348364578906273
Lemma: furthermore
Okapi Weight (Un-normalized):   0.5256441221758439
Lemma: gerstenk
Okapi Weight (Un-normalized):   0.6038095238095238
Lemma: give
Okapi Weight (Un-normalized):   0.41950104362343055
Lemma: gradient
Okapi Weight (Un-normalized):   0.4699105101149258
Lemma: important
Okapi Weight (Un-normalized):   0.48131788935956005
Lemma: incompressible
Okapi Weight (Un-normalized):   0.46478106469229785
Lemma: infinite
Okapi Weight (Un-normalized):   0.4842821083157283
Lemma: influence
Okapi Weight (Un-normalized):   0.4721624363693443
Lemma: interference
Okapi Weight (Un-normalized):   0.6204757785481709
Lemma: intersect
Okapi Weight (Un-normalized):   0.5585295027406565
Lemma: into
Okapi Weight (Un-normalized):   0.4585031308702915
Lemma: introduce
Okapi Weight (Un-normalized):   0.48565477366956245
Lemma: investigate
Okapi Weight (Un-normalized):   0.4618168457361295
Lemma: laminar
Okapi Weight (Un-normalized):   0.46759813571892517
Lemma: layer
Okapi Weight (Un-normalized):   0.45521447941459586
Lemma: mainly
Okapi Weight (Un-normalized):   0.517871993398816
Lemma: means
Okapi Weight (Un-normalized):   0.4721624363693443
Lemma: more
Okapi Weight (Un-normalized):   0.4585031308702915
Lemma: number
Okapi Weight (Un-normalized):   0.41950104362343055
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: order
Okapi Weight (Un-normalized):   0.45474635080149767
Lemma: out
Okapi Weight (Un-normalized):   0.4674625269073207
Lemma: plate
Okapi Weight (Un-normalized):   0.4752558386010474
Lemma: preliminary
Okapi Weight (Un-normalized):   0.505155817292993
Lemma: pressure
Okapi Weight (Un-normalized):   0.41950104362343055
Lemma: quantity
Okapi Weight (Un-normalized):   0.501589777337357
Lemma: result
Okapi Weight (Un-normalized):   0.4291129324236048
Lemma: reynold
Okapi Weight (Un-normalized):   0.45474635080149767
Lemma: right
Okapi Weight (Un-normalized):   0.5453063929392323
Lemma: semus
Okapi Weight (Un-normalized):   0.5037831519391588
Lemma: show
Okapi Weight (Un-normalized):   0.4309084228680648
Lemma: skin
Okapi Weight (Un-normalized):   0.4761884439369321
Lemma: study
Okapi Weight (Un-normalized):   0.4452800210688673
Lemma: take
Okapi Weight (Un-normalized):   0.4674625269073207
Lemma: technical
Okapi Weight (Un-normalized):   0.5256441221758439
Lemma: theoretical
Okapi Weight (Un-normalized):   0.4752558386010474
Lemma: these
Okapi Weight (Un-normalized):   0.4309084228680648
Lemma: thickness
Okapi Weight (Un-normalized):   0.4585031308702915
Lemma: three
Okapi Weight (Un-normalized):   0.46478106469229785
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transition
Okapi Weight (Un-normalized):   0.478004174493722
Lemma: treat
Okapi Weight (Un-normalized):   0.479709791176374
Lemma: turbulent
Okapi Weight (Un-normalized):   0.5007141989374694
Lemma: two
Okapi Weight (Un-normalized):   0.45521447941459586
Lemma: university
Okapi Weight (Un-normalized):   0.5195274154937956
 ***************************** 
Processing Query:  is it possible to relate the available pressure distributions for an ogive forebody at zero angle of attack to the lower surface pressures of an equivalent ogive forebody at angle of attack  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.29695878007624776
Doc#: 492  Document Headline:  prediction of ogive-forebody pressures at angles of attack .
Document Vector: 
Lemma: aerodynamicist
Okapi Weight (Un-normalized):   0.6449669673359468
Lemma: angle
Okapi Weight (Un-normalized):   0.513827827561441
Lemma: approximate
Okapi Weight (Un-normalized):   0.4727641371412311
Lemma: approximation
Okapi Weight (Un-normalized):   0.4821616304087798
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.5036764344536812
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5578624421949936
Lemma: be
Okapi Weight (Un-normalized):   0.4410808152043899
Lemma: body
Okapi Weight (Un-normalized):   0.4518382172268406
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4669999238178102
Lemma: calif
Okapi Weight (Un-normalized):   0.6038326948394492
Lemma: center
Okapi Weight (Un-normalized):   0.5329464436251687
Lemma: distribution
Okapi Weight (Un-normalized):   0.4518382172268406
Lemma: earl
Okapi Weight (Un-normalized):   0.6708860759493671
Lemma: edward
Okapi Weight (Un-normalized):   0.6449669673359468
Lemma: flight
Okapi Weight (Un-normalized):   0.4861014150973579
Lemma: forebody
Okapi Weight (Un-normalized):   0.666113452185222
Lemma: keener
Okapi Weight (Un-normalized):   0.6708860759493671
Lemma: lower
Okapi Weight (Un-normalized):   0.5080807390222001
Lemma: method
Okapi Weight (Un-normalized):   0.4410808152043899
Lemma: nasa
Okapi Weight (Un-normalized):   0.4821616304087798
Lemma: not
Okapi Weight (Un-normalized):   0.4601823064839376
Lemma: obtain
Okapi Weight (Un-normalized):   0.4566055418804675
Lemma: ogive
Okapi Weight (Un-normalized):   0.6449267602599513
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.4601823064839376
Lemma: prediction
Okapi Weight (Un-normalized):   0.505943393335687
Lemma: present
Okapi Weight (Un-normalized):   0.4259191086134203
Lemma: pressure
Okapi Weight (Un-normalized):   0.44403461463355276
Lemma: research
Okapi Weight (Un-normalized):   0.5101024946028807
Lemma: suggest
Okapi Weight (Un-normalized):   0.513844952345621
Lemma: surface
Okapi Weight (Un-normalized):   0.4714282411788443
Lemma: utilize
Okapi Weight (Un-normalized):   0.5406439455422981
Lemma: various
Okapi Weight (Un-normalized):   0.47775732584026087
Lemma: zero
Okapi Weight (Un-normalized):   0.4861014150973579

Rank#: 2
Cosine Similarity: 0.18820019358727488
Doc#: 122  Document Headline:  a simplified approximate method for the calculation of the pressure around conical bodies of arbitrary shape in supersonic and hypersonic flow .
Document Vector: 
Lemma: abbreviated
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: aircraft
Okapi Weight (Un-normalized):   0.4620972973291186
Lemma: angle
Okapi Weight (Un-normalized):   0.4865929485743477
Lemma: applicable
Okapi Weight (Un-normalized):   0.4632588878082005
Lemma: approximate
Okapi Weight (Un-normalized):   0.48257829450505235
Lemma: arbitrarily
Okapi Weight (Un-normalized):   0.5061671869622453
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.45956682415884226
Lemma: around
Okapi Weight (Un-normalized):   0.4691549412688156
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5200916738170503
Lemma: available
Okapi Weight (Un-normalized):   0.4608692950801402
Lemma: base
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: body
Okapi Weight (Un-normalized):   0.4846192508498405
Lemma: calculation
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: certain
Okapi Weight (Un-normalized):   0.48181211155267
Lemma: circular
Okapi Weight (Un-normalized):   0.4785602901947019
Lemma: complicate
Okapi Weight (Un-normalized):   0.5021270370053615
Lemma: component
Okapi Weight (Un-normalized):   0.4673635549020192
Lemma: cone
Okapi Weight (Un-normalized):   0.541066734784867
Lemma: conical
Okapi Weight (Un-normalized):   0.5493852745313518
Lemma: consider
Okapi Weight (Un-normalized):   0.4549112863780297
Lemma: considerably
Okapi Weight (Un-normalized):   0.4781505938479111
Lemma: corporation
Okapi Weight (Un-normalized):   0.5083539057517078
Lemma: determine
Okapi Weight (Un-normalized):   0.43457747063440777
Lemma: develop
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: deviate
Okapi Weight (Un-normalized):   0.5210588930019558
Lemma: division
Okapi Weight (Un-normalized):   0.510961245517232
Lemma: do
Okapi Weight (Un-normalized):   0.45669801028812695
Lemma: due
Okapi Weight (Un-normalized):   0.447205591289408
Lemma: element
Okapi Weight (Un-normalized):   0.5668542893407736
Lemma: equivalent
Okapi Weight (Un-normalized):   0.5222635760910184
Lemma: especially
Okapi Weight (Un-normalized):   0.49127548092253476
Lemma: exact
Okapi Weight (Un-normalized):   0.45510586050022656
Lemma: exist
Okapi Weight (Un-normalized):   0.45510586050022656
Lemma: fact
Okapi Weight (Un-normalized):   0.4817830619238158
Lemma: feel
Okapi Weight (Un-normalized):   0.5083539057517078
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: form
Okapi Weight (Un-normalized):   0.43457747063440777
Lemma: free
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: from
Okapi Weight (Un-normalized):   0.4148917060397106
Lemma: further
Okapi Weight (Un-normalized):   0.4632588878082005
Lemma: generally
Okapi Weight (Un-normalized):   0.47307197231882236
Lemma: georgium
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: give
Okapi Weight (Un-normalized):   0.4148917060397106
Lemma: great
Okapi Weight (Un-normalized):   0.4933231429776431
Lemma: have
Okapi Weight (Un-normalized):   0.42360279564470404
Lemma: high
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: however
Okapi Weight (Un-normalized):   0.45338620772412513
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.4446751181191317
Lemma: incidence
Okapi Weight (Un-normalized):   0.4691549412688156
Lemma: inconsistent
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: independent
Okapi Weight (Un-normalized):   0.4715897163278375
Lemma: information
Okapi Weight (Un-normalized):   0.47377643511730005
Lemma: jacob
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: limited
Okapi Weight (Un-normalized):   0.4763837748828242
Lemma: local
Okapi Weight (Un-normalized):   0.48478079186218137
Lemma: lockheed
Okapi Weight (Un-normalized):   0.5998627238392253
Lemma: lower
Okapi Weight (Un-normalized):   0.4620972973291186
Lemma: mach
Okapi Weight (Un-normalized):   0.4466216434322765
Lemma: mainly
Okapi Weight (Un-normalized):   0.4900113404136413
Lemma: manner
Okapi Weight (Un-normalized):   0.4673635549020192
Lemma: method
Okapi Weight (Un-normalized):   0.46705916971805705
Lemma: need
Okapi Weight (Un-normalized):   0.4792525887535395
Lemma: newtonian
Okapi Weight (Un-normalized):   0.47377643511730005
Lemma: nonaxisymmetric
Okapi Weight (Un-normalized):   0.5320028543474669
Lemma: normal
Okapi Weight (Un-normalized):   0.45151683872922677
Lemma: not
Okapi Weight (Un-normalized):   0.43457747063440777
Lemma: number
Okapi Weight (Un-normalized):   0.42941498200182254
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.48257829450505235
Lemma: other
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: present
Okapi Weight (Un-normalized):   0.4148917060397106
Lemma: pressure
Okapi Weight (Un-normalized):   0.42364900381667225
Lemma: quite
Okapi Weight (Un-normalized):   0.5306267377804177
Lemma: range
Okapi Weight (Un-normalized):   0.42978341207942117
Lemma: recently
Okapi Weight (Un-normalized):   0.47757764814852716
Lemma: relatively
Okapi Weight (Un-normalized):   0.47307197231882236
Lemma: respect
Okapi Weight (Un-normalized):   0.47377643511730005
Lemma: result
Okapi Weight (Un-normalized):   0.4148917060397106
Lemma: same
Okapi Weight (Un-normalized):   0.447205591289408
Lemma: satisfactory
Okapi Weight (Un-normalized):   0.4715897163278375
Lemma: shape
Okapi Weight (Un-normalized):   0.48257829450505235
Lemma: simple
Okapi Weight (Un-normalized):   0.44180630424841644
Lemma: simplify
Okapi Weight (Un-normalized):   0.4673635549020192
Lemma: solution
Okapi Weight (Un-normalized):   0.42360279564470404
Lemma: stream
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: such
Okapi Weight (Un-normalized):   0.44180630424841644
Lemma: supersonic
Okapi Weight (Un-normalized):   0.43457747063440777
Lemma: surface
Okapi Weight (Un-normalized):   0.44729800763334443
Lemma: symmetric
Okapi Weight (Un-normalized):   0.4691549412688156
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4466216434322765
Lemma: therefore
Okapi Weight (Un-normalized):   0.47757764814852716
Lemma: these
Okapi Weight (Un-normalized):   0.42360279564470404
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: utilize
Okapi Weight (Un-normalized):   0.48080633962066577
Lemma: well
Okapi Weight (Un-normalized):   0.47094701145001666
Lemma: willus
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: work
Okapi Weight (Un-normalized):   0.45338620772412513
Lemma: zero
Okapi Weight (Un-normalized):   0.49771445512246043

Rank#: 3
Cosine Similarity: 0.18174210691025378
Doc#: 232  Document Headline:  accuracy of approximate methods for predicting pressure on pointed non-lifting bodies of revolution in supersonic flow .
Document Vector: 
Lemma: accuracy
Okapi Weight (Un-normalized):   0.5518383826215851
Lemma: accurate
Okapi Weight (Un-normalized):   0.5324263688502759
Lemma: although
Okapi Weight (Un-normalized):   0.4659290606911833
Lemma: angle
Okapi Weight (Un-normalized):   0.4756742586726974
Lemma: applicability
Okapi Weight (Un-normalized):   0.4939912230536459
Lemma: application
Okapi Weight (Un-normalized):   0.44686475669526066
Lemma: apply
Okapi Weight (Un-normalized):   0.4382165630440939
Lemma: appreciably
Okapi Weight (Un-normalized):   0.49525366663150616
Lemma: approximate
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.45300074774055743
Lemma: body
Okapi Weight (Un-normalized):   0.46672454844676836
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: characteristic
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: compare
Okapi Weight (Un-normalized):   0.4382165630440939
Lemma: cone
Okapi Weight (Un-normalized):   0.5154145063180232
Lemma: conical
Okapi Weight (Un-normalized):   0.5305489660866718
Lemma: distribution
Okapi Weight (Un-normalized):   0.4470264401254018
Lemma: drag
Okapi Weight (Un-normalized):   0.4781092263275553
Lemma: ehretdm
Okapi Weight (Un-normalized):   0.5397284506825979
Lemma: engineering
Okapi Weight (Un-normalized):   0.4866054729803394
Lemma: except
Okapi Weight (Un-normalized):   0.46949216894759105
Lemma: expansion
Okapi Weight (Un-normalized):   0.522073717942469
Lemma: extend
Okapi Weight (Un-normalized):   0.4577601921543529
Lemma: find
Okapi Weight (Un-normalized):   0.42956836939292714
Lemma: fineness
Okapi Weight (Un-normalized):   0.5455427070024563
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: general
Okapi Weight (Un-normalized):   0.4382165630440939
Lemma: give
Okapi Weight (Un-normalized):   0.4235132200627009
Lemma: good
Okapi Weight (Un-normalized):   0.4972487786087712
Lemma: greater
Okapi Weight (Un-normalized):   0.46389618319964965
Lemma: highest
Okapi Weight (Un-normalized):   0.501389657676803
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.48782439820877754
Lemma: integrate
Okapi Weight (Un-normalized):   0.47868036789611323
Lemma: investigate
Okapi Weight (Un-normalized):   0.49279891853954316
Lemma: less
Okapi Weight (Un-normalized):   0.49610941328443187
Lemma: lifting
Okapi Weight (Un-normalized):   0.4775863296324027
Lemma: linearize
Okapi Weight (Un-normalized):   0.5118027162117558
Lemma: low
Okapi Weight (Un-normalized):   0.44686475669526066
Lemma: maccoll
Okapi Weight (Un-normalized):   0.5249442659861343
Lemma: mach
Okapi Weight (Un-normalized):   0.4372675720705853
Lemma: maximum
Okapi Weight (Un-normalized):   0.45300074774055743
Lemma: method
Okapi Weight (Un-normalized):   0.4577128227826936
Lemma: modify
Okapi Weight (Un-normalized):   0.46164894139172424
Lemma: naca
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: newtonian
Okapi Weight (Un-normalized):   0.5164891080799474
Lemma: non
Okapi Weight (Un-normalized):   0.46865562761344504
Lemma: not
Okapi Weight (Un-normalized):   0.43432781380672253
Lemma: number
Okapi Weight (Un-normalized):   0.4235132200627009
Lemma: obtain
Okapi Weight (Un-normalized):   0.4372675720705853
Lemma: ogive
Okapi Weight (Un-normalized):   0.5612532163242551
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: optimum
Okapi Weight (Un-normalized):   0.4834398123099086
Lemma: order
Okapi Weight (Un-normalized):   0.4821847521960529
Lemma: over
Okapi Weight (Un-normalized):   0.43432781380672253
Lemma: parameter
Okapi Weight (Un-normalized):   0.49279891853954316
Lemma: pointed
Okapi Weight (Un-normalized):   0.5275889572957881
Lemma: predict
Okapi Weight (Un-normalized):   0.4972487786087712
Lemma: pressure
Okapi Weight (Un-normalized):   0.43641273705619804
Lemma: range
Okapi Weight (Un-normalized):   0.4585495988058517
Lemma: ratio
Okapi Weight (Un-normalized):   0.4585495988058517
Lemma: result
Okapi Weight (Un-normalized):   0.41478418469646355
Lemma: revolution
Okapi Weight (Un-normalized):   0.49804836420387144
Lemma: second
Okapi Weight (Un-normalized):   0.5083296304511999
Lemma: shape
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: shock
Okapi Weight (Un-normalized):   0.4679739792058453
Lemma: similarity
Okapi Weight (Un-normalized):   0.5407343510019046
Lemma: standard
Okapi Weight (Un-normalized):   0.49061645217941174
Lemma: supersonic
Okapi Weight (Un-normalized):   0.43432781380672253
Lemma: surface
Okapi Weight (Un-normalized):   0.42956836939292714
Lemma: tangent
Okapi Weight (Un-normalized):   0.6121023933674943
Lemma: taylor
Okapi Weight (Un-normalized):   0.49151150951718825
Lemma: than
Okapi Weight (Un-normalized):   0.4679739792058453
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4720953788204944
Lemma: these
Okapi Weight (Un-normalized):   0.42343237834763037
Lemma: three
Okapi Weight (Un-normalized):   0.4491119985031861
Lemma: tn
Okapi Weight (Un-normalized):   0.4491119985031861
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: value
Okapi Weight (Un-normalized):   0.4585495988058517
Lemma: wide
Okapi Weight (Un-normalized):   0.4718212882838759
Lemma: widely
Okapi Weight (Un-normalized):   0.5201848215723388
Lemma: within
Okapi Weight (Un-normalized):   0.45470798425112746
Lemma: zero
Okapi Weight (Un-normalized):   0.4491119985031861

Rank#: 4
Cosine Similarity: 0.18134698465789562
Doc#: 248  Document Headline:  the application of lighthill formula for numerical calculation of pressure distributions on bodies of revolution at supersonic speed and zero angle of attack .
Document Vector: 
Lemma: angle
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: application
Okapi Weight (Un-normalized):   0.4676121750238917
Lemma: apply
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: approximation
Okapi Weight (Un-normalized):   0.4676121750238917
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5115028389174765
Lemma: base
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: body
Okapi Weight (Un-normalized):   0.4734202638412025
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculation
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: computing
Okapi Weight (Un-normalized):   0.5822003748016761
Lemma: could
Okapi Weight (Un-normalized):   0.49511640526800915
Lemma: determine
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: develop
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: digital
Okapi Weight (Un-normalized):   0.592521682047553
Lemma: distribution
Okapi Weight (Un-normalized):   0.4622058606722087
Lemma: drag
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: duct
Okapi Weight (Un-normalized):   0.5462757040441376
Lemma: exact
Okapi Weight (Un-normalized):   0.47892766477897036
Lemma: expect
Okapi Weight (Un-normalized):   0.5094038442332117
Lemma: expression
Okapi Weight (Un-normalized):   0.5215157460259929
Lemma: external
Okapi Weight (Un-normalized):   0.49060517785028723
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: formulum
Okapi Weight (Un-normalized):   0.5056693732148829
Lemma: from
Okapi Weight (Un-normalized):   0.43110293033610436
Lemma: give
Okapi Weight (Un-normalized):   0.43671013192060126
Lemma: good
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: integral
Okapi Weight (Un-normalized):   0.48531706585250844
Lemma: lighthill
Okapi Weight (Un-normalized):   0.6003944227108395
Lemma: linearize
Okapi Weight (Un-normalized):   0.5478909347358035
Lemma: mach
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: method
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: much
Okapi Weight (Un-normalized):   0.49368490870108395
Lemma: number
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: numerical
Okapi Weight (Un-normalized):   0.49330879100831304
Lemma: ohmanl
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: pointed
Okapi Weight (Un-normalized):   0.5157382468525161
Lemma: pressure
Okapi Weight (Un-normalized):   0.43110293033610436
Lemma: procedure
Okapi Weight (Un-normalized):   0.4833311105560195
Lemma: range
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: result
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: revolution
Okapi Weight (Un-normalized):   0.5530784969019606
Lemma: saab
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: show
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: slender
Okapi Weight (Un-normalized):   0.4833311105560195
Lemma: speed
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: supersonic
Okapi Weight (Un-normalized):   0.47221876778072513
Lemma: surface
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: than
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: theory
Okapi Weight (Un-normalized):   0.4492969782452679
Lemma: thickness
Okapi Weight (Un-normalized):   0.46398779938938134
Lemma: tn
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: various
Okapi Weight (Un-normalized):   0.46398779938938134
Lemma: wave
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: wider
Okapi Weight (Un-normalized):   0.5490635179109395
Lemma: zero
Okapi Weight (Un-normalized):   0.5033216981168295

Rank#: 5
Cosine Similarity: 0.17766053581342584
Doc#: 57  Document Headline:  applicability of the hypersonic similarity rule to pressure distributions which include the effects of rotation for bodies of revolution at zero angle of attack .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.4517870885960113
Lemma: accuracy
Okapi Weight (Un-normalized):   0.4769223277725568
Lemma: although
Okapi Weight (Un-normalized):   0.48226283698854844
Lemma: analysis
Okapi Weight (Un-normalized):   0.43689386631459826
Lemma: angle
Okapi Weight (Un-normalized):   0.44768463046492796
Lemma: applicability
Okapi Weight (Un-normalized):   0.5172773368732428
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.4661315636222271
Lemma: between
Okapi Weight (Un-normalized):   0.44283245236244206
Lemma: body
Okapi Weight (Un-normalized):   0.43689386631459826
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: can
Okapi Weight (Un-normalized):   0.43689386631459826
Lemma: characteristic
Okapi Weight (Un-normalized):   0.4517870885960113
Lemma: chart
Okapi Weight (Un-normalized):   0.5018927781935841
Lemma: cylinder
Okapi Weight (Un-normalized):   0.49458007588192926
Lemma: depend
Okapi Weight (Un-normalized):   0.4783612348975457
Lemma: determination
Okapi Weight (Un-normalized):   0.4845784967795262
Lemma: distribution
Okapi Weight (Un-normalized):   0.4807204828039502
Lemma: divide
Okapi Weight (Un-normalized):   0.5115005342961773
Lemma: drag
Okapi Weight (Un-normalized):   0.5119160989656699
Lemma: due
Okapi Weight (Un-normalized):   0.45847539461525766
Lemma: effect
Okapi Weight (Un-normalized):   0.42792194882445733
Lemma: engineering
Okapi Weight (Un-normalized):   0.5080617838538469
Lemma: equation
Okapi Weight (Un-normalized):   0.42923769730762884
Lemma: error
Okapi Weight (Un-normalized):   0.5816677282301249
Lemma: extend
Okapi Weight (Un-normalized):   0.4720701496700709
Lemma: find
Okapi Weight (Un-normalized):   0.45584389764891464
Lemma: fineness
Okapi Weight (Un-normalized):   0.572831964565417
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.48376584647337195
Lemma: ignore
Okapi Weight (Un-normalized):   0.5450701161469954
Lemma: include
Okapi Weight (Un-normalized):   0.47217719065827735
Lemma: influence
Okapi Weight (Un-normalized):   0.46826176413316356
Lemma: into
Okapi Weight (Un-normalized):   0.4553407994718974
Lemma: introduce
Okapi Weight (Un-normalized):   0.4810247859036402
Lemma: investigate
Okapi Weight (Un-normalized):   0.45847539461525766
Lemma: mach
Okapi Weight (Un-normalized):   0.44425524183382004
Lemma: most
Okapi Weight (Un-normalized):   0.4720701496700709
Lemma: naca
Okapi Weight (Un-normalized):   0.4517870885960113
Lemma: neglect
Okapi Weight (Un-normalized):   0.49138972818584464
Lemma: negligible
Okapi Weight (Un-normalized):   0.5013078469776997
Lemma: note
Okapi Weight (Un-normalized):   0.4638159038312494
Lemma: number
Okapi Weight (Un-normalized):   0.42792194882445733
Lemma: ogive
Okapi Weight (Un-normalized):   0.6310460846327878
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.4517870885960113
Lemma: over
Okapi Weight (Un-normalized):   0.46483275743951463
Lemma: parameter
Okapi Weight (Un-normalized):   0.48851048366764005
Lemma: percent
Okapi Weight (Un-normalized):   0.4810247859036402
Lemma: present
Okapi Weight (Un-normalized):   0.41844693315729914
Lemma: pressure
Okapi Weight (Un-normalized):   0.4403602414019751
Lemma: purpose
Okapi Weight (Un-normalized):   0.4769223277725568
Lemma: rapid
Okapi Weight (Un-normalized):   0.5000979432237977
Lemma: ratio
Okapi Weight (Un-normalized):   0.45584389764891464
Lemma: related
Okapi Weight (Un-normalized):   0.49305360113887814
Lemma: revolution
Okapi Weight (Un-normalized):   0.4769223277725568
Lemma: rossowvj
Okapi Weight (Un-normalized):   0.5743458596354937
Lemma: rotation
Okapi Weight (Un-normalized):   0.6565923336319965
Lemma: rotational
Okapi Weight (Un-normalized):   0.5172773368732428
Lemma: rule
Okapi Weight (Un-normalized):   0.5798995385699584
Lemma: similarity
Okapi Weight (Un-normalized):   0.5806162567904157
Lemma: sufficient
Okapi Weight (Un-normalized):   0.5130664741157525
Lemma: technical
Okapi Weight (Un-normalized):   0.5188525480041766
Lemma: term
Okapi Weight (Un-normalized):   0.5010703083590959
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theoretical
Okapi Weight (Un-normalized):   0.44768463046492796
Lemma: tn
Okapi Weight (Un-normalized):   0.4612793855197412
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: upon
Okapi Weight (Un-normalized):   0.4769223277725568
Lemma: value
Okapi Weight (Un-normalized):   0.43689386631459826
Lemma: zero
Okapi Weight (Un-normalized):   0.4612793855197412
 ***************************** 
Processing Query:  what methods -dash exact or approximate -dash are presently available for predicting body pressures at angle of attack 
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.19508261165476357
Doc#: 492  Document Headline:  prediction of ogive-forebody pressures at angles of attack .
Document Vector: 
Lemma: aerodynamicist
Okapi Weight (Un-normalized):   0.6449669673359468
Lemma: angle
Okapi Weight (Un-normalized):   0.513827827561441
Lemma: approximate
Okapi Weight (Un-normalized):   0.4727641371412311
Lemma: approximation
Okapi Weight (Un-normalized):   0.4821616304087798
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.5036764344536812
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5578624421949936
Lemma: be
Okapi Weight (Un-normalized):   0.4410808152043899
Lemma: body
Okapi Weight (Un-normalized):   0.4518382172268406
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4669999238178102
Lemma: calif
Okapi Weight (Un-normalized):   0.6038326948394492
Lemma: center
Okapi Weight (Un-normalized):   0.5329464436251687
Lemma: distribution
Okapi Weight (Un-normalized):   0.4518382172268406
Lemma: earl
Okapi Weight (Un-normalized):   0.6708860759493671
Lemma: edward
Okapi Weight (Un-normalized):   0.6449669673359468
Lemma: flight
Okapi Weight (Un-normalized):   0.4861014150973579
Lemma: forebody
Okapi Weight (Un-normalized):   0.666113452185222
Lemma: keener
Okapi Weight (Un-normalized):   0.6708860759493671
Lemma: lower
Okapi Weight (Un-normalized):   0.5080807390222001
Lemma: method
Okapi Weight (Un-normalized):   0.4410808152043899
Lemma: nasa
Okapi Weight (Un-normalized):   0.4821616304087798
Lemma: not
Okapi Weight (Un-normalized):   0.4601823064839376
Lemma: obtain
Okapi Weight (Un-normalized):   0.4566055418804675
Lemma: ogive
Okapi Weight (Un-normalized):   0.6449267602599513
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.4601823064839376
Lemma: prediction
Okapi Weight (Un-normalized):   0.505943393335687
Lemma: present
Okapi Weight (Un-normalized):   0.4259191086134203
Lemma: pressure
Okapi Weight (Un-normalized):   0.44403461463355276
Lemma: research
Okapi Weight (Un-normalized):   0.5101024946028807
Lemma: suggest
Okapi Weight (Un-normalized):   0.513844952345621
Lemma: surface
Okapi Weight (Un-normalized):   0.4714282411788443
Lemma: utilize
Okapi Weight (Un-normalized):   0.5406439455422981
Lemma: various
Okapi Weight (Un-normalized):   0.47775732584026087
Lemma: zero
Okapi Weight (Un-normalized):   0.4861014150973579

Rank#: 2
Cosine Similarity: 0.17912661573462774
Doc#: 122  Document Headline:  a simplified approximate method for the calculation of the pressure around conical bodies of arbitrary shape in supersonic and hypersonic flow .
Document Vector: 
Lemma: abbreviated
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: aircraft
Okapi Weight (Un-normalized):   0.4620972973291186
Lemma: angle
Okapi Weight (Un-normalized):   0.4865929485743477
Lemma: applicable
Okapi Weight (Un-normalized):   0.4632588878082005
Lemma: approximate
Okapi Weight (Un-normalized):   0.48257829450505235
Lemma: arbitrarily
Okapi Weight (Un-normalized):   0.5061671869622453
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.45956682415884226
Lemma: around
Okapi Weight (Un-normalized):   0.4691549412688156
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5200916738170503
Lemma: available
Okapi Weight (Un-normalized):   0.4608692950801402
Lemma: base
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: body
Okapi Weight (Un-normalized):   0.4846192508498405
Lemma: calculation
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: certain
Okapi Weight (Un-normalized):   0.48181211155267
Lemma: circular
Okapi Weight (Un-normalized):   0.4785602901947019
Lemma: complicate
Okapi Weight (Un-normalized):   0.5021270370053615
Lemma: component
Okapi Weight (Un-normalized):   0.4673635549020192
Lemma: cone
Okapi Weight (Un-normalized):   0.541066734784867
Lemma: conical
Okapi Weight (Un-normalized):   0.5493852745313518
Lemma: consider
Okapi Weight (Un-normalized):   0.4549112863780297
Lemma: considerably
Okapi Weight (Un-normalized):   0.4781505938479111
Lemma: corporation
Okapi Weight (Un-normalized):   0.5083539057517078
Lemma: determine
Okapi Weight (Un-normalized):   0.43457747063440777
Lemma: develop
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: deviate
Okapi Weight (Un-normalized):   0.5210588930019558
Lemma: division
Okapi Weight (Un-normalized):   0.510961245517232
Lemma: do
Okapi Weight (Un-normalized):   0.45669801028812695
Lemma: due
Okapi Weight (Un-normalized):   0.447205591289408
Lemma: element
Okapi Weight (Un-normalized):   0.5668542893407736
Lemma: equivalent
Okapi Weight (Un-normalized):   0.5222635760910184
Lemma: especially
Okapi Weight (Un-normalized):   0.49127548092253476
Lemma: exact
Okapi Weight (Un-normalized):   0.45510586050022656
Lemma: exist
Okapi Weight (Un-normalized):   0.45510586050022656
Lemma: fact
Okapi Weight (Un-normalized):   0.4817830619238158
Lemma: feel
Okapi Weight (Un-normalized):   0.5083539057517078
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: form
Okapi Weight (Un-normalized):   0.43457747063440777
Lemma: free
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: from
Okapi Weight (Un-normalized):   0.4148917060397106
Lemma: further
Okapi Weight (Un-normalized):   0.4632588878082005
Lemma: generally
Okapi Weight (Un-normalized):   0.47307197231882236
Lemma: georgium
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: give
Okapi Weight (Un-normalized):   0.4148917060397106
Lemma: great
Okapi Weight (Un-normalized):   0.4933231429776431
Lemma: have
Okapi Weight (Un-normalized):   0.42360279564470404
Lemma: high
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: however
Okapi Weight (Un-normalized):   0.45338620772412513
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.4446751181191317
Lemma: incidence
Okapi Weight (Un-normalized):   0.4691549412688156
Lemma: inconsistent
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: independent
Okapi Weight (Un-normalized):   0.4715897163278375
Lemma: information
Okapi Weight (Un-normalized):   0.47377643511730005
Lemma: jacob
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: limited
Okapi Weight (Un-normalized):   0.4763837748828242
Lemma: local
Okapi Weight (Un-normalized):   0.48478079186218137
Lemma: lockheed
Okapi Weight (Un-normalized):   0.5998627238392253
Lemma: lower
Okapi Weight (Un-normalized):   0.4620972973291186
Lemma: mach
Okapi Weight (Un-normalized):   0.4466216434322765
Lemma: mainly
Okapi Weight (Un-normalized):   0.4900113404136413
Lemma: manner
Okapi Weight (Un-normalized):   0.4673635549020192
Lemma: method
Okapi Weight (Un-normalized):   0.46705916971805705
Lemma: need
Okapi Weight (Un-normalized):   0.4792525887535395
Lemma: newtonian
Okapi Weight (Un-normalized):   0.47377643511730005
Lemma: nonaxisymmetric
Okapi Weight (Un-normalized):   0.5320028543474669
Lemma: normal
Okapi Weight (Un-normalized):   0.45151683872922677
Lemma: not
Okapi Weight (Un-normalized):   0.43457747063440777
Lemma: number
Okapi Weight (Un-normalized):   0.42941498200182254
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.48257829450505235
Lemma: other
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: present
Okapi Weight (Un-normalized):   0.4148917060397106
Lemma: pressure
Okapi Weight (Un-normalized):   0.42364900381667225
Lemma: quite
Okapi Weight (Un-normalized):   0.5306267377804177
Lemma: range
Okapi Weight (Un-normalized):   0.42978341207942117
Lemma: recently
Okapi Weight (Un-normalized):   0.47757764814852716
Lemma: relatively
Okapi Weight (Un-normalized):   0.47307197231882236
Lemma: respect
Okapi Weight (Un-normalized):   0.47377643511730005
Lemma: result
Okapi Weight (Un-normalized):   0.4148917060397106
Lemma: same
Okapi Weight (Un-normalized):   0.447205591289408
Lemma: satisfactory
Okapi Weight (Un-normalized):   0.4715897163278375
Lemma: shape
Okapi Weight (Un-normalized):   0.48257829450505235
Lemma: simple
Okapi Weight (Un-normalized):   0.44180630424841644
Lemma: simplify
Okapi Weight (Un-normalized):   0.4673635549020192
Lemma: solution
Okapi Weight (Un-normalized):   0.42360279564470404
Lemma: stream
Okapi Weight (Un-normalized):   0.43849450168441456
Lemma: such
Okapi Weight (Un-normalized):   0.44180630424841644
Lemma: supersonic
Okapi Weight (Un-normalized):   0.43457747063440777
Lemma: surface
Okapi Weight (Un-normalized):   0.44729800763334443
Lemma: symmetric
Okapi Weight (Un-normalized):   0.4691549412688156
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4466216434322765
Lemma: therefore
Okapi Weight (Un-normalized):   0.47757764814852716
Lemma: these
Okapi Weight (Un-normalized):   0.42360279564470404
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: utilize
Okapi Weight (Un-normalized):   0.48080633962066577
Lemma: well
Okapi Weight (Un-normalized):   0.47094701145001666
Lemma: willus
Okapi Weight (Un-normalized):   0.5556363636363637
Lemma: work
Okapi Weight (Un-normalized):   0.45338620772412513
Lemma: zero
Okapi Weight (Un-normalized):   0.49771445512246043

Rank#: 3
Cosine Similarity: 0.16649322408438652
Doc#: 232  Document Headline:  accuracy of approximate methods for predicting pressure on pointed non-lifting bodies of revolution in supersonic flow .
Document Vector: 
Lemma: accuracy
Okapi Weight (Un-normalized):   0.5518383826215851
Lemma: accurate
Okapi Weight (Un-normalized):   0.5324263688502759
Lemma: although
Okapi Weight (Un-normalized):   0.4659290606911833
Lemma: angle
Okapi Weight (Un-normalized):   0.4756742586726974
Lemma: applicability
Okapi Weight (Un-normalized):   0.4939912230536459
Lemma: application
Okapi Weight (Un-normalized):   0.44686475669526066
Lemma: apply
Okapi Weight (Un-normalized):   0.4382165630440939
Lemma: appreciably
Okapi Weight (Un-normalized):   0.49525366663150616
Lemma: approximate
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.45300074774055743
Lemma: body
Okapi Weight (Un-normalized):   0.46672454844676836
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: characteristic
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: compare
Okapi Weight (Un-normalized):   0.4382165630440939
Lemma: cone
Okapi Weight (Un-normalized):   0.5154145063180232
Lemma: conical
Okapi Weight (Un-normalized):   0.5305489660866718
Lemma: distribution
Okapi Weight (Un-normalized):   0.4470264401254018
Lemma: drag
Okapi Weight (Un-normalized):   0.4781092263275553
Lemma: ehretdm
Okapi Weight (Un-normalized):   0.5397284506825979
Lemma: engineering
Okapi Weight (Un-normalized):   0.4866054729803394
Lemma: except
Okapi Weight (Un-normalized):   0.46949216894759105
Lemma: expansion
Okapi Weight (Un-normalized):   0.522073717942469
Lemma: extend
Okapi Weight (Un-normalized):   0.4577601921543529
Lemma: find
Okapi Weight (Un-normalized):   0.42956836939292714
Lemma: fineness
Okapi Weight (Un-normalized):   0.5455427070024563
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: general
Okapi Weight (Un-normalized):   0.4382165630440939
Lemma: give
Okapi Weight (Un-normalized):   0.4235132200627009
Lemma: good
Okapi Weight (Un-normalized):   0.4972487786087712
Lemma: greater
Okapi Weight (Un-normalized):   0.46389618319964965
Lemma: highest
Okapi Weight (Un-normalized):   0.501389657676803
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.48782439820877754
Lemma: integrate
Okapi Weight (Un-normalized):   0.47868036789611323
Lemma: investigate
Okapi Weight (Un-normalized):   0.49279891853954316
Lemma: less
Okapi Weight (Un-normalized):   0.49610941328443187
Lemma: lifting
Okapi Weight (Un-normalized):   0.4775863296324027
Lemma: linearize
Okapi Weight (Un-normalized):   0.5118027162117558
Lemma: low
Okapi Weight (Un-normalized):   0.44686475669526066
Lemma: maccoll
Okapi Weight (Un-normalized):   0.5249442659861343
Lemma: mach
Okapi Weight (Un-normalized):   0.4372675720705853
Lemma: maximum
Okapi Weight (Un-normalized):   0.45300074774055743
Lemma: method
Okapi Weight (Un-normalized):   0.4577128227826936
Lemma: modify
Okapi Weight (Un-normalized):   0.46164894139172424
Lemma: naca
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: newtonian
Okapi Weight (Un-normalized):   0.5164891080799474
Lemma: non
Okapi Weight (Un-normalized):   0.46865562761344504
Lemma: not
Okapi Weight (Un-normalized):   0.43432781380672253
Lemma: number
Okapi Weight (Un-normalized):   0.4235132200627009
Lemma: obtain
Okapi Weight (Un-normalized):   0.4372675720705853
Lemma: ogive
Okapi Weight (Un-normalized):   0.5612532163242551
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: optimum
Okapi Weight (Un-normalized):   0.4834398123099086
Lemma: order
Okapi Weight (Un-normalized):   0.4821847521960529
Lemma: over
Okapi Weight (Un-normalized):   0.43432781380672253
Lemma: parameter
Okapi Weight (Un-normalized):   0.49279891853954316
Lemma: pointed
Okapi Weight (Un-normalized):   0.5275889572957881
Lemma: predict
Okapi Weight (Un-normalized):   0.4972487786087712
Lemma: pressure
Okapi Weight (Un-normalized):   0.43641273705619804
Lemma: range
Okapi Weight (Un-normalized):   0.4585495988058517
Lemma: ratio
Okapi Weight (Un-normalized):   0.4585495988058517
Lemma: result
Okapi Weight (Un-normalized):   0.41478418469646355
Lemma: revolution
Okapi Weight (Un-normalized):   0.49804836420387144
Lemma: second
Okapi Weight (Un-normalized):   0.5083296304511999
Lemma: shape
Okapi Weight (Un-normalized):   0.4415044536762257
Lemma: shock
Okapi Weight (Un-normalized):   0.4679739792058453
Lemma: similarity
Okapi Weight (Un-normalized):   0.5407343510019046
Lemma: standard
Okapi Weight (Un-normalized):   0.49061645217941174
Lemma: supersonic
Okapi Weight (Un-normalized):   0.43432781380672253
Lemma: surface
Okapi Weight (Un-normalized):   0.42956836939292714
Lemma: tangent
Okapi Weight (Un-normalized):   0.6121023933674943
Lemma: taylor
Okapi Weight (Un-normalized):   0.49151150951718825
Lemma: than
Okapi Weight (Un-normalized):   0.4679739792058453
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4720953788204944
Lemma: these
Okapi Weight (Un-normalized):   0.42343237834763037
Lemma: three
Okapi Weight (Un-normalized):   0.4491119985031861
Lemma: tn
Okapi Weight (Un-normalized):   0.4491119985031861
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: value
Okapi Weight (Un-normalized):   0.4585495988058517
Lemma: wide
Okapi Weight (Un-normalized):   0.4718212882838759
Lemma: widely
Okapi Weight (Un-normalized):   0.5201848215723388
Lemma: within
Okapi Weight (Un-normalized):   0.45470798425112746
Lemma: zero
Okapi Weight (Un-normalized):   0.4491119985031861

Rank#: 4
Cosine Similarity: 0.16541895974253865
Doc#: 248  Document Headline:  the application of lighthill formula for numerical calculation of pressure distributions on bodies of revolution at supersonic speed and zero angle of attack .
Document Vector: 
Lemma: angle
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: application
Okapi Weight (Un-normalized):   0.4676121750238917
Lemma: apply
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: approximation
Okapi Weight (Un-normalized):   0.4676121750238917
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5115028389174765
Lemma: base
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: body
Okapi Weight (Un-normalized):   0.4734202638412025
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculation
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: computing
Okapi Weight (Un-normalized):   0.5822003748016761
Lemma: could
Okapi Weight (Un-normalized):   0.49511640526800915
Lemma: determine
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: develop
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: digital
Okapi Weight (Un-normalized):   0.592521682047553
Lemma: distribution
Okapi Weight (Un-normalized):   0.4622058606722087
Lemma: drag
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: duct
Okapi Weight (Un-normalized):   0.5462757040441376
Lemma: exact
Okapi Weight (Un-normalized):   0.47892766477897036
Lemma: expect
Okapi Weight (Un-normalized):   0.5094038442332117
Lemma: expression
Okapi Weight (Un-normalized):   0.5215157460259929
Lemma: external
Okapi Weight (Un-normalized):   0.49060517785028723
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: formulum
Okapi Weight (Un-normalized):   0.5056693732148829
Lemma: from
Okapi Weight (Un-normalized):   0.43110293033610436
Lemma: give
Okapi Weight (Un-normalized):   0.43671013192060126
Lemma: good
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: integral
Okapi Weight (Un-normalized):   0.48531706585250844
Lemma: lighthill
Okapi Weight (Un-normalized):   0.6003944227108395
Lemma: linearize
Okapi Weight (Un-normalized):   0.5478909347358035
Lemma: mach
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: method
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: much
Okapi Weight (Un-normalized):   0.49368490870108395
Lemma: number
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: numerical
Okapi Weight (Un-normalized):   0.49330879100831304
Lemma: ohmanl
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: pointed
Okapi Weight (Un-normalized):   0.5157382468525161
Lemma: pressure
Okapi Weight (Un-normalized):   0.43110293033610436
Lemma: procedure
Okapi Weight (Un-normalized):   0.4833311105560195
Lemma: range
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: result
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: revolution
Okapi Weight (Un-normalized):   0.5530784969019606
Lemma: saab
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: show
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: slender
Okapi Weight (Un-normalized):   0.4833311105560195
Lemma: speed
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: supersonic
Okapi Weight (Un-normalized):   0.47221876778072513
Lemma: surface
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: than
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: theory
Okapi Weight (Un-normalized):   0.4492969782452679
Lemma: thickness
Okapi Weight (Un-normalized):   0.46398779938938134
Lemma: tn
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: various
Okapi Weight (Un-normalized):   0.46398779938938134
Lemma: wave
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: wider
Okapi Weight (Un-normalized):   0.5490635179109395
Lemma: zero
Okapi Weight (Un-normalized):   0.5033216981168295

Rank#: 5
Cosine Similarity: 0.16151877990547736
Doc#: 69  Document Headline:  predicted shock envelopes about two types of vehicles at large angles of attack .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.48290913703111427
Lemma: agreement
Okapi Weight (Un-normalized):   0.45580938673939086
Lemma: angle
Okapi Weight (Un-normalized):   0.4910840264521281
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: atmosphere
Okapi Weight (Un-normalized):   0.48865218355076584
Lemma: attack
Okapi Weight (Un-normalized):   0.5263201377793592
Lemma: available
Okapi Weight (Un-normalized):   0.4812575541118376
Lemma: base
Okapi Weight (Un-normalized):   0.45138829108356315
Lemma: be
Okapi Weight (Un-normalized):   0.4618168457361295
Lemma: between
Okapi Weight (Un-normalized):   0.4461592447789424
Lemma: body
Okapi Weight (Un-normalized):   0.43975940932932434
Lemma: capable
Okapi Weight (Un-normalized):   0.5762174026483173
Lemma: capsule
Okapi Weight (Un-normalized):   0.6077669902912621
Lemma: choose
Okapi Weight (Un-normalized):   0.5127661405307387
Lemma: compare
Okapi Weight (Un-normalized):   0.45138829108356315
Lemma: consider
Okapi Weight (Un-normalized):   0.4461592447789424
Lemma: continuity
Okapi Weight (Un-normalized):   0.5481278762972757
Lemma: datum
Okapi Weight (Un-normalized):   0.45138829108356315
Lemma: depend
Okapi Weight (Un-normalized):   0.48444754440415116
Lemma: develop
Okapi Weight (Un-normalized):   0.45138829108356315
Lemma: drag
Okapi Weight (Un-normalized):   0.49810593931766256
Lemma: effect
Okapi Weight (Un-normalized):   0.4198797046646622
Lemma: element
Okapi Weight (Un-normalized):   0.5127661405307387
Lemma: entry
Okapi Weight (Un-normalized):   0.5019686315183333
Lemma: envelope
Okapi Weight (Un-normalized):   0.6771033384911058
Lemma: essentially
Okapi Weight (Un-normalized):   0.5027765821671263
Lemma: experimental
Okapi Weight (Un-normalized):   0.43975940932932434
Lemma: find
Okapi Weight (Un-normalized):   0.43975940932932434
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: good
Okapi Weight (Un-normalized):   0.4660389494436046
Lemma: high
Okapi Weight (Un-normalized):   0.5008189329829905
Lemma: important
Okapi Weight (Un-normalized):   0.48289687750246413
Lemma: kaattarige
Okapi Weight (Un-normalized):   0.5762174026483173
Lemma: large
Okapi Weight (Un-normalized):   0.45580938673939086
Lemma: lift
Okapi Weight (Un-normalized):   0.4660389494436046
Lemma: mach
Okapi Weight (Un-normalized):   0.431508586418901
Lemma: mass
Okapi Weight (Un-normalized):   0.48591865410826673
Lemma: measure
Okapi Weight (Un-normalized):   0.4687724788861037
Lemma: method
Okapi Weight (Un-normalized):   0.431508586418901
Lemma: most
Okapi Weight (Un-normalized):   0.4776678311978434
Lemma: nasa
Okapi Weight (Un-normalized):   0.46301717283780197
Lemma: no
Okapi Weight (Un-normalized):   0.4660389494436046
Lemma: normal
Okapi Weight (Un-normalized):   0.4687724788861037
Lemma: number
Okapi Weight (Un-normalized):   0.4198797046646622
Lemma: oblique
Okapi Weight (Un-normalized):   0.5280838138685787
Lemma: occur
Okapi Weight (Un-normalized):   0.4687724788861037
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.4461592447789424
Lemma: other
Okapi Weight (Un-normalized):   0.45138829108356315
Lemma: predict
Okapi Weight (Un-normalized):   0.5170518281725076
Lemma: provide
Okapi Weight (Un-normalized):   0.4687724788861037
Lemma: range
Okapi Weight (Un-normalized):   0.45906566097481355
Lemma: realga
Okapi Weight (Un-normalized):   0.6077669902912621
Lemma: relationship
Okapi Weight (Un-normalized):   0.5127661405307387
Lemma: shape
Okapi Weight (Un-normalized):   0.45580938673939086
Lemma: shock
Okapi Weight (Un-normalized):   0.4967653096112158
Lemma: slender
Okapi Weight (Un-normalized):   0.4776678311978434
Lemma: speed
Okapi Weight (Un-normalized):   0.43975940932932434
Lemma: suitably
Okapi Weight (Un-normalized):   0.5680075809619378
Lemma: temperature
Okapi Weight (Un-normalized):   0.4461592447789424
Lemma: through
Okapi Weight (Un-normalized):   0.46301717283780197
Lemma: tnd
Okapi Weight (Un-normalized):   0.47951881865864865
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: triangular
Okapi Weight (Un-normalized):   0.5230518841566075
Lemma: two
Okapi Weight (Un-normalized):   0.44680842886269423
Lemma: type
Okapi Weight (Un-normalized):   0.5094927016029953
Lemma: vehicle
Okapi Weight (Un-normalized):   0.5547681856935688
Lemma: volume
Okapi Weight (Un-normalized):   0.5164549321143399
Lemma: wing
Okapi Weight (Un-normalized):   0.45138829108356315
 ***************************** 
Processing Query:  papers on internal /slip flow/ heat transfer studies  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.16672312985998833
Doc#: 550  Document Headline:  laminar heat transfer in tubes under slip-flow conditions .
Document Vector: 
Lemma: analysis
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: analytically
Okapi Weight (Un-normalized):   0.532160247643959
Lemma: asme
Okapi Weight (Un-normalized):   0.532160247643959
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: both
Okapi Weight (Un-normalized):   0.4856899403849529
Lemma: carry
Okapi Weight (Un-normalized):   0.4866840444949625
Lemma: case
Okapi Weight (Un-normalized):   0.4329480649862619
Lemma: characteristic
Okapi Weight (Un-normalized):   0.4583590541538808
Lemma: condition
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: consideration
Okapi Weight (Un-normalized):   0.48121610775002915
Lemma: continuum
Okapi Weight (Un-normalized):   0.5452801798928955
Lemma: creep
Okapi Weight (Un-normalized):   0.510631786331083
Lemma: decrease
Okapi Weight (Un-normalized):   0.48121610775002915
Lemma: density
Okapi Weight (Un-normalized):   0.4831516580897544
Lemma: develop
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: effect
Okapi Weight (Un-normalized):   0.4361697472505237
Lemma: extension
Okapi Weight (Un-normalized):   0.49771233907859247
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.4583590541538808
Lemma: flux
Okapi Weight (Un-normalized):   0.532160247643959
Lemma: free
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: fully
Okapi Weight (Un-normalized):   0.514823333801907
Lemma: give
Okapi Weight (Un-normalized):   0.42078791452243863
Lemma: have
Okapi Weight (Un-normalized):   0.4329480649862619
Lemma: heat
Okapi Weight (Un-normalized):   0.4839835523259659
Lemma: include
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: increase
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: jump
Okapi Weight (Un-normalized):   0.6333162707951714
Lemma: laminar
Okapi Weight (Un-normalized):   0.47087307645561843
Lemma: linsh
Okapi Weight (Un-normalized):   0.617258883248731
Lemma: low
Okapi Weight (Un-normalized):   0.4658961299725239
Lemma: lower
Okapi Weight (Un-normalized):   0.4866840444949625
Lemma: major
Okapi Weight (Un-normalized):   0.5120950336625814
Lemma: make
Okapi Weight (Un-normalized):   0.4329480649862619
Lemma: manifest
Okapi Weight (Un-normalized):   0.5689908404849637
Lemma: mean
Okapi Weight (Un-normalized):   0.49531180855357776
Lemma: modification
Okapi Weight (Un-normalized):   0.510631786331083
Lemma: move
Okapi Weight (Un-normalized):   0.49403541927946837
Lemma: number
Okapi Weight (Un-normalized):   0.42078791452243863
Lemma: nusselt
Okapi Weight (Un-normalized):   0.5512554521914703
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: out
Okapi Weight (Un-normalized):   0.4719143687844536
Lemma: paper
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: path
Okapi Weight (Un-normalized):   0.5141641727362911
Lemma: phenomenon
Okapi Weight (Un-normalized):   0.4927022833068922
Lemma: rarefaction
Okapi Weight (Un-normalized):   0.5756830542038538
Lemma: regime
Okapi Weight (Un-normalized):   0.514823333801907
Lemma: result
Okapi Weight (Un-normalized):   0.42078791452243863
Lemma: shear
Okapi Weight (Un-normalized):   0.4791469686763194
Lemma: slip
Okapi Weight (Un-normalized):   0.6299510491390964
Lemma: sparrowem
Okapi Weight (Un-normalized):   0.5964709687262923
Lemma: study
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: temperature
Okapi Weight (Un-normalized):   0.4839835523259659
Lemma: than
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: thermal
Okapi Weight (Un-normalized):   0.4831516580897544
Lemma: those
Okapi Weight (Un-normalized):   0.4658961299725239
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.47890177363886216
Lemma: tube
Okapi Weight (Un-normalized):   0.5563230468270133
Lemma: under
Okapi Weight (Un-normalized):   0.4583590541538808
Lemma: uniform
Okapi Weight (Un-normalized):   0.5055935203766759
Lemma: velocity
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: wa
Okapi Weight (Un-normalized):   0.5964709687262923
Lemma: wall
Okapi Weight (Un-normalized):   0.511890352003061
Lemma: wherein
Okapi Weight (Un-normalized):   0.5588998290948501
Lemma: work
Okapi Weight (Un-normalized):   0.47452389403113915

Rank#: 2
Cosine Similarity: 0.16198098342388856
Doc#: 21  Document Headline:  on heat transfer in slip flow .
Document Vector: 
Lemma: analysis
Okapi Weight (Un-normalized):   0.4525028097553898
Lemma: author
Okapi Weight (Un-normalized):   0.5050056195107796
Lemma: boundary
Okapi Weight (Un-normalized):   0.4360283210638159
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: cleveland
Okapi Weight (Un-normalized):   0.632697339394573
Lemma: consider
Okapi Weight (Un-normalized):   0.48365517088969623
Lemma: effect
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: eg
Okapi Weight (Un-normalized):   0.5744105587869557
Lemma: flat
Okapi Weight (Un-normalized):   0.4736970106943238
Lemma: flight
Okapi Weight (Un-normalized):   0.48720527939347785
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: friction
Okapi Weight (Un-normalized):   0.5073016419681958
Lemma: heat
Okapi Weight (Un-normalized):   0.48365517088969623
Lemma: impulsive
Okapi Weight (Un-normalized):   0.632697339394573
Lemma: infinite
Okapi Weight (Un-normalized):   0.5134566842711727
Lemma: laboratory
Okapi Weight (Un-normalized):   0.532422432389942
Lemma: laminar
Okapi Weight (Un-normalized):   0.48365517088969623
Lemma: layer
Okapi Weight (Un-normalized):   0.45710353785009034
Lemma: lewi
Okapi Weight (Un-normalized):   0.5956047597258897
Lemma: maslen
Okapi Weight (Un-normalized):   0.632697339394573
Lemma: motion
Okapi Weight (Un-normalized):   0.4908149400675471
Lemma: naca
Okapi Weight (Un-normalized):   0.4736970106943238
Lemma: number
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: ohio
Okapi Weight (Un-normalized):   0.6134050998431914
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: other
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: over
Okapi Weight (Un-normalized):   0.46095387451578296
Lemma: perturbation
Okapi Weight (Un-normalized):   0.5550641765935677
Lemma: plate
Okapi Weight (Un-normalized):   0.4931318589139062
Lemma: propulsion
Okapi Weight (Un-normalized):   0.5668946717042302
Lemma: reference
Okapi Weight (Un-normalized):   0.5750248990143719
Lemma: skin
Okapi Weight (Un-normalized):   0.5025613668381779
Lemma: slip
Okapi Weight (Un-normalized):   0.6290519248022866
Lemma: stephen
Okapi Weight (Un-normalized):   0.6743589743589744
Lemma: studiesdash
Okapi Weight (Un-normalized):   0.6743589743589744
Lemma: transfer
Okapi Weight (Un-normalized):   0.4931318589139062
Lemma: usual
Okapi Weight (Un-normalized):   0.5377654699242023
Lemma: while
Okapi Weight (Un-normalized):   0.5275288259912411

Rank#: 3
Cosine Similarity: 0.1561598041234874
Doc#: 45  Document Headline:  an investigation of separated flows, part ii: flow in the cavity and heat transfer .
Document Vector: 
Lemma: across
Okapi Weight (Un-normalized):   0.4966119983678929
Lemma: ae
Okapi Weight (Un-normalized):   0.439002087246861
Lemma: and
Okapi Weight (Un-normalized):   0.49374843804835866
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: basis
Okapi Weight (Un-normalized):   0.4842821083157283
Lemma: boundary
Okapi Weight (Un-normalized):   0.4348364578906273
Lemma: cavity
Okapi Weight (Un-normalized):   0.6460395379963924
Lemma: charwataf
Okapi Weight (Un-normalized):   0.5728608806931113
Lemma: depth
Okapi Weight (Un-normalized):   0.6118293181164904
Lemma: describe
Okapi Weight (Un-normalized):   0.49228581235488533
Lemma: diffusion
Okapi Weight (Un-normalized):   0.505817825693729
Lemma: external
Okapi Weight (Un-normalized):   0.48283901974883403
Lemma: finally
Okapi Weight (Un-normalized):   0.500026371870365
Lemma: first
Okapi Weight (Un-normalized):   0.4585031308702915
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluctuation
Okapi Weight (Un-normalized):   0.5222088777088184
Lemma: formulate
Okapi Weight (Un-normalized):   0.517871993398816
Lemma: free
Okapi Weight (Un-normalized):   0.4752558386010474
Lemma: from
Okapi Weight (Un-normalized):   0.41950104362343055
Lemma: geometry
Okapi Weight (Un-normalized):   0.49374843804835866
Lemma: heat
Okapi Weight (Un-normalized):   0.48970570211756737
Lemma: ii
Okapi Weight (Un-normalized):   0.5295621293845957
Lemma: in
Okapi Weight (Un-normalized):   0.49374843804835866
Lemma: include
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: internal
Okapi Weight (Un-normalized):   0.5493284698538624
Lemma: investigation
Okapi Weight (Un-normalized):   0.4452800210688673
Lemma: layer
Okapi Weight (Un-normalized):   0.45521447941459586
Lemma: length
Okapi Weight (Un-normalized):   0.4721624363693443
Lemma: local
Okapi Weight (Un-normalized):   0.4699105101149258
Lemma: mach
Okapi Weight (Un-normalized):   0.4461429061774427
Lemma: measurement
Okapi Weight (Un-normalized):   0.4585031308702915
Lemma: model
Okapi Weight (Un-normalized):   0.45474635080149767
Lemma: notch
Okapi Weight (Un-normalized):   0.6580624522195738
Lemma: number
Okapi Weight (Un-normalized):   0.4291129324236048
Lemma: observation
Okapi Weight (Un-normalized):   0.5549369329897395
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: oncome
Okapi Weight (Un-normalized):   0.5585295027406565
Lemma: paper
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: part
Okapi Weight (Un-normalized):   0.5043687710246523
Lemma: picture
Okapi Weight (Un-normalized):   0.5314656417877253
Lemma: place
Okapi Weight (Un-normalized):   0.505155817292993
Lemma: portion
Okapi Weight (Un-normalized):   0.49056004213773463
Lemma: possible
Okapi Weight (Un-normalized):   0.4699105101149258
Lemma: ratio
Okapi Weight (Un-normalized):   0.46967291578125453
Lemma: region
Okapi Weight (Un-normalized):   0.5159024290826529
Lemma: sc
Okapi Weight (Un-normalized):   0.439002087246861
Lemma: second
Okapi Weight (Un-normalized):   0.4721624363693443
Lemma: separate
Okapi Weight (Un-normalized):   0.5815696750061384
Lemma: shear
Okapi Weight (Un-normalized):   0.47424739442492814
Lemma: simple
Okapi Weight (Un-normalized):   0.45474635080149767
Lemma: source
Okapi Weight (Un-normalized):   0.5044778553568547
Lemma: sparkschlieren
Okapi Weight (Un-normalized):   0.6038095238095238
Lemma: stream
Okapi Weight (Un-normalized):   0.45040946649149527
Lemma: structure
Okapi Weight (Un-normalized):   0.4761884439369321
Lemma: study
Okapi Weight (Un-normalized):   0.46759813571892517
Lemma: systematically
Okapi Weight (Un-normalized):   0.5728608806931113
Lemma: thermal
Okapi Weight (Un-normalized):   0.478004174493722
Lemma: these
Okapi Weight (Un-normalized):   0.4309084228680648
Lemma: thickness
Okapi Weight (Un-normalized):   0.4873387972708143
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: tomomentum
Okapi Weight (Un-normalized):   0.6038095238095238
Lemma: transfer
Okapi Weight (Un-normalized):   0.49005093730522314
Lemma: turbulent
Okapi Weight (Un-normalized):   0.4674625269073207
Lemma: vary
Okapi Weight (Un-normalized):   0.4618168457361295
Lemma: visualization
Okapi Weight (Un-normalized):   0.5585295027406565
Lemma: wall
Okapi Weight (Un-normalized):   0.45474635080149767

Rank#: 4
Cosine Similarity: 0.15199323325243114
Doc#: 270  Document Headline:  on combined free and forced convection laminar magnetohydrodynamic flow and heat transfer in channels with transverse magnetic field .
Document Vector: 
Lemma: application
Okapi Weight (Un-normalized):   0.452134689175049
Lemma: attention
Okapi Weight (Un-normalized):   0.48631089681998213
Lemma: attract
Okapi Weight (Un-normalized):   0.5718875502008032
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: case
Okapi Weight (Un-normalized):   0.44971652699629144
Lemma: channel
Okapi Weight (Un-normalized):   0.6579197788362567
Lemma: combine
Okapi Weight (Un-normalized):   0.5718747028478066
Lemma: concern
Okapi Weight (Un-normalized):   0.5387413739584792
Lemma: conduct
Okapi Weight (Un-normalized):   0.49734830070281943
Lemma: convection
Okapi Weight (Un-normalized):   0.5443048575016317
Lemma: convective
Okapi Weight (Un-normalized):   0.5895983553393721
Lemma: design
Okapi Weight (Un-normalized):   0.4546346328730223
Lemma: devel
Okapi Weight (Un-normalized):   0.5718875502008032
Lemma: develop
Okapi Weight (Un-normalized):   0.4660935772937399
Lemma: due
Okapi Weight (Un-normalized):   0.452134689175049
Lemma: effect
Okapi Weight (Un-normalized):   0.41644666329686914
Lemma: electrically
Okapi Weight (Un-normalized):   0.55282999754153
Lemma: engineering
Okapi Weight (Un-normalized):   0.5497797045716172
Lemma: establish
Okapi Weight (Un-normalized):   0.4798975777294523
Lemma: etc
Okapi Weight (Un-normalized):   0.5075473432110487
Lemma: example
Okapi Weight (Un-normalized):   0.4568961070302705
Lemma: except
Okapi Weight (Un-normalized):   0.47730654939149686
Lemma: expect
Okapi Weight (Un-normalized):   0.4843595907340428
Lemma: field
Okapi Weight (Un-normalized):   0.5217071187064952
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.47177981478656306
Lemma: force
Okapi Weight (Un-normalized):   0.5217071187064952
Lemma: free
Okapi Weight (Un-normalized):   0.49905790358590774
Lemma: fully
Okapi Weight (Un-normalized):   0.5412291160810135
Lemma: future
Okapi Weight (Un-normalized):   0.5075473432110487
Lemma: general
Okapi Weight (Un-normalized):   0.4660935772937399
Lemma: generator
Okapi Weight (Un-normalized):   0.5196679681996773
Lemma: gershunus
Okapi Weight (Un-normalized):   0.5718875502008032
Lemma: hartmann
Okapi Weight (Un-normalized):   0.5389942236070651
Lemma: have
Okapi Weight (Un-normalized):   0.44052509137748347
Lemma: heat
Okapi Weight (Un-normalized):   0.4728333955916249
Lemma: however
Okapi Weight (Un-normalized):   0.4589606711812627
Lemma: hydrodynamic
Okapi Weight (Un-normalized):   0.5075473432110487
Lemma: include
Okapi Weight (Un-normalized):   0.4660935772937399
Lemma: information
Okapi Weight (Un-normalized):   0.48147999862352414
Lemma: int
Okapi Weight (Un-normalized):   0.5336995806246501
Lemma: laminar
Okapi Weight (Un-normalized):   0.4593681857926877
Lemma: large
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: limit
Okapi Weight (Un-normalized):   0.4672251250885082
Lemma: magnetic
Okapi Weight (Un-normalized):   0.6080900856741771
Lemma: magneto
Okapi Weight (Un-normalized):   0.5389942236070651
Lemma: magnetohydrodynamic
Okapi Weight (Un-normalized):   0.5510302490026839
Lemma: moriy
Okapi Weight (Un-normalized):   0.5554408869039341
Lemma: need
Okapi Weight (Un-normalized):   0.4875279594667605
Lemma: no
Okapi Weight (Un-normalized):   0.4546346328730223
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: ostrach
Okapi Weight (Un-normalized):   0.5457862849219012
Lemma: other
Okapi Weight (Un-normalized):   0.4425140078843936
Lemma: paper
Okapi Weight (Un-normalized):   0.4425140078843936
Lemma: papers
Okapi Weight (Un-normalized):   0.522547560310196
Lemma: particular
Okapi Weight (Un-normalized):   0.4589606711812627
Lemma: pattern
Okapi Weight (Un-normalized):   0.47820203376257353
Lemma: plasma
Okapi Weight (Un-normalized):   0.5257159290429136
Lemma: publish
Okapi Weight (Un-normalized):   0.4886856290422832
Lemma: report
Okapi Weight (Un-normalized):   0.49166206320999634
Lemma: researcher
Okapi Weight (Un-normalized):   0.5718875502008032
Lemma: special
Okapi Weight (Un-normalized):   0.47108129616989136
Lemma: study
Okapi Weight (Un-normalized):   0.4821494982674915
Lemma: tao
Okapi Weight (Un-normalized):   0.5554408869039341
Lemma: temperature
Okapi Weight (Un-normalized):   0.4381879695761532
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.48108416312249025
Lemma: transverse
Okapi Weight (Un-normalized):   0.5622153458752036
Lemma: treatment
Okapi Weight (Un-normalized):   0.48367178838537733
Lemma: vary
Okapi Weight (Un-normalized):   0.452134689175049
Lemma: vertical
Okapi Weight (Un-normalized):   0.5568381806309942
Lemma: wall
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: without
Okapi Weight (Un-normalized):   0.4685813524719181
Lemma: zhukhovitskius
Okapi Weight (Un-normalized):   0.5718875502008032

Rank#: 5
Cosine Similarity: 0.14727608805422762
Doc#: 22  Document Headline:  on slip-flow heat transfer to a flat plate .
Document Vector: 
Lemma: account
Okapi Weight (Un-normalized):   0.49620147210941695
Lemma: ae
Okapi Weight (Un-normalized):   0.44707148460828056
Lemma: aero
Okapi Weight (Un-normalized):   0.49195157026871117
Lemma: appropriate
Okapi Weight (Un-normalized):   0.516600687685388
Lemma: assume
Okapi Weight (Un-normalized):   0.4706072269124208
Lemma: behavior
Okapi Weight (Un-normalized):   0.5049560333991825
Lemma: boundary
Okapi Weight (Un-normalized):   0.43338493881185114
Lemma: condition
Okapi Weight (Un-normalized):   0.44707148460828056
Lemma: confirm
Okapi Weight (Un-normalized):   0.5586654297438064
Lemma: continuum
Okapi Weight (Un-normalized):   0.5644838818327609
Lemma: energy
Okapi Weight (Un-normalized):   0.4896089243059478
Lemma: equation
Okapi Weight (Un-normalized):   0.43730326897869887
Lemma: expression
Okapi Weight (Un-normalized):   0.49195157026871117
Lemma: find
Okapi Weight (Un-normalized):   0.44707148460828056
Lemma: flat
Okapi Weight (Un-normalized):   0.49372337229604224
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.4660731820018076
Lemma: free
Okapi Weight (Un-normalized):   0.4608390112828391
Lemma: from
Okapi Weight (Un-normalized):   0.42353574230414026
Lemma: gas
Okapi Weight (Un-normalized):   0.4746065379573977
Lemma: gradient
Okapi Weight (Un-normalized):   0.4843747535869794
Lemma: heat
Okapi Weight (Un-normalized):   0.4546483012900123
Lemma: influence
Okapi Weight (Un-normalized):   0.4870925956181742
Lemma: into
Okapi Weight (Un-normalized):   0.4706072269124208
Lemma: jump
Okapi Weight (Un-normalized):   0.5799038294924453
Lemma: june
Okapi Weight (Un-normalized):   0.5753697845818322
Lemma: knudsen
Okapi Weight (Un-normalized):   0.5989055268859724
Lemma: large
Okapi Weight (Un-normalized):   0.4660731820018076
Lemma: layer
Okapi Weight (Un-normalized):   0.43730326897869887
Lemma: maslen
Okapi Weight (Un-normalized):   0.6086252008365137
Lemma: mean
Okapi Weight (Un-normalized):   0.5079104958911197
Lemma: move
Okapi Weight (Un-normalized):   0.5064653884945705
Lemma: number
Okapi Weight (Un-normalized):   0.42353574230414026
Lemma: omanra
Okapi Weight (Un-normalized):   0.6459770114942529
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: path
Okapi Weight (Un-normalized):   0.52925483924741
Lemma: plate
Okapi Weight (Un-normalized):   0.4862988149175055
Lemma: rarefy
Okapi Weight (Un-normalized):   0.5712489889754002
Lemma: region
Okapi Weight (Un-normalized):   0.5001548164355534
Lemma: remains
Okapi Weight (Un-normalized):   0.5456821157256387
Lemma: result
Okapi Weight (Un-normalized):   0.42353574230414026
Lemma: sc
Okapi Weight (Un-normalized):   0.44707148460828056
Lemma: scheuingra
Okapi Weight (Un-normalized):   0.6459770114942529
Lemma: sci
Okapi Weight (Un-normalized):   0.6224412691901127
Lemma: slip
Okapi Weight (Un-normalized):   0.6684079256274217
Lemma: small
Okapi Weight (Un-normalized):   0.4546483012900123
Lemma: solution
Okapi Weight (Un-normalized):   0.43730326897869887
Lemma: take
Okapi Weight (Un-normalized):   0.48142029109504225
Lemma: temperature
Okapi Weight (Un-normalized):   0.4775174273733327
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: then
Okapi Weight (Un-normalized):   0.48142029109504225
Lemma: through
Okapi Weight (Un-normalized):   0.4746065379573977
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.4608390112828391
Lemma: valid
Okapi Weight (Un-normalized):   0.5143361888197334
Lemma: value
Okapi Weight (Un-normalized):   0.44707148460828056
Lemma: well
Okapi Weight (Un-normalized):   0.4706072269124208
 ***************************** 
Processing Query:  are real-gas transport properties for air available over a wide range of enthalpies and densities  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.16652394221132835
Doc#: 302  Document Headline:  approximations for the thermodynamic and transport properties of high temperature air .
Document Vector: 
Lemma: air
Okapi Weight (Un-normalized):   0.5291767827900506
Lemma: approximate
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: approximation
Okapi Weight (Un-normalized):   0.4665719877158318
Lemma: atmosphere
Okapi Weight (Un-normalized):   0.4936530759561937
Lemma: become
Okapi Weight (Un-normalized):   0.4975261992252527
Lemma: can
Okapi Weight (Un-normalized):   0.44200224780431185
Lemma: close
Okapi Weight (Un-normalized):   0.49224360241337495
Lemma: coefficient
Okapi Weight (Un-normalized):   0.45428711776007186
Lemma: compare
Okapi Weight (Un-normalized):   0.45428711776007186
Lemma: complete
Okapi Weight (Un-normalized):   0.49224360241337495
Lemma: component
Okapi Weight (Un-normalized):   0.5645851909007872
Lemma: compressibility
Okapi Weight (Un-normalized):   0.5785911725988165
Lemma: conductivity
Okapi Weight (Un-normalized):   0.5240513412748541
Lemma: degree
Okapi Weight (Un-normalized):   0.5257000461604897
Lemma: energy
Okapi Weight (Un-normalized):   0.479958732457615
Lemma: enthalpy
Okapi Weight (Un-normalized):   0.5636630431080603
Lemma: entropy
Okapi Weight (Un-normalized):   0.5395284470295646
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.4858413135745567
Lemma: find
Okapi Weight (Un-normalized):   0.46150516887489973
Lemma: flux
Okapi Weight (Un-normalized):   0.5335157373633842
Lemma: form
Okapi Weight (Un-normalized):   0.4487630996126264
Lemma: fraction
Okapi Weight (Un-normalized):   0.5373296844079545
Lemma: from
Okapi Weight (Un-normalized):   0.4400510431385859
Lemma: fully
Okapi Weight (Un-normalized):   0.5160010090203881
Lemma: function
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: hansen
Okapi Weight (Un-normalized):   0.5984860555850235
Lemma: heat
Okapi Weight (Un-normalized):   0.4714052897957107
Lemma: high
Okapi Weight (Un-normalized):   0.4794942775710689
Lemma: ionize
Okapi Weight (Un-normalized):   0.5564838077807117
Lemma: major
Okapi Weight (Un-normalized):   0.5658276968575358
Lemma: minor
Okapi Weight (Un-normalized):   0.5395284470295646
Lemma: mol
Okapi Weight (Un-normalized):   0.6194871794871795
Lemma: nasa
Okapi Weight (Un-normalized):   0.4665719877158318
Lemma: neglect
Okapi Weight (Un-normalized):   0.5040436905500385
Lemma: number
Okapi Weight (Un-normalized):   0.43075258443744985
Lemma: order
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: over
Okapi Weight (Un-normalized):   0.4487630996126264
Lemma: partition
Okapi Weight (Un-normalized):   0.6194871794871795
Lemma: prandtl
Okapi Weight (Un-normalized):   0.5371390473951771
Lemma: predict
Okapi Weight (Un-normalized):   0.4697642235147823
Lemma: pressure
Okapi Weight (Un-normalized):   0.42100112390215594
Lemma: property
Okapi Weight (Un-normalized):   0.5102468620085188
Lemma: range
Okapi Weight (Un-normalized):   0.44200224780431185
Lemma: small
Okapi Weight (Un-normalized):   0.4487630996126264
Lemma: sound
Okapi Weight (Un-normalized):   0.5102123759393618
Lemma: specific
Okapi Weight (Un-normalized):   0.4975261992252527
Lemma: speed
Okapi Weight (Un-normalized):   0.44200224780431185
Lemma: start
Okapi Weight (Un-normalized):   0.520292767167975
Lemma: tabulate
Okapi Weight (Un-normalized):   0.583816805553705
Lemma: temperature
Okapi Weight (Un-normalized):   0.4714052897957107
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: thermal
Okapi Weight (Un-normalized):   0.4840044956086237
Lemma: thermodynamic
Okapi Weight (Un-normalized):   0.576148357429951
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: tr
Okapi Weight (Un-normalized):   0.5395284470295646
Lemma: transparent
Okapi Weight (Un-normalized):   0.5984860555850235
Lemma: transport
Okapi Weight (Un-normalized):   0.583816805553705
Lemma: unity
Okapi Weight (Un-normalized):   0.5117664713190941
Lemma: value
Okapi Weight (Un-normalized):   0.44200224780431185
Lemma: viscosity
Okapi Weight (Un-normalized):   0.4936530759561937

Rank#: 2
Cosine Similarity: 0.14403478378881962
Doc#: 493  Document Headline:  real-gas laminar boundary layer skin friction and heat transfer .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: agreement
Okapi Weight (Un-normalized):   0.4368485053471619
Lemma: analogy
Okapi Weight (Un-normalized):   0.47330655591658727
Lemma: approximate
Okapi Weight (Un-normalized):   0.4368485053471619
Lemma: assume
Okapi Weight (Un-normalized):   0.43937710731654234
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: average
Okapi Weight (Un-normalized):   0.5087005668241337
Lemma: be
Okapi Weight (Un-normalized):   0.4493594585725749
Lemma: before
Okapi Weight (Un-normalized):   0.4812457953085293
Lemma: best
Okapi Weight (Un-normalized):   0.484568159156818
Lemma: blunt
Okapi Weight (Un-normalized):   0.44360263969673897
Lemma: body
Okapi Weight (Un-normalized):   0.44273272167916944
Lemma: both
Okapi Weight (Un-normalized):   0.4368485053471619
Lemma: boundary
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: btu
Okapi Weight (Un-normalized):   0.5067025499215957
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: can
Okapi Weight (Un-normalized):   0.44273272167916944
Lemma: carry
Okapi Weight (Un-normalized):   0.45473319476124235
Lemma: case
Okapi Weight (Un-normalized):   0.4543312120727701
Lemma: coefficient
Okapi Weight (Un-normalized):   0.46984889418542963
Lemma: computation
Okapi Weight (Un-normalized):   0.4656285121942373
Lemma: compute
Okapi Weight (Un-normalized):   0.5058531460378652
Lemma: computing
Okapi Weight (Un-normalized):   0.5824313004985097
Lemma: condition
Okapi Weight (Un-normalized):   0.44273272167916944
Lemma: consider
Okapi Weight (Un-normalized):   0.4304769372578915
Lemma: correspond
Okapi Weight (Un-normalized):   0.4968701349832916
Lemma: diffusion
Okapi Weight (Un-normalized):   0.47122353652462534
Lemma: digital
Okapi Weight (Un-normalized):   0.4812457953085293
Lemma: each
Okapi Weight (Un-normalized):   0.4499742077860094
Lemma: effect
Okapi Weight (Un-normalized):   0.4131257024388475
Lemma: enthalpy
Okapi Weight (Un-normalized):   0.595563466764716
Lemma: equation
Okapi Weight (Un-normalized):   0.4338648807076188
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.4536508209840979
Lemma: excellent
Okapi Weight (Un-normalized):   0.4858310527549715
Lemma: exception
Okapi Weight (Un-normalized):   0.49780237986294484
Lemma: extend
Okapi Weight (Un-normalized):   0.4834760342265517
Lemma: factor
Okapi Weight (Un-normalized):   0.48733420598454896
Lemma: find
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: flat
Okapi Weight (Un-normalized):   0.4368485053471619
Lemma: free
Okapi Weight (Un-normalized):   0.48861039031708153
Lemma: friction
Okapi Weight (Un-normalized):   0.5272932026390764
Lemma: from
Okapi Weight (Un-normalized):   0.42136636083958473
Lemma: ft
Okapi Weight (Un-normalized):   0.5152141998166705
Lemma: gas
Okapi Weight (Un-normalized):   0.5086624241455402
Lemma: heat
Okapi Weight (Un-normalized):   0.4627413781672722
Lemma: high
Okapi Weight (Un-normalized):   0.4552312415472035
Lemma: if
Okapi Weight (Un-normalized):   0.4470551510388924
Lemma: integrate
Okapi Weight (Un-normalized):   0.46985404457443386
Lemma: johnson
Okapi Weight (Un-normalized):   0.5371794871794872
Lemma: laminar
Okapi Weight (Un-normalized):   0.4496111535189329
Lemma: layer
Okapi Weight (Un-normalized):   0.4493594585725749
Lemma: local
Okapi Weight (Un-normalized):   0.4765976023867883
Lemma: low
Okapi Weight (Un-normalized):   0.4677297614152376
Lemma: machine
Okapi Weight (Un-normalized):   0.5656208323191154
Lemma: method
Okapi Weight (Un-normalized):   0.4338648807076188
Lemma: neglect
Okapi Weight (Un-normalized):   0.46502730659377406
Lemma: obtain
Okapi Weight (Un-normalized):   0.44282765338756774
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: out
Okapi Weight (Un-normalized):   0.44540747003377357
Lemma: over
Okapi Weight (Un-normalized):   0.4496111535189329
Lemma: percent
Okapi Weight (Un-normalized):   0.45765225150835936
Lemma: perfectga
Okapi Weight (Un-normalized):   0.5371794871794872
Lemma: plate
Okapi Weight (Un-normalized):   0.4339294486000449
Lemma: point
Okapi Weight (Un-normalized):   0.4339294486000449
Lemma: pr
Okapi Weight (Un-normalized):   0.5163486696972864
Lemma: present
Okapi Weight (Un-normalized):   0.4131257024388475
Lemma: range
Okapi Weight (Un-normalized):   0.4622847020672305
Lemma: rate
Okapi Weight (Un-normalized):   0.4416074923223949
Lemma: real
Okapi Weight (Un-normalized):   0.5466244065697564
Lemma: recovery
Okapi Weight (Un-normalized):   0.5223848152926355
Lemma: replace
Okapi Weight (Un-normalized):   0.4751829794799844
Lemma: result
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: review
Okapi Weight (Un-normalized):   0.46502730659377406
Lemma: reynold
Okapi Weight (Un-normalized):   0.4368485053471619
Lemma: rubesin
Okapi Weight (Un-normalized):   0.49780237986294484
Lemma: sc
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: sec
Okapi Weight (Un-normalized):   0.5322540250587537
Lemma: skin
Okapi Weight (Un-normalized):   0.5216697583783707
Lemma: slender
Okapi Weight (Un-normalized):   0.45128068341908895
Lemma: slug
Okapi Weight (Un-normalized):   0.5371794871794872
Lemma: solution
Okapi Weight (Un-normalized):   0.4208037461611975
Lemma: speed
Okapi Weight (Un-normalized):   0.4540424815957238
Lemma: stream
Okapi Weight (Un-normalized):   0.48861039031708153
Lemma: temperature
Okapi Weight (Un-normalized):   0.4304769372578915
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: then
Okapi Weight (Un-normalized):   0.44540747003377357
Lemma: thermodynamic
Okapi Weight (Un-normalized):   0.4751829794799844
Lemma: these
Okapi Weight (Un-normalized):   0.4208037461611975
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.46984889418542963
Lemma: travel
Okapi Weight (Un-normalized):   0.5419550287170353
Lemma: up
Okapi Weight (Un-normalized):   0.48976261896513407
Lemma: use
Okapi Weight (Un-normalized):   0.4270212407978619
Lemma: value
Okapi Weight (Un-normalized):   0.4540424815957238
Lemma: velocity
Okapi Weight (Un-normalized):   0.4540424815957238
Lemma: wall
Okapi Weight (Un-normalized):   0.4368485053471619
Lemma: which
Okapi Weight (Un-normalized):   0.47208442958028635
Lemma: wide
Okapi Weight (Un-normalized):   0.5037973748937405
Lemma: wilsonre
Okapi Weight (Un-normalized):   0.5371794871794872
Lemma: within
Okapi Weight (Un-normalized):   0.44857087063321255

Rank#: 3
Cosine Similarity: 0.13211481462170604
Doc#: 1010  Document Headline:  free-flight measurements of the static and dynamic
Document Vector: 
Lemma: absolute
Okapi Weight (Un-normalized):   0.5350009218816056
Lemma: air
Okapi Weight (Un-normalized):   0.4811534141292789
Lemma: also
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.5156297174848115
Lemma: assume
Okapi Weight (Un-normalized):   0.4867222881136086
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: be
Okapi Weight (Un-normalized):   0.46525571852171854
Lemma: become
Okapi Weight (Un-normalized):   0.5342419448159361
Lemma: btu
Okapi Weight (Un-normalized):   0.5570339413940465
Lemma: calculate
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: calculation
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: chart
Okapi Weight (Un-normalized):   0.5596719771221812
Lemma: chemical
Okapi Weight (Un-normalized):   0.5517040939400627
Lemma: density
Okapi Weight (Un-normalized):   0.47726828605510196
Lemma: dynamic
Okapi Weight (Un-normalized):   0.5269706056748809
Lemma: enthalpy
Okapi Weight (Un-normalized):   0.5028040656001102
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.5571742361224277
Lemma: flight
Okapi Weight (Un-normalized):   0.4641699225725592
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fraction
Okapi Weight (Un-normalized):   0.526317398394109
Lemma: free
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: from
Okapi Weight (Un-normalized):   0.4193170715137755
Lemma: frozen
Okapi Weight (Un-normalized):   0.6637083115161917
Lemma: inch
Okapi Weight (Un-normalized):   0.507885120028185
Lemma: include
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: mach
Okapi Weight (Un-normalized):   0.43061683397308304
Lemma: make
Okapi Weight (Un-normalized):   0.43061683397308304
Lemma: mass
Okapi Weight (Un-normalized):   0.48348699408633466
Lemma: measurement
Okapi Weight (Un-normalized):   0.4579512145413265
Lemma: molecular
Okapi Weight (Un-normalized):   0.6231836380755121
Lemma: normal
Okapi Weight (Un-normalized):   0.4668260879742328
Lemma: nozzle
Okapi Weight (Un-normalized):   0.5415897606422434
Lemma: number
Okapi Weight (Un-normalized):   0.42890742937120285
Lemma: one
Okapi Weight (Un-normalized):   0.4448528510587837
Lemma: other
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: per
Okapi Weight (Un-normalized):   0.5181580433908604
Lemma: poind
Okapi Weight (Un-normalized):   0.6018867924528302
Lemma: point
Okapi Weight (Un-normalized):   0.4747246209168048
Lemma: pound
Okapi Weight (Un-normalized):   0.5439355779115037
Lemma: pressure
Okapi Weight (Un-normalized):   0.4346400116995147
Lemma: property
Okapi Weight (Un-normalized):   0.5241831429673024
Lemma: range
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: reaction
Okapi Weight (Un-normalized):   0.5587553554991718
Lemma: reservoir
Okapi Weight (Un-normalized):   0.5519130461539291
Lemma: reynold
Okapi Weight (Un-normalized):   0.45422987579393637
Lemma: shock
Okapi Weight (Un-normalized):   0.4448528510587837
Lemma: square
Okapi Weight (Un-normalized):   0.4907987301815222
Lemma: stagnation
Okapi Weight (Un-normalized):   0.49602840177917096
Lemma: static
Okapi Weight (Un-normalized):   0.4754696850318667
Lemma: temperature
Okapi Weight (Un-normalized):   0.4448528510587837
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: through
Okapi Weight (Un-normalized):   0.46123366794616605
Lemma: throughout
Okapi Weight (Un-normalized):   0.5090227736313429
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: two
Okapi Weight (Un-normalized):   0.43061683397308304
Lemma: type
Okapi Weight (Un-normalized):   0.4972468073447656
Lemma: up
Okapi Weight (Un-normalized):   0.49602840177917096
Lemma: velocity
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: vibration
Okapi Weight (Un-normalized):   0.5404317425032961
Lemma: wave
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: weight
Okapi Weight (Un-normalized):   0.499867810973717

Rank#: 4
Cosine Similarity: 0.13089298203780902
Doc#: 524  Document Headline:  stagnation point heat transfer in partially ionized air .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.4525028097553898
Lemma: air
Okapi Weight (Un-normalized):   0.4736970106943238
Lemma: base
Okapi Weight (Un-normalized):   0.4931318589139062
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: comparison
Okapi Weight (Un-normalized):   0.48720527939347785
Lemma: datum
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: fenstersj
Okapi Weight (Un-normalized):   0.6481075694812795
Lemma: ft
Okapi Weight (Un-normalized):   0.5415559078944135
Lemma: hansen
Okapi Weight (Un-normalized):   0.6481075694812795
Lemma: heat
Okapi Weight (Un-normalized):   0.49551254444214204
Lemma: ionize
Okapi Weight (Un-normalized):   0.5956047597258897
Lemma: lower
Okapi Weight (Un-normalized):   0.5094663895224847
Lemma: obtain
Okapi Weight (Un-normalized):   0.4416074923223949
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: partially
Okapi Weight (Un-normalized):   0.5800316357466309
Lemma: peng
Okapi Weight (Un-normalized):   0.7765395894428153
Lemma: pindroh
Okapi Weight (Un-normalized):   0.7765395894428153
Lemma: point
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: property
Okapi Weight (Un-normalized):   0.5291601799777221
Lemma: range
Okapi Weight (Un-normalized):   0.4525028097553898
Lemma: rate
Okapi Weight (Un-normalized):   0.5303949089746482
Lemma: recently
Okapi Weight (Un-normalized):   0.536755469492596
Lemma: report
Okapi Weight (Un-normalized):   0.49411030207778467
Lemma: rozyckirc
Okapi Weight (Un-normalized):   0.6743589743589744
Lemma: sc
Okapi Weight (Un-normalized):   0.4525028097553898
Lemma: sec
Okapi Weight (Un-normalized):   0.5624915906170586
Lemma: show
Okapi Weight (Un-normalized):   0.4416074923223949
Lemma: stagnation
Okapi Weight (Un-normalized):   0.48720527939347785
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: thermodynamic
Okapi Weight (Un-normalized):   0.5503659589599688
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.5063324683804978
Lemma: transport
Okapi Weight (Un-normalized):   0.6153513601721559
Lemma: use
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: velocity
Okapi Weight (Un-normalized):   0.4525028097553898

Rank#: 5
Cosine Similarity: 0.12657053519302863
Doc#: 1264  Document Headline:  boundary layer transition and heat transfer in shock tubes .
Document Vector: 
Lemma: achieve
Okapi Weight (Un-normalized):   0.4834233826043327
Lemma: ae
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: air
Okapi Weight (Un-normalized):   0.44371381622933276
Lemma: also
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: appear
Okapi Weight (Un-normalized):   0.4622847020672305
Lemma: argon
Okapi Weight (Un-normalized):   0.5132978101966527
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: base
Okapi Weight (Un-normalized):   0.4402509048030951
Lemma: both
Okapi Weight (Un-normalized):   0.44371381622933276
Lemma: boundary
Okapi Weight (Un-normalized):   0.43028510472332265
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: characteristic
Okapi Weight (Un-normalized):   0.44371381622933276
Lemma: comparison
Okapi Weight (Un-normalized):   0.45172632541970553
Lemma: cool
Okapi Weight (Un-normalized):   0.46839354551562024
Lemma: correlate
Okapi Weight (Un-normalized):   0.4798689661322306
Lemma: correlation
Okapi Weight (Un-normalized):   0.4713932558367103
Lemma: datum
Okapi Weight (Un-normalized):   0.4782858600402022
Lemma: dependence
Okapi Weight (Un-normalized):   0.5578380797024559
Lemma: determine
Okapi Weight (Un-normalized):   0.45688218000675257
Lemma: distance
Okapi Weight (Un-normalized):   0.45582208031990273
Lemma: do
Okapi Weight (Un-normalized):   0.4592849917461404
Lemma: effect
Okapi Weight (Un-normalized):   0.41557117551680767
Lemma: exist
Okapi Weight (Un-normalized):   0.49065271169030295
Lemma: experiment
Okapi Weight (Un-normalized):   0.4493594585725749
Lemma: experimental
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: experimentally
Okapi Weight (Un-normalized):   0.4771426602937548
Lemma: find
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: follow
Okapi Weight (Un-normalized):   0.46493063408938257
Lemma: from
Okapi Weight (Un-normalized):   0.41557117551680767
Lemma: gas
Okapi Weight (Un-normalized):   0.4493594585725749
Lemma: hartunianra
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: heat
Okapi Weight (Un-normalized):   0.4703198355136888
Lemma: higher
Okapi Weight (Un-normalized):   0.4576201963405411
Lemma: include
Okapi Weight (Un-normalized):   0.46332594992949555
Lemma: increase
Okapi Weight (Un-normalized):   0.4402509048030951
Lemma: independent
Okapi Weight (Un-normalized):   0.474856167262948
Lemma: indicate
Okapi Weight (Un-normalized):   0.46332594992949555
Lemma: laminar
Okapi Weight (Un-normalized):   0.45688218000675257
Lemma: largely
Okapi Weight (Un-normalized):   0.5003242040187347
Lemma: larger
Okapi Weight (Un-normalized):   0.5256562597773279
Lemma: layer
Okapi Weight (Un-normalized):   0.44800075531687955
Lemma: length
Okapi Weight (Un-normalized):   0.4576201963405411
Lemma: level
Okapi Weight (Un-normalized):   0.47785587758403814
Lemma: lower
Okapi Weight (Un-normalized):   0.46493063408938257
Lemma: mach
Okapi Weight (Un-normalized):   0.4388281284284762
Lemma: make
Okapi Weight (Un-normalized):   0.4246797292862875
Lemma: manner
Okapi Weight (Un-normalized):   0.4704371771789174
Lemma: marronepv
Okapi Weight (Un-normalized):   0.5471664670687437
Lemma: measurement
Okapi Weight (Un-normalized):   0.4467135265504229
Lemma: moderate
Okapi Weight (Un-normalized):   0.48286867645332077
Lemma: not
Okapi Weight (Un-normalized):   0.4361551499028979
Lemma: number
Okapi Weight (Un-normalized):   0.44297562739925217
Lemma: obtain
Okapi Weight (Un-normalized):   0.4246797292862875
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: operate
Okapi Weight (Un-normalized):   0.4798689661322306
Lemma: over
Okapi Weight (Un-normalized):   0.4361551499028979
Lemma: phenomenon
Okapi Weight (Un-normalized):   0.4694385924390029
Lemma: pressure
Okapi Weight (Un-normalized):   0.41557117551680767
Lemma: range
Okapi Weight (Un-normalized):   0.44899564300203876
Lemma: rate
Okapi Weight (Un-normalized):   0.47765625685695234
Lemma: real
Okapi Weight (Un-normalized):   0.48449332089613345
Lemma: regime
Okapi Weight (Un-normalized):   0.486008352695725
Lemma: report
Okapi Weight (Un-normalized):   0.45582208031990273
Lemma: responsible
Okapi Weight (Un-normalized):   0.5315952915519361
Lemma: result
Okapi Weight (Un-normalized):   0.4244978215010194
Lemma: reversal
Okapi Weight (Un-normalized):   0.5110113171658459
Lemma: reynold
Okapi Weight (Un-normalized):   0.5113185616082093
Lemma: russoal
Okapi Weight (Un-normalized):   0.5627376425855514
Lemma: same
Okapi Weight (Un-normalized):   0.4493594585725749
Lemma: sc
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: shock
Okapi Weight (Un-normalized):   0.49978631665373474
Lemma: specifically
Okapi Weight (Un-normalized):   0.5224546227552584
Lemma: stabilization
Okapi Weight (Un-normalized):   0.5315952915519361
Lemma: stabilize
Okapi Weight (Un-normalized):   0.5067868257660625
Lemma: strength
Okapi Weight (Un-normalized):   0.5076022081990516
Lemma: study
Okapi Weight (Un-normalized):   0.45688218000675257
Lemma: substantiate
Okapi Weight (Un-normalized):   0.5190238263562186
Lemma: tendency
Okapi Weight (Un-normalized):   0.5265824926826534
Lemma: term
Okapi Weight (Un-normalized):   0.4467135265504229
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4246797292862875
Lemma: these
Okapi Weight (Un-normalized):   0.4246797292862875
Lemma: those
Okapi Weight (Un-normalized):   0.4493594585725749
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.4782858600402022
Lemma: transition
Okapi Weight (Un-normalized):   0.5719025095970087
Lemma: tube
Okapi Weight (Un-normalized):   0.5484213228201505
Lemma: turbulent
Okapi Weight (Un-normalized):   0.48474853828835907
Lemma: unit
Okapi Weight (Un-normalized):   0.5480744882178545
Lemma: up
Okapi Weight (Un-normalized):   0.45172632541970553
Lemma: value
Okapi Weight (Un-normalized):   0.43114235103361526
Lemma: wall
Okapi Weight (Un-normalized):   0.46877407977057534
Lemma: weak
Okapi Weight (Un-normalized):   0.49411832172529035
Lemma: wide
Okapi Weight (Un-normalized):   0.4756444747324472
Lemma: within
Okapi Weight (Un-normalized):   0.4576201963405411
 ***************************** 
Processing Query:  is it possible to find an analytical,  similar solution of the strong blast wave problem in the newtonian approximation  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.2531335285054022
Doc#: 495  Document Headline:  on similar solutions for strong blast waves and their application to steady hypersonic flow .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.4468025046962332
Lemma: application
Okapi Weight (Un-normalized):   0.505398140226689
Lemma: apply
Okapi Weight (Un-normalized):   0.46049135978979433
Lemma: approximation
Okapi Weight (Un-normalized):   0.505398140226689
Lemma: blast
Okapi Weight (Un-normalized):   0.6528998910135991
Lemma: body
Okapi Weight (Un-normalized):   0.4468025046962332
Lemma: borcheref
Okapi Weight (Un-normalized):   0.6445714285714286
Lemma: busemann
Okapi Weight (Un-normalized):   0.584031804483617
Lemma: case
Okapi Weight (Un-normalized):   0.43709010744167776
Lemma: constitute
Okapi Weight (Un-normalized):   0.5902354032887878
Lemma: density
Okapi Weight (Un-normalized):   0.49360500939246643
Lemma: equivalence
Okapi Weight (Un-normalized):   0.5743676715270788
Lemma: expression
Okapi Weight (Un-normalized):   0.49142613272431857
Lemma: find
Okapi Weight (Un-normalized):   0.46649882264011483
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: formulum
Okapi Weight (Un-normalized):   0.564724110884364
Lemma: general
Okapi Weight (Un-normalized):   0.46049135978979433
Lemma: higher
Okapi Weight (Un-normalized):   0.48659492364321316
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.49974823396017226
Lemma: ie
Okapi Weight (Un-normalized):   0.5327418568533266
Lemma: improvement
Okapi Weight (Un-normalized):   0.5487746787763423
Lemma: investigate
Okapi Weight (Un-normalized):   0.4741802148833555
Lemma: law
Okapi Weight (Un-normalized):   0.5099961759913298
Lemma: layer
Okapi Weight (Un-normalized):   0.43709010744167776
Lemma: neglect
Okapi Weight (Un-normalized):   0.5159343980414715
Lemma: newton
Okapi Weight (Un-normalized):   0.6074330568317337
Lemma: newtonian
Okapi Weight (Un-normalized):   0.5159343980414715
Lemma: obtain
Okapi Weight (Un-normalized):   0.43709010744167776
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: order
Okapi Weight (Un-normalized):   0.493342898524881
Lemma: power
Okapi Weight (Un-normalized):   0.49142613272431857
Lemma: pressure
Okapi Weight (Un-normalized):   0.43324941132005745
Lemma: principle
Okapi Weight (Un-normalized):   0.5261869807515915
Lemma: profile
Okapi Weight (Un-normalized):   0.48389261213791096
Lemma: result
Okapi Weight (Un-normalized):   0.4234012523481166
Lemma: sc
Okapi Weight (Un-normalized):   0.4468025046962332
Lemma: shock
Okapi Weight (Un-normalized):   0.45433602528264083
Lemma: show
Okapi Weight (Un-normalized):   0.43709010744167776
Lemma: similar
Okapi Weight (Un-normalized):   0.48389261213791096
Lemma: simple
Okapi Weight (Un-normalized):   0.493342898524881
Lemma: solution
Okapi Weight (Un-normalized):   0.45269907011334454
Lemma: steady
Okapi Weight (Un-normalized):   0.48659492364321316
Lemma: strong
Okapi Weight (Un-normalized):   0.5983733922717627
Lemma: temperature
Okapi Weight (Un-normalized):   0.45433602528264083
Lemma: term
Okapi Weight (Un-normalized):   0.4702037570443498
Lemma: thin
Okapi Weight (Un-normalized):   0.4777372776307574
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: upon
Okapi Weight (Un-normalized):   0.49758146723147206
Lemma: use
Okapi Weight (Un-normalized):   0.4234012523481166
Lemma: velocity
Okapi Weight (Un-normalized):   0.4468025046962332
Lemma: wave
Okapi Weight (Un-normalized):   0.49997260405973354

Rank#: 2
Cosine Similarity: 0.16178853041850022
Doc#: 472  Document Headline:  waves in supersonic flow .
Document Vector: 
Lemma: allow
Okapi Weight (Un-normalized):   0.5242560333096649
Lemma: analyze
Okapi Weight (Un-normalized):   0.500896960284297
Lemma: approach
Okapi Weight (Un-normalized):   0.486143385796878
Lemma: be
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: boundary
Okapi Weight (Un-normalized):   0.4226255202260796
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: case
Okapi Weight (Un-normalized):   0.4514459878649427
Lemma: chapter
Okapi Weight (Un-normalized):   0.6005568229036098
Lemma: condition
Okapi Weight (Un-normalized):   0.4452510404521592
Lemma: consider
Okapi Weight (Un-normalized):   0.4525348310743765
Lemma: construct
Okapi Weight (Un-normalized):   0.5325398674892488
Lemma: correspond
Okapi Weight (Un-normalized):   0.48111164156980335
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4584861213437238
Lemma: exist
Okapi Weight (Un-normalized):   0.48372437368818955
Lemma: fact
Okapi Weight (Un-normalized):   0.5242560333096649
Lemma: field
Okapi Weight (Un-normalized):   0.4678765606782388
Lemma: find
Okapi Weight (Un-normalized):   0.46491760889173694
Lemma: first
Okapi Weight (Un-normalized):   0.4678765606782388
Lemma: fit
Okapi Weight (Un-normalized):   0.5646260998990036
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: helpful
Okapi Weight (Un-normalized):   0.6138385681717105
Lemma: indirect
Okapi Weight (Un-normalized):   0.6138385681717105
Lemma: influence
Okapi Weight (Un-normalized):   0.48372437368818955
Lemma: limited
Okapi Weight (Un-normalized):   0.5160526966451748
Lemma: mainly
Okapi Weight (Un-normalized):   0.5367575614019412
Lemma: may
Okapi Weight (Un-normalized):   0.47536700996931686
Lemma: method
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: not
Okapi Weight (Un-normalized):   0.4525348310743765
Lemma: plane
Okapi Weight (Un-normalized):   0.486143385796878
Lemma: possible
Okapi Weight (Un-normalized):   0.48111164156980335
Lemma: problem
Okapi Weight (Un-normalized):   0.4452510404521592
Lemma: procedure
Okapi Weight (Un-normalized):   0.48839543219202064
Lemma: shall
Okapi Weight (Un-normalized):   0.6761852901498216
Lemma: simple
Okapi Weight (Un-normalized):   0.46351786557079844
Lemma: solution
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: stationary
Okapi Weight (Un-normalized):   0.5276951823748325
Lemma: steady
Okapi Weight (Un-normalized):   0.5201118491748664
Lemma: step
Okapi Weight (Un-normalized):   0.5761300665443838
Lemma: study
Okapi Weight (Un-normalized):   0.4525348310743765
Lemma: subsonic
Okapi Weight (Un-normalized):   0.48111164156980335
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4881351594440363
Lemma: system
Okapi Weight (Un-normalized):   0.49050208090431835
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: then
Okapi Weight (Un-normalized):   0.4782714400582174
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: two
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: under
Okapi Weight (Un-normalized):   0.46351786557079844
Lemma: upstream
Okapi Weight (Un-normalized):   0.5169722426874476
Lemma: use
Okapi Weight (Un-normalized):   0.4226255202260796
Lemma: very
Okapi Weight (Un-normalized):   0.4782714400582174
Lemma: wave
Okapi Weight (Un-normalized):   0.49811935290311643
Lemma: we
Okapi Weight (Un-normalized):   0.5991995054310812

Rank#: 3
Cosine Similarity: 0.1605316346439036
Doc#: 72  Document Headline:  boundary layer behind shock or thin expansion wave moving into stationary fluid .
Document Vector: 
Lemma: account
Okapi Weight (Un-normalized):   0.45732553475013205
Lemma: accurate
Okapi Weight (Un-normalized):   0.463441704102929
Lemma: accurately
Okapi Weight (Un-normalized):   0.4868105758091135
Lemma: advance
Okapi Weight (Un-normalized):   0.485961497444168
Lemma: agree
Okapi Weight (Un-normalized):   0.463441704102929
Lemma: also
Okapi Weight (Un-normalized):   0.44508498158811455
Lemma: analytical
Okapi Weight (Un-normalized):   0.46160103585824697
Lemma: analytically
Okapi Weight (Un-normalized):   0.4891629068008901
Lemma: as
Okapi Weight (Un-normalized):   0.4980143679414397
Lemma: assume
Okapi Weight (Un-normalized):   0.46762747238217184
Lemma: assumption
Okapi Weight (Un-normalized):   0.4502781065895014
Lemma: be
Okapi Weight (Un-normalized):   0.43572900258143266
Lemma: become
Okapi Weight (Un-normalized):   0.46512879742782287
Lemma: behind
Okapi Weight (Un-normalized):   0.5532844348698293
Lemma: blasius
Okapi Weight (Un-normalized):   0.4903604988250932
Lemma: boundary
Okapi Weight (Un-normalized):   0.44384602956017566
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: can
Okapi Weight (Un-normalized):   0.42804944630767405
Lemma: case
Okapi Weight (Un-normalized):   0.4447982509360755
Lemma: compressibility
Okapi Weight (Un-normalized):   0.4814465450379306
Lemma: compressible
Okapi Weight (Un-normalized):   0.45189764259439147
Lemma: consider
Okapi Weight (Un-normalized):   0.43256439871391145
Lemma: consideration
Okapi Weight (Un-normalized):   0.45479305899573885
Lemma: datum
Okapi Weight (Un-normalized):   0.43625338343566444
Lemma: determine
Okapi Weight (Un-normalized):   0.46562825139582764
Lemma: distance
Okapi Weight (Un-normalized):   0.48081398416954724
Lemma: employ
Okapi Weight (Un-normalized):   0.4606138450215854
Lemma: equation
Okapi Weight (Un-normalized):   0.42222866028182743
Lemma: except
Okapi Weight (Un-normalized):   0.46592236574822843
Lemma: expansion
Okapi Weight (Un-normalized):   0.5478933900015093
Lemma: expression
Okapi Weight (Un-normalized):   0.488071045284894
Lemma: find
Okapi Weight (Un-normalized):   0.42804944630767405
Lemma: flat
Okapi Weight (Un-normalized):   0.43937237557641956
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.4793486219438885
Lemma: form
Okapi Weight (Un-normalized):   0.43256439871391145
Lemma: friction
Okapi Weight (Un-normalized):   0.45732553475013205
Lemma: function
Okapi Weight (Un-normalized):   0.43937237557641956
Lemma: greater
Okapi Weight (Un-normalized):   0.4606138450215854
Lemma: guide
Okapi Weight (Un-normalized):   0.4891629068008901
Lemma: have
Okapi Weight (Un-normalized):   0.42222866028182743
Lemma: heat
Okapi Weight (Un-normalized):   0.43256439871391145
Lemma: infinite
Okapi Weight (Un-normalized):   0.4606138450215854
Lemma: integral
Okapi Weight (Un-normalized):   0.4901699631762291
Lemma: integration
Okapi Weight (Un-normalized):   0.5071870077442979
Lemma: into
Okapi Weight (Un-normalized):   0.46762747238217184
Lemma: investigate
Okapi Weight (Un-normalized):   0.44445732056365483
Lemma: karman
Okapi Weight (Un-normalized):   0.471936774290331
Lemma: laminar
Okapi Weight (Un-normalized):   0.46562825139582764
Lemma: layer
Okapi Weight (Un-normalized):   0.46949431265838976
Lemma: less
Okapi Weight (Un-normalized):   0.45732553475013205
Lemma: method
Okapi Weight (Un-normalized):   0.42222866028182743
Lemma: mirelsh
Okapi Weight (Un-normalized):   0.5243177566628541
Lemma: move
Okapi Weight (Un-normalized):   0.463441704102929
Lemma: naca
Okapi Weight (Un-normalized):   0.43937237557641956
Lemma: numerical
Okapi Weight (Un-normalized):   0.48479364827059124
Lemma: obtain
Okapi Weight (Un-normalized):   0.42222866028182743
Lemma: over
Okapi Weight (Un-normalized):   0.43256439871391145
Lemma: parameter
Okapi Weight (Un-normalized):   0.44445732056365483
Lemma: percent
Okapi Weight (Un-normalized):   0.46160103585824697
Lemma: permit
Okapi Weight (Un-normalized):   0.471936774290331
Lemma: plate
Okapi Weight (Un-normalized):   0.43625338343566444
Lemma: pohlhausen
Okapi Weight (Un-normalized):   0.4821565616971028
Lemma: present
Okapi Weight (Un-normalized):   0.41402472315383704
Lemma: problem
Okapi Weight (Un-normalized):   0.44508498158811455
Lemma: profile
Okapi Weight (Un-normalized):   0.4502781065895014
Lemma: progressively
Okapi Weight (Un-normalized):   0.5072029668893339
Lemma: provide
Okapi Weight (Un-normalized):   0.44851757072101833
Lemma: relate
Okapi Weight (Un-normalized):   0.4770217192775662
Lemma: relative
Okapi Weight (Un-normalized):   0.471936774290331
Lemma: represent
Okapi Weight (Un-normalized):   0.45732553475013205
Lemma: semus
Okapi Weight (Un-normalized):   0.47463856817542244
Lemma: seventhpower
Okapi Weight (Un-normalized):   0.5465753424657535
Lemma: shock
Okapi Weight (Un-normalized):   0.45234204270346134
Lemma: similar
Okapi Weight (Un-normalized):   0.4502781065895014
Lemma: skin
Okapi Weight (Un-normalized):   0.45479305899573885
Lemma: solution
Okapi Weight (Un-normalized):   0.43572900258143266
Lemma: solve
Okapi Weight (Un-normalized):   0.5155302954933643
Lemma: stationary
Okapi Weight (Un-normalized):   0.5272265762009799
Lemma: strong
Okapi Weight (Un-normalized):   0.471936774290331
Lemma: surface
Okapi Weight (Un-normalized):   0.44508498158811455
Lemma: temperature
Okapi Weight (Un-normalized):   0.46562825139582764
Lemma: than
Okapi Weight (Un-normalized):   0.43256439871391145
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: thermal
Okapi Weight (Un-normalized):   0.45609889261534803
Lemma: thickness
Okapi Weight (Un-normalized):   0.48479364827059124
Lemma: thin
Okapi Weight (Un-normalized):   0.49389280081935805
Lemma: those
Okapi Weight (Un-normalized):   0.44445732056365483
Lemma: tn
Okapi Weight (Un-normalized):   0.44658912186774846
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.43625338343566444
Lemma: turbulent
Okapi Weight (Un-normalized):   0.5226945495138916
Lemma: type
Okapi Weight (Un-normalized):   0.43937237557641956
Lemma: uniform
Okapi Weight (Un-normalized):   0.44851757072101833
Lemma: use
Okapi Weight (Un-normalized):   0.41402472315383704
Lemma: utilize
Okapi Weight (Un-normalized):   0.4761018609441202
Lemma: valid
Okapi Weight (Un-normalized):   0.4681318385432658
Lemma: various
Okapi Weight (Un-normalized):   0.442074169461511
Lemma: vary
Okapi Weight (Un-normalized):   0.44445732056365483
Lemma: velocity
Okapi Weight (Un-normalized):   0.42804944630767405
Lemma: wall
Okapi Weight (Un-normalized):   0.5117737995530578
Lemma: wave
Okapi Weight (Un-normalized):   0.5070192548934862
Lemma: weak
Okapi Weight (Un-normalized):   0.5362556987912919
Lemma: within
Okapi Weight (Un-normalized):   0.45189764259439147

Rank#: 4
Cosine Similarity: 0.14271315817830899
Doc#: 654  Document Headline:  on the propagation and structure of the blast wave .  part 1.
Document Vector: 
Lemma: approximate
Okapi Weight (Un-normalized):   0.4676278451077324
Lemma: approximation
Okapi Weight (Un-normalized):   0.5075818033529327
Lemma: behind
Okapi Weight (Un-normalized):   0.5041131926253115
Lemma: blast
Okapi Weight (Un-normalized):   0.6219278049134069
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: change
Okapi Weight (Un-normalized):   0.4833360626502197
Lemma: continuation
Okapi Weight (Un-normalized):   0.5841368607746206
Lemma: curve
Okapi Weight (Un-normalized):   0.5292150786953169
Lemma: density
Okapi Weight (Un-normalized):   0.49635809790400953
Lemma: discuss
Okapi Weight (Un-normalized):   0.5015713130798786
Lemma: distance
Okapi Weight (Un-normalized):   0.48636004190667304
Lemma: distribution
Okapi Weight (Un-normalized):   0.4481790489520048
Lemma: due
Okapi Weight (Un-normalized):   0.4763619859093365
Lemma: equation
Okapi Weight (Un-normalized):   0.4381809929546683
Lemma: feature
Okapi Weight (Un-normalized):   0.5158068940597372
Lemma: first
Okapi Weight (Un-normalized):   0.47226857342800715
Lemma: front
Okapi Weight (Un-normalized):   0.5298983625384031
Lemma: further
Okapi Weight (Un-normalized):   0.5023305538073832
Lemma: imaus
Okapi Weight (Un-normalized):   0.651764705882353
Lemma: japan
Okapi Weight (Un-normalized):   0.6219278049134069
Lemma: method
Okapi Weight (Un-normalized):   0.4537909016764663
Lemma: now
Okapi Weight (Un-normalized):   0.5411159765620824
Lemma: numerical
Okapi Weight (Un-normalized):   0.47226857342800715
Lemma: obtain
Okapi Weight (Un-normalized):   0.4537909016764663
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: part
Okapi Weight (Un-normalized):   0.540864460679328
Lemma: phy
Okapi Weight (Un-normalized):   0.6004697089662697
Lemma: pressure
Okapi Weight (Un-normalized):   0.4240895244760024
Lemma: propagation
Okapi Weight (Un-normalized):   0.6327480815729924
Lemma: refinement
Okapi Weight (Un-normalized):   0.575278376951292
Lemma: result
Okapi Weight (Un-normalized):   0.4240895244760024
Lemma: sakurium
Okapi Weight (Un-normalized):   0.651764705882353
Lemma: second
Okapi Weight (Un-normalized):   0.4891418331621312
Lemma: shock
Okapi Weight (Un-normalized):   0.4559341436733067
Lemma: soc
Okapi Weight (Un-normalized):   0.5740790449677623
Lemma: solution
Okapi Weight (Un-normalized):   0.46227816548042905
Lemma: structure
Okapi Weight (Un-normalized):   0.5325931482880311
Lemma: time
Okapi Weight (Un-normalized):   0.4763619859093365
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: use
Okapi Weight (Un-normalized):   0.4339382803391194
Lemma: velocity
Okapi Weight (Un-normalized):   0.4481790489520048
Lemma: wave
Okapi Weight (Un-normalized):   0.4877291820155857
Lemma: wkb
Okapi Weight (Un-normalized):   0.6276751814063506

Rank#: 5
Cosine Similarity: 0.14143463119449234
Doc#: 1327  Document Headline:  on the propagation and structure of the blast wave .
Document Vector: 
Lemma: adiabatic
Okapi Weight (Un-normalized):   0.5275933949162441
Lemma: also
Okapi Weight (Un-normalized):   0.44221875423629287
Lemma: appear
Okapi Weight (Un-normalized):   0.48443750847258565
Lemma: approximate
Okapi Weight (Un-normalized):   0.45926151375419855
Lemma: approximation
Okapi Weight (Un-normalized):   0.49785078596422516
Lemma: as
Okapi Weight (Un-normalized):   0.5475267806128886
Lemma: blast
Okapi Weight (Un-normalized):   0.6018539331121943
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: case
Okapi Weight (Un-normalized):   0.45783853388182416
Lemma: characteristic
Okapi Weight (Un-normalized):   0.45926151375419855
Lemma: charge
Okapi Weight (Un-normalized):   0.5423081689454758
Lemma: concern
Okapi Weight (Un-normalized):   0.5145450690499128
Lemma: consider
Okapi Weight (Un-normalized):   0.4490144557961966
Lemma: constant
Okapi Weight (Un-normalized):   0.45926151375419855
Lemma: construct
Okapi Weight (Un-normalized):   0.5236583299770825
Lemma: correspond
Okapi Weight (Un-normalized):   0.4756763253821361
Lemma: cylindrical
Okapi Weight (Un-normalized):   0.517527282632424
Lemma: discuss
Okapi Weight (Un-normalized):   0.4943305858108179
Lemma: distance
Okapi Weight (Un-normalized):   0.4756763253821361
Lemma: distribution
Okapi Weight (Un-normalized):   0.44221875423629287
Lemma: energy
Okapi Weight (Un-normalized):   0.4803708908723449
Lemma: especially
Okapi Weight (Un-normalized):   0.5293853466685415
Lemma: explosion
Okapi Weight (Un-normalized):   0.5783998024647381
Lemma: find
Okapi Weight (Un-normalized):   0.44221875423629287
Lemma: first
Okapi Weight (Un-normalized):   0.4633281313544393
Lemma: fluid
Okapi Weight (Un-normalized):   0.45926151375419855
Lemma: form
Okapi Weight (Un-normalized):   0.4490144557961966
Lemma: from
Okapi Weight (Un-normalized):   0.42110937711814644
Lemma: front
Okapi Weight (Un-normalized):   0.5664526756145365
Lemma: have
Okapi Weight (Un-normalized):   0.4334575711458433
Lemma: hydrodynamical
Okapi Weight (Un-normalized):   0.5995091795828845
Lemma: index
Okapi Weight (Un-normalized):   0.5995091795828845
Lemma: japan
Okapi Weight (Un-normalized):   0.5380375693791294
Lemma: length
Okapi Weight (Un-normalized):   0.4781139775132078
Lemma: numerically
Okapi Weight (Un-normalized):   0.516598952365854
Lemma: obtain
Okapi Weight (Un-normalized):   0.4334575711458433
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: paper
Okapi Weight (Un-normalized):   0.45456694826398975
Lemma: part
Okapi Weight (Un-normalized):   0.4756763253821361
Lemma: phy
Okapi Weight (Un-normalized):   0.5246907811783327
Lemma: plane
Okapi Weight (Un-normalized):   0.517527282632424
Lemma: power
Okapi Weight (Un-normalized):   0.4824720269420399
Lemma: propagation
Okapi Weight (Un-normalized):   0.6116954912799579
Lemma: publish
Okapi Weight (Un-normalized):   0.5138284620181882
Lemma: quantity
Okapi Weight (Un-normalized):   0.5099683156744585
Lemma: related
Okapi Weight (Un-normalized):   0.5064840177980977
Lemma: represent
Okapi Weight (Un-normalized):   0.4862837945723637
Lemma: respectively
Okapi Weight (Un-normalized):   0.5091338965279795
Lemma: sakuraium
Okapi Weight (Un-normalized):   0.6206185567010309
Lemma: second
Okapi Weight (Un-normalized):   0.4781139775132078
Lemma: series
Okapi Weight (Un-normalized):   0.4824720269420399
Lemma: shape
Okapi Weight (Un-normalized):   0.45926151375419855
Lemma: shock
Okapi Weight (Un-normalized):   0.4490144557961966
Lemma: soc
Okapi Weight (Un-normalized):   0.5082759695503951
Lemma: solution
Okapi Weight (Un-normalized):   0.4636349882577804
Lemma: sound
Okapi Weight (Un-normalized):   0.5107804809699771
Lemma: spherical
Okapi Weight (Un-normalized):   0.5653795197859761
Lemma: structure
Okapi Weight (Un-normalized):   0.4824720269420399
Lemma: subsequently
Okapi Weight (Un-normalized):   0.5572904253465917
Lemma: surface
Okapi Weight (Un-normalized):   0.44221875423629287
Lemma: taylor
Okapi Weight (Un-normalized):   0.5306633409085626
Lemma: the
Okapi Weight (Un-normalized):   0.5342039628137109
Lemma: these
Okapi Weight (Un-normalized):   0.4334575711458433
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: undisturbed
Okapi Weight (Un-normalized):   0.5447677070952289
Lemma: use
Okapi Weight (Un-normalized):   0.42110937711814644
Lemma: velocity
Okapi Weight (Un-normalized):   0.461736972275182
Lemma: wave
Okapi Weight (Un-normalized):   0.47979387911970356
 ***************************** 
Processing Query:  how can the aerodynamic performance of channel flow ground effect machines be calculated  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.17640398388094244
Doc#: 624  Document Headline:  cruise performance of channel-flow ground effect machines .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.43033495674755856
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.44550243512133786
Lemma: air
Okapi Weight (Un-normalized):   0.4835788392688454
Lemma: airfoil
Okapi Weight (Un-normalized):   0.4666203795207708
Lemma: almost
Okapi Weight (Un-normalized):   0.49066026397371004
Lemma: along
Okapi Weight (Un-normalized):   0.4503852725384539
Lemma: also
Okapi Weight (Un-normalized):   0.43033495674755856
Lemma: analysis
Okapi Weight (Un-normalized):   0.43033495674755856
Lemma: angle
Okapi Weight (Un-normalized):   0.4392073628267186
Lemma: below
Okapi Weight (Un-normalized):   0.46763833263502874
Lemma: between
Okapi Weight (Un-normalized):   0.4352177941646746
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4392073628267186
Lemma: center
Okapi Weight (Un-normalized):   0.4777982892325061
Lemma: channel
Okapi Weight (Un-normalized):   0.4964280325402219
Lemma: close
Okapi Weight (Un-normalized):   0.5053955222887194
Lemma: coefficient
Okapi Weight (Un-normalized):   0.4620272732219571
Lemma: compare
Okapi Weight (Un-normalized):   0.4392073628267186
Lemma: conclude
Okapi Weight (Un-normalized):   0.47442515699139315
Lemma: condition
Okapi Weight (Un-normalized):   0.43033495674755856
Lemma: consider
Okapi Weight (Un-normalized):   0.4352177941646746
Lemma: conventional
Okapi Weight (Un-normalized):   0.47901427126238877
Lemma: correspond
Okapi Weight (Un-normalized):   0.4543748412004978
Lemma: cruise
Okapi Weight (Un-normalized):   0.5834175761622197
Lemma: cushion
Okapi Weight (Un-normalized):   0.5344473516501977
Lemma: deflection
Okapi Weight (Un-normalized):   0.5000591216728961
Lemma: determine
Okapi Weight (Un-normalized):   0.469127011163295
Lemma: develop
Okapi Weight (Un-normalized):   0.4392073628267186
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4392073628267186
Lemma: drag
Okapi Weight (Un-normalized):   0.498898394401004
Lemma: effect
Okapi Weight (Un-normalized):   0.4151674783737793
Lemma: employ
Okapi Weight (Un-normalized):   0.5037065004666188
Lemma: excessive
Okapi Weight (Un-normalized):   0.5192798732764184
Lemma: exist
Okapi Weight (Un-normalized):   0.45612633939837893
Lemma: expenditure
Okapi Weight (Un-normalized):   0.626785825228982
Lemma: fan
Okapi Weight (Un-normalized):   0.5233007243538439
Lemma: find
Okapi Weight (Un-normalized):   0.43033495674755856
Lemma: flight
Okapi Weight (Un-normalized):   0.4503852725384539
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: ground
Okapi Weight (Un-normalized):   0.5890218631898778
Lemma: height
Okapi Weight (Un-normalized):   0.48126055416644264
Lemma: high
Okapi Weight (Un-normalized):   0.4620272732219571
Lemma: identify
Okapi Weight (Un-normalized):   0.5103604595619247
Lemma: induce
Okapi Weight (Un-normalized):   0.501930825081573
Lemma: jet
Okapi Weight (Un-normalized):   0.49135909860879834
Lemma: large
Okapi Weight (Un-normalized):   0.44258049506783154
Lemma: length
Okapi Weight (Un-normalized):   0.45612633939837893
Lemma: lift
Okapi Weight (Un-normalized):   0.5124299469866326
Lemma: location
Okapi Weight (Un-normalized):   0.46861102814094546
Lemma: lower
Okapi Weight (Un-normalized):   0.4632472472796578
Lemma: machine
Okapi Weight (Un-normalized):   0.4929657676062854
Lemma: maximum
Okapi Weight (Un-normalized):   0.5067292925017849
Lemma: minimum
Okapi Weight (Un-normalized):   0.4758373918688964
Lemma: mixed
Okapi Weight (Un-normalized):   0.5060007238477793
Lemma: moment
Okapi Weight (Un-normalized):   0.45774797344161083
Lemma: mound
Okapi Weight (Un-normalized):   0.65078125
Lemma: need
Okapi Weight (Un-normalized):   0.48072022928601243
Lemma: not
Okapi Weight (Un-normalized):   0.4352177941646746
Lemma: obtainable
Okapi Weight (Un-normalized):   0.5103604595619247
Lemma: operate
Okapi Weight (Un-normalized):   0.4777982892325061
Lemma: optimum
Okapi Weight (Un-normalized):   0.48560306670312847
Lemma: over
Okapi Weight (Un-normalized):   0.4557156509245828
Lemma: overall
Okapi Weight (Un-normalized):   0.49066026397371004
Lemma: penalty
Okapi Weight (Un-normalized):   0.5192798732764184
Lemma: performance
Okapi Weight (Un-normalized):   0.5188780448667432
Lemma: pitch
Okapi Weight (Un-normalized):   0.4666203795207708
Lemma: planform
Okapi Weight (Un-normalized):   0.4895926353651724
Lemma: plus
Okapi Weight (Un-normalized):   0.5192798732764184
Lemma: power
Okapi Weight (Un-normalized):   0.5163135371896621
Lemma: pressure
Okapi Weight (Un-normalized):   0.4297713832377089
Lemma: propeller
Okapi Weight (Un-normalized):   0.48885080005760745
Lemma: propulsion
Okapi Weight (Un-normalized):   0.4964280325402219
Lemma: proximity
Okapi Weight (Un-normalized):   0.5130160833971807
Lemma: range
Okapi Weight (Un-normalized):   0.43033495674755856
Lemma: ratio
Okapi Weight (Un-normalized):   0.45954276647541786
Lemma: rearward
Okapi Weight (Un-normalized):   0.515938023450687
Lemma: rectangular
Okapi Weight (Un-normalized):   0.4704355883293492
Lemma: replace
Okapi Weight (Un-normalized):   0.4868781096213153
Lemma: require
Okapi Weight (Un-normalized):   0.45247085426124944
Lemma: restricted
Okapi Weight (Un-normalized):   0.4837785065147247
Lemma: rise
Okapi Weight (Un-normalized):   0.47514266539725003
Lemma: sc
Okapi Weight (Un-normalized):   0.43033495674755856
Lemma: seal
Okapi Weight (Un-normalized):   0.6813756280708533
Lemma: shape
Okapi Weight (Un-normalized):   0.44258049506783154
Lemma: show
Okapi Weight (Un-normalized):   0.44718652602636705
Lemma: side
Okapi Weight (Un-normalized):   0.5293909470597373
Lemma: speed
Okapi Weight (Un-normalized):   0.447990849542036
Lemma: stagnation
Okapi Weight (Un-normalized):   0.4503852725384539
Lemma: strandt
Okapi Weight (Un-normalized):   0.5233007243538439
Lemma: streamwise
Okapi Weight (Un-normalized):   0.491678217087968
Lemma: surface
Okapi Weight (Un-normalized):   0.45954276647541786
Lemma: system
Okapi Weight (Un-normalized):   0.4606699134951171
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theoretically
Okapi Weight (Un-normalized):   0.48603638870123017
Lemma: theory
Okapi Weight (Un-normalized):   0.43803184845093907
Lemma: thickness
Okapi Weight (Un-normalized):   0.44550243512133786
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: total
Okapi Weight (Un-normalized):   0.4606699134951171
Lemma: two
Okapi Weight (Un-normalized):   0.43803184845093907
Lemma: typical
Okapi Weight (Un-normalized):   0.47901427126238877
Lemma: upper
Okapi Weight (Un-normalized):   0.522075831882572
Lemma: variation
Okapi Weight (Un-normalized):   0.45247085426124944
Lemma: vehicle
Okapi Weight (Un-normalized):   0.5722207683356095
Lemma: volume
Okapi Weight (Un-normalized):   0.48885080005760745
Lemma: zero
Okapi Weight (Un-normalized):   0.4503852725384539

Rank#: 2
Cosine Similarity: 0.15018984573072588
Doc#: 650  Document Headline:  some design problems of hovercraft .
Document Vector: 
Lemma: aero
Okapi Weight (Un-normalized):   0.5019081097245589
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.4782525954316001
Lemma: analysis
Okapi Weight (Un-normalized):   0.4521683969544001
Lemma: angle
Okapi Weight (Un-normalized):   0.46742667492492995
Lemma: consider
Okapi Weight (Un-normalized):   0.4605656332768289
Lemma: cushion
Okapi Weight (Un-normalized):   0.6312151907360088
Lemma: design
Okapi Weight (Un-normalized):   0.486649831754029
Lemma: drag
Okapi Weight (Un-normalized):   0.486649831754029
Lemma: dynamic
Okapi Weight (Un-normalized):   0.5145700794306249
Lemma: each
Okapi Weight (Un-normalized):   0.499311801460095
Lemma: economics
Okapi Weight (Un-normalized):   0.6726114649681529
Lemma: effect
Okapi Weight (Un-normalized):   0.4358705327963831
Lemma: examine
Okapi Weight (Un-normalized):   0.5226072025381064
Lemma: ground
Okapi Weight (Un-normalized):   0.5456792703565301
Lemma: hovercraft
Okapi Weight (Un-normalized):   0.6465272664909528
Lemma: influence
Okapi Weight (Un-normalized):   0.49652300406090644
Lemma: inst
Okapi Weight (Un-normalized):   0.5788849374297734
Lemma: jet
Okapi Weight (Un-normalized):   0.536571849599138
Lemma: jonesr
Okapi Weight (Un-normalized):   0.6726114649681529
Lemma: lift
Okapi Weight (Un-normalized):   0.486649831754029
Lemma: machine
Okapi Weight (Un-normalized):   0.559877434736924
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: operation
Okapi Weight (Un-normalized):   0.5479606684670838
Lemma: optimum
Okapi Weight (Un-normalized):   0.5472154650308578
Lemma: over
Okapi Weight (Un-normalized):   0.4605656332768289
Lemma: paper
Okapi Weight (Un-normalized):   0.46742667492492995
Lemma: parameter
Okapi Weight (Un-normalized):   0.4826849528954599
Lemma: performance
Okapi Weight (Un-normalized):   0.5292262398551434
Lemma: peripheral
Okapi Weight (Un-normalized):   0.6312151907360088
Lemma: power
Okapi Weight (Un-normalized):   0.5019081097245589
Lemma: pressure
Okapi Weight (Un-normalized):   0.4260841984772
Lemma: problem
Okapi Weight (Un-normalized):   0.4521683969544001
Lemma: ratio
Okapi Weight (Un-normalized):   0.47174106559276624
Lemma: related
Okapi Weight (Un-normalized):   0.5315789774065666
Lemma: requirement
Okapi Weight (Un-normalized):   0.5440776863629024
Lemma: sc
Okapi Weight (Un-normalized):   0.4521683969544001
Lemma: simple
Okapi Weight (Un-normalized):   0.473227602982895
Lemma: stability
Okapi Weight (Un-normalized):   0.49351087340213
Lemma: stanton
Okapi Weight (Un-normalized):   0.612045831691324
Lemma: structural
Okapi Weight (Un-normalized):   0.5368879828546214
Lemma: system
Okapi Weight (Un-normalized):   0.5043367939088002
Lemma: then
Okapi Weight (Un-normalized):   0.49023650095883664
Lemma: thickness
Okapi Weight (Un-normalized):   0.4782525954316001
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: various
Okapi Weight (Un-normalized):   0.4782525954316001
Lemma: wave
Okapi Weight (Un-normalized):   0.46742667492492995
Lemma: weight
Okapi Weight (Un-normalized):   0.53485334984986

Rank#: 3
Cosine Similarity: 0.13167434392845032
Doc#: 506  Document Headline:  a note on havelock's shallow-water wave-resistance curves .
Document Vector: 
Lemma: act
Okapi Weight (Un-normalized):   0.5273158502557713
Lemma: additional
Okapi Weight (Un-normalized):   0.514707694248544
Lemma: ae
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: analysis
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: attention
Okapi Weight (Un-normalized):   0.5131127016219765
Lemma: below
Okapi Weight (Un-normalized):   0.4961176305866198
Lemma: between
Okapi Weight (Un-normalized):   0.4500463390761165
Lemma: brandmaierhe
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: can
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: component
Okapi Weight (Un-normalized):   0.4974998820950277
Lemma: computer
Okapi Weight (Un-normalized):   0.5183702212055228
Lemma: contact
Okapi Weight (Un-normalized):   0.5478154482972337
Lemma: continuous
Okapi Weight (Un-normalized):   0.5203770812946065
Lemma: currently
Okapi Weight (Un-normalized):   0.5478154482972337
Lemma: curve
Okapi Weight (Un-normalized):   0.48206290962755216
Lemma: cushion
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: differ
Okapi Weight (Un-normalized):   0.5222622365754324
Lemma: digital
Okapi Weight (Un-normalized):   0.533414148085585
Lemma: due
Okapi Weight (Un-normalized):   0.46832388212940634
Lemma: effect
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: equation
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: estimate
Okapi Weight (Un-normalized):   0.48206290962755216
Lemma: focus
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: from
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: generate
Okapi Weight (Un-normalized):   0.5131127016219765
Lemma: gravity
Okapi Weight (Un-normalized):   0.5478154482972337
Lemma: ground
Okapi Weight (Un-normalized):   0.5203770812946065
Lemma: havelock
Okapi Weight (Un-normalized):   0.7859719438877757
Lemma: however
Okapi Weight (Un-normalized):   0.47726951117965477
Lemma: ibm
Okapi Weight (Un-normalized):   0.5606018027223094
Lemma: improve
Okapi Weight (Un-normalized):   0.5216464632097089
Lemma: land
Okapi Weight (Un-normalized):   0.6037093728372611
Lemma: machine
Okapi Weight (Un-normalized):   0.5321092487036687
Lemma: make
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: means
Okapi Weight (Un-normalized):   0.4797584823029595
Lemma: motion
Okapi Weight (Un-normalized):   0.474563845529144
Lemma: no
Okapi Weight (Un-normalized):   0.47160012413359237
Lemma: note
Okapi Weight (Un-normalized):   0.5084219182439083
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: operate
Okapi Weight (Un-normalized):   0.5105554636461929
Lemma: original
Okapi Weight (Un-normalized):   0.5273158502557713
Lemma: over
Okapi Weight (Un-normalized):   0.4857507413027648
Lemma: performance
Okapi Weight (Un-normalized):   0.5067816824066185
Lemma: physical
Okapi Weight (Un-normalized):   0.500092678152233
Lemma: present
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: pressure
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: purpose
Okapi Weight (Un-normalized):   0.48987766718688214
Lemma: quest
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: resistance
Okapi Weight (Un-normalized):   0.5851276394025247
Lemma: result
Okapi Weight (Un-normalized):   0.4313409629662276
Lemma: sc
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: shallow
Okapi Weight (Un-normalized):   0.5321092487036687
Lemma: should
Okapi Weight (Un-normalized):   0.500092678152233
Lemma: show
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: similar
Okapi Weight (Un-normalized):   0.47726951117965477
Lemma: solution
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: support
Okapi Weight (Un-normalized):   0.49315390919106816
Lemma: surface
Okapi Weight (Un-normalized):   0.44310757011495167
Lemma: system
Okapi Weight (Un-normalized):   0.48621514022990325
Lemma: terrain
Okapi Weight (Un-normalized):   0.5910567628713336
Lemma: these
Okapi Weight (Un-normalized):   0.4341619410647032
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transportation
Okapi Weight (Un-normalized):   0.6252631578947369
Lemma: use
Okapi Weight (Un-normalized):   0.4215537850574758
Lemma: vehicle
Okapi Weight (Un-normalized):   0.4946710656347795
Lemma: water
Okapi Weight (Un-normalized):   0.6693866056511395
Lemma: wave
Okapi Weight (Un-normalized):   0.48101521400418884

Rank#: 4
Cosine Similarity: 0.11250048181884559
Doc#: 1232  Document Headline:  the curtain jet .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.4452510404521592
Lemma: altitude
Okapi Weight (Un-normalized):   0.5120912688246271
Lemma: analysis
Okapi Weight (Un-normalized):   0.4452510404521592
Lemma: analytic
Okapi Weight (Un-normalized):   0.5295971800980946
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: bifurcate
Okapi Weight (Un-normalized):   0.6364640883977901
Lemma: construct
Okapi Weight (Un-normalized):   0.5325398674892488
Lemma: contain
Okapi Weight (Un-normalized):   0.5151064934141378
Lemma: curtain
Okapi Weight (Un-normalized):   0.7392338177014531
Lemma: deflect
Okapi Weight (Un-normalized):   0.540048000752824
Lemma: detail
Okapi Weight (Un-normalized):   0.5404603550340481
Lemma: differential
Okapi Weight (Un-normalized):   0.48372437368818955
Lemma: effect
Okapi Weight (Un-normalized):   0.4324588044458685
Lemma: ehrichff
Okapi Weight (Un-normalized):   0.6138385681717105
Lemma: field
Okapi Weight (Un-normalized):   0.4678765606782388
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.46351786557079844
Lemma: free
Okapi Weight (Un-normalized):   0.4584861213437238
Lemma: geometry
Okapi Weight (Un-normalized):   0.5087689060229575
Lemma: ground
Okapi Weight (Un-normalized):   0.5263626820219626
Lemma: helmholtz
Okapi Weight (Un-normalized):   0.6005568229036098
Lemma: inclination
Okapi Weight (Un-normalized):   0.5729462228269917
Lemma: into
Okapi Weight (Un-normalized):   0.4973764133376054
Lemma: jet
Okapi Weight (Un-normalized):   0.5671760489196023
Lemma: kirchhoff
Okapi Weight (Un-normalized):   0.5912130479456309
Lemma: machine
Okapi Weight (Un-normalized):   0.5386782168712545
Lemma: make
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: nozzle
Okapi Weight (Un-normalized):   0.4924809731880583
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: penetrate
Okapi Weight (Un-normalized):   0.5779313026775302
Lemma: portion
Okapi Weight (Un-normalized):   0.5050696621487529
Lemma: present
Okapi Weight (Un-normalized):   0.4226255202260796
Lemma: pressure
Okapi Weight (Un-normalized):   0.4414705737814725
Lemma: quantitative
Okapi Weight (Un-normalized):   0.5457749483808133
Lemma: region
Okapi Weight (Un-normalized):   0.4973764133376054
Lemma: requirement
Okapi Weight (Un-normalized):   0.5249734627567717
Lemma: result
Okapi Weight (Un-normalized):   0.4226255202260796
Lemma: sc
Okapi Weight (Un-normalized):   0.4452510404521592
Lemma: steamline
Okapi Weight (Un-normalized):   0.6364640883977901
Lemma: stream
Okapi Weight (Un-normalized):   0.4584861213437238
Lemma: study
Okapi Weight (Un-normalized):   0.47536700996931686
Lemma: support
Okapi Weight (Un-normalized):   0.579232837937245
Lemma: the
Okapi Weight (Un-normalized):   0.5438429214688393
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: two
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: twodimensional
Okapi Weight (Un-normalized):   0.5438429214688393
Lemma: underside
Okapi Weight (Un-normalized):   0.6364640883977901
Lemma: use
Okapi Weight (Un-normalized):   0.4324588044458685
Lemma: variation
Okapi Weight (Un-normalized):   0.4782714400582174
Lemma: vary
Okapi Weight (Un-normalized):   0.4717212022352884
Lemma: wall
Okapi Weight (Un-normalized):   0.46351786557079844

Rank#: 5
Cosine Similarity: 0.11242076568907167
Doc#: 36  Document Headline:  supersonic flow around blunt bodies .
Document Vector: 
Lemma: accurate
Okapi Weight (Un-normalized):   0.4873819698021475
Lemma: ae
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.4579512145413265
Lemma: analysis
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: around
Okapi Weight (Un-normalized):   0.48970570211756737
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: blunt
Okapi Weight (Un-normalized):   0.4641699225725592
Lemma: body
Okapi Weight (Un-normalized):   0.4692800233990294
Lemma: boundary
Okapi Weight (Un-normalized):   0.4193170715137755
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: calculation
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: can
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: condition
Okapi Weight (Un-normalized):   0.45781485874240574
Lemma: depend
Okapi Weight (Un-normalized):   0.4820575195625243
Lemma: derivative
Okapi Weight (Un-normalized):   0.4938419662954416
Lemma: design
Okapi Weight (Un-normalized):   0.49602840177917096
Lemma: effect
Okapi Weight (Un-normalized):   0.4193170715137755
Lemma: either
Okapi Weight (Un-normalized):   0.4820575195625243
Lemma: estimate
Okapi Weight (Un-normalized):   0.47354694730771185
Lemma: extrapolation
Okapi Weight (Un-normalized):   0.5570339413940465
Lemma: face
Okapi Weight (Un-normalized):   0.5106466490460148
Lemma: familiar
Okapi Weight (Un-normalized):   0.5476569166588938
Lemma: flight
Okapi Weight (Un-normalized):   0.4641699225725592
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: forward
Okapi Weight (Un-normalized):   0.4947867565456422
Lemma: from
Okapi Weight (Un-normalized):   0.4193170715137755
Lemma: give
Okapi Weight (Un-normalized):   0.4193170715137755
Lemma: gradient
Okapi Weight (Un-normalized):   0.469250977000634
Lemma: greater
Okapi Weight (Un-normalized):   0.48348699408633466
Lemma: happen
Okapi Weight (Un-normalized):   0.5825697209390547
Lemma: have
Okapi Weight (Un-normalized):   0.43061683397308304
Lemma: heat
Okapi Weight (Un-normalized):   0.46712097240796807
Lemma: high
Okapi Weight (Un-normalized):   0.4499339054868585
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.4579512145413265
Lemma: impact
Okapi Weight (Un-normalized):   0.5210559637681692
Lemma: inevitable
Okapi Weight (Un-normalized):   0.5825697209390547
Lemma: information
Okapi Weight (Un-normalized):   0.5432130799335824
Lemma: know
Okapi Weight (Un-normalized):   0.4754696850318667
Lemma: layer
Okapi Weight (Un-normalized):   0.43061683397308304
Lemma: missile
Okapi Weight (Un-normalized):   0.5028040656001102
Lemma: more
Okapi Weight (Un-normalized):   0.4579512145413265
Lemma: move
Okapi Weight (Un-normalized):   0.4873819698021475
Lemma: need
Okapi Weight (Un-normalized):   0.5028040656001102
Lemma: newtonian
Okapi Weight (Un-normalized):   0.5432130799335824
Lemma: nonviscous
Okapi Weight (Un-normalized):   0.5405534154798097
Lemma: nor
Okapi Weight (Un-normalized):   0.5519130461539291
Lemma: not
Okapi Weight (Un-normalized):   0.4448528510587837
Lemma: now
Okapi Weight (Un-normalized):   0.513159037809217
Lemma: obtain
Okapi Weight (Un-normalized):   0.43061683397308304
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.4448528510587837
Lemma: open
Okapi Weight (Un-normalized):   0.5228092867257543
Lemma: part
Okapi Weight (Un-normalized):   0.469250977000634
Lemma: perhaps
Okapi Weight (Un-normalized):   0.5476569166588938
Lemma: practice
Okapi Weight (Un-normalized):   0.5244588002685245
Lemma: predict
Okapi Weight (Un-normalized):   0.4641699225725592
Lemma: pressure
Okapi Weight (Un-normalized):   0.4193170715137755
Lemma: procedure
Okapi Weight (Un-normalized):   0.4754696850318667
Lemma: proceeds
Okapi Weight (Un-normalized):   0.5570339413940465
Lemma: question
Okapi Weight (Un-normalized):   0.5183997983664955
Lemma: rate
Okapi Weight (Un-normalized):   0.4916343830912038
Lemma: result
Okapi Weight (Un-normalized):   0.4193170715137755
Lemma: sc
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: seem
Okapi Weight (Un-normalized):   0.5167599934610912
Lemma: serbinh
Okapi Weight (Un-normalized):   0.6018867924528302
Lemma: show
Okapi Weight (Un-normalized):   0.43061683397308304
Lemma: speed
Okapi Weight (Un-normalized):   0.438634143027551
Lemma: stability
Okapi Weight (Un-normalized):   0.5036320502880076
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4448528510587837
Lemma: test
Okapi Weight (Un-normalized):   0.4448528510587837
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: then
Okapi Weight (Un-normalized):   0.4668260879742328
Lemma: theory
Okapi Weight (Un-normalized):   0.4458171915456019
Lemma: therefore
Okapi Weight (Un-normalized):   0.5006313832115329
Lemma: these
Okapi Weight (Un-normalized):   0.43061683397308304
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.4747246209168048
Lemma: unfamiliar
Okapi Weight (Un-normalized):   0.6018867924528302
Lemma: use
Okapi Weight (Un-normalized):   0.4193170715137755
Lemma: useful
Okapi Weight (Un-normalized):   0.49908272685272004
Lemma: velocity
Okapi Weight (Un-normalized):   0.45781485874240574
Lemma: wall
Okapi Weight (Un-normalized):   0.45422987579393637
 ***************************** 
Processing Query:  what is the basic mechanism of the transonic aileron buzz  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.14355003037655728
Doc#: 496  Document Headline:  a theory of transonic aileron buzz, neglecting viscous effects .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.4450024083617627
Lemma: agreement
Okapi Weight (Un-normalized):   0.4631688663094204
Lemma: aileron
Okapi Weight (Un-normalized):   0.6753346167715368
Lemma: airfoil
Okapi Weight (Un-normalized):   0.5420065984521694
Lemma: analysis
Okapi Weight (Un-normalized):   0.46466135517242746
Lemma: approximation
Okapi Weight (Un-normalized):   0.4713271296955341
Lemma: around
Okapi Weight (Un-normalized):   0.5044923563127708
Lemma: boundary
Okapi Weight (Un-normalized):   0.4225012041808814
Lemma: buzz
Okapi Weight (Un-normalized):   0.7378947368421053
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: comparison
Okapi Weight (Un-normalized):   0.47474738233726677
Lemma: develop
Okapi Weight (Un-normalized):   0.4581647690286484
Lemma: distribution
Okapi Weight (Un-normalized):   0.4450024083617627
Lemma: due
Okapi Weight (Un-normalized):   0.4713271296955341
Lemma: eckhausw
Okapi Weight (Un-normalized):   0.5994548623382054
Lemma: effect
Okapi Weight (Un-normalized):   0.43233067758621374
Lemma: experimental
Okapi Weight (Un-normalized):   0.4450024083617627
Lemma: first
Okapi Weight (Un-normalized):   0.46750361254264405
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: flutter
Okapi Weight (Un-normalized):   0.5044923563127708
Lemma: from
Okapi Weight (Un-normalized):   0.4225012041808814
Lemma: harmonic
Okapi Weight (Un-normalized):   0.5604174528275685
Lemma: hinge
Okapi Weight (Un-normalized):   0.5676612226221911
Lemma: linearize
Okapi Weight (Un-normalized):   0.5069906945433011
Lemma: local
Okapi Weight (Un-normalized):   0.48066597320952975
Lemma: moment
Okapi Weight (Un-normalized):   0.48567007049030175
Lemma: neglect
Okapi Weight (Un-normalized):   0.5601725236099278
Lemma: nonsteady
Okapi Weight (Un-normalized):   0.576953658157324
Lemma: numerical
Okapi Weight (Un-normalized):   0.46750361254264405
Lemma: observation
Okapi Weight (Un-normalized):   0.5197497906990294
Lemma: obtain
Okapi Weight (Un-normalized):   0.45124291159705476
Lemma: oscillation
Okapi Weight (Un-normalized):   0.5197497906990294
Lemma: perturbation
Okapi Weight (Un-normalized):   0.5909737753836569
Lemma: present
Okapi Weight (Un-normalized):   0.43233067758621374
Lemma: pressure
Okapi Weight (Un-normalized):   0.4225012041808814
Lemma: region
Okapi Weight (Un-normalized):   0.46750361254264405
Lemma: result
Okapi Weight (Un-normalized):   0.43784083413581487
Lemma: satisfactory
Okapi Weight (Un-normalized):   0.5081712746711831
Lemma: sc
Okapi Weight (Un-normalized):   0.4450024083617627
Lemma: series
Okapi Weight (Un-normalized):   0.48790974300415246
Lemma: shock
Okapi Weight (Un-normalized):   0.4522461781563854
Lemma: show
Okapi Weight (Un-normalized):   0.435663564847767
Lemma: solution
Okapi Weight (Un-normalized):   0.45124291159705476
Lemma: sponsor
Okapi Weight (Un-normalized):   0.5994548623382054
Lemma: stability
Okapi Weight (Un-normalized):   0.48066597320952975
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4522461781563854
Lemma: terminate
Okapi Weight (Un-normalized):   0.5901624268030725
Lemma: theoretical
Okapi Weight (Un-normalized):   0.4581647690286484
Lemma: theory
Okapi Weight (Un-normalized):   0.45124291159705476
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transonic
Okapi Weight (Un-normalized):   0.5687486122208623
Lemma: twodimensional
Okapi Weight (Un-normalized):   0.543052575746483
Lemma: unsteady
Okapi Weight (Un-normalized):   0.5125060209044068
Lemma: usaf
Okapi Weight (Un-normalized):   0.5901624268030725
Lemma: vicinity
Okapi Weight (Un-normalized):   0.5329121513659151
Lemma: viscous
Okapi Weight (Un-normalized):   0.511845768293716
Lemma: wave
Okapi Weight (Un-normalized):   0.4581647690286484

Rank#: 2
Cosine Similarity: 0.09948861362279657
Doc#: 903  Document Headline:  two dimensional transonic unsteady flow with shock waves .
Document Vector: 
Lemma: account
Okapi Weight (Un-normalized):   0.4672251250885082
Lemma: add
Okapi Weight (Un-normalized):   0.5092692657460446
Lemma: agree
Okapi Weight (Un-normalized):   0.47439750039379625
Lemma: ahead
Okapi Weight (Un-normalized):   0.4994101149146641
Lemma: aileron
Okapi Weight (Un-normalized):   0.6282348227535973
Lemma: airfoil
Okapi Weight (Un-normalized):   0.5377766146684877
Lemma: approach
Okapi Weight (Un-normalized):   0.4626182844547587
Lemma: around
Okapi Weight (Un-normalized):   0.47637593915230636
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: axis
Okapi Weight (Un-normalized):   0.5187363715853753
Lemma: be
Okapi Weight (Un-normalized):   0.42606734458752454
Lemma: behind
Okapi Weight (Un-normalized):   0.5105051576252005
Lemma: both
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: boundary
Okapi Weight (Un-normalized):   0.41644666329686914
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: can
Okapi Weight (Un-normalized):   0.4328933265937382
Lemma: case
Okapi Weight (Un-normalized):   0.44052509137748347
Lemma: compare
Okapi Weight (Un-normalized):   0.4425140078843936
Lemma: consider
Okapi Weight (Un-normalized):   0.4381879695761532
Lemma: correction
Okapi Weight (Un-normalized):   0.4843595907340428
Lemma: derive
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4425140078843936
Lemma: discuss
Okapi Weight (Un-normalized):   0.4425140078843936
Lemma: distribution
Okapi Weight (Un-normalized):   0.4328933265937382
Lemma: dynamics
Okapi Weight (Un-normalized):   0.5127909043231904
Lemma: eckhausw
Okapi Weight (Un-normalized):   0.5457862849219012
Lemma: employ
Okapi Weight (Un-normalized):   0.47108129616989136
Lemma: error
Okapi Weight (Un-normalized):   0.4886856290422832
Lemma: extend
Okapi Weight (Un-normalized):   0.4642553141636777
Lemma: finally
Okapi Weight (Un-normalized):   0.4843595907340428
Lemma: find
Okapi Weight (Un-normalized):   0.4511369718325129
Lemma: first
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: form
Okapi Weight (Un-normalized):   0.4381879695761532
Lemma: give
Okapi Weight (Un-normalized):   0.41644666329686914
Lemma: group
Okapi Weight (Un-normalized):   0.5149405439313269
Lemma: have
Okapi Weight (Un-normalized):   0.42606734458752454
Lemma: hinge
Okapi Weight (Un-normalized):   0.5905161863719384
Lemma: however
Okapi Weight (Un-normalized):   0.4589606711812627
Lemma: include
Okapi Weight (Un-normalized):   0.4660935772937399
Lemma: interaction
Okapi Weight (Un-normalized):   0.5022739436650258
Lemma: interpretation
Okapi Weight (Un-normalized):   0.5075473432110487
Lemma: into
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: introduce
Okapi Weight (Un-normalized):   0.47223896574541413
Lemma: layer
Okapi Weight (Un-normalized):   0.42606734458752454
Lemma: local
Okapi Weight (Un-normalized):   0.49166206320999634
Lemma: mach
Okapi Weight (Un-normalized):   0.44052509137748347
Lemma: magnitude
Okapi Weight (Un-normalized):   0.469864233523113
Lemma: make
Okapi Weight (Un-normalized):   0.42606734458752454
Lemma: mechanism
Okapi Weight (Un-normalized):   0.4918539977750009
Lemma: mit
Okapi Weight (Un-normalized):   0.5336995806246501
Lemma: must
Okapi Weight (Un-normalized):   0.4790649477516278
Lemma: neglect
Okapi Weight (Un-normalized):   0.5266712985884964
Lemma: number
Okapi Weight (Un-normalized):   0.42556848591625646
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: order
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: oscillate
Okapi Weight (Un-normalized):   0.5378733920803029
Lemma: part
Okapi Weight (Un-normalized):   0.4589606711812627
Lemma: perturbation
Okapi Weight (Un-normalized):   0.4971486407574159
Lemma: presence
Okapi Weight (Un-normalized):   0.5105051576252005
Lemma: present
Okapi Weight (Un-normalized):   0.42556848591625646
Lemma: pressure
Okapi Weight (Un-normalized):   0.41644666329686914
Lemma: re
Okapi Weight (Un-normalized):   0.48147999862352414
Lemma: region
Okapi Weight (Un-normalized):   0.47670545774876927
Lemma: result
Okapi Weight (Un-normalized):   0.4353798631612994
Lemma: role
Okapi Weight (Un-normalized):   0.5108746376522985
Lemma: shock
Okapi Weight (Un-normalized):   0.5044073686297185
Lemma: shockwave
Okapi Weight (Un-normalized):   0.5389942236070651
Lemma: show
Okapi Weight (Un-normalized):   0.42606734458752454
Lemma: simple
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: situation
Okapi Weight (Un-normalized):   0.5045605172122888
Lemma: small
Okapi Weight (Un-normalized):   0.4381879695761532
Lemma: solution
Okapi Weight (Un-normalized):   0.45607575639130543
Lemma: study
Okapi Weight (Un-normalized):   0.4381879695761532
Lemma: subsonic
Okapi Weight (Un-normalized):   0.4589606711812627
Lemma: such
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4381879695761532
Lemma: take
Okapi Weight (Un-normalized):   0.4568961070302705
Lemma: technique
Okapi Weight (Un-normalized):   0.4626182844547587
Lemma: terminate
Okapi Weight (Un-normalized):   0.5389942236070651
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.44971652699629144
Lemma: these
Okapi Weight (Un-normalized):   0.42606734458752454
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transonic
Okapi Weight (Un-normalized):   0.5140209145356364
Lemma: treat
Okapi Weight (Un-normalized):   0.4672251250885082
Lemma: two
Okapi Weight (Un-normalized):   0.42606734458752454
Lemma: unsteady
Okapi Weight (Un-normalized):   0.576899315806497
Lemma: vicinity
Okapi Weight (Un-normalized):   0.4971486407574159
Lemma: wave
Okapi Weight (Un-normalized):   0.4914556195526048
Lemma: well
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: whole
Okapi Weight (Un-normalized):   0.500806254030912

Rank#: 3
Cosine Similarity: 0.09469746621929821
Doc#: 520  Document Headline:  wing-tail interference as a cause of 'magnus' effects on a finned missile .
Document Vector: 
Lemma: accompany
Okapi Weight (Un-normalized):   0.5053732243336729
Lemma: ae
Okapi Weight (Un-normalized):   0.43126121496885805
Lemma: agreement
Okapi Weight (Un-normalized):   0.4438806628561623
Lemma: aileron
Okapi Weight (Un-normalized):   0.5787839444903179
Lemma: all
Okapi Weight (Un-normalized):   0.507194409070513
Lemma: angle
Okapi Weight (Un-normalized):   0.463515927779284
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.4560351416951695
Lemma: basic
Okapi Weight (Un-normalized):   0.4814269207665839
Lemma: basis
Okapi Weight (Un-normalized):   0.4675543616271105
Lemma: behind
Okapi Weight (Un-normalized):   0.4675543616271105
Lemma: bentoner
Okapi Weight (Un-normalized):   0.5633587786259542
Lemma: cause
Okapi Weight (Un-normalized):   0.5061954564778177
Lemma: classical
Okapi Weight (Un-normalized):   0.4801738095144147
Lemma: conduct
Okapi Weight (Un-normalized):   0.4595112703405913
Lemma: configuration
Okapi Weight (Un-normalized):   0.4638895272787731
Lemma: cruciform
Okapi Weight (Un-normalized):   0.5164669561726671
Lemma: cylinder
Okapi Weight (Un-normalized):   0.4438806628561623
Lemma: datum
Okapi Weight (Un-normalized):   0.4889578820438152
Lemma: deflect
Okapi Weight (Un-normalized):   0.4967507180773326
Lemma: deflection
Okapi Weight (Un-normalized):   0.5024605405930456
Lemma: direction
Okapi Weight (Un-normalized):   0.5004343368822313
Lemma: due
Okapi Weight (Un-normalized):   0.44954785345262294
Lemma: effect
Okapi Weight (Un-normalized):   0.4397165651382367
Lemma: either
Okapi Weight (Un-normalized):   0.4663976875849433
Lemma: experimental
Okapi Weight (Un-normalized):   0.44914262993104487
Lemma: explain
Okapi Weight (Un-normalized):   0.49232828835342196
Lemma: factor
Okapi Weight (Un-normalized):   0.4638895272787731
Lemma: fin
Okapi Weight (Un-normalized):   0.5751758584877047
Lemma: finned
Okapi Weight (Un-normalized):   0.6322286850344776
Lemma: fix
Okapi Weight (Un-normalized):   0.4795201347632021
Lemma: force
Okapi Weight (Un-normalized):   0.44689182245328707
Lemma: good
Okapi Weight (Un-normalized):   0.4519237541426815
Lemma: high
Okapi Weight (Un-normalized):   0.4404045342107405
Lemma: interference
Okapi Weight (Un-normalized):   0.5948848399666867
Lemma: into
Okapi Weight (Un-normalized):   0.44689182245328707
Lemma: introduce
Okapi Weight (Un-normalized):   0.46865458958247375
Lemma: large
Okapi Weight (Un-normalized):   0.46898040200988705
Lemma: larger
Okapi Weight (Un-normalized):   0.4801738095144147
Lemma: lift
Okapi Weight (Un-normalized):   0.4519237541426815
Lemma: low
Okapi Weight (Un-normalized):   0.44954785345262294
Lemma: magnus
Okapi Weight (Un-normalized):   0.8067052277311342
Lemma: maintain
Okapi Weight (Un-normalized):   0.49447755196088305
Lemma: mechanism
Okapi Weight (Un-normalized):   0.4872963566640276
Lemma: medium
Okapi Weight (Un-normalized):   0.4967507180773326
Lemma: method
Okapi Weight (Un-normalized):   0.4247739267263115
Lemma: missile
Okapi Weight (Un-normalized):   0.5990967896518578
Lemma: model
Okapi Weight (Un-normalized):   0.4438806628561623
Lemma: modify
Okapi Weight (Un-normalized):   0.46517846093705195
Lemma: movable
Okapi Weight (Un-normalized):   0.5320975636570962
Lemma: much
Okapi Weight (Un-normalized):   0.46865458958247375
Lemma: obtain
Okapi Weight (Un-normalized):   0.4389446128137616
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.470493607759604
Lemma: only
Okapi Weight (Un-normalized):   0.46898040200988705
Lemma: opposite
Okapi Weight (Un-normalized):   0.5022110246547753
Lemma: predict
Okapi Weight (Un-normalized):   0.4519237541426815
Lemma: predominant
Okapi Weight (Un-normalized):   0.5320975636570962
Lemma: present
Okapi Weight (Un-normalized):   0.41563060748442904
Lemma: propose
Okapi Weight (Un-normalized):   0.4774370979284638
Lemma: provide
Okapi Weight (Un-normalized):   0.4540730177501426
Lemma: rate
Okapi Weight (Un-normalized):   0.49623874665674206
Lemma: reveal
Okapi Weight (Un-normalized):   0.5053732243336729
Lemma: roll
Okapi Weight (Un-normalized):   0.5971183999811356
Lemma: sc
Okapi Weight (Un-normalized):   0.43126121496885805
Lemma: semiempirical
Okapi Weight (Un-normalized):   0.507194409070513
Lemma: set
Okapi Weight (Un-normalized):   0.5061954564778177
Lemma: show
Okapi Weight (Un-normalized):   0.4247739267263115
Lemma: simple
Okapi Weight (Un-normalized):   0.4438806628561623
Lemma: simplify
Okapi Weight (Un-normalized):   0.4707060213666232
Lemma: slender
Okapi Weight (Un-normalized):   0.4610670733845639
Lemma: source
Okapi Weight (Un-normalized):   0.48374179246160115
Lemma: speed
Okapi Weight (Un-normalized):   0.43126121496885805
Lemma: spin
Okapi Weight (Un-normalized):   0.5229220068115763
Lemma: tail
Okapi Weight (Un-normalized):   0.623613927584364
Lemma: test
Okapi Weight (Un-normalized):   0.4362931466582525
Lemma: than
Okapi Weight (Un-normalized):   0.4362931466582525
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4247739267263115
Lemma: thereby
Okapi Weight (Un-normalized):   0.5137302445867162
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: understand
Okapi Weight (Un-normalized):   0.49342851630878515
Lemma: up
Okapi Weight (Un-normalized):   0.4519237541426815
Lemma: use
Okapi Weight (Un-normalized):   0.41563060748442904
Lemma: wake
Okapi Weight (Un-normalized):   0.47669768086899295
Lemma: water
Okapi Weight (Un-normalized):   0.503847508285363
Lemma: whose
Okapi Weight (Un-normalized):   0.47884694447645404
Lemma: wing
Okapi Weight (Un-normalized):   0.5112363008393765
Lemma: wingtail
Okapi Weight (Un-normalized):   0.5633587786259542
Lemma: work
Okapi Weight (Un-normalized):   0.4560351416951695
Lemma: zero
Okapi Weight (Un-normalized):   0.4519237541426815

Rank#: 4
Cosine Similarity: 0.09256033090045035
Doc#: 313  Document Headline:  on alternative forms for the basic equations of transonic flow theory .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.4741724752794485
Lemma: ae
Okapi Weight (Un-normalized):   0.4528415375602633
Lemma: alternative
Okapi Weight (Un-normalized):   0.6529030524792376
Lemma: another
Okapi Weight (Un-normalized):   0.5547723613906711
Lemma: attention
Okapi Weight (Un-normalized):   0.5386542794075841
Lemma: author
Okapi Weight (Un-normalized):   0.5056830751205266
Lemma: basic
Okapi Weight (Un-normalized):   0.5376377628441611
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: call
Okapi Weight (Un-normalized):   0.5679714115216768
Lemma: certain
Okapi Weight (Un-normalized):   0.4914008429066926
Lemma: contribute
Okapi Weight (Un-normalized):   0.5922408005272235
Lemma: discussion
Okapi Weight (Un-normalized):   0.5160484030361814
Lemma: equation
Okapi Weight (Un-normalized):   0.4573558362500171
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: form
Okapi Weight (Un-normalized):   0.5030764707258768
Lemma: have
Okapi Weight (Un-normalized):   0.4418759277567329
Lemma: indicate
Okapi Weight (Un-normalized):   0.46829669653686457
Lemma: more
Okapi Weight (Un-normalized):   0.47926230634039496
Lemma: note
Okapi Weight (Un-normalized):   0.4914008429066926
Lemma: numerous
Okapi Weight (Un-normalized):   0.5883611381588223
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.4613471253191106
Lemma: possibility
Okapi Weight (Un-normalized):   0.535519600598559
Lemma: preference
Okapi Weight (Un-normalized):   0.6497082634779329
Lemma: purpose
Okapi Weight (Un-normalized):   0.5101726242935974
Lemma: reason
Okapi Weight (Un-normalized):   0.5922408005272235
Lemma: sc
Okapi Weight (Un-normalized):   0.4528415375602633
Lemma: selection
Okapi Weight (Un-normalized):   0.6497082634779329
Lemma: spreiterjr
Okapi Weight (Un-normalized):   0.6341986125519573
Lemma: theory
Okapi Weight (Un-normalized):   0.4418759277567329
Lemma: these
Okapi Weight (Un-normalized):   0.4418759277567329
Lemma: thin
Okapi Weight (Un-normalized):   0.48776789409924226
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transonic
Okapi Weight (Un-normalized):   0.5613756978921157
Lemma: use
Okapi Weight (Un-normalized):   0.4264207687801317
Lemma: widely
Okapi Weight (Un-normalized):   0.614781906938954
Lemma: wing
Okapi Weight (Un-normalized):   0.46829669653686457

Rank#: 5
Cosine Similarity: 0.08465523819526478
Doc#: 38  Document Headline:  on the prediction of mixed subsonic/supersonic pressure distributions .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: also
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: analyze
Okapi Weight (Un-normalized):   0.5100141554907094
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: can
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: consider
Okapi Weight (Un-normalized):   0.4572819543642298
Lemma: derive
Okapi Weight (Un-normalized):   0.47400998483591095
Lemma: distribution
Okapi Weight (Un-normalized):   0.4690205476559619
Lemma: empirical
Okapi Weight (Un-normalized):   0.6222946101660658
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: high
Okapi Weight (Un-normalized):   0.4637710118265904
Lemma: improve
Okapi Weight (Un-normalized):   0.5392339036737631
Lemma: introduce
Okapi Weight (Un-normalized):   0.5083584486181212
Lemma: link
Okapi Weight (Un-normalized):   0.6084913354105975
Lemma: mechanism
Okapi Weight (Un-normalized):   0.5377809966625013
Lemma: mixed
Okapi Weight (Un-normalized):   0.5724108158969904
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: part
Okapi Weight (Un-normalized):   0.48844100677189406
Lemma: physical
Okapi Weight (Un-normalized):   0.5145639087284595
Lemma: prediction
Okapi Weight (Un-normalized):   0.5410594619132463
Lemma: pressure
Okapi Weight (Un-normalized):   0.43980234605646185
Lemma: relation
Okapi Weight (Un-normalized):   0.5592093842258472
Lemma: result
Okapi Weight (Un-normalized):   0.43451027382798096
Lemma: rise
Okapi Weight (Un-normalized):   0.5222199979352862
Lemma: sc
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: scheme
Okapi Weight (Un-normalized):   0.579501952299516
Lemma: semiempirical
Okapi Weight (Un-normalized):   0.5691863564847857
Lemma: separately
Okapi Weight (Un-normalized):   0.5663119564784477
Lemma: shock
Okapi Weight (Un-normalized):   0.48013037436344497
Lemma: show
Okapi Weight (Un-normalized):   0.4391010168812868
Lemma: significance
Okapi Weight (Un-normalized):   0.544516361539482
Lemma: sinnottc
Okapi Weight (Un-normalized):   0.6186794273828518
Lemma: solution
Okapi Weight (Un-normalized):   0.4391010168812868
Lemma: speed
Okapi Weight (Un-normalized):   0.4493399898906073
Lemma: subsonic
Okapi Weight (Un-normalized):   0.48844100677189406
Lemma: subsonicsupersonic
Okapi Weight (Un-normalized):   0.6578313253012049
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4572819543642298
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: then
Okapi Weight (Un-normalized):   0.48534416054540575
Lemma: theoretical
Okapi Weight (Un-normalized):   0.4637710118265904
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transonic
Okapi Weight (Un-normalized):   0.5538962062763294
Lemma: treat
Okapi Weight (Un-normalized):   0.5008376876327624
Lemma: tunnel
Okapi Weight (Un-normalized):   0.46925743173683443
Lemma: wind
Okapi Weight (Un-normalized):   0.48534416054540575
 ***************************** 
Processing Query:  papers on shock-sound wave interaction  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.1796198233736665
Doc#: 64  Document Headline:  unsteady oblique interaction of a shock wave with plane disturbances .
Document Vector: 
Lemma: also
Okapi Weight (Un-normalized):   0.4403469868070976
Lemma: analysis
Okapi Weight (Un-normalized):   0.4403469868070976
Lemma: angle
Okapi Weight (Un-normalized):   0.4771760969371617
Lemma: appear
Okapi Weight (Un-normalized):   0.4806939736141952
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.4806939736141952
Lemma: attenuate
Okapi Weight (Un-normalized):   0.6821733718523422
Lemma: behind
Okapi Weight (Un-normalized):   0.48718838791282243
Lemma: between
Okapi Weight (Un-normalized):   0.44684140110572484
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: computation
Okapi Weight (Un-normalized):   0.500867467017744
Lemma: consider
Okapi Weight (Un-normalized):   0.44684140110572484
Lemma: constant
Okapi Weight (Un-normalized):   0.45663415600154933
Lemma: depend
Okapi Weight (Un-normalized):   0.4856955376712076
Lemma: disturbance
Okapi Weight (Un-normalized):   0.567062658810361
Lemma: either
Okapi Weight (Un-normalized):   0.5268252307211797
Lemma: field
Okapi Weight (Un-normalized):   0.4605204802106464
Lemma: first
Okapi Weight (Un-normalized):   0.4605204802106464
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: impingement
Okapi Weight (Un-normalized):   0.5906639450200966
Lemma: incidence
Okapi Weight (Un-normalized):   0.49368280221144967
Lemma: incident
Okapi Weight (Un-normalized):   0.6889303376854781
Lemma: interaction
Okapi Weight (Un-normalized):   0.4806939736141952
Lemma: isentropic
Okapi Weight (Un-normalized):   0.6012718209629817
Lemma: mach
Okapi Weight (Un-normalized):   0.43197423055317047
Lemma: make
Okapi Weight (Un-normalized):   0.43197423055317047
Lemma: moorefk
Okapi Weight (Un-normalized):   0.5704904516165478
Lemma: move
Okapi Weight (Un-normalized):   0.4912560472810604
Lemma: naca
Okapi Weight (Un-normalized):   0.45663415600154933
Lemma: normal
Okapi Weight (Un-normalized):   0.46978882093860763
Lemma: number
Okapi Weight (Un-normalized):   0.4201734934035488
Lemma: oblique
Okapi Weight (Un-normalized):   0.592359166393151
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.44684140110572484
Lemma: plane
Okapi Weight (Un-normalized):   0.5353207092219038
Lemma: present
Okapi Weight (Un-normalized):   0.4201734934035488
Lemma: pressure
Okapi Weight (Un-normalized):   0.4355419213580363
Lemma: produce
Okapi Weight (Un-normalized):   0.5452762828576152
Lemma: profile
Okapi Weight (Un-normalized):   0.47232121736026805
Lemma: range
Okapi Weight (Un-normalized):   0.4403469868070976
Lemma: reflect
Okapi Weight (Un-normalized):   0.5248703849076903
Lemma: refract
Okapi Weight (Un-normalized):   0.7120291616038883
Lemma: shock
Okapi Weight (Un-normalized):   0.5019407264087662
Lemma: simple
Okapi Weight (Un-normalized):   0.45663415600154933
Lemma: sound
Okapi Weight (Un-normalized):   0.6200486004250056
Lemma: stationary
Okapi Weight (Un-normalized):   0.6005934928530396
Lemma: three
Okapi Weight (Un-normalized):   0.46701489450927364
Lemma: tn
Okapi Weight (Un-normalized):   0.46701489450927364
Lemma: two
Okapi Weight (Un-normalized):   0.43197423055317047
Lemma: type
Okapi Weight (Un-normalized):   0.4838157983109199
Lemma: unsteady
Okapi Weight (Un-normalized):   0.500867467017744
Lemma: vorticity
Okapi Weight (Un-normalized):   0.5916533217779717
Lemma: wave
Okapi Weight (Un-normalized):   0.5299507493123532
Lemma: weak
Okapi Weight (Un-normalized):   0.5219365448953269

Rank#: 2
Cosine Similarity: 0.15276854960195094
Doc#: 291  Document Headline:  sweepback effects in the turbulent boundary-layer shock-wave interaction .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.4525028097553898
Lemma: ahead
Okapi Weight (Un-normalized):   0.5586738372676369
Lemma: angle
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: available
Okapi Weight (Un-normalized):   0.5073016419681958
Lemma: boundary
Okapi Weight (Un-normalized):   0.4360283210638159
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: can
Okapi Weight (Un-normalized):   0.4525028097553898
Lemma: configuration
Okapi Weight (Un-normalized):   0.5073016419681958
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: effect
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: experiment
Okapi Weight (Un-normalized):   0.48321498464478974
Lemma: extension
Okapi Weight (Un-normalized):   0.5233931461441199
Lemma: influence
Okapi Weight (Un-normalized):   0.497141741266425
Lemma: interaction
Okapi Weight (Un-normalized):   0.5441132842552635
Lemma: layer
Okapi Weight (Un-normalized):   0.45710353785009034
Lemma: moderate
Okapi Weight (Un-normalized):   0.5397080891488677
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: peak
Okapi Weight (Un-normalized):   0.5586738372676369
Lemma: pressure
Okapi Weight (Un-normalized):   0.4360283210638159
Lemma: reattachment
Okapi Weight (Un-normalized):   0.5769729793296302
Lemma: report
Okapi Weight (Un-normalized):   0.49411030207778467
Lemma: rise
Okapi Weight (Un-normalized):   0.5784913752837904
Lemma: sc
Okapi Weight (Un-normalized):   0.4525028097553898
Lemma: separation
Okapi Weight (Un-normalized):   0.537172605535791
Lemma: shock
Okapi Weight (Un-normalized):   0.48365517088969623
Lemma: show
Okapi Weight (Un-normalized):   0.4416074923223949
Lemma: simple
Okapi Weight (Un-normalized):   0.4736970106943238
Lemma: stalkerrj
Okapi Weight (Un-normalized):   0.6743589743589744
Lemma: sweep
Okapi Weight (Un-normalized):   0.5335530468458908
Lemma: sweepback
Okapi Weight (Un-normalized):   0.5871536949654965
Lemma: sweptback
Okapi Weight (Un-normalized):   0.571662105509943
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4416074923223949
Lemma: turbulent
Okapi Weight (Un-normalized):   0.5246375130545808
Lemma: two
Okapi Weight (Un-normalized):   0.4416074923223949
Lemma: understand
Okapi Weight (Un-normalized):   0.5569119953391135
Lemma: upstream
Okapi Weight (Un-normalized):   0.5357177944001795
Lemma: wave
Okapi Weight (Un-normalized):   0.4931318589139062

Rank#: 3
Cosine Similarity: 0.14086728309168223
Doc#: 265  Document Headline:  some instabilities arising from the interaction between shock waves and boundary layer .
Document Vector: 
Lemma: aero
Okapi Weight (Un-normalized):   0.49523555492116517
Lemma: aerofoil
Okapi Weight (Un-normalized):   0.5890267138633065
Lemma: also
Okapi Weight (Un-normalized):   0.4487526090585763
Lemma: arise
Okapi Weight (Un-normalized):   0.5726286862353561
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: available
Okapi Weight (Un-normalized):   0.4996372389704676
Lemma: behaviour
Okapi Weight (Un-normalized):   0.5382727675555485
Lemma: between
Okapi Weight (Un-normalized):   0.4566000263360842
Lemma: boundary
Okapi Weight (Un-normalized):   0.42437630452928815
Lemma: brief
Okapi Weight (Un-normalized):   0.5346440283272362
Lemma: briefly
Okapi Weight (Un-normalized):   0.5250329648379563
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: concern
Okapi Weight (Un-normalized):   0.5322722821171613
Lemma: consideration
Okapi Weight (Un-normalized):   0.49523555492116517
Lemma: control
Okapi Weight (Un-normalized):   0.5526101655553574
Lemma: detail
Okapi Weight (Un-normalized):   0.4902030454616804
Lemma: devoted
Okapi Weight (Un-normalized):   0.5773650242959503
Lemma: discuss
Okapi Weight (Un-normalized):   0.4630118331143691
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluctuation
Okapi Weight (Un-normalized):   0.5527610971360231
Lemma: from
Okapi Weight (Un-normalized):   0.43422188713861065
Lemma: have
Okapi Weight (Un-normalized):   0.438635528585081
Lemma: induce
Okapi Weight (Un-normalized):   0.5453720959380652
Lemma: influence
Okapi Weight (Un-normalized):   0.4902030454616804
Lemma: information
Okapi Weight (Un-normalized):   0.5207649979598662
Lemma: instability
Okapi Weight (Un-normalized):   0.6044504113067083
Lemma: interaction
Okapi Weight (Un-normalized):   0.49750521811715254
Lemma: into
Okapi Weight (Un-normalized):   0.4731289135878644
Lemma: investigation
Okapi Weight (Un-normalized):   0.4566000263360842
Lemma: lambournenc
Okapi Weight (Un-normalized):   0.6060092957033285
Lemma: layer
Okapi Weight (Un-normalized):   0.438635528585081
Lemma: make
Okapi Weight (Un-normalized):   0.438635528585081
Lemma: more
Okapi Weight (Un-normalized):   0.4731289135878644
Lemma: npl
Okapi Weight (Un-normalized):   0.6391659785980535
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: oscillatory
Okapi Weight (Un-normalized):   0.54733999174852
Lemma: over
Okapi Weight (Un-normalized):   0.4566000263360842
Lemma: part
Okapi Weight (Un-normalized):   0.48738813764365724
Lemma: phenomenon
Okapi Weight (Un-normalized):   0.5087044631634391
Lemma: play
Okapi Weight (Un-normalized):   0.5671722331933001
Lemma: recent
Okapi Weight (Un-normalized):   0.5132000526721684
Lemma: review
Okapi Weight (Un-normalized):   0.5207649979598662
Lemma: separation
Okapi Weight (Un-normalized):   0.5302948704392889
Lemma: shock
Okapi Weight (Un-normalized):   0.491823218691158
Lemma: surface
Okapi Weight (Un-normalized):   0.4684437742772213
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: wave
Okapi Weight (Un-normalized):   0.4630118331143691
Lemma: wing
Okapi Weight (Un-normalized):   0.4630118331143691

Rank#: 4
Cosine Similarity: 0.13990013396748963
Doc#: 256  Document Headline:  an experimental study of the glancing interaction between a shock wave and a turbulent boundary layer .
Document Vector: 
Lemma: arc
Okapi Weight (Un-normalized):   0.479958732457615
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: between
Okapi Weight (Un-normalized):   0.4714052897957107
Lemma: boundary
Okapi Weight (Un-normalized):   0.44262892950298827
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: condition
Okapi Weight (Un-normalized):   0.44200224780431185
Lemma: cp
Okapi Weight (Un-normalized):   0.5240513412748541
Lemma: design
Okapi Weight (Un-normalized):   0.4697642235147823
Lemma: dimensional
Okapi Weight (Un-normalized):   0.45428711776007186
Lemma: experimental
Okapi Weight (Un-normalized):   0.46150516887489973
Lemma: find
Okapi Weight (Un-normalized):   0.44200224780431185
Lemma: from
Okapi Weight (Un-normalized):   0.43075258443744985
Lemma: fuselage
Okapi Weight (Un-normalized):   0.5858807405287961
Lemma: glance
Okapi Weight (Un-normalized):   0.6194871794871795
Lemma: have
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: important
Okapi Weight (Un-normalized):   0.4875731116179878
Lemma: interaction
Okapi Weight (Un-normalized):   0.5455359227967765
Lemma: investigate
Okapi Weight (Un-normalized):   0.4665719877158318
Lemma: junction
Okapi Weight (Un-normalized):   0.546770233020002
Lemma: layer
Okapi Weight (Un-normalized):   0.46756525470812216
Lemma: least
Okapi Weight (Un-normalized):   0.5160010090203881
Lemma: mach
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: make
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: may
Okapi Weight (Un-normalized):   0.4487630996126264
Lemma: mount
Okapi Weight (Un-normalized):   0.5287218320702414
Lemma: number
Okapi Weight (Un-normalized):   0.42100112390215594
Lemma: occur
Okapi Weight (Un-normalized):   0.4726519520540377
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.4487630996126264
Lemma: plate
Okapi Weight (Un-normalized):   0.4794942775710689
Lemma: produce
Okapi Weight (Un-normalized):   0.4858413135745567
Lemma: regard
Okapi Weight (Un-normalized):   0.5125146134612283
Lemma: region
Okapi Weight (Un-normalized):   0.46300337170646777
Lemma: separate
Okapi Weight (Un-normalized):   0.49224360241337495
Lemma: shape
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: shock
Okapi Weight (Un-normalized):   0.4929956422930283
Lemma: side
Okapi Weight (Un-normalized):   0.5658276968575358
Lemma: stanbrooka
Okapi Weight (Un-normalized):   0.5984860555850235
Lemma: strength
Okapi Weight (Un-normalized):   0.49224360241337495
Lemma: study
Okapi Weight (Un-normalized):   0.4714052897957107
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: therefore
Okapi Weight (Un-normalized):   0.5094043755940768
Lemma: these
Okapi Weight (Un-normalized):   0.43328599385791594
Lemma: thickness
Okapi Weight (Un-normalized):   0.46300337170646777
Lemma: three
Okapi Weight (Un-normalized):   0.4697642235147823
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: tunnel
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: turbulent
Okapi Weight (Un-normalized):   0.5063864629577273
Lemma: type
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: under
Okapi Weight (Un-normalized):   0.45895760855545903
Lemma: up
Okapi Weight (Un-normalized):   0.4697642235147823
Lemma: waisted
Okapi Weight (Un-normalized):   0.6194871794871795
Lemma: wall
Okapi Weight (Un-normalized):   0.4863334192864669
Lemma: wave
Okapi Weight (Un-normalized):   0.5035304446280099
Lemma: wind
Okapi Weight (Un-normalized):   0.4726519520540377
Lemma: wing
Okapi Weight (Un-normalized):   0.45428711776007186

Rank#: 5
Cosine Similarity: 0.13462306595045814
Doc#: 568  Document Headline:  shock wave effects on the laminar skin friction of an insulated flat plate at hypersonic speeds .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: approximate
Okapi Weight (Un-normalized):   0.4583590541538808
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: average
Okapi Weight (Un-normalized):   0.5057577426799947
Lemma: basis
Okapi Weight (Un-normalized):   0.4898438718086444
Lemma: between
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: boundary
Okapi Weight (Un-normalized):   0.4305233726279782
Lemma: calculation
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: coefficient
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: datum
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: decay
Okapi Weight (Un-normalized):   0.532160247643959
Lemma: decrease
Okapi Weight (Un-normalized):   0.48121610775002915
Lemma: effect
Okapi Weight (Un-normalized):   0.42078791452243863
Lemma: fig
Okapi Weight (Un-normalized):   0.5482029259625252
Lemma: find
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: flat
Okapi Weight (Un-normalized):   0.5015413179733372
Lemma: formula
Okapi Weight (Un-normalized):   0.5340683413958368
Lemma: formulate
Okapi Weight (Un-normalized):   0.525650348293154
Lemma: friction
Okapi Weight (Un-normalized):   0.5247631514064985
Lemma: growth
Okapi Weight (Un-normalized):   0.5207227977211966
Lemma: have
Okapi Weight (Un-normalized):   0.448378401010884
Lemma: hold
Okapi Weight (Un-normalized):   0.5190715208007874
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.5195684426546103
Lemma: increase
Okapi Weight (Un-normalized):   0.47890177363886216
Lemma: indicate
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: insulate
Okapi Weight (Un-normalized):   0.6161967040786216
Lemma: interaction
Okapi Weight (Un-normalized):   0.4831516580897544
Lemma: laminar
Okapi Weight (Un-normalized):   0.47087307645561843
Lemma: layer
Okapi Weight (Un-normalized):   0.448378401010884
Lemma: lity
Okapi Weight (Un-normalized):   0.5689908404849637
Lemma: mach
Okapi Weight (Un-normalized):   0.4329480649862619
Lemma: may
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: nagamatsuht
Okapi Weight (Un-normalized):   0.5842679438860579
Lemma: new
Okapi Weight (Un-normalized):   0.5247631514064985
Lemma: number
Okapi Weight (Un-normalized):   0.42078791452243863
Lemma: obtain
Okapi Weight (Un-normalized):   0.4329480649862619
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: phenomenon
Okapi Weight (Un-normalized):   0.4927022833068922
Lemma: plate
Okapi Weight (Un-normalized):   0.4934974403031659
Lemma: present
Okapi Weight (Un-normalized):   0.42078791452243863
Lemma: rate
Okapi Weight (Un-normalized):   0.496756802021768
Lemma: result
Okapi Weight (Un-normalized):   0.4305233726279782
Lemma: sc
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: set
Okapi Weight (Un-normalized):   0.4898438718086444
Lemma: shock
Okapi Weight (Un-normalized):   0.4839835523259659
Lemma: show
Okapi Weight (Un-normalized):   0.4329480649862619
Lemma: skin
Okapi Weight (Un-normalized):   0.5192514774665025
Lemma: speed
Okapi Weight (Un-normalized):   0.4723394945010474
Lemma: steady
Okapi Weight (Un-normalized):   0.47692442455615386
Lemma: strength
Okapi Weight (Un-normalized):   0.4913071191401427
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4329480649862619
Lemma: thickness
Okapi Weight (Un-normalized):   0.4623637435673158
Lemma: wave
Okapi Weight (Un-normalized):   0.4934974403031659
Lemma: yield
Okapi Weight (Un-normalized):   0.4866840444949625
 ***************************** 
Processing Query:  material properties of photoelastic materials  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.1288546208148153
Doc#: 462  Document Headline:  photo-thermoelasticity .
Document Vector: 
Lemma: also
Okapi Weight (Un-normalized):   0.44014920746000397
Lemma: application
Okapi Weight (Un-normalized):   0.4636349882577804
Lemma: apply
Okapi Weight (Un-normalized):   0.45189209785889217
Lemma: be
Okapi Weight (Un-normalized):   0.4318174941288902
Lemma: beam
Okapi Weight (Un-normalized):   0.5864203219287061
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calibration
Okapi Weight (Un-normalized):   0.5402950756808842
Lemma: coefficient
Okapi Weight (Un-normalized):   0.45189209785889217
Lemma: conduct
Okapi Weight (Un-normalized):   0.476431141319779
Lemma: contracting
Okapi Weight (Un-normalized):   0.6098039215686275
Lemma: correlate
Okapi Weight (Un-normalized):   0.5029683239841993
Lemma: datum
Okapi Weight (Un-normalized):   0.45189209785889217
Lemma: depth
Okapi Weight (Un-normalized):   0.5460653141260767
Lemma: description
Okapi Weight (Un-normalized):   0.5082486354486692
Lemma: develop
Okapi Weight (Un-normalized):   0.45189209785889217
Lemma: differential
Okapi Weight (Un-normalized):   0.5100782927667964
Lemma: disk
Okapi Weight (Un-normalized):   0.5333727802488485
Lemma: edge
Okapi Weight (Un-normalized):   0.456356537589777
Lemma: elastic
Okapi Weight (Un-normalized):   0.4837095919877824
Lemma: elasticity
Okapi Weight (Un-normalized):   0.5460653141260767
Lemma: equipment
Okapi Weight (Un-normalized):   0.5402950756808842
Lemma: expansion
Okapi Weight (Un-normalized):   0.4837095919877824
Lemma: experimental
Okapi Weight (Un-normalized):   0.44014920746000397
Lemma: exploratory
Okapi Weight (Un-normalized):   0.5495801103786215
Lemma: field
Okapi Weight (Un-normalized):   0.46022381119000594
Lemma: fringe
Okapi Weight (Un-normalized):   0.5696547141086235
Lemma: from
Okapi Weight (Un-normalized):   0.420074603730002
Lemma: function
Okapi Weight (Un-normalized):   0.456356537589777
Lemma: gerardg
Okapi Weight (Un-normalized):   0.5431175314442032
Lemma: gilbertac
Okapi Weight (Un-normalized):   0.6098039215686275
Lemma: include
Okapi Weight (Un-normalized):   0.45189209785889217
Lemma: inclusion
Okapi Weight (Un-normalized):   0.5534473839788504
Lemma: into
Okapi Weight (Un-normalized):   0.46022381119000594
Lemma: investigation
Okapi Weight (Un-normalized):   0.46907121857962814
Lemma: jappmech
Okapi Weight (Un-normalized):   0.5402950756808842
Lemma: length
Okapi Weight (Un-normalized):   0.4742848609684427
Lemma: long
Okapi Weight (Un-normalized):   0.4908087137159572
Lemma: material
Okapi Weight (Un-normalized):   0.5556610790725702
Lemma: model
Okapi Weight (Un-normalized):   0.456356537589777
Lemma: modulus
Okapi Weight (Un-normalized):   0.5353322783108937
Lemma: obtain
Okapi Weight (Un-normalized):   0.44714844166314965
Lemma: optical
Okapi Weight (Un-normalized):   0.5534473839788504
Lemma: over
Okapi Weight (Un-normalized):   0.4466117863944222
Lemma: paper
Okapi Weight (Un-normalized):   0.45189209785889217
Lemma: paraplex
Okapi Weight (Un-normalized):   0.5897293178386255
Lemma: phase
Okapi Weight (Un-normalized):   0.5230429277142012
Lemma: phenomenon
Okapi Weight (Un-normalized):   0.4895213226051851
Lemma: photo
Okapi Weight (Un-normalized):   0.5696547141086235
Lemma: photoelastic
Okapi Weight (Un-normalized):   0.6098039215686275
Lemma: photographic
Okapi Weight (Un-normalized):   0.5696547141086235
Lemma: physical
Okapi Weight (Un-normalized):   0.4932235727888445
Lemma: plane
Okapi Weight (Un-normalized):   0.476431141319779
Lemma: plastic
Okapi Weight (Un-normalized):   0.5121159090488981
Lemma: present
Okapi Weight (Un-normalized):   0.420074603730002
Lemma: problem
Okapi Weight (Un-normalized):   0.44014920746000397
Lemma: produce
Okapi Weight (Un-normalized):   0.5215912068792147
Lemma: property
Okapi Weight (Un-normalized):   0.5066431510227681
Lemma: range
Okapi Weight (Un-normalized):   0.44014920746000397
Lemma: ratio
Okapi Weight (Un-normalized):   0.44014920746000397
Lemma: result
Okapi Weight (Un-normalized):   0.420074603730002
Lemma: room
Okapi Weight (Un-normalized):   0.5696547141086235
Lemma: shock
Okapi Weight (Un-normalized):   0.4466117863944222
Lemma: stress
Okapi Weight (Un-normalized):   0.4942968833262993
Lemma: sudden
Okapi Weight (Un-normalized):   0.5376712508650707
Lemma: suddenly
Okapi Weight (Un-normalized):   0.5534473839788504
Lemma: summarize
Okapi Weight (Un-normalized):   0.5293395375339569
Lemma: technique
Okapi Weight (Un-normalized):   0.476431141319779
Lemma: temperature
Okapi Weight (Un-normalized):   0.4971608081518611
Lemma: theory
Okapi Weight (Un-normalized):   0.4318174941288902
Lemma: thermal
Okapi Weight (Un-normalized):   0.5417575863395525
Lemma: thermoelasticity
Okapi Weight (Un-normalized):   0.6098039215686275
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transient
Okapi Weight (Un-normalized):   0.5068355975844282
Lemma: upon
Okapi Weight (Un-normalized):   0.5240442380061086
Lemma: upper
Okapi Weight (Un-normalized):   0.5021288005292106
Lemma: use
Okapi Weight (Un-normalized):   0.420074603730002
Lemma: value
Okapi Weight (Un-normalized):   0.44014920746000397
Lemma: various
Okapi Weight (Un-normalized):   0.46022381119000594

Rank#: 2
Cosine Similarity: 0.10446909547023886
Doc#: 1099  Document Headline:  a theoretical study of stagnation point ablation .
Document Vector: 
Lemma: ablation
Okapi Weight (Un-normalized):   0.6941410504947577
Lemma: analysis
Okapi Weight (Un-normalized):   0.47205664212763176
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: automatic
Okapi Weight (Un-normalized):   0.5871536949654965
Lemma: capacity
Okapi Weight (Un-normalized):   0.5800316357466309
Lemma: discuss
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: effective
Okapi Weight (Un-normalized):   0.5357177944001795
Lemma: enthalpy
Okapi Weight (Un-normalized):   0.5397080891488677
Lemma: give
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: good
Okapi Weight (Un-normalized):   0.48720527939347785
Lemma: heat
Okapi Weight (Un-normalized):   0.48365517088969623
Lemma: increase
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: linearly
Okapi Weight (Un-normalized):   0.5586738372676369
Lemma: make
Okapi Weight (Un-normalized):   0.4416074923223949
Lemma: material
Okapi Weight (Un-normalized):   0.5582478223220655
Lemma: mechanism
Okapi Weight (Un-normalized):   0.6012168221053539
Lemma: most
Okapi Weight (Un-normalized):   0.5025613668381779
Lemma: nasa
Okapi Weight (Un-normalized):   0.48321498464478974
Lemma: parameter
Okapi Weight (Un-normalized):   0.48321498464478974
Lemma: place
Okapi Weight (Un-normalized):   0.5415559078944135
Lemma: point
Okapi Weight (Un-normalized):   0.4931318589139062
Lemma: property
Okapi Weight (Un-normalized):   0.49411030207778467
Lemma: reduce
Okapi Weight (Un-normalized):   0.4908149400675471
Lemma: result
Okapi Weight (Un-normalized):   0.4262514048776949
Lemma: robert
Okapi Weight (Un-normalized):   0.6134050998431914
Lemma: shield
Okapi Weight (Un-normalized):   0.7044829473151835
Lemma: significant
Okapi Weight (Un-normalized):   0.565188501041538
Lemma: simplify
Okapi Weight (Un-normalized):   0.5187498563977901
Lemma: stagnation
Okapi Weight (Un-normalized):   0.5196834919535122
Lemma: stream
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: study
Okapi Weight (Un-normalized):   0.46095387451578296
Lemma: surface
Okapi Weight (Un-normalized):   0.4525028097553898
Lemma: take
Okapi Weight (Un-normalized):   0.4908149400675471
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theoretical
Okapi Weight (Un-normalized):   0.4678588972000898
Lemma: thermal
Okapi Weight (Un-normalized):   0.5050056195107796
Lemma: tr
Okapi Weight (Un-normalized):   0.5744105587869557
Lemma: transfer
Okapi Weight (Un-normalized):   0.4678588972000898

Rank#: 3
Cosine Similarity: 0.09893018499780494
Doc#: 817  Document Headline:  loading paths and the incremental stress law .
Document Vector: 
Lemma: also
Okapi Weight (Un-normalized):   0.450872287713297
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: concerned
Okapi Weight (Un-normalized):   0.5362754635089411
Lemma: deformation
Okapi Weight (Un-normalized):   0.5260156500450777
Lemma: differential
Okapi Weight (Un-normalized):   0.5304514631640944
Lemma: directly
Okapi Weight (Un-normalized):   0.5362754635089411
Lemma: express
Okapi Weight (Un-normalized):   0.5195610608601411
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: function
Okapi Weight (Un-normalized):   0.4989675782064377
Lemma: give
Okapi Weight (Un-normalized):   0.4254361438566485
Lemma: hankelmangh
Okapi Weight (Un-normalized):   0.6658385093167702
Lemma: harden
Okapi Weight (Un-normalized):   0.6254707139475366
Lemma: incremental
Okapi Weight (Un-normalized):   0.641764147860612
Lemma: introduce
Okapi Weight (Un-normalized):   0.5117236178298641
Lemma: law
Okapi Weight (Un-normalized):   0.6053261951838156
Lemma: load
Okapi Weight (Un-normalized):   0.4714082836541274
Lemma: material
Okapi Weight (Un-normalized):   0.5117236178298641
Lemma: math
Okapi Weight (Un-normalized):   0.5294054366953973
Lemma: mean
Okapi Weight (Un-normalized):   0.5166237657456821
Lemma: occasion
Okapi Weight (Un-normalized):   0.6404023654601217
Lemma: paper
Okapi Weight (Un-normalized):   0.46575147803238515
Lemma: path
Okapi Weight (Un-normalized):   0.539691565397822
Lemma: phy
Okapi Weight (Un-normalized):   0.5502485189353823
Lemma: plastic
Okapi Weight (Un-normalized):   0.5968864744273333
Lemma: prager
Okapi Weight (Un-normalized):   0.6658385093167702
Lemma: property
Okapi Weight (Un-normalized):   0.49118762188903364
Lemma: refer
Okapi Weight (Un-normalized):   0.563883637620666
Lemma: shall
Okapi Weight (Un-normalized):   0.5850765470914264
Lemma: strain
Okapi Weight (Un-normalized):   0.6434640603155053
Lemma: stress
Okapi Weight (Un-normalized):   0.5454242450103122
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: total
Okapi Weight (Un-normalized):   0.5017445754265939
Lemma: warnerwh
Okapi Weight (Un-normalized):   0.6658385093167702
Lemma: we
Okapi Weight (Un-normalized):   0.5334870391812145
Lemma: work
Okapi Weight (Un-normalized):   0.49118762188903364

Rank#: 4
Cosine Similarity: 0.09171973573383764
Doc#: 463  Document Headline:  physical properties of plastics for photo-thermoelastic investigation .
Document Vector: 
Lemma: also
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: application
Okapi Weight (Un-normalized):   0.4737587363897
Lemma: be
Okapi Weight (Un-normalized):   0.4524860010967138
Lemma: castolite
Okapi Weight (Un-normalized):   0.6431818181818182
Lemma: coefficient
Okapi Weight (Un-normalized):   0.4601476588818978
Lemma: conduction
Okapi Weight (Un-normalized):   0.5163414534352389
Lemma: determine
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: elasticity
Okapi Weight (Un-normalized):   0.5693029777370435
Lemma: epoxy
Okapi Weight (Un-normalized):   0.6431818181818182
Lemma: evaluate
Okapi Weight (Un-normalized):   0.5130369139467819
Lemma: expansion
Okapi Weight (Un-normalized):   0.4970270270767478
Lemma: figure
Okapi Weight (Un-normalized):   0.6200111631059172
Lemma: fringe
Okapi Weight (Un-normalized):   0.5966452368077226
Lemma: from
Okapi Weight (Un-normalized):   0.4232682906870478
Lemma: function
Okapi Weight (Un-normalized):   0.4653223503881506
Lemma: gerardg
Okapi Weight (Un-normalized):   0.5658862296285083
Lemma: heat
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: hysol
Okapi Weight (Un-normalized):   0.6431818181818182
Lemma: importance
Okapi Weight (Un-normalized):   0.5163414534352389
Lemma: interest
Okapi Weight (Un-normalized):   0.5152756798707813
Lemma: investigate
Okapi Weight (Un-normalized):   0.4737587363897
Lemma: investigation
Okapi Weight (Un-normalized):   0.4768906018150577
Lemma: japp
Okapi Weight (Un-normalized):   0.6199135274947705
Lemma: manner
Okapi Weight (Un-normalized):   0.505255554534405
Lemma: material
Okapi Weight (Un-normalized):   0.5454515024577475
Lemma: mech
Okapi Weight (Un-normalized):   0.4951082735627191
Lemma: merit
Okapi Weight (Un-normalized):   0.5658862296285083
Lemma: method
Okapi Weight (Un-normalized):   0.43687936819485
Lemma: modulus
Okapi Weight (Un-normalized):   0.5568624134967177
Lemma: new
Okapi Weight (Un-normalized):   0.4951082735627191
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: op
Okapi Weight (Un-normalized):   0.6431818181818182
Lemma: optical
Okapi Weight (Un-normalized):   0.653126142843818
Lemma: over
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: paraplex
Okapi Weight (Un-normalized):   0.6199135274947705
Lemma: photo
Okapi Weight (Un-normalized):   0.5966452368077226
Lemma: photothermoelastic
Okapi Weight (Un-normalized):   0.7258222333717915
Lemma: physical
Okapi Weight (Un-normalized):   0.5537812036301155
Lemma: plastic
Okapi Weight (Un-normalized):   0.5299525309430411
Lemma: potentially
Okapi Weight (Un-normalized):   0.6431818181818182
Lemma: present
Okapi Weight (Un-normalized):   0.43311497973790086
Lemma: property
Okapi Weight (Un-normalized):   0.5382122009594243
Lemma: range
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: rate
Okapi Weight (Un-normalized):   0.4737587363897
Lemma: relative
Okapi Weight (Un-normalized):   0.5193496482544128
Lemma: resin
Okapi Weight (Un-normalized):   0.6062544599179169
Lemma: result
Okapi Weight (Un-normalized):   0.4232682906870478
Lemma: sensitivity
Okapi Weight (Un-normalized):   0.589154520315556
Lemma: temperature
Okapi Weight (Un-normalized):   0.4768906018150577
Lemma: thermal
Okapi Weight (Un-normalized):   0.5324599189516034
Lemma: thermoelastic
Okapi Weight (Un-normalized):   0.5966452368077226
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: tramposchh
Okapi Weight (Un-normalized):   0.5966452368077226
Lemma: value
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: well
Okapi Weight (Un-normalized):   0.4698048720611433

Rank#: 5
Cosine Similarity: 0.08982687626609681
Doc#: 1027  Document Headline:  note on creep buckling of columns .
Document Vector: 
Lemma: above
Okapi Weight (Un-normalized):   0.5005638792403577
Lemma: account
Okapi Weight (Un-normalized):   0.4951082735627191
Lemma: agree
Okapi Weight (Un-normalized):   0.505255554534405
Lemma: alloy
Okapi Weight (Un-normalized):   0.5499162821416319
Lemma: aluminum
Okapi Weight (Un-normalized):   0.5545911771066199
Lemma: application
Okapi Weight (Un-normalized):   0.4737587363897
Lemma: behavior
Okapi Weight (Un-normalized):   0.5037633512014645
Lemma: between
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: buckle
Okapi Weight (Un-normalized):   0.4804950605144168
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: column
Okapi Weight (Un-normalized):   0.522110302887361
Lemma: condition
Okapi Weight (Un-normalized):   0.4465365813740955
Lemma: creep
Okapi Weight (Un-normalized):   0.6051779886663287
Lemma: curve
Okapi Weight (Un-normalized):   0.5260804810989347
Lemma: datum
Okapi Weight (Un-normalized):   0.4601476588818978
Lemma: elasticity
Okapi Weight (Un-normalized):   0.5693029777370435
Lemma: equicohesive
Okapi Weight (Un-normalized):   0.6431818181818182
Lemma: expansion
Okapi Weight (Un-normalized):   0.4970270270767478
Lemma: four
Okapi Weight (Un-normalized):   0.5163414534352389
Lemma: heating
Okapi Weight (Un-normalized):   0.4970270270767478
Lemma: include
Okapi Weight (Un-normalized):   0.4601476588818978
Lemma: information
Okapi Weight (Un-normalized):   0.5640581104360445
Lemma: integrate
Okapi Weight (Un-normalized):   0.5238321699274054
Lemma: linear
Okapi Weight (Un-normalized):   0.4885906410751984
Lemma: material
Okapi Weight (Un-normalized):   0.5022017185830007
Lemma: may
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: metal
Okapi Weight (Un-normalized):   0.6314301517970382
Lemma: note
Okapi Weight (Un-normalized):   0.4804950605144168
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: phenomenological
Okapi Weight (Un-normalized):   0.6199135274947705
Lemma: polycrystalline
Okapi Weight (Un-normalized):   0.6431818181818182
Lemma: property
Okapi Weight (Un-normalized):   0.4834159495689455
Lemma: provide
Okapi Weight (Un-normalized):   0.4804950605144168
Lemma: rapid
Okapi Weight (Un-normalized):   0.5262599056572903
Lemma: rate
Okapi Weight (Un-normalized):   0.5049720021934275
Lemma: reasonably
Okapi Weight (Un-normalized):   0.531322886419572
Lemma: relation
Okapi Weight (Un-normalized):   0.5680089912172473
Lemma: rupture
Okapi Weight (Un-normalized):   0.6062544599179169
Lemma: sheet
Okapi Weight (Un-normalized):   0.5458174109025674
Lemma: show
Okapi Weight (Un-normalized):   0.43687936819485
Lemma: strain
Okapi Weight (Un-normalized):   0.5698561031760916
Lemma: stress
Okapi Weight (Un-normalized):   0.5049720021934275
Lemma: suggest
Okapi Weight (Un-normalized):   0.5022017185830007
Lemma: temperature
Okapi Weight (Un-normalized):   0.4768906018150577
Lemma: test
Okapi Weight (Un-normalized):   0.45402729786626217
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: thermal
Okapi Weight (Un-normalized):   0.493073162748191
Lemma: these
Okapi Weight (Un-normalized):   0.43687936819485
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: under
Okapi Weight (Un-normalized):   0.4653223503881506
Lemma: various
Okapi Weight (Un-normalized):   0.4698048720611433
Lemma: viscosity
Okapi Weight (Un-normalized):   0.5037633512014645
Lemma: well
Okapi Weight (Un-normalized):   0.4698048720611433
Lemma: yield
Okapi Weight (Un-normalized):   0.4970270270767478
 ***************************** 
Processing Query:  can the transverse potential flow about a body of revolution be calculated efficiently by an electronic computer  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.23258321310257524
Doc#: 498  Document Headline:  calculation of potential flow about bodies of revolution having axes perpendicular to the free-stream direction .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.4967014981447015
Lemma: accuracy
Okapi Weight (Un-normalized):   0.4797979288107832
Lemma: ae
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: after
Okapi Weight (Un-normalized):   0.4956826906757104
Lemma: agreement
Okapi Weight (Un-normalized):   0.4537230545248342
Lemma: aid
Okapi Weight (Un-normalized):   0.5143844452004753
Lemma: also
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: analytic
Okapi Weight (Un-normalized):   0.5096125682138091
Lemma: angle
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.4765461525405683
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.46860377160810474
Lemma: axis
Okapi Weight (Un-normalized):   0.5333009966046094
Lemma: axisymmetric
Okapi Weight (Un-normalized):   0.49099208601346167
Lemma: basic
Okapi Weight (Un-normalized):   0.49969090299460267
Lemma: body
Okapi Weight (Un-normalized):   0.48930384463066307
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.50600121458492
Lemma: calculation
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: case
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: certain
Okapi Weight (Un-normalized):   0.46620154509596895
Lemma: combine
Okapi Weight (Un-normalized):   0.49296493857305423
Lemma: compare
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: comparison
Okapi Weight (Un-normalized):   0.4635702036700119
Lemma: computer
Okapi Weight (Un-normalized):   0.505095056210511
Lemma: datum
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: derive
Okapi Weight (Un-normalized):   0.45740961440542627
Lemma: describe
Okapi Weight (Un-normalized):   0.46066139067564116
Lemma: direction
Okapi Weight (Un-normalized):   0.517329832806345
Lemma: distribution
Okapi Weight (Un-normalized):   0.45740961440542627
Lemma: electronic
Okapi Weight (Un-normalized):   0.5392398321575684
Lemma: ellipsoid
Okapi Weight (Un-normalized):   0.5696298361941747
Lemma: equation
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: exhibit
Okapi Weight (Un-normalized):   0.5776777205812696
Lemma: experimental
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: forward
Okapi Weight (Un-normalized):   0.49390089900783246
Lemma: free
Okapi Weight (Un-normalized):   0.47420085020944397
Lemma: general
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: have
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: hessjl
Okapi Weight (Un-normalized):   0.6
Lemma: make
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: method
Okapi Weight (Un-normalized):   0.454595251608077
Lemma: off
Okapi Weight (Un-normalized):   0.5025249982473808
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: other
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: perpendicular
Okapi Weight (Un-normalized):   0.5935125101081004
Lemma: point
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: possible
Okapi Weight (Un-normalized):   0.46860377160810474
Lemma: potential
Okapi Weight (Un-normalized):   0.5316104646148703
Lemma: present
Okapi Weight (Un-normalized):   0.4191365381351421
Lemma: pressure
Okapi Weight (Un-normalized):   0.42870480720271315
Lemma: property
Okapi Weight (Un-normalized):   0.46860377160810474
Lemma: quite
Okapi Weight (Un-normalized):   0.505701854013905
Lemma: region
Okapi Weight (Un-normalized):   0.45740961440542627
Lemma: revolution
Okapi Weight (Un-normalized):   0.5595958576215664
Lemma: satisfactory
Okapi Weight (Un-normalized):   0.49199613079511834
Lemma: sc
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: select
Okapi Weight (Un-normalized):   0.5199245996208031
Lemma: separate
Okapi Weight (Un-normalized):   0.4840537498626547
Lemma: solution
Okapi Weight (Un-normalized):   0.44549604300673085
Lemma: stream
Okapi Weight (Un-normalized):   0.47420085020944397
Lemma: surface
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: then
Okapi Weight (Un-normalized):   0.46620154509596895
Lemma: these
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: type
Okapi Weight (Un-normalized):   0.4537230545248342
Lemma: variety
Okapi Weight (Un-normalized):   0.5143844452004753
Lemma: velocity
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: whose
Okapi Weight (Un-normalized):   0.4965322404337895

Rank#: 2
Cosine Similarity: 0.18713666772106402
Doc#: 106  Document Headline:  the transverse potential flow past a body of revolution .
Document Vector: 
Lemma: along
Okapi Weight (Un-normalized):   0.48950015516699047
Lemma: angle
Okapi Weight (Un-normalized):   0.4947998922078866
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: axis
Okapi Weight (Un-normalized):   0.5251158476902913
Lemma: azimuthal
Okapi Weight (Un-normalized):   0.6546367160465764
Lemma: body
Okapi Weight (Un-normalized):   0.4833868154938544
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: campbellij
Okapi Weight (Un-normalized):   0.6546367160465764
Lemma: component
Okapi Weight (Un-normalized):   0.5218748526187846
Lemma: consideration
Okapi Weight (Un-normalized):   0.5052603501760247
Lemma: elementary
Okapi Weight (Un-normalized):   0.5920787922014307
Lemma: entirely
Okapi Weight (Un-normalized):   0.5847693103715422
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.47563640571259547
Lemma: incompressible
Okapi Weight (Un-normalized):   0.48950015516699047
Lemma: inviscid
Okapi Weight (Un-normalized):   0.5101253693884116
Lemma: manner
Okapi Weight (Un-normalized):   0.5218748526187846
Lemma: meridian
Okapi Weight (Un-normalized):   0.6190210235232755
Lemma: past
Okapi Weight (Un-normalized):   0.5466944177046116
Lemma: perpendicular
Okapi Weight (Un-normalized):   0.5816301629961995
Lemma: potential
Okapi Weight (Un-normalized):   0.5681471010601924
Lemma: qjmechappmath
Okapi Weight (Un-normalized):   0.6276944847247315
Lemma: revolution
Okapi Weight (Un-normalized):   0.5529261799896203
Lemma: right
Okapi Weight (Un-normalized):   0.6007522534028868
Lemma: round
Okapi Weight (Un-normalized):   0.5790003103339809
Lemma: set
Okapi Weight (Un-normalized):   0.5164423864888352
Lemma: show
Okapi Weight (Un-normalized):   0.45812628778173375
Lemma: simple
Okapi Weight (Un-normalized):   0.47563640571259547
Lemma: stream
Okapi Weight (Un-normalized):   0.46964465765272373
Lemma: surface
Okapi Weight (Un-normalized):   0.45388446264368953
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transverse
Okapi Weight (Un-normalized):   0.5235291202964133
Lemma: vary
Okapi Weight (Un-normalized):   0.4854048526617579
Lemma: velocity
Okapi Weight (Un-normalized):   0.45388446264368953

Rank#: 3
Cosine Similarity: 0.1540627769639842
Doc#: 1255  Document Headline:  the flow about a charged body moving in the lower atmosphere .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.480023668224927
Lemma: acquire
Okapi Weight (Un-normalized):   0.5791888001809241
Lemma: action
Okapi Weight (Un-normalized):   0.5351665574750808
Lemma: ae
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: also
Okapi Weight (Un-normalized):   0.45701001152093373
Lemma: analyze
Okapi Weight (Un-normalized):   0.5271161239776643
Lemma: approach
Okapi Weight (Un-normalized):   0.4721849668020135
Lemma: assume
Okapi Weight (Un-normalized):   0.4568780439016723
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: atmosphere
Okapi Weight (Un-normalized):   0.4845479157937859
Lemma: base
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: body
Okapi Weight (Un-normalized):   0.48168655241197617
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: can
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: case
Okapi Weight (Un-normalized):   0.4451793652131805
Lemma: characterize
Okapi Weight (Un-normalized):   0.5162072095078568
Lemma: charge
Okapi Weight (Un-normalized):   0.5921655552813618
Lemma: compose
Okapi Weight (Un-normalized):   0.5300228480392335
Lemma: condition
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: debye
Okapi Weight (Un-normalized):   0.5791888001809241
Lemma: description
Okapi Weight (Un-normalized):   0.5022348223681876
Lemma: determine
Okapi Weight (Un-normalized):   0.44402224270584323
Lemma: different
Okapi Weight (Un-normalized):   0.47015792424797365
Lemma: discuss
Okapi Weight (Un-normalized):   0.47368437097364735
Lemma: distribution
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: electric
Okapi Weight (Un-normalized):   0.6491096600888475
Lemma: electrically
Okapi Weight (Un-normalized):   0.5133253299671375
Lemma: electron
Okapi Weight (Un-normalized):   0.6032202534660147
Lemma: equal
Okapi Weight (Un-normalized):   0.49392833174656253
Lemma: equation
Okapi Weight (Un-normalized):   0.4300498555661741
Lemma: equilibrium
Okapi Weight (Un-normalized):   0.4774956303103637
Lemma: exterior
Okapi Weight (Un-normalized):   0.5449225293133588
Lemma: field
Okapi Weight (Un-normalized):   0.4568780439016723
Lemma: finally
Okapi Weight (Un-normalized):   0.49724786154063266
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: force
Okapi Weight (Un-normalized):   0.5225298286179643
Lemma: formulum
Okapi Weight (Un-normalized):   0.49392833174656253
Lemma: gas
Okapi Weight (Un-normalized):   0.46009971113234815
Lemma: gasdynamic
Okapi Weight (Un-normalized):   0.6074059680862156
Lemma: give
Okapi Weight (Un-normalized):   0.42850500576046685
Lemma: high
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: hunzikerrr
Okapi Weight (Un-normalized):   0.5981481481481482
Lemma: hydrodynamic
Okapi Weight (Un-normalized):   0.5239781873127366
Lemma: hypersonic
Okapi Weight (Un-normalized):   0.4568780439016723
Lemma: indicate
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: ion
Okapi Weight (Un-normalized):   0.5412701042464759
Lemma: ionosphere
Okapi Weight (Un-normalized):   0.549099841595523
Lemma: lack
Okapi Weight (Un-normalized):   0.5351665574750808
Lemma: linearization
Okapi Weight (Un-normalized):   0.532500904809724
Lemma: local
Okapi Weight (Un-normalized):   0.4679685515006223
Lemma: lower
Okapi Weight (Un-normalized):   0.5188637361868279
Lemma: maxwell
Okapi Weight (Un-normalized):   0.5981481481481482
Lemma: mixture
Okapi Weight (Un-normalized):   0.5133253299671375
Lemma: model
Okapi Weight (Un-normalized):   0.4532256188347894
Lemma: move
Okapi Weight (Un-normalized):   0.4857637851761818
Lemma: negative
Okapi Weight (Un-normalized):   0.5085976370266442
Lemma: neutral
Okapi Weight (Un-normalized):   0.5259631813461347
Lemma: nonlinear
Okapi Weight (Un-normalized):   0.4947967398361205
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: particle
Okapi Weight (Un-normalized):   0.5239781873127366
Lemma: plane
Okapi Weight (Un-normalized):   0.4721849668020135
Lemma: potential
Okapi Weight (Un-normalized):   0.5306943824945811
Lemma: problem
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: reciprocal
Okapi Weight (Un-normalized):   0.5449225293133588
Lemma: resultant
Okapi Weight (Un-normalized):   0.5221540076709593
Lemma: sc
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: simple
Okapi Weight (Un-normalized):   0.4532256188347894
Lemma: solution
Okapi Weight (Un-normalized):   0.4300498555661741
Lemma: speed
Okapi Weight (Un-normalized):   0.4379186959344482
Lemma: statistical
Okapi Weight (Un-normalized):   0.5449225293133588
Lemma: subsonic
Okapi Weight (Un-normalized):   0.4679685515006223
Lemma: sum
Okapi Weight (Un-normalized):   0.5412701042464759
Lemma: supersonic
Okapi Weight (Un-normalized):   0.44402224270584323
Lemma: through
Okapi Weight (Un-normalized):   0.46009971113234815
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: total
Okapi Weight (Un-normalized):   0.4758373918688964
Lemma: transfer
Okapi Weight (Un-normalized):   0.4490092035333982
Lemma: travel
Okapi Weight (Un-normalized):   0.5259631813461347
Lemma: under
Okapi Weight (Un-normalized):   0.4532256188347894
Lemma: use
Okapi Weight (Un-normalized):   0.4189593479672241
Lemma: validity
Okapi Weight (Un-normalized):   0.5101036627364617

Rank#: 4
Cosine Similarity: 0.146558454500527
Doc#: 231  Document Headline:  practical calculation of second-order supersonic flow past non-lifting bodies of revolution .
Document Vector: 
Lemma: accuracy
Okapi Weight (Un-normalized):   0.4948708709194867
Lemma: angle
Okapi Weight (Un-normalized):   0.45881104424007785
Lemma: apply
Okapi Weight (Un-normalized):   0.45881104424007785
Lemma: approximate
Okapi Weight (Un-normalized):   0.4638707426017473
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.48156226180074674
Lemma: basic
Okapi Weight (Un-normalized):   0.5185214068935832
Lemma: body
Okapi Weight (Un-normalized):   0.47615076952124724
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.45881104424007785
Lemma: calculation
Okapi Weight (Un-normalized):   0.4984234418067418
Lemma: can
Okapi Weight (Un-normalized):   0.44550243512133786
Lemma: characteristic
Okapi Weight (Un-normalized):   0.4638707426017473
Lemma: compare
Okapi Weight (Un-normalized):   0.45881104424007785
Lemma: computation
Okapi Weight (Un-normalized):   0.5137560878033446
Lemma: computing
Okapi Weight (Un-normalized):   0.5332762000864112
Lemma: condition
Okapi Weight (Un-normalized):   0.44550243512133786
Lemma: corner
Okapi Weight (Un-normalized):   0.5446420488103328
Lemma: describe
Okapi Weight (Un-normalized):   0.4721196533588178
Lemma: detail
Okapi Weight (Un-normalized):   0.5205897477790103
Lemma: dykemd
Okapi Weight (Un-normalized):   0.59227534265644
Lemma: example
Okapi Weight (Un-normalized):   0.4787062813918742
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: form
Okapi Weight (Un-normalized):   0.4528266912470119
Lemma: function
Okapi Weight (Un-normalized):   0.4638707426017473
Lemma: give
Okapi Weight (Un-normalized):   0.4227512175606689
Lemma: increase
Okapi Weight (Un-normalized):   0.45881104424007785
Lemma: lifting
Okapi Weight (Un-normalized):   0.5193967406009753
Lemma: method
Okapi Weight (Un-normalized):   0.4360598266794089
Lemma: naca
Okapi Weight (Un-normalized):   0.4638707426017473
Lemma: necessarily
Okapi Weight (Un-normalized):   0.5533765820856795
Lemma: non
Okapi Weight (Un-normalized):   0.5056533824940238
Lemma: one
Okapi Weight (Un-normalized):   0.4528266912470119
Lemma: order
Okapi Weight (Un-normalized):   0.49148594431019504
Lemma: past
Okapi Weight (Un-normalized):   0.530351803530623
Lemma: practical
Okapi Weight (Un-normalized):   0.49664552304030635
Lemma: present
Okapi Weight (Un-normalized):   0.4227512175606689
Lemma: procedure
Okapi Weight (Un-normalized):   0.4888865179264208
Lemma: reduce
Okapi Weight (Un-normalized):   0.4787062813918742
Lemma: revolution
Okapi Weight (Un-normalized):   0.5358893111313603
Lemma: routine
Okapi Weight (Un-normalized):   0.5695241250957711
Lemma: sample
Okapi Weight (Un-normalized):   0.5533765820856795
Lemma: second
Okapi Weight (Un-normalized):   0.5205897477790103
Lemma: several
Okapi Weight (Un-normalized):   0.4787062813918742
Lemma: show
Okapi Weight (Un-normalized):   0.4360598266794089
Lemma: so
Okapi Weight (Un-normalized):   0.4866219601624162
Lemma: solution
Okapi Weight (Un-normalized):   0.4360598266794089
Lemma: standard
Okapi Weight (Un-normalized):   0.5394486514094281
Lemma: summarize
Okapi Weight (Un-normalized):   0.5465848092051512
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4756668787092478
Lemma: table
Okapi Weight (Un-normalized):   0.5185214068935832
Lemma: tangency
Okapi Weight (Un-normalized):   0.6016710274752965
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4360598266794089
Lemma: tn
Okapi Weight (Un-normalized):   0.4755779088076808
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: understand
Okapi Weight (Un-normalized):   0.5359903959605651
Lemma: use
Okapi Weight (Un-normalized):   0.4227512175606689
Lemma: van
Okapi Weight (Un-normalized):   0.5332762000864112
Lemma: without
Okapi Weight (Un-normalized):   0.4948708709194867
Lemma: zero
Okapi Weight (Un-normalized):   0.4755779088076808

Rank#: 5
Cosine Similarity: 0.14079101133278007
Doc#: 1301  Document Headline:  compressible boundary layers on bodies of revolution .
Document Vector: 
Lemma: along
Okapi Weight (Un-normalized):   0.46155666780716087
Lemma: already
Okapi Weight (Un-normalized):   0.545726542011914
Lemma: also
Okapi Weight (Un-normalized):   0.43706080688615756
Lemma: another
Okapi Weight (Un-normalized):   0.5085507512016019
Lemma: apply
Okapi Weight (Un-normalized):   0.4479003980235928
Lemma: arc
Okapi Weight (Un-normalized):   0.4705518227567191
Lemma: around
Okapi Weight (Un-normalized):   0.4860525287281642
Lemma: assume
Okapi Weight (Un-normalized):   0.4555912103292363
Lemma: axially
Okapi Weight (Un-normalized):   0.4918032563676811
Lemma: behaviour
Okapi Weight (Un-normalized):   0.5051123300874758
Lemma: between
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: body
Okapi Weight (Un-normalized):   0.48087990442897444
Lemma: boundary
Okapi Weight (Un-normalized):   0.44043995221448723
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4479003980235928
Lemma: can
Okapi Weight (Un-normalized):   0.45603492580506827
Lemma: clear
Okapi Weight (Un-normalized):   0.5380739480418045
Lemma: compressibility
Okapi Weight (Un-normalized):   0.5076126296428767
Lemma: compressible
Okapi Weight (Un-normalized):   0.46857064089394707
Lemma: cone
Okapi Weight (Un-normalized):   0.4641046635770921
Lemma: consideration
Okapi Weight (Un-normalized):   0.47239625894459614
Lemma: contour
Okapi Weight (Un-normalized):   0.5781224774403186
Lemma: correspond
Okapi Weight (Un-normalized):   0.46643080146667154
Lemma: describe
Okapi Weight (Un-normalized):   0.4587399891610281
Lemma: determine
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4873271234362292
Lemma: distribution
Okapi Weight (Un-normalized):   0.43706080688615756
Lemma: equation
Okapi Weight (Un-normalized):   0.42936999458051406
Lemma: example
Okapi Weight (Un-normalized):   0.4969244970390241
Lemma: exist
Okapi Weight (Un-normalized):   0.46857064089394707
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: form
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: former
Okapi Weight (Un-normalized):   0.5270811546446806
Lemma: hantzsche
Okapi Weight (Un-normalized):   0.5936651583710407
Lemma: have
Okapi Weight (Un-normalized):   0.45354438058720664
Lemma: incompressible
Okapi Weight (Un-normalized):   0.46155666780716087
Lemma: into
Okapi Weight (Un-normalized):   0.4555912103292363
Lemma: laminar
Okapi Weight (Un-normalized):   0.4784410997435007
Lemma: layer
Okapi Weight (Un-normalized):   0.46409580779091775
Lemma: make
Okapi Weight (Un-normalized):   0.42936999458051406
Lemma: manglerkw
Okapi Weight (Un-normalized):   0.5642569454549927
Lemma: mathematically
Okapi Weight (Un-normalized):   0.5380739480418045
Lemma: method
Okapi Weight (Un-normalized):   0.44440662806586273
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: paper
Okapi Weight (Un-normalized):   0.4479003980235928
Lemma: problem
Okapi Weight (Un-normalized):   0.43706080688615756
Lemma: process
Okapi Weight (Un-normalized):   0.478715810621064
Lemma: relation
Okapi Weight (Un-normalized):   0.5120698516101365
Lemma: report
Okapi Weight (Un-normalized):   0.46643080146667154
Lemma: revolution
Okapi Weight (Un-normalized):   0.5570276484184608
Lemma: same
Okapi Weight (Un-normalized):   0.4587399891610281
Lemma: shall
Okapi Weight (Un-normalized):   0.5348295207317632
Lemma: shape
Okapi Weight (Un-normalized):   0.45202141931364037
Lemma: show
Okapi Weight (Un-normalized):   0.44440662806586273
Lemma: simple
Okapi Weight (Un-normalized):   0.45202141931364037
Lemma: solve
Okapi Weight (Un-normalized):   0.47574233550696177
Lemma: still
Okapi Weight (Un-normalized):   0.5094570658307536
Lemma: suitable
Okapi Weight (Un-normalized):   0.4950476836777224
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: symmetrical
Okapi Weight (Un-normalized):   0.5034916083528291
Lemma: take
Okapi Weight (Un-normalized):   0.4641046635770921
Lemma: temperature
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: tip
Okapi Weight (Un-normalized):   0.5076126296428767
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: towards
Okapi Weight (Un-normalized):   0.5348295207317632
Lemma: treat
Okapi Weight (Un-normalized):   0.47574233550696177
Lemma: two
Okapi Weight (Un-normalized):   0.45354438058720664
Lemma: valid
Okapi Weight (Un-normalized):   0.49002034775852316
Lemma: velocity
Okapi Weight (Un-normalized):   0.43706080688615756
Lemma: well
Okapi Weight (Un-normalized):   0.4555912103292363
Lemma: wendt
Okapi Weight (Un-normalized):   0.5936651583710407
 ***************************** 
Processing Query:  can the three-dimensional problem of a transverse potential flow about a body of revolution be reduced to a two-dimensional problem  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.18828591763789682
Doc#: 445  Document Headline:  on the application of mathieu functions in the theory of subsonic compressible flow past oscillating airfoils .
Document Vector: 
Lemma: account
Okapi Weight (Un-normalized):   0.4945709386838336
Lemma: airfoil
Okapi Weight (Un-normalized):   0.5448657917095956
Lemma: amount
Okapi Weight (Un-normalized):   0.5156841570881471
Lemma: application
Okapi Weight (Un-normalized):   0.4733420203648995
Lemma: apply
Okapi Weight (Un-normalized):   0.48525627889836787
Lemma: appreciable
Okapi Weight (Un-normalized):   0.5382953179259984
Lemma: before
Okapi Weight (Un-normalized):   0.5432129273235093
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculation
Okapi Weight (Un-normalized):   0.48525627889836787
Lemma: can
Okapi Weight (Un-normalized):   0.4462736628352588
Lemma: compressible
Okapi Weight (Un-normalized):   0.5220465366783541
Lemma: correction
Okapi Weight (Un-normalized):   0.5186753564563653
Lemma: development
Okapi Weight (Un-normalized):   0.4945709386838336
Lemma: dimensional
Okapi Weight (Un-normalized):   0.5144843687442033
Lemma: effect
Okapi Weight (Un-normalized):   0.4329816308262046
Lemma: explicit
Okapi Weight (Un-normalized):   0.5432129273235093
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: formal
Okapi Weight (Un-normalized):   0.6186710781868904
Lemma: function
Okapi Weight (Un-normalized):   0.5176136436656216
Lemma: give
Okapi Weight (Un-normalized):   0.4231368314176294
Lemma: incorporation
Okapi Weight (Un-normalized):   0.6186710781868904
Lemma: mathieu
Okapi Weight (Un-normalized):   0.7632356908777023
Lemma: must
Okapi Weight (Un-normalized):   0.5112269603963577
Lemma: naca
Okapi Weight (Un-normalized):   0.46495329756109893
Lemma: numerical
Okapi Weight (Un-normalized):   0.4694104942528882
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: oscillate
Okapi Weight (Un-normalized):   0.5778474225358001
Lemma: past
Okapi Weight (Un-normalized):   0.5319265233048185
Lemma: problem
Okapi Weight (Un-normalized):   0.47686542742082094
Lemma: reissnere
Okapi Weight (Un-normalized):   0.581952349065723
Lemma: result
Okapi Weight (Un-normalized):   0.4231368314176294
Lemma: show
Okapi Weight (Un-normalized):   0.43667101018244975
Lemma: solution
Okapi Weight (Un-normalized):   0.4522746480721632
Lemma: specific
Okapi Weight (Un-normalized):   0.5074441177905327
Lemma: subsonic
Okapi Weight (Un-normalized):   0.5182379097245724
Lemma: supplement
Okapi Weight (Un-normalized):   0.5880858507092535
Lemma: term
Okapi Weight (Un-normalized):   0.4694104942528882
Lemma: theory
Okapi Weight (Un-normalized):   0.4609144100319525
Lemma: three
Okapi Weight (Un-normalized):   0.5095626060567722
Lemma: tn
Okapi Weight (Un-normalized):   0.47685889031289574
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: two
Okapi Weight (Un-normalized):   0.4609144100319525

Rank#: 2
Cosine Similarity: 0.18823086129322428
Doc#: 336  Document Headline:  simplified laminar boundary layer calculations for bodies of revolution and for yawed wings .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.44963902013236856
Lemma: also
Okapi Weight (Un-normalized):   0.44963902013236856
Lemma: body
Okapi Weight (Un-normalized):   0.44963902013236856
Lemma: boundary
Okapi Weight (Un-normalized):   0.4399317144618458
Lemma: boundarylayer
Okapi Weight (Un-normalized):   0.5407868178747404
Lemma: briefly
Okapi Weight (Un-normalized):   0.5273062914713736
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculation
Okapi Weight (Un-normalized):   0.5032219844733761
Lemma: case
Okapi Weight (Un-normalized):   0.43933799274117336
Lemma: comparison
Okapi Weight (Un-normalized):   0.48244862779019726
Lemma: compressible
Okapi Weight (Un-normalized):   0.49184310083371097
Lemma: correspond
Okapi Weight (Un-normalized):   0.4889770128735419
Lemma: crabtreelf
Okapi Weight (Un-normalized):   0.6200047572457781
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4641575028073576
Lemma: discuss
Okapi Weight (Un-normalized):   0.4641575028073576
Lemma: elementary
Okapi Weight (Un-normalized):   0.5769453116037422
Lemma: especially
Okapi Weight (Un-normalized):   0.552125801537558
Lemma: extend
Okapi Weight (Un-normalized):   0.4969671104651863
Lemma: here
Okapi Weight (Un-normalized):   0.5577913259749085
Lemma: improvement
Okapi Weight (Un-normalized):   0.5577913259749085
Lemma: introduction
Okapi Weight (Un-normalized):   0.5500189006894022
Lemma: karman
Okapi Weight (Un-normalized):   0.5273062914713736
Lemma: laminar
Okapi Weight (Un-normalized):   0.48046943095454564
Lemma: layer
Okapi Weight (Un-normalized):   0.4632902700115303
Lemma: method
Okapi Weight (Un-normalized):   0.4549289320363351
Lemma: momentum
Okapi Weight (Un-normalized):   0.515258235448026
Lemma: pohlhausen
Okapi Weight (Un-normalized):   0.545392218276085
Lemma: problem
Okapi Weight (Un-normalized):   0.46931259510725654
Lemma: propose
Okapi Weight (Un-normalized):   0.5716941014718548
Lemma: quadrature
Okapi Weight (Un-normalized):   0.5897167656465787
Lemma: reduce
Okapi Weight (Un-normalized):   0.4858613978820446
Lemma: revolution
Okapi Weight (Un-normalized):   0.5034954955485309
Lemma: rottn
Okapi Weight (Un-normalized):   0.6097549192615709
Lemma: sc
Okapi Weight (Un-normalized):   0.44963902013236856
Lemma: simple
Okapi Weight (Un-normalized):   0.4696771737473607
Lemma: simplify
Okapi Weight (Un-normalized):   0.5122725915033652
Lemma: since
Okapi Weight (Un-normalized):   0.5193161938797293
Lemma: solution
Okapi Weight (Un-normalized):   0.43933799274117336
Lemma: these
Okapi Weight (Un-normalized):   0.43933799274117336
Lemma: three
Okapi Weight (Un-normalized):   0.48244862779019726
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: turbulent
Okapi Weight (Un-normalized):   0.4858613978820446
Lemma: von
Okapi Weight (Un-normalized):   0.5346772327011097
Lemma: wing
Okapi Weight (Un-normalized):   0.4641575028073576
Lemma: yaw
Okapi Weight (Un-normalized):   0.5292960802475453

Rank#: 3
Cosine Similarity: 0.1796706336090919
Doc#: 1108  Document Headline:  a study of second-order supersonic flow theory .
Document Vector: 
Lemma: adopt
Okapi Weight (Un-normalized):   0.5102227687735404
Lemma: again
Okapi Weight (Un-normalized):   0.5049201552173227
Lemma: agree
Okapi Weight (Un-normalized):   0.46522879435934955
Lemma: also
Okapi Weight (Un-normalized):   0.4461000280779033
Lemma: approximation
Okapi Weight (Un-normalized):   0.44570963945277187
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.45169439128216343
Lemma: attempt
Okapi Weight (Un-normalized):   0.47567399052174486
Lemma: axially
Okapi Weight (Un-normalized):   0.47143844949738556
Lemma: body
Okapi Weight (Un-normalized):   0.471930078938883
Lemma: briefly
Okapi Weight (Un-normalized):   0.4739631622985093
Lemma: busemann
Okapi Weight (Un-normalized):   0.5133998795233555
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.45958342193178614
Lemma: can
Okapi Weight (Un-normalized):   0.46578665318747636
Lemma: case
Okapi Weight (Un-normalized):   0.42285481972638594
Lemma: characteristic
Okapi Weight (Un-normalized):   0.44048145657857224
Lemma: cone
Okapi Weight (Un-normalized):   0.47973994737638287
Lemma: consider
Okapi Weight (Un-normalized):   0.4334817057199371
Lemma: considerable
Okapi Weight (Un-normalized):   0.47336012432379915
Lemma: corner
Okapi Weight (Un-normalized):   0.49167453797837996
Lemma: derive
Okapi Weight (Un-normalized):   0.4432593573336663
Lemma: detail
Okapi Weight (Un-normalized):   0.45335954801958556
Lemma: develop
Okapi Weight (Un-normalized):   0.43727460550427466
Lemma: dimensional
Okapi Weight (Un-normalized):   0.45958342193178614
Lemma: discovery
Okapi Weight (Un-normalized):   0.5278196653012442
Lemma: discuss
Okapi Weight (Un-normalized):   0.43727460550427466
Lemma: down
Okapi Weight (Un-normalized):   0.490365719432577
Lemma: equation
Okapi Weight (Un-normalized):   0.42285481972638594
Lemma: equivalent
Okapi Weight (Un-normalized):   0.4745492110085493
Lemma: example
Okapi Weight (Un-normalized):   0.4498842628540048
Lemma: exist
Okapi Weight (Un-normalized):   0.45335954801958556
Lemma: find
Okapi Weight (Un-normalized):   0.4461000280779033
Lemma: first
Okapi Weight (Un-normalized):   0.5078951184083245
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: full
Okapi Weight (Un-normalized):   0.47919134517270895
Lemma: general
Okapi Weight (Un-normalized):   0.43727460550427466
Lemma: give
Okapi Weight (Un-normalized):   0.4144197857778888
Lemma: have
Okapi Weight (Un-normalized):   0.42285481972638594
Lemma: improvement
Okapi Weight (Un-normalized):   0.49167453797837996
Lemma: inclined
Okapi Weight (Un-normalized):   0.5610892801439047
Lemma: insight
Okapi Weight (Un-normalized):   0.5172225196321756
Lemma: insofar
Okapi Weight (Un-normalized):   0.5278196653012442
Lemma: integral
Okapi Weight (Un-normalized):   0.5151780389008864
Lemma: into
Okapi Weight (Un-normalized):   0.4432593573336663
Lemma: isolate
Okapi Weight (Un-normalized):   0.5049201552173227
Lemma: iteration
Okapi Weight (Un-normalized):   0.5974722004595857
Lemma: karman
Okapi Weight (Un-normalized):   0.4739631622985093
Lemma: know
Okapi Weight (Un-normalized):   0.456336525446323
Lemma: linearize
Okapi Weight (Un-normalized):   0.5096002236785035
Lemma: make
Okapi Weight (Un-normalized):   0.42285481972638594
Lemma: method
Okapi Weight (Un-normalized):   0.452134689175049
Lemma: modification
Okapi Weight (Un-normalized):   0.47674106305360336
Lemma: moore
Okapi Weight (Un-normalized):   0.5362844395742239
Lemma: more
Okapi Weight (Un-normalized):   0.4432593573336663
Lemma: naca
Okapi Weight (Un-normalized):   0.44048145657857224
Lemma: nature
Okapi Weight (Un-normalized):   0.47674106305360336
Lemma: numerical
Okapi Weight (Un-normalized):   0.4432593573336663
Lemma: once
Okapi Weight (Un-normalized):   0.4988906168185719
Lemma: only
Okapi Weight (Un-normalized):   0.44048145657857224
Lemma: order
Okapi Weight (Un-normalized):   0.5174134502295951
Lemma: other
Okapi Weight (Un-normalized):   0.45958342193178614
Lemma: over
Okapi Weight (Un-normalized):   0.4334817057199371
Lemma: partial
Okapi Weight (Un-normalized):   0.48138319721776296
Lemma: particular
Okapi Weight (Un-normalized):   0.5032272375915701
Lemma: plane
Okapi Weight (Un-normalized):   0.48775958440469935
Lemma: possibility
Okapi Weight (Un-normalized):   0.4739631622985093
Lemma: problem
Okapi Weight (Un-normalized):   0.4767054577487693
Lemma: process
Okapi Weight (Un-normalized):   0.4979147888213235
Lemma: readily
Okapi Weight (Un-normalized):   0.49580298299565173
Lemma: reduce
Okapi Weight (Un-normalized):   0.49961263738659073
Lemma: represent
Okapi Weight (Un-normalized):   0.4589403385459104
Lemma: result
Okapi Weight (Un-normalized):   0.42305001403895165
Lemma: revolution
Okapi Weight (Un-normalized):   0.4961168298246207
Lemma: second
Okapi Weight (Un-normalized):   0.5330864605172333
Lemma: secondorder
Okapi Weight (Un-normalized):   0.5278196653012442
Lemma: several
Okapi Weight (Un-normalized):   0.4498842628540048
Lemma: slight
Okapi Weight (Un-normalized):   0.4942932692237715
Lemma: smooth
Okapi Weight (Un-normalized):   0.4837408139122385
Lemma: solution
Okapi Weight (Un-normalized):   0.4662887026617219
Lemma: solve
Okapi Weight (Un-normalized):   0.49421607587451344
Lemma: step
Okapi Weight (Un-normalized):   0.4782455753369123
Lemma: study
Okapi Weight (Un-normalized):   0.4334817057199371
Lemma: supersonic
Okapi Weight (Un-normalized):   0.45352047518458993
Lemma: surface
Okapi Weight (Un-normalized):   0.4288395715557775
Lemma: symmetric
Okapi Weight (Un-normalized):   0.4669634114398742
Lemma: term
Okapi Weight (Un-normalized):   0.4432593573336663
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: then
Okapi Weight (Un-normalized):   0.4498842628540048
Lemma: theory
Okapi Weight (Un-normalized):   0.44563821814112686
Lemma: thereby
Okapi Weight (Un-normalized):   0.5049201552173227
Lemma: three
Okapi Weight (Un-normalized):   0.4765704892235415
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: treat
Okapi Weight (Un-normalized):   0.49421607587451344
Lemma: use
Okapi Weight (Un-normalized):   0.4144197857778888
Lemma: vandykemd
Okapi Weight (Un-normalized):   0.5507042253521126
Lemma: von
Okapi Weight (Un-normalized):   0.4782455753369123
Lemma: well
Okapi Weight (Un-normalized):   0.46915004211685485
Lemma: wing
Okapi Weight (Un-normalized):   0.43727460550427466
Lemma: write
Okapi Weight (Un-normalized):   0.49167453797837996

Rank#: 4
Cosine Similarity: 0.17823098412887126
Doc#: 801  Document Headline:  experimental study of the equivalence of transonic flow about slender cone-cylinders of circular and elliptic cross section .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.4708945549947452
Lemma: adequate
Okapi Weight (Un-normalized):   0.5058469899587
Lemma: aerodynamic
Okapi Weight (Un-normalized):   0.4757594500478595
Lemma: angle
Okapi Weight (Un-normalized):   0.4652784458163248
Lemma: application
Okapi Weight (Un-normalized):   0.4800505916007433
Lemma: approximately
Okapi Weight (Un-normalized):   0.46162827205231194
Lemma: area
Okapi Weight (Un-normalized):   0.4732212553282817
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.490531595832278
Lemma: body
Okapi Weight (Un-normalized):   0.47607218255579703
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculation
Okapi Weight (Un-normalized):   0.4418418496569724
Lemma: can
Okapi Weight (Un-normalized):   0.4323732739993708
Lemma: characteristic
Okapi Weight (Un-normalized):   0.4454416350526265
Lemma: choose
Okapi Weight (Un-normalized):   0.4918174899183089
Lemma: circular
Okapi Weight (Un-normalized):   0.48388914852240006
Lemma: closely
Okapi Weight (Un-normalized):   0.4888946325258867
Lemma: compare
Okapi Weight (Un-normalized):   0.4418418496569724
Lemma: cone
Okapi Weight (Un-normalized):   0.5213458728097418
Lemma: cross
Okapi Weight (Un-normalized):   0.4699574812106836
Lemma: cylinder
Okapi Weight (Un-normalized):   0.49847309351875385
Lemma: deduce
Okapi Weight (Un-normalized):   0.4992124792636248
Lemma: describe
Okapi Weight (Un-normalized):   0.45131042531457394
Lemma: determine
Okapi Weight (Un-normalized):   0.4375842072113128
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4418418496569724
Lemma: either
Okapi Weight (Un-normalized):   0.46875966066108754
Lemma: elliptic
Okapi Weight (Un-normalized):   0.5394873386987195
Lemma: equivalence
Okapi Weight (Un-normalized):   0.588166552007639
Lemma: equivalent
Okapi Weight (Un-normalized):   0.5305568916326496
Lemma: experiment
Okapi Weight (Un-normalized):   0.45131042531457394
Lemma: experimental
Okapi Weight (Un-normalized):   0.45050630003190634
Lemma: favorably
Okapi Weight (Un-normalized):   0.5206100494752521
Lemma: flat
Okapi Weight (Un-normalized):   0.4454416350526265
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: force
Okapi Weight (Un-normalized):   0.44855991099905623
Lemma: from
Okapi Weight (Un-normalized):   0.4161866369996854
Lemma: investigation
Okapi Weight (Un-normalized):   0.45863599850644693
Lemma: jone
Okapi Weight (Un-normalized):   0.5131233021300411
Lemma: know
Okapi Weight (Un-normalized):   0.4632394198685998
Lemma: lifting
Okapi Weight (Un-normalized):   0.4849462976607729
Lemma: linearly
Okapi Weight (Un-normalized):   0.4978384134930884
Lemma: load
Okapi Weight (Un-normalized):   0.4454416350526265
Lemma: mach
Okapi Weight (Un-normalized):   0.425655212657287
Lemma: make
Okapi Weight (Un-normalized):   0.425655212657287
Lemma: manner
Okapi Weight (Un-normalized):   0.4732212553282817
Lemma: model
Okapi Weight (Un-normalized):   0.4708945549947452
Lemma: naca
Okapi Weight (Un-normalized):   0.4454416350526265
Lemma: nonlinear
Okapi Weight (Un-normalized):   0.48093318499842697
Lemma: number
Okapi Weight (Un-normalized):   0.4161866369996854
Lemma: of
Okapi Weight (Un-normalized):   0.48019177730141305
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.4454416350526265
Lemma: over
Okapi Weight (Un-normalized):   0.45863599850644693
Lemma: pagewa
Okapi Weight (Un-normalized):   0.5691699604743083
Lemma: persist
Okapi Weight (Un-normalized):   0.5434813634211596
Lemma: predict
Okapi Weight (Un-normalized):   0.4537708442109982
Lemma: pressure
Okapi Weight (Un-normalized):   0.4161866369996854
Lemma: propose
Okapi Weight (Un-normalized):   0.48019177730141305
Lemma: range
Okapi Weight (Un-normalized):   0.45050630003190634
Lemma: related
Okapi Weight (Un-normalized):   0.527386841435751
Lemma: relationship
Okapi Weight (Un-normalized):   0.5432466081151006
Lemma: report
Okapi Weight (Un-normalized):   0.45802848665665774
Lemma: require
Okapi Weight (Un-normalized):   0.48736154563537937
Lemma: result
Okapi Weight (Un-normalized):   0.4161866369996854
Lemma: revolution
Okapi Weight (Un-normalized):   0.5053037416166964
Lemma: rule
Okapi Weight (Un-normalized):   0.5042895875767874
Lemma: same
Okapi Weight (Un-normalized):   0.45131042531457394
Lemma: section
Okapi Weight (Un-normalized):   0.4537708442109982
Lemma: shape
Okapi Weight (Un-normalized):   0.4454416350526265
Lemma: slender
Okapi Weight (Un-normalized):   0.5574588945224731
Lemma: slenderness
Okapi Weight (Un-normalized):   0.5367966864749375
Lemma: small
Okapi Weight (Un-normalized):   0.45863599850644693
Lemma: sonic
Okapi Weight (Un-normalized):   0.47516841442262564
Lemma: speed
Okapi Weight (Un-normalized):   0.45050630003190634
Lemma: study
Okapi Weight (Un-normalized):   0.45863599850644693
Lemma: successful
Okapi Weight (Un-normalized):   0.5177759845127259
Lemma: suggest
Okapi Weight (Un-normalized):   0.4710968477099135
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theory
Okapi Weight (Un-normalized):   0.4667186220500077
Lemma: three
Okapi Weight (Un-normalized):   0.4537708442109982
Lemma: tn
Okapi Weight (Un-normalized):   0.4537708442109982
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transonic
Okapi Weight (Un-normalized):   0.5797278822341387
Lemma: two
Okapi Weight (Un-normalized):   0.425655212657287
Lemma: use
Okapi Weight (Un-normalized):   0.4161866369996854
Lemma: vary
Okapi Weight (Un-normalized):   0.45131042531457394
Lemma: wing
Okapi Weight (Un-normalized):   0.4418418496569724
Lemma: winglike
Okapi Weight (Un-normalized):   0.5529833234746229

Rank#: 5
Cosine Similarity: 0.17807168339123738
Doc#: 1301  Document Headline:  compressible boundary layers on bodies of revolution .
Document Vector: 
Lemma: along
Okapi Weight (Un-normalized):   0.46155666780716087
Lemma: already
Okapi Weight (Un-normalized):   0.545726542011914
Lemma: also
Okapi Weight (Un-normalized):   0.43706080688615756
Lemma: another
Okapi Weight (Un-normalized):   0.5085507512016019
Lemma: apply
Okapi Weight (Un-normalized):   0.4479003980235928
Lemma: arc
Okapi Weight (Un-normalized):   0.4705518227567191
Lemma: around
Okapi Weight (Un-normalized):   0.4860525287281642
Lemma: assume
Okapi Weight (Un-normalized):   0.4555912103292363
Lemma: axially
Okapi Weight (Un-normalized):   0.4918032563676811
Lemma: behaviour
Okapi Weight (Un-normalized):   0.5051123300874758
Lemma: between
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: body
Okapi Weight (Un-normalized):   0.48087990442897444
Lemma: boundary
Okapi Weight (Un-normalized):   0.44043995221448723
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4479003980235928
Lemma: can
Okapi Weight (Un-normalized):   0.45603492580506827
Lemma: clear
Okapi Weight (Un-normalized):   0.5380739480418045
Lemma: compressibility
Okapi Weight (Un-normalized):   0.5076126296428767
Lemma: compressible
Okapi Weight (Un-normalized):   0.46857064089394707
Lemma: cone
Okapi Weight (Un-normalized):   0.4641046635770921
Lemma: consideration
Okapi Weight (Un-normalized):   0.47239625894459614
Lemma: contour
Okapi Weight (Un-normalized):   0.5781224774403186
Lemma: correspond
Okapi Weight (Un-normalized):   0.46643080146667154
Lemma: describe
Okapi Weight (Un-normalized):   0.4587399891610281
Lemma: determine
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: dimensional
Okapi Weight (Un-normalized):   0.4873271234362292
Lemma: distribution
Okapi Weight (Un-normalized):   0.43706080688615756
Lemma: equation
Okapi Weight (Un-normalized):   0.42936999458051406
Lemma: example
Okapi Weight (Un-normalized):   0.4969244970390241
Lemma: exist
Okapi Weight (Un-normalized):   0.46857064089394707
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: form
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: former
Okapi Weight (Un-normalized):   0.5270811546446806
Lemma: hantzsche
Okapi Weight (Un-normalized):   0.5936651583710407
Lemma: have
Okapi Weight (Un-normalized):   0.45354438058720664
Lemma: incompressible
Okapi Weight (Un-normalized):   0.46155666780716087
Lemma: into
Okapi Weight (Un-normalized):   0.4555912103292363
Lemma: laminar
Okapi Weight (Un-normalized):   0.4784410997435007
Lemma: layer
Okapi Weight (Un-normalized):   0.46409580779091775
Lemma: make
Okapi Weight (Un-normalized):   0.42936999458051406
Lemma: manglerkw
Okapi Weight (Un-normalized):   0.5642569454549927
Lemma: mathematically
Okapi Weight (Un-normalized):   0.5380739480418045
Lemma: method
Okapi Weight (Un-normalized):   0.44440662806586273
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: paper
Okapi Weight (Un-normalized):   0.4479003980235928
Lemma: problem
Okapi Weight (Un-normalized):   0.43706080688615756
Lemma: process
Okapi Weight (Un-normalized):   0.478715810621064
Lemma: relation
Okapi Weight (Un-normalized):   0.5120698516101365
Lemma: report
Okapi Weight (Un-normalized):   0.46643080146667154
Lemma: revolution
Okapi Weight (Un-normalized):   0.5570276484184608
Lemma: same
Okapi Weight (Un-normalized):   0.4587399891610281
Lemma: shall
Okapi Weight (Un-normalized):   0.5348295207317632
Lemma: shape
Okapi Weight (Un-normalized):   0.45202141931364037
Lemma: show
Okapi Weight (Un-normalized):   0.44440662806586273
Lemma: simple
Okapi Weight (Un-normalized):   0.45202141931364037
Lemma: solve
Okapi Weight (Un-normalized):   0.47574233550696177
Lemma: still
Okapi Weight (Un-normalized):   0.5094570658307536
Lemma: suitable
Okapi Weight (Un-normalized):   0.4950476836777224
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: symmetrical
Okapi Weight (Un-normalized):   0.5034916083528291
Lemma: take
Okapi Weight (Un-normalized):   0.4641046635770921
Lemma: temperature
Okapi Weight (Un-normalized):   0.4430262643640821
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: tip
Okapi Weight (Un-normalized):   0.5076126296428767
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: towards
Okapi Weight (Un-normalized):   0.5348295207317632
Lemma: treat
Okapi Weight (Un-normalized):   0.47574233550696177
Lemma: two
Okapi Weight (Un-normalized):   0.45354438058720664
Lemma: valid
Okapi Weight (Un-normalized):   0.49002034775852316
Lemma: velocity
Okapi Weight (Un-normalized):   0.43706080688615756
Lemma: well
Okapi Weight (Un-normalized):   0.4555912103292363
Lemma: wendt
Okapi Weight (Un-normalized):   0.5936651583710407
 ***************************** 
Processing Query:  are experimental pressure distributions on bodies of revolution at angle of attack available  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.21788982682799565
Doc#: 498  Document Headline:  calculation of potential flow about bodies of revolution having axes perpendicular to the free-stream direction .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.4967014981447015
Lemma: accuracy
Okapi Weight (Un-normalized):   0.4797979288107832
Lemma: ae
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: after
Okapi Weight (Un-normalized):   0.4956826906757104
Lemma: agreement
Okapi Weight (Un-normalized):   0.4537230545248342
Lemma: aid
Okapi Weight (Un-normalized):   0.5143844452004753
Lemma: also
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: analytic
Okapi Weight (Un-normalized):   0.5096125682138091
Lemma: angle
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.4765461525405683
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.46860377160810474
Lemma: axis
Okapi Weight (Un-normalized):   0.5333009966046094
Lemma: axisymmetric
Okapi Weight (Un-normalized):   0.49099208601346167
Lemma: basic
Okapi Weight (Un-normalized):   0.49969090299460267
Lemma: body
Okapi Weight (Un-normalized):   0.48930384463066307
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.50600121458492
Lemma: calculation
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: case
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: certain
Okapi Weight (Un-normalized):   0.46620154509596895
Lemma: combine
Okapi Weight (Un-normalized):   0.49296493857305423
Lemma: compare
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: comparison
Okapi Weight (Un-normalized):   0.4635702036700119
Lemma: computer
Okapi Weight (Un-normalized):   0.505095056210511
Lemma: datum
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: derive
Okapi Weight (Un-normalized):   0.45740961440542627
Lemma: describe
Okapi Weight (Un-normalized):   0.46066139067564116
Lemma: direction
Okapi Weight (Un-normalized):   0.517329832806345
Lemma: distribution
Okapi Weight (Un-normalized):   0.45740961440542627
Lemma: electronic
Okapi Weight (Un-normalized):   0.5392398321575684
Lemma: ellipsoid
Okapi Weight (Un-normalized):   0.5696298361941747
Lemma: equation
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: exhibit
Okapi Weight (Un-normalized):   0.5776777205812696
Lemma: experimental
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: forward
Okapi Weight (Un-normalized):   0.49390089900783246
Lemma: free
Okapi Weight (Un-normalized):   0.47420085020944397
Lemma: general
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: have
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: hessjl
Okapi Weight (Un-normalized):   0.6
Lemma: make
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: method
Okapi Weight (Un-normalized):   0.454595251608077
Lemma: off
Okapi Weight (Un-normalized):   0.5025249982473808
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: other
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: perpendicular
Okapi Weight (Un-normalized):   0.5935125101081004
Lemma: point
Okapi Weight (Un-normalized):   0.44946723347296264
Lemma: possible
Okapi Weight (Un-normalized):   0.46860377160810474
Lemma: potential
Okapi Weight (Un-normalized):   0.5316104646148703
Lemma: present
Okapi Weight (Un-normalized):   0.4191365381351421
Lemma: pressure
Okapi Weight (Un-normalized):   0.42870480720271315
Lemma: property
Okapi Weight (Un-normalized):   0.46860377160810474
Lemma: quite
Okapi Weight (Un-normalized):   0.505701854013905
Lemma: region
Okapi Weight (Un-normalized):   0.45740961440542627
Lemma: revolution
Okapi Weight (Un-normalized):   0.5595958576215664
Lemma: satisfactory
Okapi Weight (Un-normalized):   0.49199613079511834
Lemma: sc
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: select
Okapi Weight (Un-normalized):   0.5199245996208031
Lemma: separate
Okapi Weight (Un-normalized):   0.4840537498626547
Lemma: solution
Okapi Weight (Un-normalized):   0.44549604300673085
Lemma: stream
Okapi Weight (Un-normalized):   0.47420085020944397
Lemma: surface
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: then
Okapi Weight (Un-normalized):   0.46620154509596895
Lemma: these
Okapi Weight (Un-normalized):   0.4303306953378206
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: type
Okapi Weight (Un-normalized):   0.4537230545248342
Lemma: variety
Okapi Weight (Un-normalized):   0.5143844452004753
Lemma: velocity
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: whose
Okapi Weight (Un-normalized):   0.4965322404337895

Rank#: 2
Cosine Similarity: 0.21104271124510474
Doc#: 197  Document Headline:  pressure distributions on three bodies of revolution to determine the effect of reynolds number up to and including the transonic speed range .
Document Vector: 
Lemma: affect
Okapi Weight (Un-normalized):   0.471690882181122
Lemma: agreement
Okapi Weight (Un-normalized):   0.4648921938004582
Lemma: also
Okapi Weight (Un-normalized):   0.4289414781690488
Lemma: angle
Okapi Weight (Un-normalized):   0.4992953534850715
Lemma: approximation
Okapi Weight (Un-normalized):   0.44587115761338236
Lemma: area
Okapi Weight (Un-normalized):   0.4654592847987819
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5034697448059591
Lemma: base
Okapi Weight (Un-normalized):   0.4374063178912156
Lemma: be
Okapi Weight (Un-normalized):   0.4366365125247052
Lemma: between
Okapi Weight (Un-normalized):   0.43360001563414186
Lemma: body
Okapi Weight (Un-normalized):   0.47682537248209206
Lemma: cause
Okapi Weight (Un-normalized):   0.4999016523780035
Lemma: change
Okapi Weight (Un-normalized):   0.4799649895608882
Lemma: coefficient
Okapi Weight (Un-normalized):   0.45975157834363506
Lemma: comparison
Okapi Weight (Un-normalized):   0.4767865865590737
Lemma: conduct
Okapi Weight (Un-normalized):   0.45509523967927534
Lemma: cone
Okapi Weight (Un-normalized):   0.4799649895608882
Lemma: cross
Okapi Weight (Un-normalized):   0.46254149380319065
Lemma: determine
Okapi Weight (Un-normalized):   0.4536715207401438
Lemma: diameter
Okapi Weight (Un-normalized):   0.45914860829342247
Lemma: distribution
Okapi Weight (Un-normalized):   0.47205664212763176
Lemma: due
Okapi Weight (Un-normalized):   0.44587115761338236
Lemma: effect
Okapi Weight (Un-normalized):   0.438412686241046
Lemma: except
Okapi Weight (Un-normalized):   0.46801883674375516
Lemma: exist
Okapi Weight (Un-normalized):   0.45354809765923076
Lemma: experimental
Okapi Weight (Un-normalized):   0.44623013163785974
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: foot
Okapi Weight (Un-normalized):   0.47852206146884485
Lemma: from
Okapi Weight (Un-normalized):   0.43295951034946
Lemma: good
Okapi Weight (Un-normalized):   0.44807075471866625
Lemma: inch
Okapi Weight (Un-normalized):   0.4808185351447888
Lemma: include
Okapi Weight (Un-normalized):   0.45975157834363506
Lemma: increase
Okapi Weight (Un-normalized):   0.48519909829548497
Lemma: incremental
Okapi Weight (Un-normalized):   0.5585226820873439
Lemma: indicate
Okapi Weight (Un-normalized):   0.4374063178912156
Lemma: investigation
Okapi Weight (Un-normalized):   0.43360001563414186
Lemma: langley
Okapi Weight (Un-normalized):   0.48208418710011364
Lemma: length
Okapi Weight (Un-normalized):   0.45354809765923076
Lemma: lh
Okapi Weight (Un-normalized):   0.5512367491166078
Lemma: longitudinal
Okapi Weight (Un-normalized):   0.4702985754580693
Lemma: mach
Okapi Weight (Un-normalized):   0.44574543400206923
Lemma: model
Okapi Weight (Un-normalized):   0.4810263140288415
Lemma: naca
Okapi Weight (Un-normalized):   0.44062450059475095
Lemma: nature
Okapi Weight (Un-normalized):   0.47701223288771505
Lemma: negligible
Okapi Weight (Un-normalized):   0.4794711732475242
Lemma: normalforce
Okapi Weight (Un-normalized):   0.5367660100320835
Lemma: number
Okapi Weight (Un-normalized):   0.4418769748027651
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.4536715207401438
Lemma: paper
Okapi Weight (Un-normalized):   0.4374063178912156
Lemma: present
Okapi Weight (Un-normalized):   0.4144707390845244
Lemma: pressure
Okapi Weight (Un-normalized):   0.4403186133986538
Lemma: range
Okapi Weight (Un-normalized):   0.47205664212763176
Lemma: rear
Okapi Weight (Un-normalized):   0.48957133617053405
Lemma: result
Okapi Weight (Un-normalized):   0.4144707390845244
Lemma: revolution
Okapi Weight (Un-normalized):   0.49638809086834024
Lemma: reynold
Okapi Weight (Un-normalized):   0.5011442844719752
Lemma: rm
Okapi Weight (Un-normalized):   0.4808185351447888
Lemma: separate
Okapi Weight (Un-normalized):   0.4635600794014421
Lemma: slightly
Okapi Weight (Un-normalized):   0.4742245162288928
Lemma: small
Okapi Weight (Un-normalized):   0.43360001563414186
Lemma: speed
Okapi Weight (Un-normalized):   0.44623013163785974
Lemma: sting
Okapi Weight (Un-normalized):   0.5817811803459999
Lemma: subcritical
Okapi Weight (Un-normalized):   0.522295270947559
Lemma: such
Okapi Weight (Un-normalized):   0.44062450059475095
Lemma: swihartjm
Okapi Weight (Un-normalized):   0.5512367491166078
Lemma: test
Okapi Weight (Un-normalized):   0.4536715207401438
Lemma: theoretical
Okapi Weight (Un-normalized):   0.45975157834363506
Lemma: theory
Okapi Weight (Un-normalized):   0.4229355788066912
Lemma: these
Okapi Weight (Un-normalized):   0.4229355788066912
Lemma: three
Okapi Weight (Un-normalized):   0.44807075471866625
Lemma: through
Okapi Weight (Un-normalized):   0.4732730250494104
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transonic
Okapi Weight (Un-normalized):   0.5469806825871852
Lemma: tunnel
Okapi Weight (Un-normalized):   0.44062450059475095
Lemma: up
Okapi Weight (Un-normalized):   0.4767865865590737
Lemma: value
Okapi Weight (Un-normalized):   0.4289414781690488
Lemma: vary
Okapi Weight (Un-normalized):   0.44587115761338236
Lemma: velocity
Okapi Weight (Un-normalized):   0.4289414781690488
Lemma: very
Okapi Weight (Un-normalized):   0.4500605323340543
Lemma: whitcombcf
Okapi Weight (Un-normalized):   0.5512367491166078

Rank#: 3
Cosine Similarity: 0.21044930148956048
Doc#: 1006  Document Headline:  free-flight measurements of the static and dynamic
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.4680280098716835
Lemma: agreement
Okapi Weight (Un-normalized):   0.4680280098716835
Lemma: angle
Okapi Weight (Un-normalized):   0.46263898203085213
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.48687104807180126
Lemma: axisymmetric
Okapi Weight (Un-normalized):   0.5152207479697088
Lemma: be
Okapi Weight (Un-normalized):   0.438406915989903
Lemma: blunt
Okapi Weight (Un-normalized):   0.5309478206079603
Lemma: body
Okapi Weight (Un-normalized):   0.4788384437396442
Lemma: calculate
Okapi Weight (Un-normalized):   0.48809421328610825
Lemma: characteristic
Okapi Weight (Un-normalized):   0.4680280098716835
Lemma: computation
Okapi Weight (Un-normalized):   0.5211603302047457
Lemma: computer
Okapi Weight (Un-normalized):   0.5330789469174517
Lemma: consist
Okapi Weight (Un-normalized):   0.5125302298752916
Lemma: dimensional
Okapi Weight (Un-normalized):   0.46263898203085213
Lemma: distribution
Okapi Weight (Un-normalized):   0.4484641320818983
Lemma: dynamic
Okapi Weight (Un-normalized):   0.5064349258615864
Lemma: experimental
Okapi Weight (Un-normalized):   0.4484641320818983
Lemma: field
Okapi Weight (Un-normalized):   0.5022384811325482
Lemma: flight
Okapi Weight (Un-normalized):   0.48049718097859495
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: free
Okapi Weight (Un-normalized):   0.46263898203085213
Lemma: fuller
Okapi Weight (Un-normalized):   0.5905654780155798
Lemma: gas
Okapi Weight (Un-normalized):   0.4768138319798059
Lemma: good
Okapi Weight (Un-normalized):   0.48049718097859495
Lemma: have
Okapi Weight (Un-normalized):   0.438406915989903
Lemma: ibm
Okapi Weight (Un-normalized):   0.5805582397469751
Lemma: inviscid
Okapi Weight (Un-normalized):   0.49904766950910384
Lemma: measurement
Okapi Weight (Un-normalized):   0.47269619812284747
Lemma: method
Okapi Weight (Un-normalized):   0.438406915989903
Lemma: nose
Okapi Weight (Un-normalized):   0.48687104807180126
Lemma: number
Okapi Weight (Un-normalized):   0.42423206604094915
Lemma: numerically
Okapi Weight (Un-normalized):   0.5338473181004477
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.4562651149376458
Lemma: perfect
Okapi Weight (Un-normalized):   0.5353351801536996
Lemma: pressure
Okapi Weight (Un-normalized):   0.42423206604094915
Lemma: region
Okapi Weight (Un-normalized):   0.5022384811325482
Lemma: result
Okapi Weight (Un-normalized):   0.42423206604094915
Lemma: shape
Okapi Weight (Un-normalized):   0.4680280098716835
Lemma: shock
Okapi Weight (Un-normalized):   0.4562651149376458
Lemma: show
Okapi Weight (Un-normalized):   0.438406915989903
Lemma: solution
Okapi Weight (Un-normalized):   0.438406915989903
Lemma: static
Okapi Weight (Un-normalized):   0.49467203092754874
Lemma: study
Okapi Weight (Un-normalized):   0.4562651149376458
Lemma: subsonic
Okapi Weight (Un-normalized):   0.48687104807180126
Lemma: supersonic
Okapi Weight (Un-normalized):   0.4562651149376458
Lemma: surface
Okapi Weight (Un-normalized):   0.4484641320818983
Lemma: survey
Okapi Weight (Un-normalized):   0.5242931248093293
Lemma: transonic
Okapi Weight (Un-normalized):   0.5080612414879158
Lemma: two
Okapi Weight (Un-normalized):   0.438406915989903
Lemma: wave
Okapi Weight (Un-normalized):   0.46263898203085213
Lemma: zero
Okapi Weight (Un-normalized):   0.48049718097859495

Rank#: 4
Cosine Similarity: 0.2090412000488234
Doc#: 492  Document Headline:  prediction of ogive-forebody pressures at angles of attack .
Document Vector: 
Lemma: aerodynamicist
Okapi Weight (Un-normalized):   0.6449669673359468
Lemma: angle
Okapi Weight (Un-normalized):   0.513827827561441
Lemma: approximate
Okapi Weight (Un-normalized):   0.4727641371412311
Lemma: approximation
Okapi Weight (Un-normalized):   0.4821616304087798
Lemma: arbitrary
Okapi Weight (Un-normalized):   0.5036764344536812
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5578624421949936
Lemma: be
Okapi Weight (Un-normalized):   0.4410808152043899
Lemma: body
Okapi Weight (Un-normalized):   0.4518382172268406
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculate
Okapi Weight (Un-normalized):   0.4669999238178102
Lemma: calif
Okapi Weight (Un-normalized):   0.6038326948394492
Lemma: center
Okapi Weight (Un-normalized):   0.5329464436251687
Lemma: distribution
Okapi Weight (Un-normalized):   0.4518382172268406
Lemma: earl
Okapi Weight (Un-normalized):   0.6708860759493671
Lemma: edward
Okapi Weight (Un-normalized):   0.6449669673359468
Lemma: flight
Okapi Weight (Un-normalized):   0.4861014150973579
Lemma: forebody
Okapi Weight (Un-normalized):   0.666113452185222
Lemma: keener
Okapi Weight (Un-normalized):   0.6708860759493671
Lemma: lower
Okapi Weight (Un-normalized):   0.5080807390222001
Lemma: method
Okapi Weight (Un-normalized):   0.4410808152043899
Lemma: nasa
Okapi Weight (Un-normalized):   0.4821616304087798
Lemma: not
Okapi Weight (Un-normalized):   0.4601823064839376
Lemma: obtain
Okapi Weight (Un-normalized):   0.4566055418804675
Lemma: ogive
Okapi Weight (Un-normalized):   0.6449267602599513
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.4601823064839376
Lemma: prediction
Okapi Weight (Un-normalized):   0.505943393335687
Lemma: present
Okapi Weight (Un-normalized):   0.4259191086134203
Lemma: pressure
Okapi Weight (Un-normalized):   0.44403461463355276
Lemma: research
Okapi Weight (Un-normalized):   0.5101024946028807
Lemma: suggest
Okapi Weight (Un-normalized):   0.513844952345621
Lemma: surface
Okapi Weight (Un-normalized):   0.4714282411788443
Lemma: utilize
Okapi Weight (Un-normalized):   0.5406439455422981
Lemma: various
Okapi Weight (Un-normalized):   0.47775732584026087
Lemma: zero
Okapi Weight (Un-normalized):   0.4861014150973579

Rank#: 5
Cosine Similarity: 0.2089615972862567
Doc#: 248  Document Headline:  the application of lighthill formula for numerical calculation of pressure distributions on bodies of revolution at supersonic speed and zero angle of attack .
Document Vector: 
Lemma: angle
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: application
Okapi Weight (Un-normalized):   0.4676121750238917
Lemma: apply
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: approximation
Okapi Weight (Un-normalized):   0.4676121750238917
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5115028389174765
Lemma: base
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: body
Okapi Weight (Un-normalized):   0.4734202638412025
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculation
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: computing
Okapi Weight (Un-normalized):   0.5822003748016761
Lemma: could
Okapi Weight (Un-normalized):   0.49511640526800915
Lemma: determine
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: develop
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: digital
Okapi Weight (Un-normalized):   0.592521682047553
Lemma: distribution
Okapi Weight (Un-normalized):   0.4622058606722087
Lemma: drag
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: duct
Okapi Weight (Un-normalized):   0.5462757040441376
Lemma: exact
Okapi Weight (Un-normalized):   0.47892766477897036
Lemma: expect
Okapi Weight (Un-normalized):   0.5094038442332117
Lemma: expression
Okapi Weight (Un-normalized):   0.5215157460259929
Lemma: external
Okapi Weight (Un-normalized):   0.49060517785028723
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: formulum
Okapi Weight (Un-normalized):   0.5056693732148829
Lemma: from
Okapi Weight (Un-normalized):   0.43110293033610436
Lemma: give
Okapi Weight (Un-normalized):   0.43671013192060126
Lemma: good
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: integral
Okapi Weight (Un-normalized):   0.48531706585250844
Lemma: lighthill
Okapi Weight (Un-normalized):   0.6003944227108395
Lemma: linearize
Okapi Weight (Un-normalized):   0.5478909347358035
Lemma: mach
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: method
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: much
Okapi Weight (Un-normalized):   0.49368490870108395
Lemma: number
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: numerical
Okapi Weight (Un-normalized):   0.49330879100831304
Lemma: ohmanl
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: pointed
Okapi Weight (Un-normalized):   0.5157382468525161
Lemma: pressure
Okapi Weight (Un-normalized):   0.43110293033610436
Lemma: procedure
Okapi Weight (Un-normalized):   0.4833311105560195
Lemma: range
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: result
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: revolution
Okapi Weight (Un-normalized):   0.5530784969019606
Lemma: saab
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: show
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: slender
Okapi Weight (Un-normalized):   0.4833311105560195
Lemma: speed
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: supersonic
Okapi Weight (Un-normalized):   0.47221876778072513
Lemma: surface
Okapi Weight (Un-normalized):   0.44265853292625423
Lemma: than
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: theory
Okapi Weight (Un-normalized):   0.4492969782452679
Lemma: thickness
Okapi Weight (Un-normalized):   0.46398779938938134
Lemma: tn
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: various
Okapi Weight (Un-normalized):   0.46398779938938134
Lemma: wave
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: wider
Okapi Weight (Un-normalized):   0.5490635179109395
Lemma: zero
Okapi Weight (Un-normalized):   0.5033216981168295
 ***************************** 
Processing Query:  does there exist a good basic treatment of the dynamics of re-entry combining consideration of realistic effects with relative simplicity of results  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.1143214285212639
Doc#: 482  Document Headline:  a re-examination of the use of the simple concepts for prediction the shape and location of detached shock waves .
Document Vector: 
Lemma: can
Okapi Weight (Un-normalized):   0.4542413133896743
Lemma: concept
Okapi Weight (Un-normalized):   0.6011175345191803
Lemma: detach
Okapi Weight (Un-normalized):   0.6342030175639572
Lemma: examination
Okapi Weight (Un-normalized):   0.593350837182897
Lemma: exist
Okapi Weight (Un-normalized):   0.5003583552156444
Lemma: good
Okapi Weight (Un-normalized):   0.4900928714263745
Lemma: have
Okapi Weight (Un-normalized):   0.44298522385624906
Lemma: location
Okapi Weight (Un-normalized):   0.5666414776436756
Lemma: lovee
Okapi Weight (Un-normalized):   0.6292023952195973
Lemma: mach
Okapi Weight (Un-normalized):   0.44298522385624906
Lemma: make
Okapi Weight (Un-normalized):   0.44298522385624906
Lemma: method
Okapi Weight (Un-normalized):   0.44298522385624906
Lemma: modification
Okapi Weight (Un-normalized):   0.5443341848160488
Lemma: naca
Okapi Weight (Un-normalized):   0.4761373090616855
Lemma: nose
Okapi Weight (Un-normalized):   0.49722653724592325
Lemma: number
Okapi Weight (Un-normalized):   0.4271206566948371
Lemma: predict
Okapi Weight (Un-normalized):   0.4900928714263745
Lemma: prediction
Okapi Weight (Un-normalized):   0.5505762172147396
Lemma: range
Okapi Weight (Un-normalized):   0.4542413133896743
Lemma: re
Okapi Weight (Un-normalized):   0.5343610573328312
Lemma: reexamination
Okapi Weight (Un-normalized):   0.6563230519144344
Lemma: result
Okapi Weight (Un-normalized):   0.4271206566948371
Lemma: shape
Okapi Weight (Un-normalized):   0.5174467684617827
Lemma: shock
Okapi Weight (Un-normalized):   0.4855364715843671
Lemma: show
Okapi Weight (Un-normalized):   0.44298522385624906
Lemma: simple
Okapi Weight (Un-normalized):   0.5174467684617827
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: tn
Okapi Weight (Un-normalized):   0.4900928714263745
Lemma: use
Okapi Weight (Un-normalized):   0.43683855317169784
Lemma: wave
Okapi Weight (Un-normalized):   0.4952262785296612
Lemma: wide
Okapi Weight (Un-normalized):   0.5317516347988981
Lemma: yield
Okapi Weight (Un-normalized):   0.5130911044073352

Rank#: 2
Cosine Similarity: 0.10566850771123582
Doc#: 82  Document Headline:  theoretical investigation of the ablation of a glass-type heat protection shield of varied material properties at the stagnation point of a re-entering irbm .
Document Vector: 
Lemma: ablation
Okapi Weight (Un-normalized):   0.5386986261891169
Lemma: across
Okapi Weight (Un-normalized):   0.4632041110817991
Lemma: adamsew
Okapi Weight (Un-normalized):   0.5205756412432386
Lemma: affect
Okapi Weight (Un-normalized):   0.4632041110817991
Lemma: also
Okapi Weight (Un-normalized):   0.44175244684031
Lemma: although
Okapi Weight (Un-normalized):   0.45689205548740736
Lemma: altitude
Okapi Weight (Un-normalized):   0.4632041110817991
Lemma: angle
Okapi Weight (Un-normalized):   0.4329781556486418
Lemma: assume
Okapi Weight (Un-normalized):   0.462628670260465
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: ballistic
Okapi Weight (Un-normalized):   0.526184122075198
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculation
Okapi Weight (Un-normalized):   0.4329781556486418
Lemma: cause
Okapi Weight (Un-normalized):   0.49022553651471346
Lemma: certain
Okapi Weight (Un-normalized):   0.44413436339731266
Lemma: characteristic
Okapi Weight (Un-normalized):   0.43581536968322276
Lemma: combination
Okapi Weight (Un-normalized):   0.45513782787010265
Lemma: comparatively
Okapi Weight (Un-normalized):   0.4975179636501106
Lemma: conclusion
Okapi Weight (Un-normalized):   0.46066139067564116
Lemma: condition
Okapi Weight (Un-normalized):   0.42551538418018947
Lemma: conductivity
Okapi Weight (Un-normalized):   0.4753582914286497
Lemma: constant
Okapi Weight (Un-normalized):   0.43581536968322276
Lemma: corollary
Okapi Weight (Un-normalized):   0.5333333333333333
Lemma: derive
Okapi Weight (Un-normalized):   0.43827307627028417
Lemma: desirable
Okapi Weight (Un-normalized):   0.5365129403205664
Lemma: diameter
Okapi Weight (Un-normalized):   0.45214659235837557
Lemma: different
Okapi Weight (Un-normalized):   0.447209070522001
Lemma: diffusivity
Okapi Weight (Un-normalized):   0.6504263318128802
Lemma: discussion
Okapi Weight (Un-normalized):   0.45603583324176983
Lemma: disregard
Okapi Weight (Un-normalized):   0.5205756412432386
Lemma: do
Okapi Weight (Un-normalized):   0.4485730617733175
Lemma: due
Okapi Weight (Un-normalized):   0.4404409271170941
Lemma: effect
Okapi Weight (Un-normalized):   0.4127576920900947
Lemma: emissivity
Okapi Weight (Un-normalized):   0.5078179491531439
Lemma: employ
Okapi Weight (Un-normalized):   0.5145170271148286
Lemma: employment
Okapi Weight (Un-normalized):   0.5205756412432386
Lemma: enter
Okapi Weight (Un-normalized):   0.5165929249582424
Lemma: entry
Okapi Weight (Un-normalized):   0.5570507520955263
Lemma: exact
Okapi Weight (Un-normalized):   0.447209070522001
Lemma: exceed
Okapi Weight (Un-normalized):   0.4704679026759367
Lemma: exert
Okapi Weight (Un-normalized):   0.4975179636501106
Lemma: extremely
Okapi Weight (Un-normalized):   0.48342457464034616
Lemma: factor
Okapi Weight (Un-normalized):   0.45214659235837557
Lemma: flight
Okapi Weight (Un-normalized):   0.46934931309455846
Lemma: from
Okapi Weight (Un-normalized):   0.4127576920900947
Lemma: give
Okapi Weight (Un-normalized):   0.4127576920900947
Lemma: glass
Okapi Weight (Un-normalized):   0.7246601762750543
Lemma: have
Okapi Weight (Un-normalized):   0.4202204635585471
Lemma: heat
Okapi Weight (Un-normalized):   0.4710938648557917
Lemma: high
Okapi Weight (Un-normalized):   0.4872951178934635
Lemma: homogeneous
Okapi Weight (Un-normalized):   0.49506025706304924
Lemma: hypothetical
Okapi Weight (Un-normalized):   0.5078179491531439
Lemma: increase
Okapi Weight (Un-normalized):   0.4329781556486418
Lemma: influence
Okapi Weight (Un-normalized):   0.447209070522001
Lemma: investigate
Okapi Weight (Un-normalized):   0.4404409271170941
Lemma: investigation
Okapi Weight (Un-normalized):   0.44847308967440347
Lemma: irbm
Okapi Weight (Un-normalized):   0.676923076923077
Lemma: km
Okapi Weight (Un-normalized):   0.49095319755332545
Lemma: lead
Okapi Weight (Un-normalized):   0.43581536968322276
Lemma: level
Okapi Weight (Un-normalized):   0.504381117100775
Lemma: light
Okapi Weight (Un-normalized):   0.47200257946992114
Lemma: little
Okapi Weight (Un-normalized):   0.4730750454758727
Lemma: low
Okapi Weight (Un-normalized):   0.4661760625552449
Lemma: make
Okapi Weight (Un-normalized):   0.4202204635585471
Lemma: material
Okapi Weight (Un-normalized):   0.516382115194445
Lemma: melting
Okapi Weight (Un-normalized):   0.5003288653726884
Lemma: method
Okapi Weight (Un-normalized):   0.4202204635585471
Lemma: monotonically
Okapi Weight (Un-normalized):   0.5078179491531439
Lemma: most
Okapi Weight (Un-normalized):   0.44984290724846027
Lemma: nasa
Okapi Weight (Un-normalized):   0.4404409271170941
Lemma: necessary
Okapi Weight (Un-normalized):   0.457710210585842
Lemma: nondecompose
Okapi Weight (Un-normalized):   0.5333333333333333
Lemma: normal
Okapi Weight (Un-normalized):   0.44413436339731266
Lemma: nose
Okapi Weight (Un-normalized):   0.4457358477387365
Lemma: not
Okapi Weight (Un-normalized):   0.4296224436899132
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: only
Okapi Weight (Un-normalized):   0.43581536968322276
Lemma: opaque
Okapi Weight (Un-normalized):   0.6181818181818182
Lemma: out
Okapi Weight (Un-normalized):   0.44413436339731266
Lemma: overall
Okapi Weight (Un-normalized):   0.4762562968003169
Lemma: parameter
Okapi Weight (Un-normalized):   0.4404409271170941
Lemma: penetration
Okapi Weight (Un-normalized):   0.5003288653726884
Lemma: performance
Okapi Weight (Un-normalized):   0.503424909042944
Lemma: point
Okapi Weight (Un-normalized):   0.45396425469777746
Lemma: possible
Okapi Weight (Un-normalized):   0.4457358477387365
Lemma: practically
Okapi Weight (Un-normalized):   0.4847602715600159
Lemma: problem
Okapi Weight (Un-normalized):   0.42551538418018947
Lemma: profile
Okapi Weight (Un-normalized):   0.4457358477387365
Lemma: property
Okapi Weight (Un-normalized):   0.5097660345729675
Lemma: protection
Okapi Weight (Un-normalized):   0.5697087285074147
Lemma: radiative
Okapi Weight (Un-normalized):   0.49282655477171233
Lemma: re
Okapi Weight (Un-normalized):   0.5796327367587975
Lemma: realistic
Okapi Weight (Un-normalized):   0.5205756412432386
Lemma: result
Okapi Weight (Un-normalized):   0.420876223420155
Lemma: shield
Okapi Weight (Un-normalized):   0.7680681712469395
Lemma: show
Okapi Weight (Un-normalized):   0.4202204635585471
Lemma: small
Okapi Weight (Un-normalized):   0.4710938648557917
Lemma: solution
Okapi Weight (Un-normalized):   0.4202204635585471
Lemma: specific
Okapi Weight (Un-normalized):   0.45924488737982644
Lemma: speed
Okapi Weight (Un-normalized):   0.42551538418018947
Lemma: stagnation
Okapi Weight (Un-normalized):   0.46934931309455846
Lemma: state
Okapi Weight (Un-normalized):   0.45419375123755495
Lemma: steady
Okapi Weight (Un-normalized):   0.447209070522001
Lemma: steep
Okapi Weight (Un-normalized):   0.5037108896434201
Lemma: supposedly
Okapi Weight (Un-normalized):   0.5205756412432386
Lemma: surface
Okapi Weight (Un-normalized):   0.4529934902203935
Lemma: temperature
Okapi Weight (Un-normalized):   0.46152353689443515
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theoretical
Okapi Weight (Un-normalized):   0.4329781556486418
Lemma: thermal
Okapi Weight (Un-normalized):   0.5450348153400242
Lemma: these
Okapi Weight (Un-normalized):   0.43308803127762246
Lemma: thickness
Okapi Weight (Un-normalized):   0.462628670260465
Lemma: thin
Okapi Weight (Un-normalized):   0.44238013578000795
Lemma: thus
Okapi Weight (Un-normalized):   0.4531986192071888
Lemma: tnd
Okapi Weight (Un-normalized):   0.4510307683603789
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: total
Okapi Weight (Un-normalized):   0.4510307683603789
Lemma: transfer
Okapi Weight (Un-normalized):   0.4329781556486418
Lemma: transient
Okapi Weight (Un-normalized):   0.4678955199601974
Lemma: treat
Okapi Weight (Un-normalized):   0.45214659235837557
Lemma: two
Okapi Weight (Un-normalized):   0.4202204635585471
Lemma: type
Okapi Weight (Un-normalized):   0.45860696857254635
Lemma: under
Okapi Weight (Un-normalized):   0.43581536968322276
Lemma: variation
Okapi Weight (Un-normalized):   0.44413436339731266
Lemma: vary
Okapi Weight (Un-normalized):   0.4404409271170941
Lemma: vehicle
Okapi Weight (Un-normalized):   0.45603583324176983
Lemma: vertical
Okapi Weight (Un-normalized):   0.4637884604504736
Lemma: viscosity
Okapi Weight (Un-normalized):   0.49309609079757566
Lemma: weight
Okapi Weight (Un-normalized):   0.46595631129728354
Lemma: yield
Okapi Weight (Un-normalized):   0.48705228597539985

Rank#: 3
Cosine Similarity: 0.10506533806743008
Doc#: 1346  Document Headline:  modulated entry .
Document Vector: 
Lemma: absorption
Okapi Weight (Un-normalized):   0.5677373217949634
Lemma: acceleration
Okapi Weight (Un-normalized):   0.5336659599940201
Lemma: acceptable
Okapi Weight (Un-normalized):   0.5589288672772854
Lemma: alternatively
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: amount
Okapi Weight (Un-normalized):   0.5066463323156356
Lemma: analytical
Okapi Weight (Un-normalized):   0.49368490870108395
Lemma: appear
Okapi Weight (Un-normalized):   0.48531706585250844
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: become
Okapi Weight (Un-normalized):   0.4990500460881473
Lemma: capability
Okapi Weight (Un-normalized):   0.5551943962589565
Lemma: case
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: coefficient
Okapi Weight (Un-normalized):   0.4803999085813722
Lemma: corridor
Okapi Weight (Un-normalized):   0.6528445233585154
Lemma: depend
Okapi Weight (Un-normalized):   0.49060517785028723
Lemma: discuss
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: do
Okapi Weight (Un-normalized):   0.4812080876522652
Lemma: effect
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: entry
Okapi Weight (Un-normalized):   0.6069511142145483
Lemma: escape
Okapi Weight (Un-normalized):   0.5802581337404125
Lemma: excessive
Okapi Weight (Un-normalized):   0.5677373217949634
Lemma: formulation
Okapi Weight (Un-normalized):   0.5178135247863317
Lemma: fraction
Okapi Weight (Un-normalized):   0.5394754607268287
Lemma: from
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: gain
Okapi Weight (Un-normalized):   0.5630378454775287
Lemma: give
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: good
Okapi Weight (Un-normalized):   0.47085428950720076
Lemma: grantfc
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: heat
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: heating
Okapi Weight (Un-normalized):   0.4889414414870188
Lemma: include
Okapi Weight (Un-normalized):   0.455135353975073
Lemma: indication
Okapi Weight (Un-normalized):   0.5520623771594659
Lemma: lifting
Okapi Weight (Un-normalized):   0.5632259238595612
Lemma: load
Okapi Weight (Un-normalized):   0.4873169645694773
Lemma: modulate
Okapi Weight (Un-normalized):   0.5802581337404125
Lemma: modulation
Okapi Weight (Un-normalized):   0.7409809032330954
Lemma: nasa
Okapi Weight (Un-normalized):   0.4676121750238917
Lemma: nonlifting
Okapi Weight (Un-normalized):   0.5589288672772854
Lemma: not
Okapi Weight (Un-normalized):   0.44952502304407366
Lemma: numerical
Okapi Weight (Un-normalized):   0.46398779938938134
Lemma: offer
Okapi Weight (Un-normalized):   0.5677373217949634
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: or
Okapi Weight (Un-normalized):   0.5307331106963389
Lemma: peak
Okapi Weight (Un-normalized):   0.528922492779955
Lemma: penalty
Okapi Weight (Un-normalized):   0.5677373217949634
Lemma: possibility
Okapi Weight (Un-normalized):   0.5094038442332117
Lemma: possible
Okapi Weight (Un-normalized):   0.4764646204382001
Lemma: practical
Okapi Weight (Un-normalized):   0.49060517785028723
Lemma: price
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: reduction
Okapi Weight (Un-normalized):   0.4990500460881473
Lemma: representative
Okapi Weight (Un-normalized):   0.5320244173763602
Lemma: result
Okapi Weight (Un-normalized):   0.43671013192060126
Lemma: review
Okapi Weight (Un-normalized):   0.5056693732148829
Lemma: satellite
Okapi Weight (Un-normalized):   0.5157382468525161
Lemma: show
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: sizable
Okapi Weight (Un-normalized):   0.6628574304670318
Lemma: speed
Okapi Weight (Un-normalized):   0.4622058606722087
Lemma: standpoint
Okapi Weight (Un-normalized):   0.5802581337404125
Lemma: steep
Okapi Weight (Un-normalized):   0.573391643622593
Lemma: steepness
Okapi Weight (Un-normalized):   0.6229166666666667
Lemma: technique
Okapi Weight (Un-normalized):   0.4812080876522652
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: these
Okapi Weight (Un-normalized):   0.4338060875119459
Lemma: thus
Okapi Weight (Un-normalized):   0.4889414414870188
Lemma: tnd
Okapi Weight (Un-normalized):   0.48531706585250844
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: use
Okapi Weight (Un-normalized):   0.42132926646312713
Lemma: variable
Okapi Weight (Un-normalized):   0.48531706585250844
Lemma: vehicle
Okapi Weight (Un-normalized):   0.49368490870108395
Lemma: wider
Okapi Weight (Un-normalized):   0.5490635179109395

Rank#: 4
Cosine Similarity: 0.10121608856416556
Doc#: 274  Document Headline:  analysis of quartz and teflon shields for a particular re-entry mission .
Document Vector: 
Lemma: ablation
Okapi Weight (Un-normalized):   0.5575755627650487
Lemma: adamsew
Okapi Weight (Un-normalized):   0.5412583242302175
Lemma: also
Okapi Weight (Un-normalized):   0.4298921106636526
Lemma: analysis
Okapi Weight (Un-normalized):   0.4298921106636526
Lemma: apply
Okapi Weight (Un-normalized):   0.4386349925664745
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: ballistic
Okapi Weight (Un-normalized):   0.4903398489552969
Lemma: be
Okapi Weight (Un-normalized):   0.4236889372346482
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: calculation
Okapi Weight (Un-normalized):   0.4386349925664745
Lemma: change
Okapi Weight (Un-normalized):   0.45170485638882246
Lemma: comparatively
Okapi Weight (Un-normalized):   0.514245497560896
Lemma: condition
Okapi Weight (Un-normalized):   0.4298921106636526
Lemma: constant
Okapi Weight (Un-normalized):   0.44195888200114786
Lemma: cool
Okapi Weight (Un-normalized):   0.5295100177883784
Lemma: deceleration
Okapi Weight (Un-normalized):   0.4992994422290697
Lemma: derive
Okapi Weight (Un-normalized):   0.4448381659954789
Lemma: desirable
Okapi Weight (Un-normalized):   0.4977346294144201
Lemma: detrimental
Okapi Weight (Un-normalized):   0.5412583242302175
Lemma: differential
Okapi Weight (Un-normalized):   0.4553069767794245
Lemma: do
Okapi Weight (Un-normalized):   0.45690493733297416
Lemma: earth
Okapi Weight (Un-normalized):   0.4903398489552969
Lemma: effect
Okapi Weight (Un-normalized):   0.4149460553318263
Lemma: entry
Okapi Weight (Un-normalized):   0.4766625477838564
Lemma: equation
Okapi Weight (Un-normalized):   0.4375913251098085
Lemma: evaporate
Okapi Weight (Un-normalized):   0.5412583242302175
Lemma: evaporation
Okapi Weight (Un-normalized):   0.6241589623884918
Lemma: exact
Okapi Weight (Un-normalized):   0.4553069767794245
Lemma: exist
Okapi Weight (Un-normalized):   0.4553069767794245
Lemma: factor
Okapi Weight (Un-normalized):   0.4969443406199144
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.44195888200114786
Lemma: from
Okapi Weight (Un-normalized):   0.423717485487956
Lemma: ft
Okapi Weight (Un-normalized):   0.4805938745676223
Lemma: fundamental
Okapi Weight (Un-normalized):   0.4843533868972434
Lemma: govern
Okapi Weight (Un-normalized):   0.47404569217977194
Lemma: gravity
Okapi Weight (Un-normalized):   0.5024997634177899
Lemma: hand
Okapi Weight (Un-normalized):   0.49251346035131804
Lemma: have
Okapi Weight (Un-normalized):   0.4236889372346482
Lemma: heat
Okapi Weight (Un-normalized):   0.4779410198726405
Lemma: heated
Okapi Weight (Un-normalized):   0.4847803830267597
Lemma: herein
Okapi Weight (Un-normalized):   0.4936637383899703
Lemma: inst
Okapi Weight (Un-normalized):   0.5024997634177899
Lemma: investigate
Okapi Weight (Un-normalized):   0.4473778744692964
Lemma: involve
Okapi Weight (Un-normalized):   0.4553069767794245
Lemma: kg
Okapi Weight (Un-normalized):   0.5562043795620438
Lemma: km
Okapi Weight (Un-normalized):   0.5065546584475089
Lemma: know
Okapi Weight (Un-normalized):   0.45839260301735674
Lemma: large
Okapi Weight (Un-normalized):   0.44195888200114786
Lemma: lb
Okapi Weight (Un-normalized):   0.5175385612577845
Lemma: loss
Okapi Weight (Un-normalized):   0.4882847136810093
Lemma: low
Okapi Weight (Un-normalized):   0.4473778744692964
Lemma: mass
Okapi Weight (Un-normalized):   0.5274345477733813
Lemma: material
Okapi Weight (Un-normalized):   0.465647819235796
Lemma: maximum
Okapi Weight (Un-normalized):   0.4535810478983008
Lemma: mech
Okapi Weight (Un-normalized):   0.4610914457921115
Lemma: method
Okapi Weight (Un-normalized):   0.4375913251098085
Lemma: mission
Okapi Weight (Un-normalized):   0.5324846165896109
Lemma: molten
Okapi Weight (Un-normalized):   0.5562043795620438
Lemma: no
Okapi Weight (Un-normalized):   0.44964972111453483
Lemma: nose
Okapi Weight (Un-normalized):   0.48502629608572057
Lemma: not
Okapi Weight (Un-normalized):   0.4347036657827086
Lemma: numerical
Okapi Weight (Un-normalized):   0.4448381659954789
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: one
Okapi Weight (Un-normalized):   0.4347036657827086
Lemma: out
Okapi Weight (Un-normalized):   0.45170485638882246
Lemma: outer
Okapi Weight (Un-normalized):   0.4753937936234706
Lemma: parallel
Okapi Weight (Un-normalized):   0.465647819235796
Lemma: partial
Okapi Weight (Un-normalized):   0.4843533868972434
Lemma: particular
Okapi Weight (Un-normalized):   0.4535810478983008
Lemma: performance
Okapi Weight (Un-normalized):   0.47404569217977194
Lemma: practically
Okapi Weight (Un-normalized):   0.4992994422290697
Lemma: predominantly
Okapi Weight (Un-normalized):   0.5263122688983912
Lemma: prevent
Okapi Weight (Un-normalized):   0.5044532680251839
Lemma: problem
Okapi Weight (Un-normalized):   0.4298921106636526
Lemma: process
Okapi Weight (Un-normalized):   0.4634897596615151
Lemma: protection
Okapi Weight (Un-normalized):   0.5215007137793353
Lemma: quartz
Okapi Weight (Un-normalized):   0.7172523019596688
Lemma: radiation
Okapi Weight (Un-normalized):   0.4882847136810093
Lemma: radiative
Okapi Weight (Un-normalized):   0.5087493579624804
Lemma: ratio
Okapi Weight (Un-normalized):   0.4298921106636526
Lemma: re
Okapi Weight (Un-normalized):   0.47404569217977194
Lemma: readily
Okapi Weight (Un-normalized):   0.4992994422290697
Lemma: reenter
Okapi Weight (Un-normalized):   0.5562043795620438
Lemma: rest
Okapi Weight (Un-normalized):   0.4936637383899703
Lemma: result
Okapi Weight (Un-normalized):   0.423717485487956
Lemma: return
Okapi Weight (Un-normalized):   0.5215007137793353
Lemma: sec
Okapi Weight (Un-normalized):   0.49251346035131804
Lemma: shield
Okapi Weight (Un-normalized):   0.7292664430268845
Lemma: show
Okapi Weight (Un-normalized):   0.4375913251098085
Lemma: since
Okapi Weight (Un-normalized):   0.47185099266480046
Lemma: small
Okapi Weight (Un-normalized):   0.4347036657827086
Lemma: so
Okapi Weight (Un-normalized):   0.45690493733297416
Lemma: solution
Okapi Weight (Un-normalized):   0.4375913251098085
Lemma: space
Okapi Weight (Un-normalized):   0.47726998513294894
Lemma: speed
Okapi Weight (Un-normalized):   0.4298921106636526
Lemma: subject
Okapi Weight (Un-normalized):   0.45690493733297416
Lemma: surface
Okapi Weight (Un-normalized):   0.4732160755826056
Lemma: system
Okapi Weight (Un-normalized):   0.4597842213273052
Lemma: teflon
Okapi Weight (Un-normalized):   0.6565841502597172
Lemma: temperature
Okapi Weight (Un-normalized):   0.4550702958945684
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: time
Okapi Weight (Un-normalized):   0.4473778744692964
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.49463040491550064
Lemma: transient
Okapi Weight (Un-normalized):   0.5262227523584364
Lemma: treat
Okapi Weight (Un-normalized):   0.4610914457921115
Lemma: type
Okapi Weight (Un-normalized):   0.44195888200114786
Lemma: under
Okapi Weight (Un-normalized):   0.44195888200114786
Lemma: use
Okapi Weight (Un-normalized):   0.4149460553318263
Lemma: various
Okapi Weight (Un-normalized):   0.4448381659954789
Lemma: vehicle
Okapi Weight (Un-normalized):   0.5607941222044825
Lemma: weigh
Okapi Weight (Un-normalized):   0.5562043795620438
Lemma: well
Okapi Weight (Un-normalized):   0.4448381659954789
Lemma: which
Okapi Weight (Un-normalized):   0.4820815402520049
Lemma: yield
Okapi Weight (Un-normalized):   0.46232392980112264

Rank#: 5
Cosine Similarity: 0.09644831758097427
Doc#: 706  Document Headline:  on som reciprocal relations in the theory of nonstationary flows .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.494493701383407
Lemma: airfoil
Okapi Weight (Un-normalized):   0.5478424860597928
Lemma: also
Okapi Weight (Un-normalized):   0.4476188274525629
Lemma: alternate
Okapi Weight (Un-normalized):   0.6012183818497627
Lemma: analogy
Okapi Weight (Un-normalized):   0.5329746828254374
Lemma: approximate
Okapi Weight (Un-normalized):   0.4668414748157821
Lemma: between
Okapi Weight (Un-normalized):   0.4552837466538497
Lemma: broad
Okapi Weight (Un-normalized):   0.5872416615385638
Lemma: certain
Okapi Weight (Un-normalized):   0.48236703866591485
Lemma: draw
Okapi Weight (Un-normalized):   0.5439134803125079
Lemma: electrical
Okapi Weight (Un-normalized):   0.5534027073077163
Lemma: employ
Okapi Weight (Un-normalized):   0.5029025741064125
Lemma: exist
Okapi Weight (Un-normalized):   0.4881053002183855
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fourier
Okapi Weight (Un-normalized):   0.5534027073077163
Lemma: function
Okapi Weight (Un-normalized):   0.5191371364592178
Lemma: fundamental
Okapi Weight (Un-normalized):   0.5343769070339808
Lemma: garrick
Okapi Weight (Un-normalized):   0.6110510752648453
Lemma: general
Okapi Weight (Un-normalized):   0.4615464416465931
Lemma: give
Okapi Weight (Un-normalized):   0.42380941372628145
Lemma: ie
Okapi Weight (Un-normalized):   0.5350571217984428
Lemma: indicial
Okapi Weight (Un-normalized):   0.593553462648476
Lemma: interesting
Okapi Weight (Un-normalized):   0.5423155306564054
Lemma: lift
Okapi Weight (Un-normalized):   0.5118138924825962
Lemma: may
Okapi Weight (Un-normalized):   0.4552837466538497
Lemma: naca
Okapi Weight (Un-normalized):   0.4668414748157821
Lemma: nature
Okapi Weight (Un-normalized):   0.5267119878326939
Lemma: nonstationary
Okapi Weight (Un-normalized):   0.7181214863485994
Lemma: notable
Okapi Weight (Un-normalized):   0.6488372093023256
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: paper
Okapi Weight (Un-normalized):   0.4615464416465931
Lemma: problem
Okapi Weight (Un-normalized):   0.4476188274525629
Lemma: reciprocal
Okapi Weight (Un-normalized):   0.5819957344865436
Lemma: relation
Okapi Weight (Un-normalized):   0.5346373422768352
Lemma: rep
Okapi Weight (Un-normalized):   0.5534027073077163
Lemma: report
Okapi Weight (Un-normalized):   0.5206674558148034
Lemma: result
Okapi Weight (Un-normalized):   0.42380941372628145
Lemma: significance
Okapi Weight (Un-normalized):   0.5394750931136861
Lemma: simplicity
Okapi Weight (Un-normalized):   0.5632845068399676
Lemma: som
Okapi Weight (Un-normalized):   0.6488372093023256
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: theodorsen
Okapi Weight (Un-normalized):   0.6110510752648453
Lemma: theory
Okapi Weight (Un-normalized):   0.4533487846763858
Lemma: these
Okapi Weight (Un-normalized):   0.4533487846763858
Lemma: transform
Okapi Weight (Un-normalized):   0.5283879164623752
Lemma: transient
Okapi Weight (Un-normalized):   0.5791325636210138
Lemma: treatment
Okapi Weight (Un-normalized):   0.5211295076044126
Lemma: unify
Okapi Weight (Un-normalized):   0.5697440489221945
Lemma: wagner
Okapi Weight (Un-normalized):   0.6250277955760442
 ***************************** 
Processing Query:  has anyone formally determined the influence of joule heating,  produced by the induced current,  in magnetohydrodynamic free convection flows under general conditions  
Top 5 Documents fetched in order:  

Rank#: 1
Cosine Similarity: 0.18322355676400576
Doc#: 500  Document Headline:  joule heating in magnetohydrodynamic free-convection flows .
Document Vector: 
Lemma: actual
Okapi Weight (Un-normalized):   0.5227720629595751
Lemma: alter
Okapi Weight (Un-normalized):   0.5551653877153283
Lemma: analytic
Okapi Weight (Un-normalized):   0.5859214499161569
Lemma: analyze
Okapi Weight (Un-normalized):   0.500896960284297
Lemma: between
Okapi Weight (Un-normalized):   0.4525348310743765
Lemma: conduct
Okapi Weight (Un-normalized):   0.486143385796878
Lemma: confirm
Okapi Weight (Un-normalized):   0.5525291976542669
Lemma: constant
Okapi Weight (Un-normalized):   0.4911233844252141
Lemma: convection
Okapi Weight (Un-normalized):   0.5831928243845022
Lemma: cramerkr
Okapi Weight (Un-normalized):   0.5912130479456309
Lemma: description
Okapi Weight (Un-normalized):   0.5220039869145222
Lemma: develop
Okapi Weight (Un-normalized):   0.4584861213437238
Lemma: distribute
Okapi Weight (Un-normalized):   0.5212174012427597
Lemma: electrically
Okapi Weight (Un-normalized):   0.5352390678060868
Lemma: energy
Okapi Weight (Un-normalized):   0.486143385796878
Lemma: equation
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: estimate
Okapi Weight (Un-normalized):   0.486143385796878
Lemma: field
Okapi Weight (Un-normalized):   0.4973764133376054
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.46351786557079844
Lemma: free
Okapi Weight (Un-normalized):   0.4839047923108112
Lemma: fully
Okapi Weight (Un-normalized):   0.5792882173762933
Lemma: have
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: heating
Okapi Weight (Un-normalized):   0.57292918243552
Lemma: influence
Okapi Weight (Un-normalized):   0.5201118491748664
Lemma: jaesc
Okapi Weight (Un-normalized):   0.5313944262490372
Lemma: joule
Okapi Weight (Un-normalized):   0.8334177215189873
Lemma: laminar
Okapi Weight (Un-normalized):   0.4525348310743765
Lemma: located
Okapi Weight (Un-normalized):   0.5313944262490372
Lemma: magnetic
Okapi Weight (Un-normalized):   0.5160526966451748
Lemma: magnetohydrodynamic
Okapi Weight (Un-normalized):   0.5336464726441799
Lemma: magnitude
Okapi Weight (Un-normalized):   0.4961115698743378
Lemma: manner
Okapi Weight (Un-normalized):   0.502347942530692
Lemma: negligibly
Okapi Weight (Un-normalized):   0.5839292573234136
Lemma: obtain
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: openend
Okapi Weight (Un-normalized):   0.6364640883977901
Lemma: plate
Okapi Weight (Un-normalized):   0.4584861213437238
Lemma: practice
Okapi Weight (Un-normalized):   0.5457749483808133
Lemma: present
Okapi Weight (Un-normalized):   0.4226255202260796
Lemma: qualitative
Okapi Weight (Un-normalized):   0.5325398674892488
Lemma: result
Okapi Weight (Un-normalized):   0.4379577471146073
Lemma: retain
Okapi Weight (Un-normalized):   0.5646260998990036
Lemma: small
Okapi Weight (Un-normalized):   0.4525348310743765
Lemma: steady
Okapi Weight (Un-normalized):   0.48372437368818955
Lemma: submerge
Okapi Weight (Un-normalized):   0.6005568229036098
Lemma: such
Okapi Weight (Un-normalized):   0.46351786557079844
Lemma: temperature
Okapi Weight (Un-normalized):   0.47536700996931686
Lemma: term
Okapi Weight (Un-normalized):   0.4678765606782388
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: transverse
Okapi Weight (Un-normalized):   0.503737161795883
Lemma: two
Okapi Weight (Un-normalized):   0.43586060111764424
Lemma: uniformly
Okapi Weight (Un-normalized):   0.5263626820219626
Lemma: useful
Okapi Weight (Un-normalized):   0.5160526966451748
Lemma: usual
Okapi Weight (Un-normalized):   0.5187370901004174
Lemma: vertical
Okapi Weight (Un-normalized):   0.5131276011303979
Lemma: well
Okapi Weight (Un-normalized):   0.4678765606782388

Rank#: 2
Cosine Similarity: 0.16959211311185848
Doc#: 268  Document Headline:  several magnetohydrodynamic free-convection solutions .
Document Vector: 
Lemma: analytical
Okapi Weight (Un-normalized):   0.4913071191401427
Lemma: between
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: buoyant
Okapi Weight (Un-normalized):   0.5964709687262923
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: con
Okapi Weight (Un-normalized):   0.5756830542038538
Lemma: considerable
Okapi Weight (Un-normalized):   0.5057577426799947
Lemma: convection
Okapi Weight (Un-normalized):   0.6041368519024555
Lemma: cramerkr
Okapi Weight (Un-normalized):   0.5756830542038538
Lemma: decrease
Okapi Weight (Un-normalized):   0.48121610775002915
Lemma: demonstrate
Okapi Weight (Un-normalized):   0.506627096917648
Lemma: determine
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: examine
Okapi Weight (Un-normalized):   0.49771233907859247
Lemma: exert
Okapi Weight (Un-normalized):   0.5588998290948501
Lemma: extent
Okapi Weight (Un-normalized):   0.5190715208007874
Lemma: field
Okapi Weight (Un-normalized):   0.527356504658893
Lemma: flat
Okapi Weight (Un-normalized):   0.4583590541538808
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.4583590541538808
Lemma: force
Okapi Weight (Un-normalized):   0.4915701178839345
Lemma: free
Okapi Weight (Un-normalized):   0.4934974403031659
Lemma: general
Okapi Weight (Un-normalized):   0.45373597950870054
Lemma: heat
Okapi Weight (Un-normalized):   0.47087307645561843
Lemma: increase
Okapi Weight (Un-normalized):   0.47890177363886216
Lemma: influence
Okapi Weight (Un-normalized):   0.5474852714117986
Lemma: laminar
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: liquid
Okapi Weight (Un-normalized):   0.584495294015538
Lemma: magnetic
Okapi Weight (Un-normalized):   0.6044334607569504
Lemma: magnetohydrodynamic
Okapi Weight (Un-normalized):   0.5227919367949063
Lemma: magnitude
Okapi Weight (Un-normalized):   0.5296610743894793
Lemma: metal
Okapi Weight (Un-normalized):   0.6133182268737918
Lemma: nat
Okapi Weight (Un-normalized):   0.5588998290948501
Lemma: nondimensional
Okapi Weight (Un-normalized):   0.5286735438388891
Lemma: number
Okapi Weight (Un-normalized):   0.42078791452243863
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: over
Okapi Weight (Un-normalized):   0.4482680427637672
Lemma: parallel
Okapi Weight (Un-normalized):   0.4913071191401427
Lemma: parameter
Okapi Weight (Un-normalized):   0.4658961299725239
Lemma: plate
Okapi Weight (Un-normalized):   0.47890177363886216
Lemma: practical
Okapi Weight (Un-normalized):   0.48830555404698045
Lemma: prandtl
Okapi Weight (Un-normalized):   0.4927022833068922
Lemma: ratio
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: result
Okapi Weight (Un-normalized):   0.42078791452243863
Lemma: several
Okapi Weight (Un-normalized):   0.4719143687844536
Lemma: shear
Okapi Weight (Un-normalized):   0.4791469686763194
Lemma: solution
Okapi Weight (Un-normalized):   0.4329480649862619
Lemma: specific
Okapi Weight (Un-normalized):   0.4965360855275344
Lemma: strength
Okapi Weight (Un-normalized):   0.5340683413958368
Lemma: surface
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: temperature
Okapi Weight (Un-normalized):   0.4839835523259659
Lemma: th
Okapi Weight (Un-normalized):   0.5401410394691488
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: throughout
Okapi Weight (Un-normalized):   0.517324000049973
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.47890177363886216
Lemma: transverse
Okapi Weight (Un-normalized):   0.49531180855357776
Lemma: variation
Okapi Weight (Un-normalized):   0.4719143687844536
Lemma: velocity
Okapi Weight (Un-normalized):   0.44157582904487724
Lemma: vertical
Okapi Weight (Un-normalized):   0.5526168631398909
Lemma: wall
Okapi Weight (Un-normalized):   0.4856899403849529

Rank#: 3
Cosine Similarity: 0.15237328231937622
Doc#: 88  Document Headline:  magnetohydrodynamic free-convection pipe flow .
Document Vector: 
Lemma: ae
Okapi Weight (Un-normalized):   0.44095219160920407
Lemma: analyze
Okapi Weight (Un-normalized):   0.4913117490572888
Lemma: buoyant
Okapi Weight (Un-normalized):   0.593523904195398
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: conductivity
Okapi Weight (Un-normalized):   0.5209500577429828
Lemma: considerable
Okapi Weight (Un-normalized):   0.5041713765397948
Lemma: constant
Okapi Weight (Un-normalized):   0.45748366834157256
Lemma: convection
Okapi Weight (Un-normalized):   0.5155641400492235
Lemma: cramerkr
Okapi Weight (Un-normalized):   0.5730478083907959
Lemma: determine
Okapi Weight (Un-normalized):   0.47008946750217795
Lemma: develop
Okapi Weight (Un-normalized):   0.45292993981607005
Lemma: electrical
Okapi Weight (Un-normalized):   0.531926328284636
Lemma: end
Okapi Weight (Un-normalized):   0.5058598796321401
Lemma: exert
Okapi Weight (Un-normalized):   0.5565163316584275
Lemma: extent
Okapi Weight (Un-normalized):   0.5172854479887756
Lemma: field
Okapi Weight (Un-normalized):   0.5075592581175593
Lemma: flat
Okapi Weight (Un-normalized):   0.45748366834157256
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.45748366834157256
Lemma: force
Okapi Weight (Un-normalized):   0.4614282874138061
Lemma: fourth
Okapi Weight (Un-normalized):   0.5301778439292996
Lemma: free
Okapi Weight (Un-normalized):   0.45292993981607005
Lemma: freeconvection
Okapi Weight (Un-normalized):   0.6852932248580805
Lemma: fully
Okapi Weight (Un-normalized):   0.5667336370440468
Lemma: grashof
Okapi Weight (Un-normalized):   0.614
Lemma: hartmann
Okapi Weight (Un-normalized):   0.5730478083907959
Lemma: have
Okapi Weight (Un-normalized):   0.432453844011468
Lemma: heat
Okapi Weight (Un-normalized):   0.4475440221223107
Lemma: influence
Okapi Weight (Un-normalized):   0.5464165375609885
Lemma: laminar
Okapi Weight (Un-normalized):   0.4475440221223107
Lemma: liquid
Okapi Weight (Un-normalized):   0.5237655930687568
Lemma: located
Okapi Weight (Un-normalized):   0.5189119557553786
Lemma: magnetic
Okapi Weight (Un-normalized):   0.5839006253258656
Lemma: magnetohydrodynamic
Okapi Weight (Un-normalized):   0.5209500577429828
Lemma: magnitude
Okapi Weight (Un-normalized):   0.528227475286893
Lemma: measure
Okapi Weight (Un-normalized):   0.4708356532526868
Lemma: metal
Okapi Weight (Un-normalized):   0.5431009771945019
Lemma: nondimensional
Okapi Weight (Un-normalized):   0.5267434406813057
Lemma: note
Okapi Weight (Un-normalized):   0.4708356532526868
Lemma: number
Okapi Weight (Un-normalized):   0.43018589062103496
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: open
Okapi Weight (Un-normalized):   0.5301778439292996
Lemma: parallel
Okapi Weight (Un-normalized):   0.48993751235304056
Lemma: parameter
Okapi Weight (Un-normalized):   0.49568700937042165
Lemma: pipe
Okapi Weight (Un-normalized):   0.6249214436160108
Lemma: plate
Okapi Weight (Un-normalized):   0.4780293953062458
Lemma: practical
Okapi Weight (Un-normalized):   0.4869809707362757
Lemma: profile
Okapi Weight (Un-normalized):   0.47340603562067207
Lemma: rate
Okapi Weight (Un-normalized):   0.464907688022936
Lemma: ratio
Okapi Weight (Un-normalized):   0.44095219160920407
Lemma: relative
Okapi Weight (Un-normalized):   0.5050276904638833
Lemma: root
Okapi Weight (Un-normalized):   0.5223913563645086
Lemma: same
Okapi Weight (Un-normalized):   0.464907688022936
Lemma: sc
Okapi Weight (Un-normalized):   0.44095219160920407
Lemma: shear
Okapi Weight (Un-normalized):   0.4779597641461746
Lemma: show
Okapi Weight (Un-normalized):   0.432453844011468
Lemma: steady
Okapi Weight (Un-normalized):   0.47577055818781155
Lemma: strength
Okapi Weight (Un-normalized):   0.5325860132968657
Lemma: submerge
Okapi Weight (Un-normalized):   0.5815039247277669
Lemma: surface
Okapi Weight (Un-normalized):   0.44095219160920407
Lemma: temperature
Okapi Weight (Un-normalized):   0.47008946750217795
Lemma: term
Okapi Weight (Un-normalized):   0.4614282874138061
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: through
Okapi Weight (Un-normalized):   0.464907688022936
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.45292993981607005
Lemma: transverse
Okapi Weight (Un-normalized):   0.5384011765483157
Lemma: velocity
Okapi Weight (Un-normalized):   0.44095219160920407
Lemma: vertical
Okapi Weight (Un-normalized):   0.5509294531051746
Lemma: volumetric
Okapi Weight (Un-normalized):   0.614

Rank#: 4
Cosine Similarity: 0.13391814183489859
Doc#: 270  Document Headline:  on combined free and forced convection laminar magnetohydrodynamic flow and heat transfer in channels with transverse magnetic field .
Document Vector: 
Lemma: application
Okapi Weight (Un-normalized):   0.452134689175049
Lemma: attention
Okapi Weight (Un-normalized):   0.48631089681998213
Lemma: attract
Okapi Weight (Un-normalized):   0.5718875502008032
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: case
Okapi Weight (Un-normalized):   0.44971652699629144
Lemma: channel
Okapi Weight (Un-normalized):   0.6579197788362567
Lemma: combine
Okapi Weight (Un-normalized):   0.5718747028478066
Lemma: concern
Okapi Weight (Un-normalized):   0.5387413739584792
Lemma: conduct
Okapi Weight (Un-normalized):   0.49734830070281943
Lemma: convection
Okapi Weight (Un-normalized):   0.5443048575016317
Lemma: convective
Okapi Weight (Un-normalized):   0.5895983553393721
Lemma: design
Okapi Weight (Un-normalized):   0.4546346328730223
Lemma: devel
Okapi Weight (Un-normalized):   0.5718875502008032
Lemma: develop
Okapi Weight (Un-normalized):   0.4660935772937399
Lemma: due
Okapi Weight (Un-normalized):   0.452134689175049
Lemma: effect
Okapi Weight (Un-normalized):   0.41644666329686914
Lemma: electrically
Okapi Weight (Un-normalized):   0.55282999754153
Lemma: engineering
Okapi Weight (Un-normalized):   0.5497797045716172
Lemma: establish
Okapi Weight (Un-normalized):   0.4798975777294523
Lemma: etc
Okapi Weight (Un-normalized):   0.5075473432110487
Lemma: example
Okapi Weight (Un-normalized):   0.4568961070302705
Lemma: except
Okapi Weight (Un-normalized):   0.47730654939149686
Lemma: expect
Okapi Weight (Un-normalized):   0.4843595907340428
Lemma: field
Okapi Weight (Un-normalized):   0.5217071187064952
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: fluid
Okapi Weight (Un-normalized):   0.47177981478656306
Lemma: force
Okapi Weight (Un-normalized):   0.5217071187064952
Lemma: free
Okapi Weight (Un-normalized):   0.49905790358590774
Lemma: fully
Okapi Weight (Un-normalized):   0.5412291160810135
Lemma: future
Okapi Weight (Un-normalized):   0.5075473432110487
Lemma: general
Okapi Weight (Un-normalized):   0.4660935772937399
Lemma: generator
Okapi Weight (Un-normalized):   0.5196679681996773
Lemma: gershunus
Okapi Weight (Un-normalized):   0.5718875502008032
Lemma: hartmann
Okapi Weight (Un-normalized):   0.5389942236070651
Lemma: have
Okapi Weight (Un-normalized):   0.44052509137748347
Lemma: heat
Okapi Weight (Un-normalized):   0.4728333955916249
Lemma: however
Okapi Weight (Un-normalized):   0.4589606711812627
Lemma: hydrodynamic
Okapi Weight (Un-normalized):   0.5075473432110487
Lemma: include
Okapi Weight (Un-normalized):   0.4660935772937399
Lemma: information
Okapi Weight (Un-normalized):   0.48147999862352414
Lemma: int
Okapi Weight (Un-normalized):   0.5336995806246501
Lemma: laminar
Okapi Weight (Un-normalized):   0.4593681857926877
Lemma: large
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: limit
Okapi Weight (Un-normalized):   0.4672251250885082
Lemma: magnetic
Okapi Weight (Un-normalized):   0.6080900856741771
Lemma: magneto
Okapi Weight (Un-normalized):   0.5389942236070651
Lemma: magnetohydrodynamic
Okapi Weight (Un-normalized):   0.5510302490026839
Lemma: moriy
Okapi Weight (Un-normalized):   0.5554408869039341
Lemma: need
Okapi Weight (Un-normalized):   0.4875279594667605
Lemma: no
Okapi Weight (Un-normalized):   0.4546346328730223
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: ostrach
Okapi Weight (Un-normalized):   0.5457862849219012
Lemma: other
Okapi Weight (Un-normalized):   0.4425140078843936
Lemma: paper
Okapi Weight (Un-normalized):   0.4425140078843936
Lemma: papers
Okapi Weight (Un-normalized):   0.522547560310196
Lemma: particular
Okapi Weight (Un-normalized):   0.4589606711812627
Lemma: pattern
Okapi Weight (Un-normalized):   0.47820203376257353
Lemma: plasma
Okapi Weight (Un-normalized):   0.5257159290429136
Lemma: publish
Okapi Weight (Un-normalized):   0.4886856290422832
Lemma: report
Okapi Weight (Un-normalized):   0.49166206320999634
Lemma: researcher
Okapi Weight (Un-normalized):   0.5718875502008032
Lemma: special
Okapi Weight (Un-normalized):   0.47108129616989136
Lemma: study
Okapi Weight (Un-normalized):   0.4821494982674915
Lemma: tao
Okapi Weight (Un-normalized):   0.5554408869039341
Lemma: temperature
Okapi Weight (Un-normalized):   0.4381879695761532
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: transfer
Okapi Weight (Un-normalized):   0.48108416312249025
Lemma: transverse
Okapi Weight (Un-normalized):   0.5622153458752036
Lemma: treatment
Okapi Weight (Un-normalized):   0.48367178838537733
Lemma: vary
Okapi Weight (Un-normalized):   0.452134689175049
Lemma: vertical
Okapi Weight (Un-normalized):   0.5568381806309942
Lemma: wall
Okapi Weight (Un-normalized):   0.4461716211578896
Lemma: without
Okapi Weight (Un-normalized):   0.4685813524719181
Lemma: zhukhovitskius
Okapi Weight (Un-normalized):   0.5718875502008032

Rank#: 5
Cosine Similarity: 0.1286575722832929
Doc#: 993  Document Headline:   the extent of the jet interference flow fields . jet effects on cylindrical afterbodies housing sonic and supersonic nozzles which exhaust against a supersonic stream at angles of attack from 90degree to 180degree .
Document Vector: 
Lemma: about
Okapi Weight (Un-normalized):   0.4430589275966836
Lemma: afterbody
Okapi Weight (Un-normalized):   0.5674896737296802
Lemma: against
Okapi Weight (Un-normalized):   0.5539048401134575
Lemma: also
Okapi Weight (Un-normalized):   0.4306757989582053
Lemma: angle
Okapi Weight (Un-normalized):   0.4775214741000212
Lemma: at
Okapi Weight (Un-normalized):   0.4
Lemma: attack
Okapi Weight (Un-normalized):   0.5075108739765742
Lemma: base
Okapi Weight (Un-normalized):   0.4625772687480631
Lemma: be
Okapi Weight (Un-normalized):   0.4243099955142083
Lemma: body
Okapi Weight (Un-normalized):   0.46811175319618137
Lemma: by
Okapi Weight (Un-normalized):   0.4
Lemma: cause
Okapi Weight (Un-normalized):   0.46628929867529195
Lemma: conduct
Okapi Weight (Un-normalized):   0.4583968270757862
Lemma: cylindrical
Okapi Weight (Un-normalized):   0.4921691792861177
Lemma: datum
Okapi Weight (Un-normalized):   0.4396478949933109
Lemma: degree
Okapi Weight (Un-normalized):   0.49895008559825743
Lemma: detail
Okapi Weight (Un-normalized):   0.456756972425327
Lemma: determine
Okapi Weight (Un-normalized):   0.4356134997170867
Lemma: diameter
Okapi Weight (Un-normalized):   0.5225805576268079
Lemma: effect
Okapi Weight (Un-normalized):   0.42998939987655305
Lemma: exhaust
Okapi Weight (Un-normalized):   0.5366275547379981
Lemma: exit
Okapi Weight (Un-normalized):   0.5352018450008387
Lemma: extent
Okapi Weight (Un-normalized):   0.5386625986074195
Lemma: field
Okapi Weight (Un-normalized):   0.47262457625277565
Lemma: flow
Okapi Weight (Un-normalized):   0.4
Lemma: free
Okapi Weight (Un-normalized):   0.4775214741000212
Lemma: freestream
Okapi Weight (Un-normalized):   0.49611934201817176
Lemma: from
Okapi Weight (Un-normalized):   0.42998939987655305
Lemma: general
Okapi Weight (Un-normalized):   0.4396478949933109
Lemma: half
Okapi Weight (Un-normalized):   0.47292998654262475
Lemma: have
Okapi Weight (Un-normalized):   0.4475320742234682
Lemma: hayman
Okapi Weight (Un-normalized):   0.5602996254681648
Lemma: herein
Okapi Weight (Un-normalized):   0.49611934201817176
Lemma: housing
Okapi Weight (Un-normalized):   0.6530049261083744
Lemma: influence
Okapi Weight (Un-normalized):   0.5109739664264124
Lemma: interference
Okapi Weight (Un-normalized):   0.5187869500749329
Lemma: investigate
Okapi Weight (Un-normalized):   0.4486199910284165
Lemma: investigation
Okapi Weight (Un-normalized):   0.4356134997170867
Lemma: jet
Okapi Weight (Un-normalized):   0.5715286339849825
Lemma: large
Okapi Weight (Un-normalized):   0.4679609872018592
Lemma: leeward
Okapi Weight (Un-normalized):   0.5296238265099595
Lemma: lo
Okapi Weight (Un-normalized):   0.5359579960507617
Lemma: mach
Okapi Weight (Un-normalized):   0.43836907666380454
Lemma: make
Okapi Weight (Un-normalized):   0.4243099955142083
Lemma: mcdearmon
Okapi Weight (Un-normalized):   0.5602996254681648
Lemma: negligible
Okapi Weight (Un-normalized):   0.5329478346544788
Lemma: nozzle
Okapi Weight (Un-normalized):   0.49895008559825743
Lemma: number
Okapi Weight (Un-normalized):   0.4340558765980907
Lemma: off
Okapi Weight (Un-normalized):   0.48217359410089705
Lemma: on
Okapi Weight (Un-normalized):   0.4
Lemma: present
Okapi Weight (Un-normalized):   0.41533789947910266
Lemma: pressure
Okapi Weight (Un-normalized):   0.4439995691782137
Lemma: ratio
Okapi Weight (Un-normalized):   0.459978799753106
Lemma: reynold
Okapi Weight (Un-normalized):   0.4679609872018592
Lemma: rw
Okapi Weight (Un-normalized):   0.5359579960507617
Lemma: schlieren
Okapi Weight (Un-normalized):   0.4905992941895002
Lemma: shock
Okapi Weight (Un-normalized):   0.4356134997170867
Lemma: show
Okapi Weight (Un-normalized):   0.43836907666380454
Lemma: sonic
Okapi Weight (Un-normalized):   0.5124193626537396
Lemma: static
Okapi Weight (Un-normalized):   0.5171653043456482
Lemma: stream
Okapi Weight (Un-normalized):   0.5018427489780075
Lemma: structure
Okapi Weight (Un-normalized):   0.45992349523129494
Lemma: study
Okapi Weight (Un-normalized):   0.4356134997170867
Lemma: supersonic
Okapi Weight (Un-normalized):   0.47907529666912385
Lemma: test
Okapi Weight (Un-normalized):   0.4356134997170867
Lemma: that
Okapi Weight (Un-normalized):   0.4
Lemma: to
Okapi Weight (Un-normalized):   0.4
Lemma: total
Okapi Weight (Un-normalized):   0.4968327683370342
Lemma: variation
Okapi Weight (Un-normalized):   0.45306041442148826
Lemma: wave
Okapi Weight (Un-normalized):   0.4396478949933109
Lemma: windward
Okapi Weight (Un-normalized):   0.5142859270308568
Adding annotator tokenize
Adding annotator ssplit
Adding annotator pos
Adding annotator lemma
Time taken to lemmatize tokens:  22 seconds

Total Execution Time:  25 seconds

