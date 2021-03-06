package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("infnfesupl")
@Root(name = "infNFeSupl")
public class NFeInfNFeSupl {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qrcode")
    @Element(name = "qrCode", required = false)
    private String qrCode;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("urlchave")
    @Element(name = "urlChave", required = false)
    private String urlChave;

    public NFeInfNFeSupl() {}

    /**
     *
     * @param qrCode
     * @param urlChave
     */
    public NFeInfNFeSupl(String qrCode, String urlChave) {
        this.qrCode = qrCode;
        this.urlChave = urlChave;
    }

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getUrlChave() {
		return urlChave;
	}

	public void setUrlChave(String urlChave) {
		this.urlChave = urlChave;
	}

}
