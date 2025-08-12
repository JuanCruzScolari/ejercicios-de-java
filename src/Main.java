public class Main{

    public class Auto{

        //Atributos
        private String modelo;
        private String marca;
        private String color;
        private int velocidad_marcha = 0;
        private boolean encendido = false;
        private boolean  luces_bajas = false;
        private boolean  luces_altas = false;
        private int  velocidad_maxima = 0;

        //Constructor
        public Auto(String modelo, String marca, String color){
            this.modelo = modelo;
            this.marca = marca;
            this.color = color;
            this.velocidad_marcha = velocidad_marcha;
            this.velocidad_maxima = velocidad_maxima;
            this.encendido = encendido;
            this.luces_bajas = luces_bajas;
            this.luces_altas = luces_altas;
        }

        //setters and getters
        public static String getModelo(){
            return modelo;
        }
        public static String getColor(){
            return color;
        }
        public static String getMarca(){
            return marca;
        }
        public void setColor(String color){
            this.color = color;
        }
        public void setMarca(String marca){
            this.marca = marca;
        }
        public void setModelo(String modelo){
            this.modelo = modelo;
        }

        //funciones que realiza el auto
        public void setVelocidadMaxima(int velocidad_maxima){
            this.velocidad_maxima = velocidad_maxima;
        }
        public void encenderMotor(){
            if (!encendido){
                encendido = true;
                System.out.println("motor encendido");
            }
            else {
                System.out.println("El auto ya tiene el motor encendido");
            }
        }
        public void apagar_motor(){
            if (encendido && velocidad_marcha == 0){
                encendido = false;
            } else if (velocidad_marcha > 0) {
                System.out.println("debe poner la velocidad a cero para apagar el motor");
            } else if (luces_altas || luces_bajas) {
                System.out.println("Las luces bajas se encuentran encendidas");
            }
        }
        public void encenderLucesBajas(){
            luces_bajas = true;
            luces_altas = false;
        }
        public void encenderLucesAltas(){
            luces_altas = true;
            luces_bajas = false;
        }
        public void apagarLuces (){
            luces_bajas = false;
            luces_altas = false;
        }
        public void cambiarVelocidad (int velocidad){
            while (encendido && velocidad_maxima >= velocidad_marcha && velocidad_marcha > 0){
                velocidad_marcha += velocidad;
            }
        }
        public void Frenar(){
            velocidad_marcha = 0;
        }
        public void informeAuto(){
            if (!encendido){
                System.out.println("El auto se encuentra apagado");
                if  (luces_altas || luces_bajas) {
                    System.out.println("Las luces se encuentran encendidas");
                }
                else {
                    System.out.println("Las luces se encuentran apagadas");
                }
            }
            else {
                System.out.println("El auto se encuentra encendido");
                System.out.println("Velocidad actual: "+ velocidad_marcha);
                System.out.println("Velocidad maxima del auto: "+ velocidad_maxima);
                if (luces_bajas){
                    System.out.println("Luces bajas encendidas");
                } else if (luces_altas) {
                    System.out.println("Luces altas encendidas");
                }
                else {
                    System.out.println("Luces apagadas");
                }

            }
        }
    }
}