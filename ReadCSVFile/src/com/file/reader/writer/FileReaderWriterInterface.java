package com.file.reader.writer;

import java.util.List;

import com.file.dto.FileDataDTO;
import com.file.exception.ProblemException;

public interface FileReaderWriterInterface {

	public 	List<FileDataDTO> readFile(String path) throws ProblemException;
	public void writerToFile(String path) throws ProblemException;
}
