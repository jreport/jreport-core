package br.jreport.core.api.property;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import br.jreport.core.api.NewTableColumn;
import br.jreport.core.api.NewTableHeader;
import br.jreport.core.api.datasource.NewDatasource;

/**
 * 
 * @author jcruz
 *
 * @param <T>
 */
public interface NewTableProperty<T> extends Serializable {

	NewDatasource<T> getDatasource();

	Optional<NewTableColumn> getColumn(T item, int columnIndex);

	List<NewTableHeader> getHeaders();

	default int numColumns() {
		return getHeaders().size();
	}

	default Optional<NewTableColumn> getSummaryColumn(T item, int columnIndex) {
		return Optional.empty();
	}

}
