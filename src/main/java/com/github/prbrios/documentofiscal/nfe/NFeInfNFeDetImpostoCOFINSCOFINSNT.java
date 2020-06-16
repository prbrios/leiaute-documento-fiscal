package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("cofinsnt")
@Root(name = "COFINSNT")
public class NFeInfNFeDetImpostoCOFINSCOFINSNT {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    public NFeInfNFeDetImpostoCOFINSCOFINSNT() {}

    /**
     *
     * @param CST
     */
    public NFeInfNFeDetImpostoCOFINSCOFINSNT(String CST) {
        this.CST = CST;
    }

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

}
