package com.github.prbrios.documentofiscal.nfe.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.prbrios.documentofiscal.nfe.NFe;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFe;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeAutXML;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeAvulsa;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeCana;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeCobr;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeCompra;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDest;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDestEnderDest;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDet;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetImposto;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetImpostoDevol;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetObsItem;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProd;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdArma;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdComb;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdCombCIDE;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdCombEncerrante;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdDI;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdDIAdi;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdDetExport;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdDetExportExportInd;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdMed;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdRastro;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeDetProdVeicProd;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeEmit;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeEmitEnderEmit;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeEntrega;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeExporta;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeIde;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeInfAdic;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeInfIntermed;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeInfRespTec;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFePag;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeRetirada;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeTotal;
import com.github.prbrios.documentofiscal.nfe.NFeInfNFeTransp;
import com.github.prbrios.documentofiscal.nfe.util.Validador.Esquema;

import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class ValidadorTest {

	@Test
	public void validaNFe() throws Exception{
		assertTrue(Validador.validaNFe(nfe(), Esquema.PL_009i_NT2021_004_v100a));
	}

	@Test
	public void convertJsonToObject() throws Exception {
		InputStream is = ValidadorTest.class.getResourceAsStream("nfe.json");
		String text = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8)).lines().collect(Collectors.joining("\n"));

		ObjectMapper om = new ObjectMapper();
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		NFe nfe = om.readValue(text, NFe.class);

		assertEquals("4.00", nfe.getInfNFe().getVersao());
		assertEquals("NFe00000000000000000000000000000000000000001234", nfe.getInfNFe().getId());

		assertEquals("23", nfe.getInfNFe().getIde().getcUF());
		assertEquals("00000000", nfe.getInfNFe().getIde().getcNF());
		assertEquals("Venda de mercadoria adquirida de terceiros", nfe.getInfNFe().getIde().getNatOp());
		//assertEquals("", nfe.getInfNFe().getIde().getIndPag());
		assertEquals("55", nfe.getInfNFe().getIde().getMod());
		assertEquals("1", nfe.getInfNFe().getIde().getSerie());
		assertEquals("1", nfe.getInfNFe().getIde().getnNF());
		assertEquals("2022-01-01T10:00:00-03:00", nfe.getInfNFe().getIde().getDhEmi());
		assertEquals("2022-01-01T10:00:00-03:00", nfe.getInfNFe().getIde().getDhSaiEnt());
		assertEquals("1", nfe.getInfNFe().getIde().getTpNF());
		assertEquals("1", nfe.getInfNFe().getIde().getIdDest());
		assertEquals("2304400", nfe.getInfNFe().getIde().getcMunFG());
		assertEquals("1", nfe.getInfNFe().getIde().getTpImp());
		assertEquals("1", nfe.getInfNFe().getIde().getTpEmis());
		assertEquals("4", nfe.getInfNFe().getIde().getcDV());
		assertEquals("2", nfe.getInfNFe().getIde().getTpAmb());
		assertEquals("1", nfe.getInfNFe().getIde().getFinNFe());
		assertEquals("1", nfe.getInfNFe().getIde().getIndFinal());
		assertEquals("1", nfe.getInfNFe().getIde().getIndPres());
		assertEquals("0", nfe.getInfNFe().getIde().getProcEmi());
		assertEquals("1.0", nfe.getInfNFe().getIde().getVerProc());
		assertEquals("2022-01-01T10:00:00-03:00", nfe.getInfNFe().getIde().getDhCont());
		assertEquals("PROBLEMAS TECNICOS NA SEFAZ", nfe.getInfNFe().getIde().getxJust());

		assertEquals("11111111111111111111111111111111111111112222", nfe.getInfNFe().getIde().getnFref().get(0).getRefNFe());
		assertEquals("22222222222222222222222222222222222222223333", nfe.getInfNFe().getIde().getnFref().get(1).getRefNFe());

		assertEquals(nfe.getInfNFe().getIde().getnFref().get(2).getRefNF().getAAMM(), "2201");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(2).getRefNF().getCNPJ(), "11222333000122");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(2).getRefNF().getMod(), "55");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(2).getRefNF().getSerie(), "1");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(2).getRefNF().getcUF(), "23");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(2).getRefNF().getnNF(), "1");

		assertEquals(nfe.getInfNFe().getIde().getnFref().get(3).getRefNF().getAAMM(), "2201");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(3).getRefNF().getCNPJ(), "22333444000566");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(3).getRefNF().getMod(), "55");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(3).getRefNF().getSerie(), "1");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(3).getRefNF().getcUF(), "23");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(3).getRefNF().getnNF(), "1");

		assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getAAMM(), "2201");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getCNPJ(), "33444555000677");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getCPF(), "33344455566");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getIE(), "1122334455");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getMod(), "55");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getSerie(), "1");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getcUF(), "23");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getnNF(), "1");
		//assertEquals(nfe.getInfNFe().getIde().getnFref().get(4).getRefNFP().getRefCTe(), "33333333333333333333333333333333333333334444");

		assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getAAMM(), "2201");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getCNPJ(), "33444555000678");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getCPF(), "33344455567");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getIE(), "1122334456");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getMod(), "55");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getSerie(), "1");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getcUF(), "23");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getnNF(), "1");
		//assertEquals(nfe.getInfNFe().getIde().getnFref().get(5).getRefNFP().getRefCTe(), "44444444444444444444444444444444444444445555");

		assertEquals(nfe.getInfNFe().getIde().getnFref().get(6).getRefECF().getMod(), "55");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(6).getRefECF().getnCOO(), "1");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(6).getRefECF().getnECF(), "1");

		assertEquals(nfe.getInfNFe().getIde().getnFref().get(7).getRefECF().getMod(), "55");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(7).getRefECF().getnCOO(), "2");
		assertEquals(nfe.getInfNFe().getIde().getnFref().get(7).getRefECF().getnECF(), "2");

		assertEquals(nfe.getInfNFe().getEmit().getCNAE(), "22997766");
		assertEquals(nfe.getInfNFe().getEmit().getCNPJ(), "33222111000477");
		assertEquals(nfe.getInfNFe().getEmit().getCPF(), "99955511122");
		assertEquals(nfe.getInfNFe().getEmit().getCRT(), "3");
		assertEquals(nfe.getInfNFe().getEmit().getIE(), "5522887744");
		assertEquals(nfe.getInfNFe().getEmit().getIEST(), "22336655");
		assertEquals(nfe.getInfNFe().getEmit().getIM(), "55889911");
		assertEquals(nfe.getInfNFe().getEmit().getxFant(), "PLUTAO");
		assertEquals(nfe.getInfNFe().getEmit().getxNome(), "PLUTAO LTDA");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getCEP(), "60000100");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getFone(), "85999998888");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getNro(), "10");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getUF(), "CE");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getcMun(), "2304400");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getcPais(), "1058");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getxBairro(), "CENTRO");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getxCpl(), "SALA 3");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getxLgr(), "RUA 1");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getxMun(), "FORTALEZA");
		assertEquals(nfe.getInfNFe().getEmit().getEnderEmit().getxPais(), "BRASIL");

		assertEquals(nfe.getInfNFe().getAvulsa().getCNPJ(), "55666777000899");
		assertEquals(nfe.getInfNFe().getAvulsa().getFone(), "85988887777");
		assertEquals(nfe.getInfNFe().getAvulsa().getMatr(), "matr");
		assertEquals(nfe.getInfNFe().getAvulsa().getRepEmi(), "repemi");
		assertEquals(nfe.getInfNFe().getAvulsa().getUF(), "ce");
		assertEquals(nfe.getInfNFe().getAvulsa().getdEmi(), "2022-01-01");
		assertEquals(nfe.getInfNFe().getAvulsa().getdPag(), "2021-01-01");
		assertEquals(nfe.getInfNFe().getAvulsa().getnDAR(), "123456");
		assertEquals(nfe.getInfNFe().getAvulsa().getvDAR(), "0.00");
		assertEquals(nfe.getInfNFe().getAvulsa().getxAgente(), "agente");
		assertEquals(nfe.getInfNFe().getAvulsa().getxOrgao(), "orgao");

		assertEquals(nfe.getInfNFe().getDest().getCNPJ(), "99888777000655");
		assertEquals(nfe.getInfNFe().getDest().getCPF(), "99988877766");
		assertEquals(nfe.getInfNFe().getDest().getEmail(), "eu@tu.com.br");
		assertEquals(nfe.getInfNFe().getDest().getIE(), "999999");
		assertEquals(nfe.getInfNFe().getDest().getIM(), "777777");
		assertEquals(nfe.getInfNFe().getDest().getISUF(), "888888");
		assertEquals(nfe.getInfNFe().getDest().getIdEstrangeiro(), "654321");
		assertEquals(nfe.getInfNFe().getDest().getIndIEDest(), "9");
		assertEquals(nfe.getInfNFe().getDest().getxNome(), "NFE EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getCEP(), "60000100");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getFone(), "85977776666");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getNro(), "5");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getUF(), "CE");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getcMun(), "2304400");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getcPais(), "1058");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getxBairro(), "CENTRO");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getxCpl(), "APARTAMENTO 2");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getxLgr(), "RUA J");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getxMun(), "FORTALEZA");
		assertEquals(nfe.getInfNFe().getDest().getEnderDest().getxPais(), "BRASIL");

		assertEquals(nfe.getInfNFe().getRetirada().getCEP(), null);
		assertEquals(nfe.getInfNFe().getRetirada().getCNPJ(), "33444555000677");
		assertEquals(nfe.getInfNFe().getRetirada().getCPF(), "88822244412");
		assertEquals(nfe.getInfNFe().getRetirada().getEmail(), null);
		assertEquals(nfe.getInfNFe().getRetirada().getFone(), null);
		assertEquals(nfe.getInfNFe().getRetirada().getIE(), null);
		assertEquals(nfe.getInfNFe().getRetirada().getNro(), "100");
		assertEquals(nfe.getInfNFe().getRetirada().getUF(), "CE");
		assertEquals(nfe.getInfNFe().getRetirada().getcMun(), "2304400");
		assertEquals(nfe.getInfNFe().getRetirada().getcPais(), null);
		assertEquals(nfe.getInfNFe().getRetirada().getxBairro(), "CENTRO");
		assertEquals(nfe.getInfNFe().getRetirada().getxCpl(), "CASA 20");
		assertEquals(nfe.getInfNFe().getRetirada().getxLgr(), "RUA X");
		assertEquals(nfe.getInfNFe().getRetirada().getxMun(), "FORTALEZA");
		assertEquals(nfe.getInfNFe().getRetirada().getxNome(), null);
		assertEquals(nfe.getInfNFe().getRetirada().getxPais(), null);

		assertEquals(nfe.getInfNFe().getEntrega().getCEP(), null);
		assertEquals(nfe.getInfNFe().getEntrega().getCNPJ(), "33444555000677");
		assertEquals(nfe.getInfNFe().getEntrega().getCPF(), "88822244412");
		assertEquals(nfe.getInfNFe().getEntrega().getEmail(), null);
		assertEquals(nfe.getInfNFe().getEntrega().getFone(), null);
		assertEquals(nfe.getInfNFe().getEntrega().getIE(), null);
		assertEquals(nfe.getInfNFe().getEntrega().getNro(), "100");
		assertEquals(nfe.getInfNFe().getEntrega().getUF(), "CE");
		assertEquals(nfe.getInfNFe().getEntrega().getcMun(), "2304400");
		assertEquals(nfe.getInfNFe().getEntrega().getcPais(), null);
		assertEquals(nfe.getInfNFe().getEntrega().getxBairro(), "CENTRO");
		assertEquals(nfe.getInfNFe().getEntrega().getxCpl(), "CASA 20");
		assertEquals(nfe.getInfNFe().getEntrega().getxLgr(), "RUA X");
		assertEquals(nfe.getInfNFe().getEntrega().getxMun(), "FORTALEZA");
		assertEquals(nfe.getInfNFe().getEntrega().getxNome(), null);
		assertEquals(nfe.getInfNFe().getEntrega().getxPais(), null);

		assertEquals(nfe.getInfNFe().getAutXML().get(0).getCNPJ(), "9988877700065");
		assertEquals(nfe.getInfNFe().getAutXML().get(0).getCPF(), "66655544412");

		assertEquals(nfe.getInfNFe().getAutXML().get(1).getCNPJ(), "00999888000766");
		assertEquals(nfe.getInfNFe().getAutXML().get(1).getCPF(), "00099988877");

		assertEquals(nfe.getInfNFe().getDet().get(0).getnItem(), "1");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getCEST(), "7777777");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getCFOP(), "1253");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getCNPJFab(), "44555666000788");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getEXTIPI(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getIndEscala(), "A");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getIndTot(), "0");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getNCM(), "99999999");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getNVE().get(0), "123456");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getNVE().get(1), "654321");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getcBarra(), "12345678");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getcBarraTrib(), "12345678");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getcBenef(), "ABCDEFGH");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getcEAN(), "98798798");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getcEANTrib(), "98798798");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getcProd(), "P00001");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getnFCI(), "A");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getnItemPed(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getnRECOPI(), "012345678901234567890");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getqCom(), "1.0000");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getqTrib(), "1.0000");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getuCom(), "UND");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getuTrib(), "UND");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getvDesc(), "0.00");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getvFrete(), "0.00");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getvOutro(), "0.00");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getvProd(), "1.00");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getvSeg(), "0.00");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getvUnCom(), "1.0000");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getvUnTrib(), "1.0000");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getxPed(), "PED001");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getxProd(), "PRODUTO X");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getArma().get(0).getDescr(), "pistola .40");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getArma().get(0).getTpArma(), "0");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getArma().get(0).getnCano(), "123");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getArma().get(0).getnSerie(), "1");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getArma().get(1).getDescr(), "pistola .40");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getArma().get(1).getTpArma(), "0");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getArma().get(1).getnCano(), "123");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getArma().get(1).getnSerie(), "1");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getCODIF(), "12345");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getDescANP(), "DESC ANP");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getUFCons(), "CE");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getcProdANP(), "012345678");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getpGLP(), "0.1234");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getpGNi(), "0.1234");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getpGNn(), "0.1234");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getqTemp(), "1.0000");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getvPart(), "1.00");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getCIDE().getqBCProd(), "1.0000");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getCIDE().getvAliqProd(), "1.0000");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getCIDE().getvCIDE(), "1.00");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getEncerrante().getnBico(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getEncerrante().getnBomba(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getEncerrante().getnTanque(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getEncerrante().getvEncFin(), "1.000");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getComb().getEncerrante().getvEncIni(), "1.000");

		// di
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getCNPJ(), "11222333000455");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getTpIntermedio(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getTpViaTransp(), "4");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getUFDesemb(), "CE");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getUFTerceiro(), "CE");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getcExportador(), "12345");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getdDI(), "2022-01-01");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getdDesemb(), "2022-01-01");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getnDI(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getvAFRMM(), "1.00");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getxLocDesemb(), "AEROPORTO");

		// di -> adi
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(0).getcFabricante(), "C001");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(0).getnAdicao(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(0).getnDraw(), "012345678");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(0).getnSeqAdic(), "1");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(0).getvDescDI(), "0.00");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(1).getcFabricante(), "C001");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(1).getnAdicao(), "2");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(1).getnDraw(), "012345678");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(1).getnSeqAdic(), "2");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDI().get(0).getAdi().get(1).getvDescDI(), "0.00");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDetExport().get(0).getnDraw(), "012345678");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDetExport().get(0).getExportInd().getChNFe(), "00000000000000000000000000000000000000001234");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDetExport().get(0).getExportInd().getnRE(), "012345678901");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDetExport().get(0).getExportInd().getqExport(), "1.0000");

		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDetExport().get(1).getnDraw(), "876543210");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDetExport().get(1).getExportInd().getChNFe(), "00000000000000000000000000000000000000001235");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDetExport().get(1).getExportInd().getnRE(), "012345678901");
		assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getDetExport().get(1).getExportInd().getqExport(), "2.0000");

		//assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getMed(), "");
		//assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getRastro(), "");
		//assertEquals(nfe.getInfNFe().getDet().get(0).getProd().getVeicProd(), "");


		StringWriter sw = new StringWriter();
		Persister persister = new Persister();
		persister.write(nfe, sw);
		System.out.println(sw.toString());

	}

	private String nfe() throws Exception {

		NFe nfe = new NFe();
		nfe.setInfNFe(getInfNFe());
		nfe.setInfNFeSupl(null);
		nfe.setSignature(null);

		StringWriter writer = new StringWriter();
		Persister persister = new Persister();
		persister.write(nfe, writer);
		return writer.toString();

	}

	private NFeInfNFe getInfNFe() {

		NFeInfNFe infNFe = new NFeInfNFe();
		infNFe.setAutXML(getAutXML());
		infNFe.setAvulsa(getAvulsa());
		infNFe.setCana(getCana());
		infNFe.setCobr(getCobr());
		infNFe.setCompra(getCompra());
		infNFe.setDest(getDest());
		infNFe.setDet(getDet());
		infNFe.setEmit(getEmit());
		infNFe.setEntrega(getEntrega());
		infNFe.setExporta(getExporta());
		infNFe.setId("NFe01234567890123456789012345678901234567890123");
		infNFe.setIde(getIde());
		infNFe.setInfAdic(getInfAdic());
		infNFe.setInfIntermed(getInfIntermed());
		infNFe.setInfRespTec(getInfRespTec());
		infNFe.setPag(getPag());
		infNFe.setRetirada(getRetirada());
		infNFe.setTotal(getTotal());
		infNFe.setTransp(getTransp());
		infNFe.setVersao("4.00");

		return infNFe;
	}

	private List<NFeInfNFeAutXML> getAutXML() {
		return null;
	}

	private NFeInfNFeAvulsa getAvulsa() {
		return null;
	}

	private NFeInfNFeCana getCana() {
		return null;
	}

	private NFeInfNFeCobr getCobr() {
		return null;
	}

	private NFeInfNFeCompra getCompra() {
		return null;
	}

	private NFeInfNFeDest getDest() {

		NFeInfNFeDestEnderDest enderDest = new NFeInfNFeDestEnderDest();
		enderDest.setCEP("61000000");
		enderDest.setFone("85999999999");
		enderDest.setNro("1");
		enderDest.setUF("CE");
		enderDest.setcMun("2304400");
		enderDest.setcPais("1083");
		enderDest.setxBairro("CENTRO");
		enderDest.setxCpl("SALA 2");
		enderDest.setxLgr("RUA X");
		enderDest.setxMun("FORTALEZA");
		enderDest.setxPais("BRASIL");

		NFeInfNFeDest obj = new NFeInfNFeDest();
		obj.setCPF("59018874094");
		obj.setEmail("email@email.com");
		obj.setEnderDest(enderDest);
		obj.setIE(null);
		obj.setIM(null);
		obj.setISUF(null);
		obj.setIdEstrangeiro(null);
		obj.setIndIEDest("9");
		obj.setxNome("NFE EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");
		return obj;
	}

	private NFeInfNFeDetProd getProd(){

		List<NFeInfNFeDetProdArma> arma = new ArrayList<NFeInfNFeDetProdArma>();
		arma.add(new NFeInfNFeDetProdArma("1", "serie", "cano", "descr"));

		NFeInfNFeDetProdCombCIDE cide = new NFeInfNFeDetProdCombCIDE();
		cide.setqBCProd("0.00");
		cide.setvAliqProd("0.00");
		cide.setvCIDE("0.00");

		NFeInfNFeDetProdCombEncerrante encerrante = new NFeInfNFeDetProdCombEncerrante();
		encerrante.setnBico("1");
		encerrante.setnBomba("1");
		encerrante.setnTanque("1");
		encerrante.setvEncFin("0.00");
		encerrante.setvEncIni("0.00");

		NFeInfNFeDetProdComb comb = new NFeInfNFeDetProdComb();
		comb.setCIDE(cide);
		comb.setCODIF("cODIF");
		comb.setDescANP("descANP");
		comb.setEncerrante(encerrante);
		comb.setUFCons("CE");
		comb.setcProdANP("cProdANP");
		comb.setpGLP("pGLP");
		comb.setpGNi("pGNi");
		comb.setpGNn("pGNn");
		comb.setqTemp("qTemp");
		comb.setvPart("0.00");

		NFeInfNFeDetProdDIAdi adi = new NFeInfNFeDetProdDIAdi();
		adi.setcFabricante("cFabricante");
		adi.setnAdicao("nAdicao");
		adi.setnDraw("nDraw");
		adi.setnSeqAdic("nSeqAdic");
		adi.setvDescDI("0.00");

		List<NFeInfNFeDetProdDIAdi> adiArr = new ArrayList<NFeInfNFeDetProdDIAdi>();
		adiArr.add(adi);

		NFeInfNFeDetProdDI di = new NFeInfNFeDetProdDI();
		di.setAdi(adiArr);
		di.setCNPJ("cNPJ");
		di.setTpIntermedio("tpIntermedio");
		di.setTpViaTransp("tpViaTransp");
		di.setUFDesemb("uFDesemb");
		di.setUFTerceiro("uFTerceiro");
		di.setcExportador("cExportador");
		di.setdDI("dDI");
		di.setdDesemb("dDesemb");
		di.setnDI("nDI");
		di.setvAFRMM("vAFRMM");
		di.setxLocDesemb("xLocDesemb");

		List<NFeInfNFeDetProdDI> diArr = new ArrayList<NFeInfNFeDetProdDI>();
		diArr.add(di);

		NFeInfNFeDetProdDetExportExportInd exportInd = new NFeInfNFeDetProdDetExportExportInd();
		exportInd.setChNFe("chNFe");
		exportInd.setnRE("nRE");
		exportInd.setqExport("qExport");

		NFeInfNFeDetProdDetExport detExport = new NFeInfNFeDetProdDetExport();
		detExport.setExportInd(exportInd);
		detExport.setnDraw("nDraw");

		List<NFeInfNFeDetProdDetExport> detExportArr = new ArrayList<NFeInfNFeDetProdDetExport>();
		detExportArr.add(detExport);

		NFeInfNFeDetProdMed med = new NFeInfNFeDetProdMed();
		med.setcProdANVISA("cProdANVISA");
		med.setvPMC("vPMC");
		med.setxMotivoIsencao("xMotivoIsencao");

		List<String> nVE = new ArrayList<String>();
		nVE.add("1");
		nVE.add("2");
		
		NFeInfNFeDetProdRastro rastro = new NFeInfNFeDetProdRastro();
		rastro.setcAgreg("cAgreg");
		rastro.setdFab("dFab");
		rastro.setdVal("dVal");
		rastro.setnLote("nLote");
		rastro.setqLote("qLote");

		List<NFeInfNFeDetProdRastro> rastroArr = new ArrayList<NFeInfNFeDetProdRastro>();
		rastroArr.add(rastro);

		NFeInfNFeDetProdVeicProd veicProd = new NFeInfNFeDetProdVeicProd();
		veicProd.setAnoFab("anoFab");
		veicProd.setAnoMod("anoMod");
		veicProd.setCMT("cMT");
		veicProd.setChassi("chassi");
		veicProd.setCilin("cilin");
		veicProd.setCondVeic("condVeic");
		veicProd.setDist("dist");
		veicProd.setEspVeic("espVeic");
		veicProd.setLota("lota");
		veicProd.setPesoB("pesoB");
		veicProd.setPesoL("pesoL");
		veicProd.setPot("pot");

		NFeInfNFeDetProd prod = new NFeInfNFeDetProd();
		prod.setArma(arma);
		prod.setCEST("1234567");
		prod.setCFOP("1234");
		prod.setCNPJFab("12123123000012");
		prod.setComb(comb);
		prod.setDI(diArr);
		prod.setDetExport(detExportArr);
		prod.setEXTIPI("eXTIPI");
		prod.setIndEscala("indEscala");
		prod.setIndTot("indTot");
		prod.setMed(med);
		prod.setNCM("nCM");
		prod.setNVE(nVE);
		prod.setRastro(rastroArr);
		prod.setVeicProd(veicProd);
		prod.setcBarra("cBarra");
		prod.setcBarraTrib("cBarraTrib");
		prod.setcBenef("cBenef");
		prod.setcEAN("cEAN");
		prod.setcEANTrib("cEANTrib");
		prod.setcProd("cProd");
		prod.setnFCI("nFCI");
		prod.setnItemPed("nItemPed");
		prod.setnRECOPI("nRECOPI");
		prod.setqCom("qCom");
		prod.setqTrib("qTrib");
		prod.setuCom("uCom");
		prod.setuTrib("uTrib");
		prod.setvDesc("vDesc");
		prod.setvFrete("vFrete");
		prod.setvOutro("vOutro");
		prod.setvProd("vProd");
		prod.setvSeg("vSeg");
		prod.setvUnCom("vUnCom");
		prod.setvUnTrib("vUnTrib");
		prod.setxPed("xPed");
		prod.setxProd("xProd");

		return prod;
	}

	private List<NFeInfNFeDet> getDet() {
		List<NFeInfNFeDet> obj = new ArrayList<NFeInfNFeDet>();

		NFeInfNFeDetImposto imposto = new NFeInfNFeDetImposto();
		NFeInfNFeDetImpostoDevol impostoDevol = new NFeInfNFeDetImpostoDevol();
		NFeInfNFeDetObsItem obsItem = new NFeInfNFeDetObsItem();

		NFeInfNFeDetProd prod = this.getProd();

		NFeInfNFeDet det = new NFeInfNFeDet();
		det.setImposto(imposto);
		det.setImpostoDevol(impostoDevol);
		det.setInfAdProd("infAdProd");
		det.setObsItem(obsItem);
		det.setProd(prod);
		det.setnItem("1");
		obj.add(det);

		return obj;
	}

	private NFeInfNFeEmit getEmit() {
		NFeInfNFeEmitEnderEmit enderEmit = new NFeInfNFeEmitEnderEmit();
		enderEmit.setCEP("61000000");
		enderEmit.setFone("85999999999");
		enderEmit.setNro("1");
		enderEmit.setUF("CE");
		enderEmit.setcMun("2304400");
		enderEmit.setcPais("1083");
		enderEmit.setxBairro("CENTRO");
		enderEmit.setxCpl("SALA 2");
		enderEmit.setxLgr("RUA X");
		enderEmit.setxMun("FORTALEZA");
		enderEmit.setxPais("BRASIL");

		NFeInfNFeEmit obj = new NFeInfNFeEmit();
		obj.setCNAE("321");
		obj.setCNPJ("12123123000112");
		obj.setCPF("12312312312");
		obj.setCRT("3");
		obj.setEnderEmit(enderEmit);
		obj.setIE("123456788");
		obj.setIEST("1223456");
		obj.setIM("123456789");
		obj.setxFant("FANTASIA");
		obj.setxNome("FANTASIA");
		return obj;
	}

	private NFeInfNFeEntrega getEntrega() {
		NFeInfNFeEntrega obj = new NFeInfNFeEntrega();
		obj.setCEP("61000000");
		obj.setFone("85999999999");
		obj.setNro("1");
		obj.setUF("CE");
		obj.setcMun("2304400");
		obj.setcPais("1083");
		obj.setxBairro("CENTRO");
		obj.setxCpl("SALA 2");
		obj.setxLgr("RUA X");
		obj.setxMun("FORTALEZA");
		obj.setxPais("BRASIL");
		return obj;
	}

	private NFeInfNFeExporta getExporta() {
		return null;
	}

	private NFeInfNFeIde getIde() {
		return null;
	}

	private NFeInfNFeInfAdic getInfAdic() {
		return null;
	}

	private NFeInfNFeInfIntermed getInfIntermed() {
		return null;
	}

	private NFeInfNFeInfRespTec getInfRespTec() {
		return null;
	}

	private NFeInfNFePag getPag() {
		return null;
	}

	private NFeInfNFeRetirada getRetirada() {
		return null;
	}

	private NFeInfNFeTotal getTotal() {
		return null;
	}

	private NFeInfNFeTransp getTransp() {
		return null;
	}

	private String getXML() {

		return "<NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infNFe Id=\"NFe23211207002861000158550010000010901000023410\" versao=\"4.00\"><ide><cUF>23</cUF><cNF>00002341</cNF><natOp>devolucao de compra</natOp><mod>55</mod><serie>1</serie><nNF>1090</nNF><dhEmi>2021-12-09T10:16:14-03:00</dhEmi><dhSaiEnt>2021-12-09T10:16:14-03:00</dhSaiEnt><tpNF>1</tpNF><idDest>2</idDest><cMunFG>2304400</cMunFG><tpImp>1</tpImp><tpEmis>1</tpEmis><cDV>0</cDV><tpAmb>1</tpAmb><finNFe>4</finNFe><indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>000</verProc><NFref><refNFe>42190901722898000174550010000360881573202500</refNFe></NFref></ide><emit><CNPJ>07002861000158</CNPJ><xNome>AN AVIAM COM VAREJISTA LTDA</xNome><xFant>MUNDO DAS LINHAS LOJA 16</xFant><enderEmit><xLgr>RUA SENADOR ROBERT KENNEDY</xLgr><nro>412</nro><xBairro>BARRA DO CEARA</xBairro><cMun>2304400</cMun><xMun>FORTALEZA</xMun><UF>CE</UF><CEP>60332170</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>39237716</fone></enderEmit><IE>066970385</IE><CRT>1</CRT></emit><dest><CNPJ>01722898000174</CNPJ><xNome>PLASMOTECNICA COMERCIAL LTDA</xNome><enderDest><xLgr>BECO GOIAS</xLgr><nro>411</nro><xCpl>BLOCO B SALA A</xCpl><xBairro>PADRE MARTINHO STEIN</xBairro><cMun>4218202</cMun><xMun>TIMBO</xMun><UF>SC</UF><CEP>89120000</CEP><cPais>1058</cPais><xPais>BRASIL</xPais></enderDest><indIEDest>1</indIEDest><IE>253430500</IE></dest><det nItem=\"1\"><prod><cProd>331069</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 1926 034</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>8.6900</vUnCom><vProd>8.69</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>8.6900</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>8.69</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.61</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>8.71</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>8.69</vBC><pPIS>1.65</pPIS><vPIS>0.14</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>8.69</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>0.66</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"2\"><prod><cProd>331039</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 1904 141</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>7.0100</vUnCom><vProd>7.01</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>7.0100</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>7.01</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.49</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>7.00</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>7.01</vBC><pPIS>1.65</pPIS><vPIS>0.12</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>7.01</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>0.53</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"3\"><prod><cProd>331044</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 1947 141</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>6.3400</vUnCom><vProd>6.34</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>6.3400</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>6.34</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.44</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>6.29</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>6.34</vBC><pPIS>1.65</pPIS><vPIS>0.10</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>6.34</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>0.48</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"4\"><prod><cProd>335814</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 1986</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>7.3500</vUnCom><vProd>7.35</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>7.3500</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>7.35</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.51</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>7.29</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>7.35</vBC><pPIS>1.65</pPIS><vPIS>0.12</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>7.35</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>0.56</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"5\"><prod><cProd>335817</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 1914</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>2.0000</qCom><vUnCom>6.6500</vUnCom><vProd>13.30</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>2.0000</qTrib><vUnTrib>6.6500</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>13.30</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.93</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>13.29</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>13.30</vBC><pPIS>1.65</pPIS><vPIS>0.22</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>13.30</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>1.01</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"6\"><prod><cProd>331038</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 1952 141</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>6.3400</vUnCom><vProd>6.34</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>6.3400</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>6.34</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.44</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>6.29</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>6.34</vBC><pPIS>1.65</pPIS><vPIS>0.10</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>6.34</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>0.48</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"7\"><prod><cProd>335813</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 1988</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>6.6500</vUnCom><vProd>6.65</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>6.6500</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>6.65</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.47</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>6.71</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>6.65</vBC><pPIS>1.65</pPIS><vPIS>0.11</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>6.65</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>0.51</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"8\"><prod><cProd>340952</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 198000 021</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>2.0000</qCom><vUnCom>7.0900</vUnCom><vProd>14.18</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>2.0000</qTrib><vUnTrib>7.0900</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>14.18</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.99</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>14.14</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>14.18</vBC><pPIS>1.65</pPIS><vPIS>0.23</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>14.18</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>1.08</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"9\"><prod><cProd>335814</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 1986</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>7.3500</vUnCom><vProd>7.35</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>7.3500</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>7.35</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.51</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>7.29</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>7.35</vBC><pPIS>1.65</pPIS><vPIS>0.12</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>7.35</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>0.56</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"10\"><prod><cProd>340953</cProd><cEAN/><xProd>RELOGIO PLASMOTECNICA PAREDE 197700 034</xProd><NCM>91022900</NCM><CFOP>6202</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>7.0900</vUnCom><vProd>7.09</vProd><cEANTrib/><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>7.0900</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS90><orig>0</orig><CST>90</CST><modBC>0</modBC><vBC>7.09</vBC><pRedBC>0.00</pRedBC><pICMS>7.00</pICMS><vICMS>0.50</vICMS><modBCST>5</modBCST><pMVAST>0.00</pMVAST><vBCST>7.14</vBCST><pICMSST>0.00</pICMSST><vICMSST>0.00</vICMSST></ICMS90></ICMS><IPI><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>49</CST><vBC>7.09</vBC><pPIS>1.65</pPIS><vPIS>0.12</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>49</CST><vBC>7.09</vBC><pCOFINS>7.60</pCOFINS><vCOFINS>0.54</vCOFINS></COFINSOutr></COFINS></imposto></det><total><ICMSTot><vBC>84.30</vBC><vICMS>5.89</vICMS><vICMSDeson>0.00</vICMSDeson><vFCPUFDest>0.00</vFCPUFDest><vICMSUFDest>0.00</vICMSUFDest><vICMSUFRemet>0.00</vICMSUFRemet><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>84.30</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>1.38</vPIS><vCOFINS>6.41</vCOFINS><vOutro>0.00</vOutro><vNF>84.30</vNF></ICMSTot></total><transp><modFrete>1</modFrete><vol><qVol>1</qVol><esp>VOLUME</esp></vol></transp><pag><detPag><tPag>90</tPag><vPag>0.00</vPag></detPag></pag><infAdic><infCpl>INFORMACOES COMPLEMENTARES RESERVADO AO FISCO|DEVOLUCAO PACIAL DA NFE 21748/2015/10/08 CHAVE 42151001722898000174550010000217481403747 NFE 27977 2017/04-20 CHAVE 42170401722898000174550010000279771527481781 NFE 36088 23/09/2019 CHAVE.|4219 0901 7228 9800 0174 5500 1000 0360 8815 7320 2500 DESTAQUE ICMS P|ARA FINS DE CREDITO DO DESTINATARIO.MOTIVO DA DEVOLUCAO PECAS AVARIAS.</infCpl></infAdic></infNFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe23211207002861000158550010000010901000023410\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>b7Ql5mcMNpKDZziULX2+8dM+MIw=</DigestValue></Reference></SignedInfo><SignatureValue>I2lTUiif080XWU79DPgy7OO8Vzzmr3k9pDzQ5utbo+nh9grm+9VYNx1huIJfxtvxB9dNZjJYsqwFA4oH74yZvNfntAMRo/omwqgVeeVzZ39BQtMjO4jzCI4JHSv4tHcyIxcFmTII1XairtPMC9hxk6ij8IPDjC5XYIgBzl+PdKEkQXgd90ddjjYETH9JrdcfxUB+B/XTUnZLY05FZmRdEYudHxjLij6HJPvYQKIm91UgRpsqyOwvd3+CAPAGrPQLSoIS1gzGlBjMl1rv07TJZ4loS4Wgu0f/bRDOJgsqEnlTIVvfjRxMOqL7dFp6Ditnt257kqTcr9LiSzWvUHWIcg==</SignatureValue><KeyInfo><X509Data><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></NFe>";

	}
}
