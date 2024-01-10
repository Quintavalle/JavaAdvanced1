public class User {
    private String nome;
    private int età;

    // Costruttore
    public User(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }

    // Metodi getter e setter per il nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodi getter e setter per l'età
    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    // Funzione per stampare le informazioni
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + età);
    }

    public static void main(String[] args) {
        // Creazione di due oggetti User
        User utente1 = new User("Utente1", 25);
        User utente2 = new User("Utente2", 30);

        // Stampa delle informazioni di default del primo utente
        System.out.println("Informazioni di default per Utente1:");
        utente1.stampaInformazioni();
        System.out.println();

        // Modifica delle informazioni del secondo utente
        utente2.setNome("NuovoNome");
        utente2.setEtà(35);

        // Stampa delle informazioni del secondo utente dopo la modifica
        System.out.println("Informazioni modificate per Utente2:");
        utente2.stampaInformazioni();
    }
}
