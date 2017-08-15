# Apache Tika 

### Softwares Used to build the project 

Apache Maven 3.5.0

Java 1.8

Eclipse Neon

Windows 10 64 bit

### Jars Used

Apache Tika 1.5 

### What is in this repository?

The source code for a simple program that extracts text from input pdf is in this repository. 

For this program the input pdf should contain text and not image.

A runnable jar that can produce the output is available in this repository. You can see the output by running this jar in your machine.

### How can i see the output of this project?

You need to execute the `runnable jar` from command prompt. 

Make sure you have java in your path variable (Environment Variable).

Go into the Runnable Jar folder in git repository to find the jar file. 

The size of this file is 57mb and its because of the libraries that exists in Apache Tika. 
Apache Tika covers many usescases, but for the usecase i covered here not all those libraries are necessary. As i used maven, all the dependencies are downloaded automatically.

`Input` for this project is the `absolute path of pdf file`

##### Sample command to run the jar
`java -jar insured-extractdata.jar "c:/file.pdf"`

##### if you face any issues in running this kindly let me know `cdivine304@gmail.com` 



### What is the output of this project?

`Output`
	Two files will be generated in the current path where you executed the command.
	
	1. contents.txt - contains the text extracted from pdf. The file will be empty if input pdf has image. Additional improvements in code can help to extract data from pdf.
	2. metadata.txt - contains the metadata of the the pdf. 

### About Apache Tika


[Apache Tika](https://tika.apache.org/) is used for extracting data from pdf, images, audio files.

The extracted data will be in unstructured format and it can be  converting to string. 

i referred [this article](https://www.tutorialspoint.com/tika/index.htm) to build this project.

Apache Tika has a GUI version of jar in which we can drag and drop the files and view the extracted content. It's useful for basic understanding how Apache Tika works.


