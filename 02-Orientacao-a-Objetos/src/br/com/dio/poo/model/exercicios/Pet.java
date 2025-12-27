package br.com.dio.poo.model.exercicios;

    public class Pet {
        private String name;
        private boolean clean;

        public Pet(String name) {
            this.name = name;
            this.clean = false; // Todo pet entra na história sujo
        }

        public String getName() { return name; }
        public boolean isClean() { return clean; }
        public void setClean(boolean clean) { this.clean = clean; }
    }

