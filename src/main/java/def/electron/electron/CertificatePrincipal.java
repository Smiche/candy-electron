package def.electron.electron;
@jsweet.lang.Interface
public abstract class CertificatePrincipal extends def.js.Object {
    /**
		 * Common Name
		 */
    public String commonName;
    /**
		 * Organization names
		 */
    public String[] organizations;
    /**
		 * Organization Unit names
		 */
    public String[] organizationUnits;
    /**
		 * Locality
		 */
    public String locality;
    /**
		 * State or province
		 */
    public String state;
    /**
		 * Country or region
		 */
    public String country;
}

