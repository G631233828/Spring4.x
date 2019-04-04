package gjb.spring4.collection.DataSource;

import java.util.Properties;

public class DataSources {

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "DataSources [properties=" + properties + "]";
	}

}
