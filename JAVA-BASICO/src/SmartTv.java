public class SmartTv {

        boolean ligado = false;
        int canal = 1;
        int voulume = 25;

        public void ligar(){
           ligado = true;
        }
        public void desligar() {
            ligado = false;
        }

        public void aumentaVolume(){
           voulume++;
        }
        
        public void diminuirVolume() {
            voulume--;
        }
}
