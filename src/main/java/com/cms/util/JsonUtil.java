package com.cms.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class JsonUtil {
	public static void returnJson(JSONArray jsonArray, HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out;
		response.setContentType("application/json;charset=UTF-8");
		try {
			out = response.getWriter();

			out.println("{\"flag\":true,\n\"data\":[");
			if (jsonArray != null) {
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject object = (JSONObject) jsonArray.get(i); //
					if (i < jsonArray.size() - 1) {
						out.println(object + ",");
					}

					if (i + 1 == jsonArray.size()) {
						out.println(object);
						out.println("]}");
						return;
					}
				}
			} else {
				out.println("]}");
			}
		} catch (IOException e) {

		}

	}

	public static JSONArray returnStatus(boolean flag, String msg) {
		String returnMsg = "[{\"flag\":\"" + flag + "\"}," + "{\"msg\":\"" + msg + "\"}" + "]";
		JSONArray jsb = JSONArray.fromObject(returnMsg);
		return jsb;
	}

	// 与上重复率太高，后续版本需整合改进
	public static JSONArray returnStatuss(boolean flag, String msg) {
		String returnMsg = "[{\"flag\":\"" + flag + "\"}," + "{\"msg\":" + msg + "}" + "]";
		JSONArray jsb = JSONArray.fromObject(returnMsg);
		return jsb;
	}

	public static void returnOperting(int status, HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("{status:'" + status + "'");

			out.println("}");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void returndel(String delstatus, HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out;
		response.setContentType("application/json;charset=UTF-8");
		try {
			out = response.getWriter();
			out.println("{delstatus:'" + delstatus + "'");

			out.println("}");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author: ljx
	 * @methodsName: returnRequestParam
	 * @description: 获取请求参数
	 * @param: HttpServletRequest request, HttpServletResponse response
	 * @return: JSONObject
	 * @Time: 2020-5-28 9:37:29
	 * @throws:
	 */
	public static JSONObject getRequestParam(HttpServletRequest request, HttpServletResponse response) {
		InputStreamReader insr;
		String result = "";
		int respInt = 0;
		JSONObject jsb = null;
		try {
			insr = new InputStreamReader(request.getInputStream(), "utf-8");
			result = "";
			respInt = insr.read();
			while (respInt != -1) {
				result += (char) respInt;
				respInt = insr.read();
			}
			if (result.length() > 0) {
				jsb = JSONObject.fromObject(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsb;
	}

}
