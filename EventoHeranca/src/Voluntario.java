import java.util.ArrayList;

public class Voluntario
    extends Participante
{
    private ArrayList<String> atividades;

    public Voluntario(String n, Evento e)
    {
        super(n, e);
        atividades = new ArrayList<String>();
    }

    public void addAtividades(String act) { this.atividades.add(act); }

    @Override
    public String getCertificado()
    {
        return super.getCertificado() +
                " e como voluntario auxiliou com as atividade:\n" + getAtividades();
    }

    private String getAtividades()
    {
        String activities = "";

        for (String a: atividades)
            activities += "\t. " + a + "\n";

        return activities;
    }
}