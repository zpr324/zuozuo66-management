package com.zuozuo66.management.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class BaseUtil {
	
	/**
	 * @description 获取当前用户ID 
	 * @return Long 当前用户ID
	 * @author zpr324
	 */
	public static Long getCurrentUerId() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Object result = session.getAttribute("userId");
		if (result != null) {
			return (Long) result;
		}else {
			return null;
		}
	}
	
}
