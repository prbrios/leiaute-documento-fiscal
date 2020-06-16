package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ferroEnv")
public class CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnv {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "cInt", required = false)
	private String cInt;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "enderFerro", required = false)
	private CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnvEnderFerro enderFerro;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getcInt() {
		return cInt;
	}

	public void setcInt(String cInt) {
		this.cInt = cInt;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnvEnderFerro getEnderFerro() {
		return enderFerro;
	}

	public void setEnderFerro(CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnvEnderFerro enderFerro) {
		this.enderFerro = enderFerro;
	}

}
