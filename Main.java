import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int n, tt= 0, pares = 0, impar = 0, cem=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número (Valor 0 interrompe) "));
           if(n != 0){
               tt+= n;
               if(n % 2 ==0) {
                pares++;
            }else{
                  impar++;
            }
                if(n >= 100){
                    cem++;
                }
}
        } while (n != 0);
        double media;
        int calc = pares+impar;

        if(calc > 0) {
            media = (double) tt / calc;

            JOptionPane.showMessageDialog(null, "Resultado: " + "\n" +
                    "Soma total de valores: " + tt + "\n" +
                    "Total de pares: " + pares + "\n" +
                    "Total de ímpares: " + impar + "\n" +
                    "Acima de 100: " + cem + "\n" +
                    "Média dos Valores: " + media);

        }
            }}




