package ru.rud.db;

abstract class FileProcessor {

    abstract protected void openFile(String str);
    abstract protected void treatmentFile();
    abstract protected void addTextFile(String str);

    final public void process(String fileName){
        openFile(fileName);
        treatmentFile();
        addTextFile(fileName);
    }
}