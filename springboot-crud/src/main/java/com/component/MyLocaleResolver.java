package com.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * i18n 语言区域解析器
 *locale 英[ləʊˈkɑːl]  美[loʊˈkæl] n.	发生地点; 现场; 注意不是local
 */

public class MyLocaleResolver implements LocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String str=request.getParameter("l");
		Locale locale = Locale.getDefault();
		if (!StringUtils.isEmpty(str)){
			String split[]=str.split("_");
			locale=new Locale(split[0], split[1]);//第一个传的是语言代码, 第二个是国家代码
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

	}
}
/*
 *用户：sky-吴
 *日期：2019/9/10
 */