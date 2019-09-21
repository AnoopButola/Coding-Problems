package com.file.reader.writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.file.dto.FileDataDTO;
import com.file.exception.ProblemException;

public class CSVReaderWriter  implements FileReaderWriterInterface{

	String name;
	
	public CSVReaderWriter(String name1){
		
		this.name=name1;
		System.out.println("name of file is ::"+name);
		
	}
	@Override
	public 	List<FileDataDTO> readFile(String path) throws ProblemException {
		
		List<FileDataDTO> fileDataDtoList=new ArrayList<FileDataDTO>();
		try(BufferedReader br =new BufferedReader(new FileReader(new File(path)))){
			String line=null;
			while((line=br.readLine())!=null) {
				String data[]=line.split("[|]");
				FileDataDTO dto=new FileDataDTO();
				dto.setCity(data[0]);
				dto.setCountry(data[1]);
				dto.setGender(data[2]);
				dto.setCurrency(data[3]);
				dto.setAvgIncome(data[4]);
				fileDataDtoList.add(dto);
			}
		} catch (FileNotFoundException e) {
			throw new ProblemException("File does not exits on the specified path ::"+path);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		return fileDataDtoList;
		
	}

	@Override
	public void writerToFile(String path) {
		// TODO Auto-generated method stub
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
