package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo das informações de identificação do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "ide")
public class CFeInfCFeIde {

    /**
     * SAT - Código da UF do emitente do Documento Fiscal
     */
    @Element(name = "cUF", required = false)
    private String cUF;

    /**
     * SAT - Código Numérico que compõe a Chave de Acesso
     */
    @Element(name = "cNF", required = false)
    private String cNF;

    /**
     * SAT - Código do Modelo do Documento Fiscal
     */
    @Element(name = "mod", required = false)
    private String mod;

    /**
     * SAT - Número de Série do equipamento SAT
     */
    @Element(name = "nserieSAT", required = false)
    private String nserieSAT;

    /**
     * SAT - Número do Cupom Fiscal Eletronico
     */
    @Element(name = "nCFe", required = false)
    private String nCFe;

    /**
     * SAT - Data de emissão do Cupom Fiscal
     */
    @Element(name = "dEmi", required = false)
    private String dEmi;
    /**
     * SAT - Hora de emissão do Cupom Fiscal
     */
    @Element(name = "hEmi", required = false)
    private String hEmi;

    /**
     * SAT - Dígito Verificador da Chave de Acesso do CF-e
     */
    @Element(name = "cDV", required = false)
    private String cDV;

    /**
     * SAT - Ambiente
     */
    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    /**
     * AC - CNPJ Software House
     */
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    /**
     * AC - Assinatura do Aplicativo Comercial
     */
    @Element(name = "signAC", required = false)
    private String signAC;

    /**
     * SAT - Assinatura Digital para uso em QRCODE
     */
    @Element(name = "assinaturaQRCODE", required = false)
    private String assinaturaQRCODE;

    /**
     * AC - Número do Caixa ao qual o SAT está conectado
     */
    @Element(name = "numeroCaixa", required = false)
    private String numeroCaixa;

    public CFeInfCFeIde() {}

    /**
     *
     * @param cUF
     * @param cNF
     * @param mod
     * @param nserieSAT
     * @param nCFe
     * @param dEmi
     * @param hEmi
     * @param cDV
     * @param tpAmb
     * @param cnpj
     * @param signAC
     * @param assinaturaQRCODE
     * @param numeroCaixa
     */
    public CFeInfCFeIde(String cUF, String cNF, String mod, String nserieSAT, String nCFe, String dEmi, String hEmi, String cDV, String tpAmb, String cnpj, String signAC, String assinaturaQRCODE, String numeroCaixa) {
        this.cUF = cUF;
        this.cNF = cNF;
        this.mod = mod;
        this.nserieSAT = nserieSAT;
        this.nCFe = nCFe;
        this.dEmi = dEmi;
        this.hEmi = hEmi;
        this.cDV = cDV;
        this.tpAmb = tpAmb;
        this.CNPJ = cnpj;
        this.signAC = signAC;
        this.assinaturaQRCODE = assinaturaQRCODE;
        this.numeroCaixa = numeroCaixa;
    }
}
