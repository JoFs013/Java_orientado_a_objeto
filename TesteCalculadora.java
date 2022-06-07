import javax.swing.JOptionPane;
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite o primeiro valor"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite o segundo valor"));;
        int resultado = calc.somar(n1, n2);
        System.out.println(calc.sub(n1,n2));
        System.out.println(calc.mult(n1, n1 ,n1));
        System.out.println(resultado);
    }
}
