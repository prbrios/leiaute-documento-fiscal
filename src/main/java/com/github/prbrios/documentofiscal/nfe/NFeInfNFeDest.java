package com.github.prbrios.documentofiscal.nfe;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.EmptyElementConverter;

@JsonRootName("dest")
@Root(name = "dest")
public class NFeInfNFeDest {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
    private String CPF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("idestrangeiro")
    @Element(name = "idEstrangeiro", required = false)
    @Convert(value = EmptyElementConverter.class)
    private String idEstrangeiro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xnome")
    @Element(name = "xNome", required = false)
    private String xNome;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("enderdest")
    @Element(name = "enderDest", required = false)
    private NFeInfNFeDestEnderDest enderDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indiedest")
    @Element(name = "indIEDest", required = false)
    private String indIEDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @Element(name = "IE", required = false)
    private String IE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("isuf")
    @Element(name = "ISUF", required = false)
    private String ISUF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("im")
    @Element(name = "IM", required = false)
    private String IM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("email")
    @Element(name = "email", required = false)
    private String email;

    public NFeInfNFeDest() {}

    /**
     *
     * @param CNPJ
     * @param CPF
     * @param idEstrangeiro
     * @param xNome
     * @param enderDest
     * @param indIEDest
     * @param IE
     * @param ISUF
     * @param IM
     * @param email
     */
    public NFeInfNFeDest(String CNPJ, String CPF, String idEstrangeiro, String xNome, NFeInfNFeDestEnderDest enderDest, String indIEDest, String IE, String ISUF, String IM, String email) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.idEstrangeiro = idEstrangeiro;
        this.xNome = xNome;
        this.enderDest = enderDest;
        this.indIEDest = indIEDest;
        this.IE = IE;
        this.ISUF = ISUF;
        this.IM = IM;
        this.email = email;
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

	public String getIdEstrangeiro() {
		return idEstrangeiro;
	}

	public void setIdEstrangeiro(String idEstrangeiro) {
		this.idEstrangeiro = idEstrangeiro;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public NFeInfNFeDestEnderDest getEnderDest() {
		return enderDest;
	}

	public void setEnderDest(NFeInfNFeDestEnderDest enderDest) {
		this.enderDest = enderDest;
	}

	public String getIndIEDest() {
		return indIEDest;
	}

	public void setIndIEDest(String indIEDest) {
		this.indIEDest = indIEDest;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getISUF() {
		return ISUF;
	}

	public void setISUF(String iSUF) {
		ISUF = iSUF;
	}

	public String getIM() {
		return IM;
	}

	public void setIM(String iM) {
		IM = iM;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
