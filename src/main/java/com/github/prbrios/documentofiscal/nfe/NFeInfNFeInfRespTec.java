package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("infresptec")
@Root(name = "infRespTec")
public class NFeInfNFeInfRespTec {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcontato")
    @Element(name = "xContato", required = false)
    private String xContato;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("email")
    @Element(name = "email", required = false)
    private String email;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fone")
    @Element(name = "fone", required = false)
    private String fone;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("idcsrt")
    @Element(name = "idCSRT", required = false)
    private String idCSRT;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("hashcsrt")
    @Element(name = "hashCSRT", required = false)
    private String hashCSRT;

    public NFeInfNFeInfRespTec() {}

    /**
     *
     * @param CNPJ
     * @param xContato
     * @param email
     * @param fone
     * @param idCSRT
     * @param hashCSRT
     */
    public NFeInfNFeInfRespTec(String CNPJ, String xContato, String email, String fone, String idCSRT, String hashCSRT) {
        this.CNPJ = CNPJ;
        this.xContato = xContato;
        this.email = email;
        this.fone = fone;
        this.idCSRT = idCSRT;
        this.hashCSRT = hashCSRT;
    }

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
