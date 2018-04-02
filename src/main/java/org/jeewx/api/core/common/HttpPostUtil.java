package org.jeewx.api.core.common;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class HttpPostUtil {
	URL url;
	HttpURLConnection conn;
	String boundary = "--------httppost123";
	Map<String, String> textParams = new HashMap<String, String>();
	Map<String, File> fileparams = new HashMap<String, File>();
	DataOutputStream ds;

	public HttpPostUtil(String url) throws Exception {
		this.url = new URL(url);
	}
