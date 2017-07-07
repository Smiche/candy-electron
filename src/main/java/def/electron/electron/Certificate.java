package def.electron.electron;
@jsweet.lang.Interface
public abstract class Certificate extends def.js.Object {
    /**
		 * PEM encoded data.
		 */
    public String data;
    /**
		 * Issuer principal
		 */
    public CertificatePrincipal issuer;
    /**
		 * Issuer's Common Name.
		 */
    public String issuerName;
    /**
		 * Issuer certificate (if not self-signed)
		 */
    public Certificate issuerCert;
    /**
		 * Subject principal
		 */
    public CertificatePrincipal subject;
    /**
		 * Subject's Common Name.
		 */
    public String subjectName;
    /**
		 * Hex value represented string.
		 */
    public String serialNumber;
    /**
		 * Start date of the certificate being valid in seconds.
		 */
    public double validStart;
    /**
		 * End date of the certificate being valid in seconds.
		 */
    public double validExpiry;
    /**
		 * Fingerprint of the certificate.
		 */
    public String fingerprint;
}

