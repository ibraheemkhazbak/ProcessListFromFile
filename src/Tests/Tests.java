package Tests;

import com.khazbak.parsing.ArrayParser;
import com.khazbak.parsing.IArrayParser;

public class Tests {
public static void testArrayParser(){
    IArrayParser parser=new ArrayParser();
    String s[]={"1","2","3"};
    int integer[]=parser.parseInt(s);
    for (int i: integer) {
        System.out.println(i);
    }
}
}
