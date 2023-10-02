public class exercici2 {
    public static void main(String[] args) {

        // Piscina rectangular 1
        int llarg1 = 300;
        int ample1 = 150;
        int profunditat1 = 20;

        // Piscina rectangular 2
        int llarg2 = 300;
        int ample2 = 80;
        int profunditat2 = 35;



        // 1.L'àrea que ocupa cadascuna de les dues piscines

        int area1 = llarg1 * ample1;
        int area2 = llarg2 * ample2;

        System.out.println("L'àrea que ocupa cadascuna de les dues piscines:");
        System.out.println("Àrea Piscina 1: " + area1);
        System.out.println("Àrea Piscina 2: " + area2);


        // 2.El volum d'aigua que pot allotjar cadascuna de les dues piscines

        int volum1 = llarg1 * ample1 * profunditat1;
        int volum2 = llarg2 * ample2 * profunditat2;

        System.out.println("El volum d'aigua que pot allotjar cadascuna de les dues piscines:");
        System.out.println("Volum Piscina 1: " + volum1);
        System.out.println("Volum Piscina 2: " + volum2);


        // 3.Els valors d'ample i llarg de l'espai que ocuparien les dues piscines si les posem les dues una al costat de l'altre. Aquest             espai tindrà un llarg igual al de qualsevol d'elles (totes dues tenen el mateix llarg), i un ample resultant de sumar els dos amples.

        int llargEspai = llarg1; //o llarg2 perque ocupen el mateix
        int ampleEspai = ample1 + ample2;

        System.out.println("Els valors d'ample i llarg de l'espai que ocuparien les dues piscines si les posem les dues una al costat de     l'altre:");
        System.out.println("Llarg total de l'espai: " + llargEspai);
        System.out.println("Ample total de l'espai: " + ampleEspai);

        // 4.L'àrea que ocuparien les dues piscines quan estan una al costat de l'altre.

        int areaTotal = llargEspai * ampleEspai;

        System.out.println("L'àrea que ocuparien les dues piscines quan estan una al costat de l'altre :");
        System.out.println("Volum Total: " + areaTotal);


        // 5.El volum d'aigua que allotjarien entre les dues.

        int volumTotal = volum1 + volum2;

        System.out.println("El volum d'aigua que allotjarien entre les dues:");
        System.out.println("Volum Total: " + volumTotal);

        // 6.El programa ha d'intercanviar1 els valors de profunditat de les dues piscines i tornar a calcular i mostrar el valor del volum         d'aigua que pot encabir cada piscina amb aquestes noves mides.

        int nouProfunditat1 = profunditat2;
        int nouProfunditat2 = profunditat1;

        int nouVolum1 = llarg1 * ample1 * nouProfunditat1;
        int nouVolum2 = llarg2 * ample2 * nouProfunditat2;

        System.out.println(".El programa ha d'intercanviar1 els valors de profunditat de les dues piscines i tornar a calcular i mostrar el valor del volum d'aigua que pot encabir cada piscina amb aquestes noves mides:");

        System.out.println("Volum Piscina 1: " + nouVolum1);
        System.out.println("Volum Piscina 2: " + nouVolum2);



    }
}
