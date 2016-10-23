package br.jreport.core.api.property;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import br.jreport.core.api.TableColumn;
import br.jreport.core.api.TableHeader;
import br.jreport.core.api.datasource.Datasource;

/**
 * 
 * @author jcruz
 *
 * @param <T>
 */
public interface TableProperty<T> extends Serializable {

	Datasource<T> getDatasource();

	Optional<TableColumn> getColumn(T item, int columnIndex);

	List<TableHeader> getHeaders();

	default int numColumns() {
		return getHeaders().size();
	}

	default Optional<TableColumn> getSummaryColumn(T item, int columnIndex) {
		return Optional.empty();
	}

}
