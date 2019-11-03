package BackEnd;

import javax.swing.JOptionPane;
import proyectomate.SistemaEcuaciones;

/**
 *
 * @author dntn
 */
public class Manejador {

    private final double VARIABLE_CUADRADA = 1;
    private String respuestaX;
    private String respuestaY;
    private SistemaEcuaciones frame;

    private void valoresCuadraticas(double v1, double v2, double v3, double v4) {
        double entero = (v1 * v4) - (v2 * v3);
        double variable = (v1 * (-1)) + (v4 * (-1));
        double valorRaiz = (Math.pow(variable, 2) - (4 * entero * variable));

        if (valorRaiz < 0) {
            eigenValoresImaginarios(variable, entero, v1, v2);

        } else if (valorRaiz > 0) {

            double cuadraticaMas = obtenerCuadraticasMas(variable, entero);
            double cuadraticaMenos = obtenerCuadraticasMenos(variable, entero);

            imprimirL1L2(cuadraticaMas, cuadraticaMenos, false);
            double k1[] = obtenerK1(v1, v2, cuadraticaMas);

            if (cuadraticaMas != cuadraticaMenos) {
                double k2[] = obtenerK2(v1, v2, cuadraticaMenos);
                respuestaX = (k1[0] + " C1 e^" + cuadraticaMas + "t + " + k2[0] + " C2 e^" + cuadraticaMenos + "t");
                respuestaY = (k1[1] + " C1 e^" + cuadraticaMas + "t + " + k2[1] + " C2 e^" + cuadraticaMenos + "t");
            } else {
                respuestaX =  (k1[0] + "C1 e^" + cuadraticaMas + "t + " + k1[0] + "C2te^ " + cuadraticaMas);
                respuestaY = (k1[1] + "C1 e^" + cuadraticaMas + "t + " + k1[1] + "C2[te^ " + cuadraticaMas + " + " + (k1[0]/v2) + "e^" + cuadraticaMas + "t]");
            }
        }
    }

    public boolean comprobarDatos(String v1, String v2, String v3, String v4, SistemaEcuaciones frame) {
        this.frame = frame;
        respuestaX = "";
        respuestaY = "";

        try {
            double val1 = Double.parseDouble(v1);
            double val2 = Double.parseDouble(v2);
            double val3 = Double.parseDouble(v3);
            double val4 = Double.parseDouble(v4);
            valoresCuadraticas(val1, val2, val3, val4);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private void eigenValoresImaginarios(double variable, double entero, double v1, double v2) {
        double valorAlfa = ((-1) * variable) / (2 * VARIABLE_CUADRADA);
        double valorBeta = (Math.sqrt(((Math.pow(variable, 2)) - (4 * entero * VARIABLE_CUADRADA)) * (-1))) / (2 * VARIABLE_CUADRADA);

        imprimirL1L2(v1, v2, true);

        double B11 = 1;
        double B12 = (valorAlfa - v1) / v2;
        double B21 = 0;
        double B22 = (valorBeta / v2);

        //Metodo imprimir K1 y limpiar K2
        respuestaX = ("C1[(" + B11 + "Cos(" + valorBeta + "t)-" + B21 + "Sen(" + valorBeta + "t)]e^" + valorAlfa + "t  +  C2[(" + B21 + "Cos(" + valorBeta + "t)+" + B11 + "Sen(" + valorBeta + "t)]e^" + valorAlfa + "t");
        respuestaY = ("C1[(" + B12 + "Cos(" + valorBeta + "t)-" + B22 + "Sen(" + valorBeta + "t)]e^" + valorAlfa + "t  +  C2[(" + B22 + "Cos(" + valorBeta + "t)+" + B12 + "Sen(" + valorBeta + "t)]e^" + valorAlfa + "t");
    }

    private double obtenerCuadraticasMas(double variable, double entero) {
        return (((-1) * variable) + Math.sqrt((Math.pow(variable, 2)) - (4 * entero * VARIABLE_CUADRADA))) / (2 * VARIABLE_CUADRADA);
    }

    private double obtenerCuadraticasMenos(double variable, double entero) {
        return (((-1) * variable) - Math.sqrt((Math.pow(variable, 2)) - (4 * entero * VARIABLE_CUADRADA))) / (2 * VARIABLE_CUADRADA);
    }

    private double[] obtenerK1(double v1, double v2, double cuadraticaMas) {
        double v11 = v1 - cuadraticaMas;
        double k11 = v11;
        double k12 = -v2;

        if (k11 == k12) {
            k11 = 1;
            k12 = 1;
        }

        if ((k11 < 0) && (k12 < 0)) {
            k11 = -k11;
            k12 = -k12;
        }
        for (int i = 2; i < 10; i++) {
            if ((k11 % i == 0) && (k12 % i == 0)) {
                k11 = k11 / i;
                k12 = k12 / i;
            }
        }
        imprimirK1(k11, k12, false);
        double k1[] = {k11, k12};
        return k1;
    }

    private double[] obtenerK2(double v1, double v2, double cuadraticaMenos) {
        double v12 = v1 - cuadraticaMenos;
        double k21 = v12;
        double k22 = -v2;

        if (k21 == k22) {
            k21 = 1;
            k22 = 1;
        }
        for (int i = 2; i < 10; i++) {

            if ((k21 % i == 0) && (k22 % i == 0)) {
                k21 = k21 / i;
                k22 = k22 / i;
            }
        }
        imprimirK2(k21, k22);
        double k2[] = {k21, k22};
        return k2;
    }

    private void imprimirK1(double k11, double k12, boolean imaginario) {
        String textoK11;
        String textoK12;

        if (imaginario) {
            textoK11 = String.valueOf(1);
            textoK12 = k11 + "+" + k12 + "i";
        } else {
            textoK11 = String.valueOf(k11);
            textoK12 = String.valueOf(k12);
        }
        frame.imprimirK1(textoK12, textoK12);
    }

    private void imprimirK2(double k1, double k2) {
        String textoK21 = String.valueOf(k1);
        String textoK22 = String.valueOf(k2);
        frame.imprimirK2(textoK21, textoK22);
    }

    private void imprimirL1L2(double l1, double l2, boolean imaginario) {
        String textoL1;
        String textoL2;
        if (imaginario) {
            textoL1 = (l1 + "+" + l2 + "i");
            textoL2 = (l1 + "-" + l2 + "i");
        } else {
            textoL1 = String.valueOf(l1);
            textoL2 = String.valueOf(l2);
        }
        frame.imprimirL1L2(textoL1, textoL2);
    }

    public void respuesta() {       
        JOptionPane.showMessageDialog(frame, "X = " + respuestaX + "\nY = " + respuestaY, "Solucion", JOptionPane.INFORMATION_MESSAGE);
    }
}
