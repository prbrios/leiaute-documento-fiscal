package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "emit")
public class CTeInfCteEmit {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "IEST", required = false)
	private String IEST;

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "xFant", required = false)
	private String xFant;

	@Element(name = "enderEmit", required = false)
	private CTeInfCteEmitEnderEmit enderEmit;

	@Element(name = "CRT", required = false)
	private String CRT;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getIEST() {
		return IEST;
	}

	public void setIEST(String iEST) {
		IEST = iEST;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getxFant() {
		return xFant;
	}

	public void setxFant(String xFant) {
		this.xFant = xFant;
	}

	public CTeInfCteEmitEnderEmit getEnderEmit() {
		return enderEmit;
	}

	public void setEnderEmit(CTeInfCteEmitEnderEmit enderEmit) {
		this.enderEmit = enderEmit;
	}

	public String getCRT() {
		return CRT;
	}

	public void setCRT(String cRT) {
		CRT = cRT;
	}

}
