public class les6 {

   public static void main(String[] args) {
       String str5 = "select * from students where";
        String strDir = "{\"name\": \"Ivanov\", \"country\": \"Russia\", \"city\": \"Moscowt\", \"age\": \"null\"}";
        String str = strDir.replace("{", " and ").replace("}", "")
                .replace("\"", "");
        StringBuilder string = new StringBuilder();
        StringBuilder finalStr = new StringBuilder();
        String[] newStr = str.split(",");

        for (String string2 : newStr) {
            String[] string3 = string2.split(":");
            System.out.printf("%s = %s", string3[0], string3[1]);
            string.append(string3[1]);
            finalStr.append(string);
        }


    }
}
