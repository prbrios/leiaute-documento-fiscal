package com.github.prbrios.documentofiscal.assinatura;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

import java.util.List;

public class Reference {


    @Attribute(name = "URI", required = false)
    private String uri;


    @Path("Transforms")
    @ElementList(entry = "Transform", inline = true, required = false)
    private List<Transform> transform;


    @Element(name = "DigestMethod", required = false)
    private DigestMethod digestMethod;


    @Element(name = "DigestValue", required = false)
    private String digestValue;

}