package pe.isil.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Competencia {
  ArrayList<Athele> atheles;

  public Competencia() {
    this.atheles = new ArrayList<Athele>();
  }

  public void enroll(Athele athele) {
    this.atheles.add(athele);
  }

  public void showAtheles() {
    for (Athele athele : this.atheles) {
      System.out.println(athele.toString());
    }
  }

  public void sortParticipants() {
    for (int i = 0; i < atheles.size() - 1; i++) {
      for (int j = i + 1; j < atheles.size(); j++) {
        if (atheles.get(i).getRecord() > atheles.get(i).getRecord()) {
          Athele replacement = atheles.get(i);
          atheles.set(j, replacement);
          atheles.set(i, atheles.get(j));
        }
      }
    }
  }

  public void registerCompetitionTimes() {
    Scanner scanner = new Scanner(System.in);
    for (Athele athele : atheles) {
      System.out.println("Register time for: " + athele.getName());

      double times = scanner.nextDouble();
      athele.setCarerTime(times);
    }
    scanner.close();
  }

  public void showFinalistAtheles(int quantity) {
    for (int index = 0; index < quantity && index < atheles.size(); index++) {
      System.out.println(atheles.get(index).toString());
    }
  }

  public void showAthelesImprovement() {
    for (Athele athele : this.atheles) {
      if (athele.getCarerTime() < athele.getRecord()) {
        System.out.println(athele.toString());
      }
    }
  }
}
