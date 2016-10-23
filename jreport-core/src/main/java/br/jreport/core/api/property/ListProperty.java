package br.jreport.core.api.property;

import java.util.Optional;

public interface ListProperty<T> {

	Optional<String> getListValue(T item);
}
