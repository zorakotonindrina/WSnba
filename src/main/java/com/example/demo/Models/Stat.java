package com.example.demo.Models;

public class Stat {
    
        public Stat(int idsaison, int idmatch, int equipe1, int score1, int equipe2, int score2) {
        this.idsaison = idsaison;
        this.idmatch = idmatch;
        this.equipe1 = equipe1;
        this.score1 = score1;
        this.equipe2 = equipe2;
        this.score2 = score2;
    }
        int idsaison;
        int idmatch;
        int equipe1;
        int score1;
        int equipe2;
        int score2;
        public int getIdsaison() {
            return idsaison;
        }
        public void setIdsaison(int idsaison) {
            this.idsaison = idsaison;
        }
        public int getIdmatch() {
            return idmatch;
        }
        public void setIdmatch(int idmatch) {
            this.idmatch = idmatch;
        }
        public int getEquipe1() {
            return equipe1;
        }
        public void setEquipe1(int equipe1) {
            this.equipe1 = equipe1;
        }
        public int getScore1() {
            return score1;
        }
        public void setScore1(int score1) {
            this.score1 = score1;
        }
        public int getEquipe2() {
            return equipe2;
        }
        public void setEquipe2(int equipe2) {
            this.equipe2 = equipe2;
        }
        public int getScore2() {
            return score2;
        }
        public void setScore2(int score2) {
            this.score2 = score2;
        }

        

}
