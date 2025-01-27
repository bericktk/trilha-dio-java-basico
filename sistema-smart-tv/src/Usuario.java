public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
            System.out.println("A tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
            System.out.println("A tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
            System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.diminuirVolume();
            System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirCanal();
            System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(10);
            System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
            System.out.println("Canal atual: " + smartTv.canal);
    }
}
