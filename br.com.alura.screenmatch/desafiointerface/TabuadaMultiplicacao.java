package desafiointerface;

public class TabuadaMultiplicacao implements Tabuada {
    private int tabuadaDo;

    public int getTabuadaDo() {
        return tabuadaDo;
    }

    public void setTabuadaDo(int tabuadaDo) {
        this.tabuadaDo = tabuadaDo;
    }


    @Override
    public void mostrarTabuada(int numeroCalcularTabuada) {
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", numeroCalcularTabuada, i, (numeroCalcularTabuada * i));
        }
    }
}
