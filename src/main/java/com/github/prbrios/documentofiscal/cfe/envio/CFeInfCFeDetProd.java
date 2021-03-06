package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de detalhamento de Produtos e Serviços do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "prod")
public class CFeInfCFeDetProd {

    /**
     * AC - Código do produto ou serviço
     */
    @Element(name = "cProd", required = false)
    private String cProd;

    /**
     * AC - GTIN (Global Trade Item Number) do produto, antigo código EAN ou código de barras
     */
    @Element(name = "cEAN", required = false)
    private String cEAN;

    /**
     * AC - Descrição do produto ou serviço
     */
    @Element(name = "xProd", required = false)
    private String xProd;

    /**
     * AC - Código NCM com 8 dígitos ou 2 dígitos (gênero)
     */
    @Element(name = "NCM", required = false)
    private String NCM;

    /**
     * AC - Código Fiscal de Operações e Prestações
     */
    @Element(name = "CFOP", required = false)
    private String CFOP;

    /**
     * AC - Unidade comercial
     */
    @Element(name = "uCom", required = false)
    private String uCom;

    /**
     * AC - Quantidade comercial
     */
    @Element(name = "qCom", required = false)
    private String qCom;

    /**
     * AC - Valor unitário de comercialização
     */
    @Element(name = "vUnCom", required = false)
    private String vUnCom;

    /**
     * AC - Valor Bruto dos Produtos ou Serviços
     */
    @Element(name = "vProd", required = false)
    private String vProd;

    /**
     * AC - Regra de cálculo
     */
    @Element(name = "indRegra", required = false)
    private String indRegra;

    /**
     * AC - Valor do Desconto sobre item
     */
    @Element(name = "vDesc", required = false)
    private String vDesc;

    /**
     * AC - Outras despesas acessórias sobre item
     */
    @Element(name = "vOutro", required = false)
    private String vOutro;

    /**
     * AC - Valor líquido do Item
     */
    @Element(name = "vItem", required = false)
    private String vItem;

    /**
     * AC - Rateio do desconto sobre subtotal
     */
    @Element(name = "vRatDesc", required = false)
    private String vRatDesc;

    /**
     * AC - Rateio do acréscimo sobre subtotal
     */
    @Element(name = "vRatAcr", required = false)
    private String vRatAcr;

    /**
     * AC -
     */
    @Element(name = "obsFiscoDet", required = false)
    private CFeInfCFeDetProdObsFiscoDet obsFiscoDet;

    public CFeInfCFeDetProd() {}

    /**
     *
     * @param cProd
     * @param cEAN
     * @param xProd
     * @param NCM
     * @param CFOP
     * @param uCom
     * @param qCom
     * @param vUnCom
     * @param vProd
     * @param indRegra
     * @param vDesc
     * @param vOutro
     * @param vItem
     * @param vRatDesc
     * @param vRatAcr
     * @param obsFiscoDet
     */
    public CFeInfCFeDetProd(String cProd, String cEAN, String xProd, String NCM, String CFOP, String uCom, String qCom, String vUnCom, String vProd, String indRegra, String vDesc, String vOutro, String vItem, String vRatDesc, String vRatAcr, CFeInfCFeDetProdObsFiscoDet obsFiscoDet) {
        this.cProd = cProd;
        this.cEAN = cEAN;
        this.xProd = xProd;
        this.NCM = NCM;
        this.CFOP = CFOP;
        this.uCom = uCom;
        this.qCom = qCom;
        this.vUnCom = vUnCom;
        this.vProd = vProd;
        this.indRegra = indRegra;
        this.vDesc = vDesc;
        this.vOutro = vOutro;
        this.vItem = vItem;
        this.vRatDesc = vRatDesc;
        this.vRatAcr = vRatAcr;
        this.obsFiscoDet = obsFiscoDet;
    }

	public String getcProd() {
		return cProd;
	}

	public void setcProd(String cProd) {
		this.cProd = cProd;
	}

	public String getcEAN() {
		return cEAN;
	}

	public void setcEAN(String cEAN) {
		this.cEAN = cEAN;
	}

	public String getxProd() {
		return xProd;
	}

	public void setxProd(String xProd) {
		this.xProd = xProd;
	}

	public String getNCM() {
		return NCM;
	}

	public void setNCM(String nCM) {
		NCM = nCM;
	}

	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String cFOP) {
		CFOP = cFOP;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public String getqCom() {
		return qCom;
	}

	public void setqCom(String qCom) {
		this.qCom = qCom;
	}

	public String getvUnCom() {
		return vUnCom;
	}

	public void setvUnCom(String vUnCom) {
		this.vUnCom = vUnCom;
	}

	public String getvProd() {
		return vProd;
	}

	public void setvProd(String vProd) {
		this.vProd = vProd;
	}

	public String getIndRegra() {
		return indRegra;
	}

	public void setIndRegra(String indRegra) {
		this.indRegra = indRegra;
	}

	public String getvDesc() {
		return vDesc;
	}

	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}

	public String getvOutro() {
		return vOutro;
	}

	public void setvOutro(String vOutro) {
		this.vOutro = vOutro;
	}

	public String getvItem() {
		return vItem;
	}

	public void setvItem(String vItem) {
		this.vItem = vItem;
	}

	public String getvRatDesc() {
		return vRatDesc;
	}

	public void setvRatDesc(String vRatDesc) {
		this.vRatDesc = vRatDesc;
	}

	public String getvRatAcr() {
		return vRatAcr;
	}

	public void setvRatAcr(String vRatAcr) {
		this.vRatAcr = vRatAcr;
	}

	public CFeInfCFeDetProdObsFiscoDet getObsFiscoDet() {
		return obsFiscoDet;
	}

	public void setObsFiscoDet(CFeInfCFeDetProdObsFiscoDet obsFiscoDet) {
		this.obsFiscoDet = obsFiscoDet;
	}
    
}
