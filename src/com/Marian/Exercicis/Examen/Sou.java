package com.Marian.Exercicis.Examen;

public class Sou {

    private static final int dos = 2;
    private static final int cinc = 5;
    private static final int plusDesenvolupador = 1000;
    private static final int plusArquitecte = 2500;
    private static final int plusDBA = 5000;

    public static int estimacioSou(Treballador treballador, int souInicial) {

        plusDeCategoria(treballador,experienciaLaboral(treballador, souInicial));

        return souInicial;
    }

    public static int experienciaLaboral(Treballador treballador, int souInicial){

        if (treballador.getAnysExperiencia() <= dos) {
            souInicial = 18000;
        } else if (treballador.getAnysExperiencia() <= cinc) {
            souInicial += plusDBA;
        } else{
            souInicial += 10000;
        }
        return souInicial;
    }

    public static int plusDeCategoria(Treballador treballador, int souInicial){

        switch (treballador.getTipus()) {
            case Treballador.DESENVOLUPADOR:
                return souInicial += plusDesenvolupador;

            case Treballador.ARQUITECTE:
                return souInicial += plusArquitecte;

            case Treballador.DBA:
                return souInicial += plusDBA;

            default:
                return souInicial;
        }
    }
}
