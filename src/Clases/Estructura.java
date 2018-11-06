
package Clases;

public class Estructura {
    //Variables de la estructura
    //Número de miembros
    protected int m;
    //Número de nudos
    protected int nj;
    //Número de restricciones de apoyo
    protected int nr;
    //Número de nudos restringidos
    protected int nrj;
    //Modulo de elasticidad
    protected int e;
    //Número de grados de libertad
    protected int n;
    //Vectores coordenadas en un plano     Dimensión =nj
    protected int x[];
    protected int y[];
    //Vectores nudo inicial y final     Dimensión =m
    protected int jj[];
    protected int jk[];
    //Propiedades de los miembros   Dimensión =m
    protected int ax[];
    protected int iz[];
    //Dimensión =3*nj
    protected int rl[];
    protected int crl[];
    //Dimensión =m
    protected double l[];
    protected double cx[];
    protected double cy[];
    
    //Constructores
    public Estructura(int m,int nj,int nr,int nrj,int e){
        setM(m);
        setNj(nj);
        setNr(nr);
        setNrj(nrj);
        setE(e);
        setN(0);
        x=new int[nj];
        y=new int[nj];
        jj=new int[m];
        jk=new int[m];
        ax=new int[m];
        iz=new int[m];
        l=new double[m];
        cx=new double[m];
        cy=new double[m];
        rl=new int[3*nj];
        crl=new int[3*nj];
        for(int i=0;i<nj;i++){
            x[i]=0;
            y[i]=0;
        }
        for(int i=0;i<m;i++){
            jj[i]=0;
            jk[i]=0;
            ax[i]=0;
            iz[i]=0;
            l[i]=0;
            cx[i]=0;
            cy[i]=0;
        }
        for(int i=0;i<3*nj;i++){
            rl[i]=0;
            crl[i]=0;
        }
    }
    
    
    //Setters y getters

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getNj() {
        return nj;
    }

    public void setNj(int nj) {
        this.nj = nj;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNrj() {
        return nrj;
    }

    public void setNrj(int nrj) {
        this.nrj = nrj;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    public int[] getJj() {
        return jj;
    }

    public void setJj(int[] jj) {
        this.jj = jj;
    }

    public int[] getJk() {
        return jk;
    }

    public void setJk(int[] jk) {
        this.jk = jk;
    }

    public int[] getAx() {
        return ax;
    }

    public void setAx(int[] ax) {
        this.ax = ax;
    }

    public int[] getIz() {
        return iz;
    }

    public void setIz(int[] iz) {
        this.iz = iz;
    }

    public int[] getRl() {
        return rl;
    }

    public void setRl(int[] rl) {
        this.rl = rl;
    }

    public int[] getCrl() {
        return crl;
    }

    public void setCrl(int[] crl) {
        this.crl = crl;
    }

    public double[] getL() {
        return l;
    }

    public void setL(double[] l) {
        this.l = l;
    }

    public double[] getCx() {
        return cx;
    }

    public void setCx(double[] cx) {
        this.cx = cx;
    }

    public double[] getCy() {
        return cy;
    }

    public void setCy(double[] cy) {
        this.cy = cy;
    }
    
    
}
