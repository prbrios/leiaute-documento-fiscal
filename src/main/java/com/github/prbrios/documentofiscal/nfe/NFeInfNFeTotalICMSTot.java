package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icmstot")
@Root(name = "ICMSTot")
public class NFeInfNFeTotalICMSTot {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicms")
    @Element(name = "vICMS", required = false)
    private String vICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdeson")
    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpufdest")
    @Element(name = "vFCPUFDest", required = false)
    private String vFCPUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsufdest")
    @Element(name = "vICMSUFDest", required = false)
    private String vICMSUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsufremet")
    @Element(name = "vICMSUFRemet", required = false)
    private String vICMSUFRemet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcp")
    @Element(name = "vFCP", required = false)
    private String vFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcst")
    @Element(name = "vBCST", required = false)
    private String vBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vst")
    @Element(name = "vST", required = false)
    private String vST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpst")
    @Element(name = "vFCPST", required = false)
    private String vFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpstret")
    @Element(name = "vFCPSTRet", required = false)
    private String vFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcmono")
    @Element(name = "qBCMono", required = false)
    private String qBCMono;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmono")
    @Element(name = "vICMSMono", required = false)
    private String vICMSMono;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcmonoreten")
    @Element(name = "qBCMonoReten", required = false)
    private String qBCMonoReten;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmonoreten")
    @Element(name = "vICMSMonoReten", required = false)
    private String vICMSMonoReten;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcmonoret")
    @Element(name = "qBCMonoRet", required = false)
    private String qBCMonoRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmonoret")
    @Element(name = "vICMSMonoRet", required = false)
    private String vICMSMonoRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vprod")
    @Element(name = "vProd", required = false)
    private String vProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfrete")
    @Element(name = "vFrete", required = false)
    private String vFrete;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vseg")
    @Element(name = "vSeg", required = false)
    private String vSeg;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesc")
    @Element(name = "vDesc", required = false)
    private String vDesc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vii")
    @Element(name = "vII", required = false)
    private String vII;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipi")
    @Element(name = "vIPI", required = false)
    private String vIPI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipidevol")
    @Element(name = "vIPIDevol", required = false)
    private String vIPIDevol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @Element(name = "vPIS", required = false)
    private String vPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @Element(name = "vOutro", required = false)
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vnf")
    @Element(name = "vNF", required = false)
    private String vNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtottrib")
    @Element(name = "vTotTrib", required = false)
    private String vTotTrib;

    public NFeInfNFeTotalICMSTot() {}

    /**
     *
     * @param vBC
     * @param vICMS
     * @param vICMSDeson
     * @param vFCPUFDest
     * @param vICMSUFDest
     * @param vICMSUFRemet
     * @param vFCP
     * @param vBCST
     * @param vST
     * @param vFCPST
     * @param vFCPSTRet
     * @param vProd
     * @param vFrete
     * @param vSeg
     * @param vDesc
     * @param vII
     * @param vIPI
     * @param vIPIDevol
     * @param vPIS
     * @param vCOFINS
     * @param vOutro
     * @param vNF
     * @param vTotTrib
     */
    public NFeInfNFeTotalICMSTot(String vBC, String vICMS, String vICMSDeson, String vFCPUFDest, String vICMSUFDest, String vICMSUFRemet, String vFCP, String vBCST, String vST, String vFCPST, String vFCPSTRet, String vProd, String vFrete, String vSeg, String vDesc, String vII, String vIPI, String vIPIDevol, String vPIS, String vCOFINS, String vOutro, String vNF, String vTotTrib) {
        this.vBC = vBC;
        this.vICMS = vICMS;
        this.vICMSDeson = vICMSDeson;
        this.vFCPUFDest = vFCPUFDest;
        this.vICMSUFDest = vICMSUFDest;
        this.vICMSUFRemet = vICMSUFRemet;
        this.vFCP = vFCP;
        this.vBCST = vBCST;
        this.vST = vST;
        this.vFCPST = vFCPST;
        this.vFCPSTRet = vFCPSTRet;
        this.vProd = vProd;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vII = vII;
        this.vIPI = vIPI;
        this.vIPIDevol = vIPIDevol;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vOutro = vOutro;
        this.vNF = vNF;
        this.vTotTrib = vTotTrib;
    }
    
    /**
     * 
     * @param vBC
     * @param vICMS
     * @param vICMSDeson
     * @param vFCPUFDest
     * @param vICMSUFDest
     * @param vICMSUFRemet
     * @param vFCP
     * @param vBCST
     * @param vST
     * @param vFCPST
     * @param vFCPSTRet
     * @param qBCMono
     * @param vICMSMono
     * @param qBCMonoReten
     * @param vICMSMonoReten
     * @param qBCMonoRet
     * @param vICMSMonoRet
     * @param vProd
     * @param vFrete
     * @param vSeg
     * @param vDesc
     * @param vII
     * @param vIPI
     * @param vIPIDevol
     * @param vPIS
     * @param vCOFINS
     * @param vOutro
     * @param vNF
     * @param vTotTrib
     */
    public NFeInfNFeTotalICMSTot(String vBC, String vICMS, String vICMSDeson, String vFCPUFDest, String vICMSUFDest,
            String vICMSUFRemet, String vFCP, String vBCST, String vST, String vFCPST, String vFCPSTRet, String qBCMono,
            String vICMSMono, String qBCMonoReten, String vICMSMonoReten, String qBCMonoRet, String vICMSMonoRet,
            String vProd, String vFrete, String vSeg, String vDesc, String vII, String vIPI, String vIPIDevol,
            String vPIS, String vCOFINS, String vOutro, String vNF, String vTotTrib) {
        this.vBC = vBC;
        this.vICMS = vICMS;
        this.vICMSDeson = vICMSDeson;
        this.vFCPUFDest = vFCPUFDest;
        this.vICMSUFDest = vICMSUFDest;
        this.vICMSUFRemet = vICMSUFRemet;
        this.vFCP = vFCP;
        this.vBCST = vBCST;
        this.vST = vST;
        this.vFCPST = vFCPST;
        this.vFCPSTRet = vFCPSTRet;
        this.qBCMono = qBCMono;
        this.vICMSMono = vICMSMono;
        this.qBCMonoReten = qBCMonoReten;
        this.vICMSMonoReten = vICMSMonoReten;
        this.qBCMonoRet = qBCMonoRet;
        this.vICMSMonoRet = vICMSMonoRet;
        this.vProd = vProd;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vII = vII;
        this.vIPI = vIPI;
        this.vIPIDevol = vIPIDevol;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vOutro = vOutro;
        this.vNF = vNF;
        this.vTotTrib = vTotTrib;
    }

    public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

	public String getvICMSDeson() {
		return vICMSDeson;
	}

	public void setvICMSDeson(String vICMSDeson) {
		this.vICMSDeson = vICMSDeson;
	}

	public String getvFCPUFDest() {
		return vFCPUFDest;
	}

	public void setvFCPUFDest(String vFCPUFDest) {
		this.vFCPUFDest = vFCPUFDest;
	}

	public String getvICMSUFDest() {
		return vICMSUFDest;
	}

	public void setvICMSUFDest(String vICMSUFDest) {
		this.vICMSUFDest = vICMSUFDest;
	}

	public String getvICMSUFRemet() {
		return vICMSUFRemet;
	}

	public void setvICMSUFRemet(String vICMSUFRemet) {
		this.vICMSUFRemet = vICMSUFRemet;
	}

	public String getvFCP() {
		return vFCP;
	}

	public void setvFCP(String vFCP) {
		this.vFCP = vFCP;
	}

	public String getvBCST() {
		return vBCST;
	}

	public void setvBCST(String vBCST) {
		this.vBCST = vBCST;
	}

	public String getvST() {
		return vST;
	}

	public void setvST(String vST) {
		this.vST = vST;
	}

	public String getvFCPST() {
		return vFCPST;
	}

	public void setvFCPST(String vFCPST) {
		this.vFCPST = vFCPST;
	}

	public String getvFCPSTRet() {
		return vFCPSTRet;
	}

	public void setvFCPSTRet(String vFCPSTRet) {
		this.vFCPSTRet = vFCPSTRet;
	}

	public String getvProd() {
		return vProd;
	}

	public void setvProd(String vProd) {
		this.vProd = vProd;
	}

	public String getvFrete() {
		return vFrete;
	}

	public void setvFrete(String vFrete) {
		this.vFrete = vFrete;
	}

	public String getvSeg() {
		return vSeg;
	}

	public void setvSeg(String vSeg) {
		this.vSeg = vSeg;
	}

	public String getvDesc() {
		return vDesc;
	}

	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}

	public String getvII() {
		return vII;
	}

	public void setvII(String vII) {
		this.vII = vII;
	}

	public String getvIPI() {
		return vIPI;
	}

	public void setvIPI(String vIPI) {
		this.vIPI = vIPI;
	}

	public String getvIPIDevol() {
		return vIPIDevol;
	}

	public void setvIPIDevol(String vIPIDevol) {
		this.vIPIDevol = vIPIDevol;
	}

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

	public String getvOutro() {
		return vOutro;
	}

	public void setvOutro(String vOutro) {
		this.vOutro = vOutro;
	}

	public String getvNF() {
		return vNF;
	}

	public void setvNF(String vNF) {
		this.vNF = vNF;
	}

	public String getvTotTrib() {
		return vTotTrib;
	}

	public void setvTotTrib(String vTotTrib) {
		this.vTotTrib = vTotTrib;
	}

    public String getvICMSMono() {
        return vICMSMono;
    }

    public void setvICMSMono(String vICMSMono) {
        this.vICMSMono = vICMSMono;
    }

    public String getvICMSMonoReten() {
        return vICMSMonoReten;
    }

    public void setvICMSMonoReten(String vICMSMonoReten) {
        this.vICMSMonoReten = vICMSMonoReten;
    }

    public String getvICMSMonoRet() {
        return vICMSMonoRet;
    }

    public void setvICMSMonoRet(String vICMSMonoRet) {
        this.vICMSMonoRet = vICMSMonoRet;
    }

    public String getqBCMono() {
        return qBCMono;
    }

    public void setqBCMono(String qBCMono) {
        this.qBCMono = qBCMono;
    }

    public String getqBCMonoReten() {
        return qBCMonoReten;
    }

    public void setqBCMonoReten(String qBCMonoReten) {
        this.qBCMonoReten = qBCMonoReten;
    }

    public String getqBCMonoRet() {
        return qBCMonoRet;
    }

    public void setqBCMonoRet(String qBCMonoRet) {
        this.qBCMonoRet = qBCMonoRet;
    }
    

}
