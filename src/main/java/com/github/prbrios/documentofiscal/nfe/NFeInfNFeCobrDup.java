package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("dup")
@Root(name = "dup")
public class NFeInfNFeCobrDup {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndup")
    @Element(name = "nDup", required = false)
    private String nDup;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dvenc")
    @Element(name = "dVenc", required = false)
    private String dVenc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdup")
    @Element(name = "vDup", required = false)
    private String vDup;

    public NFeInfNFeCobrDup() {}

    /**
     *
     * @param nDup
     * @param dVenc
     * @param vDup
     */
    public NFeInfNFeCobrDup(String nDup, String dVenc, String vDup) {
        this.nDup = nDup;
        this.dVenc = dVenc;
        this.vDup = vDup;
    }

	public String getnDup() {
		return nDup;
	}

	public void setnDup(String nDup) {
		this.nDup = nDup;
	}

	public String getdVenc() {
		return dVenc;
	}

	public void setdVenc(String dVenc) {
		this.dVenc = dVenc;
	}

	public String getvDup() {
		return vDup;
	}

	public void setvDup(String vDup) {
		this.vDup = vDup;
	}

}
