package com.github.prbrios.documentofiscal.nfe.v400;

import com.github.prbrios.documentofiscal.DFPersister;
import com.github.prbrios.documentofiscal.nfe.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NFeProcTest {

    @Test
    public void teste() {

        //String xml = "<nfeProc versao=\"versao\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><NFe><infNFe Id=\"Id\" versao=\"versao\"><ide><cUF>cUF</cUF><cNF>cNF</cNF><natOp>natOp</natOp><mod>mod</mod><serie>serie</serie><nNF>nNF</nNF><dhEmi>dhEmi</dhEmi><tpNF>tpNF</tpNF><idDest>idDest</idDest><cMunFG>cMunFG</cMunFG><tpImp>tpImp</tpImp><tpEmis>tpEmis</tpEmis><cDV>cDV</cDV><tpAmb>tpAmb</tpAmb><finNFe>finNFe</finNFe><indFinal>indFinal</indFinal><indPres>indPres</indPres><procEmi>procEmi</procEmi><verProc>verProc</verProc><dhCont>dhCont</dhCont><xJust>xJust</xJust></ide><emit><CNPJ>CNPJ</CNPJ><xNome>xNome</xNome><xFant>xFant</xFant><enderEmit><xLgr>xLgr</xLgr><nro>nro</nro><xCpl>xCpl</xCpl><xBairro>xBairro</xBairro><cMun>cMun</cMun><xMun>xMun</xMun><UF>UF</UF><CEP>CEP</CEP><cPais>cPais</cPais><xPais>xPais</xPais><fone>fone</fone></enderEmit><IE>IE</IE><CRT>CRT</CRT></emit><det nItem=\"nItem\"><prod><cProd>cProd</cProd><cEAN>cEAN</cEAN><xProd>xProd</xProd><NCM>NCM</NCM><CEST>CEST</CEST><CFOP>CFOP</CFOP><uCom>uCom</uCom><qCom>qCom</qCom><vUnCom>vUnCom</vUnCom><vProd>vProd</vProd><cEANTrib>cEANTrib</cEANTrib><uTrib>uTrib</uTrib><qTrib>qTrib</qTrib><vUnTrib>vUnTrib</vUnTrib><indTot>indTot</indTot></prod><imposto><vTotTrib>vTotTrib</vTotTrib><ICMS><ICMS00><orig>orig</orig><CST>CST</CST><modBC>modBC</modBC><vBC>vBC</vBC><pICMS>pICMS</pICMS><vICMS>vICMS</vICMS></ICMS00></ICMS></imposto></det><det nItem=\"nItem\"><prod><cProd>cProd</cProd><cEAN>cEAN</cEAN><xProd>xProd</xProd><NCM>NCM</NCM><CEST>CEST</CEST><CFOP>CFOP</CFOP><uCom>uCom</uCom><qCom>qCom</qCom><vUnCom>vUnCom</vUnCom><vProd>vProd</vProd><cEANTrib>cEANTrib</cEANTrib><uTrib>uTrib</uTrib><qTrib>qTrib</qTrib><vUnTrib>vUnTrib</vUnTrib><indTot>indTot</indTot></prod><imposto><vTotTrib>vTotTrib</vTotTrib><ICMS><ICMS00><orig>orig</orig><CST>CST</CST><modBC>modBC</modBC><vBC>vBC</vBC><pICMS>pICMS</pICMS><vICMS>vICMS</vICMS></ICMS00></ICMS></imposto></det><total><ICMSTot><vBC>vBC</vBC><vICMS>vICMS</vICMS><vICMSDeson>vICMSDeson</vICMSDeson><vFCP>vFCP</vFCP><vBCST>vBCST</vBCST><vST>vST</vST><vFCPST>vFCPST</vFCPST><vFCPSTRet>vFCPSTRet</vFCPSTRet><vProd>vProd</vProd><vFrete>vFrete</vFrete><vSeg>vSeg</vSeg><vDesc>vDesc</vDesc><vII>vII</vII><vIPI>vIPI</vIPI><vIPIDevol>vIPIDevol</vIPIDevol><vPIS>vPIS</vPIS><vCOFINS>vCOFINS</vCOFINS><vOutro>vOutro</vOutro><vNF>vNF</vNF><vTotTrib>vTotTrib</vTotTrib></ICMSTot></total><transp><modFrete>modFrete</modFrete></transp><pag><detPag><tPag>tPag</tPag><vPag>vPag</vPag></detPag></pag><infAdic><infCpl>infCpl</infCpl></infAdic><infRespTec><CNPJ>CNPJ</CNPJ><xContato>xContato</xContato><email>email</email><fone>fone</fone></infRespTec></infNFe><infNFeSupl><qrCode>qrCode</qrCode><urlChave>urlChave</urlChave></infNFeSupl><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe52190830147903000160650010000023879863066927\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>DigestValue</DigestValue></Reference></SignedInfo><SignatureValue>SignatureValue</SignatureValue><KeyInfo><X509Data><X509Certificate>X509Certificate</X509Certificate></X509Data></KeyInfo></Signature></NFe><protNFe versao=\"versao\"><infProt><tpAmb>tpAmb</tpAmb><verAplic>verAplic</verAplic><chNFe>chNFe</chNFe><dhRecbto>dhRecbto</dhRecbto><nProt>nProt</nProt><digVal>digVal</digVal><cStat>cStat</cStat><xMotivo>xMotivo</xMotivo></infProt></protNFe></nfeProc>";

        DFPersister dfp = new DFPersister<NFe>(){};
        NFe obj = (NFe) dfp.read(new File("c:\\users\\prbri\\Desktop\\nfe.xml"));

        Assert.assertEquals(obj.getInfNFe().getId(), "Id");
        Assert.assertEquals(obj.getInfNFe().getIde().getCDV(), "cDV");
        Assert.assertEquals(obj.getInfNFe().getIde().getCMunFG(), "cMunFG");
        Assert.assertEquals(obj.getInfNFe().getIde().getCNF(), "cNF");
        Assert.assertEquals(obj.getInfNFe().getIde().getCUF(), "cUF");
        Assert.assertEquals(obj.getInfNFe().getIde().getDhCont(), "dhCont");
        Assert.assertEquals(obj.getInfNFe().getIde().getDhEmi(), "dhEmi");
        Assert.assertEquals(obj.getInfNFe().getIde().getFinNFe(), "finNFe");
        Assert.assertEquals(obj.getInfNFe().getIde().getIdDest(), "idDest");
        Assert.assertEquals(obj.getInfNFe().getIde().getIndFinal(), "indFinal");
        Assert.assertEquals(obj.getInfNFe().getIde().getIndPres(), "indPres");
        Assert.assertEquals(obj.getInfNFe().getIde().getMod(), "mod");
        Assert.assertEquals(obj.getInfNFe().getIde().getNatOp(), "natOp");
        Assert.assertEquals(obj.getInfNFe().getIde().getNNF(), "nNF");
        Assert.assertEquals("", "");
        //TODO: continuar o teste do XML

    }

    @Test
    public void convertObjetoToXmlTest() {

        /** det **/

        List<NFeInfNFeDet> det = new ArrayList<>();

        /*

        List<NFeInfNFeDetProdDI> DI = new ArrayList<>();

        List<NFeInfNFeDetProdDIAdi> adi = new ArrayList<>();
        <nAdicao>nAdicao1</nAdicao>
        <nSeqAdic>nSeqAdic1</nSeqAdic>
        <cFabricante>cFabricante1</cFabricante>
        <vDescDI>vDescDI1</vDescDI>
        <nDraw>nDraw1</nDraw>

        NFeInfNFeDetProdDI oDI;
        oDI = new NFeInfNFeDetProdDI();
        oDI.setNDI("nDI1");
        oDI.setDDI("dDI1");
        oDI.setXLocDesemb("xLocDesemb1");
        oDI.setUFDesemb("AC");
        oDI.setDDesemb("dDesemb1");
        oDI.setTpViaTransp("1");
        oDI.setVAFRMM("vAFRMM1");
        oDI.setTpIntermedio("1");
        oDI.setCNPJ("CNPJ1");
        oDI.setUFTerceiro("AC");
        oDI.setCExportador("cExportador1");
        oDI.setAdi(adi);


        DI.add(oDI);

        List<String> nve = new ArrayList<>();
        nve.add("NVE1");
        nve.add("NVE2");
        nve.add("NVE3");

        NFeInfNFeDetProd prod = new NFeInfNFeDetProd();
        prod.setCProd("cProd1");
        prod.setCEAN("cEAN1");
        prod.setXProd("xProd1");
        prod.setNCM("NCM1");
        prod.setNVE(nve);
        prod.setCEST("CEST1");
        prod.setIndEscala("S");
        prod.setCNPJFab("CNPJFab1");
        prod.setCBenef("cBenef1");
        prod.setEXTIPI("EXTIPI1");
        prod.setCFOP("CFOP1");
        prod.setUCom("uCom1");
        prod.setQCom("qCom1");
        prod.setVUnCom("vUnCom1");
        prod.setVProd("vProd1");
        prod.setCEANTrib("cEANTrib1");
        prod.setUTrib("uTrib1");
        prod.setQTrib("qTrib1");
        prod.setVUnTrib("vUnTrib1");
        prod.setVFrete("vFrete1");
        prod.setVSeg("vSeg1");
        prod.setVDesc("vDesc1");
        prod.setVOutro("vOutro1");
        prod.setIndTot("0");
        prod.setDI(DI);
        prod.setDetExport(detExport);
        prod.setXPed("");
        prod.setNItemPed("");
        prod.setNFCI("");
        prod.setRastro(rastro);
        prod.setVeicProd(veicProd);

        NFeInfNFeDet oDet = new NFeInfNFeDet();
        oDet.setNItem("nItem1");
        oDet.setProd(prod);
        oDet.setImposto(imposto);
        oDet.setImpostoDevol(impostoDevol);
        oDet.setInfAdProd("infAdProd1");

        det.add(oDet);
        */


        List<NFeInfNFeAutXML> autXML = new ArrayList<>();
        autXML.add(new NFeInfNFeAutXML("CNPJ1", null));
        autXML.add(new NFeInfNFeAutXML("CNPJ2", null));
        autXML.add(new NFeInfNFeAutXML("CNPJ3", null));

        NFeInfNFeEntrega entrega = new NFeInfNFeEntrega("CNPJ1", null,"xNome1", "xLgr1", "nro1", "xCpl1", "xBairro1", "cMun1", "xMun1", "AC", "CEP1", "cPais1", "xPais1", "fone1", "email1", "IE1");
        NFeInfNFeRetirada retirada = new NFeInfNFeRetirada("CNPJ1", null, "xNome1", "xLgr1", "nro1", "xCpl1", "xBairro1", "cMun1", "xMun1", "AC", "CEP1", "cPais1", "xPais1", "fone1", "email1", "IE1");
        NFeInfNFeDestEnderDest enderDest = new NFeInfNFeDestEnderDest("xLgr1","nro1","xCpl1","xBairro1","cMun1","xMun1","AC","CEP1","cPais1","xPais1","fone1");
        NFeInfNFeDest dest = new NFeInfNFeDest("CNPJ1", null, null, "xNome1", enderDest,"1", "IE1", "ISUF1", "IM1", "email1");
        NFeInfNFeAvulsa avulsa = new NFeInfNFeAvulsa("CNPJ1", "xOrgao1", "matr1", "xAgente1", "fone1", "AC", "nDAR1", "dEmi1", "vDAR1", "repEmi1", "dPag1");
        NFeInfNFeEmitEnderEmit enderEmit = new NFeInfNFeEmitEnderEmit("xLgr1", "nro1", "xCpl1", "xBairro1", "cMun1", "xMun1", "AC", "CEP1", "1058", "Brasil", "fone1");
        NFeInfNFeEmit emit = new NFeInfNFeEmit("CNPJ1", null, "xNome1", "xFant1", enderEmit, "IE1", "IEST1", "IM1", "CNAE1", "1");

        List<NFeInfNFeIdeNFref> nfRef = new ArrayList<>();
        nfRef.add(new NFeInfNFeIdeNFref("refNFe1", null, null, null, null));
        nfRef.add(new NFeInfNFeIdeNFref("refNFe2", null, null, null, null));
        nfRef.add(new NFeInfNFeIdeNFref("refNFe3", null, null, null, null));

        NFeInfNFeIde ide = new NFeInfNFeIde("11", "cNF1", "natOp1", "55", "serie1", "nNF1", "dhEmi1", "dhSaiEnt1", "0", "1", "cMunFG1", "0","1", "cDV1", "1", "1", "0", "0", "0", "verProc1", "dhCont1", "xJust_________1", nfRef);

        NFeInfNFe infNFe = new NFeInfNFe();
        infNFe.setVersao("versao1");
        infNFe.setId("ID1");
        infNFe.setIde(ide);
        infNFe.setEmit(emit);
        infNFe.setAvulsa(avulsa);
        infNFe.setDest(dest);
        infNFe.setRetirada(retirada);
        infNFe.setEntrega(entrega);
        infNFe.setAutXML(autXML);
        infNFe.setDet(det);
        /*infNFe.setTotal(total);
        infNFe.setTransp(transp);
        infNFe.setCobr(cobr);
        infNFe.setPag(pag);
        infNFe.setInfAdic(infAdic);
        infNFe.setExporta(exporta);
        infNFe.setCompra(compra);
        infNFe.setCana(cana);
        infNFe.setInfRespTec(infRespTec);*/

        NFe nfe = new NFe();
        nfe.setInfNFe(infNFe);

        DFPersister dfp = new DFPersister<NFe>(){};
        String xml = dfp.write(nfe);

        System.out.println(xml);
    }

}
