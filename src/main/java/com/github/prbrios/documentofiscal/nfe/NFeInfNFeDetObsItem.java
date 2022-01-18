package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("obsitem")
@Root(name = "obsItem")
public class NFeInfNFeDetObsItem {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obscont")
    @Element(name = "obsCont", required = false)
	private NFeInfNFeDetObsItemObsCont obsCont;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obsfisco")
    @Element(name = "obsFisco", required = false)
	private NFeInfNFeDetObsItemObsFisco obsFisco;

	public NFeInfNFeDetObsItem() {}

	public NFeInfNFeDetObsItem(NFeInfNFeDetObsItemObsCont obsCont, NFeInfNFeDetObsItemObsFisco obsFisco) {
		this.obsCont = obsCont;
		this.obsFisco = obsFisco;
	}

	public NFeInfNFeDetObsItemObsCont getObsCont() {
		return obsCont;
	}

	public void setObsCont(NFeInfNFeDetObsItemObsCont obsCont) {
		this.obsCont = obsCont;
	}

	public NFeInfNFeDetObsItemObsFisco getObsFisco() {
		return obsFisco;
	}

	public void setObsFisco(NFeInfNFeDetObsItemObsFisco obsFisco) {
		this.obsFisco = obsFisco;
	}

}
