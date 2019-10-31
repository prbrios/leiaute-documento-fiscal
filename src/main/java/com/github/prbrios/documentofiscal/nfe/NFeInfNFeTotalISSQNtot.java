package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ISSQNtot")
public class NFeInfNFeTotalISSQNtot {

    @Element(name = "vServ", required = false)
    private String vServ;

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "vISS", required = false)
    private String vISS;

    @Element(name = "vPIS", required = false)
    private String vPIS;

    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    @Element(name = "dCompet", required = false)
    private String dCompet;

    @Element(name = "vDeducao", required = false)
    private String vDeducao;

    @Element(name = "vOutro", required = false)
    private String vOutro;

    @Element(name = "vDescIncond", required = false)
    private String vDescIncond;

    @Element(name = "vDescCond", required = false)
    private String vDescCond;

    @Element(name = "vISSRet", required = false)
    private String vISSRet;

    @Element(name = "cRegTrib", required = false)
    private String cRegTrib;

    public NFeInfNFeTotalISSQNtot() {}

    /**
     *
     * @param vServ
     * @param vBC
     * @param vISS
     * @param vPIS
     * @param vCOFINS
     * @param dCompet
     * @param vDeducao
     * @param vOutro
     * @param vDescIncond
     * @param vDescCond
     * @param vISSRet
     * @param cRegTrib
     */
    public NFeInfNFeTotalISSQNtot(String vServ, String vBC, String vISS, String vPIS, String vCOFINS, String dCompet, String vDeducao, String vOutro, String vDescIncond, String vDescCond, String vISSRet, String cRegTrib) {
        this.vServ = vServ;
        this.vBC = vBC;
        this.vISS = vISS;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.dCompet = dCompet;
        this.vDeducao = vDeducao;
        this.vOutro = vOutro;
        this.vDescIncond = vDescIncond;
        this.vDescCond = vDescCond;
        this.vISSRet = vISSRet;
        this.cRegTrib = cRegTrib;
    }

}
