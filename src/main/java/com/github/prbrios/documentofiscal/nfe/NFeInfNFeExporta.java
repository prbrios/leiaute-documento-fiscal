package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "exporta")
public class NFeInfNFeExporta {

    @Element(name = "UFSaidaPais", required = false)
    private String UFSaidaPais;

    @Element(name = "xLocExporta", required = false)
    private String xLocExporta;

    @Element(name = "xLocDespacho", required = false)
    private String xLocDespacho;

    public NFeInfNFeExporta() {}

    /**
     *
     * @param UFSaidaPais
     * @param xLocExporta
     * @param xLocDespacho
     */
    public NFeInfNFeExporta(String UFSaidaPais, String xLocExporta, String xLocDespacho) {
        this.UFSaidaPais = UFSaidaPais;
        this.xLocExporta = xLocExporta;
        this.xLocDespacho = xLocDespacho;
    }

}
