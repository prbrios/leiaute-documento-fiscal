package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infRespTec")
public class CTeInfCteInfRespTec {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "xContato", required = false)
	private String xContato;

	@Element(name = "email", required = false)
	private String email;

	@Element(name = "fone", required = false)
	private String fone;

	@Element(name = "idCSRT", required = false)
	private String idCSRT;

	@Element(name = "hashCSRT", required = false)
	private String hashCSRT;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getxContato() {
		return xContato;
	}

	public void setxContato(String xContato) {
		this.xContato = xContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getIdCSRT() {
		return idCSRT;
	}

	public void setIdCSRT(String idCSRT) {
		this.idCSRT = idCSRT;
	}

	public String getHashCSRT() {
		return hashCSRT;
	}

	public void setHashCSRT(String hashCSRT) {
		this.hashCSRT = hashCSRT;
	}

}
