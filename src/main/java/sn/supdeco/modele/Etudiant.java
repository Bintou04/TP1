package sn.supdeco.modele;

public class Etudiant {

    private int id;
    private string nom;
    private string prenom;
    private double moyenne;

// Constructor
    public Etudiant(int id, String nom, String prenom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getNom() {
        return nom;
    }

    public void setNom(string nom) {
        this.nom = nom;
    }

    public string getPrenom() {
        return prenom;
    }

    public void setPrenom(string prenom) {
        this.prenom = prenom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    // toString method
    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom=" + nom +
                ", prenom=" + prenom +
                ", moyenne=" + moyenne +
                '}';
    }
}

