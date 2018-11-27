
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
    //no. elem.
    protected int nlm;
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
    //matriz de rigidez
    protected double smd[][]=new double[6][6];
    protected double s[][];
    //Acciones aplicadas en nudos(imprimir tres en tres)
    protected double a[];
    //aciones en extremos de miembros(de tres en tres)
    protected double aml[][];
    //de metodos
    protected double ae[];
    protected double ac[];
    //Vector de racciones en apoyos(imprima de tres en tres)
    protected double ar[];
    //Vector de desplazamientos en nudos(imprimir cada tres)
    protected double d[];
    //Vector de acciones de extremo finales
    protected double am[][];
    
    protected double css[]=new double[80];
    //Constructores
    public Estructura(int m,int nj,int nr,int nrj,int e){
        setM(m);
        setNj(nj);
        setNr(nr);
        setNrj(nrj);
        setE(e);
        setN(0);
        setNlm(0);
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
        s=new double[3*nj][3*nj];
        a=new double[3*nj];
        aml=new double[m][6];
        ae=new double[3*nj];
        ac=new double[3*nj];
        d=new double[3*nj];
        ar=new double[3*nj];
        am=new double[m][6];
        for(int i=0;i<x.length;i++){
            x[i]=0;
            y[i]=0;
        }
        for(int i=0;i<jj.length;i++){
            jj[i]=0;
            jk[i]=0;
            ax[i]=0;
            iz[i]=0;
            l[i]=0;
            cx[i]=0;
            cy[i]=0;
        }
        for(int i=0;i<rl.length;i++){
            rl[i]=0;
            crl[i]=0;
            a[i]=0;
            ae[i]=0;
            ac[i]=0;
            d[i]=0;
            ar[i]=0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<6;j++){
                aml[i][j]=0;
                am[i][j]=0;
            }
        }
    }
    
    //métodos
    //Generación Matriz de rigidez
    public void generarMatrizRigidez(){
        int im;
        int xcl,ycl,jp,jm;
        int k1,k2,k3,j1,j2,j3;
        double scm1,scm2,scm3,scm4,xx;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                smd[i][j]=0;
            }
        }
        for(int i=0;i<3*nj;i++){
            for(int j=0;j<3*nj;j++){
                s[i][j]=0;
            }
        }
        for(int i=0;i<m;i++){
            xcl=x[jk[i]]-x[jj[i]];
            ycl=y[jk[i]]-y[jj[i]];
            l[i]=Math.sqrt((xcl*xcl)+(ycl*ycl));
            cx[i]=xcl/l[i];
            cy[i]=ycl/l[i];
        }
        for(int i=0;i<m;i++){
            j1=(3*jj[i])-3;
            j2=(3*jj[i])-2;
            j3=3*jj[i]-1;
            k1=(3*jk[i])-3;
            k2=(3*jk[i])-2;
            k3=3*jk[i];
            scm1=(e*ax[i])/l[i];
            scm2=(4*e*iz[i])/l[i];
            scm3=(1.5*scm2)/l[i];
            scm4=(2*scm3)/l[i];
            if(rl[j1]==0)
                j1=j1-crl[j1]-1;
            else
                j1=n+crl[j1]-1;
            if(rl[j2]==0)
                j2=j2-crl[j2]-1;
            else
                j2=n+crl[j2]-1;
            if(rl[j3]==0)
                j3=j3-crl[j3]-1;
            else
                j3=n+crl[j3]-1;
            if(rl[k1]==0)
                k1=k1-crl[k1]-1;
            else
                k1=n+crl[k1]-1;
            if(rl[k2]==0)
                k2=k2-crl[k2]-1;
            else
                k2=n+crl[k2]-1;
            if(rl[k3]==0)
                k3=k3-crl[k3]-1;
            else
                k3=n+crl[k3]-1;
            smd[0][0]=(scm1*cx[i]*cx[i])+(scm4*cy[i]*cy[i]);
            smd[3][3]=smd[0][0];
            smd[0][3]=smd[0][0];
            smd[3][0]=smd[0][0];
            smd[0][1]=(scm1-scm4)*cx[i]*cy[i];
            smd[1][0]=smd[0][1];
            smd[3][4]=smd[0][1];
            smd[4][3]=smd[0][1];
            smd[4][0]=smd[0][1];
            smd[0][4]=smd[0][1];
            smd[1][3]=smd[0][1];
            smd[3][1]=smd[0][1];
            smd[0][2]=-scm3*cy[i];
            smd[2][0]=smd[0][2];
            smd[0][5]=smd[0][2];
            smd[5][0]=smd[0][2];
            smd[2][3]=smd[0][2];
            smd[3][2]=smd[0][2];
            smd[3][5]=smd[0][2];
            smd[5][3]=smd[0][2];
            smd[1][1]=(scm1*cy[i]*cy[i])+(scm4*cx[i]*cx[i]);
            smd[4][4]=smd[1][1];
            smd[1][4]=smd[1][1];
            smd[4][1]=smd[1][1];
            smd[1][2]=scm3*cx[i];
            smd[2][1]=smd[1][2];
            smd[1][5]=smd[1][2];
            smd[5][1]=smd[1][2];
            smd[2][4]=smd[1][2];
            smd[4][2]=smd[1][2];
            smd[4][5]=smd[1][2];
            smd[5][4]=smd[1][2];
            smd[2][2]=scm2;
            smd[5][5]=scm2;
            smd[2][5]=scm2/2;
            smd[5][2]=smd[2][5];
            //imprimir: "Miembro #"+i/////////////////////
            if(rl[3*jj[i]-3]==0){
                s[j1][j1]=s[j1][j1]+smd[0][0];
                s[j2][j1]=s[j2][j1]+smd[1][0];
                s[j3][j1]=s[j3][j1]+smd[2][0];
                s[k1][j1]=smd[3][0];
                s[k2][j1]=smd[4][0];
                s[k3][j1]=smd[5][0];
            }
            //linea 3140
            if(rl[3*jj[i]-2]==0){
                s[j1][j2]=s[j1][j2]+smd[0][1];
                s[j2][j2]=s[j2][j2]+smd[1][1];
                s[j3][j2]=s[j3][j2]+smd[2][1];
                s[k1][j2]=smd[3][1];
                s[k2][j2]=smd[4][1];
                s[k3][j2]=smd[5][1];
            }
            if(rl[3*jj[i]-1]==0){
                s[j1][j3]=s[j1][j3]+smd[0][2];
                s[j2][j3]=s[j2][j3]+smd[1][2];
                s[j3][j3]=s[j3][j3]+smd[2][2];
                s[k1][j3]=smd[3][2];
                s[k2][j3]=smd[4][2];
                s[k3][j3]=smd[5][2];
            }
            if(rl[3*jk[i]-3]==0){
                s[k1][k1]=s[k1][k1]+smd[0][3];
                s[k2][k1]=s[k2][k1]+smd[1][3];
                s[k3][k1]=s[k3][k1]+smd[2][3];
                s[j1][k1]=smd[3][3];
                s[j2][k1]=smd[4][3];
                s[j3][k1]=smd[5][3];
            }
            if(rl[3*jk[i]-2]==0){
                s[k1][k2]=s[k1][k2]+smd[0][4];
                s[k2][k2]=s[k2][k2]+smd[1][4];
                s[k3][k2]=s[k3][k2]+smd[2][4];
                s[j1][k2]=smd[3][4];
                s[j2][k2]=smd[4][4];
                s[j3][k2]=smd[5][4];
            }
            if(rl[3*jk[i]-1]==0){
                s[k1][k3]=s[k1][k3]+smd[0][5];
                s[k2][k3]=s[k2][k3]+smd[1][5];
                s[k3][k3]=s[k3][k3]+smd[2][5];
                s[j1][k3]=smd[3][5];
                s[j2][k3]=smd[4][5];
                s[j3][k3]=smd[5][5];
            }
        }
        s[0][0]=Math.sqrt(s[0][0]);
        if(n!=1){//else 3850
            for(int i=1;i<n;i++)
                s[0][i]=s[i][0]/s[0][0];
            for(int j=1;j<n;j++){
                //imprimir j= valor de j+1
                im=j-1;
                xx=0;
                for(int k=0;k<im;k++)
                    xx=xx+(s[k][j]*s[k][j]);
                s[j][j]=Math.sqrt(s[j][j]-xx);
                if(j!=n){//else 3840
                    jp=j+1;
                    for(int i=jp;i<n;i++){
                        jm=j-1;
                        xx=0;
                        for(int k=0;k<jm;k++)
                            xx=xx+(s[k][i]*s[k][j]);
                        s[j][i]=(s[i][j]-xx)/s[j][j];
                    }
                }
            }
        }
    }
    //termina generación de matriz de rigidez
    
    
    //Metodo para los calculos finales
    public void calculosFinales(){
        int k,im,np,i,je,ja,j;
        int k1,k2,k3,j1,j2,j3;
        double scm1,scm2,scm3,scm4,xx;
        if(nlm!=0){
            for(i=0;i<m;i++){
                ae[3*jj[i]-3]=ae[3*jj[i]-3]-(aml[i][0]*cx[i])+(aml[i][1]*cy[i]);
                ae[3*jj[i]-2]=ae[3*jj[i]-2]-(aml[i][0]*cy[i])+(aml[i][1]*cx[i]);
                ae[3*jj[i]-1]=ae[3*jj[i]-1]-aml[i][2];
                ae[3*jk[i]-3]=ae[3*jk[i]-3]-(aml[i][3]*cx[i])+(aml[i][4]*cy[i]);
                ae[3*jk[i]-2]=ae[3*jk[i]-2]-(aml[i][3]*cy[i])+(aml[i][4]*cx[i]);
                ae[3*jk[i]-1]=ae[3*jk[i]-1]-aml[i][5];
            }
        }
        for(j=0;j<n+nr;j++){
            if(rl[j]!=0)
                k=n+crl[j]-1;
            else
                k=j-crl[j]-1;
            ac[k]=a[j]+ae[j];
        }
        System.arraycopy(ac, 0, d, 0, n-1);
        d[0]=d[0]/s[0][0];
        if(n<=1){
            d[n-1]=d[n-1]/s[n-1][n-1];
            ///////5910
        }
        else{
            for(i=1;i<n;i++){
                im=i-1;
                xx=0;
                for(k=0;k<=im;k++)
                    xx=xx+s[k][i]*d[k];
                d[i]=(d[i]-xx)/s[i][i];
            }
            d[n-1]=d[n-1]/s[n-1][n-1];
            np=n+1;
            for(int mm=1;mm<np;mm++){
                i=np-mm-1;
                im=i+1;
                xx=0;
                for(k=im;k<n;k++)
                    xx=xx+s[i][k]*d[k];
                d[i]=(d[i]-xx)/s[i][i];
            }
        }
        for(k=n;k<n+nr;k++){
            ar[k]=-ac[k];
            for(j=0;j<n;j++)
                ar[k]=ar[k]+s[k][j]*d[j];
        }   
        j=n+1;
        for(ja=1;ja<=n+nr;ja++){
            je=n+nr-ja;
            if(rl[je]!=0)
                d[je]=0;
            else{
                j=j-2;
                d[je]=d[j];
            }
        }
        k=n-1;
        for(int ke=0;ke<n+nr;ke++){
            if(rl[ke]!=1)
                ar[ke]=0;
            else{
                k=k+1;
                ar[ke]=ar[k];
            }
        }
        //////////6350
        for(i=0;i<m;i++){
            j1=(3*jj[i])-3;
            j2=(3*jj[i])-2;
            j3=3*jj[i]-1;
            k1=(3*jk[i])-3;
            k2=(3*jk[i])-2;
            k3=3*jk[i];
            scm1=(e*ax[i])/l[i];
            scm2=(4*e*iz[i])/l[i];
            scm3=(1.5*scm2)/l[i];
            scm4=(2*scm3)/l[i];
            am[i][0]=aml[i][0]+scm1*((d[j1]-d[k1])*cx[i]+(d[j2]-d[k2])*cy[i]);
            am[i][1]=aml[i][1]+scm4*(-(d[j1]-d[k1])*cy[i]+(d[j2]-d[k2])*cx[i])+scm3*(d[j3]+d[k3]);
            am[i][2]=aml[i][2]+scm3*(-(d[j1]-d[k1])*cy[i]+(d[j2]-d[k2])*cx[i])+scm2*(d[j3]+d[k3]/2);
            am[i][3]=aml[i][3]+scm1*(-(d[j1]-d[k1])*cx[i]+(d[j2]-d[k2])*cy[i]);
            am[i][4]=aml[i][4]+scm4*((d[j1]-d[k1])*cy[i]+(d[j2]-d[k2])*cx[i])+scm3*(d[j3]+d[k3]);
            am[i][5]=aml[i][5]+scm3*(-(d[j1]-d[k1])*cy[i]+(d[j2]-d[k2])*cx[i])+scm2*(d[j3]/2+d[k3]);
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

    public int getNlm() {
        return nlm;
    }

    public void setNlm(int nlm) {
        this.nlm = nlm;
    }

    public double[][] getSmd() {
        return smd;
    }

    public void setSmd(double[][] smd) {
        this.smd = smd;
    }

    public double[][] getS() {
        return s;
    }

    public void setS(double[][] s) {
        this.s = s;
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[][] getAml() {
        return aml;
    }

    public void setAml(double[][] aml) {
        this.aml = aml;
    }

    public double[] getAe() {
        return ae;
    }

    public void setAe(double[] ae) {
        this.ae = ae;
    }

    public double[] getAc() {
        return ac;
    }

    public void setAc(double[] ac) {
        this.ac = ac;
    }

    public double[] getAr() {
        return ar;
    }

    public void setAr(double[] ar) {
        this.ar = ar;
    }

    public double[] getD() {
        return d;
    }

    public void setD(double[] d) {
        this.d = d;
    }

    public double[][] getAm() {
        return am;
    }

    public void setAm(double[][] am) {
        this.am = am;
    }

    public double[] getCss() {
        return css;
    }

    public void setCss(double[] css) {
        this.css = css;
    }
    
    
}
