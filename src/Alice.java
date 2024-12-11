import java.util.Random;

public class Alice extends Jugador{
    //Este Jugador responderá aleatoriamente
    Random random = new Random();

    public Alice(int id) {
        super(id);
    }

    @Override
    public Accion decidirAccion() {
        random.nextInt(0,10);
        if (random.nextInt(0,10) > 5) {
            return Accion.COLABORAR;
        }else{
            return Accion.ROBAR;
        }
    }

}
