package Aula1.Jogador.src;

public class Time {
        // atributos
        private String time;
        private String estado;
    
        // metodo construtor
        public Time() {
    
        }
    
        //get e setter
        /**
         * @return the time
         */
        public String getTime() {
            return time;
        }
    
        /**
         * @param time the nome to set
         */
        public void setTime(String time) {
            this.time = time;
        }
    
        /**
         * @return the estado
         */
        public String getEstado() {
            return estado;
        }
    
        /**
         * @param estado the estado to set
         */
        public void setEstado(String estado) {
            this.estado = estado;
        }
}
