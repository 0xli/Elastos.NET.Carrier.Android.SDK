package org.elastos.carrier;

/**
 * What a Carrier client advertises to its friends (AgentNet client metadata).
 *
 * {@code protoVersion} follows the JavaScript peer's definition: 0 legacy,
 * 1 client metadata + 16 MB bulk messages, 2 = the <em>application</em>
 * answers DNPACK1 text delivery ACKs. The SDK advertises 1 by itself; an app
 * sets 2 only if it implements the ACK, because a peer that sees 2 keeps
 * re-sending each text until the app acknowledges it.
 */
public class ClientInfo {
	private int protoVersion;
	private String platform = "";
	private String osVersion = "";
	private String appVersion = "";

	public ClientInfo() {}

	public ClientInfo(int protoVersion, String platform, String osVersion, String appVersion) {
		this.protoVersion = protoVersion;
		this.platform = platform == null ? "" : platform;
		this.osVersion = osVersion == null ? "" : osVersion;
		this.appVersion = appVersion == null ? "" : appVersion;
	}

	public int getProtoVersion() { return protoVersion; }
	public void setProtoVersion(int protoVersion) { this.protoVersion = protoVersion; }
	/** "ios" | "android" | "js" | "darwin" | "linux" | "win32" */
	public String getPlatform() { return platform; }
	public void setPlatform(String platform) { this.platform = platform == null ? "" : platform; }
	public String getOsVersion() { return osVersion; }
	public void setOsVersion(String osVersion) { this.osVersion = osVersion == null ? "" : osVersion; }
	public String getAppVersion() { return appVersion; }
	public void setAppVersion(String appVersion) { this.appVersion = appVersion == null ? "" : appVersion; }

	@Override
	public String toString() {
		return "clientInfo[proto " + protoVersion + ", " + platform + " " + osVersion + ", " + appVersion + "]";
	}
}
