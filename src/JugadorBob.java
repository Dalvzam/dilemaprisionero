/*
 * 
 * author: Dalzam
 * 
 */
public class JugadorBob extends Jugador{
    // Este jugador responderá ROBAR en las partidas impares y COLABORAR en las partidas pares
    int numPartida;
    public JugadorBob(int id, int numPartida) {
        super(id);
        this.numPartida = numPartida;
    }
    @Override
    public Accion decidirAccion() {
        if ((numPartida%2) == 0) {
            return Accion.COLABORAR;
        }else{
            return Accion.ROBAR;
        }
    }

}
