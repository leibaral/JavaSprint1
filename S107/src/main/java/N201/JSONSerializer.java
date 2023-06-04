package N201;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


public class JSONSerializer {
    private static String directori;
    private static String fileName;
    private static String filePath;

    public static String serializeObjectToJSON(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        SerializeToJSON annotation = clazz.getAnnotation(SerializeToJSON.class);
        if (annotation == null) {
            throw new IllegalArgumentException("La Classe no té cap annotació @SerializeToJSON");
        }

        directori = System.getProperty("user.dir") + annotation.directory();
        fileName = clazz.getSimpleName() + "1.json";
        filePath = directori + File.separator + fileName;


        Map<String, Object> jsonMap = new HashMap<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            jsonMap.put(field.getName(), field.get(object));
        }

        return mapToJsonString(jsonMap);
    }

    private static String mapToJsonString(Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        boolean isFirst = true;

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!isFirst) {
                stringBuilder.append(",");
            }
            isFirst = false;

            stringBuilder.append("\"").append(entry.getKey()).append("\":");
            Object value = entry.getValue();

            if (value instanceof String) {
                stringBuilder.append("\"").append(value).append("\"");
            } else {
                stringBuilder.append(value);
            }
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static String getFilePath() {
        return filePath;
    }
}
