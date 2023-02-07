import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike(3.0, 2, "Ar");
        MountainBike m2 = new MountainBike(3.0, 2, "Óleo");
        System.out.println(m1.ehMelhor(m2));
        m1.imprimeGarantia();
        m2.imprimeGarantia();

        SpeedBike s1 = new SpeedBike(3.0, 2, 3);
        SpeedBike s2 = new SpeedBike(3.0, 2, 4);
        System.out.println(s1.ehMelhor(s2));
        s1.imprimeGarantia();
        s2.imprimeGarantia();

        MountainBike c1 [] = new MountainBike[2];
        c1[0] = new MountainBike(3.0, 2, "Ar");
        c1[1] = new MountainBike(3.0, 2, "Óleo");

        Arrays.sort(c1);

        //Não vai funcionar o biKeMaria.getSuspensão(), pq não da pra acessar um atributo da classe do tipo qualidade, teria que utilizar o cast igual em ehmelhor em moutain bike
    }
}
