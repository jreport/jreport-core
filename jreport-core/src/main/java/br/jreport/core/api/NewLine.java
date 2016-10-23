package br.jreport.core.api;

import java.io.Serializable;
import java.util.Optional;

public interface NewLine<T> extends Serializable {
	Optional<T> build();
}
