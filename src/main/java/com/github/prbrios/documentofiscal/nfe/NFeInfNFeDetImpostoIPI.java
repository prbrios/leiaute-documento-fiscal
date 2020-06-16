package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("ipi")
@Root(name = "IPI")
public class NFeInfNFeDetImpostoIPI {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpjprod")
    @Element(name = "CNPJProd", required = false)
    private String CNPJProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cselo")
    @Element(name = "cSelo", required = false)
    private String cSelo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qselo")
    @Element(name = "qSelo", required = false)
    private String qSelo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cenq")
    @Element(name = "cEnq", required = false)
    private String cEnq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipitrib")
    @Element(name = "IPITrib", required = false)
    private NFeInfNFeDetImpostoIPIIPITrib IPITrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipint")
    @Element(name = "IPINT", required = false)
    private NFeInfNFeDetImpostoIPIIPINT IPINT;

    public NFeInfNFeDetImpostoIPI() {}

    /**
     *
     * @param CNPJProd
     * @param cSelo
     * @param qSelo
     * @param cEnq
     * @param IPITrib
     * @param IPINT
     */
    public NFeInfNFeDetImpostoIPI(String CNPJProd, String cSelo, String qSelo, String cEnq, NFeInfNFeDetImpostoIPIIPITrib IPITrib, NFeInfNFeDetImpostoIPIIPINT IPINT) {
        this.CNPJProd = CNPJProd;
        this.cSelo = cSelo;
        this.qSelo = qSelo;
        this.cEnq = cEnq;
        this.IPITrib = IPITrib;
        this.IPINT = IPINT;
    }

	public String getCNPJProd() {
		return CNPJProd;
	}

	public void setCNPJProd(String cNPJProd) {
		CNPJProd = cNPJProd;
	}

	public String getcSelo() {
		return cSelo;
	}

	public void setcSelo(String cSelo) {
		this.cSelo = cSelo;
	}

	public String getqSelo() {
		return qSelo;
	}

	public void setqSelo(String qSelo) {
		this.qSelo = qSelo;
	}

	public String getcEnq() {
		return cEnq;
	}

	public void setcEnq(String cEnq) {
		this.cEnq = cEnq;
	}

	public NFeInfNFeDetImpostoIPIIPITrib getIPITrib() {
		return IPITrib;
	}

	public void setIPITrib(NFeInfNFeDetImpostoIPIIPITrib iPITrib) {
		IPITrib = iPITrib;
	}

	public NFeInfNFeDetImpostoIPIIPINT getIPINT() {
		return IPINT;
	}

	public void setIPINT(NFeInfNFeDetImpostoIPIIPINT iPINT) {
		IPINT = iPINT;
	}

}
