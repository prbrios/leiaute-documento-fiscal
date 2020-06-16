package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("exporta")
@Root(name = "exporta")
public class NFeInfNFeExporta {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufsaidapais")
    @Element(name = "UFSaidaPais", required = false)
    private String UFSaidaPais;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xlocexporta")
    @Element(name = "xLocExporta", required = false)
    private String xLocExporta;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xlocdespacho")
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

	public String getUFSaidaPais() {
		return UFSaidaPais;
	}

	public void setUFSaidaPais(String uFSaidaPais) {
		UFSaidaPais = uFSaidaPais;
	}

	public String getxLocExporta() {
		return xLocExporta;
	}

	public void setxLocExporta(String xLocExporta) {
		this.xLocExporta = xLocExporta;
	}

	public String getxLocDespacho() {
		return xLocDespacho;
	}

	public void setxLocDespacho(String xLocDespacho) {
		this.xLocDespacho = xLocDespacho;
	}

}
