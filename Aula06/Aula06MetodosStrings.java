public class Aula06MetodosStrings {
    public static void main(String[] args) {
        String nome = "  Ana Maria  ";

        System.out.println(nome.length());
        System.out.println(nome.isEmpty());

        // remoção de espaços nas pontas
        String trim = nome.trim(); // Ana Maria
        
        System.out.println(trim);

        System.out.println(trim.toUpperCase());
        System.out.println(trim.toLowerCase());

        System.out.println(trim.charAt(0));
        System.out.println(trim.substring(4));
        System.out.println(trim.substring(0, 3));

        // busca
        System.out.println(trim.contains("Maria"));
        System.out.println(trim.indexOf('a'));
        System.out.println(trim.lastIndexOf('a'));

        String s1 = "Java";
        String s2 = "Java";
        System.out.println("s1 == s2");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase("java"));

        System.out.println("arquivo.pdf");
        System.out.println("arquivo.pdf".startsWith("arquivo.pdf"));
        System.out.println("arquivo.pdf".endsWith(".pdf"));

        System.out.println("1,2,3".replace(",", ";"));
        System.out.println("a1 b2 c3".replaceAll("\\d", "*"));
        System.out.println("a1 b2".replaceFirst("\\d", "*")); 

        String csv = "joao;ana;bia";
        String[] partes = csv.split(";");
        String joined = String.join(" | ", partes);
        System.out.println(joined);

        System.out.println("=-".repeat(5));
    }
}
