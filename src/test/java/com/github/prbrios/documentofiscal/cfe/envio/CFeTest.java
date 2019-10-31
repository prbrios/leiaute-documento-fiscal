package com.github.prbrios.documentofiscal.cfe.envio;

import com.github.prbrios.documentofiscal.DFPersister;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CFeTest
{

    @Test
    public void shouldAnswerWithTrue() {

        String xml = "<CFe><infCFe><ide><nCFe>10</nCFe></ide></infCFe></CFe>";

        DFPersister dfp = new DFPersister<CFe>(){};
        CFe obj = (CFe) dfp.read(xml);

        System.out.println(obj.getInfCFe().getIde().getNCFe());

        assertTrue( true );
    }

}
