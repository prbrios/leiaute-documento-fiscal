package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "emiOcc")
public class CTeInfCteInfCTeNormInfModalRodoOccEmiOcc {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "cInt", required = false)
	private String cInt;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "UF", required = false)
	private String UF;

	@Element(name = "fone", required = false)
	private String fone;

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

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
