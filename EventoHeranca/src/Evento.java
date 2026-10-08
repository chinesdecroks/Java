public class Evento {
    private String nome;
    private Participante participantes[];
    private int capacidadeAuditorio;
    private int nroParticipantes;

    public Evento (String nome, int capacidade) {
        this.nome = nome;
        capacidadeAuditorio = capacidade;
        participantes = new Participante[capacidade];
        nroParticipantes = 0;
    }

    public void addParticipante (Participante p) {
        participantes[nroParticipantes] = p;
        nroParticipantes++;
    }

    public String getNome () {
        return nome;
    }

    public String certificados () {
        String certificados = "============\n";
        for (int i = 0; i < nroParticipantes; i++) {
            certificados += participantes[i].getCertificado() + "\n----------\n";
        }
        certificados += "Fim.";
        return certificados;
    }
    public static void main (String args[]) {
        Evento evento = new Evento("TechWeek", 10);
        Palestrante p1 = new Palestrante("Homem de Ferro", evento, "Guerra Infinita Reloaded.");
        Palestrante p2 = new Palestrante("Thanos", evento, "Eu não morri!");
        Ouvinte o1 = new Ouvinte("Marcelo", evento);
        Ouvinte o2 = new Ouvinte("Chapolin", evento);
        Voluntario v1 = new Voluntario("Davy Jones", evento);
        Voluntario v2 = new Voluntario("Henrique", evento);

        Organizador or1 = new Organizador("Jorge", evento);
        Organizador or2 = new Organizador("Sergio Malandro", evento);

        v1.addAtividades("Zerou todos os RE");
        v2.addAtividades("Não bateu em ninguém");

        o1.addPalestra(p1.getTituloPalestra());
        o1.addPalestra(p2.getTituloPalestra());
        o2.addPalestra(p2.getTituloPalestra());
        evento.addParticipante(p1);
        evento.addParticipante(p2);
        evento.addParticipante(o1);
        evento.addParticipante(o2);
        evento.addParticipante(v1);
        evento.addParticipante(v2);
        evento.addParticipante(or1);
        evento.addParticipante(or2);

        System.out.println(evento.certificados());

    }
}
