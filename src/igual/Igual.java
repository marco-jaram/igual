
package igual;


class Igual< A, B> {

    A objeto1;
    B objeto2;

    public Igual() {
    }

    public Igual(A objeto1, B objeto2) {
        this.objeto1 = objeto1;
        this.objeto2 = objeto2;
    }

    public void setObjeto1(A objeto1) {
        this.objeto1 = objeto1;
    }

    public void setObjeto2(B objeto2) {
        this.objeto2 = objeto2;
    }

    public void EsIgualA() {

        if (objeto1.equals(objeto2)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }

    public static void main(String[] args) {
        Igual<String, String> objetoCompara = new Igual("Cristina", "Cristina");
        objetoCompara.EsIgualA();
        Igual<Integer, String> objetoCompara1 = new Igual(10, "10");
        objetoCompara1.EsIgualA();
    }
}

