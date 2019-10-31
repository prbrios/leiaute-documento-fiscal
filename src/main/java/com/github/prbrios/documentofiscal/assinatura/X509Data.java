package com.github.prbrios.documentofiscal.assinatura;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;

public class X509Data {


    @Element(name = "X509Certificate", required = false)
    private String x509certificate;

}