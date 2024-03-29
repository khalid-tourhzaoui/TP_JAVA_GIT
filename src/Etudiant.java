public class Etudiant {
    private String nom;
    private int age;
    private String matricule;

    // Constructor
    public Etudiant(String nom, int age, String matricule, Double note) {
        this.nom = nom;
        this.age = age;
        this.matricule = matricule;
        this.note = note;
    }

    // Default constructor
    public Etudiant() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public void afficherInfo() {
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age);
        System.out.println("Matricule: " + matricule);
        System.out.println("Note: " + note);
    }
    // Default constructor
    public Etudiant() {
    }
    public static double calculerStatistiques(Etudiant[] etudiants) {
        double somme = 0;
        int count = 0;
        for (Etudiant etudiant : etudiants) {
            somme += etudiant.getNote();
            count++;
        }
        return somme / count;
    }
    public static void afficherEtudiantAyantLaMeilleureNote(Etudiant[] etudiants) {
        Etudiant meilleurEtudiant = etudiants[0];
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNote() > meilleurEtudiant.getNote()) {
                meilleurEtudiant = etudiant;
            }
        }
        meilleurEtudiant.afficherInfo();
    }
    
}
