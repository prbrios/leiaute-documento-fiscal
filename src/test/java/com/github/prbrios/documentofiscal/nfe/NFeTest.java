package com.github.prbrios.documentofiscal.nfe;

import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class NFeTest {
    
    @Test
    public void test1() throws Exception {
        String xml = "<nfeProc xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"4.00\"></nfeProc>";
        Persister persist = new Persister();
        persist.read(NFeProc.class, xml);
    }

}
