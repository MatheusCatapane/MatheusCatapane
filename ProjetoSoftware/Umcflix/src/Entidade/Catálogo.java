package Entidade;

public class Catálogo {
private String nomeFilme;
private String protagonista;
private Gênero genero;
private String diretor;
private int classificacao;

    public Catálogo(String nomeFilme, String protagonista, Gênero genero, String diretor, int classificacao) {
        this.nomeFilme = nomeFilme;
        this.protagonista = protagonista;
        this.genero = genero;
        this.diretor = diretor;
        if (classificacao >= 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        } else {
            this.classificacao = 0;
        }

    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Gênero getGenero() {
        return genero;
    }

    public void setGenero(Gênero genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
      if (classificacao >= 0 && classificacao <= 5) {}
        this.classificacao = classificacao;
    }
}
