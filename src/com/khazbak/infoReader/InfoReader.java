package com.khazbak.infoReader;

import com.khazbak.parsing.ArrayParserI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InfoReader implements InfoReaderI{
    private File file;
    private ArrayParserI parser;
    public InfoReader(File file, ArrayParserI parser){
        this.file=file;
        this.parser=parser;
    }
    public String readLine(){
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
         return reader.readLine();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public int[] readIntegerList() {
        String line=readLine();
        String[] stringNumbers=line.split(",");
        int[] numbers=parser.parseInt(stringNumbers);
        return numbers;
    }

}
