package com.github.prbrios.documentofiscal.nfe.evento.retorno;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import lombok.Data;

@Data
@Root(name = "retEnvEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class RetEnvEvento {

	@Attribute(name = "versao", required = false)
	private String versao;

	@Element(name = "idLote", required = false)
	private String idLote;

	@Element(name = "tpAmb", required = false)
	private String tpAmb;

	@Element(name = "verAplic", required = false)
	private String verAplic;

	@Element(name = "cOrgao", required = false)
	private String cOrgao;

	@Element(name = "cStat", required = false)
	private String cStat;

	@Element(name = "xMotivo", required = false)
	private String xMotivo;

	@Element(name = "retEvento", required = false)
	private RetEnvEventoRetEvento retEvento;

}