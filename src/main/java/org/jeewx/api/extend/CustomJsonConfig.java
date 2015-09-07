package org.jeewx.api.extend;

import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;
/**
 * 过滤不需要转换的属性
 * @author luobaoli
 *
 */
public class CustomJsonConfig extends JsonConfig{
	@SuppressWarnings("rawtypes")
	private Class clazz;
	public CustomJsonConfig(){
		
	}
	
	public CustomJsonConfig(Class clazz,final String exclude){
		this.clazz = clazz;
		setRootClass(clazz);
		setJavaPropertyFilter(new PropertyFilter() {
			public boolean apply(Object arg0, String param, Object arg2) {
				if(param.equals(exclude))return true;
				return false;
			}
		});
	}
	
	public CustomJsonConfig(Class clazz,final String[] excludes){
		this.clazz = clazz;
		setRootClass(clazz);
		setJavaPropertyFilter(new PropertyFilter() {
			public boolean apply(Object arg0, String param, Object arg2) {
				for(String exclude:excludes){
					if(param.equals(exclude))return true;
				}
				return false;
			}
		});
	}
}
