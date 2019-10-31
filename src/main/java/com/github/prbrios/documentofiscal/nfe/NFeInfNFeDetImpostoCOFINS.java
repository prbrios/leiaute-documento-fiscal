package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "COFINS")
public class NFeInfNFeDetImpostoCOFINS {

    @Element(name = "COFINSAliq", required = false)
    private NFeInfNFeDetImpostoCOFINSCOFINSAliq COFINSAliq;

    @Element(name = "COFINSQtde", required = false)
    private NFeInfNFeDetImpostoCOFINSCOFINSQtde COFINSQtde;

    @Element(name = "COFINSNT", required = false)
    private NFeInfNFeDetImpostoCOFINSCOFINSNT COFINSNT;

    @Element(name = "COFINSOutr", required = false)
    private NFeInfNFeDetImpostoCOFINSCOFINSOutr COFINSOutr;

    public NFeInfNFeDetImpostoCOFINS() {}

    /**
     *
     * @param COFINSAliq
     * @param COFINSQtde
     * @param COFINSNT
     * @param COFINSOutr
     */
    public NFeInfNFeDetImpostoCOFINS(NFeInfNFeDetImpostoCOFINSCOFINSAliq COFINSAliq, NFeInfNFeDetImpostoCOFINSCOFINSQtde COFINSQtde, NFeInfNFeDetImpostoCOFINSCOFINSNT COFINSNT, NFeInfNFeDetImpostoCOFINSCOFINSOutr COFINSOutr) {
        this.COFINSAliq = COFINSAliq;
        this.COFINSQtde = COFINSQtde;
        this.COFINSNT = COFINSNT;
        this.COFINSOutr = COFINSOutr;
    }

}
