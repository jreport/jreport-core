package br.jreport.core.api.property;

import java.util.Optional;

public interface NewListProperty<T> {

	Optional<String> getListValue(T item);
}
