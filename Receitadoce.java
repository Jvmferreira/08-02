public class Receitadoce extends Receitas {

    public Receitadoce( String nomedareceita,String tipodareceita,String duracaodareceita,String nacionalidadedareceita){
        
        super(nomedareceita,tipodareceita,duracaodareceita,nacionalidadedareceita); 
    
       
    }
    
    
    public static void main(String[] args){
        Receitadoce Receitadoce = new Receitadoce("gelatina com morango", "sobremesa", "30 min", "brasileira" );
        Receitadoce.nomedareceita();
    }
    }

