package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("fordia")
@Root(name = "forDia")
public class NFeInfNFeCanaForDia {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtde")
    @Element(name = "qtde", required = false)
    private String qtde;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dia")
    @Element(name = "dia", required = false)
    private String dia;

    public NFeInfNFeCanaForDia() {}

    /**
     *
     * @param qtde
     * @param dia
     */
    public NFeInfNFeCanaForDia(String qtde, String dia) {
        this.qtde = qtde;
        this.dia = dia;
    }

	public String getQtde() {
		return qtde;
	}

	public void setQtde(String qtde) {
		this.qtde = qtde;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}
