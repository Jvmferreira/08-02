 
 public class Receitasalgada extends Receitas {

    public Receitasalgada( String nomedareceita,String tipodareceita,String duracaodareceita,String nacionalidadedareceita){
        
        super(nomedareceita,tipodareceita,duracaodareceita,nacionalidadedareceita); 
    
       
    }
    
    
    public static void main(String[] args){
        Receitasalgada Receitasalgada = new Receitasalgada("lasanha de abobrinha", "sobremesa", "40 min", "brasileira" );
        Receitasalgada.nomedareceita();
    }
    }   

