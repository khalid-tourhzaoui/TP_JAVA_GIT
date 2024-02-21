public class Etudiant {
    private String nom;
    private int age;
    private String matricule;
    private double note;

    // Constructor
    public Etudiant(String nom, int age, String matricule) {
        this.nom = nom;
        this.age = age;
        this.matricule = matricule;
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

    public void afficherInfo() {
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age);
        System.out.println("Matricule: " + matricule);
    }
    // Default constructor
    public Etudiant() {
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    
}
