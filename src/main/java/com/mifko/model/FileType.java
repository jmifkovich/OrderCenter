package com.mifko.model;

public enum FileType{
    PDF("pdf", true),
    XLSX("xlsx", true),
    JPG("jpg", true),
    DOCX("docx", true),
    ZIP("zip", false),
    UNKNOWN(null, false);

    final private String extension;
    final private boolean isPrintable;

    FileType(String extension, boolean isPrintable){
        this.extension = extension;
        this.isPrintable = isPrintable;
    }


    public String getExtension()
    {
        return extension;
    }

    public boolean isPrintable()
    {
        return isPrintable;
    }

    public static FileType getFileType(String extension){
        return switch (extension) {
            case "pdf" -> PDF;
            case "xlsx" -> XLSX;
            case "docx" -> DOCX;
            case "zip" -> ZIP;
            default -> UNKNOWN;
        };
    }
}