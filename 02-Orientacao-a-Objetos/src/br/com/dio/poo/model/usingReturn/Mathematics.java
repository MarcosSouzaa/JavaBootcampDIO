package br.com.dio.poo.model.usingReturn;

public class Mathematics {

    /**
     *
     * @param um
     * @param dois
     * @return o maior dos dois números
     */
    int maior(int um, int dois) {
        if (um > dois) {
            return um;
        } else {
            return dois;
        }
    }
    double soma (double um, double dois) {
        double s = um + dois;
        return s;
    }
}
