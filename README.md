# EE422C_Cheaters_Project

First, we create a map where we assign each essay a number. For example, the first essay in a folder of essays would be 1, the next would be 2, etc.  In the map, the key is the file number and the value is the file's name. There are K essays in a folder. This allows for us to easier generate the final list of cheaters. 

We then create a K x K matrix (initialized with all -1s) where we store the number of matches between essays.

In the two outermost for-loops of our program, we compare each essay with all the essays that follow it. In this way, we fill out the upper right triangle of our matrix. Every time we need to compare an essay (we will call it the fixed one) against the ones that follow, we clear the single HashMap we are using and repopulate it. Then we loop through the non-fixed essays that follow, using HashMap's containsKey() method to see if there are matching phrases between the essays. 

In our HashMap, the key is determined by adding up the hash codes for each word in the phrase, obtained using String's hashCode() method. The value is the phrase itself, which ends up not being used. 

We suspect there are a few bugs due to the following characters: ÒÓÔÕ. 
