package com.github.prbrios.documentofiscal.nfe.retorno;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import lombok.Data;

@Data
@Root(name = "retEnviNFe")
public class RetEnviNFe {

	@Attribute(name="versao", required = false)
	private String versao;

	@Element(name = "tpAmb", required = false)
	private String tpAmb;

	@Element(name = "verAplic", required = false)
	private String verAplic;

	@Element(name = "cStat", required = false)
	private String cStat;

	@Element(name = "xMotivo", required = false)
	private String xMotivo;

	@Element(name = "cUF", required = false)
	private String cUF;

	@Element(name = "dhRecbto", required = false)
	private String dhRecbto;

	//@Element(name = "infRec", required = false)
	//private InfRec infRec;

	@Element(name = "protNFe", required = false)
	private RetEnviNFeProtNFe protNFe;

}