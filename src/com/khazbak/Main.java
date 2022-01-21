package com.khazbak;

import com.khazbak.infoReader.InfoReader;
import com.khazbak.infoReader.InfoReaderI;
import com.khazbak.math.ArrayMath;
import com.khazbak.math.ArrayMathI;
import com.khazbak.parsing.ArrayParser;
import com.khazbak.parsing.ArrayParserI;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        File f=new File("info.txt");
        ArrayParserI parser=new ArrayParser();
        InfoReaderI reader=new InfoReader(f,parser);

        int[] numbers=reader.readIntegerList();

        ArrayMathI math=new ArrayMath();

        System.out.println(math.max(numbers));
        System.out.println(math.min(numbers));
        System.out.println(math.sum(numbers));
        System.out.println(math.average(numbers));

    }

}
