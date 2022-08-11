package com.mifko.model;

import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;


@Embeddable
public class MessageMetaData
{

	private long bytes;
	private String messageType;
	private FileType fileType;

	public MessageMetaData(String fileName)
	{
		this.messageType = fileName;
		if (fileName != null && StringUtils.contains(fileName, ".")) {
			String extension = StringUtils.substring(fileName, StringUtils.lastIndexOf(fileName, ".")).replace(".", "").toLowerCase();
			this.fileType = FileType.getFileType(extension);
		} else {
			this.fileType = FileType.getFileType("");
		}

	}

	public MessageMetaData()
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

	public String getMessageType()
	{
		return messageType;
	}

	public void setMessageType(String fileName)
	{
		this.messageType = fileName;
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



