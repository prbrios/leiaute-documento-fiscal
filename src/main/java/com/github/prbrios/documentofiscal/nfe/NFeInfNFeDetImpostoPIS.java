package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("pis")
@Root(name = "PIS")
public class NFeInfNFeDetImpostoPIS {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisaliq")
    @Element(name = "PISAliq", required = false)
    private NFeInfNFeDetImpostoPISPISAliq PISAliq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisqtde")
    @Element(name = "PISQtde", required = false)
    private NFeInfNFeDetImpostoPISPISQtde PISQtde;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisnt")
    @Element(name = "PISNT", required = false)
    private NFeInfNFeDetImpostoPISPISNT PISNT;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisoutr")
    @Element(name = "PISOutr", required = false)
    private NFeInfNFeDetImpostoPISPISOutr PISOutr;

    public NFeInfNFeDetImpostoPIS() {}

    /**
     *
     * @param PISAliq
     * @param PISQtde
     * @param PISNT
     * @param PISOutr
     */
    public NFeInfNFeDetImpostoPIS(NFeInfNFeDetImpostoPISPISAliq PISAliq, NFeInfNFeDetImpostoPISPISQtde PISQtde, NFeInfNFeDetImpostoPISPISNT PISNT, NFeInfNFeDetImpostoPISPISOutr PISOutr) {
        this.PISAliq = PISAliq;
        this.PISQtde = PISQtde;
        this.PISNT = PISNT;
        this.PISOutr = PISOutr;
    }

	public NFeInfNFeDetImpostoPISPISAliq getPISAliq() {
		return PISAliq;
	}

	public void setPISAliq(NFeInfNFeDetImpostoPISPISAliq pISAliq) {
		PISAliq = pISAliq;
	}

	public NFeInfNFeDetImpostoPISPISQtde getPISQtde() {
		return PISQtde;
	}

	public void setPISQtde(NFeInfNFeDetImpostoPISPISQtde pISQtde) {
		PISQtde = pISQtde;
	}

	public NFeInfNFeDetImpostoPISPISNT getPISNT() {
		return PISNT;
	}

	public void setPISNT(NFeInfNFeDetImpostoPISPISNT pISNT) {
		PISNT = pISNT;
	}

	public NFeInfNFeDetImpostoPISPISOutr getPISOutr() {
		return PISOutr;
	}

	public void setPISOutr(NFeInfNFeDetImpostoPISPISOutr pISOutr) {
		PISOutr = pISOutr;
	}

}
