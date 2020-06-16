package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infCte")
public class CTeInfCte {

	@Attribute(name = "versao", required = false)
	private String versao;

	@Attribute(name = "Id", required = false)
	private String id;

	@Element(name = "ide", required = false)
	private CTeInfCteIde ide;

	@Element(name = "compl", required = false)
	private CTeInfCteCompl compl;

	@Element(name = "emit", required = false)
	private CTeInfCteEmit emit;

	@Element(name = "rem", required = false)
	private CTeInfCteRem rem;

	@Element(name = "exped", required = false)
	private CTeInfCteExped exped;

	@Element(name = "receb", required = false)
	private CTeInfCteReceb receb;

	@Element(name = "dest", required = false)
	private CTeInfCteDest dest;

	@Element(name = "vPrest", required = false)
	private CTeInfCteVprest vPrest;

	@Element(name = "imp", required = false)
	private CTeInfCteImp imp;

	@Element(name = "infCTeNorm", required = false)
	private CTeInfCteInfCTeNorm infCTeNorm;

	@Element(name = "infCteComp", required = false)
	private CTeInfCteInfCteComp infCTeComp;

	@Element(name = "infCteAnu", required = false)
	private CTeInfCteInfCteAnu infCTeAnu;

	@ElementList(name = "autXML", required = false, inline = true)
	private List<CTeInfCteAutXML> autXML = new ArrayList<CTeInfCteAutXML>();

	@Element(name = "infRespTec", required = false)
	private CTeInfCteInfRespTec infRespTec;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CTeInfCteIde getIde() {
		return ide;
	}

	public void setIde(CTeInfCteIde ide) {
		this.ide = ide;
	}

	public CTeInfCteCompl getCompl() {
		return compl;
	}

	public void setCompl(CTeInfCteCompl compl) {
		this.compl = compl;
	}

	public CTeInfCteEmit getEmit() {
		return emit;
	}

	public void setEmit(CTeInfCteEmit emit) {
		this.emit = emit;
	}

	public CTeInfCteRem getRem() {
		return rem;
	}

	public void setRem(CTeInfCteRem rem) {
		this.rem = rem;
	}

	public CTeInfCteExped getExped() {
		return exped;
	}

	public void setExped(CTeInfCteExped exped) {
		this.exped = exped;
	}

	public CTeInfCteReceb getReceb() {
		return receb;
	}

	public void setReceb(CTeInfCteReceb receb) {
		this.receb = receb;
	}

	public CTeInfCteDest getDest() {
		return dest;
	}

	public void setDest(CTeInfCteDest dest) {
		this.dest = dest;
	}

	public CTeInfCteVprest getvPrest() {
		return vPrest;
	}

	public void setvPrest(CTeInfCteVprest vPrest) {
		this.vPrest = vPrest;
	}

	public CTeInfCteImp getImp() {
		return imp;
	}

	public void setImp(CTeInfCteImp imp) {
		this.imp = imp;
	}

	public CTeInfCteInfCTeNorm getInfCTeNorm() {
		return infCTeNorm;
	}

	public void setInfCTeNorm(CTeInfCteInfCTeNorm infCTeNorm) {
		this.infCTeNorm = infCTeNorm;
	}

	public CTeInfCteInfCteComp getInfCTeComp() {
		return infCTeComp;
	}

	public void setInfCTeComp(CTeInfCteInfCteComp infCTeComp) {
		this.infCTeComp = infCTeComp;
	}

	public CTeInfCteInfCteAnu getInfCTeAnu() {
		return infCTeAnu;
	}

	public void setInfCTeAnu(CTeInfCteInfCteAnu infCTeAnu) {
		this.infCTeAnu = infCTeAnu;
	}

	public List<CTeInfCteAutXML> getAutXML() {
		return autXML;
	}

	public void setAutXML(List<CTeInfCteAutXML> autXML) {
		this.autXML = autXML;
	}

	public CTeInfCteInfRespTec getInfRespTec() {
		return infRespTec;
	}

	public void setInfRespTec(CTeInfCteInfRespTec infRespTec) {
		this.infRespTec = infRespTec;
	}

}
