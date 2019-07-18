package com.teju.spring.sprincore.properties;

import java.util.Properties;

public class DifferentLanguages {
private Properties countandlangs;

public Properties getCountandlangs() {
	return countandlangs;
}

public void setCountandlangs(Properties countandlangs) {
	this.countandlangs = countandlangs;
}

@Override
public String toString() {
	return "DifferentLanguages [countandlangs=" + countandlangs + "]";
}
}
