package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("obsfisco")
@Root(name = "obsFisco")
public class NFeInfNFeDetObsItemObsFisco {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xcampo")
	@Element(name = "xCampo", required = false)
	private String xCampo;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xtexto")
	@Element(name = "xTexto", required = false)
	private String xTexto;

	public NFeInfNFeDetObsItemObsFisco() {}

	public NFeInfNFeDetObsItemObsFisco(String xCampo, String xTexto) {
		this.xCampo = xCampo;
		this.xTexto = xTexto;
	}

	public String getxCampo() {
		return xCampo;
	}

	public void setxCampo(String xCampo) {
		this.xCampo = xCampo;
	}

	public String getxTexto() {
		return xTexto;
	}

	public void setxTexto(String xTexto) {
		this.xTexto = xTexto;
	}

}
