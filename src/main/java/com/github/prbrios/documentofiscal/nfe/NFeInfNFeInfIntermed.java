package com.github.prbrios.documentofiscal.nfe;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("infintermed")
@Root(name = "infIntermed")
public class NFeInfNFeInfIntermed {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name="CNPJ", required = false)
	private String CNPJ;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("idcadinttran")
    @Element(name="idCadIntTran", required = false)
	private String idCadIntTran;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cnpj) {
		this.CNPJ = cnpj;
	}

	public String getIdCadIntTran() {
		return idCadIntTran;
	}

	public void setIdCadIntTran(String idCadIntTran) {
		this.idCadIntTran = idCadIntTran;
	}

}
