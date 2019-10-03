package com.github.prbrios.documentofiscal.cfe;

import com.github.prbrios.documentofiscal.cfe.cancelamento.CFeCanc;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.StringWriter;

/**
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
public class CFeCancPersister {

    private final Persister persister;

    public CFeCancPersister() {
        this.persister = new Persister();
    }

    public CFeCanc read (final File xml) {
        try {
            return this.persister.read(CFeCanc.class, xml);
        }catch (final Exception e){
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public CFeCanc read (final String xml) {
        try {
            return this.persister.read(CFeCanc.class, xml);
        }catch (final Exception e){
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public String write (CFeCanc obj) {
        try (StringWriter writer = new StringWriter()) {
            this.persister.write(obj, writer);
            return writer.toString();
        }catch (final Exception e){
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

}
