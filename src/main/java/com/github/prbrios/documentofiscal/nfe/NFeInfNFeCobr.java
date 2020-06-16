package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("cobr")
@Root(name = "cobr")
public class NFeInfNFeCobr {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fat")
    @Element(name = "fat", required = false)
    private NFeInfNFeCobrFat fat;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dup")
    @ElementList(name = "dup", required = false, inline = true)
    private List<NFeInfNFeCobrDup> dup = new ArrayList<NFeInfNFeCobrDup>();

    public NFeInfNFeCobr() {}

    /**
     *
     * @param fat
     * @param dup
     */
    public NFeInfNFeCobr(NFeInfNFeCobrFat fat, List<NFeInfNFeCobrDup> dup) {
        this.fat = fat;
        this.dup = dup;
    }

	public NFeInfNFeCobrFat getFat() {
		return fat;
	}

	public void setFat(NFeInfNFeCobrFat fat) {
		this.fat = fat;
	}

	public List<NFeInfNFeCobrDup> getDup() {
		return dup;
	}

	public void setDup(List<NFeInfNFeCobrDup> dup) {
		this.dup = dup;
	}

}
