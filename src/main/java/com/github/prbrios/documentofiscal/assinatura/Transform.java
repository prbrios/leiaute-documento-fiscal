package com.github.prbrios.documentofiscal.assinatura;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Attribute;

public class Transform {

    @Getter
    @Setter
    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

}