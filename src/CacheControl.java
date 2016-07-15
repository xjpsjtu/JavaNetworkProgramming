import java.util.Date;
import java.util.Locale;

public class CacheControl {
	private Date maxAge = null;
	private Date sMaxAge = null;
	private boolean mustRevalidate = false;
	private boolean noCache = false;
	private boolean noStore = false;
	private boolean proxyRevalidate = false;
	private boolean publicCache = false;
	private boolean privateCache = false;
	
	public CacheControl(String s){
		if(s == null || s.contains(":")){
			return;
		}
		String value = s.split(":")[1].trim();
		String[] components = value.split(",");
		
		Date now = new Date();
		for(String component : components){
			try{
				component = component.trim().toLowerCase(Locale.US);
				if(component.startsWith("max-age=")){
					int secondsInTheFuture = Integer.parseInt(component.substring(8));
					setMaxAge(new Date(now.getTime() + 1000 * secondsInTheFuture));
				}else if(component.startsWith("s-maxage=")){
					int secondsInTheFuture = Integer.parseInt(component.substring(8));
					setSharedMaxAge(new Date(now.getTime() + 1000 * secondsInTheFuture));
				}else if(component.equals("must-revalidate")){
					setMustRevalidate(true);
				}else if(component.equals("proxy-revalidate")){
					setProxyRevalidate(true);
				}else if(component.equals("no-cache")){
					setNoCache(true);
				}else if(component.equals("public")){
					setPublicCache(true);
				}else if(component.equals("private")){
					setPrivateCache(true);
				}
			}catch(RuntimeException ex){
				continue;
			}
		}
	}

	public Date getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Date maxAge) {
		this.maxAge = maxAge;
	}

	public Date getSharedMaxAge() {
		return sMaxAge;
	}

	public void setSharedMaxAge(Date sMaxAge) {
		this.sMaxAge = sMaxAge;
	}

	public boolean isMustRevalidate() {
		return mustRevalidate;
	}

	public void setMustRevalidate(boolean mustRevalidate) {
		this.mustRevalidate = mustRevalidate;
	}

	public boolean isNoCache() {
		return noCache;
	}

	public void setNoCache(boolean noCache) {
		this.noCache = noCache;
	}

	public boolean isNoStore() {
		return noStore;
	}

	public void setNoStore(boolean noStore) {
		this.noStore = noStore;
	}

	public boolean isProxyRevalidate() {
		return proxyRevalidate;
	}

	public void setProxyRevalidate(boolean proxyRevalidate) {
		this.proxyRevalidate = proxyRevalidate;
	}

	public boolean isPublicCache() {
		return publicCache;
	}

	public void setPublicCache(boolean publicCache) {
		this.publicCache = publicCache;
	}

	public boolean isPrivateCache() {
		return privateCache;
	}

	public void setPrivateCache(boolean privateCache) {
		this.privateCache = privateCache;
	}
}
