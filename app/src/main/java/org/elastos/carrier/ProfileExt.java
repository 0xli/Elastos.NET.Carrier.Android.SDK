package org.elastos.carrier;

/**
 * The profile extension a Carrier identity publishes in its userinfo
 * (AgentNet): pointers, never bytes — the app fetches the avatar itself.
 * Every field is optional; the whole userinfo must fit toxcore's 1007-byte
 * status message, so {@link Carrier#setSelfProfileExt} can refuse a long one.
 */
public class ProfileExt {
	/** https URL of an avatar image (max 255 bytes) */
	private String avatarUrl = "";
	/** a personal / site link (max 255 bytes) */
	private String url = "";
	/** "&lt;name&gt;.beagles.eth" — a display hint, not proof (max 63 bytes) */
	private String ens = "";
	/** small JSON for forward growth (max 255 bytes) */
	private String extra = "";

	public ProfileExt() {}

	public String getAvatarUrl() { return avatarUrl; }
	public void setAvatarUrl(String v) { avatarUrl = v == null ? "" : v; }
	public String getUrl() { return url; }
	public void setUrl(String v) { url = v == null ? "" : v; }
	public String getEns() { return ens; }
	public void setEns(String v) { ens = v == null ? "" : v; }
	public String getExtra() { return extra; }
	public void setExtra(String v) { extra = v == null ? "" : v; }

	@Override
	public String toString() {
		return "profileExt[avatar " + avatarUrl + ", url " + url + ", ens " + ens + ", extra " + extra + "]";
	}
}
