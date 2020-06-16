package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("ipi")
@Root(name = "IPI")
public class NFeInfNFeDetImpostoDevolIPI {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipidevol")
    @Element(name = "vIPIDevol", required = false)
    private String vIPIDevol;

    public NFeInfNFeDetImpostoDevolIPI() {}

    /**
     *
     * @param vIPIDevol
     */
    public NFeInfNFeDetImpostoDevolIPI(String vIPIDevol) {
        this.vIPIDevol = vIPIDevol;
    }

	public String getvIPIDevol() {
		return vIPIDevol;
	}

	public void setvIPIDevol(String vIPIDevol) {
		this.vIPIDevol = vIPIDevol;
	}

}
