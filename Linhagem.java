import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Linhagem {
    private double[] medias;
    protected double desPad;
   // String[] nomes={"GLU", "SAC", "LAC", "CIT"};
   
    public Linhagem( double[] medias, double desPad) {
        this.medias = medias;
        this.desPad=desPad;
    }

    public void gerarConcentracoes( Linhagem linhagem) {
          DecimalFormat df = new DecimalFormat("#.###");
        Random random = new Random();
        for (int i = 0; i < linhagem.medias.length; i++) {
            Double[] valores = new Double[3];
            for (int j = 0; j < 3; j++) {
                valores[j] = random.nextGaussian() * linhagem.desPad + medias[i];
                System.out.println((j+1)+"º numero para a média de " +linhagem.medias[i]+": "+ df.format(valores[j]));
            } 
        System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Intervalo de horas:");
        double[] _002A = {0.571, 0.570, 0.572, 0.574, 0.492, 0.570};
        Linhagem linhagem1 = new Linhagem(_002A, 0.2);
        linhagem1.gerarConcentracoes(linhagem1);
    }
}
