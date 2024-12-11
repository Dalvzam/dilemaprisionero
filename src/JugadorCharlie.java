public class JugadorCharlie extends Jugador{
    // Este jugador responderá COLABORAR en su primera partida y en las siguientes imita  la jugada previa de su rival
    int numPartida;

    // Variable para almacenar la acción de la partida anterior
    private Accion accionRivalAnterior = Accion.COLABORAR;

    public JugadorCharlie(int id, int numPartida) {
        super(id);
        this.numPartida = numPartida;
    }

    @Override
    public Accion decidirAccion() {
        if (numPartida == 1) {
            return Accion.COLABORAR;
        }else {
            // En las siguientes partidas, imitar la acción del rival anterior
            return accionRivalAnterior;
        }
    }

    // Método para actualizar la acción del rival en la partida
    public void actualizarAccionRival(Accion accion) {
        this.accionRivalAnterior = accion;
    }
    
}
