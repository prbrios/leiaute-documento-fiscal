package com.github.prbrios.documentofiscal.cfe;

import com.github.prbrios.documentofiscal.cfe.envio.CFe;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.StringWriter;

/**
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
public class CFePersister {

    private final Persister persister;

    public CFePersister() {
        this.persister = new Persister();
    }

    public CFe read (final File xml) {
        try {
            return this.persister.read(CFe.class, xml);
        }catch (final Exception e){
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public CFe read (final String xml) {
        try {
            return this.persister.read(CFe.class, xml);
        }catch (final Exception e){
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public String write (CFe obj) {
        try (StringWriter writer = new StringWriter()) {
            this.persister.write(obj, writer);
            return writer.toString();
        }catch (final Exception e){
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

}
