package nl.tudelft.graphalytics.domain.algorithms;

import nl.tudelft.graphalytics.configuration.InvalidConfigurationException;
import org.apache.commons.configuration.Configuration;

/**
 * Factory interface that defines an API to parse algorithm-specific parameters from a Configuration.
 *
 * @author Tim Hegeman
 */
public interface ParameterFactory<T> {

	/**
	 * Parses an object of type T from the properties of a Configuration object.
	 *
	 * @param configuration the Configuration describing the object of type T
	 * @param baseProperty  the name of the property whose sub-properties describe the object
	 * @return the parsed object
	 * @throws InvalidConfigurationException iff the configuration does not contain the required properties
	 */
	public T fromConfiguration(Configuration configuration, String baseProperty) throws InvalidConfigurationException;

}
