package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "emiDocAnt")
public class CTeInfCteInfCTeNormDocAntEmiDocAnt {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "CPF", required = false)
	private String CPF;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "UF", required = false)
	private String UF;

	@Element(name = "xNome", required = false)
	private String xNome;

	@ElementList(name = "idDocAnt", required = false, inline = true)
	private List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAnt> idDocAnt
			= new ArrayList<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAnt>();

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
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

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAnt> getIdDocAnt() {
		return idDocAnt;
	}

	public void setIdDocAnt(List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAnt> idDocAnt) {
		this.idDocAnt = idDocAnt;
	}

}
