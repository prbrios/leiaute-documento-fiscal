package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("autxml")
@Root(name = "autXML")
public class NFeInfNFeAutXML {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
    private String CPF;

    public NFeInfNFeAutXML() {}

    /**
     *
     * @param CNPJ
     * @param CPF
     */
    public NFeInfNFeAutXML(String CNPJ, String CPF) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
    }

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
