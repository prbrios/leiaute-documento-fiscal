package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "toma4")
public class CTeInfCteIdeToma4 {

	@Element(name = "toma", required = false)
	private String toma;

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "CPF", required = false)
	private String CPF;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "xFant", required = false)
	private String xFant;

	@Element(name = "fone", required = false)
	private String fone;

	@Element(name = "enderToma", required = false)
	private CTeInfCteIdeToma4EnderToma enderToma;

	@Element(name = "email", required = false)
	private String email;

	public String getToma() {
		return toma;
	}

	public void setToma(String toma) {
		this.toma = toma;
	}

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

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public CTeInfCteIdeToma4EnderToma getEnderToma() {
		return enderToma;
	}

	public void setEnderToma(CTeInfCteIdeToma4EnderToma enderToma) {
		this.enderToma = enderToma;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
