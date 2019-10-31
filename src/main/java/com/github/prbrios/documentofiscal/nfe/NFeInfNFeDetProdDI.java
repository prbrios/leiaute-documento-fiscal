package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "DI")
public class NFeInfNFeDetProdDI {

    @Element(name = "nDI", required = false)
    private String nDI;

    @Element(name = "dDI", required = false)
    private String dDI;

    @Element(name = "xLocDesemb", required = false)
    private String xLocDesemb;

    @Element(name = "UFDesemb", required = false)
    private String UFDesemb;

    @Element(name = "dDesemb", required = false)
    private String dDesemb;

    @Element(name = "tpViaTransp", required = false)
    private String tpViaTransp;

    @Element(name = "vAFRMM", required = false)
    private String vAFRMM;

    @Element(name = "tpIntermedio", required = false)
    private String tpIntermedio;

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "UFTerceiro", required = false)
    private String UFTerceiro;

    @Element(name = "cExportador", required = false)
    private String cExportador;

    @ElementList(name = "adi", required = false, inline = true)
    private List<NFeInfNFeDetProdDIAdi> adi = new ArrayList<NFeInfNFeDetProdDIAdi>();

    public NFeInfNFeDetProdDI() {}

    /**
     *
     * @param nDI
     * @param dDI
     * @param xLocDesemb
     * @param UFDesemb
     * @param dDesemb
     * @param tpViaTransp
     * @param vAFRMM
     * @param tpIntermedio
     * @param CNPJ
     * @param UFTerceiro
     * @param cExportador
     * @param adi
     */
    public NFeInfNFeDetProdDI(String nDI, String dDI, String xLocDesemb, String UFDesemb, String dDesemb, String tpViaTransp, String vAFRMM, String tpIntermedio, String CNPJ, String UFTerceiro, String cExportador, List<NFeInfNFeDetProdDIAdi> adi) {
        this.nDI = nDI;
        this.dDI = dDI;
        this.xLocDesemb = xLocDesemb;
        this.UFDesemb = UFDesemb;
        this.dDesemb = dDesemb;
        this.tpViaTransp = tpViaTransp;
        this.vAFRMM = vAFRMM;
        this.tpIntermedio = tpIntermedio;
        this.CNPJ = CNPJ;
        this.UFTerceiro = UFTerceiro;
        this.cExportador = cExportador;
        this.adi = adi;
    }

}
