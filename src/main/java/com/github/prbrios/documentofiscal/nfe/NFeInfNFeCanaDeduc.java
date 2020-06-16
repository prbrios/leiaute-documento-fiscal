package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("deduc")
@Root(name = "deduc")
public class NFeInfNFeCanaDeduc {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xded")
    @Element(name = "xDed", required = false)
    private String xDed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vded")
    @Element(name = "vDed", required = false)
    private String vDed;

    public NFeInfNFeCanaDeduc() {}

    /**
     *
     * @param xDed
     * @param vDed
     */
    public NFeInfNFeCanaDeduc(String xDed, String vDed) {
        this.xDed = xDed;
        this.vDed = vDed;
    }

	public String getxDed() {
		return xDed;
	}

	public void setxDed(String xDed) {
		this.xDed = xDed;
	}

	public String getvDed() {
		return vDed;
	}

	public void setvDed(String vDed) {
		this.vDed = vDed;
	}
    
}
