package com.khazbak.parsing;

public class ArrayParser implements ArrayParserI {
    public int[] parseInt(String[] strings){
        int[] ints=new int[strings.length];
        for (int i=0;i<strings.length;i++) {
                ints[i]=Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
