package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("impostodevol")
@Root(name = "impostoDevol")
public class NFeInfNFeDetImpostoDevol {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pdevol")
    @Element(name = "pDevol", required = false)
    private String pDevol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipi")
    @Element(name = "IPI", required = false)
    private NFeInfNFeDetImpostoDevolIPI IPI;

    public NFeInfNFeDetImpostoDevol() {}

    /**
     *
     * @param pDevol
     * @param IPI
     */
    public NFeInfNFeDetImpostoDevol(String pDevol, NFeInfNFeDetImpostoDevolIPI IPI) {
        this.pDevol = pDevol;
        this.IPI = IPI;
    }

	public String getpDevol() {
		return pDevol;
	}

	public void setpDevol(String pDevol) {
		this.pDevol = pDevol;
	}

	public NFeInfNFeDetImpostoDevolIPI getIPI() {
		return IPI;
	}

	public void setIPI(NFeInfNFeDetImpostoDevolIPI iPI) {
		IPI = iPI;
	}

}
