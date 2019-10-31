package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do COFINS
 * 
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "COFINS")
public class CFeInfCFeDetImpostoCOFINS {

    /**
     * AC - Grupo de COFINS tributado pela alíquota
     */
    @Element(name = "COFINSAliq", required = false)
    private CFeInfCFeDetImpostoCOFINSCOFINSAliq COFINSAliq;

    /**
     * AC - Grupo de COFINS tributado por Qtde
     */
    @Element(name = "COFINSQtde", required = false)
    private CFeInfCFeDetImpostoCOFINSCOFINSQtde COFINSQtde;

    /**
     * AC - Grupo de COFINS não tributado
     */
    @Element(name = "COFINSNT", required = false)
    private CFeInfCFeDetImpostoCOFINSCOFINSNT COFINSnt;

    /**
     * AC - Grupo de COFINS para contribuinte do SIMPLES NACIONAL
     */
    @Element(name = "COFINSSN", required = false)
    private CFeInfCFeDetImpostoCOFINSCOFINSSN COFINSSN;

    /**
     * AC - Grupo de COFINS Outras Operações
     */
    @Element(name = "COFINSOutr", required = false)
    private CFeInfCFeDetImpostoCOFINSCOFINSOutr COFINSOutr;

    public CFeInfCFeDetImpostoCOFINS() {}

    /**
     *
     * @param COFINSAliq
     * @param COFINSQtde
     * @param COFINSnt
     * @param COFINSSN
     * @param COFINSOutr
     */
    public CFeInfCFeDetImpostoCOFINS(CFeInfCFeDetImpostoCOFINSCOFINSAliq COFINSAliq, CFeInfCFeDetImpostoCOFINSCOFINSQtde COFINSQtde, CFeInfCFeDetImpostoCOFINSCOFINSNT COFINSnt, CFeInfCFeDetImpostoCOFINSCOFINSSN COFINSSN, CFeInfCFeDetImpostoCOFINSCOFINSOutr COFINSOutr) {
        this.COFINSAliq = COFINSAliq;
        this.COFINSQtde = COFINSQtde;
        this.COFINSnt = COFINSnt;
        this.COFINSSN = COFINSSN;
        this.COFINSOutr = COFINSOutr;
    }
}
