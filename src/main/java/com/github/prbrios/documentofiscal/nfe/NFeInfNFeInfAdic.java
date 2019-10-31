package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infAdic")
public class NFeInfNFeInfAdic {

    @Element(name = "infAdFisco", required = false)
    private String infAdFisco;

    @Element(name = "infCpl", required = false)
    private String infCpl;

    @ElementList(name = "obsCont", required = false, inline = true)
    private List<NFeInfNFeInfAdicObsCont> obsCont = new ArrayList<NFeInfNFeInfAdicObsCont>();

    @ElementList(name = "obsFisco", required = false, inline = true)
    private List<NFeInfNFeInfAdicObsFisco> obsFisco = new ArrayList<NFeInfNFeInfAdicObsFisco>();

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

}