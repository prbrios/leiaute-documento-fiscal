package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@JsonRootName("nfe")
@Data
@Root(name = "NFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFe {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infnfe")
    @Element(name = "infNFe", required = false)
    private NFeInfNFe infNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infnfesupl")
    @Element(name = "infNFeSupl", required = false)
    private NFeInfNFeSupl infNFeSupl;

    @JsonIgnore
    @Element(name = "Signature", required = false)
    private Signature signature;

    public NFe() {}

    public NFe(NFeInfNFe infNFe, NFeInfNFeSupl infNFeSupl, Signature signature) {
        this.infNFe = infNFe;
        this.infNFeSupl = infNFeSupl;
        this.signature = signature;
    }

    //TODO remover isso
    public static void main(String[] args) throws Exception {

        NFePersister persister = new NFePersister();
        NFe nfe0 = persister.read("<NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infNFe Id=\"NFe23200407272825000104550010000240231000240241\" versao=\"4.00\"><ide><cUF>23</cUF><cNF>00024024</cNF><natOp>Transferencia de mercadoria ad</natOp><mod>55</mod><serie>1</serie><nNF>24023</nNF><dhEmi>2020-04-09T12:48:02-03:00</dhEmi><dhSaiEnt>2020-04-09T12:48:02-03:00</dhSaiEnt><tpNF>1</tpNF><idDest>1</idDest><cMunFG>2304400</cMunFG><tpImp>1</tpImp><tpEmis>1</tpEmis><cDV>1</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe><indFinal>0</indFinal><indPres>9</indPres><procEmi>0</procEmi><verProc>4.00</verProc></ide><emit><CNPJ>07272825000104</CNPJ><xNome>TECNO INDUSTRIA E COMERCIO DE COMPUTADORES LTDA</xNome><xFant>FABRICA - MATRIZ</xFant><enderEmit><xLgr>RUA MANUEL ARRUDA</xLgr><nro>80</nro><xBairro>BARROSO</xBairro><cMun>2304400</cMun><xMun>FORTALEZA</xMun><UF>CE</UF><CEP>60842090</CEP><cPais>1058</cPais><xPais>BRASIL</xPais></enderEmit><IE>061789704</IE><CRT>3</CRT></emit><dest><CNPJ>07272825000457</CNPJ><xNome>TECNO INDUSTRIA E COMERCIO DE COMPUTADORES LTDA</xNome><enderDest><xLgr>RUA CLEIA</xLgr><nro>440</nro><xBairro>BARROSO</xBairro><cMun>2304400</cMun><xMun>FORTALEZA</xMun><UF>CE</UF><CEP>60863280</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>8535354444</fone></enderDest><indIEDest>1</indIEDest><IE>063589397</IE><email>polibio.lima@ibyte.com.br</email></dest><det nItem=\"1\"><prod><cProd>36987</cProd><cEAN>4719331802882</cEAN><xProd>PLACA S1151 GAMER B360M DDR4 GIGABYTE</xProd><NCM>84733041</NCM><CEST>2103500</CEST><CFOP>5152</CFOP><uCom>UND</uCom><qCom>1.00</qCom><vUnCom>337.74</vUnCom><vProd>337.74</vProd><cEANTrib>4719331802882</cEANTrib><uTrib>UND</uTrib><qTrib>1.00</qTrib><vUnTrib>337.74</vUnTrib><indTot>1</indTot></prod><imposto><ICMS><ICMS20><orig>4</orig><CST>20</CST><modBC>3</modBC><pRedBC>61.11</pRedBC><vBC>131.35</vBC><pICMS>18.00</pICMS><vICMS>23.64</vICMS></ICMS20></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>53</CST></IPINT></IPI><PIS><PISNT><CST>08</CST></PISNT></PIS><COFINS><COFINSNT><CST>08</CST></COFINSNT></COFINS></imposto></det><total><ICMSTot><vBC>131.35</vBC><vICMS>23.64</vICMS><vICMSDeson>0.00</vICMSDeson><vFCPUFDest>0.00</vFCPUFDest><vICMSUFDest>0.00</vICMSUFDest><vICMSUFRemet>0.00</vICMSUFRemet><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>337.74</vProd><vFrete>0.00</vFrete><vSeg>0</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>337.74</vNF></ICMSTot></total><transp><modFrete>0</modFrete><vol><qVol>001</qVol><esp>VOL</esp><pesoL>0.865</pesoL><pesoB>0.865</pesoB></vol></transp><pag><detPag><tPag>01</tPag><vPag>337.74</vPag></detPag></pag><infAdic><infCpl>Val Aprx dos Trib. Fed. R$     0.00( 0.00%), Trib. Est. R$     0.00( 0.00%), Trib. Muni. R$     0.00( 0.00%) Fonte: IBPT Ref: NTS F00/022882 - CONFIRA A SUA MERCADORIA NO ATO DO RECEBIMENTO, POIS NAO NOS RESPONSABILIZAMOS POR RECLAMACOES APOS A ASSINATURA DO CANHOTO OU DO CONHECIMENTO DE FRETE</infCpl></infAdic></infNFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe23200407272825000104550010000240231000240241\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>cix1pYO7/NcEeyJa9/h4FP0gGCU=</DigestValue></Reference></SignedInfo><SignatureValue>NbOzPEwq6FU4FYNCLgTeD4WoP0MqiXa0HVzdNSXI3boWym0ygLsLtidD3GBwrlruwtUryB1PbTfLR3sCLTOppcQmmTSOyJPKhMfXMdZ3b65ZT1F3n86jMFLnT92M3WiQXqJhphKRo4rMrXbd6pb3EaQGVVecVatUzl7iisa8WUGoUF9n2DXzYDjJ2y/5Ehddd9GEArHMrc2akf7o6H5JTVkjInjPg4egAgZKQlY/8EQXYWIclF5Hq5ymFX/ySeAz9AJCzmwLWtj5WJjADi5/+qg2gWd/d1iAm64PJqT3dmznFHIzFCTOj9CXro5TD3/pz9BAbWlbRJDeAnwaLKIfpQ==</SignatureValue><KeyInfo><X509Data><X509Certificate>MIIH4jCCBcqgAwIBAgIIcx4ZBSEoBQAwDQYJKoZIhvcNAQELBQAwgYkxCzAJBgNVBAYTAkJSMRMwEQYDVQQKEwpJQ1AtQnJhc2lsMTQwMgYDVQQLEytBdXRvcmlkYWRlIENlcnRpZmljYWRvcmEgUmFpeiBCcmFzaWxlaXJhIHYyMRIwEAYDVQQLEwlBQyBTT0xVVEkxGzAZBgNVBAMTEkFDIFNPTFVUSSBNdWx0aXBsYTAeFw0xOTA1MjIxODAwMTBaFw0yMDA1MjExODAwMTBaMIIBBzELMAkGA1UEBhMCQlIxEzARBgNVBAoTCklDUC1CcmFzaWwxNDAyBgNVBAsTK0F1dG9yaWRhZGUgQ2VydGlmaWNhZG9yYSBSYWl6IEJyYXNpbGVpcmEgdjIxEjAQBgNVBAsTCUFDIFNPTFVUSTEbMBkGA1UECxMSQUMgU09MVVRJIE11bHRpcGxhMRcwFQYDVQQLEw4yMDkzNzEzMDAwMDE2MjEaMBgGA1UECxMRQ2VydGlmaWNhZG8gUEogQTExRzBFBgNVBAMTPlRFQ05PIElORFVTVFJJQSBFIENPTUVSQ0lPIERFIENPTVBVVEFET1JFUyBMVERBOjA3MjcyODI1MDAwMTA0MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxthadI0eV+hyyeS15bZ4C7aelW2cbnvm+QK1XdpKbjnG170wyEeUX9ZDvfTVICSy31k6YVXKCv+foz4i1ezMmFaz5G/+mMYwTbLx4g4icJHNcBIVNKQdWm+RZ2YD4EjrY4cQxatiRQGYPMCkoX3UrT/LNcFCV6/NxxApm28BvSSyhhJJGA94fF3IzPYchNCIeKihkd8oGWUeQdC75pFM5i8ZjZ05585tYDBEBSWxYYCH5GOT3DPc3WUYSu2lmj9oFOULgJeZcqNCdTYrwPY8UAIcQHO8hnDfcKya05sSUM2m248RrLEi2Pkjw4/mvrQuMECnWsNGfRnk+eNqtPwZwQIDAQABo4ICyzCCAscwVAYIKwYBBQUHAQEESDBGMEQGCCsGAQUFBzAChjhodHRwOi8vY2NkLmFjc29sdXRpLmNvbS5ici9sY3IvYWMtc29sdXRpLW11bHRpcGxhLXYxLnA3YjAdBgNVHQ4EFgQUbHpQUcH7RjbATePuuJDYsrop72EwCQYDVR0TBAIwADAfBgNVHSMEGDAWgBQ1rjEU9l7Sek9Y/jSoGmeXCsSbBzBeBgNVHSAEVzBVMFMGBmBMAQIBJjBJMEcGCCsGAQUFBwIBFjtodHRwczovL2NjZC5hY3NvbHV0aS5jb20uYnIvZG9jcy9kcGMtYWMtc29sdXRpLW11bHRpcGxhLnBkZjCB3gYDVR0fBIHWMIHTMD6gPKA6hjhodHRwOi8vY2NkLmFjc29sdXRpLmNvbS5ici9sY3IvYWMtc29sdXRpLW11bHRpcGxhLXYxLmNybDA/oD2gO4Y5aHR0cDovL2NjZDIuYWNzb2x1dGkuY29tLmJyL2xjci9hYy1zb2x1dGktbXVsdGlwbGEtdjEuY3JsMFCgTqBMhkpodHRwOi8vcmVwb3NpdG9yaW8uaWNwYnJhc2lsLmdvdi5ici9sY3IvQUNTT0xVVEkvYWMtc29sdXRpLW11bHRpcGxhLXYxLmNybDAOBgNVHQ8BAf8EBAMCBeAwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMEMIGzBgNVHREEgaswgaiBFXRob2xhbmRhQGlieXRlLmNvbS5icqAhBgVgTAEDAqAYExZQRURSTyBJVk8gTUVOREVTIEZST1RBoBkGBWBMAQMDoBATDjA3MjcyODI1MDAwMTA0oDgGBWBMAQMEoC8TLTIzMDUxOTc2NzAzOTY4OTIzNTMwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMKAXBgVgTAEDB6AOEwwwMDAwMDAwMDAwMDAwDQYJKoZIhvcNAQELBQADggIBAG51EvJK+HVRCspZ6zy73V+vZcwza/kQkNewWoETv5Fl9CYQGfSw7KLohAJofIX0Y6vutKIHy0pZQqsf9nwhq434je7KPi5QWAYEKnJe4r1+kNyN/05TnFq1Qm3Ic+sYEsPYeMXBt/BRdiNcxY6rRH/U7jiJ+Yk86K1DjyqjiTUT+/8/dlWSrfh6ZmdnfaMyS+9/KmbuMjYMqGTfMdioeDm3IAEiO9d3qjLUvd52hCCLdWSUyyQMB8Hn3aoo2s0TnvAOiRWhSYMAImtdZTVXAvQHHa9RarP1YfDuZqnToB+Cq6yMp2B8PwlaT09AZjwh5AN+q3k4bbW+srWuBt9GfY5bL8ib/hYY+Mwb4qSU1SDCYTn7wlenhTYs31quBo055qvThaJ7G8JaXnwDkZCO8Qc8VfPoZTrRWH4hxhntHGMO8M2ongsj558B6WuPWvQmulYz5kK2rxHfTazk29efTfOYOJSYMM0EXZbBXlkZ/1NpwSu9bLt3bIdeKhc0c1xd24RGvyOOjJZw+BnJNe3/i9ApGxkrVY3HvmqPZrALB/GUEeKnV4z61LZVyMUpaQD22zOKAN7kwZe8/zbcRVxhEDxyLh9vYcJFkUTSAp0qX1okvfIxpEmmJl4X8zUGCFTq1E9j0kZ50fYpgbxFb/uR5pR7WjUiBVm5c7DBju2XhVSh</X509Certificate></X509Data></KeyInfo></Signature></NFe>");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(nfe0);

        NFe nfe = mapper.readValue(json, NFe.class);
        System.out.println("cUF: " + nfe.getInfNFe().getIde().getCUF());

    }
}