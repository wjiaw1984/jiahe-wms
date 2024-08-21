package com.best.javaSdk;

import com.best.javaSdk.converter.Converter;
import com.best.javaSdk.converter.impl.*;
import com.best.javaSdk.converter.util.jsonReader.ExceptionErrorListener;
import com.best.javaSdk.converter.util.jsonReader.JSONValidatingReader;
import com.best.javaSdk.converter.util.jsonReader.JSONWriter;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Parser {
    /*  26 */   private static Map<Class, Converter> converterMap = (Map) new HashMap<>();

    static {
        /*  27 */
        converterMap.put(String.class, new StringConverter());
        /*  28 */
        converterMap.put(int.class, new IntConverter());
        /*  29 */
        converterMap.put(Integer.class, new IntConverter());
        /*  30 */
        converterMap.put(float.class, new FloatConverter());
        /*  31 */
        converterMap.put(Float.class, new FloatConverter());
        /*  32 */
        converterMap.put(double.class, new DoubleConverter());
        /*  33 */
        converterMap.put(Double.class, new DoubleConverter());
        /*  34 */
        converterMap.put(long.class, new LongConverter());
        /*  35 */
        converterMap.put(Long.class, new LongConverter());
        /*  36 */
        converterMap.put(boolean.class, new BooleanConverter());
        /*  37 */
        converterMap.put(Boolean.class, new BooleanConverter());
        /*  38 */
        converterMap.put(Date.class, new DateConverter());
    }

    public static String coverObject2Xml(Object o) {
        /*  42 */
        StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        /*  43 */
        Class<?> cls = o.getClass();
        /*  44 */
        String className = cls.getName();
        /*  45 */
        className = className.substring(className.lastIndexOf(".") + 1);
        /*  46 */
        if (className.endsWith("Req")) {
            /*  47 */
            sb.append(appendXmlNode("request", object2XmlConvert(o)));
        } else {
            /*  49 */
            sb.append(appendXmlNode("response", object2XmlConvert(o)));
        }

        /*  52 */
        return sb.toString();
    }

    public static String object2XmlConvert(Object o) {
        /*  56 */
        StringBuilder stringBuilder = new StringBuilder();
        try {
            /*  58 */
            Class<?> cls = o.getClass();
            /*  59 */
            if (cls.getName().startsWith("java.lang")) {
                /*  60 */
                return o.toString();
            }

            /*  63 */
            Field[] props = cls.getDeclaredFields();
            /*  64 */
            for (Field prop : props) {
                /*  65 */
                prop.setAccessible(true);
                /*  66 */
                String propName = prop.getName();
                /*  67 */
                Class<?> propType = prop.getType();
                /*  68 */
                Object propValue = prop.get(o);
                /*  69 */
                StringBuilder stb = new StringBuilder();
                /*  70 */
                if (propValue != null) {
                    /*  73 */
                    if (converterMap.containsKey(propType)) {
                        /*  74 */
                        stb = new StringBuilder(((Converter) converterMap.get(propType)).xmlReverse(propValue, prop));
                        /*  75 */
                    } else if (propType.getName().equals("java.util.List")) {
                        /*  76 */
                        List valueList = (List) propValue;
                        /*  77 */
                        for (Object value : valueList) {
                            /*  78 */
                            stb.append(appendXmlNode(propName, object2XmlConvert(value)));
                        }
                    } else {
                        /*  81 */
                        stb = new StringBuilder(appendXmlNode(propName, object2XmlConvert(propValue)));
                    }
                    /*  83 */
                    stringBuilder.append(stb);
                }
            }
            /*  85 */
        } catch (Exception e) {
            /*  86 */
            return "parser error : " + e.getMessage();
        }
        /*  88 */
        return stringBuilder.toString();
    }

    public static String appendXmlNode(String nodeName, String nodeValue) {
        /*  92 */
        StringBuilder sb = new StringBuilder();
        /*  93 */
        return sb.append("<").append(nodeName).append(">").append(nodeValue).append("</").append(nodeName).append(">").toString();
    }


    public static <T> T coverXml2Object(String xml, Class<T> clazz) {
        /*  98 */
        if (xml == null || "".equals(xml)) {
            /*  99 */
            return null;
        }


        try {
            /* 104 */
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            /* 105 */
            DocumentBuilder builder = factory.newDocumentBuilder();
            /* 106 */
            Document doc = builder.parse(new InputSource(new StringReader(xml)));
            /* 107 */
            Element root = doc.getDocumentElement();
            /* 108 */
            NodeList nodeList = root.getChildNodes();
            /* 109 */
            return handelNodes(nodeList, clazz);
            /* 110 */
        } catch (Exception e) {
            /* 111 */
            e.printStackTrace();

            /* 113 */
            return null;
        }
    }

    public static <T> T handelNodes(NodeList nodeList, Class<T> clazz) {
        try {
            /* 118 */
            if (nodeList == null) {
                /* 119 */
                return null;
            }
            /* 121 */
            if (clazz.getName().startsWith("java.lang")) {
                /* 122 */
                return (T) nodeList.item(0).getNodeValue();
            }

            /* 125 */
            T obj = clazz.newInstance();
            /* 126 */
            Map<Field, List<Object>> listChildMap = new HashMap<>();
            /* 127 */
            for (int i = 0; i < nodeList.getLength(); i++) {
                /* 128 */
                Node node = nodeList.item(i);
                /* 129 */
                String nodeName = node.getNodeName();
                /* 130 */
                short nodeType = node.getNodeType();
                /* 131 */
                if (nodeType != 3 && nodeType != 4) {

                    /* 134 */
                    if (node.hasChildNodes()) {


                        /* 137 */
                        Field[] fields = clazz.getDeclaredFields();
                        /* 138 */
                        if (isContainProp(fields, nodeName)) {


                            /* 141 */
                            Field field = clazz.getDeclaredField(nodeName);
                            /* 142 */
                            field.setAccessible(true);
                            /* 143 */
                            Class<?> fieldType = field.getType();

                            /* 145 */
                            if (fieldType.getName().equals("java.util.List")) {
                                /* 146 */
                                Type type = field.getGenericType();
                                /* 147 */
                                if (type instanceof ParameterizedType) {
                                    /* 148 */
                                    ParameterizedType pt = (ParameterizedType) type;
                                    /* 149 */
                                    Class<?> genericClazz = (Class) pt.getActualTypeArguments()[0];
                                    /* 150 */
                                    Object listChildObj = handelNodes(node.getChildNodes(), genericClazz);

                                    /* 152 */
                                    if (listChildMap.get(field) == null) {
                                        /* 153 */
                                        List<Object> objectList = new ArrayList();
                                        /* 154 */
                                        objectList.add(listChildObj);
                                        /* 155 */
                                        listChildMap.put(field, objectList);
                                    } else {
                                        /* 157 */
                                        ((List<Object>) listChildMap.get(field)).add(listChildObj);
                                    }
                                }
                            } else {
                                /* 161 */
                                Converter converter = converterMap.get(fieldType);
                                /* 162 */
                                if (converter == null)
                                    /* 163 */ {
                                    field.set(obj, handelNodes(node.getChildNodes(), fieldType));
                                } else

                                    /* 166 */ {
                                    Object convert = converter.convertXml(node, field);
                                    /* 167 */
                                    if (convert != null)
                                        /* 168 */ field.set(obj, convert);
                                }
                            }
                        }
                    }
                }
                /* 172 */
            }
            for (Field field : listChildMap.keySet()) {
                /* 173 */
                field.set(obj, listChildMap.get(field));
            }
            /* 175 */
            return obj;
            /* 176 */
        } catch (InstantiationException | IllegalAccessException | NoSuchFieldException e) {
            /* 177 */
            e.printStackTrace();

            /* 179 */
            return null;
        }
    }

    public static <T> T convertJson2Object(String str, Class<T> clazz) {
        try {
            /* 184 */
            JSONValidatingReader jSONValidatingReader = new JSONValidatingReader(new ExceptionErrorListener());
            /* 185 */
            Object rootObj = jSONValidatingReader.read(str);
            /* 186 */
            return convertJson2Object(rootObj, clazz);
            /* 187 */
        } catch (Exception e) {
            /* 188 */
            e.printStackTrace();

            /* 190 */
            return null;
        }
    }

    private static <T> T convertJson2Object(Object object, Class<T> clazz) throws Exception {
        /* 194 */
        T t = clazz.newInstance();
        /* 195 */
        if (object instanceof Map) {
            /* 196 */
            Map<?, ?> rootJson = (Map<?, ?>) object;
            /* 197 */
            for (Object obj : rootJson.keySet()) {
                /* 198 */
                Object value;
                String itemName = obj.toString();
                /* 199 */
                Object itemValue = rootJson.get(obj);
                /* 200 */
                Field[] fields = clazz.getDeclaredFields();
                /* 201 */
                if (!isContainProp(fields, itemName)) {
                    continue;
                }
                /* 204 */
                Field field = clazz.getDeclaredField(itemName);
                /* 205 */
                field.setAccessible(true);
                /* 206 */
                Class<?> fieldType = field.getType();


                /* 209 */
                Converter converter = converterMap.get(fieldType);
                /* 210 */
                if (converter == null && itemValue instanceof Map) {
                    /* 211 */
                    value = convertJson2Object(itemValue, fieldType);
                    /* 212 */
                } else if (itemValue instanceof ArrayList && fieldType.equals(List.class)) {
                    /* 213 */
                    value = handlerListJson((ArrayList) itemValue, field);
                    /* 214 */
                } else if (converter != null) {
                    /* 215 */
                    if (itemValue == null) {
                        /* 216 */
                        value = null;
                    } else {
                        /* 218 */
                        value = converter.convertJson(itemValue, field);
                    }
                } else {
                    continue;
                }
                /* 223 */
                if (value != null) {
                    /* 224 */
                    field.set(t, value);
                }
            }
        }
        /* 228 */
        return t;
    }

    private static List handlerListJson(ArrayList<?> value, Field field) throws Exception {
        /* 232 */
        List<Object> list = new ArrayList();
        /* 233 */
        Type type = field.getGenericType();
        /* 234 */
        if (type instanceof ParameterizedType) {
            /* 235 */
            ParameterizedType pt = (ParameterizedType) type;
            /* 236 */
            Class<?> genericClazz = (Class) pt.getActualTypeArguments()[0];
            /* 237 */
            Converter converter = converterMap.get(genericClazz);
            /* 238 */
            for (Object object : value) {
                /* 239 */
                if (object instanceof Map) {
                    /* 240 */
                    list.add(convertJson2Object(object, genericClazz));
                    continue;
                }
                /* 242 */
                list.add(converter.convertJson(object, field));
            }
        }


        /* 247 */
        return list;
    }

    public static String convertObject2Json(Object object) {
        try {
            /* 252 */
            JSONWriter jsonWriter = new JSONWriter();
            /* 253 */
            return jsonWriter.write(object);
            /* 254 */
        } catch (Exception e) {
            /* 255 */
            e.printStackTrace();

            /* 257 */
            return null;
        }
    }

    private static boolean isContainProp(Field[] fields, String nodeName) {
        /* 262 */
        if (fields == null || fields.length < 0) {
            /* 263 */
            return false;
        }

        /* 266 */
        if (nodeName == null || "".equals(nodeName)) {
            /* 267 */
            return false;
        }

        /* 270 */
        for (Field field : fields) {
            /* 271 */
            if (field.getName().equals(nodeName)) {
                /* 272 */
                return true;
            }
        }
        /* 275 */
        return false;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\Parser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */