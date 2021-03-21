package datastructure;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the file");
		}

		br = new BufferedReader(fr);

		String data = "";

		try {
			while(data == br.readLine()){
				System.out.println(data);
			}
		} catch (IOException e) {
			System.out.println("Cannot read the file");
		}

	}

}
