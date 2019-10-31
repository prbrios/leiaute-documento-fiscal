package com.github.prbrios.documentofiscal.assinatura;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Attribute;

public class CanonicalizationMethod {


    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

}
