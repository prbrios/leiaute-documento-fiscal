package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rem")
public class CTeInfCteRem {

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

	@Element(name = "enderReme", required = false)
	private CTeInfCteEmitEnderReme enderReme;

	@Element(name = "email", required = false)
	private String email;

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

	public CTeInfCteEmitEnderReme getEnderReme() {
		return enderReme;
	}

	public void setEnderReme(CTeInfCteEmitEnderReme enderReme) {
		this.enderReme = enderReme;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
