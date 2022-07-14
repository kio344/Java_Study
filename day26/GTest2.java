package day26;

public class GTest2 {
	
	public static <T> T function(T data) {
		T result;
		if(data instanceof Integer) {
			result = (T)"정수";
		}else if(data instanceof Double || data instanceof Float) {
			result = (T)"실수";
		}else if(data instanceof Character) {
			result = (T)"문자";
		}else if(data instanceof String) {
			result = (T)"문자열";
		}else {
			result = null;
		}
		
		return result;
	}
}
