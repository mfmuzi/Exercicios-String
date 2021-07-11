public class ExerciciosString {

    public static void main(String[] args) {

        var alfabeto = "ABCEFG";
        for (char c : alfabeto.toCharArray())
            System.out.println("Letra: " + c);

        var materia = "Aula de Java";
        String[] tudoSeparado = materia.split(" ");
        System.out.println(tudoSeparado[0]);
        System.out.println(tudoSeparado[1]);
        System.out.println(tudoSeparado[2]);

        var aula = "Aula";
        var deJava = " de Java";
        System.out.println(aula.concat(deJava));

        var sub = "1234 asda qw";
        System.out.println(sub.replaceAll("[1-9]","#"));
    }
}

