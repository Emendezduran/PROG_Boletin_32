package prog_boletin_32;

public class Alumno {
    
    private String nome;
    private int nota;
    private Enderezo enderezo;

    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "Alumno:" + "nome=" + nome + ", nota=" + nota + ", enderezo: " + enderezo;
    }

    public void cambiarNota(int nota) {
        this.nota = nota;
    }
    
    public class Enderezo {
        
        private String rua;
        private int numero;

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
            Alumno.this.setEnderezo(this);
        }

        public String getRua() {
            return rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }
        

        @Override
        public String toString() {
            return "direccion= " +rua+" Nº"+ numero;
        }
         
}
}