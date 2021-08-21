package per.ryan.zombies.utils;

import java.lang.reflect.Field;

/**
 * Utilities class for entities.
 * 
 * @author Ryan Bender
 */
public class EntityUtils {
	
	/**
	 * Get private field.
	 * 
	 * @param fieldName field name
	 * @param clazz class to get field from
	 * @param object object to get from field
	 * @return object field.
	 */
	public static Object getPrivateField(String fieldName, Class<?> clazz, Object object) {
		try {
			Field field = clazz.getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.get(object);
		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
