package com.mifko.documents;


import javax.persistence.*;


@Entity
@Table(name = "document")
public class Document
{
    private Long id;
    @Embedded
    private DocumentMetaData metaData;
    private byte[] data;

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

    public void setMetaData(DocumentMetaData metaData)
    {
        this.metaData = metaData;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public byte[] getData()
    {
        return data;
    }

    public void setData(byte[] data)
    {
        this.data = data;
    }
}
