package com.file.service;

import java.util.ArrayList;
import java.util.List;

import com.file.dto.FileDataDTO;
import com.file.exception.ProblemException;
import com.file.reader.writer.CSVReaderWriter;
import com.file.reader.writer.FileReaderWriterInterface;

public class FileReaderWriterService implements BaseServiceInterface{

	FileReaderWriterInterface filereaderWriter;
	List<FileDataDTO> fileDataList=new ArrayList<FileDataDTO>();
	@Override
	public void loadData(String filePath) throws ProblemException {
		// TODO Auto-generated method stub
		if(filePath.endsWith(".csv")) {
			//FileReaderWriterFactory.getFileType(FileReaderWriterFactory.FileType.CSV);
			filereaderWriter=new CSVReaderWriter("csv file reader writer");
		    fileDataList=filereaderWriter.readFile(filePath);
		    testResult(fileDataList);
		}else if(filePath.endsWith(".txt")) {
			
		}
		
	}
	private void testResult(List<FileDataDTO> fileDataList2) {
		if(fileDataList2.size()>0) {
			fileDataList2.forEach(obj->{
			System.out.println(obj.toString());
			});
		}
		
	}

	public static void main(String args[]) throws ProblemException {
		new FileReaderWriterService().loadData("C:\\STS_Workspace\\ReadCSVFile\\csv\\file1.csv");
	}
	  
	
}
