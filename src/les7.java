public class les7 {
    public static final String QUERY = "select * from students where ";
    public static final String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

    public static void main(String[] args) {
        String paramToStr = PARAMS.replace('{', ' ').replace('}', ' ');
        String[] newStr = paramToStr.split(",");
        StringBuilder result = new StringBuilder(QUERY);
        for (int i = 0; i < newStr.length; i++) {
            String[] resultItem = newStr[i].replace('"', ' ').split(":");
            if (!"null".equals(resultItem[1].trim())) {
                result.append(resultItem[0].trim()).append(" = ").append('"').append(resultItem[1].trim()).append('"');
                if (i < newStr.length - 2)
                    result.append(" and ");
            }
        }
        System.out.println(result);
    }
}
