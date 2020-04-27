package com.github.prbrios.documentofiscal.nfe.retorno;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import lombok.Data;

@JsonRootName("retenvinfe")
@Data
@Root(name = "retEnviNFe")
public class RetEnviNFe {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("versao")
	@Attribute(name="versao", required = false)
	private String versao;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("tpamb")
	@Element(name = "tpAmb", required = false)
	private String tpAmb;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("veraplic")
	@Element(name = "verAplic", required = false)
	private String verAplic;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cstat")
	@Element(name = "cStat", required = false)
	private String cStat;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xmotivo")
	@Element(name = "xMotivo", required = false)
	private String xMotivo;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cuf")
	@Element(name = "cUF", required = false)
	private String cUF;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("dhrecbto")
	@Element(name = "dhRecbto", required = false)
	private String dhRecbto;

	//@Element(name = "infRec", required = false)
	//private InfRec infRec;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("protnfe")
	@Element(name = "protNFe", required = false)
	private RetEnviNFeProtNFe protNFe;

}