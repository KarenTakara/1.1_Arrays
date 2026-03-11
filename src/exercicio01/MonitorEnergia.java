package exercicio01;

public class MonitorEnergia {

    double []  consumo;
    int indice;

    public MonitorEnergia(int tamanho) {
        this.consumo = new double[tamanho];
    }

    public void registrar(double valor) {
        if (indice < consumo.length) {       //nao coloco tamanho no lugar de consumo.length pq eh uma variável local
            consumo[indice] = valor;
            indice++;
        }
    }

    public double calcularMedia() {
        double media = 0;
        for(double valor : consumo) {
            media += valor;
        }

        return media / consumo.length;
    }


}
