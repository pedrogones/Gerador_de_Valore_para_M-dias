import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Linhagem {
    private double[] medias;
    protected double desPad;
    String[] nomes={"GLU", "SAC", "LAC", "CIT"};
   
    public Linhagem( double[] medias, double desPad) {
        this.medias = medias;
        this.desPad=desPad;
      

    }

    public void gerarConcentracoes( Linhagem linhagem) {
          DecimalFormat df = new DecimalFormat("#.###");
        Random random = new Random();
        for (int i = 0; i < linhagem.medias.length; i++) {
            System.out.println(nomes[i]);
            Double[] valores = new Double[3];
            for (int j = 0; j < 3; j++) {
                valores[j] = random.nextGaussian() * linhagem.desPad + medias[i];
                System.out.println((j+1)+"º numero para a média de " +linhagem.medias[i]+": "+ df.format(valores[j]));
            } 
        System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Nova Linhagem:");
        double[] _002A = {0.699, 0.766, 0.737, 0.766};
        Linhagem linhagem1 = new Linhagem(_002A, 0.2);
        linhagem1.gerarConcentracoes(linhagem1);

        System.out.println("Nova Linhagem:");
        double[] _002B = {1.318, 0.789, 0.826, 0.822};
        Linhagem linhagem2 = new Linhagem(_002B, 0.2);
        linhagem2.gerarConcentracoes(linhagem2);

        System.out.println("Nova Linhagem:");
        double[] _003A = {0.853, 0.776, 0.671, 0.737};
        Linhagem linhagem3 = new Linhagem(_003A, 0.2);
        linhagem3.gerarConcentracoes(linhagem3);

        System.out.println("Nova Linhagem:");
        double[] _003B = {0.781, 0.712, 0.717, 0.753};
        Linhagem linhagem4 = new Linhagem(_003B, 0.2);
        linhagem4.gerarConcentracoes(linhagem4);

        System.out.println("Nova Linhagem:");
        double[] _UFPEDA416 = {0.916, 0.817, 0.724, 0.803};
        Linhagem linhagem5 = new Linhagem(_UFPEDA416, 0.2);
        linhagem5.gerarConcentracoes(linhagem5);
    }
}
