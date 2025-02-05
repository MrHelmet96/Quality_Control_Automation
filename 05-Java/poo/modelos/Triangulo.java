package modelos;

public class Triangulo {
    private Double base;
    private Double altura;

        // Constructor con parámetros
        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }
    
        // Constructor por defecto
        public Triangulo() {
        }

    public double getBase(){
        return base;
    }
    
    public void setBase(Double base){
        this.base = base;
    }
    
    public Double getAltura(){
        return altura;
    }
    public void setaltura(Double altura){
        this.altura = altura;
    }
    
    public Double area(){
        return (base*altura)/2;
    }
    
    public void imprimirDatos(){
        
        System.out.println("base :" + base);
        System.out.println("Altura" + altura);
        System.out.println(area());
        
    
    }
    
}