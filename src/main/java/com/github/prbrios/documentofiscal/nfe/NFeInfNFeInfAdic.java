package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("infadic")
@Root(name = "infAdic")
public class NFeInfNFeInfAdic {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infadfisco")
    @Element(name = "infAdFisco", required = false)
    private String infAdFisco;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infcpl")
    @Element(name = "infCpl", required = false)
    private String infCpl;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obscont")
    @ElementList(name = "obsCont", required = false, inline = true)
    private List<NFeInfNFeInfAdicObsCont> obsCont = new ArrayList<NFeInfNFeInfAdicObsCont>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obsfisco")
    @ElementList(name = "obsFisco", required = false, inline = true)
    private List<NFeInfNFeInfAdicObsFisco> obsFisco = new ArrayList<NFeInfNFeInfAdicObsFisco>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("procref")
    @ElementList(name = "procRef", required = false, inline = true)
    private List<NFeInfNFeInfAdicProcRef> procRef = new ArrayList<NFeInfNFeInfAdicProcRef>();

    public NFeInfNFeInfAdic() {}

    /**
     *
     * @param infAdFisco
     * @param infCpl
     * @param obsCont
     * @param obsFisco
     * @param procRef
     */
    public NFeInfNFeInfAdic(String infAdFisco, String infCpl, List<NFeInfNFeInfAdicObsCont> obsCont, List<NFeInfNFeInfAdicObsFisco> obsFisco, List<NFeInfNFeInfAdicProcRef> procRef) {
        this.infAdFisco = infAdFisco;
        this.infCpl = infCpl;
        this.obsCont = obsCont;
        this.obsFisco = obsFisco;
        this.procRef = procRef;
    }

	public String getInfAdFisco() {
		return infAdFisco;
	}

	public void setInfAdFisco(String infAdFisco) {
		this.infAdFisco = infAdFisco;
	}

	public String getInfCpl() {
		return infCpl;
	}

	public void setInfCpl(String infCpl) {
		this.infCpl = infCpl;
	}

	public List<NFeInfNFeInfAdicObsCont> getObsCont() {
		return obsCont;
	}

	public void setObsCont(List<NFeInfNFeInfAdicObsCont> obsCont) {
		this.obsCont = obsCont;
	}

	public List<NFeInfNFeInfAdicObsFisco> getObsFisco() {
		return obsFisco;
	}

	public void setObsFisco(List<NFeInfNFeInfAdicObsFisco> obsFisco) {
		this.obsFisco = obsFisco;
	}

	public List<NFeInfNFeInfAdicProcRef> getProcRef() {
		return procRef;
	}

	public void setProcRef(List<NFeInfNFeInfAdicProcRef> procRef) {
		this.procRef = procRef;
	}

}
