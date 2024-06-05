package pe.isil;

import pe.isil.models.Athele;
import pe.isil.models.Competencia;

public class Main {
    public static void main(String[] args) {
        Athele athOne = new Athele("Brayan", 112, 44.75);
        Competencia competencia = new Competencia();
        athOne.getName();

        competencia.enroll(athOne);
        competencia.sortParticipants();
        competencia.registerCompetitionTimes();
        competencia.showFinalistAtheles(4);
    }
}