package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v3;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;

import org.junit.Test;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

public class EnviarLoteRpsEnvioTest {
    
    private final String xml = "<EnviarLoteRpsEnvio xmlns=\"http://www.ginfes.com.br/servico_enviar_lote_rps_envio_v03.xsd\"><LoteRps Id=\"L30000001\"><NumeroLote xmlns=\"http://www.ginfes.com.br/tipos_v03.xsd\">30000001</NumeroLote><Cnpj xmlns=\"http://www.ginfes.com.br/tipos_v03.xsd\">07272825000457</Cnpj><InscricaoMunicipal xmlns=\"http://www.ginfes.com.br/tipos_v03.xsd\">233691</InscricaoMunicipal><QuantidadeRps xmlns=\"http://www.ginfes.com.br/tipos_v03.xsd\">1</QuantidadeRps><ListaRps xmlns=\"http://www.ginfes.com.br/tipos_v03.xsd\"><Rps><InfRps Id=\"30000001_1F03_1\"><IdentificacaoRps><Numero>30000001</Numero><Serie>1F03</Serie><Tipo>1</Tipo></IdentificacaoRps><DataEmissao>2021-03-22T15:39:58</DataEmissao><NaturezaOperacao>1</NaturezaOperacao><OptanteSimplesNacional>2</OptanteSimplesNacional><IncentivadorCultural>2</IncentivadorCultural><Status>1</Status><Servico><Valores><ValorServicos>100.00</ValorServicos><ValorDeducoes>0.00</ValorDeducoes><ValorPis>0.00</ValorPis><ValorCofins>0.00</ValorCofins><ValorInss>0.00</ValorInss><ValorIr>0.00</ValorIr><ValorCsll>0.00</ValorCsll><IssRetido>1</IssRetido><ValorIss>5.00</ValorIss><ValorIssRetido>5.00</ValorIssRetido><OutrasRetencoes>0.00</OutrasRetencoes><BaseCalculo>100.00</BaseCalculo><Aliquota>0.05</Aliquota><ValorLiquidoNfse>95.00</ValorLiquidoNfse><DescontoCondicionado>0.00</DescontoCondicionado></Valores><ItemListaServico>1401</ItemListaServico><CodigoTributacaoMunicipio>951180001</CodigoTributacaoMunicipio><Discriminacao>CODIGO: 07681, DESCRICAO: SERVICO-INSTALACAO DE REDE WIRELESS, QUANTIDADE: 1, VALOR UNITARIO: 100.00, DESCONTO: 0.00, VALOR TOTAL: 100.00;</Discriminacao><CodigoMunicipio>2304400</CodigoMunicipio></Servico><Prestador><Cnpj>07272825000457</Cnpj><InscricaoMunicipal>233691</InscricaoMunicipal></Prestador><Tomador><IdentificacaoTomador><CpfCnpj><Cnpj>09182308000170</Cnpj></CpfCnpj></IdentificacaoTomador><RazaoSocial>BLU COMERCIO E SERVICOS HIDRAULICOS LTDA - ME</RazaoSocial><Endereco><Endereco>RUA VICENTE LINHARES</Endereco><Numero>1</Numero><Complemento>LOJA 05</Complemento><Bairro>ALDEOTA</Bairro><CodigoMunicipio>2304400</CodigoMunicipio><Uf>CE</Uf><Cep>60135270</Cep></Endereco><Contato><Email>financeiro@sistemablu.com.br</Email></Contato></Tomador></InfRps></Rps></ListaRps></LoteRps></EnviarLoteRpsEnvio>";

    @Test
    public void teste() throws Exception{

        IdentificacaoRps identificacaoRps = new IdentificacaoRps();
        identificacaoRps.setNumero("30000001");
        identificacaoRps.setSerie("1F03");
        identificacaoRps.setTipo("1");

        Valores valores = new Valores();
        valores.setValorServicos("100.00");
        valores.setValorDeducoes("0.00");
        valores.setValorPis("0.00");
        valores.setValorCofins("0.00");
        valores.setValorInss("0.00");
        valores.setValorIr("0.00");
        valores.setValorCsll("0.00");
        valores.setIssRetido("1");
        valores.setValorIss("5.00");
        valores.setValorIssRetido("5.00");
        valores.setOutrasRetencoes("0.00");
        valores.setBaseCalculo("100.00");
        valores.setAliquota("0.05");
        valores.setValorLiquidoNfse("95.00");
        valores.setDescontoCondicionado("0.00");

        DadosServico servico = new DadosServico();
        servico.setValores(valores);
        servico.setItemListaServico("1401");
        servico.setCodigoTributacaoMunicipio("951180001");
        servico.setDiscriminacao("CODIGO: 07681, DESCRICAO: SERVICO-INSTALACAO DE REDE WIRELESS, QUANTIDADE: 1, VALOR UNITARIO: 100.00, DESCONTO: 0.00, VALOR TOTAL: 100.00;");
        servico.setCodigoMunicipio("2304400");

        IdentificacaoPrestador prestador = new IdentificacaoPrestador();
        prestador.setCnpj("07272825000457");
        prestador.setInscricaoMunicipal("233691");
        
        CpfCnpj cpfCnpjTomador = new CpfCnpj();
        cpfCnpjTomador.setCnpj("09182308000170");

        IdentificacaoTomador identificacaoTomador = new IdentificacaoTomador();
        identificacaoTomador.setCpfCnpj(cpfCnpjTomador);

        Contato contatoTomador = new Contato();
        contatoTomador.setEmail("financeiro@sistemablu.com.br");

        Endereco enderecoTomador = new Endereco();
        enderecoTomador.setEndereco("RUA VICENTE LINHARES");
        enderecoTomador.setNumero("1");
        enderecoTomador.setComplemento("LOJA 05");
        enderecoTomador.setBairro("ALDEOTA");
        enderecoTomador.setCodigoMunicipio("2304400");
        enderecoTomador.setUf("CE");
        enderecoTomador.setCep("60135270");

        DadosTomador tomador = new DadosTomador();
        tomador.setContato(contatoTomador);
        tomador.setEndereco(enderecoTomador);
        tomador.setIdentificacaoTomador(identificacaoTomador);
        tomador.setRazaoSocial("BLU COMERCIO E SERVICOS HIDRAULICOS LTDA - ME");

        InfRps infRps = new InfRps();
        infRps.setId("30000001_1F03_1");
        infRps.setIdentificacaoRps(identificacaoRps);
        infRps.setDataEmissao("2021-03-22T15:39:58");
        infRps.setNaturezaOperacao("1");
        infRps.setOptanteSimplesNacional("2");
        infRps.setIncentivadorCultural("2");
        infRps.setStatus("1");
        infRps.setServico(servico);
        infRps.setPrestador(prestador);
        infRps.setTomador(tomador);

        Rps rps = new Rps();
        rps.setInfRps(infRps);

        LoteRps.ListaRps listaRps = new LoteRps.ListaRps();
        listaRps.getRps().add(rps);
        
        LoteRps loteRps = new LoteRps();
		loteRps.setNumeroLote("30000001");
		loteRps.setId("L30000001");
        loteRps.setCnpj("07272825000457");
		loteRps.setInscricaoMunicipal("233691");
		loteRps.setQuantidadeRps("1");
        loteRps.setListaRps(listaRps);

        EnviarLoteRpsEnvio enviarLoteRpsEnvio = new EnviarLoteRpsEnvio();
        enviarLoteRpsEnvio.setLoteRps(loteRps);

		StringWriter str = new StringWriter();
		Persister p = new Persister(new Format(0));
		p.write(enviarLoteRpsEnvio, str);

        assertEquals(this.xml, str.toString());

    }
}
