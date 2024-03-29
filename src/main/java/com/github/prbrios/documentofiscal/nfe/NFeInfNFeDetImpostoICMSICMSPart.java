package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icmspart")
@Root(name = "ICMSPart")
public class NFeInfNFeDetImpostoICMSICMSPart {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modbc")
    @Element(name = "modBC", required = false)
    private String modBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbc")
    @Element(name = "pRedBC", required = false)
    private String pRedBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picms")
    @Element(name = "pICMS", required = false)
    private String pICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicms")
    @Element(name = "vICMS", required = false)
    private String vICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modbcst")
    @Element(name = "modBCST", required = false)
    private String modBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pmvast")
    @Element(name = "pMVAST", required = false)
    private String pMVAST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbcst")
    @Element(name = "pRedBCST", required = false)
    private String pRedBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcst")
    @Element(name = "vBCST", required = false)
    private String vBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsst")
    @Element(name = "pICMSST", required = false)
    private String pICMSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsst")
    @Element(name = "vICMSST", required = false)
    private String vICMSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcpst")
    @Element(name = "vBCFCPST", required = false)
    private String vBCFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpst")
    @Element(name = "pFCPST", required = false)
    private String pFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpst")
    @Element(name = "vFCPST", required = false)
    private String vFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pbcop")
    @Element(name = "pBCOp", required = false)
    private String pBCOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufst")
    @Element(name = "UFST", required = false)
    private String UFST;

    public NFeInfNFeDetImpostoICMSICMSPart() {}

    /**
     *
     * @param orig
     * @param CST
     * @param modBC
     * @param vBC
     * @param pRedBC
     * @param pICMS
     * @param vICMS
     * @param modBCST
     * @param pMVAST
     * @param pRedBCST
     * @param vBCST
     * @param pICMSST
     * @param vICMSST
     * @param pBCOp
     * @param UFST
     */
    public NFeInfNFeDetImpostoICMSICMSPart(String orig, String CST, String modBC, String vBC, String pRedBC, String pICMS, String vICMS, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String pBCOp, String UFST) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.vBC = vBC;
        this.pRedBC = pRedBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.modBCST = modBCST;
        this.pMVAST = pMVAST;
        this.pRedBCST = pRedBCST;
        this.vBCST = vBCST;
        this.pICMSST = pICMSST;
        this.vICMSST = vICMSST;
        this.pBCOp = pBCOp;
        this.UFST = UFST;
    }

    public NFeInfNFeDetImpostoICMSICMSPart(String orig, String CST, String modBC, String vBC, String pRedBC, String pICMS, String vICMS, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String vBCFCPST, String pFCPST, String vFCPST, String pBCOp, String UFST) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.vBC = vBC;
        this.pRedBC = pRedBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.modBCST = modBCST;
        this.pMVAST = pMVAST;
        this.pRedBCST = pRedBCST;
        this.vBCST = vBCST;
        this.pICMSST = pICMSST;
        this.vICMSST = vICMSST;
        this.vBCFCPST = vBCFCPST;
        this.pFCPST = pFCPST;
        this.vFCPST = vFCPST;
        this.pBCOp = pBCOp;
        this.UFST = UFST;
    }

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getModBC() {
		return modBC;
	}

	public void setModBC(String modBC) {
		this.modBC = modBC;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpRedBC() {
		return pRedBC;
	}

	public void setpRedBC(String pRedBC) {
		this.pRedBC = pRedBC;
	}

	public String getpICMS() {
		return pICMS;
	}

	public void setpICMS(String pICMS) {
		this.pICMS = pICMS;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

	public String getModBCST() {
		return modBCST;
	}

	public void setModBCST(String modBCST) {
		this.modBCST = modBCST;
	}

	public String getpMVAST() {
		return pMVAST;
	}

	public void setpMVAST(String pMVAST) {
		this.pMVAST = pMVAST;
	}

	public String getpRedBCST() {
		return pRedBCST;
	}

	public void setpRedBCST(String pRedBCST) {
		this.pRedBCST = pRedBCST;
	}

	public String getvBCST() {
		return vBCST;
	}

	public void setvBCST(String vBCST) {
		this.vBCST = vBCST;
	}

	public String getpICMSST() {
		return pICMSST;
	}

	public void setpICMSST(String pICMSST) {
		this.pICMSST = pICMSST;
	}

	public String getvICMSST() {
		return vICMSST;
	}

	public void setvICMSST(String vICMSST) {
		this.vICMSST = vICMSST;
	}

	public String getvBCFCPST() {
		return this.vBCFCPST;
	} 

	public void setvBCFCPST(String vBCFCPST){
		this.vBCFCPST = vBCFCPST;
	}

	public String getpFCPST() {
		return this.pFCPST;
	}

	public void setpFCPST(String pFCPST){
		this.pFCPST = pFCPST;
	}

	public String getvFCPST() {
		return this.vFCPST;
	}

	public void setvFCPST(String vFCPST) {
		this.vFCPST = vFCPST;
	}

	public String getpBCOp() {
		return pBCOp;
	}

	public void setpBCOp(String pBCOp) {
		this.pBCOp = pBCOp;
	}

	public String getUFST() {
		return UFST;
	}

	public void setUFST(String uFST) {
		UFST = uFST;
	}

}
