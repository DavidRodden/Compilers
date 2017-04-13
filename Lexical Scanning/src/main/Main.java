package main;

import java.io.*;
import parse.*;
import errorMsg.*;

public class Main {
	
	private String inputFileName; // name of input file
	private InputStream inputStream; // input stream
	private ErrorMsg errorMsg; // error-message object
	
	// main method
	public static void main(String args[])  {
		
		// check that we have exactly one argument (the file name)
		if (args.length != 1) { 
			exitError("Need exactly one argument: the input file name");
		}
		
		// create our main object
		Main mainObj = new Main(args[0]);		
		
		// perform the parse
		mainObj.execMain();
	}
	
	// constructor
	Main(String fileName) {
		inputFileName = fileName; // set input file name
		errorMsg = new ErrorMsg(inputFileName); // create error message object
	}
	
	// top-level method
	void execMain() {
		try {
			this.openFile(); // open the input file
			this.parseFile(); // parse the file
			this.printSummaryMessage(); // print success/fail message
			this.closeFile(); // close the input file
		}
		catch (Exception e) {
			// if I/O error print stack and abort
			e.printStackTrace();
			exitError("Unexpected exception: "+e);
		}
	}
	
	// opens the input file
	private void openFile() {
		try {
			inputStream = new FileInputStream(inputFileName); }
		catch (FileNotFoundException e) {
			exitError("File not found: " + inputFileName);
		}
	}
	
	// parses the input stream
	private void parseFile() {
		
		// create a parser object
		TokenGrammar mj = new TokenGrammar(errorMsg);
		
		// create a parse-table object
		TokenGrammarParseTable pt = new TokenGrammarParseTable(mj);
		
		// parse the input
		pt.parse(inputStream);
	}
		
	// close the input file
	public void closeFile() {
		try {
			if (inputStream != null) inputStream.close();
		}
		catch (IOException iox) {
			exitError("Error closing file.");
		}
	}
	
	// report success or failure
	public void printSummaryMessage() {
		if (errorMsg.anyErrors) {
			System.err.println("Compilation failed for "+inputFileName+".");
		}
		else {
			System.err.println("Compilation successful for "+inputFileName+".");
		}
	}
	
	// print message and exit
	public static void exitError(String msg) {
		System.err.println(msg);
		System.exit(1);
	}
}


