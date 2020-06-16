package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infCTeNorm")
public class CTeInfCteInfCTeNorm {

	@Element(name = "infCarga", required = false)
	private CTeInfCteInfCTeNormInfCarga infCarga;

	@Element(name = "infDoc", required = false)
	private CTeInfCteInfCTeNormInfDoc infDoc;

	@Element(name = "docAnt", required = false)
	private CTeInfCteInfCTeNormDocAnt docAnt;

	//TODO verificar isso
	@Element(name = "infModal", required = false)
	private CTeInfCteInfCTeNormInfModal infModal;

	@ElementList(name = "veicNovos", required = false, inline = true)
	private List<CTeInfCteInfCTeNormVeicNovos> veicNovos
			= new ArrayList<CTeInfCteInfCTeNormVeicNovos>();

	@Element(name = "cobr", required = false)
	private CTeInfCteInfCTeNormCobr cobr;

	@Element(name = "infCteSub", required = false)
	private CTeInfCteInfCTeNormInfCteSub infCteSub;

	@Element(name = "infGlobalizado", required = false)
	private CTeInfCteInfCTeNormInfGlobalizado infGlobalizado;

	@Element(name = "infServVinc", required = false)
	private CTeInfCteInfCTeNormInfServVinc infServVinc;

	public CTeInfCteInfCTeNormInfCarga getInfCarga() {
		return infCarga;
	}

	public void setInfCarga(CTeInfCteInfCTeNormInfCarga infCarga) {
		this.infCarga = infCarga;
	}

	public CTeInfCteInfCTeNormInfDoc getInfDoc() {
		return infDoc;
	}

	public void setInfDoc(CTeInfCteInfCTeNormInfDoc infDoc) {
		this.infDoc = infDoc;
	}

	public CTeInfCteInfCTeNormDocAnt getDocAnt() {
		return docAnt;
	}

	public void setDocAnt(CTeInfCteInfCTeNormDocAnt docAnt) {
		this.docAnt = docAnt;
	}

	public CTeInfCteInfCTeNormInfModal getInfModal() {
		return infModal;
	}

	public void setInfModal(CTeInfCteInfCTeNormInfModal infModal) {
		this.infModal = infModal;
	}

	public List<CTeInfCteInfCTeNormVeicNovos> getVeicNovos() {
		return veicNovos;
	}

	public void setVeicNovos(List<CTeInfCteInfCTeNormVeicNovos> veicNovos) {
		this.veicNovos = veicNovos;
	}

	public CTeInfCteInfCTeNormCobr getCobr() {
		return cobr;
	}

	public void setCobr(CTeInfCteInfCTeNormCobr cobr) {
		this.cobr = cobr;
	}

	public CTeInfCteInfCTeNormInfCteSub getInfCteSub() {
		return infCteSub;
	}

	public void setInfCteSub(CTeInfCteInfCTeNormInfCteSub infCteSub) {
		this.infCteSub = infCteSub;
	}

	public CTeInfCteInfCTeNormInfGlobalizado getInfGlobalizado() {
		return infGlobalizado;
	}

	public void setInfGlobalizado(CTeInfCteInfCTeNormInfGlobalizado infGlobalizado) {
		this.infGlobalizado = infGlobalizado;
	}

	public CTeInfCteInfCTeNormInfServVinc getInfServVinc() {
		return infServVinc;
	}

	public void setInfServVinc(CTeInfCteInfCTeNormInfServVinc infServVinc) {
		this.infServVinc = infServVinc;
	}

}
