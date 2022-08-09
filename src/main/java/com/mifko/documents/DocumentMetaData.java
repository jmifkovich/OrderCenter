package com.mifko.documents;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import javax.persistence.*;

/*
Contains MetaData Information for FileSystem Objects
*/

@Embeddable
public class DocumentMetaData
{

	private long bytes;
	private String fileName;
	private FileType fileType;

	public DocumentMetaData(String fileName)
	{
		this.fileName = fileName;
		if (fileName != null && StringUtils.contains(fileName, ".")) {
			String extension = StringUtils.substring(fileName, StringUtils.lastIndexOf(fileName, ".")).replace(".", "").toLowerCase();
			this.fileType = FileType.getFileType(extension);
		} else {
			this.fileType = FileType.getFileType("");
		}

	}

	public DocumentMetaData()
	{

	}


	public long getBytes()
	{
		return bytes;
	}

	public void setBytes(long bytes)
	{
		this.bytes = bytes;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public FileType getFileType()
	{
		return fileType;
	}

	public void setFileType(FileType fileType)
	{
		this.fileType = fileType;
	}
}



