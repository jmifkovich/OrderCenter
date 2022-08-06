package com.mifko.documents;

import org.apache.commons.lang3.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
Contains MetaData Information for FileSystem Objects
*/
@Entity
public class DocumentMetaData
{
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	private long bytes;
	private String fileName;
	private FileType fileType;

	public Long getId() {return id;}

	public void setId(Long id) {this.id = id;}

	public DocumentMetaData(String fileName){
		this.fileName = fileName;
		if(fileName!=null && StringUtils.contains(fileName,".")) {
			String extension =
					StringUtils.substring(fileName,StringUtils.lastIndexOf(fileName,".")).replace(".","").toLowerCase();
			this.fileType= FileType.getFileType(extension);
		}
		else{
			this.fileType= FileType.getFileType("");
		}


	}

	public DocumentMetaData()
	{

	}

	public String getFileName()
	{
		return fileName;
	}

	public FileType getFileType(){
		return fileType;
	}

	public long getBytes(){
		return bytes;
	}

	public void setBytes(long bytes)
	{
		this.bytes= bytes;
	}

}