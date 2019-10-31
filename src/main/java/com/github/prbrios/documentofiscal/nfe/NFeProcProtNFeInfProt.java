package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infProt")
class NFeProcProtNFeInfProt {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @Element(name = "verAplic", required = false)
    private String verAplic;

    @Element(name = "chNFe", required = false)
    private String chNFe;

    @Element(name = "dhRecbto", required = false)
    private String dhRecbto;

    @Element(name = "nProt", required = false)
    private String nProt;

    @Element(name = "digVal", required = false)
    private String digVal;

    @Element(name = "cStat", required = false)
    private String cStat;

    @Element(name = "xMotivo", required = false)
    private String xMotivo;

    @Element(name = "cMsg", required = false)
    private String cMsg;

    @Element(name = "xMsg", required = false)
    private String xMsg;

    public NFeProcProtNFeInfProt() {}

    /**
     *
     * @param id
     * @param tpAmb
     * @param verAplic
     * @param chNFe
     * @param dhRecbto
     * @param nProt
     * @param digVal
     * @param cStat
     * @param xMotivo
     * @param cMsg
     * @param xMsg
     */
    public NFeProcProtNFeInfProt(String id, String tpAmb, String verAplic, String chNFe, String dhRecbto, String nProt, String digVal, String cStat, String xMotivo, String cMsg, String xMsg) {
        this.id = id;
        this.tpAmb = tpAmb;
        this.verAplic = verAplic;
        this.chNFe = chNFe;
        this.dhRecbto = dhRecbto;
        this.nProt = nProt;
        this.digVal = digVal;
        this.cStat = cStat;
        this.xMotivo = xMotivo;
        this.cMsg = cMsg;
        this.xMsg = xMsg;
    }

}
