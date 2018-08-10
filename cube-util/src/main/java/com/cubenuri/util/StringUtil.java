package com.cubenuri.util;

public class StringUtil {

	public static boolean isEmpty(String str) {
		if (str != null) {
			int len = str.length();
			for (int i = 0; i < len; ++i) {
				if (str.charAt(i) > ' ') {
					return false;
				}
			}
		}
		return true;
	}

}
