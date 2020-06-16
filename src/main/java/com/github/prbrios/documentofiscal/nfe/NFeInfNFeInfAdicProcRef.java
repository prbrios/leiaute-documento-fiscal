package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("procref")
@Root(name = "procRef")
public class NFeInfNFeInfAdicProcRef {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nproc")
    @Element(name = "nProc", required = false)
    private String nProc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indproc")
    @Element(name = "indProc", required = false)
    private String indProc;

    public NFeInfNFeInfAdicProcRef() {}

    /**
     *
     * @param nProc
     * @param indProc
     */
    public NFeInfNFeInfAdicProcRef(String nProc, String indProc) {
        this.nProc = nProc;
        this.indProc = indProc;
    }

	public String getnProc() {
		return nProc;
	}

	public void setnProc(String nProc) {
		this.nProc = nProc;
	}

	public String getIndProc() {
		return indProc;
	}

	public void setIndProc(String indProc) {
		this.indProc = indProc;
	}

}
