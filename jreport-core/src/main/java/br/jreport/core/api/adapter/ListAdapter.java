package br.jreport.core.api.adapter;

import java.util.Optional;

public interface ListAdapter<T> {

	Optional<String> getListValue(T item);
}
