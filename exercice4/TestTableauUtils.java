package ma.exercice4;

public class TestTableauUtils {

	public static void main(String[] args) {

        double[][] t1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        double[][] t2 = {
            {10, 20, 30},
            {40, 50, 60}
        };

        System.out.println("Tableau t1 :");
        TableauUtils.affiche(t1);

        System.out.println("Tableau t2 :");
        TableauUtils.affiche(t2);

        System.out.println("t1 est régulier ? " + TableauUtils.regulier(t1));
        System.out.println("t2 est régulier ? " + TableauUtils.regulier(t2));

        System.out.println("Sommes des lignes de t1 :");
        double[] sommeLignesT1 = TableauUtils.sommeLignes(t1);
        for (double s : sommeLignesT1) {
            System.out.println(s);
        }

        System.out.println("Somme de t1 et t2 :");
        double[][] sommeT1T2 = TableauUtils.somme(t1, t2);
        if (sommeT1T2 != null) {
            TableauUtils.affiche(sommeT1T2);
        } else {
            System.out.println("Impossible de sommer les tableaux (dimensions incompatibles).");
        }
    }
}
