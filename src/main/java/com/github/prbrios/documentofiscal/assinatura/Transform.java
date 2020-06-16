package com.github.prbrios.documentofiscal.assinatura;

import org.simpleframework.xml.Attribute;

public class Transform {

    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

}