package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "PIS")
public class NFeInfNFeDetImpostoPIS {

    @Element(name = "PISAliq", required = false)
    private NFeInfNFeDetImpostoPISPISAliq PISAliq;

    @Element(name = "PISQtde", required = false)
    private NFeInfNFeDetImpostoPISPISQtde PISQtde;

    @Element(name = "PISNT", required = false)
    private NFeInfNFeDetImpostoPISPISNT PISNT;

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

}
