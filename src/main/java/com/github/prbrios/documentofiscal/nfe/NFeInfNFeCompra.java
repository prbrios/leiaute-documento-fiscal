package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("compra")
@Root(name = "compra")
public class NFeInfNFeCompra {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xnemp")
    @Element(name = "xNEmp", required = false)
    private String xNEmp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xped")
    @Element(name = "xPed", required = false)
    private String xPed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcont")
    @Element(name = "xCont", required = false)
    private String xCont;

    public NFeInfNFeCompra() {}

    /**
     *
     * @param xNEmp
     * @param xPed
     * @param xCont
     */
    public NFeInfNFeCompra(String xNEmp, String xPed, String xCont) {
        this.xNEmp = xNEmp;
        this.xPed = xPed;
        this.xCont = xCont;
    }

	public String getxNEmp() {
		return xNEmp;
	}

	public void setxNEmp(String xNEmp) {
		this.xNEmp = xNEmp;
	}

	public String getxPed() {
		return xPed;
	}

	public void setxPed(String xPed) {
		this.xPed = xPed;
	}

	public String getxCont() {
		return xCont;
	}

	public void setxCont(String xCont) {
		this.xCont = xCont;
	}

}
