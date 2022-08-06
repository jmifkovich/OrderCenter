package com.mifko.documents;


import javax.persistence.*;

@Entity
public class Document
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "meta_data_id")
    private DocumentMetaData metaData;
    private byte[] data;

    public DocumentMetaData getMetaData() {return metaData;}

    public void setMetaData(DocumentMetaData metaData) {this.metaData = metaData;}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Document(String fileName)
    {
        this.metaData = new DocumentMetaData(fileName);
    }

    public Document()
    {
    }

    public byte[] getData()
    {
        return data;
    }

    public void setData(byte[] data)
    {
        this.data = data;
    }

    public DocumentMetaData getDocumentMetaData()
    {
        return metaData;
    }

}
