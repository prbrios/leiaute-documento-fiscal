package com.github.prbrios.documentofiscal.nfe.util;

import org.junit.Test;

public class AssinaturaTest {

    private final String cert = "c:\\users\\prbri\\OneDrive\\Documentos\\Unigex\\Projetos\\Java\\nfeapi\\resources\\22165464000190.pfx";

    @Test
    public void assinar() throws Exception {

        Assinatura assinatura = new Assinatura(cert, "12345678");
        String xmlAssinado = assinatura.assinar("<EnviarLoteRpsEnvio><LoteRps Id=\"LOTE_1\"></LoteRps></EnviarLoteRpsEnvio>");
        System.out.println(xmlAssinado);

    }

}