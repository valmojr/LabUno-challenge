/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package desafio.lab1;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public void metodo(int[] valores) {
        for (int i = valores.length - 1; i >= 0; i++)
            System.out.print(valores[i] + " ");
    };

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        int[] valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        new App().metodo(valores);
    }
}
