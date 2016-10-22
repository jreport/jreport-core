package br.jreport.core.api.adapter;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface TableAdapter<T> extends Serializable {

	Optional<String> getColumnValue(T item, int columnIndex);

	List<String> getHeaders();

}
