package com.github.prbrios.documentofiscal;

import java.io.File;

public interface IDFPersister<T> {

    T read (final File file);
    T read (final String xml);
    String write (T obj);

    T readFromJSON(final String json);
    String writeToJSON(T obj);

}
