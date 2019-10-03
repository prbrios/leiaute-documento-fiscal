package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo das informações de identificação do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ide")
public class Ide {

    /**
     * SAT - Código da UF do emitente do Documento Fiscal
     */
    @Getter
    @Element(name = "cUF", required = false)
    private String cUF;

    /**
     * SAT - Código Numérico que compõe a Chave de Acesso
     */
    @Getter
    @Element(name = "cNF", required = false)
    private String cNF;

    /**
     * SAT - Código do Modelo do Documento Fiscal
     */
    @Getter
    @Element(name = "mod", required = false)
    private String mod;

    /**
     * SAT - Número de Série do equipamento SAT
     */
    @Getter
    @Element(name = "nserieSAT", required = false)
    private String nserieSAT;

    /**
     * SAT - Número do Cupom Fiscal Eletronico
     */
    @Getter
    @Element(name = "nCFe", required = false)
    private String nCFe;

    /**
     * SAT - Data de emissão do Cupom Fiscal
     */
    @Getter
    @Element(name = "dEmi", required = false)
    private String dEmi;
    /**
     * SAT - Hora de emissão do Cupom Fiscal
     */
    @Getter
    @Element(name = "hEmi", required = false)
    private String hEmi;
    /**
     * SAT - Dígito Verificador da Chave de Acesso do CF-e
     */
    @Getter
    @Element(name = "cDV", required = false)
    private String cDV;

    /**
     * AC - CNPJ Software House
     */
    @Getter
    @Setter
    @Element(name = "CNPJ", required = false)
    private String cnpj;

    /**
     * AC - Assinatura do Aplicativo Comercial
     */
    @Getter
    @Setter
    @Element(name = "signAC", required = false)
    private String signAC;

    /**
     * SAT - Assinatura Digital para uso em QRCODE
     */
    @Getter
    @Element(name = "assinaturaQRCODE", required = false)
    private String assinaturaQRCODE;

    /**
     * AC - Número do Caixa ao qual o SAT está conectado
     */
    @Getter
    @Setter
    @Element(name = "numeroCaixa", required = false)
    private String numeroCaixa;


}
