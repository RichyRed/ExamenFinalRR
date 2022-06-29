package ejerciciosParcialFinal.ej2Adapter;

public class CuadratrackElec implements ICuadratrack {
    private Cuadratrack cuadratrack;

    public CuadratrackElec(Cuadratrack cuadratrack) {
        this.cuadratrack = cuadratrack;
    }

    @Override
    public void cargarCombustible() {
        cuadratrack.cargando();
    }

    @Override
    public void estadoCombustible() {
        cuadratrack.estadoElectricidad();
    }
}