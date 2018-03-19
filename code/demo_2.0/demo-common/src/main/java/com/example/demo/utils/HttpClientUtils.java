package com.example.demo.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http 工具类
 * @author LvXin
 */
public class HttpClientUtils {
	private static Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);
	
	/**
	 * post请求
	 * @param url 请求地址
	 * @param params 键值对参数
	 * @return
	 * @throws Exception
	 */
	public static String post(String url,List<NameValuePair> params) throws Exception{
		logger.debug("进入方法:post,参数,url:" + url + ",params:" + params);
		CloseableHttpClient client = null;
		try {
			client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);	
			if (params != null && params.size() > 0) {
				post.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
			}
			
			HttpResponse res = client.execute(post);
			logger.info("response status:" + res.getStatusLine());
			logger.debug("结束方法:post,参数,url:" + url + ",params:" + params);
			return EntityUtils.toString(res.getEntity());
		} catch (Exception e) {
			throw e;
		} finally{
			try {
				client.close();
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
			}
		}
		
	}
	
	/**
	 * post请求
	 * @param url 请求地址
	 * @param param 参数
	 * @return
	 * @throws Exception
	 */
	public static String post(String url,Map<String, String> map) throws Exception{
		logger.debug("进入方法:post2,参数,url:" + url + ",map:" + map);
		CloseableHttpClient client = null;
		try {
			client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);	
			if (map != null && map.size() > 0) {
				List<BasicNameValuePair> nvList = new ArrayList<>();
				for(String key : map.keySet()){
					nvList.add(new BasicNameValuePair(key, map.get(key)));
				}
				post.setEntity(new UrlEncodedFormEntity(nvList,"UTF-8"));
			}
			
			HttpResponse res = client.execute(post);
			logger.info("response status:" + res.getStatusLine());
			
			logger.debug("结束方法:post,参数,url:" + url + ",map:" + map);
			return EntityUtils.toString(res.getEntity(),"UTF-8");
		} catch (Exception e) {
			throw e;
		} finally{
			try {
				client.close();
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
			}
		}
	}
	
	/**
	 * post请求
	 * @param url 请求地址
	 * @param param 字符串参数
	 * @return
	 * @throws Exception
	 */
	public static String post(String url,String param) throws Exception{
		logger.debug("进入方法:post,参数,url:" + url + ",param:" + param);
		CloseableHttpClient client = null;
		try {
			client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);		
			post.setEntity(new StringEntity(param, "UTF-8"));
			
			HttpResponse res = client.execute(post);
			logger.info("response status:" + res.getStatusLine());
			
			logger.debug("结束方法:post,参数,url:" + url + ",param:" + param);
			return EntityUtils.toString(res.getEntity(),"UTF-8");
		} catch (Exception e) {
			throw e;
		} finally{
			try {
				client.close();
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
			}
		}
	}
	
	/**
	 * get请求
	 * @param url 请求地址
	 * @param queryString 请求参数，如：aa=bb&&cc=dd&&number=3
	 * @return
	 * @throws Exception
	 */
	public static String get(String url,String queryString) throws Exception{
		logger.debug("进入方法:get,参数,url:" + url + ",queryString:" + queryString);
		CloseableHttpClient client = null;
		try {
			if (queryString != null && queryString.trim().length() > 0) {
				if (url.contains("?")) {
					url += "&" + queryString;
				}else{
					url += "?" + queryString;
				}
			}
			client = HttpClientBuilder.create().build();
			HttpGet get = new HttpGet(url);
			HttpResponse res = client.execute(get);
			logger.info("response status:" + res.getStatusLine());

			logger.debug("结束方法:get,参数,url:" + url + ",queryString:" + queryString);
			return EntityUtils.toString(res.getEntity(),"UTF-8");
		} catch (Exception e) {
			throw e;
		} finally{
			try {
				client.close();
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		String res = post("http://www.qq.com", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><xml><header><reqId></reqId><reqTime></reqTime><transCode>10000</transCode><reqStatus></reqStatus><reqStatusMessage></reqStatusMessage></header><body><aaa><bbb1>bbbb1</bbb1><bbb2>bbbb2</bbb2><bbb3><ccc1>ccc2</ccc1><ccc2>ccc3</ccc2><ccc3>ccc4</ccc3><ccc>ccc1</ccc></bbb3><bbb4>bbbb4</bbb4><bbb5>bbbb5</bbb5></aaa><number>100</number></body></xml>");
		
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		String res2 = post("https://www.baidu.com", list);
		
		String res3 = get("http://www.qq.com", null);
		
		System.out.println("********");
		System.out.println(res);
		System.out.println("********");
		System.out.println(res2);
		System.out.println("********");
		System.out.println(res3);
	}
}
