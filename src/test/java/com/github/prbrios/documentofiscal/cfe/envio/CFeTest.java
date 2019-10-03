package com.github.prbrios.documentofiscal.cfe.envio;

import static org.junit.Assert.assertTrue;

import com.github.prbrios.documentofiscal.cfe.CFePersister;
import org.junit.Test;

public class CFeTest
{

    @Test
    public void shouldAnswerWithTrue() {

        CFe cfe = new CFe();
        System.out.println(new CFePersister().write(cfe));

        String xml = "<CFe><infCFe><ide><nCFe>10</nCFe></ide></infCFe></CFe>";
        cfe = new CFePersister().read(xml);

        System.out.println(cfe.getInfCFe().getIde().getNCFe());

        assertTrue( true );
    }

}
