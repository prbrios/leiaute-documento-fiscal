package com.github.prbrios.documentofiscal;

import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

public class EmptyElementConverter  implements Converter<String> {

    @Override
    public String read(InputNode node) throws Exception {
    	String value = node.getValue();
        if(value == null) {
            value = "";
        }
        return value;
    }

    @Override
    public void write(OutputNode node, String value) throws Exception {
    	node.setValue(value);
    }
}