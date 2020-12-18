package sample;

class Pokemon {

    private String nombre;
    private int nivel;
    private int puntuacionMin;
    private int puntuacionMax;
    private char sexo;



    public String getNombre()
    {
        return nombre;
    }

    public int getNivel()
    {
        return nivel;
    }

    public int getPuntuacionmax()
    {
        return puntuacionMax;
    }
    public int getPuntuacionmin()
    {
        return puntuacionMin;
    }
    public char getSexo(){
        return sexo;
    }

    public Pokemon (String nombre,int nivel,int puntuacionMin,int puntuacionMax,char sexo){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntuacionMin=puntuacionMin;
        this.puntuacionMax=puntuacionMax;
        this.sexo=sexo;
    }



}
