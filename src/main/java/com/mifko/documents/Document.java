package com.mifko.documents;


import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.nio.file.Path;


@Entity
@Table(name = "DOCUMENT")
public class Document
{
    private Long id;
    @Embedded
    @Nullable
    private DocumentMetaData metaData;
    private String filePath;

    public Document(String fileName)
    {
        this.metaData = new DocumentMetaData(fileName);
    }

    public Document()
    {
    }


    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public DocumentMetaData getMetaData() {return metaData;}

    @Nullable
    public void setMetaData(DocumentMetaData metaData)
    {
        this.metaData = new DocumentMetaData(this.filePath);
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFilePath()
    {
        return filePath;
    }

    public void setFilePath(String path)
    {
        this.filePath = path;
    }
}
