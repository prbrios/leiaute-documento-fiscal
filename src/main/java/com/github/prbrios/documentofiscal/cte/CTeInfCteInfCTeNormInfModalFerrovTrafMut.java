package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "trafMut")
public class CTeInfCteInfCTeNormInfModalFerrovTrafMut {

	@Element(name = "respFat", required = false)
	private String respFat;

	@Element(name = "ferrEmi", required = false)
	private String ferrEmi;

	@Element(name = "vFrete", required = false)
	private String vFrete;

	@Element(name = "chCTeFerroOrigem", required = false)
	private String chCTeFerroOrigem;

	@ElementList(name = "ferroEnv", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnv> ferroEnv
			= new ArrayList<CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnv>();

	public String getRespFat() {
		return respFat;
	}

	public void setRespFat(String respFat) {
		this.respFat = respFat;
	}

	public String getFerrEmi() {
		return ferrEmi;
	}

	public void setFerrEmi(String ferrEmi) {
		this.ferrEmi = ferrEmi;
	}

	public String getvFrete() {
		return vFrete;
	}

	public void setvFrete(String vFrete) {
		this.vFrete = vFrete;
	}

	public String getChCTeFerroOrigem() {
		return chCTeFerroOrigem;
	}

	public void setChCTeFerroOrigem(String chCTeFerroOrigem) {
		this.chCTeFerroOrigem = chCTeFerroOrigem;
	}

	public List<CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnv> getFerroEnv() {
		return ferroEnv;
	}

	public void setFerroEnv(List<CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnv> ferroEnv) {
		this.ferroEnv = ferroEnv;
	}

}
