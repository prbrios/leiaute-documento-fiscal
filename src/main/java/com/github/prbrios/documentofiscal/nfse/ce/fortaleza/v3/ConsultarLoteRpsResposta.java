package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v3;

import java.util.ArrayList;
import java.util.List;

public class ConsultarLoteRpsResposta {
	protected ConsultarLoteRpsResposta.ListaNfse listaNfse;
	protected ListaMensagemRetorno listaMensagemRetorno;
	
	public class ListaNfse {
		protected List<CompNfse> compNfse = new ArrayList<CompNfse>();
	}
}
