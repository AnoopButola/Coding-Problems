package com.file.util;

import com.file.exception.ProblemException;
import com.file.reader.writer.CSVReaderWriter;
import com.file.reader.writer.FileReaderWriterInterface;

public class FileReaderWriterFactory {

	public static FileReaderWriterInterface getFileType(FileType fileType) throws ProblemException {
		FileReaderWriterInterface fileReaderWriterInterface=null;
		
		switch(fileType) {
		case CSV:
			fileReaderWriterInterface =new CSVReaderWriter("CSV Reader");
			break;
	
		case EXCEL:
			
			break;
			default:
				throw new ProblemException("File format is not supported");
		}
		return fileReaderWriterInterface;
	}
	
	public static enum FileType{
		CSV,EXCEL,DOC,PPT;
		
	}
	
	
	
	
	
   public static void main(String args[]) {
	   
	   try {
		   FileReaderWriterInterface   fileReaderWriterInterface =getFileType(FileType.EXCEL);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
