package org.jeewx.api.core.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import freemarker.core.TemplateClassResolver;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.jeewx.api.core.common.util.StringTemplateLoader

;

/**
 * 
 * @Title:FreemarkerHelper
 * @description:Freemarker引擎协助类
 * @author 赵俊夫
 * @date Jul 5, 2013 2:58:29 PM
 * @version V1.0
 */
public class FreemarkerUtil {
	private static Configuration _tplConfig = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);

	public FreemarkerUtil(){
		
	}
	public FreemarkerUtil(String dir) {
		try {
			_tplConfig.setDirectoryForTemplateLoading(new File(dir));
			//必须freemarker字段为空，报错
			_tplConfig.setClassicCompatible(true);
			//update-begin-author:scott date:2023-8-15 for: freemarker模板注入问题 禁止解析ObjectConstructor，Execute和freemarker.template.utility.JythonRuntime。
			_tplConfig.setNewBuiltinClassResolver(TemplateClassResolver.SAFER_RESOLVER);
			//update-end-author:scott date:2023-8-15 for: freemarker模板注入问题 禁止解析ObjectConstructor，Execute和freemarker.template.utility.JythonRuntime。
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 解析ftl
	 * 
	 * @param tplName
	 *            模板名
	 * @param encoding
	 *            编码
	 * @param paras
	 *            参数
	 * @return
	 */
	public String parseTemplate(String tplName, String encoding,
			Map<String, Object> paras) {
		try {
			StringWriter swriter = new StringWriter();
			Template mytpl = null;
			mytpl = _tplConfig.getTemplate(tplName, encoding);
			mytpl.process(paras, swriter);
			return swriter.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}

	}
	
	public void genStaticPage(String tplPath, String tplName,
			Map<String, Object> paras) {
		Writer out = null;
		try {
			out = new OutputStreamWriter(new FileOutputStream(tplName),"UTF-8");
			Template mytpl = null;
			mytpl = _tplConfig.getTemplate(tplPath, "UTF-8");
			mytpl.process(paras, out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != out) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public String parseTemplate(String tplName, Map<String, Object> paras) {
		return this.parseTemplate(tplName, "utf-8", paras);
	}
	
	/**
	 * 解析ftl
	 * @param tplContent 模板内容
	 * @param encoding 编码
	 * @param paras 参数
	 * @return String 模板解析后内容
	 */
	public String parseTemplateContent(String tplContent,
			Map<String, Object> paras, String encoding) {
		Configuration cfg = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
		//update-begin-author:scott date:2023-8-15 for: freemarker模板注入问题 禁止解析ObjectConstructor，Execute和freemarker.template.utility.JythonRuntime。
		cfg.setNewBuiltinClassResolver(TemplateClassResolver.SAFER_RESOLVER);
		//update-end-author:scott date:2023-8-15 for: freemarker模板注入问题 禁止解析ObjectConstructor，Execute和freemarker.template.utility.JythonRuntime。
	    StringWriter writer = new StringWriter(); 
        cfg.setTemplateLoader(new StringTemplateLoader(tplContent));  
        encoding = encoding==null?"UTF-8":encoding;
        cfg.setDefaultEncoding(encoding);    
   
        Template template;
		try {
			template = cfg.getTemplate("");
	        template.process(paras, writer);    
			} catch (Exception e) {
				e.printStackTrace();
			}
        return writer.toString();       
	}
	
	/**
	 * 解析ftl
	 * @param tplContent 模板内容
	 * @param encoding 编码
	 * @param paras 参数
	 * @return String 模板解析后内容
	 */
	public static String parseTemplateContent(String tplContent,Map<String, Object> paras) {
		Configuration cfg = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);    
	    StringWriter writer = new StringWriter(); 
        cfg.setTemplateLoader(new StringTemplateLoader(tplContent));
		//update-begin-author:scott date:2023-8-15 for: freemarker模板注入问题 禁止解析ObjectConstructor，Execute和freemarker.template.utility.JythonRuntime。
		cfg.setNewBuiltinClassResolver(TemplateClassResolver.SAFER_RESOLVER);
		//update-end-author:scott date:2023-8-15 for: freemarker模板注入问题 禁止解析ObjectConstructor，Execute和freemarker.template.utility.JythonRuntime。
        cfg.setDefaultEncoding("UTF-8");    
   
        Template template;
		try {
			template = cfg.getTemplate("");
	        template.process(paras, writer);    
			} catch (Exception e) {
				e.printStackTrace();
			}
        return writer.toString();       
	}
}