
public class Lexer {
    public static void main(String[] args) {
        char input[] = {'a', 'b', 'b'};
        System.out.print("La cadena: [");
        for (char i : input) {
            System.out.print(i);
        }
        String inicio = "q0";
        String fin = "q3";
        String actual = inicio;
        boolean terminar = false;
        int contador = 0;

        while (terminar == false) {
            if (contador > input.length - 1) {
                terminar = true;
                break;
            }
            if (actual == "q0") {
                if (input[contador] == 'a') {
                    actual = "q1";
                } else if (input[contador] == 'b') {
                    actual = "q4";
                } else {
                    terminar = true;
                    break;
                }
                contador++;
                continue;
            }
            if (actual == "q1") {
                if (input[contador] == 'a') {
                    actual = "q1";
                } else if (input[contador] == 'b') {
                    actual = "q2";
                } else {
                    terminar = true;


                    break;
                }
                contador++;
                continue;
            }

            if (actual == "q2") {
                if (input[contador] == 'a') {
                    actual = "q1";
                } else if (input[contador] == 'b') {
                    actual = "q3";
                } else {
                    terminar = true;
                    break;
                }
                contador++;
                continue;
            }

            if (actual == "q3") {
                actual = inicio;
                contador++;
                continue;
            }
            if (actual == "q4") {
                if (input[contador] == 'a') {
                    actual = "q1";
                } else if (input[contador] == 'b') {
                    actual = "q4";
                } else {
                    terminar = true;
                    break;
                }
                contador++;
                continue;
            }
        }
        if (actual == fin) {
            System.out.println("] Es valida entonces 0");
        }
        else
        {
            System.out.println("] No es valida entonces -1");
        }
    }
}