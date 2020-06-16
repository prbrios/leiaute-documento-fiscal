package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infProt")
public class ProtCTeInfProt {

	@Attribute(name = "Id", required = false)
	private String id;

	@Element(name = "tpAmb", required = false)
	private String tpAmb;

	@Element(name = "verAplic", required = false)
	private String verAplic;

	@Element(name = "chCTe", required = false)
	private String chCTe;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getVerAplic() {
		return verAplic;
	}

	public void setVerAplic(String verAplic) {
		this.verAplic = verAplic;
	}

	public String getChCTe() {
		return chCTe;
	}

	public void setChCTe(String chCTe) {
		this.chCTe = chCTe;
	}

	public String getDhRecbto() {
		return dhRecbto;
	}

	public void setDhRecbto(String dhRecbto) {
		this.dhRecbto = dhRecbto;
	}

	public String getnProt() {
		return nProt;
	}

	public void setnProt(String nProt) {
		this.nProt = nProt;
	}

	public String getDigVal() {
		return digVal;
	}

	public void setDigVal(String digVal) {
		this.digVal = digVal;
	}

	public String getcStat() {
		return cStat;
	}

	public void setcStat(String cStat) {
		this.cStat = cStat;
	}

	public String getxMotivo() {
		return xMotivo;
	}

	public void setxMotivo(String xMotivo) {
		this.xMotivo = xMotivo;
	}

}
