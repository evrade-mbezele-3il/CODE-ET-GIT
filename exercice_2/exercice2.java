public class GestionnaireNotes {

    /**
     * cette méthode permet d'afficher les notes et les moyennes d'un étudiant
     * @param nomEtudiant : représente le nom de l'étudiant dont on veut afficher les notes et calculer la moyenne
     * @param notes : réprésente l'ensemble des notes de l'étudiant
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {

        afficherNotes(nomEtudiant,notes);
        int somme = calculSommeNotes();
        afficherMoyenne(somme);
    }

    /**
     * cette méthode permet d'afficher les notes d'un étudiant
     * @param nomEtudiant : représente le nom de l'étudiant dont on veut afficher les notes
     * @param notes : réprésente l'ensemble des notes de l'étudiant
     */
    public void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * cette méthode permet de calculer la somme des notes d'un étudiant
     * @return : somme des notes d'un étudiant 
     */
    public int calculSommeNotes() {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }

    /**
     * cette méthode permet d'afficher les notes d'un étudiant
     * @param somme : représente la somme des notes de l'étudiant
     */
    public void afficherMoyenne(int somme) {
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    } 
}
